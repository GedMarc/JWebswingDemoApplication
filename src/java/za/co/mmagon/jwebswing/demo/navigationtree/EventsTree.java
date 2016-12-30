package za.co.mmagon.jwebswing.demo.navigationtree;

import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.demo.components.DemoTree;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.events.enumerations.EventTypes;

/**
 *
 * @author GedMarc
 * @since 2015/12/14
 */
public class EventsTree extends DemoTree
{

    public EventsTree()
    {
        ListItem ev = (ListItem) add("Event Management");
        List eventsList = new List();
        ev.add(eventsList);
        eventsList.add("Assigning Events");
        eventsList.add("Designing Events");
        eventsList.add("Client Side Structure");
        ListItem allEventsList = (ListItem) eventsList.add("All Events");
        List allEvents = new List();
        allEventsList.add(allEvents);
        for (EventTypes event : EventTypes.values())
        {
            allEvents.add(event.name().replaceFirst("" + event.name().charAt(0), "" + Character.toUpperCase(event.name().charAt(0))));
        }

        //add(ev);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
