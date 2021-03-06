package za.co.mmagon.jwebswing.demo.screens.view.jqueryui;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqueryui.draggable.JQUIDraggable;
import za.co.mmagon.jwebswing.components.jqueryui.droppable.JQUIDroppable;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Displays;

/**
 *
 * @author GedMarc
 * @since 01 May 2015
 */
public class JQUIResizableDemo extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private final String headerText = "JQuery UI Resizable Demo";

    public JQUIResizableDemo()
    {

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("Resizable Demo", this.getClass());

        return scs;
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        return new ComponentOptionsScreen();
    }

    public JQUIDroppable getDroppableDivConstrained(Component constrain)
    {
        JQUIDroppable droppable = new JQUIDroppable();

        JQUIDraggable d = new JQUIDraggable("scope");
        d.getCss().getDimensions().setHeight(90);
        d.getCss().getDimensions().setWidth(90);
        d.addClass(JQUIThemeBlocks.UI_State_Active);
        d.getCss().getDisplay().setDisplay(Displays.Flex);
        d.add("I am Constrained ");
        d.getOptions().setContainment(constrain);

        //  droppable.add(d);
        return droppable;
    }

    /**
     * Returns the spinner demo screen
     *
     * @return
     */
    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay mwd = new MainWindowDisplay();
        mwd.getCss().getDisplay().setDisplay(Displays.Inline);
        mwd.add(new DemoHeader(HeaderTypes.H1, headerText));
        mwd.add("The Resizable Feature can be added onto any nearly any element as well.<br>"
                + "All Available Options Available have been catered for<br>"
                + "All Events Fire Server Side");

        Div dropOntoMe = new Div();
        dropOntoMe.getCss().getDimensions().setHeight(350);
        dropOntoMe.getCss().getDimensions().setWidth(350);
        dropOntoMe.add(getDroppableDivConstrained(dropOntoMe));
        dropOntoMe.addClass(JQUIThemeBlocks.UI_State_Error);
        mwd.add(dropOntoMe);

        return mwd;
    }
}
