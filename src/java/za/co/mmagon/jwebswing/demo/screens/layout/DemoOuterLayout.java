package za.co.mmagon.jwebswing.demo.screens.layout;

import za.co.mmagon.jwebswing.base.html.Body;
import za.co.mmagon.jwebswing.components.jquerylayout.layout.JQLayout;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;

/**
 *
 * @author GedMarc
 * @since 26 Apr 2015
 */
public class DemoOuterLayout extends JQLayout
{

    private Body b;

    public DemoOuterLayout(Body b)
    {
        super(b);
        setupEast();
        setupWest();
        this.b = b;
    }

    private void setupWest()
    {
        getOptions().getWest().setSpacing_closed(0);
        getOptions().getWest().setSpacing_open(0);
        getOptions().getWest().setTogglerLength_closed(0);
        getOptions().getWest().setTogglerLength_open(0);
        getOptions().getWest().setMinSize(350);
        getWest().getContentDiv().setOverflow(Overflows.Hidden);
        //getWest().setBackgroundColour(ColourNames.Black);

//        getWest().addFooter(b.getNotificationPanel());
    }

    private void setupEast()
    {
        getOptions().getEast().setMinSize(350);
        getOptions().getEast().setSpacing_closed(0);
        getOptions().getEast().setSpacing_open(0);
        getOptions().getEast().setTogglerLength_closed(0);
        getOptions().getEast().setTogglerLength_open(0);
        // getEast().setBackgroundColour(ColourNames.Black);
    }
}
