package za.co.mmagon.jwebswing.demo.styles;

import za.co.mmagon.jwebswing.CSSComponent;

/**
 *
 * @author GedMarc
 * @since 26 Apr 2015
 */
public enum DemoGeneralStyleLibrary
{
    DefaultLargeButton(new DefaultLargeButtonCSSClass()),
    DefaultButton(new DefaultButtonCSSClass()),
    ButtonTooltips(new ButtonTooltipCSSClass()),
    OptionsSpinner(new OptionsSpinnerCSSClass()),
    OptionsSelectMenu(new OptionsSelectMenuCSSClass()),;

    private final CSSComponent cssClass;

    private DemoGeneralStyleLibrary(CSSComponent cssClass)
    {
        this.cssClass = cssClass;
    }

    public CSSComponent getCssClass()
    {
        return cssClass;
    }

}
