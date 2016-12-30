package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.components.jqxwidgets.radiobutton.JQXRadioButton;
import za.co.mmagon.jwebswing.components.jqxwidgets.radiobutton.JQXRadioButtonFeature;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.TextCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.text.VerticalAlignments;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DemoRadioButton extends JQXRadioButton
{

    private static final long serialVersionUID = 1L;

    public DemoRadioButton(String text)
    {
        super(text);
        getFeatures().clear();
        addClass(format);
    }

    private static final RadioButtonFormat format = new RadioButtonFormat();

    @TextCSS(VerticalAlign = VerticalAlignments.Middle)
    private static class RadioButtonFormat extends CSSComponent
    {

        private JQXRadioButtonFeature feature = new JQXRadioButtonFeature(this);

        public RadioButtonFormat()
        {
            super("demoRadioButton");
            addFeature(feature);
            feature.getOptions().setTheme(DemoApplicationBody.jqxTheme);
            feature.getOptions().setBoxSize(new MeasurementCSSImpl(27));
            feature.getOptions().setEnableContainerClick(true);
            feature.getOptions().setAnimationShowDelay(500);
        }
    }
}
