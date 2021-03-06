package com.dukescript.libraries.ap.test.hello;

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

import net.java.html.junit.BrowserRunner;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(BrowserRunner.class)
public class SingletonTest {
    @Test
    public void getTheValue() {
        Number obj = Exports.singletonNumber.value(30, 12);
        assertEquals(42, obj.intValue());
    }

    @Test
    public void getFirstValue() {
        Object obj = Exports.firstValue().$apply("Hi", "There");
        assertEquals("Hi", obj);
    }

}
