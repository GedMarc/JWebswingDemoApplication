package za.co.mmagon.jwebswing.demo.navigationtree;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeItem;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeSelectEvent;
import za.co.mmagon.jwebswing.demo.DemoApplicationScreens;
import za.co.mmagon.jwebswing.demo.components.DemoTree;
import za.co.mmagon.jwebswing.demo.screens.MenuTreeItem;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourNames;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;

/**
 *
 * @author GedMarc
 * @since 2015/12/14
 */
public class HomeTree extends DemoTree
{

    public HomeTree()
    {
        setBackgroundColor$(ColourNames.Black);
        getNewTree().setBackgroundColor$(ColourNames.Black);

        ArrayList<JQXTreeItem> homeList = addList("Getting Started");
        //homeList.add(new MenuTreeItem("Test Screen", DemoApplicationScreens.TestScreen, "images/Home.ico"));
        homeList.add(new MenuTreeItem("Welcome To JWebSwing", DemoApplicationScreens.WelcomeScreen, "images/Home_1.ico"));
        homeList.add(new MenuTreeItem("Getting Started", DemoApplicationScreens.GettingStarted, "images/Info.ico"));
        homeList.add(new MenuTreeItem("Frameworks Reference", DemoApplicationScreens.FrameworksScreen, "images/Fulscreen.ico"));
        homeList.add(new MenuTreeItem("Component Interactions", DemoApplicationScreens.ComponentInteractions, "images/Forward.ico"));
        homeList.add(new MenuTreeItem("YouTube Guides", DemoApplicationScreens.YouTubeLinksScreen, "images/Downloads.ico"));

        setOverflow(Overflows.Hidden);
        //System.out.println("tree options : " + getNewTree().getOptions());
        getNewTree().setID("homeTree");

        getNewTree().addEvent(new JQXTreeSelectEvent(getNewTree())
        {
            

            @Override
            public void onSelect(AjaxCall ajaxObject, AjaxResponse ajaxReceiver)
            {
                DemoApplicationScreens screen = DemoApplicationScreens.valueOf(ajaxObject.getValue().getData());
                screen.getScreenToDisplay().setTouched(true);
                screen.getScreenToDisplay().setID("updateDiv");
                ajaxReceiver.addComponent(screen.getScreenToDisplay());
            }
        });
    }
}
