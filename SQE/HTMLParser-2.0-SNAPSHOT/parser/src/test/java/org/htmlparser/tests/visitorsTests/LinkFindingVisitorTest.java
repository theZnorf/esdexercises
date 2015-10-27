// HTMLParser Library - A java-based parser for HTML
// http://htmlparser.org
// Copyright (C) 2006 Somik Raha
//
// Revision Control Information
//
// $URL: https://svn.sourceforge.net/svnroot/htmlparser/trunk/parser/src/test/java/org/htmlparser/tests/visitorsTests/LinkFindingVisitorTest.java $
// $Author: derrickoswald $
// $Date: 2006-09-16 10:44:17 -0400 (Sat, 16 Sep 2006) $
// $Revision: 4 $
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the Common Public License; either
// version 1.0 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// Common Public License for more details.
//
// You should have received a copy of the Common Public License
// along with this library; if not, the license is available from
// the Open Source Initiative (OSI) website:
//   http://opensource.org/licenses/cpl1.0.php

package org.htmlparser.tests.visitorsTests;

import org.htmlparser.tests.ParserTestCase;
import org.htmlparser.visitors.LinkFindingVisitor;

public class LinkFindingVisitorTest extends ParserTestCase {

    static
    {
        System.setProperty ("org.htmlparser.tests.visitorsTests.LinkFindingVisitorTest", "LinkFindingVisitorTest");
    }

    private String html =
        "<HTML><HEAD><TITLE>This is the Title</TITLE></HEAD><BODY>Hello World, <A href=\"http://www.industriallogic.com\">Industrial Logic</a></BODY></HTML>";

    public LinkFindingVisitorTest(String name) {
        super(name);
    }

    public void testLinkFoundCorrectly() throws Exception {
        createParser(html);
        LinkFindingVisitor visitor = new LinkFindingVisitor("Industrial Logic");
        parser.visitAllNodesWith(visitor);
        assertTrue("Found Industrial Logic Link",visitor.linkTextFound());
        assertEquals("Link Count",1,visitor.getCount());
    }

}
