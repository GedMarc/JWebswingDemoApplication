package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.servlets.enumarations.DevelopmentEnvironments;

/**
 *
 * @author GedMarc
 * @since 26 Apr 2015
 */
public class DemoApplicationPage extends Page
{

    private static final long serialVersionUID = 1L;

    public DemoApplicationPage()
    {
        setBody(new DemoApplicationBody(this));
        getPageFields().setAuthor("Marc Magon");
        getPageFields().setDescription("The demonstration application of the JWebSwing Framework");
        setRunningEnvironment(DevelopmentEnvironments.Development); //Pretty Print
        getPageFields().setTitle("JWebSwing Demo Application");
        getPageFields().setCacheControl(true);
        getOptions().setDynamicRender(true); 

    }

    public static void main(String[] args)
    {
        DemoApplicationPage dap = new DemoApplicationPage();
        System.out.println(dap.toString());
    }
}
