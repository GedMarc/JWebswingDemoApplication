package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import za.co.mmagon.jwebswing.components.jqueryui.button.JQUIButton;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemes;
import za.co.mmagon.jwebswing.components.jqxwidgets.radiobutton.JQXRadioButtonAttributes;
import za.co.mmagon.jwebswing.components.jqxwidgets.themes.JQXWidgetThemes;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.components.DemoRadioButton;
import za.co.mmagon.jwebswing.htmlbuilder.css.themes.Theme;
import za.co.mmagon.jwebswing.utilities.ComponentUtils;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class JQXThemeManagerScreen extends DemoPanel //<GlobalChildren, NoAttributes, GlobalFeatures, ThemeManagerScreen>
{

    private static final long serialVersionUID = 1L;

    private final ArrayList<Theme> themes = new ArrayList();
    private final HashMap<Theme, JQUIButton> themeButtons = new HashMap<>();
    private static final Theme sorter = JQUIThemes.Lightness.getTheme();
    private JQXThemeManagerFeature feature = new JQXThemeManagerFeature(this);

    public JQXThemeManagerScreen()
    {
        registerDefaultThemes();
        buildThemeButtons();
        addFeature(feature);

    }

    private void buildThemeButtons()
    {
        for (Iterator<Theme> iterator = themes.iterator(); iterator.hasNext();)
        {
            Theme next = iterator.next();
            DemoRadioButton themeButton = new DemoRadioButton(next.getName());
            if (!next.getCssReferences().isEmpty())
            {
                //themeButton.addAttribute(GlobalAttributes.JWType, next.getCssReferences().get(0).toString());
            }
            themeButton.addAttribute(JQXRadioButtonAttributes.Value, next.getClassName());
            ComponentUtils.removeAllMargins(themeButton);
            themeButton.addClass("uiThemeSwitchButton");
            add(themeButton);
        }
    }

    private void registerDefaultThemes()
    {
        for (JQXWidgetThemes themeItem : JQXWidgetThemes.values())
        {
            addTheme(themeItem.getTheme());
        }
        themes.sort(sorter);
    }

    /**
     * Adds a theme to this managers collection
     *
     * @param theme The theme to add to this collection
     */
    public JQXThemeManagerScreen addTheme(Theme theme)
    {
        themes.add(theme);
        return this;
    }
}
