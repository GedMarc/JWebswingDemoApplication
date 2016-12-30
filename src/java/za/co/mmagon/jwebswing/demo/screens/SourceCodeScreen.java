package za.co.mmagon.jwebswing.demo.screens;

import java.util.HashMap;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.Option;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.OptionAttributes;
import za.co.mmagon.jwebswing.components.google.sourceprettify.JQSourceCodePrettify;
import za.co.mmagon.jwebswing.components.google.sourceprettify.SourceCodePrettifyThemes;
import za.co.mmagon.jwebswing.components.jqxwidgets.dropdownlist.JQXDropDownListSelectMenu;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanel;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelFeature;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelSizeModes;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.components.DemoButton;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.htmlbuilder.css.CSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextAlignments;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class SourceCodeScreen extends DemoPanel
{

    private static final long serialVersionUID = 1L;
    private final HashMap<String, Class> screensToGenerate = new HashMap<>();
    @CSS(Text_Align = TextAlignments.Center)
    private final JQXPanel buttonPanel = new JQXPanel();
    private final JQSourceCodePrettify sourceDisplay = new JQSourceCodePrettify();

    JQXPanelFeature feat = new JQXPanelFeature(sourceDisplay);

    public SourceCodeScreen()
    {
        setID("sourceScreen");
        setWidth(MeasurementCSSImpl.hundredPercent);
        setHeight(MeasurementCSSImpl.hundredPercent);
        setOverflow(Overflows.Hidden);
        buttonPanel.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        buttonPanel.setID("actualSource");
        buttonPanel.getOptions().setHeight(60);
        buttonPanel.setHeight(60);
        buttonPanel.getOptions().setWidth(MeasurementCSSImpl.hundredPercent);
        buttonPanel.setMarginTop(new MeasurementCSSImpl(2));
        buttonPanel.addClass("sourceCodeButton");

        sourceDisplay.setID("sourceCode");
        sourceDisplay.setSourceCodePrettifyTheme(SourceCodePrettifyThemes.Sons_Of_Obsidian);
        addFeature(new SourceCodeFeature(this));

        sourceDisplay.setHeight(MeasurementCSSImpl.hundredPercent);

        sourceDisplay.setOverflow(Overflows.Scroll);

        //sourceDisplay.addFeature(feat);
        feat.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        //displayPanel.getOptions().setAutoUpdate(true);
        feat.getOptions().setSizeMode(JQXPanelSizeModes.fixed);
        feat.getOptions().setWidth(MeasurementCSSImpl.hundredPercent);
        feat.getOptions().setHeight(MeasurementCSSImpl.ninetyThreePercent);

        za.co.mmagon.jwebswing.utilities.ComponentUtils.removeAllMargins(sourceDisplay);

        add(buttonPanel);
        add(sourceDisplay);
    }

    private JQXDropDownListSelectMenu getThemeSelector()
    {
        JQXDropDownListSelectMenu selectMenu = new JQXDropDownListSelectMenu();
        selectMenu.setID("prettySelect");
        selectMenu.getOptions().setWidth(160);
        SourceCodePrettifyThemes[] themes = SourceCodePrettifyThemes.values();
        for (SourceCodePrettifyThemes theme : themes)
        {

            Option opt = new Option(theme.name().replace('_', ' '));
            opt.addAttribute(OptionAttributes.Value, theme.getCssReference());
            selectMenu.add(opt);

            ListItem li = new ListItem(theme.name().replace('_', ' '));
            li.addAttribute(GlobalAttributes.Value, theme.getCssReference());
        };

        return selectMenu;
    }

    public void addButton(String name, Class comp)
    {
        screensToGenerate.put(name, comp);
        DemoButton button = new DemoButton(name);
        button.addAttribute(ButtonAttributes.Value, comp.getCanonicalName().replace('.', '/'));
        buttonPanel.add(button);
    }
}
