package za.co.mmagon.jwebswing.demo.screens.view;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.google.sourceprettify.JQSourceCodePrettify;
import za.co.mmagon.jwebswing.components.google.sourceprettify.SourceCodeLanguages;
import za.co.mmagon.jwebswing.components.jqueryui.accordion.JQUIAccordionHeightStyle;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.JQUITab;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.Tab;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.HelloWorld;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
public class ComponentInteractionScreen extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private DemoHeader h;
    private DemoHeader h2;

    public ComponentInteractionScreen()
    {

    }

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        return new ComponentSourceCodeScreen();
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        ComponentOptionsScreen d = new ComponentOptionsScreen();
        return d;
    }

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay d = new MainWindowDisplay();
        d.add(h = new DemoHeader(HeaderTypes.H1, "Component Interactions"));
        d.add("The library works on an Object approach based around the Component class.<br>"
                + "This allows for the HTML, CSS, or Javascript be run on any platform that is servlet based (Tomcat, Glassfish, JBoss 4.3, Websphere and etc).<br>"
                + "The HTTP Servlet library is included for console output, or integration with .NET,Object C, IIS and etc"
                + "<hr>"
                + "The hierarchy for an HTML Document is Page to Body, then Body to anything. "
                + "<br>The Page and Body for Hello World is shown below along with the Console output"
                + "<br>A Component allows Features, and Events. A feature is a client side operation, in JQuery. An event is an AJAX Query that is performed server-side."
                + "<br>All Components have their allowed Children, Features and Events hard-coded to ensure all pages rendered are correctly built, in the API rather than run time"
                + "<hr>"
                + "The CSS Engine is Annotated to allow for complete control over the styling of an object, either programmatically, or defined statically before startup. This grants an enormous performance benifit."
                + "<br>Each Component also has a CSS Implementation Object that grants complete access to the styling of a specific component programatically."
                + "<hr>");

        d.add(h2 = new DemoHeader(HeaderTypes.H1, "Hello World"));
        d.add("All the code below is in the single HelloWorldServlet.java class");
        d.add("<hr>");

        JQUITab tabs = new JQUITab();
        tabs.getOptions().setHeightStyle(JQUIAccordionHeightStyle.Content);

        Div servletScreenDiv = new Div();
        Div pageScreenDiv = new Div();
        Div bodyScreenDiv = new Div();
        Div consoleScreenDiv = new Div();
        Div htmlScreenDiv = new Div();
        Tab servletScreenTab = tabs.addTab(new Tab(new ListItem("Hello World Servlet"), servletScreenDiv));
        Tab pageEventTab = tabs.addTab(new Tab(new ListItem("Page Component"), pageScreenDiv));
        Tab bodyEventTab = tabs.addTab(new Tab(new ListItem("Body Component"), bodyScreenDiv));
        Tab consoleEventTab = tabs.addTab(new Tab(new ListItem("Console Output"), consoleScreenDiv));
        Tab htmlOutputTab = tabs.addTab(new Tab(new ListItem("HTML Output"), htmlScreenDiv));

        JQSourceCodePrettify helloWorldServletCode = new JQSourceCodePrettify();
        helloWorldServletCode.setSourceCodeLanguage(SourceCodeLanguages.Java);
        helloWorldServletCode.setText("public class HelloWorld extends JWebSwingServlet\n"
                + "{\n"
                + "\n"
                + "    private Page page;\n"
                + "    private Body body;\n"
                + "\n"
                + "    public HelloWorld()\n"
                + "    {\n"
                + "        setupPage();\n"
                + "        setupBody();\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public Page getNewPage(String sessionId)\n"
                + "    {\n"
                + "        return page;\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public AppenderSkeleton getLogAppender()\n"
                + "    {\n"
                + "        //No custom log appenders\n"
                + "        return null;\n"
                + "    }"
                + "}");

        JQSourceCodePrettify pageSourceCode = new JQSourceCodePrettify();
        pageSourceCode.setSourceCodeLanguage(SourceCodeLanguages.Java);
        pageSourceCode.setText("private void setupPage()\n"
                + "    {\n"
                + "        page = new Page(\"Hello World\");\n"
                + "        page.setAuthor(\"Me\");\n"
                + "        page.setApplicationNameMeta(\"Hello World Application\");\n"
                + "        page.setKeywords(\"HelloWorld,JWebSwing\");\n"
                + "    }");
        JQSourceCodePrettify bodySourceCode = new JQSourceCodePrettify();
        bodySourceCode.setSourceCodeLanguage(SourceCodeLanguages.Java);
        bodySourceCode.setText("private void setupBody()\n"
                + "    {\n"
                + "        page.setBody(body = new Body());\n"
                + "        body.add(\"Hello World\");\n"
                + "    }");
        JQSourceCodePrettify consoleSourceCode = new JQSourceCodePrettify();
        consoleSourceCode.setSourceCodeLanguage(SourceCodeLanguages.Java);
        consoleSourceCode.setText("public static void main(String[] args)\n"
                + "    {\n"
                + "        HelloWorld hw = new HelloWorld();\n"
                + "        System.out.println(hw.p.toString(true));\n"
                + "    }");
        JQSourceCodePrettify htmlCode = new JQSourceCodePrettify();
        htmlCode.setSourceCodeLanguage(SourceCodeLanguages.HTML);
        htmlCode.setText("&lt;!DOCTYPE html&gt;\n"
                + "&lt;html&gt;\n"
                + "	&lt;head&gt;\n"
                + "		&lt;title&gt;\n"
                + "			Hello World\n"
                + "		&lt;/title&gt;\n"
                + "		&lt;meta name=\"author\" content=\"Me\"&gt;\n"
                + "		&lt;meta name=\"application-name\" content=\"Hello World Application\"&gt;\n"
                + "		&lt;meta name=\"generator\" content=\"JWebSwing - https://sourceforge.net/projects/jwebswing/\"&gt;\n"
                + "		&lt;meta name=\"keywords\" content=\"HelloWorld,JWebSwing\"&gt;\n"
                + "		&lt;link href=\"css/DefaultThemeNoMarginsBorders.css\" rel=\"stylesheet\" type=\"text/css\" class=\"CSSLink\"&gt;\n"
                + "	&lt;/head&gt;\n"
                + "	&lt;body id=\"jw524f\" class=\"Body\"&gt;\n"
                + "		&lt;p id=\"jw67a4\" class=\"Paragraph\"&gt;Hello World&lt;/p&gt;\n"
                + "	&lt;/body&gt;\n"
                + "&lt;/html&gt;");

        servletScreenDiv.add(helloWorldServletCode);
        pageScreenDiv.add(pageSourceCode);
        bodyScreenDiv.add(bodySourceCode);
        consoleScreenDiv.add(consoleSourceCode);
        htmlScreenDiv.add("This source code is formatted for HTML Output.");
        htmlScreenDiv.add(htmlCode);

        d.add(tabs);

        return d;
    }

    public class ComponentSourceCodeScreen extends SourceCodeScreen
    {

        public ComponentSourceCodeScreen()
        {
            addButton("Component Interactions Screen", ComponentInteractionScreen.class);
            addButton("Hello World", HelloWorld.class);
        }

    }
}
