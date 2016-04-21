/*
 * Copyright 1999-2004 The Apache Software Foundation.
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
 * $Id: RTFIterator.java,v 1.7 2004/08/17 19:25:34 jycli Exp $
 */

/**
 * This class implements an RTF Iterator. Currently exists for sole
 * purpose of enabling EXSLT object-type function to return "RTF".
 * 
  * @xsl.usage advanced
  */
package org.apache.xpath.axes;

import org.apache.xml.dtm.DTMManager;
import org.apache.xpath.NodeSetDTM;

public class RTFIterator extends NodeSetDTM {
    static final long serialVersionUID = 7658117366258528996L;

	/**
	 * Constructor for RTFIterator
	 */	
	public RTFIterator(int root, DTMManager manager) {
		super(root, manager);
	}
}

