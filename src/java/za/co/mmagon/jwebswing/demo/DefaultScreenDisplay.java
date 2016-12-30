/*
 * Copyright (C) 2015 Marc Magon
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
package za.co.mmagon.jwebswing.demo;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.demo.components.DemoRibbon;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourNames;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementPercentages;
import za.co.mmagon.logger.LogFactory;

/**
 * The default screens for the system
 * <p>
 * @author Marc Magon
 * @since 24 Aug 2015
 * @version 1.0
 */
public abstract class DefaultScreenDisplay extends DemoRibbon
{

    private static Logger log = LogFactory.getInstance().getLogger("Default Screen");

    private static final long serialVersionUID = 1L;

    public DefaultScreenDisplay()
    {

    }

    @Override
    public void preConfigure()
    {
        super.preConfigure();
        getOptions().setHeight(MeasurementPercentages.hundredPercent);
        //addRibbonItem("Canvas", new DemoPanel());
        // addRibbonItem("System Log", getSystemLog());
        getCss().getBackground().setBackgroundColor$(ColourNames.Black);

        setID("UpdateDiv");
    }

    public abstract SourceCodeScreen getSourceCodeScreen();

    public abstract ComponentOptionsScreen getComponentOptionsScreen();

    public abstract MainWindowDisplay getDefaultDisplayScreen();

}
