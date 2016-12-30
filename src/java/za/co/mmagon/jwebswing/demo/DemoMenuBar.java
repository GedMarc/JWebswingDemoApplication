package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;
import za.co.mmagon.jwebswing.components.jqueryui.menu.JQUIMenu;
import za.co.mmagon.jwebswing.demo.components.DemoMenuBarList;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DemoMenuBar extends JQUIMenu
{

    private static final long serialVersionUID = 1L;
    private DemoMenuBarList fileList = new DemoMenuBarList();

    public DemoMenuBar()
    {
        super(Orientation.HORIZONTAL);
        //add(fileList);
        //fileList.add(new DemoMenuBarItem("Item"));
    }
}
