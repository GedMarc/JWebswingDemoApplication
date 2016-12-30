package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import java.util.Iterator;
import za.co.mmagon.jwebswing.base.html.Table;
import za.co.mmagon.jwebswing.base.html.TableBodyGroup;
import za.co.mmagon.jwebswing.base.html.TableCell;
import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.components.google.sourceprettify.SourceCodePrettifyThemes;
import za.co.mmagon.jwebswing.components.jqxwidgets.radiobutton.JQXRadioButtonAttributes;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.components.DemoRadioButton;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementPercentages;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class SourceCodeThemeScreen extends DemoPanel
{

    private static final long serialVersionUID = 1L;

    private final ArrayList<SourceCodePrettifyThemes> themes = new ArrayList();
    private SourceCodeThemeFeature feature = new SourceCodeThemeFeature(this);

    private Table displayTable = new Table();
    private TableBodyGroup displayTableBody = new TableBodyGroup();

    public SourceCodeThemeScreen()
    {
        registerDefaultThemes(); 
        buildThemeButtons();
        addFeature(feature);

        displayTable.add(displayTableBody);
        displayTable.getCss().getDimensions().setWidth(MeasurementPercentages.hundredPercent);
        add(displayTable);
    }

    private void buildThemeButtons()
    {
        for (Iterator<SourceCodePrettifyThemes> iterator = themes.iterator(); iterator.hasNext();)
        {
            TableRow newRow = new TableRow();
            TableCell newCell = new TableCell();
            SourceCodePrettifyThemes next = iterator.next();
            DemoRadioButton themeButton = new DemoRadioButton(next.name());
            themeButton.addAttribute(GlobalAttributes.JWType, next.getCssReference());
            themeButton.addAttribute(JQXRadioButtonAttributes.Value, next.toString());
            themeButton.getCss().getDimensions().setWidth(MeasurementPercentages.hundredPercent);
            themeButton.addClass("prettySelect");

            newCell.add(themeButton);
            newRow.add(newCell);
            displayTableBody.add(newRow);
        }
    }

    private void registerDefaultThemes()
    {
        for (SourceCodePrettifyThemes uiTheme : SourceCodePrettifyThemes.values())
        {
            addTheme(uiTheme);
        }
    }

    /**
     * Adds a theme to this managers collection
     *
     * @param theme The theme to add to this collection
     */
    public void addTheme(SourceCodePrettifyThemes theme)
    {
        themes.add(theme);
    }
}
