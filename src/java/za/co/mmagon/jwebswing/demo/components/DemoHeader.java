/*
 * Copyright (C) 2016 GedMarc
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

import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.htmlbuilder.css.CSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.heightwidth.HeightWidthCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.margins.MarginsCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.padding.PaddingCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextAlignments;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.VerticalAlignments;

/**
 *
 * @author GedMarc
 */
@CSS(Dimensions = @HeightWidthCSS(Height = @MeasurementCSS(30)),
     Text = @TextCSS(
             VerticalAlign = VerticalAlignments.Middle,
             TextAlign = TextAlignments.Center),
     Margins = @MarginsCSS(
             MarginTop = @MeasurementCSS(0)),
     Padding = @PaddingCSS(
             PaddingTop = @MeasurementCSS(5)))
public class DemoHeader extends HeaderText
{

    private static final long serialVersionUID = 1L;

    public DemoHeader(HeaderTypes headerType, String text)
    {
        super(headerType, text);
        if (headerType == HeaderTypes.H1)
        {
            addClass(JQUIThemeBlocks.UI_State_Highlight);
        }
    }
}
