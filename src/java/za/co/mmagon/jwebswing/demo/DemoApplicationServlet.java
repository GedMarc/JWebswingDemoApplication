package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.servlets.JWebSwingServlet;
import za.co.mmagon.jwebswing.generics.WebReference;

/**
 *
 * @author GedMarc
 */
public class DemoApplicationServlet extends JWebSwingServlet
{

    private static final long serialVersionUID = 1L;
    //private static final DemoApplicationBody body = DemoApplicationBody.getInstance();
    private static final DemoApplicationPage demoApplicationPage = new DemoApplicationPage();
    public DemoApplicationServlet()
    {
        WebReference.setIsLocal(true);
    }

    public Page getNewPage(String sessionId)
    {
        return demoApplicationPage;
    }


    @Override
    public Page getPage()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUrl()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
