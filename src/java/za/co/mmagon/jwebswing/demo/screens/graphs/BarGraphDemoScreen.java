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
package za.co.mmagon.jwebswing.demo.screens.graphs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotBarGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotBarWaterFallGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.display.JQPlotBar;
import za.co.mmagon.jwebswing.components.jqplot.options.series.JQPlotSeriesBarOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.ticks.JQPlotTickOptionsCanvasAxisTick;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Displays;

/**
 *
 * @author Marc Magon
 * @since 08 Aug 2015
 * @version 1.0
 */
public class BarGraphDemoScreen extends Div
{

    private static final long serialVersionUID = 1L;

    public BarGraphDemoScreen()
    {
        Div barGraphsDiv1 = new Div();
        Div barGraphsDiv2 = new Div();
        Div barGraphsDiv3 = new Div();
        Div barGraphsDiv4 = new Div();
        barGraphsDiv1.setDisplay(Displays.Flex);
        barGraphsDiv2.setDisplay(Displays.Flex);
        barGraphsDiv3.setDisplay(Displays.Flex);
        barGraphsDiv4.setDisplay(Displays.Flex);

        barGraphsDiv1.add(getSingleCategoryBarGraph());
        barGraphsDiv1.add(getMultipleCategoryBarGraph());
        barGraphsDiv1.add(getMultipleCategoryVerticleBarGraph());
        barGraphsDiv2.add(getStackedGraph());
        barGraphsDiv2.add(getStackedGraphHorizontal());
        barGraphsDiv3.add(getBarChartNegativeLabels());
        barGraphsDiv3.add(getBarChartNegativeLabelsHorizontal());

        barGraphsDiv4.add(getWaterfallBar());
        barGraphsDiv4.add(getWaterfallBarNegativeColours());
        barGraphsDiv4.add(getWaterfallBarStackDisabled());

        add(barGraphsDiv1);
        add(barGraphsDiv2);
        add(barGraphsDiv3);
        add(barGraphsDiv4);
    }

    private JQPlotBarGraph getSingleCategoryBarGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("1D Bar Graph Vary By Colour");
        graph.getOptions().setAnimate(Boolean.TRUE);
        JQPlotSeriesBarOptions barOptions = (JQPlotSeriesBarOptions) graph.getOptions().getSeriesDefaults().getRendererOptions();
        barOptions.setVaryBarColor(true);

        graph.setWidth(460);

        graph.addBar(new JQPlotBar("A", 12.0));
        graph.addBar(new JQPlotBar("B", 14.0));
        graph.addBar(new JQPlotBar("C", 36.0));
        graph.addBar(new JQPlotBar("D", 94.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getMultipleCategoryBarGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("2D Bar Graph");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.setWidth(460);

        graph.addBar(new JQPlotBar("Cat 1", 12.0));
        graph.addBar(new JQPlotBar("Cat 1", 94.0));
        graph.addBar(new JQPlotBar("Cat 1", 65.0));
        graph.addBar(new JQPlotBar("Cat 1", 46.0));

        graph.addBar(new JQPlotBar("Cat 2", 14.0));
        graph.addBar(new JQPlotBar("Cat 2", 36.0));
        graph.addBar(new JQPlotBar("Cat 2", 96.0));
        graph.addBar(new JQPlotBar("Cat 2", 107.0));

        graph.addBar(new JQPlotBar("Cat 3", 17.0));
        graph.addBar(new JQPlotBar("Cat 3", 33.0));
        graph.addBar(new JQPlotBar("Cat 3", 8.0));
        graph.addBar(new JQPlotBar("Cat 3", 26.0));

        graph.addBar(new JQPlotBar("Cat 4", 11.0));
        graph.addBar(new JQPlotBar("Cat 4", 52.0));
        graph.addBar(new JQPlotBar("Cat 4", 78.0));
        graph.addBar(new JQPlotBar("Cat 4", 69.0));

        //graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getMultipleCategoryVerticleBarGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.setOrientation(Orientation.HORIZONTAL);
        graph.getOptions().getTitle().setText("2D Bar Graph Horizontal");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.setWidth(460);

        graph.addBar(new JQPlotBar("Cat 1", 12.0));
        graph.addBar(new JQPlotBar("Cat 1", 94.0));
        graph.addBar(new JQPlotBar("Cat 1", 65.0));

        graph.addBar(new JQPlotBar("Cat 2", 14.0));
        graph.addBar(new JQPlotBar("Cat 2", 36.0));
        graph.addBar(new JQPlotBar("Cat 2", 96.0));

        graph.addBar(new JQPlotBar("Cat 3", 17.0));
        graph.addBar(new JQPlotBar("Cat 3", 33.0));
        graph.addBar(new JQPlotBar("Cat 3", 8.0));

        graph.addBar(new JQPlotBar("Cat 4", 11.0));
        graph.addBar(new JQPlotBar("Cat 4", 52.0));
        graph.addBar(new JQPlotBar("Cat 4", 78.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getStackedGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("Stacked Graph");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getOptions().setStackSeries(true);

        graph.setWidth(460);

        graph.addBar(new JQPlotBar("Cat 1", 12.0));
        graph.addBar(new JQPlotBar("Cat 1", 94.0));
        graph.addBar(new JQPlotBar("Cat 1", 65.0));

        graph.addBar(new JQPlotBar("Cat 2", 14.0));
        graph.addBar(new JQPlotBar("Cat 2", 36.0));
        graph.addBar(new JQPlotBar("Cat 2", 96.0));

        graph.addBar(new JQPlotBar("Cat 3", 17.0));
        graph.addBar(new JQPlotBar("Cat 3", 33.0));
        graph.addBar(new JQPlotBar("Cat 3", 8.0));

        graph.addBar(new JQPlotBar("Cat 4", 11.0));
        graph.addBar(new JQPlotBar("Cat 4", 52.0));
        graph.addBar(new JQPlotBar("Cat 4", 78.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getStackedGraphHorizontal()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.setOrientation(Orientation.HORIZONTAL);
        graph.getOptions().getTitle().setText("Stacked Graph Horizontal");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getOptions().setStackSeries(true);

        graph.setWidth(460);

        graph.addBar(new JQPlotBar("Cat 1", 12.0));
        graph.addBar(new JQPlotBar("Cat 1", 94.0));
        graph.addBar(new JQPlotBar("Cat 1", 65.0));

        graph.addBar(new JQPlotBar("Cat 2", 14.0));
        graph.addBar(new JQPlotBar("Cat 2", 36.0));
        graph.addBar(new JQPlotBar("Cat 2", 96.0));

        graph.addBar(new JQPlotBar("Cat 3", 17.0));
        graph.addBar(new JQPlotBar("Cat 3", 33.0));
        graph.addBar(new JQPlotBar("Cat 3", 8.0));

        graph.addBar(new JQPlotBar("Cat 4", 11.0));
        graph.addBar(new JQPlotBar("Cat 4", 52.0));
        graph.addBar(new JQPlotBar("Cat 4", 78.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getBarChartNegativeLabels()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("Negative Labels Display (Auto Change)");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.setWidth(460);

        graph.addBar(new JQPlotBar("Cat 1", 12.0));
        graph.addBar(new JQPlotBar("Cat 1", -17.0));
        graph.addBar(new JQPlotBar("Cat 1", 65.0));

        graph.addBar(new JQPlotBar("Cat 2", 14.0));
        graph.addBar(new JQPlotBar("Cat 2", -39.0));
        graph.addBar(new JQPlotBar("Cat 2", 96.0));

        graph.addBar(new JQPlotBar("Cat 3", 17.0));
        graph.addBar(new JQPlotBar("Cat 3", 33.0));
        graph.addBar(new JQPlotBar("Cat 3", 8.0));

        graph.addBar(new JQPlotBar("Cat 4", 11.0));
        graph.addBar(new JQPlotBar("Cat 4", -18.0));
        graph.addBar(new JQPlotBar("Cat 4", 78.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getBarChartNegativeLabelsHorizontal()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.setOrientation(Orientation.HORIZONTAL);
        graph.getOptions().getTitle().setText("Negative Labels Display (Auto Change) Horizontal");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.setWidth(460);

        graph.addBar(new JQPlotBar("Cat 1", 12.0));
        graph.addBar(new JQPlotBar("Cat 1", -17.0));
        graph.addBar(new JQPlotBar("Cat 1", 65.0));

        graph.addBar(new JQPlotBar("Cat 2", 14.0));
        graph.addBar(new JQPlotBar("Cat 2", -39.0));
        graph.addBar(new JQPlotBar("Cat 2", 96.0));

        graph.addBar(new JQPlotBar("Cat 3", 17.0));
        graph.addBar(new JQPlotBar("Cat 3", 33.0));
        graph.addBar(new JQPlotBar("Cat 3", 8.0));

        graph.addBar(new JQPlotBar("Cat 4", 11.0));
        graph.addBar(new JQPlotBar("Cat 4", -18.0));
        graph.addBar(new JQPlotBar("Cat 4", 78.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    private JQPlotBarGraph getWaterfallBar()
    {
        JQPlotBarWaterFallGraph graph = new JQPlotBarWaterFallGraph(Orientation.VERTICAL);
        graph.getOptions().getTitle().setText("Waterfall Chart");
        graph.getOptions().setAnimate(Boolean.TRUE);

        graph.getOptions().getAxes().getY2Axis().setMin(0);
        graph.getOptions().getAxes().getY2Axis().setTickInterval(5);

        graph.setWidth(460);

        graph.addBar("2008", 14.0);
        graph.addBar("Apricots", 3.0);
        graph.addBar("Peanuts", 3);
        graph.addBar("Tomatoes", -10);
        graph.addBar("Potatoes", 5);
        graph.addBar("Rhubarb", 2);
        graph.addBar("Squash", -3);
        graph.addBar("Grapes", -7);

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        JQPlotTickOptionsCanvasAxisTick tickSettings = new JQPlotTickOptionsCanvasAxisTick(graph);
        graph.getOptions().getAxes().getxAxis().setTickRendererOptions(tickSettings);

        tickSettings.setAngle(-90);
        tickSettings.setFontSize(10);
        tickSettings.setShowMark(false);
        tickSettings.setShowGridline(false);

        return graph;
    }

    private JQPlotBarGraph getWaterfallBarNegativeColours()
    {
        JQPlotBarWaterFallGraph graph = new JQPlotBarWaterFallGraph(Orientation.VERTICAL);
        graph.getOptions().getTitle().setText("Waterfall Chart with Negative Colours");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getBarGraphOptions().setUseNegativeColors(true);
        graph.getBarGraphOptions().setVaryBarColor(false);
        graph.getOptions().getSeriesColours().add("#876fde");

        graph.getOptions().getAxes().getY2Axis().setMin(0);
        graph.getOptions().getAxes().getY2Axis().setTickInterval(5);

        graph.setWidth(460);

        graph.addBar("2008", 14.0);
        graph.addBar("Apricots", 3.0);
        graph.addBar("Peanuts", 3);
        graph.addBar("Tomatoes", -10);
        graph.addBar("Potatoes", 5);
        graph.addBar("Rhubarb", 2);
        graph.addBar("Squash", -3);
        graph.addBar("Grapes", -7);

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        JQPlotTickOptionsCanvasAxisTick tickSettings = new JQPlotTickOptionsCanvasAxisTick(graph);
        graph.getOptions().getAxes().getxAxis().setTickRendererOptions(tickSettings);

        tickSettings.setAngle(-45);
        tickSettings.setFontSize(10);
        tickSettings.setShowMark(false);
        tickSettings.setShowGridline(false);

        return graph;
    }

    private JQPlotBarGraph getWaterfallBarStackDisabled()
    {
        JQPlotBarWaterFallGraph graph = new JQPlotBarWaterFallGraph(Orientation.VERTICAL);
        graph.getOptions().getTitle().setText("Waterfall Chart Stack Disabled");
        graph.getOptions().setAnimate(Boolean.TRUE);

        graph.getOptions().getSeriesDefaults().setFillToZero(true);
        graph.getOptions().getSeriesDefaults().setFill(true);
        graph.getBarGraphOptions().setDisableStack(true);

        graph.setWidth(460);

        graph.addBar("2008", 14.0);
        graph.addBar("Apricots", 4.0);
        graph.addBar("Peanuts", 3);
        graph.addBar("Tomatoes", -23);
        graph.addBar("Potatoes", 5);
        graph.addBar("Rhubarb", 2);
        graph.addBar("Squash", -3);
        graph.addBar("Grapes", -7);

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        JQPlotTickOptionsCanvasAxisTick tickSettings = new JQPlotTickOptionsCanvasAxisTick(graph);
        graph.getOptions().getAxes().getxAxis().setTickRendererOptions(tickSettings);

        tickSettings.setAngle(-90);
        tickSettings.setFontSize(10);
        tickSettings.setShowMark(false);
        tickSettings.setShowGridline(false);

        return graph;
    }

    private JQPlotBarGraph getNewGraph()
    {
        JQPlotBarGraph graph = new JQPlotBarGraph(Orientation.VERTICAL);
        //graph.setID("id");

        return graph;
    }

}
