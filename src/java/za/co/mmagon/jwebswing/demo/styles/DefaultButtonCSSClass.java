package za.co.mmagon.jwebswing.demo.styles;

import za.co.mmagon.jwebswing.CSSComponent;
import za.co.mmagon.jwebswing.components.jqueryui.button.JQUIButtonFeature;

/**
 *
 * @author GedMarc
 * @since 26 Apr 2015
 */
/*
@CSS(
        Top = @MeasurementCSS(15),
        Text_Align = TextAlignments.Center, Vertical_Align = VerticalAlignments.Middle)
*/
public class DefaultButtonCSSClass extends CSSComponent
{

    private static final long serialVersionUID = 1L;
    private final JQUIButtonFeature buttonFeature = new JQUIButtonFeature(this);

    public DefaultButtonCSSClass()
    {
        super("defaultbutton");
        addFeature(buttonFeature);
        buttonFeature.getOptions().getIcons().setPrimaryIcon("ui-icon-gear");
    }

    public JQUIButtonFeature getButtonFeature()
    {
        return buttonFeature;
    }

}
