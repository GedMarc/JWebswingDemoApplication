package za.co.mmagon.jwebswing.demo.screens;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.demo.ThemeManagerSwitcherReferencePool;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class ThemeManagerFeature extends Feature<JavaScriptPart, Feature>
{

    private static final long serialVersionUID = 1L;
    private JQUIThemeManagerScreen tms;

    public ThemeManagerFeature(JQUIThemeManagerScreen tms)
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
