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
public class JQUIDroppableDemo extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private final String headerText = "JQuery UI Droppable Demo";

    public JQUIDroppableDemo()
    {

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("Droppable Demo", this.getClass());

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
        d.setHeight(90);
        d.setWidth(90);
        d.addClass(JQUIThemeBlocks.UI_State_Default);
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
        mwd.setDisplay(Displays.Inline);
        mwd.add(new DemoHeader(HeaderTypes.H1, headerText));
        mwd.add("<br>The Droppable Feature can be added onto any nearly any element as well.<br>"
                + "All Available Options Available have been catered for<br>"
                + "All Events Fire Server Side");

        Div dropOntoMe = new Div();
        dropOntoMe.setHeight(350);
        dropOntoMe.setWidth(350);
        dropOntoMe.add(getDroppableDivConstrained(dropOntoMe));
        dropOntoMe.addClass(JQUIThemeBlocks.UI_State_Error);
        mwd.add(dropOntoMe);

        return mwd;
    }
}
