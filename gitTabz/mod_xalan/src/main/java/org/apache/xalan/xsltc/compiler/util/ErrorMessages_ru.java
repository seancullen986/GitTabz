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
 * $Id: ErrorMessages_ru.java,v 1.3 2004/12/15 17:35:42 jycli Exp $
 */

package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;

/**
 * @author Morten Jorgensen
 */
public class ErrorMessages_ru extends ListResourceBundle {

/*
 * XSLTC compile-time error messages.
 *
 * General notes to translators and definitions:
 *
 *   1) XSLTC is the name of the product.  It is an acronym for "XSLT Compiler".
 *      XSLT is an acronym for "XML Stylesheet Language: Transformations".
 *
 *   2) A stylesheet is a description of how to transform an input XML document
 *      into a resultant XML document (or HTML document or text).  The
 *      stylesheet itself is described in the form of an XML document.
 *
 *   3) A template is a component of a stylesheet that is used to match a
 *      particular portion of an input document and specifies the form of the
 *      corresponding portion of the output document.
 *
 *   4) An axis is a particular "dimension" in a tree representation of an XML
 *      document; the nodes in the tree are divided along different axes.
 *      Traversing the "child" axis, for instance, means that the program
 *      would visit each child of a particular node; traversing the "descendant"
 *      axis means that the program would visit the child nodes of a particular
 *      node, their children, and so on until the leaf nodes of the tree are
 *      reached.
 *
 *   5) An iterator is an object that traverses nodes in a tree along a
 *      particular axis, one at a time.
 *
 *   6) An element is a mark-up tag in an XML document; an attribute is a
 *      modifier on the tag.  For example, in <elem attr='val' attr2='val2'>
 *      "elem" is an element name, "attr" and "attr2" are attribute names with
 *      the values "val" and "val2", respectively.
 *
 *   7) A namespace declaration is a special attribute that is used to associate
 *      a prefix with a URI (the namespace).  The meanings of element names and
 *      attribute names that use that prefix are defined with respect to that
 *      namespace.
 *
 *   8) DOM is an acronym for Document Object Model.  It is a tree
 *      representation of an XML document.
 *
 *      SAX is an acronym for the Simple API for XML processing.  It is an API
 *      used inform an XML processor (in this case XSLTC) of the structure and
 *      content of an XML document.
 *
 *      Input to the stylesheet processor can come from an XML parser in the
 *      form of a DOM tree or through the SAX API.
 *
 *   9) DTD is a document type declaration.  It is a way of specifying the
 *      grammar for an XML file, the names and types of elements, attributes,
 *      etc.
 *
 *  10) XPath is a specification that describes a notation for identifying
 *      nodes in a tree-structured representation of an XML document.  An
 *      instance of that notation is referred to as an XPath expression.
 *
 *  11) Translet is an invented term that refers to the class file that contains
 *      the compiled form of a stylesheet.
 */

    // These message should be read from a locale-specific resource bundle
    /** Get the lookup table for error messages.   
     *
     * @return The message lookup table.
     */
    public Object[][] getContents()
    {
      return new Object[][] {
        {ErrorMsg.MULTIPLE_STYLESHEET_ERR,
        "\u0412 \u0444\u0430\u0439\u043b\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0442\u0430\u0431\u043b\u0438\u0446 \u0441\u0442\u0438\u043b\u0435\u0439. "},

        /*
         * Note to translators:  The substitution text is the name of a
         * template.  The same name was used on two different templates in the
         * same stylesheet.
         */
        {ErrorMsg.TEMPLATE_REDEF_ERR,
        "\u0428\u0430\u0431\u043b\u043e\u043d ''{0}'' \u0443\u0436\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d \u0432 \u044d\u0442\u043e\u0439 \u0442\u0430\u0431\u043b\u0438\u0446\u0435 \u0441\u0442\u0438\u043b\u0435\u0439. "},


        /*
         * Note to translators:  The substitution text is the name of a
         * template.  A reference to the template name was encountered, but the
         * template is undefined.
         */
        {ErrorMsg.TEMPLATE_UNDEF_ERR,
        "\u0428\u0430\u0431\u043b\u043e\u043d ''{0}'' \u043d\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d \u0432 \u044d\u0442\u043e\u0439 \u0442\u0430\u0431\u043b\u0438\u0446\u0435 \u0441\u0442\u0438\u043b\u0435\u0439. "},

        /*
         * Note to translators:  The substitution text is the name of a variable
         * that was defined more than once.
         */
        {ErrorMsg.VARIABLE_REDEF_ERR,
        "\u041f\u0435\u0440\u0435\u043c\u0435\u043d\u043d\u0430\u044f ''{0}'' \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0430 \u0432 \u043e\u0434\u043d\u043e\u0439 \u043e\u0431\u043b\u0430\u0441\u0442\u0438 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0440\u0430\u0437. "},

        /*
         * Note to translators:  The substitution text is the name of a variable
         * or parameter.  A reference to the variable or parameter was found,
         * but it was never defined.
         */
        {ErrorMsg.VARIABLE_UNDEF_ERR,
        "\u041f\u0435\u0440\u0435\u043c\u0435\u043d\u043d\u0430\u044f \u0438\u043b\u0438 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440 ''{0}'' \u043d\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u044b. "},

        /*
         * Note to translators:  The word "class" here refers to a Java class.
         * Processing the stylesheet required a class to be loaded, but it could
         * not be found.  The substitution text is the name of the class.
         */
        {ErrorMsg.CLASS_NOT_FOUND_ERR,
        "\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u043a\u043b\u0430\u0441\u0441 ''{0}''."},

        /*
         * Note to translators:  The word "method" here refers to a Java method.
         * Processing the stylesheet required a reference to the method named by
         * the substitution text, but it could not be found.  "public" is the
         * Java keyword.
         */
        {ErrorMsg.METHOD_NOT_FOUND_ERR,
        "\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432\u043d\u0435\u0448\u043d\u0438\u0439 \u043c\u0435\u0442\u043e\u0434 ''{0}'' (\u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c public)."},

        /*
         * Note to translators:  The word "method" here refers to a Java method.
         * Processing the stylesheet required a reference to the method named by
         * the substitution text, but no method with the required types of
         * arguments or return type could be found.
         */
        {ErrorMsg.ARGUMENT_CONVERSION_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u0442\u044c \u0442\u0438\u043f \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u0430/\u0432\u043e\u0437\u0432\u0440\u0430\u0442\u0430 \u0432 \u0432\u044b\u0437\u043e\u0432\u0435 \u043c\u0435\u0442\u043e\u0434\u0430 ''{0}''"},

        /*
         * Note to translators:  The file or URI named in the substitution text
         * is missing.
         */
        {ErrorMsg.FILE_NOT_FOUND_ERR,
        "\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0444\u0430\u0439\u043b \u0438\u043b\u0438 URI ''{0}''."},

        /*
         * Note to translators:  This message is displayed when the URI
         * mentioned in the substitution text is not well-formed syntactically.
         */
        {ErrorMsg.INVALID_URI_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 URI ''{0}''."},

        /*
         * Note to translators:  The file or URI named in the substitution text
         * exists but could not be opened.
         */
        {ErrorMsg.FILE_ACCESS_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043e\u0442\u043a\u0440\u044b\u0442\u044c \u0444\u0430\u0439\u043b \u0438\u043b\u0438 URI ''{0}''."},

        /*
         * Note to translators: <xsl:stylesheet> and <xsl:transform> are
         * keywords that should not be translated.
         */
        {ErrorMsg.MISSING_ROOT_ERR,
        "\u041e\u0436\u0438\u0434\u0430\u043b\u0441\u044f \u044d\u043b\u0435\u043c\u0435\u043d\u0442 <xsl:stylesheet> \u0438\u043b\u0438 <xsl:transform>."},

        /*
         * Note to translators:  The stylesheet contained a reference to a
         * namespace prefix that was undefined.  The value of the substitution
         * text is the name of the prefix.
         */
        {ErrorMsg.NAMESPACE_UNDEF_ERR,
        "\u041f\u0440\u0435\u0444\u0438\u043a\u0441 ''{0}'' \u043f\u0440\u043e\u0441\u0442\u0440\u0430\u043d\u0441\u0442\u0432\u0430 \u0438\u043c\u0435\u043d \u043d\u0435 \u043e\u0431\u044a\u044f\u0432\u043b\u0435\u043d."},

        /*
         * Note to translators:  The Java function named in the stylesheet could
         * not be found.
         */
        {ErrorMsg.FUNCTION_RESOLVE_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u0442\u044c \u0432\u044b\u0437\u043e\u0432 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 ''{0}''."},

        /*
         * Note to translators:  The substitution text is the name of a
         * function.  A literal string here means a constant string value.
         */
        {ErrorMsg.NEED_LITERAL_ERR,
        "\u0410\u0440\u0433\u0443\u043c\u0435\u043d\u0442 ''{0}'' \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u043b\u0438\u0442\u0435\u0440\u0430\u043b\u044c\u043d\u043e\u0439 \u0441\u0442\u0440\u043e\u043a\u043e\u0439."},

        /*
         * Note to translators:  This message indicates there was a syntactic
         * error in the form of an XPath expression.  The substitution text is
         * the expression.
         */
        {ErrorMsg.XPATH_PARSER_ERR,
        "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0430\u043d\u0430\u043b\u0438\u0437\u0435 \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u044f XPath ''{0}''."},

        /*
         * Note to translators:  An element in the stylesheet requires a
         * particular attribute named by the substitution text, but that
         * attribute was not specified in the stylesheet.
         */
        {ErrorMsg.REQUIRED_ATTR_ERR,
        "\u041e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 ''{0}''."},

        /*
         * Note to translators:  This message indicates that a character not
         * permitted in an XPath expression was encountered.  The substitution
         * text is the offending character.
         */
        {ErrorMsg.ILLEGAL_CHAR_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u0441\u0438\u043c\u0432\u043e\u043b ''{0}'' \u0432 \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u0438 XPath."},

        /*
         * Note to translators:  A processing instruction is a mark-up item in
         * an XML document that request some behaviour of an XML processor.  The
         * form of the name of was invalid in this case, and the substitution
         * text is the name.
         */
        {ErrorMsg.ILLEGAL_PI_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u043e\u0435 \u0438\u043c\u044f ''{0}'' \u0434\u043b\u044f \u0438\u043d\u0441\u0442\u0440\u0443\u043a\u0446\u0438\u0438 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0438."},

        /*
         * Note to translators:  This message is reported if the stylesheet
         * being processed attempted to construct an XML document with an
         * attribute in a place other than on an element.  The substitution text
         * specifies the name of the attribute.
         */
        {ErrorMsg.STRAY_ATTRIBUTE_ERR,
        "\u0410\u0442\u0440\u0438\u0431\u0443\u0442 ''{0}'' \u0432\u043d\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430."},

        /*
         * Note to translators:  An attribute that wasn't recognized was
         * specified on an element in the stylesheet.  The attribute is named
         * by the substitution
         * text.
         */
        {ErrorMsg.ILLEGAL_ATTRIBUTE_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 ''{0}''."},

        /*
         * Note to translators:  "import" and "include" are keywords that should
         * not be translated.  This messages indicates that the stylesheet
         * named in the substitution text imported or included itself either
         * directly or indirectly.
         */
        {ErrorMsg.CIRCULAR_INCLUDE_ERR,
        "\u0426\u0438\u043a\u043b\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0438\u043c\u043f\u043e\u0440\u0442/\u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435. \u0422\u0430\u0431\u043b\u0438\u0446\u0430 \u0441\u0442\u0438\u043b\u0435\u0439 ''{0}'' \u0443\u0436\u0435 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u0430."},

        /*
         * Note to translators:  A result-tree fragment is a portion of a
         * resulting XML document represented as a tree.  "<xsl:sort>" is a
         * keyword and should not be translated.
         */
        {ErrorMsg.RESULT_TREE_SORT_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043e\u0442\u0441\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0444\u0440\u0430\u0433\u043c\u0435\u043d\u0442\u044b \u0434\u0435\u0440\u0435\u0432\u0430 \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u043e\u0432 (\u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b <xsl:sort> \u0438\u0433\u043d\u043e\u0440\u0438\u0440\u0443\u044e\u0442\u0441\u044f). \u041f\u0440\u0438 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0438 \u0434\u0435\u0440\u0435\u0432\u0430 \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u043e\u0432 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u043e\u0442\u0441\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0443\u0437\u043b\u044b. "},

        /*
         * Note to translators:  A name can be given to a particular style to be
         * used to format decimal values.  The substitution text gives the name
         * of such a style for which more than one declaration was encountered.
         */
        {ErrorMsg.SYMBOLS_REDEF_ERR,
        "\u0414\u0435\u0441\u044f\u0442\u0438\u0447\u043d\u043e\u0435 \u0444\u043e\u0440\u043c\u0430\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 ''{0}'' \u0443\u0436\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e."},

        /*
         * Note to translators:  The stylesheet version named in the
         * substitution text is not supported.
         */
        {ErrorMsg.XSL_VERSION_ERR,
        "\u0412\u0435\u0440\u0441\u0438\u044f XSL ''{0}'' \u043d\u0435 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442\u0441\u044f XSLTC."},

        /*
         * Note to translators:  The definitions of one or more variables or
         * parameters depend on one another.
         */
        {ErrorMsg.CIRCULAR_VARIABLE_ERR,
        "\u0426\u0438\u043a\u043b\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0441\u0441\u044b\u043b\u043a\u0430 \u043d\u0430 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440/\u043f\u0435\u0440\u0435\u043c\u0435\u043d\u043d\u0443\u044e \u0432 ''{0}''."},

        /*
         * Note to translators:  The operator in an expresion with two operands was
         * not recognized.
         */
        {ErrorMsg.ILLEGAL_BINARY_OP_ERR,
        "\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u043e\u043f\u0435\u0440\u0430\u0442\u043e\u0440 \u0432 \u0434\u0432\u043e\u0438\u0447\u043d\u043e\u043c \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u0438."},

        /*
         * Note to translators:  This message is produced if a reference to a
         * function has too many or too few arguments.
         */
        {ErrorMsg.ILLEGAL_ARG_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0435 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u044b \u0432 \u0432\u044b\u0437\u043e\u0432\u0435 \u0444\u0443\u043d\u043a\u0446\u0438\u0438."},

        /*
         * Note to translators:  "document()" is the name of function and must
         * not be translated.  A node-set is a set of the nodes in the tree
         * representation of an XML document.
         */
        {ErrorMsg.DOCUMENT_ARG_ERR,
        "\u0412\u0442\u043e\u0440\u043e\u0439 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442 \u0432 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 document() \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u043d\u0430\u0431\u043e\u0440\u043e\u043c \u0443\u0437\u043b\u043e\u0432."},

        /*
         * Note to translators:  "<xsl:when>" and "<xsl:choose>" are keywords
         * and should not be translated.  This message describes a syntax error
         * in the stylesheet.
         */
        {ErrorMsg.MISSING_WHEN_ERR,
        "\u0412 <xsl:choose> \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c \u043f\u043e \u043a\u0440\u0430\u0439\u043d\u0435\u0439 \u043c\u0435\u0440\u0435 \u043e\u0434\u0438\u043d \u044d\u043b\u0435\u043c\u0435\u043d\u0442 <xsl:when>."},

        /*
         * Note to translators:  "<xsl:otherwise>" and "<xsl:choose>" are
         * keywords and should not be translated.  This message describes a
         * syntax error in the stylesheet.
         */
        {ErrorMsg.MULTIPLE_OTHERWISE_ERR,
        "<xsl:choose> \u0440\u0430\u0437\u0440\u0435\u0448\u0435\u043d \u0442\u043e\u043b\u044c\u043a\u043e \u043e\u0434\u0438\u043d \u044d\u043b\u0435\u043c\u0435\u043d\u0442 <xsl:otherwise>."},

        /*
         * Note to translators:  "<xsl:otherwise>" and "<xsl:choose>" are
         * keywords and should not be translated.  This message describes a
         * syntax error in the stylesheet.
         */
        {ErrorMsg.STRAY_OTHERWISE_ERR,
        "<xsl:otherwise> \u043c\u043e\u0436\u0435\u0442 \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0442\u044c\u0441\u044f \u0442\u043e\u043b\u044c\u043a\u043e \u0432 <xsl:choose>."},

        /*
         * Note to translators:  "<xsl:when>" and "<xsl:choose>" are keywords
         * and should not be translated.  This message describes a syntax error
         * in the stylesheet.
         */
        {ErrorMsg.STRAY_WHEN_ERR,
        "<xsl:when> \u043c\u043e\u0436\u0435\u0442 \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0442\u044c\u0441\u044f \u0442\u043e\u043b\u044c\u043a\u043e \u0432 <xsl:choose>."},

        /*
         * Note to translators:  "<xsl:when>", "<xsl:otherwise>" and
         * "<xsl:choose>" are keywords and should not be translated.  This
         * message describes a syntax error in the stylesheet.
         */
        {ErrorMsg.WHEN_ELEMENT_ERR,
        "\u0412 <xsl:choose> \u0440\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u044b \u0442\u043e\u043b\u044c\u043a\u043e \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b <xsl:when> \u0438 <xsl:otherwise>."},

        /*
         * Note to translators:  "<xsl:attribute-set>" and "name" are keywords
         * that should not be translated.
         */
        {ErrorMsg.UNNAMED_ATTRIBSET_ERR,
        "\u0412 <xsl:attribute-set> \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 'name'."},

        /*
         * Note to translators:  An element in the stylesheet contained an
         * element of a type that it was not permitted to contain.
         */
        {ErrorMsg.ILLEGAL_CHILD_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u0434\u043e\u0447\u0435\u0440\u043d\u0438\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442."},

        /*
         * Note to translators:  The stylesheet tried to create an element with
         * a name that was not a valid XML name.  The substitution text contains
         * the name.
         */
        {ErrorMsg.ILLEGAL_ELEM_NAME_ERR,
        "\u041d\u0435\u043b\u044c\u0437\u044f \u0432\u044b\u0437\u044b\u0432\u0430\u0442\u044c \u044d\u043b\u0435\u043c\u0435\u043d\u0442 ''{0}''"},

        /*
         * Note to translators:  The stylesheet tried to create an attribute
         * with a name that was not a valid XML name.  The substitution text
         * contains the name.
         */
        {ErrorMsg.ILLEGAL_ATTR_NAME_ERR,
        "\u041d\u0435\u043b\u044c\u0437\u044f \u0432\u044b\u0437\u044b\u0432\u0430\u0442\u044c \u0430\u0442\u0440\u0438\u0431\u0443\u0442 ''{0}''"},

        /*
         * Note to translators:  The children of the outermost element of a
         * stylesheet are referred to as top-level elements.  No text should
         * occur within that outermost element unless it is within a top-level
         * element.  This message indicates that that constraint was violated.
         * "<xsl:stylesheet>" is a keyword that should not be translated.
         */
        {ErrorMsg.ILLEGAL_TEXT_NODE_ERR,
        "\u0422\u0435\u043a\u0441\u0442\u043e\u0432\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435 \u0432\u043d\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0432\u0435\u0440\u0445\u043d\u0435\u0433\u043e \u0443\u0440\u043e\u0432\u043d\u044f <xsl:stylesheet>. "},

        /*
         * Note to translators:  JAXP is an acronym for the Java API for XML
         * Processing.  This message indicates that the XML parser provided to
         * XSLTC to process the XML input document had a configuration problem.
         */
        {ErrorMsg.SAX_PARSER_CONFIG_ERR,
        "\u041d\u0435\u043f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u043e \u043d\u0430\u0441\u0442\u0440\u043e\u0435\u043d \u0430\u043d\u0430\u043b\u0438\u0437\u0430\u0442\u043e\u0440 JAXP"},

        /*
         * Note to translators:  The substitution text names the internal error
         * encountered.
         */
        {ErrorMsg.INTERNAL_ERR,
        "\u041d\u0435\u0443\u0441\u0442\u0440\u0430\u043d\u0438\u043c\u0430\u044f \u0432\u043d\u0443\u0442\u0440\u0435\u043d\u043d\u044f\u044f \u043e\u0448\u0438\u0431\u043a\u0430 XSLTC: ''{0}''"},

        /*
         * Note to translators:  The stylesheet contained an element that was
         * not recognized as part of the XSL syntax.  The substitution text
         * gives the element name.
         */
        {ErrorMsg.UNSUPPORTED_XSL_ERR,
        "\u041d\u0435\u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u043c\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 XSL ''{0}''."},

        /*
         * Note to translators:  The stylesheet referred to an extension to the
         * XSL syntax and indicated that it was defined by XSLTC, but XSTLC does
         * not recognized the particular extension named.  The substitution text
         * gives the extension name.
         */
        {ErrorMsg.UNSUPPORTED_EXT_ERR,
        "\u041d\u0435\u0440\u0430\u0441\u043f\u043e\u0437\u043d\u0430\u043d\u043d\u043e\u0435 \u0440\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u0435 XSLTC ''{0}''."},

        /*
         * Note to translators:  The XML document given to XSLTC as a stylesheet
         * was not, in fact, a stylesheet.  XSLTC is able to detect that in this
         * case because the outermost element in the stylesheet has to be
         * declared with respect to the XSL namespace URI, but no declaration
         * for that namespace was seen.
         */
        {ErrorMsg.MISSING_XSLT_URI_ERR,
        "\u0418\u0441\u0445\u043e\u0434\u043d\u044b\u0439 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u043d\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0442\u0430\u0431\u043b\u0438\u0446\u0435\u0439 \u0441\u0442\u0438\u043b\u0435\u0439 (\u043f\u0440\u043e\u0441\u0442\u0440\u0430\u043d\u0441\u0442\u0432\u043e \u0438\u043c\u0435\u043d XSL \u043d\u0435 \u043e\u0431\u044a\u044f\u0432\u043b\u0435\u043d\u043e \u0432 \u043a\u043e\u0440\u043d\u0435\u0432\u043e\u043c \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0435)."},

        /*
         * Note to translators:  XSLTC could not find the stylesheet document
         * with the name specified by the substitution text.
         */
        {ErrorMsg.MISSING_XSLT_TARGET_ERR,
        "\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0442\u0430\u0431\u043b\u0438\u0446\u044b \u0441\u0442\u0438\u043b\u0435\u0439 ''{0}''."},

        /*
         * Note to translators:  This message represents an internal error in
         * condition in XSLTC.  The substitution text is the class name in XSLTC
         * that is missing some functionality.
         */
        {ErrorMsg.NOT_IMPLEMENTED_ERR,
        "\u041d\u0435 \u0440\u0435\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d\u043e: ''{0}''."},

        /*
         * Note to translators:  The XML document given to XSLTC as a stylesheet
         * was not, in fact, a stylesheet.
         */
        {ErrorMsg.NOT_STYLESHEET_ERR,
        "\u0418\u0441\u0445\u043e\u0434\u043d\u044b\u0439 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u043d\u0435 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u0442\u0430\u0431\u043b\u0438\u0446\u0443 \u0441\u0442\u0438\u043b\u0435\u0439 XSL."},

        /*
         * Note to translators:  The element named in the substitution text was
         * encountered in the stylesheet but is not recognized.
         */
        {ErrorMsg.ELEMENT_PARSE_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043f\u0440\u043e\u0430\u043d\u0430\u043b\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u044d\u043b\u0435\u043c\u0435\u043d\u0442 ''{0}''"},

        /*
         * Note to translators:  "use", "<key>", "node", "node-set", "string"
         * and "number" are keywords in this context and should not be
         * translated.  This message indicates that the value of the "use"
         * attribute was not one of the permitted values.
         */
        {ErrorMsg.KEY_USE_ATTR_ERR,
        "\u0410\u0442\u0440\u0438\u0431\u0443\u0442 use <key> \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c node, node-set, string \u0438\u043b\u0438 number."},

        /*
         * Note to translators:  An XML document can specify the version of the
         * XML specification to which it adheres.  This message indicates that
         * the version specified for the output document was not valid.
         */
        {ErrorMsg.OUTPUT_VERSION_ERR,
        "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 XML \u0434\u043e\u043b\u0436\u0435\u043d \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0432\u0435\u0440\u0441\u0438\u044e 1.0"},

        /*
         * Note to translators:  The operator in a comparison operation was
         * not recognized.
         */
        {ErrorMsg.ILLEGAL_RELAT_OP_ERR,
        "\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u043e\u043f\u0435\u0440\u0430\u0442\u043e\u0440 \u0432 \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u0438 \u0441\u0440\u0430\u0432\u043d\u0435\u043d\u0438\u044f."},

        /*
         * Note to translators:  An attribute set defines as a set of XML
         * attributes that can be added to an element in the output XML document
         * as a group.  This message is reported if the name specified was not
         * used to declare an attribute set.  The substitution text is the name
         * that is in error.
         */
        {ErrorMsg.ATTRIBSET_UNDEF_ERR,
        "\u041f\u043e\u043f\u044b\u0442\u043a\u0430 \u0432\u043e\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u043d\u0435\u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u043c \u043d\u0430\u0431\u043e\u0440\u043e\u043c \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u043e\u0432 ''{0}''."},

        /*
         * Note to translators:  The term "attribute value template" is a term
         * defined by XSLT which describes the value of an attribute that is
         * determined by an XPath expression.  The message indicates that the
         * expression was syntactically incorrect; the substitution text
         * contains the expression that was in error.
         */
        {ErrorMsg.ATTR_VAL_TEMPLATE_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043f\u0440\u043e\u0430\u043d\u0430\u043b\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0448\u0430\u0431\u043b\u043e\u043d \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u0430 ''{0}''."},

        /*
         * Note to translators:  ???
         */
        {ErrorMsg.UNKNOWN_SIG_TYPE_ERR,
        "\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0442\u0438\u043f \u0434\u0430\u043d\u043d\u044b\u0445 \u0432 \u0441\u0438\u0433\u043d\u0430\u0442\u0443\u0440\u0435 \u043a\u043b\u0430\u0441\u0441\u0430 ''{0}''."},

        /*
         * Note to translators:  The substitution text refers to data types.
         * The message is displayed if a value in a particular context needs to
         * be converted to type {1}, but that's not possible for a value of
         * type {0}.
         */
        {ErrorMsg.DATA_CONVERSION_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u0442\u044c \u0442\u0438\u043f \u0434\u0430\u043d\u043d\u044b\u0445 ''{0}'' \u0432 ''{1}''."},

        /*
         * Note to translators:  "Templates" is a Java class name that should
         * not be translated.
         */
        {ErrorMsg.NO_TRANSLET_CLASS_ERR,
        "\u0412 \u043a\u043b\u0430\u0441\u0441\u0435 Templates \u043d\u0435\u0442 \u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u043e\u0433\u043e \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u043a\u043b\u0430\u0441\u0441\u0430 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f."},

        /*
         * Note to translators:  "Templates" is a Java class name that should
         * not be translated.
         */
        {ErrorMsg.NO_MAIN_TRANSLET_ERR,
        "\u0412 \u043a\u043b\u0430\u0441\u0441\u0435 Templates \u043d\u0435\u0442 \u043a\u043b\u0430\u0441\u0441\u0430 \u0441 \u0438\u043c\u0435\u043d\u0435\u043c ''{0}''."},

        /*
         * Note to translators:  The substitution text is the name of a class.
         */
        {ErrorMsg.TRANSLET_CLASS_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u043a\u043b\u0430\u0441\u0441 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f ''{0}''."},

        {ErrorMsg.TRANSLET_OBJECT_ERR,
        "\u041a\u043b\u0430\u0441\u0441 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d, \u043e\u0434\u043d\u0430\u043a\u043e \u0441\u043e\u0437\u0434\u0430\u0442\u044c \u044d\u043a\u0437\u0435\u043c\u043f\u043b\u044f\u0440 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e."},

        /*
         * Note to translators:  "ErrorListener" is a Java interface name that
         * should not be translated.  The message indicates that the user tried
         * to set an ErrorListener object on object of the class named in the
         * substitution text with "null" Java value.
         */
        {ErrorMsg.ERROR_LISTENER_NULL_ERR,
        "\u041f\u043e\u043f\u044b\u0442\u043a\u0430 \u043f\u0440\u0438\u0441\u0432\u043e\u0438\u0442\u044c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 null \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0443 ErrorListener \u0434\u043b\u044f ''{0}''"},

        /*
         * Note to translators:  StreamSource, SAXSource and DOMSource are Java
         * interface names that should not be translated.
         */
        {ErrorMsg.JAXP_UNKNOWN_SOURCE_ERR,
        "XSLTC \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0442\u043e\u043b\u044c\u043a\u043e StreamSource, SAXSource \u0438 DOMSource"},

        /*
         * Note to translators:  "Source" is a Java class name that should not
         * be translated.  The substitution text is the name of Java method.
         */
        {ErrorMsg.JAXP_NO_SOURCE_ERR,
        "\u0418\u0441\u0445\u043e\u0434\u043d\u044b\u0439 \u043e\u0431\u044a\u0435\u043a\u0442, \u043f\u0435\u0440\u0435\u0434\u0430\u043d\u043d\u044b\u0439 ''{0}'', \u043f\u0443\u0441\u0442."},

        /*
         * Note to translators:  The message indicates that XSLTC failed to
         * compile the stylesheet into a translet (class file).
         */
        {ErrorMsg.JAXP_COMPILE_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u043e\u0442\u043a\u043e\u043c\u043f\u0438\u043b\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0442\u0430\u0431\u043b\u0438\u0446\u0443 \u0441\u0442\u0438\u043b\u0435\u0439"},

        /*
         * Note to translators:  "TransformerFactory" is a class name.  In this
         * context, an attribute is a property or setting of the
         * TransformerFactory object.  The substitution text is the name of the
         * unrecognised attribute.  The method used to retrieve the attribute is
         * "getAttribute", so it's not clear whether it would be best to
         * translate the term "attribute".
         */
        {ErrorMsg.JAXP_INVALID_ATTR_ERR,
        "TransformerFactory \u043d\u0435 \u0440\u0430\u0441\u043f\u043e\u0437\u043d\u0430\u0435\u0442 \u0430\u0442\u0440\u0438\u0431\u0443\u0442 ''{0}''."},

        /*
         * Note to translators:  "setResult()" and "startDocument()" are Java
         * method names that should not be translated.
         */
        {ErrorMsg.JAXP_SET_RESULT_ERR,
        "\u041f\u0435\u0440\u0435\u0434 startDocument() \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0432\u044b\u0437\u0432\u0430\u0442\u044c setResult()."},

        /*
         * Note to translators:  "Transformer" is a Java interface name that
         * should not be translated.  A Transformer object should contained a
         * reference to a translet object in order to be used for
         * transformations; this message is produced if that requirement is not
         * met.
         */
        {ErrorMsg.JAXP_NO_TRANSLET_ERR,
        "\u0412 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0435 Transformer \u043d\u0435\u0442 \u0438\u043d\u043a\u0430\u043f\u0441\u0443\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0433\u043e \u043e\u0431\u044a\u0435\u043a\u0442\u0430 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f."},

        /*
         * Note to translators:  The XML document that results from a
         * transformation needs to be sent to an output handler object; this
         * message is produced if that requirement is not met.
         */
        {ErrorMsg.JAXP_NO_HANDLER_ERR,
        "\u0414\u043b\u044f \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u043e\u0432 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u043d\u0435 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u0447\u0438\u043a \u0432\u044b\u0432\u043e\u0434\u0430."},

        /*
         * Note to translators:  "Result" is a Java interface name in this
         * context.  The substitution text is a method name.
         */
        {ErrorMsg.JAXP_NO_RESULT_ERR,
        "\u041e\u0431\u044a\u0435\u043a\u0442 Result, \u043f\u0435\u0440\u0435\u0434\u0430\u043d\u043d\u044b\u0439 ''{0}'', \u043d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c."},

        /*
         * Note to translators:  "Transformer" is a Java interface name.  The
         * user's program attempted to access an unrecognized property with the
         * name specified in the substitution text.  The method used to retrieve
         * the property is "getOutputProperty", so it's not clear whether it
         * would be best to translate the term "property".
         */
        {ErrorMsg.JAXP_UNKNOWN_PROP_ERR,
        "\u041f\u043e\u043f\u044b\u0442\u043a\u0430 \u043e\u0431\u0440\u0430\u0442\u0438\u0442\u044c\u0441\u044f \u043a \u043d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u043e\u043c\u0443 \u0441\u0432\u043e\u0439\u0441\u0442\u0432\u0443 Transformer ''{0}''."},

        /*
         * Note to translators:  SAX2DOM is the name of a Java class that should
         * not be translated.  This is an adapter in the sense that it takes a
         * DOM object and converts it to something that uses the SAX API.
         */
        {ErrorMsg.SAX2DOM_ADAPTER_ERR,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0441\u043e\u0437\u0434\u0430\u0442\u044c \u0430\u0434\u0430\u043f\u0442\u0435\u0440 SAX2DOM: ''{0}''."},

        /*
         * Note to translators:  "XSLTCSource.build()" is a Java method name.
         * "systemId" is an XML term that is short for "system identification".
         */
        {ErrorMsg.XSLTC_SOURCE_ERR,
        "XSLTCSource.build() \u0432\u044b\u0437\u0432\u0430\u043d \u0431\u0435\u0437 \u043f\u0440\u0435\u0434\u0432\u0430\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0439 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0438 systemId. "},


        {ErrorMsg.COMPILE_STDIN_ERR,
        "\u041e\u043f\u0446\u0438\u044f -i \u0434\u043e\u043b\u0436\u043d\u0430 \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0442\u044c\u0441\u044f \u0432\u043c\u0435\u0441\u0442\u0435 \u0441 \u043e\u043f\u0446\u0438\u0435\u0439 -o."},


        /*
         * Note to translators:  This message contains usage information for a
         * means of invoking XSLTC from the command-line.  The message is
         * formatted for presentation in English.  The strings <output>,
         * <directory>, etc. indicate user-specified argument values, and can
         * be translated - the argument <package> refers to a Java package, so
         * it should be handled in the same way the term is handled for JDK
         * documentation.
         */
        {ErrorMsg.COMPILE_USAGE_STR,
        "\u0424\u043e\u0440\u043c\u0430\u0442\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <\u0432\u044b\u0432\u043e\u0434>]\n [-d <\u043a\u0430\u0442\u0430\u043b\u043e\u0433>] [-j <\u0444\u0430\u0439\u043b-jar>] [-p <\u043f\u0430\u043a\u0435\u0442>]\n      [-n] [-x] [-s] [-u] [-v] [-h] { <\u0442\u0430\u0431\u043b\u0438\u0446\u0430-\u0441\u0442\u0438\u043b\u0435\u0439> | -i }\n\nOPTIONS\n   -o <\u0432\u044b\u0432\u043e\u0434> \u043f\u0440\u0438\u0441\u0432\u0430\u0438\u0432\u0430\u0435\u0442 \u0441\u043e\u0437\u0434\u0430\u043d\u043d\u043e\u0439 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0435 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0438\u043c\u044f <\u0432\u044b\u0432\u043e\u0434>\n  \u041f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e \u0438\u043c\u044f \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f\n \u0431\u0435\u0440\u0435\u0442\u0441\u044f \u0438\u0437 \u0438\u043c\u0435\u043d\u0438 <\u0442\u0430\u0431\u043b\u0438\u0446\u044b-\u0441\u0442\u0438\u043b\u0435\u0439>. \u041f\u0440\u0438 \u043a\u043e\u043c\u043f\u0438\u043b\u044f\u0446\u0438\u0438 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u0438\u0445 \u0442\u0430\u0431\u043b\u0438\u0446 \u0441\u0442\u0438\u043b\u0435\u0439\n                  \u044d\u0442\u0430 \u043e\u043f\u0446\u0438\u044f \u0438\u0433\u043d\u043e\u0440\u0438\u0440\u0443\u0435\u0442\u0441\u044f.\n-d <\u043a\u0430\u0442\u0430\u043b\u043e\u0433> \u0437\u0430\u0434\u0430\u0435\u0442 \u0446\u0435\u043b\u0435\u0432\u043e\u0439 \u043a\u0430\u0442\u0430\u043b\u043e\u0433 \u0434\u043b\u044f \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f\n   -j <\u0444\u0430\u0439\u043b-jar> \u0443\u043f\u0430\u043a\u043e\u0432\u044b\u0432\u0430\u0435\u0442 \u043a\u043b\u0430\u0441\u0441\u044b \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \n                  \u0432 <\u0444\u0430\u0439\u043b-jar> \u0441 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u043c \u0438\u043c\u0435\u043d\u0435\u043c\n   -p <\u043f\u0430\u043a\u0435\u0442>   \u0437\u0430\u0434\u0430\u0435\u0442 \u043f\u0440\u0435\u0444\u0438\u043a\u0441 \u0438\u043c\u0435\u043d\u0438 \u043f\u0430\u043a\u0435\u0442\u0430 \u0434\u043b\u044f \u0432\u0441\u0435\u0445 \u0441\u043e\u0437\u0434\u0430\u043d\u043d\u044b\u0445\n                  \u043a\u043b\u0430\u0441\u0441\u043e\u0432 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f\n -n             \u0440\u0430\u0437\u0440\u0435\u0448\u0430\u0435\u0442 \u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u043e\u043a \u0448\u0430\u0431\u043b\u043e\u043d\u0430 (\u043e\u0431\u044b\u0447\u043d\u043e \u0441\u043f\u043e\u0441\u043e\u0431, \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u043c\u044b\u0439 \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e,\n \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043b\u0443\u0447\u0448\u0435).\n   -x             \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0432\u044b\u0432\u043e\u0434 \u043e\u0442\u043b\u0430\u0434\u043e\u0447\u043d\u044b\u0445 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0439\n   -s  \u0432\u044b\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0432\u044b\u0437\u043e\u0432 System.exit\n   -u             \u0438\u043d\u0442\u0435\u0440\u043f\u0440\u0435\u0442\u0438\u0440\u0443\u0435\u0442 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u044b <\u0442\u0430\u0431\u043b\u0438\u0446\u044b-\u0441\u0442\u0438\u043b\u0435\u0439>  \u043a\u0430\u043a URL\n   -i             \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442, \u0447\u0442\u043e \u043a\u043e\u043c\u043f\u0438\u043b\u044f\u0442\u043e\u0440 \u0434\u043e\u043b\u0436\u0435\u043d \u0441\u0447\u0438\u0442\u044b\u0432\u0430\u0442\u044c \u0442\u0430\u0431\u043b\u0438\u0446\u0443 \u0441\u0442\u0438\u043b\u0435\u0439 \u0438\u0437 \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e\u0433\u043e \u0432\u0432\u043e\u0434\u0430\n   -v             \u0432\u044b\u0432\u043e\u0434\u0438\u0442 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e \u0432\u0435\u0440\u0441\u0438\u0438 \u043a\u043e\u043c\u043f\u0438\u043b\u044f\u0442\u043e\u0440\u0430\n   -h \u0432\u044b\u0432\u043e\u0434\u0438\u0442 \u0434\u0430\u043d\u043d\u043e\u0435 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435\n"},

        /*
         * Note to translators:  This message contains usage information for a
         * means of invoking XSLTC from the command-line.  The message is
         * formatted for presentation in English.  The strings <jarfile>,
         * <document>, etc. indicate user-specified argument values, and can
         * be translated - the argument <class> refers to a Java class, so it
         * should be handled in the same way the term is handled for JDK
         * documentation.
         */
        {ErrorMsg.TRANSFORM_USAGE_STR,
        "\u0424\u043e\u0440\u043c\u0430\u0442\n   java org.apache.xalan.xsltc.cmdline.Transform [-j <\u0444\u0430\u0439\u043b-jar>]\n      [-x] [-s] [-n <\u0441\u0447\u0435\u0442\u0447\u0438\u043a>]  {-u <url-\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430> | <\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442>}\n  <\u043a\u043b\u0430\u0441\u0441> [<\u043f\u0430\u0440\u0430\u043c\u0435\u0442\u04401>=<\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u04351> ...]\n\n \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u0442 <\u043a\u043b\u0430\u0441\u0441> \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0434\u043b\u044f \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \n <\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430> XML \u0441 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u043c \u0438\u043c\u0435\u043d\u0435\u043c. <\u041a\u043b\u0430\u0441\u0441> \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u0434\u043e\u0441\u0442\u0443\u043f\u0435\u043d \u043b\u0438\u0431\u043e \n   \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e CLASSPATH \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f, \u043b\u0438\u0431\u043e \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u0433\u043e <\u0444\u0430\u0439\u043b\u0430-jar>.\n\u041e\u043f\u0446\u0438\u0438\n   -j <\u0444\u0430\u0439\u043b-jar>    \u0437\u0430\u0434\u0430\u0435\u0442 \u0444\u0430\u0439\u043b jar, \u0438\u0437 \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u0437\u0430\u0433\u0440\u0443\u0436\u0430\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f\n  -x              \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u043e\u0442\u043b\u0430\u0434\u043e\u0447\u043d\u044b\u0435 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f\n   -s  \u0432\u044b\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0432\u044b\u0437\u043e\u0432 System.exit\n   -n <\u0438\u0442\u0435\u0440\u0430\u0446\u0438\u0438> \u0432\u044b\u043f\u043e\u043b\u043d\u044f\u0435\u0442 \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u0435 <\u0441\u0447\u0435\u0442\u0447\u0438\u043a> \u0440\u0430\u0437 \u0438\n                   \u043f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043f\u0440\u043e\u0444\u0438\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f\n  -u <url-\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0430> \u0437\u0430\u0434\u0430\u0435\u0442 \u0438\u0441\u0445\u043e\u0434\u043d\u044b\u0439 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442 XML \u0432 \u0432\u0438\u0434\u0435 URL\n"},



        /*
         * Note to translators:  "<xsl:sort>", "<xsl:for-each>" and
         * "<xsl:apply-templates>" are keywords that should not be translated.
         * The message indicates that an xsl:sort element must be a child of
         * one of the other kinds of elements mentioned.
         */
        {ErrorMsg.STRAY_SORT_ERR,
        "<xsl:sort> \u043c\u043e\u0436\u0435\u0442 \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0442\u044c\u0441\u044f \u0442\u043e\u043b\u044c\u043a\u043e \u0432 <xsl:for-each> \u0438\u043b\u0438 <xsl:apply-templates>."},

        /*
         * Note to translators:  The message indicates that the encoding
         * requested for the output document was on that requires support that
         * is not available from the Java Virtual Machine being used to execute
         * the program.
         */
        {ErrorMsg.UNSUPPORTED_ENCODING,
        "\u0426\u0435\u043b\u0435\u0432\u0430\u044f \u043a\u043e\u0434\u0438\u0440\u043e\u0432\u043a\u0430 ''{0}'' \u043d\u0435 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442\u0441\u044f \u044d\u0442\u043e\u0439 JVM."},

        /*
         * Note to translators:  The message indicates that the XPath expression
         * named in the substitution text was not well formed syntactically.
         */
        {ErrorMsg.SYNTAX_ERR,
        "\u0421\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u043e\u0448\u0438\u0431\u043a\u0430 \u0432 ''{0}''."},

        /*
         * Note to translators:  The substitution text is the name of a Java
         * class.  The term "constructor" here is the Java term.  The message is
         * displayed if XSLTC could not find a constructor for the specified
         * class.
         */
        {ErrorMsg.CONSTRUCTOR_NOT_FOUND,
        "\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432\u043d\u0435\u0448\u043d\u0438\u0439 \u043a\u043e\u043d\u0441\u0442\u0440\u0443\u043a\u0442\u043e\u0440 ''{0}''."},

        /*
         * Note to translators:  "static" is the Java keyword.  The substitution
         * text is the name of a function.  The first argument of that function
         * is not of the required type.
         */
        {ErrorMsg.NO_JAVA_FUNCT_THIS_REF,
        "\u041f\u0435\u0440\u0432\u044b\u0439 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442 \u0432 \u043d\u0435 \u0441\u0442\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0439 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 Java ''{0}'' \u043d\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u043e\u0439 \u0441\u0441\u044b\u043b\u043a\u043e\u0439 \u043d\u0430 \u043e\u0431\u044a\u0435\u043a\u0442."},

        /*
         * Note to translators:  An XPath expression was not of the type
         * required in a particular context.  The substitution text is the
         * expression that was in error.
         */
        {ErrorMsg.TYPE_CHECK_ERR,
        "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0435 \u0442\u0438\u043f\u0430 \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u044f ''{0}''."},

        /*
         * Note to translators:  An XPath expression was not of the type
         * required in a particular context.  However, the location of the
         * problematic expression is unknown.
         */
        {ErrorMsg.TYPE_CHECK_UNK_LOC_ERR,
        "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0435 \u0442\u0438\u043f\u0430 \u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u044f \u0432 \u043d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u043e\u043c \u0440\u0430\u0441\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0438."},

        /*
         * Note to translators:  The substitution text is the name of a command-
         * line option that was not recognized.
         */
        {ErrorMsg.ILLEGAL_CMDLINE_OPTION_ERR,
        "\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u0430\u044f \u043e\u043f\u0446\u0438\u044f \u043a\u043e\u043c\u0430\u043d\u0434\u043d\u043e\u0439 \u0441\u0442\u0440\u043e\u043a\u0438 ''{0}''."},

        /*
         * Note to translators:  The substitution text is the name of a command-
         * line option.
         */
        {ErrorMsg.CMDLINE_OPT_MISSING_ARG_ERR,
        "\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442 \u043e\u043f\u0446\u0438\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u043d\u043e\u0439 \u0441\u0442\u0440\u043e\u043a\u0438 ''{0}''. "},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text contains two error
         * messages.  The spacing before the second substitution text indents
         * it the same amount as the first in English.
         */
        {ErrorMsg.WARNING_PLUS_WRAPPED_MSG,
        "\u041f\u0440\u0435\u0434\u0443\u043f\u0440\u0435\u0436\u0434\u0435\u043d\u0438\u0435:  ''{0}''\n       :{1}"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text is an error message.
         */
        {ErrorMsg.WARNING_MSG,
        "\u041f\u0440\u0435\u0434\u0443\u043f\u0440\u0435\u0436\u0434\u0435\u043d\u0438\u0435:  ''{0}''"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text contains two error
         * messages.  The spacing before the second substitution text indents
         * it the same amount as the first in English.
         */
        {ErrorMsg.FATAL_ERR_PLUS_WRAPPED_MSG,
        "\u041a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u043e\u0448\u0438\u0431\u043a\u0430:  ''{0}''\n           :{1}"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text is an error message.
         */
        {ErrorMsg.FATAL_ERR_MSG,
        "\u041a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u043e\u0448\u0438\u0431\u043a\u0430:  ''{0}''"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text contains two error
         * messages.  The spacing before the second substitution text indents
         * it the same amount as the first in English.
         */
        {ErrorMsg.ERROR_PLUS_WRAPPED_MSG,
        "\u041e\u0448\u0438\u0431\u043a\u0430:  ''{0}''\n     :{1}"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text is an error message.
         */
        {ErrorMsg.ERROR_MSG,
        "\u041e\u0448\u0438\u0431\u043a\u0430:  ''{0}''"},

        /*
         * Note to translators:  The substitution text is the name of a class.
         */
        {ErrorMsg.TRANSFORM_WITH_TRANSLET_STR,
        "\u041f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u0435 \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b ''{0}'' "},

        /*
         * Note to translators:  The first substitution is the name of a class,
         * while the second substitution is the name of a jar file.
         */
        {ErrorMsg.TRANSFORM_WITH_JAR_STR,
        "\u041f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u0435 \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b ''{0}'' \u0438\u0437 \u0444\u0430\u0439\u043b\u0430 jar ''{1}''"},

        /*
         * Note to translators:  "TransformerFactory" is the name of a Java
         * interface and must not be translated.  The substitution text is
         * the name of the class that could not be instantiated.
         */
        {ErrorMsg.COULD_NOT_CREATE_TRANS_FACT,
        "\u041d\u0435\u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e \u0441\u043e\u0437\u0434\u0430\u0442\u044c \u044d\u043a\u0437\u0435\u043c\u043f\u043b\u044f\u0440 \u043a\u043b\u0430\u0441\u0441\u0430 TransformerFactory ''{0}''."},

        /*
         * Note to translators:  The following message is used as a header.
         * All the error messages are collected together and displayed beneath
         * this message.
         */
        {ErrorMsg.COMPILER_ERROR_KEY,
        "\u041e\u0448\u0438\u0431\u043a\u0438 \u043a\u043e\u043c\u043f\u0438\u043b\u044f\u0442\u043e\u0440\u0430:"},

        /*
         * Note to translators:  The following message is used as a header.
         * All the warning messages are collected together and displayed
         * beneath this message.
         */
        {ErrorMsg.COMPILER_WARNING_KEY,
        "\u041f\u0440\u0435\u0434\u0443\u043f\u0440\u0435\u0436\u0434\u0435\u043d\u0438\u044f \u043a\u043e\u043c\u043f\u0438\u043b\u044f\u0442\u043e\u0440\u0430:"},

        /*
         * Note to translators:  The following message is used as a header.
         * All the error messages that are produced when the stylesheet is
         * applied to an input document are collected together and displayed
         * beneath this message.  A 'translet' is the compiled form of a
         * stylesheet (see above).
         */
        {ErrorMsg.RUNTIME_ERROR_KEY,
        "\u041e\u0448\u0438\u0431\u043a\u0438 \u043f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f:"}
    };
    }
}
