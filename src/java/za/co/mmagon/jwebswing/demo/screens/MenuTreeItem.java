package za.co.mmagon.jwebswing.demo.screens;

import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeItem;
import za.co.mmagon.jwebswing.demo.DemoApplicationScreens;

/**
 *
 * @author MMagon
 * @since 06 Mar 2013
 * @version 1.0
 */
public class MenuTreeItem extends JQXTreeItem
{

    private static final long serialVersionUID = 1L;

    public MenuTreeItem(String text, final DemoApplicationScreens newScreen)
    {
        setLabel(text);
        setValue(newScreen.name());
        setIcon("images/Go.ico");
    }

    public MenuTreeItem(String text, final DemoApplicationScreens newScreen, String imageUrl)
    {
        setLabel(text);
        setValue(newScreen.name());
        setIcon(imageUrl);
    }
}
