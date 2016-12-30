package za.co.mmagon.jwebswing.demo.screens.view;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.google.sourceprettify.JQSourceCodePrettify;
import za.co.mmagon.jwebswing.components.google.sourceprettify.SourceCodeLanguages;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.JQUITab;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.Tab;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
public class GettingStartedScreen extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;

    public GettingStartedScreen()
    {

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("Getting Started Screen", GettingStartedScreen.class);
        return scs;
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        return new ComponentOptionsScreen();
    }

    private GettingStarted gs = new GettingStarted();

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay dp = new MainWindowDisplay();
        dp.add("Below you will find the very basics of getting an application up and running.<br><hr>The best way to access the framework is through a Servlet by inheriting the JWebSwingServlet class."
                + "<br><br>1. Register your servlet in web.xml"
                + "<br>2. Inherit the JWebSwingServlet class"
                + "<br>Done."
                + "<br><br>A \"Page\" is a single html site one may visit. It contains the metadata for an HTML page as well as a Body. "
                + "<br>The Body may contain pretty much everything from there"
                + "<br><br>To view the HTML that is being put out use the &lt;x&gt;.toString(true) method.");

        return gs = new GettingStarted();
    }

    public class GettingStarted extends MainWindowDisplay
    {

        //@LayoutCSS(Min_Height = @MeasurementCSS(250))
        private final JQUITab tabs;
        private final Tab jWebSwingServletTab;
        private final Tab jAjaxReceiverTab;

        private final Div serverServletXML;
        private final Div serverServletJava;

        private HeaderText h;
        private HeaderText h1;

        // @FormattingCSS(Text_Align = TextAlignments.Left)
        // @LayoutCSS(Min_Height = @MeasurementCSS(250))
        private JQSourceCodePrettify prettyXML = new JQSourceCodePrettify();
        //@LayoutCSS(Min_Height = @MeasurementCSS(250))
        private JQSourceCodePrettify prettyXMLServlet = new JQSourceCodePrettify();

        public GettingStarted()
        {
            this.serverServletJava = new Div();
            this.serverServletXML = new Div();
            add(h = new DemoHeader(HeaderTypes.H1, "Getting Started"));
            h1 = new DemoHeader(HeaderTypes.H2, "Basic Configuration");
            h.addClass(JQUIThemeBlocks.UI_State_Highlight);
            setID("gettingStarted");
            add(h);

            add("Below you will find the very basics of getting an application up and running.<br><hr>The best way to access the framework is through a Servlet by inheriting the JWebSwingServlet class."
                    + "<br><br>1. Register your servlet in web.xml"
                    + "<br>2. Inherit the JWebSwingServlet class"
                    + "<br>Done."
                    + "<br><br>A \"Page\" is a single html site one may visit. It contains the metadata for an HTML page as well as a Body. "
                    + "<br>The Body may contain pretty much everything from there"
                    + "<br><br>To view the HTML that is being put out use the &lt;x&gt;.toString(true) method.");

            this.tabs = new JQUITab();
            //tabs.addClass(DemoGeneralStyleLibrary.FullScreen.getCssClass());

            prettyXML.setSourceCodeLanguage(SourceCodeLanguages.XML);
            prettyXML.setText(" &lt;servlet&gt;\n"
                    + "     &lt;servlet-name&gt;DemoApplication&lt;/servlet-name&gt;\n"
                    + "     &lt;servlet-class&gt;za.co.mmagon.jwebswing.demo.DemoApplicationServlet&lt;/servlet-class&gt;\n"
                    + " &lt;/servlet&gt;\n"
                    + " &lt;servlet-mapping&gt;\n"
                    + "     &lt;servlet-name&gt;DemoApplication&lt;/servlet-name&gt;\n"
                    + "     &lt;url-pattern&gt;/DemoApplication&lt;/url-pattern&gt;\n"
                    + " &lt;/servlet-mapping&gt;");

            serverServletXML.add(prettyXML);
            add(h1);
            h1.addClass(JQUIThemeBlocks.UI_State_Highlight);
            this.jWebSwingServletTab = new Tab(new ListItem("Server Servlet XML"), serverServletXML);

            prettyXMLServlet.setSourceCodeLanguage(SourceCodeLanguages.Java);
            prettyXMLServlet.setText("   public static final DemoApplicationPage demoApplicationPage = new DemoApplicationPage();\n"
                    + "\n"
                    + "    public DemoApplicationServlet()\n"
                    + "    {\n"
                    + "        setSessionAware(true);\n"
                    + "        //Just a pre-render of  the home page\n"
                    + "        demoApplicationPage.toString(true);\n"
                    + "    }\n"
                    + "\n"
                    + "     @Override\n"
                    + "    public Page getNewPage(String sessionId)\n"
                    + "    {\n"
                    + "        return demoApplicationPage;\n"
                    + "    }");

            serverServletJava.add(prettyXMLServlet);

            this.jAjaxReceiverTab = new Tab(new ListItem("Servlet"), serverServletJava);

            tabs.addTab(jWebSwingServletTab);
            tabs.addTab(jAjaxReceiverTab);
            add(tabs);
        }
    }
}
