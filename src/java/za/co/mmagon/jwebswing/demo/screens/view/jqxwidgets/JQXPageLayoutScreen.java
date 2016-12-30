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
package za.co.mmagon.jwebswing.demo.screens.view.jqxwidgets;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;
import za.co.mmagon.jwebswing.components.jqxwidgets.dockinglayout.JQXDockingLayoutAlignment;
import za.co.mmagon.jwebswing.components.jqxwidgets.layout.JQXLayout;
import za.co.mmagon.jwebswing.components.jqxwidgets.layout.JQXLayoutArray;
import za.co.mmagon.jwebswing.components.jqxwidgets.layout.JQXLayoutAttributes;
import za.co.mmagon.jwebswing.components.jqxwidgets.layout.JQXLayoutType;
import za.co.mmagon.jwebswing.components.jqxwidgets.themes.JQXWidgetThemes;
import za.co.mmagon.jwebswing.demo.screens.view.WelcomeToJWebSwingScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementPercentages;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementTypes;

/**
 *
 * @author GedMarc
 * @since 17 Jan 2016
 */
public class JQXPageLayoutScreen
{

    public JQXPageLayoutScreen()
    {
    }

    @Override
    public String toString()
    {
        return "";
    }

    /**
     * For the jqx layout demo page
     *
     * @param args
     */
    Div toolboxPanel = new Div();
    Div helpPanel = new Div();
    Div document1Panel = new Div();
    Div document2Panel = new Div();
    Div errorListPanel = new Div();
    Div outputPanel = new Div();
    Div solutionExplorerPanel = new Div();
    Div solutionExplorerTree = new Div();
    Div propertiesPanel = new Div();

    private void buildLayoutDivs()
    {
        toolboxPanel.addAttribute(JQXLayoutAttributes.Data_Container, "toolboxPanel");
        toolboxPanel.setID("toolboxPanel");
        toolboxPanel.add("toolboxPanel");

        helpPanel.addAttribute(JQXLayoutAttributes.Data_Container, "helpPanel");
        helpPanel.setID("helpPanel");
        helpPanel.add("helpPanel");

        document1Panel.addAttribute(JQXLayoutAttributes.Data_Container, "document1Panel");
        document1Panel.setID("document1Panel");
        document1Panel.add("document1Panel");

        document2Panel.addAttribute(JQXLayoutAttributes.Data_Container, "document2Panel");
        document2Panel.setID("document2Panel");
        document2Panel.add("document2Panel");

        errorListPanel.addAttribute(JQXLayoutAttributes.Data_Container, "errorListPanel");
        errorListPanel.setID("errorListPanel");
        errorListPanel.add("errorListPanel");

        outputPanel.addAttribute(JQXLayoutAttributes.Data_Container, "outputPanel");
        outputPanel.setID("outputPanel");
        outputPanel.add("outputPanel");

        solutionExplorerPanel.addAttribute(JQXLayoutAttributes.Data_Container, "solutionExplorerPanel");
        solutionExplorerPanel.setID("solutionExplorerPanel");
        solutionExplorerPanel.add("solutionExplorerPanel");

        solutionExplorerTree.addAttribute(JQXLayoutAttributes.Data_Container, "solutionExplorerTree");
        solutionExplorerTree.setID("solutionExplorerTree");
        solutionExplorerTree.add("solutionExplorerTree");
        solutionExplorerPanel.add(solutionExplorerTree);

        propertiesPanel.addAttribute(JQXLayoutAttributes.Data_Container, "propertiesPanel");
        propertiesPanel.setID("propertiesPanel");
        propertiesPanel.add("propertiesPanel");

    }

    JQXLayout layout = new JQXLayout();

    private JQXLayout getPageLayout()
    {

        layout.setID("jqxLayout");
        layout.getOptions().setTheme(JQXWidgetThemes.MetroDark);

        JQXLayoutArray layoutArray = new JQXLayoutArray();
        layoutArray.setType(JQXLayoutType.layoutGroup);
        layoutArray.setOrientation(Orientation.HORIZONTAL);

        JQXLayoutArray westLayoutArray = new JQXLayoutArray();
        westLayoutArray.setType(JQXLayoutType.autoHideGroup);
        westLayoutArray.setAlignment(JQXDockingLayoutAlignment.Left);
        layoutArray.getItems().add(westLayoutArray);
        westLayoutArray.setUnpinnedWidth(340);
        westLayoutArray.setHeight(new MeasurementCSSImpl(100, MeasurementTypes.Percent));

        JQXLayoutArray westPanel1 = new JQXLayoutArray();
        westLayoutArray.getItems().add(westPanel1);
        westPanel1.setType(JQXLayoutType.layoutPanel);
        westPanel1.setTitle("Toolbox");
        westPanel1.setContentContainer(toolboxPanel.getAttribute(JQXLayoutAttributes.Data_Container));

        JQXLayoutArray westPanel2 = new JQXLayoutArray();
        westLayoutArray.getItems().add(westPanel2);
        westPanel2.setType(JQXLayoutType.layoutPanel);
        westPanel2.setTitle("Help");
        westPanel2.setContentContainer(helpPanel.getAttribute(JQXLayoutAttributes.Data_Container));

        JQXLayoutArray centerLayoutArray = new JQXLayoutArray();
        centerLayoutArray.setType(JQXLayoutType.layoutGroup);
        centerLayoutArray.setOrientation(Orientation.VERTICAL);
        layoutArray.getItems().add(centerLayoutArray);
        centerLayoutArray.setWidth(MeasurementPercentages.hundredPercent);
        centerLayoutArray.setHeight(new MeasurementCSSImpl(100, MeasurementTypes.Percent));

        JQXLayoutArray documentGroup = new JQXLayoutArray();
        centerLayoutArray.getItems().add(documentGroup);
        documentGroup.setType(JQXLayoutType.documentGroup);
        documentGroup.setHeight(new MeasurementCSSImpl(100, MeasurementTypes.Percent));

        JQXLayoutArray documentPanel1 = new JQXLayoutArray();
        documentGroup.getItems().add(documentPanel1);
        documentPanel1.setType(JQXLayoutType.documentPanel);
        documentPanel1.setTitle("Document 1");
        documentPanel1.setWidth(new MeasurementCSSImpl(100, MeasurementTypes.Percent));
        documentPanel1.setContentContainer(document1Panel.getAttribute(JQXLayoutAttributes.Data_Container));
        document1Panel.add(new WelcomeToJWebSwingScreen().getDefaultDisplayScreen());

        JQXLayoutArray documentPanel2 = new JQXLayoutArray();
        documentGroup.getItems().add(documentPanel2);
        documentPanel2.setType(JQXLayoutType.documentPanel);
        documentPanel2.setTitle("Document 2");
        documentPanel2.setContentContainer(document2Panel.getAttribute(JQXLayoutAttributes.Data_Container));

        JQXLayoutArray centerBottom = new JQXLayoutArray();
        centerLayoutArray.getItems().add(centerBottom);
        centerBottom.setType(JQXLayoutType.tabbedGroup);
        //centerBottom.setHeight(200);
        //centerBottom.setUnpinnedHeight(200);
        //centerBottom.setPinnedHeight(30);

        JQXLayoutArray centerBottomPanel1 = new JQXLayoutArray();
        centerBottom.getItems().add(centerBottomPanel1);
        centerBottomPanel1.setType(JQXLayoutType.layoutPanel);
        centerBottomPanel1.setTitle("Errors");
        centerBottomPanel1.setContentContainer(errorListPanel.getAttribute(JQXLayoutAttributes.Data_Container));

        JQXLayoutArray centerBottomPanel2 = new JQXLayoutArray();
        centerBottom.getItems().add(centerBottomPanel2);
        centerBottomPanel2.setType(JQXLayoutType.layoutPanel);
        centerBottomPanel2.setTitle("Output");
        centerBottomPanel2.setContentContainer(outputPanel.getAttribute(JQXLayoutAttributes.Data_Container));
        centerBottomPanel2.setSelected(true);

        JQXLayoutArray eastLayoutArray = new JQXLayoutArray();
        eastLayoutArray.setType(JQXLayoutType.tabbedGroup);
        eastLayoutArray.setWidth(340);
        eastLayoutArray.setHeight(new MeasurementCSSImpl(100, MeasurementTypes.Percent));
        layoutArray.getItems().add(eastLayoutArray);

        JQXLayoutArray eastPanel1 = new JQXLayoutArray();
        eastLayoutArray.getItems().add(eastPanel1);
        eastPanel1.setType(JQXLayoutType.layoutPanel);
        eastPanel1.setTitle("Tree");
        eastPanel1.setContentContainer(solutionExplorerPanel.getAttribute(JQXLayoutAttributes.Data_Container));

        JQXLayoutArray eastPanel2 = new JQXLayoutArray();
        eastLayoutArray.getItems().add(eastPanel2);
        eastPanel2.setType(JQXLayoutType.layoutPanel);
        eastPanel2.setTitle("Tree2");
        eastPanel2.setContentContainer(propertiesPanel.getAttribute(JQXLayoutAttributes.Data_Container));

        layout.getOptions().setHeight(MeasurementPercentages.hundredPercent);
        layout.getOptions().setWidth(MeasurementPercentages.hundredPercent);
        layout.getOptions().getLayout().add(layoutArray);

        return layout;
    }
}
