/*
 * Copyright (C) 2015 GedMarc
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.components.jqxwidgets.colorpicker.JQXColorPickerDropDown;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;

/**
 * This Class
 *
 * @author GedMarc
 * @since 30 Dec 2015
 */
public class DemoColourPicker extends JQXColorPickerDropDown
{

    private static final long serialVersionUID = 1L;

    public DemoColourPicker()
    {
        // setID("colPicker");
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    private static final DemoColourPickerDefaults def = new DemoColourPickerDefaults();

    public static class DemoColourPickerDefaults extends CSSComponent
    {

        private static final long serialVersionUID = 1L;

        public DemoColourPickerDefaults()
        {
            super("defaultCol");
        }
    }
}
