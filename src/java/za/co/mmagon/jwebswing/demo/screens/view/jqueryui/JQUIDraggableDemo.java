package za.co.mmagon.jwebswing.demo.screens.view.jqueryui;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqueryui.draggable.Axis;
import za.co.mmagon.jwebswing.components.jqueryui.draggable.JQUIDraggable;
import za.co.mmagon.jwebswing.components.jqueryui.sortable.JQUISortable;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Displays;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Floats;

/**
 *
 * @author GedMarc
 * @since 01 May 2015
 */
public class JQUIDraggableDemo extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private final String headerText = "JQuery UI Draggable Demo";

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("Draggable Demo", this.getClass());

        return scs;
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        return new ComponentOptionsScreen();
    }

    public Div getDraggable()
    {
        return getDraggableDiv();
    }

    public JQUIDraggable getDraggableDiv()
    {
        JQUIDraggable d = new JQUIDraggable("scope");
        d.getCss().getDimensions().setHeight(90);
        d.getCss().getDimensions().setWidth(90);
        d.addClass(JQUIThemeBlocks.UI_State_Active);
        d.getCss().getDisplay().setDisplay(Displays.Flex);
        d.add("I am Draggable");
        return d;
    }

    public JQUIDraggable getDraggableDivOnlyVertical()
    {
        JQUIDraggable d = new JQUIDraggable("scope");
        d.getCss().getDimensions().setHeight(90);
        d.getCss().getDimensions().setWidth(90);
        d.addClass(JQUIThemeBlocks.UI_State_Active);
        d.getCss().getDisplay().setDisplay(Displays.Flex);
        d.add("I am Draggable Only Vertically");
        d.getOptions().setAxis(Axis.Y);
        d.getCss().getDisplay().setFloat(Floats.Left);
        return d;
    }

    public JQUIDraggable getDraggableDivOnlyHorizontally()
    {
        JQUIDraggable d = new JQUIDraggable("scope");
        d.getCss().getDimensions().setHeight(90);
        d.getCss().getDimensions().setWidth(90);
        d.addClass(JQUIThemeBlocks.UI_State_Active);
        d.getCss().getDisplay().setDisplay(Displays.Flex);
        d.add("I am Draggable Only Horizontally");
        d.getOptions().setAxis(Axis.X);
        return d;
    }

    public JQUIDraggable getDraggableDivConstrained(Component constrain)
    {
        JQUIDraggable d = new JQUIDraggable("scope");
        d.getCss().getDimensions().setHeight(90);
        d.getCss().getDimensions().setWidth(90);
        d.addClass(JQUIThemeBlocks.UI_State_Active);
        d.getCss().getDisplay().setDisplay(Displays.Flex);
        d.add("I am Constrained");
        d.getOptions().setContainment(constrain);
        d.getCss().getDisplay().setFloat(Floats.Left);
        return d;
    }

    public Div getDraggableWithSortable()
    {
        Div d = new Div();
        d.getCss().getDisplay().setDisplay(Displays.Block);
        JQUISortable sortableList = new JQUISortable();
        sortableList.addClass(JQUIThemeBlocks.UI_State_Default);
        sortableList.getList().add("Item 1");
        sortableList.getList().add("Item 2");
        sortableList.getList().add("Item 3");
        sortableList.getList().add("Item 4");
        sortableList.getList().add("Item 5");
        d.add(sortableList);

        return d;
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

        mwd.add(new DemoHeader(HeaderTypes.H1, headerText));
        mwd.add("The Draggable Feature can be added onto any nearly any element.<br>"
                + "All Available Options Available have been catered for<br>"
                + "Please see the JQuery UI Draggable API or the Properties Display Window<br><br>");
        mwd.add(getDraggable());
        Div constran = new Div();
        constran.getCss().getDimensions().setHeight(250);
        constran.getCss().getDimensions().setWidth(250);
        constran.add(getDraggableDivConstrained(constran));
        constran.addClass(JQUIThemeBlocks.UI_State_Error);
        mwd.add(constran);

        //mwd.add(getDraggableDivConstrained());
        mwd.add(getDraggableDivOnlyHorizontally());
        mwd.add(getDraggableDivOnlyVertical());
        mwd.add(new DemoHeader(HeaderTypes.H3, "Draggable, Droppable with Sortable"));
        mwd.add(getDraggableWithSortable());

        return mwd;
    }

}
