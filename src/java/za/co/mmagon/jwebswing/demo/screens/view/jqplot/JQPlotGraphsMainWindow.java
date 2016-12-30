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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotBarGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotBarWaterFallGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotBubbleGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotDonutGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotLineGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.JQPlotPieGraph;
import za.co.mmagon.jwebswing.components.jqplot.graphs.display.JQPlotBar;
import za.co.mmagon.jwebswing.components.jqplot.graphs.display.JQPlotBubble;
import za.co.mmagon.jwebswing.components.jqplot.graphs.display.JQPlotLine;
import za.co.mmagon.jwebswing.components.jqplot.options.JQPlotMarkerOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.JQPlotSeriesOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.axis.JQPlotAxisDateRendererOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.axis.JQPlotAxisLabelRendererOptionsCanvasLabels;
import za.co.mmagon.jwebswing.components.jqplot.options.legends.JQPlotLegendRendererEnhancedOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.legends.JQPlotLegendRendererPieEnhancedOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.series.JQPlotSeriesBarOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.series.JQPlotSeriesDonutOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.series.JQPlotSeriesLineOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.series.JQPlotSeriesPieOptions;
import za.co.mmagon.jwebswing.components.jqplot.options.ticks.JQPlotTickOptionsCanvasAxisTick;
import za.co.mmagon.jwebswing.components.jqplot.parts.MarkerStyles;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.generics.CompassPoints;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourHex;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourNames;
import za.co.mmagon.jwebswing.htmlbuilder.css.fonts.FontFamilies;

/**
 *
 * @author GedMarc
 * @since 03 Apr 2016
 */
public class JQPlotGraphsMainWindow extends MainWindowDisplay
{

    public JQPlotGraphsMainWindow()
    {
    }

    protected JQPlotBarGraph getSingleCategoryBarGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("1-D Bar Graph Vary By Colour");
        graph.getOptions().setAnimate(Boolean.TRUE);
        JQPlotSeriesBarOptions barOptions = (JQPlotSeriesBarOptions) graph.getOptions().getSeriesDefaults().getRendererOptions();
        barOptions.setVaryBarColor(true);

        graph.getOptions().getHighlighter().setShowMarker(true);
        graph.getOptions().getHighlighter().setShowTooltip(false);

        graph.getCss().getDimensions().setWidth(460);

        graph.addBar(new JQPlotBar("A", 12.0));
        graph.addBar(new JQPlotBar("B", 14.0));
        graph.addBar(new JQPlotBar("C", 36.0));
        graph.addBar(new JQPlotBar("D", 94.0));

        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    protected JQPlotBarGraph getMultipleCategoryBarGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("2D Bar Graph");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getMultipleCategoryVerticleBarGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.setOrientation(Orientation.HORIZONTAL);
        graph.getOptions().getTitle().setText("2D Bar Graph Horizontal");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getStackedGraph()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("Stacked Graph");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getOptions().setStackSeries(true);

        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getStackedGraphHorizontal()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.setOrientation(Orientation.HORIZONTAL);
        graph.getOptions().getTitle().setText("Stacked Graph Horizontal");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getOptions().setStackSeries(true);

        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getBarChartNegativeLabels()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.getOptions().getTitle().setText("Negative Labels Display (Auto Change)");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getBarChartNegativeLabelsHorizontal()
    {
        JQPlotBarGraph graph = getNewGraph();
        graph.setOrientation(Orientation.HORIZONTAL);
        graph.getOptions().getTitle().setText("Negative Labels Display (Auto Change) Horizontal");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getWaterfallBar()
    {
        JQPlotBarWaterFallGraph graph = new JQPlotBarWaterFallGraph(Orientation.VERTICAL);
        graph.getOptions().getTitle().setText("Waterfall Chart");
        graph.getOptions().setAnimate(Boolean.TRUE);

        graph.getOptions().getAxes().getY2Axis().setMin(0);
        graph.getOptions().getAxes().getY2Axis().setTickInterval(5);

        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getWaterfallBarNegativeColours()
    {
        JQPlotBarWaterFallGraph graph = new JQPlotBarWaterFallGraph(Orientation.VERTICAL);
        graph.getOptions().getTitle().setText("Waterfall Chart with Negative Colours");
        graph.getOptions().setAnimate(Boolean.TRUE);
        graph.getBarGraphOptions().setUseNegativeColors(true);
        graph.getBarGraphOptions().setVaryBarColor(false);
        graph.getOptions().getSeriesColours().add("#876fde");

        graph.getOptions().getAxes().getY2Axis().setMin(0);
        graph.getOptions().getAxes().getY2Axis().setTickInterval(5);

        graph.getCss().getDimensions().setWidth(460);

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

    protected JQPlotBarGraph getWaterfallBarStackDisabled()
    {
        JQPlotBarWaterFallGraph graph = new JQPlotBarWaterFallGraph(Orientation.VERTICAL);
        graph.getOptions().getTitle().setText("Waterfall Chart Stack Disabled");
        graph.getOptions().setAnimate(Boolean.TRUE);

        graph.getOptions().getSeriesDefaults().setFillToZero(true);
        graph.getOptions().getSeriesDefaults().setFill(true);
        graph.getBarGraphOptions().setDisableStack(true);

        graph.getCss().getDimensions().setWidth(460);

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

    ArrayList<JQPlotBubble> bubbles = new ArrayList<>();


    {
        bubbles.add(new JQPlotBubble(11, 123, 1236, "Acura"));
        bubbles.add(new JQPlotBubble(45, 92, 1067, "Alfa Romeo"));
        bubbles.add(new JQPlotBubble(24, 114, 1176, "AM General"));
        bubbles.add(new JQPlotBubble(53, 23, 610, "Aston Martin Lagonda"));
        bubbles.add(new JQPlotBubble(18, 17, 539, "Audi"));
        bubbles.add(new JQPlotBubble(7, 89, 564, "BMW"));
        bubbles.add(new JQPlotBubble(2, 13, 1026, "Bugatti"));
    }

    protected JQPlotBubbleGraph getBubbleGraph()
    {
        JQPlotBubbleGraph graph = new JQPlotBubbleGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Bubble Graph");
        graph.setBubbles(bubbles);

        graph.getBubbleOptions().setBubbleAlpha(0.6);
        graph.getBubbleOptions().setHighlightAlpha(0.8);
        graph.getBubbleOptions().setShowLabels(true);
        graph.getOptions().getSeriesDefaults().setShadow(true);
        graph.getOptions().getSeriesDefaults().setShadowAlpha(0.05);
        return graph;
    }

    protected JQPlotBubbleGraph getBubbleGraphTransparency()
    {
        JQPlotBubbleGraph graph = new JQPlotBubbleGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Bubble Graph Transparency");
        graph.setBubbles(bubbles);

        graph.getBubbleOptions().setBubbleAlpha(0.6);
        graph.getBubbleOptions().setHighlightAlpha(0.8);
        graph.getBubbleOptions().setShowLabels(true);
        graph.getOptions().getSeriesDefaults().setShadow(true);
        graph.getOptions().getSeriesDefaults().setShadowAlpha(0.05);
        return graph;
    }

    protected JQPlotBubbleGraph getBubbleGraphGradients()
    {
        JQPlotBubbleGraph graph = new JQPlotBubbleGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Bubble Graph Gradients");
        graph.setBubbles(bubbles);
        graph.getBubbleOptions().setBubbleGradients(true);

        graph.getBubbleOptions().setBubbleAlpha(0.6);
        graph.getBubbleOptions().setHighlightAlpha(0.8);
        graph.getBubbleOptions().setShowLabels(true);
        graph.getOptions().getSeriesDefaults().setShadow(true);
        graph.getOptions().getSeriesDefaults().setShadowAlpha(0.05);
        return graph;
    }

    protected JQPlotLineGraph getLineGraph()
    {
        JQPlotLineGraph graph = new JQPlotLineGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Line Graph");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
        double line[] = new double[]
        {
            3, 7, 9, 1, 5, 3, 8, 2, 5
        };
        graph.addLine(true, line);
        graph.getCss().getDimensions().setWidth(460);
        return graph;
    }

    protected JQPlotLineGraph getLineGraphPlotWithOptions()
    {
        JQPlotLineGraph graph = new JQPlotLineGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Line Graph Plot with Options");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
        double line[] = new double[]
        {
            3, 7, 9, 1, 5, 3, 8, 2, 5
        };
        graph.addLine(true, line);
        graph.getCss().getDimensions().setWidth(460);

        //Allow verticle label for Y by default
        JQPlotAxisLabelRendererOptionsCanvasLabels axisDefaultLabels = new JQPlotAxisLabelRendererOptionsCanvasLabels(graph);
        graph.getOptions().getAxesDefaults().setLabelRendererOptions(axisDefaultLabels);
        graph.getOptions().getAxesDefaults().getLabelRendererOptions();

        JQPlotSeriesLineOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSmooth(true);
        //Add the labels
        graph.getOptions().getAxes().getxAxis().setLabel("X Axis");
        graph.getOptions().getAxes().getxAxis().setPad(0.0);
        graph.getOptions().getAxes().getyAxis().setLabel("Y Axis");

        return graph;
    }

    protected JQPlotLineGraph getLineGraphStyleOptions()
    {
        JQPlotLineGraph graph = new JQPlotLineGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Line Graph Style Options");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);

        int numOfPoints = 9;

        double linePattern2[] = new double[]
        {
            39, 31, 32, 33, 34, 36, 32, 36, 39
        };
        double linePattern3[] = new double[]
        {
            27, 24, 29, 23, 24, 21, 26, 27, 24
        };
        double linePattern1[] = new double[]
        {
            13, 17, 19, 11, 15, 13, 18, 12, 15
        };
        //graph.addLine(true, line);
        graph.getCss().getDimensions().setWidth(460);

        double cosPoints[] = new double[]
        {
            0, 5, 2, 9, 7, 6, 3, 7, 5
        };
        double sinPoints[] = new double[]
        {
            -13, -17, -19, -11, -15, -13, -18, -12, -15
        };
        double powPoints1[] = new double[]
        {
            -27, -24, -29, -23, -24, -21, -26, -27, -24
        };
        double powPoints2[] = new double[]
        {
            -39, -31, -36, -33, -34, -36, -32, -36, -39
        };

        graph.addLine(true, cosPoints);
        graph.addLine(true, sinPoints);
        graph.addLine(true, powPoints1);
        graph.addLine(true, powPoints2);

        graph.addLine(true, linePattern1);
        graph.addLine(true, linePattern2);
        graph.addLine(true, linePattern3);

        //Configure each series
        JQPlotSeriesOptions line1 = new JQPlotSeriesOptions(graph);
        line1.setLineWidth(2.0);
        JQPlotMarkerOptions.class.cast(line1.getMarkerRendererOptions()).setStyle(MarkerStyles.Diamond);
        JQPlotMarkerOptions.class.cast(line1.getMarkerRendererOptions()).setColor(new ColourHex(ColourNames.Pink));

        JQPlotSeriesOptions line2 = new JQPlotSeriesOptions(graph);
        line2.setShowLine(false);
        JQPlotMarkerOptions.class.cast(line2.getMarkerRendererOptions()).setStyle(MarkerStyles.X);

        JQPlotSeriesOptions line3 = new JQPlotSeriesOptions(graph);
        JQPlotMarkerOptions.class.cast(line3.getMarkerRendererOptions()).setStyle(MarkerStyles.Circle);

        JQPlotSeriesOptions line4 = new JQPlotSeriesOptions(graph);
        line4.setLineWidth(5.0);
        JQPlotMarkerOptions.class.cast(line4.getMarkerRendererOptions()).setStyle(MarkerStyles.FilledSquare);
        JQPlotMarkerOptions.class.cast(line4.getMarkerRendererOptions()).setSize(10);

        JQPlotSeriesOptions line5 = new JQPlotSeriesOptions(graph);
        line5.setLinePattern("dashed");
        line5.setShowMarker(false);
        JQPlotSeriesOptions line6 = new JQPlotSeriesOptions(graph);
        line6.setLinePattern("dotted");
        line6.setShowMarker(false);
        JQPlotSeriesOptions line7 = new JQPlotSeriesOptions(graph);
        line7.setLinePattern("...-");
        line7.setShowMarker(false);

        graph.getOptions().getSeries().add(line1); //Allow verticle label for Y by default
        graph.getOptions().getSeries().add(line2); //Allow verticle label for Y by default
        graph.getOptions().getSeries().add(line3); //Allow verticle label for Y by default
        graph.getOptions().getSeries().add(line4); //Allow verticle label for Y by default
        graph.getOptions().getSeries().add(line5); //Allow verticle label for Y by default
        graph.getOptions().getSeries().add(line6); //Allow verticle label for Y by default
        graph.getOptions().getSeries().add(line7); //Allow verticle label for Y by default

        JQPlotSeriesLineOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSmooth(true);

        return graph;
    }

    protected JQPlotLineGraph getLegend()
    {
        JQPlotLineGraph graph = new JQPlotLineGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Legend on East Outside Grid");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(true);
        graph.getOptions().getHighlighter().setShow(true);
        graph.getOptions().getLegendOptions().setShow(true);
        graph.getOptions().getLegendOptions().setPlacement("outsideGrid");
        graph.getOptions().getLegendOptions().setLocation(CompassPoints.E);
        //JQPlotLegendRendererEnhancedOptions.class.cast(graph.getOptions().getLegendOptions().getRendererOptions()).setSeriesToggle(true);
        //JQPlotLegendRendererEnhancedOptions.class.cast(graph.getOptions().getLegendOptions().getRendererOptions()).setSeriesToggleReplot(true);

        double linePattern2[] = new double[]
        {
            39, 31, 32, 33, 34, 36, 32, 36, 39
        };
        double linePattern3[] = new double[]
        {
            27, 24, 29, 23, 24, 21, 26, 27, 24
        };
        double linePattern1[] = new double[]
        {
            13, 17, 19, 11, 15, 13, 18, 12, 15
        };
        //graph.addLine(true, line);
        graph.getCss().getDimensions().setWidth(650);
        graph.getCss().getDimensions().setHeight(330);

        double cosPoints[] = new double[]
        {
            0, 5, 2, 9, 7, 6, 3, 7, 5
        };
        double sinPoints[] = new double[]
        {
            -13, -17, -19, -11, -15, -13, -18, -12, -15
        };
        double powPoints1[] = new double[]
        {
            -27, -24, -29, -23, -24, -21, -26, -27, -24
        };
        double powPoints2[] = new double[]
        {
            -39, -31, -36, -33, -34, -36, -32, -36, -39
        };

        graph.addLine(true, cosPoints);
        graph.addLine(true, sinPoints);
        graph.addLine(true, powPoints1);
        graph.addLine(true, powPoints2);

        graph.addLine(true, linePattern1);
        graph.addLine(true, linePattern2);
        graph.addLine(true, linePattern3);

        //Configure each series
        JQPlotSeriesOptions line1 = new JQPlotSeriesOptions(graph);
        line1.setLineWidth(2.0);
        JQPlotMarkerOptions.class.cast(line1.getMarkerRendererOptions()).setStyle(MarkerStyles.Diamond);
        JQPlotMarkerOptions.class.cast(line1.getMarkerRendererOptions()).setColor(new ColourHex(ColourNames.Pink));

        JQPlotSeriesOptions line2 = new JQPlotSeriesOptions(graph);
        line2.setShowLine(false);
        JQPlotMarkerOptions.class.cast(line2.getMarkerRendererOptions()).setStyle(MarkerStyles.X);

        JQPlotSeriesOptions line3 = new JQPlotSeriesOptions(graph);
        JQPlotMarkerOptions.class.cast(line3.getMarkerRendererOptions()).setStyle(MarkerStyles.Circle);

        JQPlotSeriesOptions line4 = new JQPlotSeriesOptions(graph);
        line4.setLineWidth(5.0);
        JQPlotMarkerOptions.class.cast(line4.getMarkerRendererOptions()).setStyle(MarkerStyles.FilledSquare);
        JQPlotMarkerOptions.class.cast(line4.getMarkerRendererOptions()).setSize(10);

        JQPlotSeriesOptions line5 = new JQPlotSeriesOptions(graph);
        line5.setLinePattern("dashed");
        line5.setShowMarker(false);
        JQPlotSeriesOptions line6 = new JQPlotSeriesOptions(graph);
        line6.setLinePattern("dotted");
        line6.setShowMarker(false);
        JQPlotSeriesOptions line7 = new JQPlotSeriesOptions(graph);
        line7.setLinePattern("...-");
        line7.setShowMarker(false);

        graph.getOptions().getSeries().add(line1);
        graph.getOptions().getSeries().add(line2);
        graph.getOptions().getSeries().add(line3);
        graph.getOptions().getSeries().add(line4);
        graph.getOptions().getSeries().add(line5);
        graph.getOptions().getSeries().add(line6);
        graph.getOptions().getSeries().add(line7);

        JQPlotSeriesLineOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSmooth(true);

        return graph;
    }

    protected JQPlotLineGraph getLegendComplex()
    {
        JQPlotLineGraph graph = new JQPlotLineGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Enhanced Legend North Inside Grid");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
        graph.getOptions().getHighlighter().setShow(true);
        graph.getOptions().getLegendOptions().setShow(true);
        graph.getOptions().getLegendOptions().setFontFamily(FontFamilies.Arial);
        graph.getOptions().getLegendOptions().getLabels().add("Legend");
        graph.getOptions().getLegendOptions().getLabels().add("Labels");
        graph.getOptions().getLegendOptions().getLabels().add("Can");
        graph.getOptions().getLegendOptions().getLabels().add("<strong><i><u>really</u></i></strong>");
        graph.getOptions().getLegendOptions().getLabels().add("be");
        graph.getOptions().getLegendOptions().getLabels().add("anything");
        graph.getOptions().getLegendOptions().getLabels().add("<u>Or really long, really really long</u>");

        graph.getOptions().getLegendOptions().setPlacement("insideGrid");
        graph.getOptions().getLegendOptions().setLocation(CompassPoints.N);
        JQPlotLegendRendererEnhancedOptions.class.cast(graph.getOptions().getLegendOptions().getRendererOptions()).setNumberRows(1);
        //JQPlotLegendRendererEnhancedOptions.class.cast(graph.getOptions().getLegendOptions().getRendererOptions()).setSeriesToggle(true);
        //JQPlotLegendRendererEnhancedOptions.class.cast(graph.getOptions().getLegendOptions().getRendererOptions()).setSeriesToggleReplot(true);

        double linePattern2[] = new double[]
        {
            39, 31, 32, 33, 34, 36, 32, 36, 39
        };
        double linePattern3[] = new double[]
        {
            27, 24, 29, 23, 24, 21, 26, 27, 24
        };
        double linePattern1[] = new double[]
        {
            13, 17, 19, 11, 15, 13, 18, 12, 15
        };
        //graph.addLine(true, line);
        graph.getCss().getDimensions().setWidth(650);
        graph.getCss().getDimensions().setHeight(330);

        double cosPoints[] = new double[]
        {
            0, 5, 2, 9, 7, 6, 3, 7, 5
        };
        double sinPoints[] = new double[]
        {
            -13, -17, -19, -11, -15, -13, -18, -12, -15
        };
        double powPoints1[] = new double[]
        {
            -27, -24, -29, -23, -24, -21, -26, -27, -24
        };
        double powPoints2[] = new double[]
        {
            -39, -31, -36, -33, -34, -36, -32, -36, -39
        };

        graph.addLine(true, cosPoints);
        graph.addLine(true, sinPoints);
        graph.addLine(true, powPoints1);
        graph.addLine(true, powPoints2);

        graph.addLine(true, linePattern1);
        graph.addLine(true, linePattern2);
        graph.addLine(true, linePattern3);

        //Configure each series
        JQPlotSeriesOptions line1 = new JQPlotSeriesOptions(graph);
        line1.setLineWidth(2.0);
        JQPlotMarkerOptions.class.cast(line1.getMarkerRendererOptions()).setStyle(MarkerStyles.Diamond);
        JQPlotMarkerOptions.class.cast(line1.getMarkerRendererOptions()).setColor(new ColourHex(ColourNames.Pink));

        JQPlotSeriesOptions line2 = new JQPlotSeriesOptions(graph);
        line2.setShowLine(false);
        JQPlotMarkerOptions.class.cast(line2.getMarkerRendererOptions()).setStyle(MarkerStyles.X);

        JQPlotSeriesOptions line3 = new JQPlotSeriesOptions(graph);
        JQPlotMarkerOptions.class.cast(line3.getMarkerRendererOptions()).setStyle(MarkerStyles.Circle);

        JQPlotSeriesOptions line4 = new JQPlotSeriesOptions(graph);
        line4.setLineWidth(5.0);
        JQPlotMarkerOptions.class.cast(line4.getMarkerRendererOptions()).setStyle(MarkerStyles.FilledSquare);
        JQPlotMarkerOptions.class.cast(line4.getMarkerRendererOptions()).setSize(10);

        JQPlotSeriesOptions line5 = new JQPlotSeriesOptions(graph);
        line5.setLinePattern("dashed");
        line5.setShowMarker(false);
        JQPlotSeriesOptions line6 = new JQPlotSeriesOptions(graph);
        line6.setLinePattern("dotted");
        line6.setShowMarker(false);
        JQPlotSeriesOptions line7 = new JQPlotSeriesOptions(graph);
        line7.setLinePattern("...-");
        line7.setShowMarker(false);

        graph.getOptions().getSeries().add(line1);
        graph.getOptions().getSeries().add(line2);
        graph.getOptions().getSeries().add(line3);
        graph.getOptions().getSeries().add(line4);
        graph.getOptions().getSeries().add(line5);
        graph.getOptions().getSeries().add(line6);
        graph.getOptions().getSeries().add(line7);

        JQPlotSeriesLineOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSmooth(true);

        return graph;
    }

    protected JQPlotLineGraph getDateAxisGraph()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        try
        {
            JQPlotLineGraph graph = new JQPlotLineGraph();
            graph.getOptions().setAnimate(true);
            graph.getOptions().getTitle().setText("Date Axis Graph Canvas Axis ");
            graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
            graph.getOptions().getHighlighter().setShow(true);
            Object[] line = new Object[]
            {
                sdf.parse("2016/01/01"), 7,
                sdf.parse("2016/01/02"), 1,
                sdf.parse("2016/01/03"), 3,
                sdf.parse("2016/01/04"), 2,
                sdf.parse("2016/01/05"), 6,
                sdf.parse("2016/01/06"), 11,
                sdf.parse("2016/01/07"), 9,
                sdf.parse("2016/01/08"), 5,
                sdf.parse("2016/01/09"), 2,
                sdf.parse("2016/01/10"), 6,
                sdf.parse("2016/01/11"), 8,
            };

            graph.addLine(JQPlotLine.buildLineFromArray(line));
            graph.getOptions().getAxes().getxAxis().setTickRendererOptions(new JQPlotTickOptionsCanvasAxisTick(graph));
            JQPlotTickOptionsCanvasAxisTick.class.cast(graph.getOptions().getAxes().getxAxis().getTickRendererOptions()).setFormatString("%Y-%m-%d");
            JQPlotTickOptionsCanvasAxisTick.class.cast(graph.getOptions().getAxes().getxAxis().getTickRendererOptions()).setAngle(-15);
            graph.getOptions().getAxes().getxAxis().setRendererOptions(new JQPlotAxisDateRendererOptions(graph));
            JQPlotAxisDateRendererOptions.class.cast(graph.getOptions().getAxes().getxAxis().getRendererOptions()).setDrawBaseline(true);
            graph.getCss().getDimensions().setWidth(460);
            //graph.renderJavascripts(0);

            return graph;
        }
        catch (ParseException ex)
        {
            ex.printStackTrace();
        }
        return null;
    } 

    protected JQPlotPieGraph getPieGraph()
    {
        JQPlotPieGraph graph = new JQPlotPieGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Pie Graph");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
        JQPlotSeriesPieOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setHighlightMouseDown(true);
        graph.getOptions().getHighlighter().setShow(true);
        double line[] = new double[]
        {
            7, 13.3, 14.7, 5.2, 1.2
        };
        graph.addSlices(line);
        graph.getCss().getDimensions().setWidth(460);
        return graph;
    }

    protected JQPlotPieGraph getPieGraphWithLegend()
    {
        JQPlotPieGraph graph = new JQPlotPieGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Pie Graph With Legend - No render on select");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(true);
        JQPlotSeriesPieOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setHighlightMouseOver(true);

        graph.getOptions().getLegendOptions().setShow(true);
        graph.getOptions().getLegendOptions().setPlacement("outside");
        graph.getOptions().getLegendOptions().setLocation(CompassPoints.S);
        graph.getOptions().getLegendOptions().setMarginTop(15);

        JQPlotLegendRendererPieEnhancedOptions opt;
        graph.getOptions().getLegendOptions().setRendererOptions(opt = new JQPlotLegendRendererPieEnhancedOptions(graph));
        opt.setNumberRows(1);

        double line[] = new double[]
        {
            7, 13.3, 14.7, 5.2, 1.2
        };
        graph.addSlices(line);
        graph.getCss().getDimensions().setWidth(460);

        graph.getOptions().getHighlighter().setShow(true);
        return graph;
    }

    protected JQPlotPieGraph getPieGraphSliceMargin()
    {
        JQPlotPieGraph graph = new JQPlotPieGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Pie Graph Slice Margin With Legend - Render");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(true);
        graph.getOptions().getSeriesDefaults().setShadow(false);

        JQPlotSeriesPieOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSliceMargin(4);
        JQPlotSeriesPieOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setShowDataLabels(true);
        JQPlotSeriesPieOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setHighlightMouseOver(true);

        graph.getOptions().getLegendOptions().setShow(true);
        graph.getOptions().getLegendOptions().setPlacement("outside");
        graph.getOptions().getLegendOptions().setLocation(CompassPoints.S);
        graph.getOptions().getLegendOptions().setMarginBottom(15);

        JQPlotLegendRendererPieEnhancedOptions opt;
        graph.getOptions().getLegendOptions().setRendererOptions(opt = new JQPlotLegendRendererPieEnhancedOptions(graph));
        opt.setNumberRows(1);

        double line[] = new double[]
        {
            7, 13.3, 14.7, 5.2, 1.2
        };
        graph.addSlices(line);
        graph.getCss().getDimensions().setWidth(460);

        graph.getOptions().getHighlighter().setShow(true);

        return graph;
    }

    protected JQPlotDonutGraph getDonutGraph()
    {
        JQPlotDonutGraph graph = new JQPlotDonutGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Donut Graph");
        graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
        //JQPlotSeriesDonutOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setHighlightMouseDown(true);
        JQPlotSeriesDonutOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSliceMargin(4);
        graph.getOptions().getHighlighter().setShow(true);
        double line[] = new double[]
        {
            7, 13.3, 14.7, 5.2, 1.2
        };
        double line2[] = new double[]
        {
            7, 12, 16, 19, 8
        };

        graph.addSlices(0, line);
        graph.addSlices(1, line2);
        graph.getCss().getDimensions().setWidth(460);
        return graph;
    }

    protected JQPlotDonutGraph getDonutGraphMultiple()
    {
        JQPlotDonutGraph graph = new JQPlotDonutGraph();
        graph.getOptions().setAnimate(true);
        graph.getOptions().getTitle().setText("Donut Graph Multiple Pie's");
        //graph.getOptions().getSeriesDefaults().getPointLabels().setShow(false);
        JQPlotSeriesDonutOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setSliceMargin(3);
        JQPlotSeriesDonutOptions.class.cast(graph.getOptions().getSeriesDefaults().getRendererOptions()).setShowDataLabels(true);
        graph.getOptions().getHighlighter().setShow(true);

        double line[] = new double[]
        {
            6, 8, 14, 20
        };
        double line2[] = new double[]
        {
            8, 12, 6, 9
        };
        double line3[] = new double[]
        {
            2, 11, 4, 19
        };

        graph.addSlices(0, line);
        graph.addSlices(1, line2);
        graph.addSlices(2, line3);
        graph.getCss().getDimensions().setWidth(460);
        return graph;
    }

    private JQPlotBarGraph getNewGraph()
    {
        JQPlotBarGraph graph = new JQPlotBarGraph(Orientation.VERTICAL);
        return graph;
    }
}
