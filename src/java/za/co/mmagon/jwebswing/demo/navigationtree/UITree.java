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
public class UITree extends DemoTree
{

    public UITree()
    {
        ArrayList<JQXTreeItem> gettingStarted = addList("JQuery UI");
        gettingStarted.add(new MenuTreeItem("Draggable", DemoApplicationScreens.UIDraggable));
        gettingStarted.add(new MenuTreeItem("Droppable", DemoApplicationScreens.UIDroppable));
        gettingStarted.add(new MenuTreeItem("Resizable", DemoApplicationScreens.ComingSoon));
        gettingStarted.add(new MenuTreeItem("Selectable", DemoApplicationScreens.ComingSoon));
        gettingStarted.add(new MenuTreeItem("Sortable", DemoApplicationScreens.ComingSoon));

        ArrayList<JQXTreeItem> eventsList = addList("JQuery UI Widgets");
        eventsList.add(new MenuTreeItem("Accordion", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Auto Complete", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Button", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Date Picker", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Dialog", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Menu", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Progress Bar", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Select Menu", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Slider", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("Spinner", DemoApplicationScreens.UISpinner));
        eventsList.add(new MenuTreeItem("Tabs", DemoApplicationScreens.ComingSoon));
        eventsList.add(new MenuTreeItem("ToolTip", DemoApplicationScreens.ComingSoon));

    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
