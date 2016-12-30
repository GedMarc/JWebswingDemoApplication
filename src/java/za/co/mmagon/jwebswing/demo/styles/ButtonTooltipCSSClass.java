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
import za.co.mmagon.jwebswing.components.jqueryui.button.JQUIButtonFeature;
import za.co.mmagon.jwebswing.components.jqueryui.position.Position;
import za.co.mmagon.jwebswing.components.jqueryui.position.PositionLocationHorizontal;
import za.co.mmagon.jwebswing.components.jqueryui.position.PositionLocationVertical;
import za.co.mmagon.jwebswing.components.jqueryui.tooltips.JQUIToolTipFeature;

/**
 *
 * @author GedMarc
 * @since 28 Apr 2015
 */
public class ButtonTooltipCSSClass extends CSSComponent
{

    private static final long serialVersionUID = 1L;
    private final Position p = new Position(PositionLocationHorizontal.left, PositionLocationVertical.center, PositionLocationHorizontal.right, PositionLocationVertical.center, this);
    private final JQUIToolTipFeature tooltip = new JQUIToolTipFeature(this);

    public ButtonTooltipCSSClass()
    {
        super("menuButtonTooltips");
        tooltip.getOptions().setTrack(true);
        addFeature(tooltip);
        addFeature(new JQUIButtonFeature(this));
    }
}
