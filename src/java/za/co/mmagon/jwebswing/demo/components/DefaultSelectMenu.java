/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.components.jqxwidgets.JQXSearchModes;
import za.co.mmagon.jwebswing.components.jqxwidgets.dropdownlist.JQXDropDownList;
import za.co.mmagon.jwebswing.components.jqxwidgets.dropdownlist.JQXDropDownListChildren;
import za.co.mmagon.jwebswing.components.jqxwidgets.dropdownlist.JQXDropDownListSelectMenuFeature;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DefaultSelectMenu extends JQXDropDownList
{

    private static final long serialVersionUID = 1L;

    /**
     * The default large button
     */
    public DefaultSelectMenu()
    {
        super();
        //getFeatures().clear();
        //addClass(def);
        //add(def);
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
        getOptions().setFilterable(true);
        getOptions().setSearchMode(JQXSearchModes.StartsWithIgnoreCase);
    }
    private final SelectMenuDefaults def = new SelectMenuDefaults();

    public static class SelectMenuDefaults extends CSSComponent implements JQXDropDownListChildren
    {

        JQXDropDownListSelectMenuFeature feat = new JQXDropDownListSelectMenuFeature(this);

        public SelectMenuDefaults()
        { 
            super("selectMenuDefault");
            feat.getOptions().setTheme(DemoApplicationBody.jqxTheme);
            feat.getOptions().setFilterable(true);
            feat.getOptions().setSearchMode(JQXSearchModes.StartsWithIgnoreCase);
            addFeature(feat);
        }

    }

}
