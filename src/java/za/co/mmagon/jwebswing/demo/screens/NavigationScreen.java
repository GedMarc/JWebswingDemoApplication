package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.HorizontalRule;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.screens.view.ComponentInteractionScreen;
import za.co.mmagon.jwebswing.demo.screens.view.EventHandlingScreen;
import za.co.mmagon.jwebswing.demo.screens.view.FrameworksScreen;
import za.co.mmagon.jwebswing.demo.screens.view.GettingStartedScreen;
import za.co.mmagon.jwebswing.demo.screens.view.WelcomeToJWebSwingScreen;
import za.co.mmagon.jwebswing.demo.screens.view.trees.RadialTreeDemo;
import za.co.mmagon.jwebswing.demo.screens.view.trees.ReingoldTreeDemo;

/**
 *
 * @author GedMarc
 * @since 28 Apr 2015
 */
public class NavigationScreen extends DemoPanel
{

    /**
     * Version 1
     */
    private static final long serialVersionUID = 1L;
    /**
     * Intrinsic body reference
     */
    private final DemoApplicationBody body;

    /**
     * Constructs a new navigation screen accordion
     * <p>
     * @param body
     */
    public NavigationScreen(DemoApplicationBody body)
    {
        //super(JQUIAccordionHeightStyle.Fill);
        this.body = body;
        //addClass(DemoGeneralStyleLibrary.FullScreen.getCssClass());
        //Adds the button set to the accordion for all underlying buttons
        getJWebSwingAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });

        getJQueryLayoutAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });

        getJQueryAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });

        getJQueryComponentsAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });

        getGraphingAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });

        getJQueryTreeAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });

        getJQueryMiscAccordion().stream().forEach((jWebSwingAccordion)
                ->
                {
                    add(jWebSwingAccordion);
        });
    }

    private ArrayList<Component> getJWebSwingAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "JWebSwing");
        Div d = new Div();
        // JQUIButtonGroupFeature buttonGroupFeature = new JQUIButtonGroupFeature(d);
        // buttonGroupFeature.getOptions().setItems(ComponentTypes.Input);
        // d.addFeature(buttonGroupFeature);

        MenuButton jWebSwingButton = new MenuButton(this, "JWebSwing", "Home Page", new WelcomeToJWebSwingScreen());
        MenuButton jWebSwingButton1 = new MenuButton(this, "Getting Started", "How to start with framework", new GettingStartedScreen());
        MenuButton jWebSwingButton4 = new MenuButton(this, "Component Interactions", "Working with the components", new ComponentInteractionScreen());
        MenuButton jWebSwingButton2 = new MenuButton(this, "Event Handling", "How interactive features work", new EventHandlingScreen());
        MenuButton jWebSwingButton3 = new MenuButton(this, "YouTube Guides", "A list of all the you tube guides available to assist in development", null);//new YouTubeLinksScreen());
        MenuButton jWebSwingButton5 = new MenuButton(this, "Frameworks Used", "All the frameworks that are accessed in this project", new FrameworksScreen());
        MenuButton jWebSwingButton6 = new MenuButton(this, "All Components", "A list of all the components in the system", null);// new FrameworksScreen());
        MenuButton jWebSwingButton7 = new MenuButton(this, "All HTML Tags", "A list of all the HTML Tags in the system", null);// new FrameworksScreen());
        MenuButton jWebSwingButton8 = new MenuButton(this, "All Events", "A list of all the Events that are in the system", null);//new FrameworksScreen());

        d.add(jWebSwingButton);
        d.add(jWebSwingButton1);
        d.add(jWebSwingButton4);
        d.add(jWebSwingButton2);
        d.add(jWebSwingButton3);
        d.add(jWebSwingButton5);
        d.add(jWebSwingButton6);
        d.add(jWebSwingButton7);
        d.add(jWebSwingButton8);

        accordionComponents.add(accordionHeader);
        accordionComponents.add(d);
        return accordionComponents;
    }

    private ArrayList<Component> getJQueryLayoutAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "JQuery Layout");
        Div d = new Div();

        MenuButton draggableDemo = new MenuButton(this, "Layouts", "The Draggable Feature. Built on JQuery UI Draggable Implementation", null);
        MenuButton droppableDemo = new MenuButton(this, "CSS Handling", "The Droppable Feature. Built on JQuery UI Droppable Implementation", null);
        MenuButton resizableDemo = new MenuButton(this, "Feature Creation", "The Resizable Feature. Built on JQuery UI Resizable Implementation", null);
        MenuButton selectableDemo = new MenuButton(this, "Event Handling", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);

        d.add(draggableDemo);
        d.add(droppableDemo);
        d.add(resizableDemo);
        d.add(selectableDemo);

        accordionComponents.add(accordionHeader);
        accordionComponents.add(d);
        return accordionComponents;
    }

    private ArrayList<Component> getJQueryAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "JQuery UI Base");
        Div d = new Div();

        MenuButton draggableDemo = new MenuButton(this, "Draggable", "The Draggable Feature. Built on JQuery UI Draggable Implementation", null);
        MenuButton droppableDemo = new MenuButton(this, "Droppable", "The Droppable Feature. Built on JQuery UI Droppable Implementation", null);
        MenuButton resizableDemo = new MenuButton(this, "Resizable", "The Resizable Feature. Built on JQuery UI Resizable Implementation", null);
        MenuButton selectableDemo = new MenuButton(this, "Selectable", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton sortableDemo = new MenuButton(this, "Sortable", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton animationsDemo = new MenuButton(this, "Animations", "The JQuery Animations Suite", null);

        d.add(draggableDemo);
        d.add(droppableDemo);
        d.add(resizableDemo);
        d.add(selectableDemo);
        d.add(sortableDemo);
        d.add(animationsDemo);

        accordionComponents.add(accordionHeader);
        accordionComponents.add(d);
        return accordionComponents;
    }

    private ArrayList<Component> getJQueryComponentsAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "JQuery UI Components");
        Div d = new Div();

        MenuButton accordionDemo = new MenuButton(this, "Accordion", "The Draggable Feature. Built on JQuery UI Draggable Implementation", null);
        MenuButton autoCompleteDemo = new MenuButton(this, "AutoComplete", "The Droppable Feature. Built on JQuery UI Droppable Implementation", null);
        MenuButton buttonDemo = new MenuButton(this, "Button", "The Resizable Feature. Built on JQuery UI Resizable Implementation", null);
        MenuButton datePickerDemo = new MenuButton(this, "Date Picker", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton dialogDemo = new MenuButton(this, "Dialog", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton menuDemo = new MenuButton(this, "Menu", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton progressBarDemo = new MenuButton(this, "Progress Bar", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton selectMenuDemo = new MenuButton(this, "Select Menu", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton sliderDemo = new MenuButton(this, "Slider", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton spinnerDemo = new MenuButton(this, "Spinner", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton tabsDemo = new MenuButton(this, "Tabs", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);
        MenuButton tooltipsDemo = new MenuButton(this, "Tooltips", "The Selectable Feature. Built on JQuery UI Selectable Implementation", null);

        d.add(accordionDemo);
        d.add(autoCompleteDemo);
        d.add(buttonDemo);
        d.add(datePickerDemo);
        d.add(dialogDemo);
        d.add(menuDemo);
        d.add(progressBarDemo);
        d.add(selectMenuDemo);
        d.add(sliderDemo);
        d.add(spinnerDemo);
        d.add(tabsDemo);
        d.add(tooltipsDemo);

        accordionComponents.add(accordionHeader);
        accordionComponents.add(d);
        return accordionComponents;
    }

    private ArrayList<Component> getGraphingAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "Graphing");
        accordionHeader.addAttribute(GlobalAttributes.Title, "Built on the JQPlot Library, Instant Data Client-Rendered Visualizations");
        Div d = new Div();

        MenuButton genericDemo = new MenuButton(this, "Generic Functionality", "The available render helpers available on all graph types", null);// new BasicGraphDemoScreen());
        MenuButton genericDemo2 = new MenuButton(this, "Axis Functionality", "The available basics for Axis", null);//new BarGraphDemoScreen());
        MenuButton markersDemo = new MenuButton(this, "Markers", "The available render helpers available on all graph types", null);
        MenuButton dragAndDropDemo = new MenuButton(this, "Drag and Drop", "Predict data with Drag and Drop", null);
        MenuButton labelDemo = new MenuButton(this, "Label Functionality", "Different Label Renderers", null);
        MenuButton zoomingDemo = new MenuButton(this, "Graph Zooming", "Zoom into your graphs", null);

        MenuButton lineGraphsDemo = new MenuButton(this, "Line Graphs", "Line Graphing", null);
        MenuButton barGraphsDemo = new MenuButton(this, "Bar Graphs", "Line Graphing", null);
        MenuButton areaGraphsDemo = new MenuButton(this, "Area Graphs", "Area Graphs", null);
        MenuButton combinationGraphDemo = new MenuButton(this, "Combination Graphs", "Area Graphs", null);

        MenuButton pieDemo = new MenuButton(this, "Pie Graphs", "Pie and Donuts Graphs", null);
        MenuButton candleStickDemo = new MenuButton(this, "Candle-Stick Graphs", "Candle-Stick and Hi-Lo Graphs", null);

        MenuButton bubblesDemo = new MenuButton(this, "Bubble Graphs", "Bubble Graphs", null);
        MenuButton treeMapsDemo = new MenuButton(this, "Tree Maps", "Tree Map Implementations", null);
        MenuButton dialsDemo = new MenuButton(this, "Dials", "Radials and Dials", null);
        MenuButton parentosDemo = new MenuButton(this, "Parentos", "Your basic Parento Graph", null);

        MenuButton animationDemo = new MenuButton(this, "Animating Your Graphs", "How to animate your graphs, for example - over time.", null);

        accordionComponents.add(accordionHeader);

        d.add(genericDemo);
        d.add(genericDemo2);
        d.add(markersDemo);
        d.add(dragAndDropDemo);
        d.add(labelDemo);
        d.add(zoomingDemo);

        d.add(HorizontalRule.getInstance());

        d.add(lineGraphsDemo);
        d.add(barGraphsDemo);
        d.add(areaGraphsDemo);
        d.add(combinationGraphDemo);

        d.add(HorizontalRule.getInstance());

        d.add(pieDemo);
        d.add(candleStickDemo);

        d.add(HorizontalRule.getInstance());

        d.add(bubblesDemo);
        d.add(treeMapsDemo);
        d.add(dialsDemo);
        d.add(dialsDemo);
        d.add(parentosDemo);
        d.add(HorizontalRule.getInstance());
        d.add(animationDemo);

        accordionComponents.add(d);
        return accordionComponents;
    }

    private ArrayList<Component> getJQueryTreeAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "Tree Implementations");
        Div d = new Div();

        MenuButton tree1Demo = new MenuButton(this, "D3 Reingold-Trefield Tree", "A full suite of tree functionalities", new ReingoldTreeDemo());
        MenuButton tree2Demo = new MenuButton(this, "D3 Radial Reingold-Trefield Tree", "A full suite of tree functionalities as a radial", new RadialTreeDemo());

        MenuButton draggableDemo = new MenuButton(this, "JWTree", "The jsTree Implementation. Solves pretty much all needs", null);
        MenuButton scrollpaneDemo = new MenuButton(this, "JWTreed", "The Treed Implementations. Graphically display tree's ", null);
        MenuButton droppableDemo = new MenuButton(this, "JW Tree Multi-Select", "JQuery Data Tables Implementation", null);
        MenuButton resizableDemo = new MenuButton(this, "JW Horizontal Tree", "The JW Tree ", null);
        MenuButton selectableDemo = new MenuButton(this, "JW Sortable Lists", "These trees are rendered as indented links and are very flexible", null);

        d.add(tree1Demo);
        d.add(tree2Demo);
        d.add(draggableDemo);
        d.add(scrollpaneDemo);
        d.add(droppableDemo);
        d.add(resizableDemo);
        d.add(selectableDemo);

        accordionComponents.add(accordionHeader);
        accordionComponents.add(d);
        return accordionComponents;
    }

    private ArrayList<Component> getJQueryMiscAccordion()
    {
        ArrayList<Component> accordionComponents = new ArrayList<>();
        HeaderText accordionHeader = new HeaderText(HeaderTypes.H3, "Miscellaneous");
        Div d = new Div();

        MenuButton draggableDemo = new MenuButton(this, "JWTree", "The Tree Implementations", null);
        MenuButton scrollpaneDemo = new MenuButton(this, "JScrollPane", "The Tree Implementations", null);
        MenuButton droppableDemo = new MenuButton(this, "Data Tables", "JQuery Data Tables Implementation", null);
        MenuButton resizableDemo = new MenuButton(this, "Data Binding", "Data Binding with EJB", null);
        MenuButton selectableDemo = new MenuButton(this, "Interactive Image Maps", "Lots of plugins thrown together for the most powerful image mapping functionality", null);
        MenuButton gradientDemo = new MenuButton(this, "Gradients", "Lots of plugins thrown together for the most powerful image mapping functionality", null);

        d.add(draggableDemo);
        d.add(scrollpaneDemo);
        d.add(droppableDemo);
        d.add(resizableDemo);
        d.add(selectableDemo);
        d.add(gradientDemo);

        accordionComponents.add(accordionHeader);
        accordionComponents.add(d);
        return accordionComponents;
    }

    public DemoApplicationBody getBody()
    {
        return body;
    }

}
