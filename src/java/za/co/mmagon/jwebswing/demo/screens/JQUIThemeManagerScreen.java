package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import java.util.Iterator;
import za.co.mmagon.jwebswing.base.html.Table;
import za.co.mmagon.jwebswing.base.html.TableBodyGroup;
import za.co.mmagon.jwebswing.base.html.TableCell;
import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemes;
import za.co.mmagon.jwebswing.components.jqxwidgets.radiobutton.JQXRadioButtonAttributes;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.components.DemoRadioButton;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.themes.Theme;
import za.co.mmagon.jwebswing.utilities.ComponentUtils;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class JQUIThemeManagerScreen extends DemoPanel
{

    private static final long serialVersionUID = 1L;

    private final ArrayList<Theme> themes = new ArrayList();
    private static final Theme sorter = JQUIThemes.Lightness.getTheme();
    private JQUIThemeManagerFeature feature = new JQUIThemeManagerFeature(this);

    private Table displayTable = new Table();
    private TableBodyGroup displayTableBody = new TableBodyGroup();

    public JQUIThemeManagerScreen()
    {
        registerDefaultThemes();
        buildThemeButtons();
        addFeature(feature);

        displayTable.add(displayTableBody);
        displayTable.setWidth(MeasurementCSSImpl.hundredPercent);
        add(displayTable);
    }

    private void buildThemeButtons()
    {
        for (Iterator<Theme> iterator = themes.iterator(); iterator.hasNext();)
        {
            TableRow newRow = new TableRow();
            TableCell newCell = new TableCell();
            Theme next = iterator.next();
            DemoRadioButton themeButton = new DemoRadioButton(next.getName());
            themeButton.addAttribute(GlobalAttributes.JWType, next.getCssReferences().get(0).toString());
            themeButton.addAttribute(JQXRadioButtonAttributes.Value, next.getClassName());
            ComponentUtils.removeAllMargins(themeButton);
            themeButton.addClass("uiThemeSwitchButton");
            newCell.add(themeButton);
            newRow.add(newCell);
            displayTableBody.add(newRow);
        }
    }

    private void registerDefaultThemes()
    {
        for (JQUIThemes uiTheme : JQUIThemes.values())
        {
            addTheme(uiTheme.getTheme());
        }
        themes.sort(sorter);
    }

    /**
     * Adds a theme to this managers collection
     *
     * @param theme The theme to add to this collection
     */
    public JQUIThemeManagerScreen addTheme(Theme theme)
    {
        themes.add(theme);
        return this;
    }
}
