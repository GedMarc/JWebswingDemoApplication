package za.co.mmagon.jwebswing.demo.screens;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.components.jqxwidgets.navbar.JQXNavBarFeatures;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelFeatures;
import za.co.mmagon.jwebswing.demo.ThemeManagerSwitcherReferencePool;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class SourceCodeThemeFeature extends Feature<JavaScriptPart, Feature> implements JQXNavBarFeatures, JQXPanelFeatures
{

    private static final long serialVersionUID = 1L;
    private SourceCodeThemeScreen tms;

    public SourceCodeThemeFeature(SourceCodeThemeScreen tms)
    {
        super("ThemeManagerFeature");
        this.tms = tms;
        getJavascriptReferences().add(ThemeManagerSwitcherReferencePool.JQueryThemeSwitcher.getReference());

    }

    @Override
    public void assignFunctionsToComponent()
    {
        addQuery(tms.getJQueryID() + "themeswitcher();" + getNewLine());
        
    }
}
