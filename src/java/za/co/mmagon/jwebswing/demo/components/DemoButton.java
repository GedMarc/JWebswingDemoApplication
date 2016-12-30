package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.base.html.interfaces.children.NoChildren;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButton;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButtonFeature;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.styles.DemoGeneralStyleLibrary;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DemoButton extends JQXButton
{

    private static final long serialVersionUID = 1L;

    /**
     * The default large button
     */
    public DemoButton(String text)
    {
        super(text);
        getFeatures().clear();
        addClass(css);
        add(css);
    }
    private static final DefaultButtonCSSClass css = new DefaultButtonCSSClass();

    public static class DefaultButtonCSSClass extends CSSComponent implements NoChildren
    {

        private JQXButtonFeature feat = new JQXButtonFeature(this);

        public DefaultButtonCSSClass()
        {
            super("defaultButton");
            addClass(DemoGeneralStyleLibrary.DefaultButton.getCssClass());
            feat.getOptions().setTheme(DemoApplicationBody.jqxTheme);
            addFeature(feat);
        }
    }

}
