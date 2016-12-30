package za.co.mmagon.jwebswing.demo.screens.view;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqmetro.metro.JQMetroTiles;
import za.co.mmagon.jwebswing.components.jqmetro.metro.enumerations.TileAccentThemes;
import za.co.mmagon.jwebswing.components.jqmetro.metro.enumerations.TileCount;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordion;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordionHeightStyle;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordionTab;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.CSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.DisplayCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextAlignments;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextCSS;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
@CSS(Display = @DisplayCSS(Overflow = Overflows.Hidden))
public class YouTubeLinksScreen extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private DemoHeader h;
    private DemoHeader h1;
    private DemoHeader h2;
    @TextCSS(TextAlign = TextAlignments.Left)
    private Div basicsDiv = new Div();
    private Div advancedDiv = new Div(); 

    public YouTubeLinksScreen()
    {
    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen d = new SourceCodeScreen();
        d.addButton("You Tube Screen", this.getClass());
        return d;
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
        MainWindowDisplay d = new MainWindowDisplay();

        d.add(h = new DemoHeader(HeaderTypes.H1, "YouTube Links"));
        d.add("Below are a few links to the You Tube channel for guides and set up details<hr>");
        h1 = new DemoHeader(HeaderTypes.H2, "Getting up and running");
        h2 = new DemoHeader(HeaderTypes.H2, "A bit more advanced");
        h.addClass(JQUIThemeBlocks.UI_State_Highlight);

        JQUIAccordion collapsibleAccordion = new JQUIAccordion(JQUIAccordionHeightStyle.Auto);
        d.add(collapsibleAccordion);
        basicsDiv = new DemoPanel();
        advancedDiv = new DemoPanel();
        JQUIAccordionTab basicsTab = collapsibleAccordion.addAccordianTab(h1, basicsDiv);
        JQMetroTiles metroDisplay = new JQMetroTiles(TileAccentThemes.Amber, TileCount.five);
        //metroDisplay.as
        //TileGroup tg = new TileGroup();
        //metroDisplay.add(tg);
        //Tile t = new Tile("tile");
        //tg.add(t);
        //metroDisplay.add(new Tile("Tile 1"));

        basicsDiv.add(metroDisplay);
        basicsDiv.add("Download and Extract");
        basicsDiv.add("Netbeans - Setting up your library");
        basicsDiv.add("Eclipse - Setting up your library");
        basicsDiv.add("Netbeans - Standard Output");
        basicsDiv.add("Eclipse - Standard Output");
        basicsDiv.add("Netbeans - Tomcat Apache");
        basicsDiv.add("Eclipse - Tomcat Apache");
        basicsDiv.add("Netbeans - Glassfish");
        basicsDiv.add("Eclipse - Glassfish");
        basicsDiv.add("Netbeans - JBoss");
        basicsDiv.add("Eclipse - JBoss");
        basicsDiv.add("Netbeans - WebSphere");
        basicsDiv.add("Eclipse - WebSphere");
        JQUIAccordionTab advancedTab = collapsibleAccordion.addAccordianTab(h2, advancedDiv);
        advancedDiv.add("Hello World!");
        advancedDiv.add("The CSS Engine");
        advancedDiv.add("Adding Custom Scripting - The Source Code Viewer");
        advancedDiv.add("Adding Custom Scripting - The Theme Manager");
        advancedDiv.add("Basic Layout Handling");
        advancedDiv.add("Theme Roller - Using JQuery Theme Roller to create themes");

        return d;
    }

}
