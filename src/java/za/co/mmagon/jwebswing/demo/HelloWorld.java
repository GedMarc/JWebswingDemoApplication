package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.base.events.click.ClickAdapter;
import za.co.mmagon.jwebswing.base.html.Body;
import za.co.mmagon.jwebswing.base.html.Paragraph;
import za.co.mmagon.jwebswing.base.servlets.AjaxReceiverServlet;
import za.co.mmagon.jwebswing.base.servlets.JWebSwingServlet;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourNames;

/**
 *
 * @author GedMarc
 */
public class HelloWorld extends JWebSwingServlet
{

    private Page page;
    private Body body;

    public HelloWorld()
    {
        setupPage();
        setupBody();
    }

    @Override
    public Page getPage()
    {
        return page;
    }

    @Override
    public String getUrl()
    {
        return "/HelloWorld";
    }

    private void setupPage()
    {
        page = new Page("Hello World"); //Set The Title
        page.getPageFields().setAuthor("Me"); //How to set Page Metadata Options
        page.getPageFields().setApplicationNameMeta("Hello World Application"); //Set Metadata Application Name
        page.getPageFields().setKeywords("HelloWorld,JWebSwing"); //Set the Key Words
    }

    private void setupBody()
    {
        page.setBody(body = new Body(new Page()));
        body.add("Hello World"); //Add a normal paragraph with the text hello world
        Paragraph p = new Paragraph("Hello World with A Click");
        body.add(p);
        p.addEvent(new ClickAdapter(p)
        {
            private static final long serialVersionUID = 1L;

            public void fireEvent(AjaxCall ajaxObject, AjaxReceiverServlet ajaxReceiver)
            {
                p.setText("I was clicked");
                p.getCss().getBackground().setBackgroundColor$(ColourNames.Magenta);
                p.getCss().getText().setColor$(ColourNames.White);
            }

            @Override
            public void onClick(AjaxCall call, AjaxResponse response)
            {
                p.setText("I was clicked");
                p.getCss().getBackground().setBackgroundColor$(ColourNames.Magenta);
                p.getCss().getText().setColor$(ColourNames.White);
            }
        });
    }
}
