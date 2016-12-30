/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.components.jqueryui.button.JQUIButton;
import za.co.mmagon.jwebswing.demo.styles.DemoGeneralStyleLibrary;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DefaultLargeButton extends JQUIButton
{

    private static final long serialVersionUID = 1L;

    /**
     * The default large button
     */
    public DefaultLargeButton(String text)
    {
        super(text);
        addClass(DemoGeneralStyleLibrary.DefaultLargeButton.getCssClass());
        getFeatures().clear();
    }


}
