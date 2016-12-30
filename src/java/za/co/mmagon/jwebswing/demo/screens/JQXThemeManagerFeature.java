package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.components.jqxwidgets.navbar.JQXNavBarFeatures;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelFeatures;
import za.co.mmagon.jwebswing.demo.ThemeManagerSwitcherReferencePool;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class JQXThemeManagerFeature extends Feature<JavaScriptPart, Feature> implements GlobalFeatures, JQXPanelFeatures, JQXNavBarFeatures
{

    private static final long serialVersionUID = 1L;
    private JQXThemeManagerScreen tms;

    public JQXThemeManagerFeature(JQXThemeManagerScreen tms)
    {
        super("ThemeManagerFeature");
        this.tms = tms;
        getJavascriptReferences().add(ThemeManagerSwitcherReferencePool.JQueryThemeSwitcher.getReference());

    }

    @Override
    public void assignFunctionsToComponent()
    {
        ArrayList<String> queries = new ArrayList();
        addQuery("initthemes('/../bower_components/jqwidgets/jqwidgets/styles');" + getNewLine());
        //addQuery(tms.getIDJQuery() + "initthemes('bower_components/jqwidgets/jqwidgets/styles');" + getNewLine());
        
    }
}
