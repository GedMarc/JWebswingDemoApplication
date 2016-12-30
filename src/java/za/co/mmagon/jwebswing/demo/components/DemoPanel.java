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
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanel;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelFeature;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelSizeModes;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;

/**
 *
 * @author GedMarc
 */
public class DemoPanel extends JQXPanel
{

    private static final long serialVersionUID = 1L;

    public DemoPanel()
    {
        addClass(format);
        //getFeatures().clear();
    }

    private static final DemoPanelFormat format = new DemoPanelFormat();

    private static class DemoPanelFormat extends CSSComponent
    {

        private static final long serialVersionUID = 1L;

        private JQXPanelFeature feature = new JQXPanelFeature(this);

        public DemoPanelFormat()
        {
            super("demoPanel");
            addFeature(feature);
            feature.getOptions().setTheme(DemoApplicationBody.jqxTheme);
            feature.getOptions().setSizeMode(JQXPanelSizeModes.fixed);
            feature.getOptions().setHeight(MeasurementCSSImpl.hundredPercent);
            feature.getOptions().setWidth(MeasurementCSSImpl.hundredPercent);
        }

    }
}
