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
package za.co.mmagon.jwebswing.demo.screens.view;

import za.co.mmagon.jwebswing.base.html.HorizontalRule;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.DemoApplicationPage;
import za.co.mmagon.jwebswing.demo.DemoApplicationServlet;
import za.co.mmagon.jwebswing.demo.components.DemoButton;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.components.DemoRadioButton;
import za.co.mmagon.jwebswing.demo.components.DemoTree;
import za.co.mmagon.jwebswing.demo.navigationtree.HomeTree;
import za.co.mmagon.jwebswing.demo.navigationtree.JQXTreeDisplay;
import za.co.mmagon.jwebswing.demo.navigationtree.UITree;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.CssOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.JQUIThemeManagerFeature;
import za.co.mmagon.jwebswing.demo.screens.JQUIThemeManagerScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.MenuTreeItem;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.demo.screens.layout.DemoOuterLayout;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextAlignments;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
/*
 * @LayoutCSS(Overflow = Overflows.Scroll)
 */
public class WelcomeToJWebSwingScreen extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;

    private final String welcomeText = "<p>A framework that gives you all the power of Java, with the simplicity of Swing.\n<br>"
            + "\n<br>"
            + "<strong>You can download the JWebSwing complete library <a href=\"https://sourceforge.net/projects/jwebswing/\" target=\"_blank\">here</a>, </strong>\n<br>"
            + "All the source code for the framework is available at <a href=\"https://sourceforge.net/p/jwebswing/code/ci/master/tree/\" target=\"_blank\">Visit the SourceForge Code Galler</a>\n<br>"
            + "For the demo Application - <a href=\"https://sourceforge.net/p/jwebswing/jwdemo/ci/master/tree/\" target=\"_blank\">Visit the SourceForge Code Gallery</a>\n<br>"
            + "\n<br>"
            + "<strong>Donations will go directly towards keeping the project, servers and family running :) <br> Your support is appreciated!!!<br></strong></p>";

    private final String frameWorksText = "<p>This framework is a library of many Open Source JQuery projects. <br>\n"
            + "JWebSwing simply builds up the complete HTML file that is needed to get sent through.  <br>\n"
            + "The success of the JWebSwing project is highly dependant on these projects for its success and we do send portions of the contributions received. <br>\n"
            + "\n <br>"
            + "So a big thank you to all the developers of all these projects!  <br></p>";

    private final String screenUsageText = "<p>The <strong>Navigation Screen</strong> to the left can be used to see the capabilities of the Framework. <br><br>"
            + "On the right hand side, you will find the theme manager based on the <strong>JQuery UI Theme Roller</strong>. "
            + "<br>Of course you can easily add your own theme, or set the CSS dynamically through code.<br><br>"
            + "The <strong>Styling Manager </strong> contains 2 screens, <strong><i>The Component Configuration </i>and <i>CSS Configuration </strong></i><br><br>"
            + "The <strong>Component Options Manager </strong> will change for each screen you select showing the Options objects current configuration. <br>"
            + "<i>This allows you to see how you can dynamically code the application.</i> "
            + "<br>It will also demonstrate the Tree object.<br><br>"
            + "In the <strong>CSS Configuration</strong> is a mapping that is dynamically built from the CSS Annotations Class. <br>"
            + "These allow you to configure the display of the demo objects displayed. If there are no demo objects, this screen is non-functional.</p>";

    private final String youtubeText = "<p><strong>YouTube videos are available from the Navigation Screen </strong><br>"
            + "These show development in both <strong><i>Eclipse</i> and <i>Netbeans</i>. </strong><br>"
            + "Plugins for both IDE's are in development and will come up soon I believe. "
            + "<br>There are also some great tutorials on building some great web sites</p>";

    private final DemoHeader h;

    public WelcomeToJWebSwingScreen()
    {
        h = new DemoHeader(HeaderTypes.H1, "Welcome to JWebSwing");
    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        return new WelcomeScreenSourceCode();
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        return new ComponentOptionsScreen();
    }

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay d = new MainWindowDisplay();
        d.add(new DemoHeader(HeaderTypes.H1, "Welcome To JWebSwing"));
        d.setTextAlign(TextAlignments.Center);
        //d.add(h);
        d.add(HorizontalRule.getInstance());
        d.add(welcomeText);
        d.add(HorizontalRule.getInstance());
        d.add(frameWorksText);
        d.add(HorizontalRule.getInstance());
        d.add(screenUsageText);
        d.add(HorizontalRule.getInstance());
        d.add(youtubeText);
        d.add(HorizontalRule.getInstance());
        return d;
    }

    /**
     * The welcome screen source code options
     */
    public class WelcomeScreenSourceCode extends SourceCodeScreen
    {

        public WelcomeScreenSourceCode()
        {
            addButton("Demo Servlet", DemoApplicationServlet.class);
            addButton("Demo Page", DemoApplicationPage.class);
            addButton("Demo Body", DemoApplicationBody.class);
            addButton("Demo Outer Layout", DemoOuterLayout.class);

            addButton("Demo Tree", DemoTree.class);
            addButton("Demo Button", DemoButton.class);
            addButton("Demo Radio Button", DemoRadioButton.class);

            addButton("Menu Tree Item", MenuTreeItem.class);
            addButton("Home Tree", HomeTree.class);
            addButton("JQUI Tree", UITree.class);
            addButton("JQX Tree", JQXTreeDisplay.class);
            addButton("CSS Display", CssOptionsScreen.class);

            addButton("Theme Manager", JQUIThemeManagerScreen.class);
            addButton("Theme Manager Feature", JQUIThemeManagerFeature.class);
            addButton("Source Code Screen", SourceCodeScreen.class);
        }
    }
}
