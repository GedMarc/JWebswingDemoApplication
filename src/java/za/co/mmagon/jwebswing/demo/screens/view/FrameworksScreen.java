package za.co.mmagon.jwebswing.demo.screens.view;

import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.components.FrameworksTable;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.CSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.DisplayCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
@CSS(Display = @DisplayCSS(Overflow = Overflows.Hidden))
public class FrameworksScreen extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private HeaderText h;
    private HeaderText h1;
    private FrameworksTable frameworks;

    public FrameworksScreen()
    {

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen d = new SourceCodeScreen();
        d.addButton("Frameworks Screen", FrameworksScreen.class);
        d.addButton("Frameworks Table", FrameworksTable.class);

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
        d.add(h = new DemoHeader(HeaderTypes.H1, "Frameworks"));
        h1 = new DemoHeader(HeaderTypes.H2, "Thank You!");
        h.addClass(JQUIThemeBlocks.UI_State_Highlight);
        h.setID("jwHeader");
        d.add(h);
        d.add("The frameworks being used to make this all possible are below."
                + "<br>All the generated pages that come out the system are linked to these frameworks."
                + "<hr>");

        d.add(h1);
        h1.addClass(JQUIThemeBlocks.UI_State_Highlight);
        d.add(frameworks = new FrameworksTable());
        return d;
    }
}
