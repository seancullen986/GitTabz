/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id: ObjectType.java,v 1.10 2004/06/24 16:13:55 santiagopg Exp $
 */

package org.apache.xalan.xsltc.compiler.util;

import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.IFNULL;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.PUSH;
import org.apache.xalan.xsltc.compiler.Constants;

/**
 * @author Todd Miller
 * @author Santiago Pericas-Geertsen
 */
public final class ObjectType extends Type {
    
    private String _javaClassName = "java.lang.Object";
    private Class  _clazz = Object.class;

    /**
     * Used to represent a Java Class type such is required to support 
     * non-static java functions. 
     * @param javaClassName name of the class such as 'com.foo.Processor'
     */
    protected ObjectType(String javaClassName) {
	_javaClassName = javaClassName;

	try {
          _clazz = ObjectFactory.findProviderClass(
            javaClassName, ObjectFactory.findClassLoader(), true);
	}
	catch (ClassNotFoundException e) {
	  _clazz = null;
	}
    }
    
    protected ObjectType(Class clazz) {
        _clazz = clazz;
        _javaClassName = clazz.getName();	
    }
    
    /**
     * Must return the same value for all ObjectType instances. This is
     * needed in CastExpr to ensure the mapping table is used correctly.
     */
    public int hashCode() {
        return Object.class.hashCode();
    }
    
    public boolean equals(Object obj) {
        return (obj instanceof ObjectType);
    }

    public String getJavaClassName() {
	return _javaClassName;
    }
    
    public Class getJavaClass() {
        return _clazz;	
    }

    public String toString() {
	return _javaClassName;
    }

    public boolean identicalTo(Type other) {
	return this == other;
    }

    public String toSignature() {
	final StringBuffer result = new StringBuffer("L");
	result.append(_javaClassName.replace('.', '/')).append(';');
	return result.toString();
    }

    public org.apache.bcel.generic.Type toJCType() {
	return Util.getJCRefType(toSignature());
    }

    /**
     * Translates a void into an object of internal type <code>type</code>.
     * This translation is needed when calling external functions
     * that return void.
     *
     * @see	org.apache.xalan.xsltc.compiler.util.Type#translateTo
     */
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen, 
			    Type type) {
	if (type == Type.String) {
	    translateTo(classGen, methodGen, (StringType) type);
	}
	else {
	    ErrorMsg err = new ErrorMsg(ErrorMsg.DATA_CONVERSION_ERR,
					toString(), type.toString());
	    classGen.getParser().reportError(Constants.FATAL, err);
	}
    }

    /**
     * Expects an integer on the stack and pushes its string value by calling
     * <code>Integer.toString(int i)</code>.
     *
     * @see	org.apache.xalan.xsltc.compiler.util.Type#translateTo
     */
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen, 
			    StringType type) {
	final ConstantPoolGen cpg = classGen.getConstantPool();
	final InstructionList il = methodGen.getInstructionList();

	il.append(DUP);
	final BranchHandle ifNull = il.append(new IFNULL(null));
	il.append(new INVOKEVIRTUAL(cpg.addMethodref(_javaClassName,
						    "toString",
						    "()" + STRING_SIG)));
	final BranchHandle gotobh = il.append(new GOTO(null));
	ifNull.setTarget(il.append(POP));
	il.append(new PUSH(cpg, ""));
	gotobh.setTarget(il.append(NOP));
    }

    /**
     * Translates an object of this type to the external (Java) type denoted
     * by <code>clazz</code>. This method is used to translate parameters 
     * when external functions are called.
     */ 
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen, 
			    Class clazz) {
        if (clazz.isAssignableFrom(_clazz))
	    methodGen.getInstructionList().append(NOP);
	else {
	    ErrorMsg err = new ErrorMsg(ErrorMsg.DATA_CONVERSION_ERR,
			       toString(), clazz.getClass().toString());
	    classGen.getParser().reportError(Constants.FATAL, err);	  	
	}
    }
	
    /**
     * Translates an external Java type into an Object type 
     */
    public void translateFrom(ClassGenerator classGen, 
			      MethodGenerator methodGen, Class clazz) {
	methodGen.getInstructionList().append(NOP);
    }

    public Instruction LOAD(int slot) {
	return new ALOAD(slot);
    }
	
    public Instruction STORE(int slot) {
	return new ASTORE(slot);
    }
}
