package za.co.mmagon.jwebswing.demo.screens.layout;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.components.jquerylayout.layout.JQLayout;
import za.co.mmagon.jwebswing.components.jquerylayout.layout.JQLayoutDiv;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordion;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordionHeightStyle;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.screens.CssOptionsScreen;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;
import za.co.mmagon.jwebswing.utilities.ComponentUtils;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DemoInnerLayout extends JQLayout
{

    private final JQUIAccordion optionsAccordian = new JQUIAccordion(JQUIAccordionHeightStyle.Fill);

    private final Div componentOptions = new Div();

    //  private final JQUIAccordion.AccordionTab cssAccordionTab;
    private CssOptionsScreen cssOptions;

    private Div stylingOptionOpenButton;
    private Div stylingOptionsCloseButton;

    public DemoInnerLayout(JQLayoutDiv b)
    {
        super(b);
        getOptions().getDefaults().setResizerClass("ui-state-hover");
        getOptions().getDefaults().setTogglerClass("ui-state-active");
        stylingOptionOpenButton = new Div();
        stylingOptionOpenButton.setTiny(true);
        stylingOptionOpenButton.setText("Close Styling Manager");
        stylingOptionsCloseButton = new Div();
        stylingOptionsCloseButton.setTiny(true);
        stylingOptionsCloseButton.setText("Open Styling Manager");
        stylingOptionOpenButton.addClass("vertical270deg");
        stylingOptionsCloseButton.addClass("vertical270deg");

        stylingOptionOpenButton.addAttribute(GlobalAttributes.Style, "font-size:12px;width:100%;height:50%");
        stylingOptionsCloseButton.addAttribute(GlobalAttributes.Style, "font-size:12px;width:100%;height:50%");

        getOptions().getEast().setTogglerContent_closed(stylingOptionsCloseButton);
        getOptions().getEast().setTogglerContent_open(stylingOptionOpenButton);
        getOptions().getEast().setTogglerClass(JQUIThemeBlocks.UI_State_Highlight.toString());

        getOptions().getEast().setTogglerLength_closed(450);
        getOptions().getEast().setTogglerLength_open(450);

        getCenter().addHeader("A True Java Only Web Framework");
        getEast().getContentDiv().add(cssOptions = new CssOptionsScreen());
        getEast().getContentDiv().getCss().getDisplay().setOverflow(Overflows.Hidden);
        optionsAccordian.getCss().getDisplay().setOverflow(Overflows.Hidden);
        getEast().getCss().getDisplay().setOverflow(Overflows.Hidden);
        componentOptions.setID("compOptions");

        getEast().addHeader("Options");
        getOptions().getEast().setSlidable(false);
        getOptions().getEast().setInitClosed(true);
        getOptions().getEast().setMinSize(350);
        getOptions().getEast().setSpacing_closed(35);
        getOptions().getEast().setSpacing_open(35);

        //getEast().addThemes();

        getOptions().getNorth().setSpacing_closed(0);
        getOptions().getNorth().setSpacing_open(0);
        //getNorth().addThemes();

        getCenter().getContentDiv().setID("contentDiv");

        getCenter().getContentDiv().add(updateDiv = new Div());
        updateDiv.setID("UpdateDiv");
        ComponentUtils.setFullScreen(updateDiv);

    }
    private Div updateDiv;

    public void changeCenterDiv(Component d)
    {
        updateDiv.getChildren().clear();
        updateDiv.setID("UpdateDiv");
        updateDiv.add(d);
    }

    public void changeComponentOptionsDiv(Component d)
    {
        componentOptions.getChildren().clear();
        d.setID("compOptions");
        componentOptions.add(d);
    }
}
