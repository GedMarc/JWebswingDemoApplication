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

import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButtonTemplates;
import za.co.mmagon.jwebswing.components.jqxwidgets.numberinput.JQXNumberInput;
import za.co.mmagon.jwebswing.components.jqxwidgets.numberinput.JQXNumberInputOptionsModes;
import za.co.mmagon.jwebswing.components.jqxwidgets.numberinput.JQXNumberInputTextAlignments;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;

/**
 *
 * @author GedMarc
 * @since 01 May 2015
 */
public class DemoDefaultSpinner extends JQXNumberInput
{

    private static final long serialVersionUID = 1L;

    public DemoDefaultSpinner()
    {
        this(false);
    }

    public DemoDefaultSpinner(Boolean isDouble)
    {
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
        getOptions().setHeight(25);
        getOptions().setSpinButtons(true);
        getOptions().setInputMode(JQXNumberInputOptionsModes.Simple);
        getOptions().setTextAlign(JQXNumberInputTextAlignments.left);
        getOptions().setTemplate(JQXButtonTemplates.Primary);

        if (isDouble)
        {
            getOptions().setDecimalDigits(2);
            getOptions().setDigits(3);
        }
        else
        {
            getOptions().setDecimalDigits(0);
            getOptions().setDigits(3);
        }
        //getOptions().setTextAlign(JQXNumberInputTextAlignments.left);

    }

}
