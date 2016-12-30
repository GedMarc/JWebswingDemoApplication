/*
 * Copyright (C) 2016 GedMarc
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package za.co.mmagon.jwebswing.demo.screens;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.TableBodyGroup;
import za.co.mmagon.jwebswing.base.html.TableCell;
import za.co.mmagon.jwebswing.base.html.TableHeaderGroup;
import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.jqdatatable.JQUITable;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButtonTemplates;
import za.co.mmagon.jwebswing.components.jqxwidgets.dataadapter.JQXDataAdapter;
import za.co.mmagon.jwebswing.components.jqxwidgets.dropdownlist.JQXDropDownListNameValuePair;
import za.co.mmagon.jwebswing.components.jqxwidgets.navigationbar.JQXNavigationBar;
import za.co.mmagon.jwebswing.components.jqxwidgets.numberinput.JQXNumberInputOptionsModes;
import za.co.mmagon.jwebswing.components.jqxwidgets.slider.JQXSlider;
import za.co.mmagon.jwebswing.components.jqxwidgets.slider.JQXSliderModes;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.components.DefaultSelectMenu;
import za.co.mmagon.jwebswing.demo.components.DemoDefaultSpinner;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.components.DemoInputText;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementPercentages;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavascriptFunction;
import za.co.mmagon.jwebswing.utilities.ComponentUtils;
import za.co.mmagon.jwebswing.utilities.TextUtilities;
import za.co.mmagon.logger.LogFactory;

/**
 * The base class for component options
 *
 * @author GedMarc
 * @since 29 Mar 2016
 */
public class ComponentOptionsScreen extends DemoPanel
{

    private static final long serialVersionUID = 1L;
    private static final HeaderText header = new DemoHeader(HeaderTypes.H1, "Properties");
    private JQXNavigationBar naviRibbonBar;

    public ComponentOptionsScreen()
    {
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
        naviRibbonBar = new JQXNavigationBar();
        naviRibbonBar.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        naviRibbonBar.getOptions().setWidth(MeasurementPercentages.hundredPercent);
        naviRibbonBar.getOptions().setHeight(MeasurementPercentages.hundredPercent);
        add(naviRibbonBar);
    }

    private ArrayList<Class> visibleClasses = new ArrayList<>();

    private TableRow generateTableRow(Field f, JavaScriptPart o)
    {
        f.setAccessible(true);
        TableRow tr = new TableRow();
        //tr.setMargin_Left(new MeasurementCSSImpl(4));
        TableCell tcName = new TableCell(TextUtilities.cleanCamelCaseName(f.getName()).toString());
        
       // tcName.setPaddingRight(new MeasurementCSSImpl(10));
        TableCell tcValue = new TableCell();

     //   tcName.setTextAlign(TextAlignments.Right);

        ComponentUtils.setWidth100Percent(tr);
        ComponentUtils.setWidth50Percent(tcName);
        ComponentUtils.setWidth50Percent(tcValue);

        Component valueComponent;

        if (f.getType().isEnum())
        {
            //log.info("F is enum [" + f.getName() + "]");
            DefaultSelectMenu newSelectMenu = new DefaultSelectMenu();
            //labelCell.add(field.getName().replace("_", " "));
            JQXDataAdapter enumAdapter = getAdapterFromEnum(f.getType());
            //TODO
//            newSelectMenu.getOptions().setSource((enumAdapter));

            valueComponent = newSelectMenu;
        }
        else if (JavascriptFunction.class.isAssignableFrom(f.getType()))
        {
            //log.info("F is options script [" + f.getName() + "]");
            DemoInputText dit = new DemoInputText();
            dit.getOptions().setPlaceHolder("<JS Function>");
            //dit.getOptions().setDisabled(true);
            valueComponent = dit;
        }
        else if (JavaScriptPart.class.isAssignableFrom(f.getType()))
        {
            DemoInputText dit = new DemoInputText();
            dit.getOptions().setPlaceHolder("" + f.getType().getSimpleName() + "");
            if (!visibleClasses.contains(f.getType()))
            {
                try
                {
                    visibleClasses.add(f.getType());
                    //Add group to the ribbon bar
                    addNavbarGroup("<i>" + f.getType().getSimpleName() + "</i>", (JavaScriptPart) f.getType().newInstance());
                }
                catch (InstantiationException ex)
                {
                    java.util.logging.Logger.getLogger(ComponentOptionsScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (IllegalAccessException ex)
                {
                    java.util.logging.Logger.getLogger(ComponentOptionsScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            //dit.getOptions().setDisabled(true);
            valueComponent = dit;
        }
        else if (Component.class.isAssignableFrom(f.getType()))
        {
            //log.info("F is component script [" + f.getName() + "]");
            DemoInputText dit = new DemoInputText();
            dit.getOptions().setPlaceHolder("<Component>");
            //dit.setTooltip("Component References are usually selectors, where any CSS selector can be used", false);
            //dit.getOptions().setDisabled(true);
            valueComponent = dit;
        }
        else
        {
            switch (f.getType().getSimpleName())
            {
                case "Boolean":
                {
                    valueComponent = new JQXSlider();
                    JQXSlider.class.cast(valueComponent).getOptions().setMin(0);
                    JQXSlider.class.cast(valueComponent).getOptions().setMax(1);
                    JQXSlider.class.cast(valueComponent).getOptions().setStep(1);
                    JQXSlider.class.cast(valueComponent).getOptions().setMode(JQXSliderModes.Fixed);
                    JQXSlider.class.cast(valueComponent).getOptions().setTheme(DemoApplicationBody.jqxTheme);
                    JQXSlider.class.cast(valueComponent).getOptions().setTemplate(JQXButtonTemplates.Primary);
                    JQXSlider.class.cast(valueComponent).getOptions().setWidth(190);
                    break;
                }
                case "Integer":
                {
                    DemoDefaultSpinner spin = new DemoDefaultSpinner();
                    spin.getOptions().setDecimalDigits(0);
                    valueComponent = spin;
                    break;
                }
                case "Double":
                {
                    DemoDefaultSpinner spin = new DemoDefaultSpinner(true);
                    spin.getOptions().setDecimalDigits(2);
                    spin.getOptions().setDigits(3);
                    spin.getOptions().setInputMode(JQXNumberInputOptionsModes.Advanced);
                    valueComponent = spin;
                    break;
                }
                case "String":
                {
                    DemoInputText dit = new DemoInputText();
                    dit.getOptions().setPlaceHolder("CSS Class");
                    valueComponent = dit;
                    break;

                }
                default:
                {
                    log.info("Field to generate : " + f.getName() + " - return type [" + f.getType().getSimpleName() + "];");
                    valueComponent = new DemoInputText();
                    break;
                }
            }
        }

        tcValue.add(valueComponent);

        tr.add(tcName);
        tr.add(tcValue);

        return tr;
    }

    private static final Logger log = LogFactory.getLog("Component Options Screen");

    public void configureDisplayedComponents(String header, JavaScriptPart componentOptions)
    {
        visibleClasses.clear();
        naviRibbonBar.getChildren().clear();
        addNavbarGroup(header, componentOptions);
    }

    private void addNavbarGroup(String header, JavaScriptPart componentOptions)
    {
        TableHeaderGroup thg = new TableHeaderGroup();
        TableBodyGroup tbg = new TableBodyGroup();
        JQUITable displayTable = new JQUITable(thg);

        DemoPanel demoPanel = new DemoPanel();
        demoPanel.add(displayTable);
        visibleClasses.add(componentOptions.getClass());
        naviRibbonBar.addGroup(new JQXNavigationBar.NavigationBarGroup(header, demoPanel));

        displayTable.add(thg);
        displayTable.add(tbg);

        Field[] fields = componentOptions.getClass().getDeclaredFields();
        Arrays.sort(fields, (Field o1, Field o2) -> o1.getName().compareTo(o2.getName()));

        for (Field field : fields)
        {
            if (!field.isAnnotationPresent(JsonIgnore.class))
            {
                if (!field.getName().contains("serialVersion"))
                {
                    tbg.add(generateTableRow(field, componentOptions));
                }
            }
        }

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

    private HashMap<Class, JQXDataAdapter> enumeratedDataAdapters = new HashMap<>();

}
