/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.components.jqxwidgets.buttongroup.JQXButtonGroup;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.styles.DemoGeneralStyleLibrary;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class DefaultButton extends JQXButtonGroup
{

    private static final long serialVersionUID = 1L;

    /**
     * The default large button
     */
    public DefaultButton(String text)
    {
        super(text);
        addClass(DemoGeneralStyleLibrary.DefaultButton.getCssClass());
        getOptions().setTheme(DemoApplicationBody.jqxTheme);
        getFeatures().clear();
    }

}
