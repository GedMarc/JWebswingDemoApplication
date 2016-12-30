/*
 * Copyright (C) 2015 GedMarc
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
package za.co.mmagon.jwebswing.demo.navigationtree;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeItem;
import za.co.mmagon.jwebswing.demo.DemoApplicationScreens;
import za.co.mmagon.jwebswing.demo.components.DemoTree;
import za.co.mmagon.jwebswing.demo.screens.MenuTreeItem;

/**
 * This Class is the basic components tree
 *
 * @author GedMarc
 * @since 14 Dec 2015
 */
public class BasicComponentsTree extends DemoTree
{

    public BasicComponentsTree()
    {
        add("Basic Components");

        ArrayList<JQXTreeItem> homeList = addList("HTML Classes");
        homeList.add(new MenuTreeItem("Basic Usage", DemoApplicationScreens.ComingSoon));
        homeList.add(new MenuTreeItem("W3 Schools HTML", DemoApplicationScreens.ComingSoon));
        homeList.add(new MenuTreeItem("API", DemoApplicationScreens.ComingSoon));

        ArrayList<JQXTreeItem> cssList = addList("CSS Classes");
        cssList.add(new MenuTreeItem("Basic Usage", DemoApplicationScreens.ComingSoon));
        cssList.add(new MenuTreeItem("Custom CSS", DemoApplicationScreens.ComingSoon));
        cssList.add(new MenuTreeItem("W3 Schools CSS", DemoApplicationScreens.ComingSoon));
        cssList.add(new MenuTreeItem("API", DemoApplicationScreens.ComingSoon));

        ArrayList<JQXTreeItem> componentDesignList = addList("Component Design");
        componentDesignList.add(new MenuTreeItem("Build a Button", DemoApplicationScreens.ComingSoon));
        componentDesignList.add(new MenuTreeItem("Build a Feature", DemoApplicationScreens.ComingSoon));
        componentDesignList.add(new MenuTreeItem("Build an Event", DemoApplicationScreens.ComingSoon));
        componentDesignList.add(new MenuTreeItem("Build a Component", DemoApplicationScreens.ComingSoon));
        componentDesignList.add(new MenuTreeItem("Full API", DemoApplicationScreens.ComingSoon));
        componentDesignList.add(new MenuTreeItem("YouTube Guides", DemoApplicationScreens.ComingSoon));
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
