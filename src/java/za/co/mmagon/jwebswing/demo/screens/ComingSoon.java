package za.co.mmagon.jwebswing.demo.screens;

import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextAlignments;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextCSS;

/**
 * This Class
 *
 * @author GedMarc
 * @since 28 Dec 2015
 */
@TextCSS(TextAlign = TextAlignments.Center)
public class ComingSoon extends DefaultScreenDisplay
{

    public ComingSoon()
    {
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen panel = new SourceCodeScreen();
        panel.addButton("Coming Soon Screen", this.getClass());
        return panel;
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        ComponentOptionsScreen panel = new ComponentOptionsScreen();
        return panel;
    }

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay panel = new MainWindowDisplay();
        panel.add("This Screen Is Coming Soon!<hr>The widget works great and the API is available we're just getting to building the screens!");
        panel.add("Try a different demo! We'll be getting through them all shortly enough");
        return panel;
    }

}
