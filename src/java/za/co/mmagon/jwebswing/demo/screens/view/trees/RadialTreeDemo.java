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
package za.co.mmagon.jwebswing.demo.screens.view.trees;


import za.co.mmagon.jwebswing.components.d3.radialreingoldtilfordtree.JWRadialReingoldTilfordTree;
import za.co.mmagon.jwebswing.components.d3.radialreingoldtilfordtree.JWRadialTreeItem;
import za.co.mmagon.jwebswing.components.d3.reingoldtilfordtree.JWReingoldTilfordTreeOptions;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;

/**
 *
 * @author Marc Magon
 * @since 31 Aug 2015
 * @version 1.0
 */
public class RadialTreeDemo extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private JWReingoldTilfordTreeOptions options;

    public RadialTreeDemo()
    {
        super();

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        return new RadialSourceCode();
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        ComponentOptionsScreen d = new ComponentOptionsScreen();
        return d;
    }

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay dp = new MainWindowDisplay();
        JWRadialReingoldTilfordTree tree = new JWRadialReingoldTilfordTree();
        tree.getOptions().setDiameter(980);
        tree.getOptions().setMaximumDegrees(180);
        JWRadialTreeItem root = new JWRadialTreeItem();
        root.setName(" ");
        JWRadialTreeItem project1 = new JWRadialTreeItem("JWebSwing");
        JWRadialTreeItem project1item1 = new JWRadialTreeItem("HTML");
        JWRadialTreeItem project1item2 = new JWRadialTreeItem("CSS");
        JWRadialTreeItem project1item3 = new JWRadialTreeItem("Javascript");
        JWRadialTreeItem project1item4 = new JWRadialTreeItem("Components");
        JWRadialTreeItem project1item4node1 = new JWRadialTreeItem("HTML Components");
        JWRadialTreeItem project1item4node2 = new JWRadialTreeItem("CSS Components");
        JWRadialTreeItem project1item4node3 = new JWRadialTreeItem("JS Components");
        JWRadialTreeItem project1item4node4 = new JWRadialTreeItem("JQuery Components");
        JWRadialTreeItem project1item4node5 = new JWRadialTreeItem("UI Components");
        JWRadialTreeItem project1item4node6 = new JWRadialTreeItem("Layout Components");
        JWRadialTreeItem project1item4node7 = new JWRadialTreeItem("jqPlot Components");
        JWRadialTreeItem project1item4node8 = new JWRadialTreeItem("d3 Components");
        JWRadialTreeItem project1item4node9 = new JWRadialTreeItem("Image Map Components");
        JWRadialTreeItem project1item4node10 = new JWRadialTreeItem("Metro Components");
        JWRadialTreeItem project1item4node11 = new JWRadialTreeItem("Data Table Components");
        JWRadialTreeItem project1item5 = new JWRadialTreeItem("Events ");
        JWRadialTreeItem project1item6 = new JWRadialTreeItem("Web Demo");
        JWRadialTreeItem project1item7 = new JWRadialTreeItem("YouTube Vids");
        JWRadialTreeItem project2 = new JWRadialTreeItem("Project Box");
        JWRadialTreeItem project3 = new JWRadialTreeItem("People Box");
        JWRadialTreeItem project4 = new JWRadialTreeItem("Time Box");
        JWRadialTreeItem project4item1 = new JWRadialTreeItem("Time Builder");
        JWRadialTreeItem project4item2 = new JWRadialTreeItem("Time Sheets");
        JWRadialTreeItem project4item3 = new JWRadialTreeItem("Time Reporting");
        JWRadialTreeItem project5 = new JWRadialTreeItem("Mail Box   ");
        JWRadialTreeItem project5item1 = new JWRadialTreeItem("Mail ");
        JWRadialTreeItem project5item2 = new JWRadialTreeItem("Mobile ");
        JWRadialTreeItem project5item3 = new JWRadialTreeItem("PDF ");
        JWRadialTreeItem project5item4 = new JWRadialTreeItem("Excel ");
        JWRadialTreeItem project5item5 = new JWRadialTreeItem("Word ");
        JWRadialTreeItem project6 = new JWRadialTreeItem("B.I. Box   ");
        JWRadialTreeItem project6item1 = new JWRadialTreeItem("Freeboard");
        JWRadialTreeItem project6item2 = new JWRadialTreeItem("HSQL");
        JWRadialTreeItem project6item3 = new JWRadialTreeItem("Docs");
        JWRadialTreeItem project6item4 = new JWRadialTreeItem("Data");
        JWRadialTreeItem project6item5 = new JWRadialTreeItem("Tools");

        root.add(project1);
        project1.add(project1item1);
        project1.add(project1item2);
        project1.add(project1item3);
        project1.add(project1item4);
        project1item4.add(project1item4node1);
        project1item4.add(project1item4node2);
        project1item4.add(project1item4node3);
        project1item4.add(project1item4node4);
        project1item4.add(project1item4node5);
        project1item4.add(project1item4node6);
        project1item4.add(project1item4node7);
        project1item4.add(project1item4node8);
        project1item4.add(project1item4node9);
        project1item4.add(project1item4node10);
        project1item4.add(project1item4node11);
        project1.add(project1item5);
        project1.add(project1item6);
        project1.add(project1item7);
        root.add(project2);
        root.add(project3);
        root.add(project4);
        project4.add(project4item1);
        project4.add(project4item2);
        project4.add(project4item3);
        root.add(project5);
        project5.add(project5item1);
        project5.add(project5item2);
        project5.add(project5item3);
        project5.add(project5item4);
        project5.add(project5item5);
        root.add(project6);
        project6.add(project6item1);
        project6.add(project6item2);
        project6.add(project6item3);
        project6.add(project6item4);
        project6.add(project6item5);

        tree.getOptions().setData(root);
        //System.out.println(tree.renderJavascripts(0));
        //System.out.println(tree.toString(true));
        dp.add(tree);
        return dp;
    }

    class RadialSourceCode extends SourceCodeScreen
    {

        public RadialSourceCode()
        {
            addButton("Reingold-Trefield Tree Source Code Screen", ReingoldTreeDemo.class);
            addButton("Radial Reingold-Trefield Tree Source Code Screen", RadialTreeDemo.class);
        }
    }

}
