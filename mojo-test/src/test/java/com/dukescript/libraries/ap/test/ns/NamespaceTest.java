package com.dukescript.libraries.ap.test.ns;

/*
 * #%L
 * Annotation Processor Tests - a library from the DukeScript project.
 * Visit http://dukescript.com for support and commercial license.
 * %%
 * Copyright (C) 2015 - 2016 Dukehoff GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.dukescript.libraries.ap.test.ns.geo.Circle;
import com.dukescript.libraries.ap.test.ns.geo.Elipse;
import net.java.html.junit.BrowserRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(BrowserRunner.class)
public class NamespaceTest {
    @Test
    public void elipseIsCircle() {
        Elipse elipse = null;
        Circle circle = elipse;
        Assert.assertNull("Check the value", circle);
    }

    @Test
    public void checkNamespaces() {
        String text = Exports.math.hello().toString();
        Assert.assertEquals("Hello", text);
    }
}