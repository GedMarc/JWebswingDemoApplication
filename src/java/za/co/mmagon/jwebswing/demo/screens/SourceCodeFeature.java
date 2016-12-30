package za.co.mmagon.jwebswing.demo.screens;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.components.jqxwidgets.panel.JQXPanelFeatures;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class SourceCodeFeature extends Feature<JavaScriptPart, Feature> implements JQXPanelFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;
    private SourceCodeScreen scs;

    public SourceCodeFeature(SourceCodeScreen scs)
    {
        super("SourceCodeLoaderFeature");
        this.scs = scs;
        getJavascriptReferences().add(new JavascriptReference("SCL", 1.0, "sourceCodeFetcher/SourceCodeLoad.js", "sourceCodeFetcher/SourceCodeLoad.js"));
    }

    @Override
    public void assignFunctionsToComponent()
    {
        addQuery("$('.sourceCodeButton').sourceCodeSwitcher();" + getNewLine());
        addQuery("$('#prettySelect').sourceCodeThemeSwitcher();" + getNewLine());
        //strings.add("$('.sourceCodeButtons') loadNewSourceCode('" + component.getCanonicalName().replace('.', '/') + "');" + getNewLine());
    }
}
