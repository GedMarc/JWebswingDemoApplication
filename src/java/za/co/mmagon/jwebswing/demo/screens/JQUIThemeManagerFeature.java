package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.components.jqxwidgets.navbar.JQXNavBarFeatures;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelFeatures;
import za.co.mmagon.jwebswing.demo.ThemeManagerSwitcherReferencePool;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class JQUIThemeManagerFeature extends Feature implements JQXNavBarFeatures, JQXPanelFeatures
{

    private static final long serialVersionUID = 1L;
    private JQUIThemeManagerScreen tms;

    public JQUIThemeManagerFeature(JQUIThemeManagerScreen tms)
    {
        super("ThemeManagerFeature");
        this.tms = tms;
        getJavascriptReferences().add(ThemeManagerSwitcherReferencePool.JQueryThemeSwitcher.getReference());

    }

    @Override
    public void assignFunctionsToComponent()
    {
        ArrayList<String> queries = new ArrayList();
        addQuery(tms.getJQueryID() + "themeswitcher();" + getNewLine());
        
    }
}
