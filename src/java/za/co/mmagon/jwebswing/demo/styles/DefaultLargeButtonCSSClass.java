package za.co.mmagon.jwebswing.demo.styles;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButtonFeature;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;

/**
 *
 * @author GedMarc
 * @since 26 Apr 2015
 *//*
@CSS(Width = @MeasurementCSS(value = 140, MeasurementType = MeasurementTypes.Pixels),
        //Height = @MeasurementCSS(value = 80, MeasurementType = MeasurementTypes.Pixels),
        Top = @MeasurementCSS(15), Text_Align = TextAlignments.Center, Vertical_Align = VerticalAlignments.Middle)
*/
public class DefaultLargeButtonCSSClass extends CSSComponent
{

    private static final long serialVersionUID = 1L;
    private final JQXButtonFeature buttonFeature = new JQXButtonFeature(this);

    public DefaultLargeButtonCSSClass()
    {
        super("largebutton");
        addFeature(buttonFeature);
        buttonFeature.getOptions().setTheme(DemoApplicationBody.jqxTheme);

        // buttonFeature.getOptions().getIcons().setPrimaryIcon("ui-icon-gear");
    }


    public JQXButtonFeature getButtonFeature()
    {
        return buttonFeature;
    }

}
