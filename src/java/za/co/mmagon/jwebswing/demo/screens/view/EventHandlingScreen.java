package za.co.mmagon.jwebswing.demo.screens.view;

import za.co.mmagon.jwebswing.base.events.blur.BlurAdapter;
import za.co.mmagon.jwebswing.base.events.click.ClickAdapter;
import za.co.mmagon.jwebswing.base.events.focus.FocusAdapter;
import za.co.mmagon.jwebswing.base.events.select.SelectAdapter;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.TableBodyGroup;
import za.co.mmagon.jwebswing.base.html.TableCell;
import za.co.mmagon.jwebswing.base.html.TableHeaderGroup;
import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqdatatable.JQDataTable;
import za.co.mmagon.jwebswing.components.google.sourceprettify.JQSourceCodePrettify;
import za.co.mmagon.jwebswing.components.google.sourceprettify.SourceCodeLanguages;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordionHeightStyle;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.JQUITab;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.Tab;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.events.enumerations.EventTypes;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
public class EventHandlingScreen extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private HeaderText h;
    private HeaderText h2;

    public EventHandlingScreen()
    {

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("Event Handling Screen", EventHandlingScreen.class);
        scs.addButton("Click Event", ClickAdapter.class);
        scs.addButton("Focus Event", FocusAdapter.class);
        scs.addButton("Blur Event", BlurAdapter.class);
        scs.addButton("Select Event", SelectAdapter.class);
        DemoPanel d = new DemoPanel();
        return scs;
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
        d.add(h = new HeaderText(HeaderTypes.H1, "Event Handling"));
        h.addClass(JQUIThemeBlocks.UI_State_Highlight);
        h.setID("jwHeader");
        d.add(h);
        d.add("Events are handled in the same manner as The Swing Library.<hr>"
                + "<br>All events are kept server side unless you specify the 'OnDemand' feature of the event allowing pure client side interactions. "
                + "<br>Most JQuery UI components have client side handlers a long with a form component"
                + "<br>All Events Registered in the system are listed below. You can extend your own events into the IEventTypes interface."
                + "<hr>");

        d.add(h2 = new HeaderText(HeaderTypes.H2, "Available Events"));
        h2.addClass(JQUIThemeBlocks.UI_State_Highlight);

        JQUITab tabs = new JQUITab();
        tabs.getOptions().setHeightStyle(JQUIAccordionHeightStyle.Content);
        tabs.setOverflow(Overflows.Scroll);
        EventTypes[] events = EventTypes.values();
        // List eventList = new List();
        /*
         * ;
         * for (EventTypes e : events)
         * {
         * eventList.add(new ListItem(e.name()));
         * }
         * eventList.setHeight(500);
         * eventList.setOverflow(Overflows.Hidden);
         */

        TableHeaderGroup thg = new TableHeaderGroup();
        int rowCount = 4;
        int cellCount = 6;
        int listCount = 0;
        TableBodyGroup tbg = new TableBodyGroup();
        try
        {
            for (int i = 0; i < rowCount; i++)
            {
                TableRow row = new TableRow();
                tbg.add(row);
                for (int j = 0; j < cellCount; j++)
                {
                    TableCell tc = new TableCell();
                    row.add(tc);
                    tc.add(events[listCount].toString());
                    listCount++;
                }
            }
        }
        catch (Exception e)
        {
        }
        JQDataTable eventsTable = new JQDataTable(thg);
        //d.add(eventsTable);
        tabs.setOverflow(Overflows.Scroll);
        Div clickEvent = new Div();
        Tab clickEventTab = tabs.addTab(new Tab(new ListItem("Click Event"), clickEvent));
        clickEventTab.setTabDisplayComponent(clickEvent);
        JQSourceCodePrettify clickEventSourceCode = new JQSourceCodePrettify();
        clickEventSourceCode.setSourceCodeLanguage(SourceCodeLanguages.Java);
        clickEventSourceCode.setText("addEvent(new ClickEvent(this)\n"
                + "        {\n"
                + "\n"
                + "            private static final long serialVersionUID = 1L;\n"
                + "\n"
                + "            @Override\n"
                + "            public void onClick(AjaxCallObject ajaxObject, AjaxReceiver ajaxReceiver)\n"
                + "            {\n"
                + "                if (newScreen != null)\n"
                + "                {\n"
                + "                    log.debug(\"Changing screen to \" + newScreen);\n"
                + "                    newScreen.setID(\"UpdateDiv\");\n"
                + "                    ajaxReceiver.getUpdatedComponents().put(\"UpdateDiv\", newScreen);\n"
                + "                }\n"
                + "            }\n"
                + "        });");
        clickEvent.add(clickEventSourceCode);

        Tab eventTab = tabs.addTab(new Tab(new ListItem("Listed Events"), eventsTable));
        d.add(tabs);
        return d;
    }
}
