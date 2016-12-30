/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;
import za.co.mmagon.jwebswing.components.jqueryui.menu.JQUIMenu;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextAlignments;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextCSS;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
@TextCSS(TextAlign = TextAlignments.Left)
public class DemoMenuBar extends JQUIMenu
{

    private static final long serialVersionUID = 1L;
    private DemoMenuBarList fileList = new DemoMenuBarList();

    public DemoMenuBar()
    {
        super(Orientation.HORIZONTAL);
        //getOptions().setTheme(DemoApplicationBody.jqxTheme);
        //add(fileList);
        //fileList.add(new DemoMenuBarItem("Item"));
    }
}
