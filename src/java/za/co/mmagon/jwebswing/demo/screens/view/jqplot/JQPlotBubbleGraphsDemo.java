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
package za.co.mmagon.jwebswing.demo.screens.view.jqplot;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Displays;

/**
 *
 * @author GedMarc
 * @since 03 Apr 2016
 */
public class JQPlotBubbleGraphsDemo extends DefaultScreenDisplay
{

    public JQPlotBubbleGraphsDemo()
    {
    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("JQ Plot Main Window Display", JQPlotGraphsMainWindow.class);
        scs.addButton("JQ Plot Bubble Demo", JQPlotBubbleGraphsDemo.class);
        return scs;
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        return new ComponentOptionsScreen();
    }

    Div barGraphsDiv1 = new Div();
    Div barGraphsDiv2 = new Div();
    Div barGraphsDiv3 = new Div();

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        JQPlotGraphsMainWindow mwd = new JQPlotGraphsMainWindow();
        barGraphsDiv1.getCss().getDisplay().setDisplay(Displays.Flex);
        barGraphsDiv2.getCss().getDisplay().setDisplay(Displays.Flex);
        barGraphsDiv3.getCss().getDisplay().setDisplay(Displays.Flex);

        barGraphsDiv1.add(mwd.getBubbleGraph());
        barGraphsDiv1.add(mwd.getBubbleGraphTransparency());
        barGraphsDiv1.add(mwd.getBubbleGraphGradients());

        mwd.add(barGraphsDiv1);
        mwd.add(barGraphsDiv2);
        mwd.add(barGraphsDiv3);

        return mwd;
    }

}
