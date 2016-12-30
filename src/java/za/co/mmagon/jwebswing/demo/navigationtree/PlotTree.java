package za.co.mmagon.jwebswing.demo.navigationtree;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeItem;
import za.co.mmagon.jwebswing.demo.DemoApplicationScreens;
import za.co.mmagon.jwebswing.demo.components.DemoTree;
import za.co.mmagon.jwebswing.demo.screens.MenuTreeItem;

/**
 *
 * @author GedMarc
 * @since 2015/12/14
 */
public class PlotTree extends DemoTree
{

    private static final long serialVersionUID = 1L;

    public PlotTree()
    {
        ArrayList<JQXTreeItem> plotList = addList("JQ Plot Library", "images/jqplot/reports.png");
        plotList.add(new MenuTreeItem("Bar Graphs", DemoApplicationScreens.BarGraphDemo, "images/the-graph-icons/"));
        plotList.add(new MenuTreeItem("Line Graphs", DemoApplicationScreens.LineGraphDemo, "images/jqplot/linegraph.png"));
        plotList.add(new MenuTreeItem("Area Graphs", DemoApplicationScreens.TestScreen, "images/graph_icons/area/area.png"));
        plotList.add(new MenuTreeItem("Combination Graphs", DemoApplicationScreens.TestScreen, "images/graph_icons/Parallel various 1 32.png"));
        plotList.add(new MenuTreeItem("Bubble Graphs", DemoApplicationScreens.BubbleGraphDemo, "images/graph_icons/Parallel various 1 32.png"));
        plotList.add(new MenuTreeItem("Pie Graphs", DemoApplicationScreens.PieGraphDemo, "images/graph_icons/Pie 4/pie 4 32.png"));
        plotList.add(new MenuTreeItem("Donut Graphs", DemoApplicationScreens.DonutGraphDemo, "images/graph_icons/Parallel various 1 32.png"));
        plotList.add(new MenuTreeItem("Waterfall Graphs", DemoApplicationScreens.WaterfallGraphDemo, "images/graph_icons/Parallel various 1/Parallel various 1 32.png"));
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
