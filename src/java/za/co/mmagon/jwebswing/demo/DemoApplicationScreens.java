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
package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.demo.screens.ComingSoon;
import za.co.mmagon.jwebswing.demo.screens.view.ComponentInteractionScreen;
import za.co.mmagon.jwebswing.demo.screens.view.EventHandlingScreen;
import za.co.mmagon.jwebswing.demo.screens.view.FrameworksScreen;
import za.co.mmagon.jwebswing.demo.screens.view.GettingStartedScreen;
import za.co.mmagon.jwebswing.demo.screens.view.WelcomeToJWebSwingScreen;
import za.co.mmagon.jwebswing.demo.screens.view.YouTubeLinksScreen;
import za.co.mmagon.jwebswing.demo.screens.view.jqplot.JQPlotBarGraphsDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqplot.JQPlotBubbleGraphsDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqplot.JQPlotDonutGraphsDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqplot.JQPlotLineGraphsDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqplot.JQPlotPieGraphsDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqplot.JQPlotWaterfallGraphsDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqueryui.JQUIDraggableDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqueryui.JQUIDroppableDemo;
import za.co.mmagon.jwebswing.demo.screens.view.jqueryui.JQUISpinnerDemo;

/**
 *
 * @author GedMarc
 * @since 17 Jan 2016
 */
public enum DemoApplicationScreens
{
    TestScreen(new TestScreen()),
    WelcomeScreen(new WelcomeToJWebSwingScreen()),
    GettingStarted(new GettingStartedScreen()),
    EventHandlingScreen(new EventHandlingScreen()),
    FrameworksScreen(new FrameworksScreen()),
    YouTubeLinksScreen(new YouTubeLinksScreen()),
    ComingSoon(new ComingSoon()),
    ComponentInteractions(new ComponentInteractionScreen()),
    /**
     * UI Components
     */
    UISpinner(new JQUISpinnerDemo()),
    UIDraggable(new JQUIDraggableDemo()),
    UIDroppable(new JQUIDroppableDemo()),
    /**
     * JQPlot Demos
     */
    BarGraphDemo(new JQPlotBarGraphsDemo()),
    LineGraphDemo(new JQPlotLineGraphsDemo()),
    BubbleGraphDemo(new JQPlotBubbleGraphsDemo()),
    PieGraphDemo(new JQPlotPieGraphsDemo()),
    DonutGraphDemo(new JQPlotDonutGraphsDemo()),
    WaterfallGraphDemo(new JQPlotWaterfallGraphsDemo()),;

    private DefaultScreenDisplay screenToDisplay;

    private DemoApplicationScreens(DefaultScreenDisplay screenToDisplay)
    {
        this.screenToDisplay = screenToDisplay;
    }

    private DemoApplicationScreens()
    {
    }

    public DefaultScreenDisplay getScreenToDisplay()
    {
        return screenToDisplay;
    }

    public void setScreenToDisplay(DefaultScreenDisplay screenToDisplay)
    {
        this.screenToDisplay = screenToDisplay;
    }

}
