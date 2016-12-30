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

import za.co.mmagon.jwebswing.components.jqxwidgets.input.JQXInput;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;

/**
 * This Class
 *
 * @author GedMarc
 * @since 30 Dec 2015
 */
public class DemoInputText extends JQXInput
{

    private static final long serialVersionUID = 1L;

    public DemoInputText()
    {
        getOptions().setHeight(25);
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
        getOptions().setWidth(MeasurementCSSImpl.hundredPercent);

    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
