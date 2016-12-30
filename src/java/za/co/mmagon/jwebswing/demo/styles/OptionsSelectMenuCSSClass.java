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
package za.co.mmagon.jwebswing.demo.styles;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.components.jqueryui.position.Position;
import za.co.mmagon.jwebswing.components.jqueryui.position.PositionLocationHorizontal;
import za.co.mmagon.jwebswing.components.jqueryui.position.PositionLocationVertical;
import za.co.mmagon.jwebswing.components.jqueryui.selectmenu.JQUISelectMenuFeature;
import za.co.mmagon.jwebswing.htmlbuilder.css.CSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSS;

/**
 *
 * @author GedMarc
 * @since 28 Apr 2015
 */
@CSS(Min_Width = @MeasurementCSS(140))
public class OptionsSelectMenuCSSClass extends CSSComponent
{

    private static final long serialVersionUID = 1L;
    private Position p = new Position(PositionLocationHorizontal.left, PositionLocationVertical.center, PositionLocationHorizontal.right, PositionLocationVertical.center, this);
    private final JQUISelectMenuFeature feature;

    public OptionsSelectMenuCSSClass()
    {
        super("optionsSelector");
        feature = new JQUISelectMenuFeature(this);
        addFeature(feature);
    }

}
