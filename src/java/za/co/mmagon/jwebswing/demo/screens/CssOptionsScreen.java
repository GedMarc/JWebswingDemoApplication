package za.co.mmagon.jwebswing.demo.screens;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import za.co.mmagon.jwebswing.base.html.Table;
import za.co.mmagon.jwebswing.base.html.TableBodyGroup;
import za.co.mmagon.jwebswing.base.html.TableCell;
import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.components.jqxwidgets.dataadapter.JQXDataAdapter;
import za.co.mmagon.jwebswing.components.jqxwidgets.dropdownlist.JQXDropDownListNameValuePair;
import za.co.mmagon.jwebswing.components.jqxwidgets.navigationbar.JQXNavigationBar;
import za.co.mmagon.jwebswing.components.jqxwidgets.navigationbar.JQXNavigationBar.NavigationBarGroup;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.components.DefaultSelectMenu;
import za.co.mmagon.jwebswing.demo.components.DemoColourPicker;
import za.co.mmagon.jwebswing.demo.components.DemoDefaultSpinner;
import za.co.mmagon.jwebswing.demo.components.DemoInputText;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.htmlbuilder.css.backgrounds.BackgroundCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.borders.BorderCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.DisplayCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.fonts.FontsCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.heightwidth.HeightWidthCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.lists.ListCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.margins.MarginsCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementPercentages;
import za.co.mmagon.jwebswing.htmlbuilder.css.outline.OutlineCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.padding.PaddingCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.tables.TableCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextCSSImpl;
import za.co.mmagon.jwebswing.utilities.ComponentUtils;
import za.co.mmagon.jwebswing.utilities.TextUtilities;

/**
 *
 * @author GedMarc
 * @since 28 Apr 2015
 */
public class CssOptionsScreen extends DemoPanel
{

    private static final long serialVersionUID = 1L;
    private HashMap<Class, JQXDataAdapter> enumeratedDataAdapters = new HashMap<>();
    private JQXNavigationBar navBar = new JQXNavigationBar();

    public CssOptionsScreen()
    {
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
        //setOverflow(Overflows.Hidden);
        navBar.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        add(navBar);
        navBar.getOptions().setWidth(MeasurementPercentages.hundredPercent);
        navBar.getOptions().setHeight(MeasurementPercentages.hundredPercent);

        addNavigationGroup("Background Settings", new BackgroundCSSImpl());
        addNavigationGroup("Border Settings", new BorderCSSImpl());
        addNavigationGroup("Margin Settings", new MarginsCSSImpl());
        addNavigationGroup("Padding Settings", new PaddingCSSImpl());
        addNavigationGroup("Height/Width Settings", new HeightWidthCSSImpl());
        addNavigationGroup("Text Settings", new TextCSSImpl());
        addNavigationGroup("Font Settings", new FontsCSSImpl());
        addNavigationGroup("Lists Settings", new ListCSSImpl());
        addNavigationGroup("Table Settings", new TableCSSImpl());
        addNavigationGroup("Outline Settings", new OutlineCSSImpl());
        addNavigationGroup("Display Settings", new DisplayCSSImpl());

    }

    /**
     * Takes an enumeration and builds an adapter from it
     *
     * @param e The enum pack to build
     * @return
     */
    private JQXDataAdapter buildAdapterFromEnum(Class e)
    {
        JQXDataAdapter newAdapter = new JQXDataAdapter(this);
        newAdapter.setDataAdapterID(e.getSimpleName().toLowerCase());
        newAdapter.getOptions().setLocaldata(new JQXDropDownListNameValuePair(), newAdapter);
        EnumSet allEnums = EnumSet.allOf(e);
        for (Iterator iterator = allEnums.iterator(); iterator.hasNext();)
        {
            Enum next = (Enum) iterator.next();
            ArrayList<JQXDropDownListNameValuePair.JQXDropDownListData> data
                    = JQXDropDownListNameValuePair.class.cast(newAdapter.getOptions().getLocaldata()).getValues();
            data.add(new JQXDropDownListNameValuePair.JQXDropDownListData(next.name(), TextUtilities.cleanAttributeName(next.toString())));
        }
        return newAdapter;
    }

    private JQXDataAdapter getAdapterFromEnum(Class e)
    {
        if (enumeratedDataAdapters.containsKey(e))
        {
            return enumeratedDataAdapters.get(e);
        }
        else
        {
            enumeratedDataAdapters.put(e, buildAdapterFromEnum(e));
        }
        return enumeratedDataAdapters.get(e);
    }

    private void addNavigationGroup(String title, Object implementationClass)
    {
        if (implementationClass == null)
        {
            return;
        }

        DemoPanel newDemoPanel = new DemoPanel();
        Table newTable = new Table();
        newTable.setCellPadding(0);
        newTable.setCellSpacing(0);
        TableBodyGroup tbg = new TableBodyGroup();

        newDemoPanel.add(newTable);
        newTable.add(tbg);

        for (Field field : implementationClass.getClass().getDeclaredFields())
        {
            addFieldToComponent(implementationClass, field, tbg);
        }

        navBar.addGroup(new NavigationBarGroup(title, newDemoPanel));

    }

    private void addFieldToComponent(Object o, Field field, TableBodyGroup tableBody)
    {
        Class clazz = field.getType();
        field.setAccessible(true);
        TableRow newRow = new TableRow();
        TableCell labelCell = new TableCell();
        //labelCell.setPaddingRight(new MeasurementCSSImpl(10));
        //labelCell.setTextAlign(TextAlignments.Right);
        TableCell valueCell = new TableCell();
        newRow.add(labelCell);
        newRow.add(valueCell);
        ComponentUtils.setWidth100Percent(newRow);
        ComponentUtils.setWidth50Percent(labelCell);
        ComponentUtils.setWidth50Percent(valueCell);

        if (clazz.isEnum())
        {
            DefaultSelectMenu newSelectMenu = new DefaultSelectMenu();
            labelCell.add(field.getName().replace("_", " "));
            valueCell.add(newSelectMenu);
            JQXDataAdapter enumAdapter = getAdapterFromEnum(clazz);
            newSelectMenu.getOptions().setSource((enumAdapter));

        }
        else if (clazz.isAssignableFrom(MeasurementCSSImpl.class))
        {
            DemoDefaultSpinner spin = new DemoDefaultSpinner();
            labelCell.add(field.getName().replace("_", " "));
            valueCell.add(spin);
        }
        else if (clazz.isAssignableFrom(ColourCSS.class))
        {
            DemoColourPicker cp = new DemoColourPicker();
            labelCell.add(field.getName().replace("_", " "));
            valueCell.add(cp);
        }
        else
        {
            DemoInputText js = new DemoInputText();
            labelCell.add(field.getName().replace("_", " "));
            valueCell.add(js);
        }

        tableBody.add(newRow);
    }
}
