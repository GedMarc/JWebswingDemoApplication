package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.html.Body;
import za.co.mmagon.jwebswing.components.jquerylayout.layout.JQLayoutOptions;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemes;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButton;
import za.co.mmagon.jwebswing.components.jqxwidgets.notification.JQXNotification;
import za.co.mmagon.jwebswing.components.jqxwidgets.notification.JQXNotificationPositions;
import za.co.mmagon.jwebswing.components.jqxwidgets.ribbon.JQXRibbon;
import za.co.mmagon.jwebswing.components.jqxwidgets.ribbon.JQXRibbonPositions;
import za.co.mmagon.jwebswing.components.jqxwidgets.themes.JQXWidgetThemes;
import za.co.mmagon.jwebswing.demo.components.DemoPanel;
import za.co.mmagon.jwebswing.demo.components.DemoRibbon;
import za.co.mmagon.jwebswing.demo.navigationtree.BasicComponentsTree;
import za.co.mmagon.jwebswing.demo.navigationtree.HomeTree;
import za.co.mmagon.jwebswing.demo.navigationtree.JQXTreeDisplay;
import za.co.mmagon.jwebswing.demo.navigationtree.PlotTree;
import za.co.mmagon.jwebswing.demo.navigationtree.UITree;
import za.co.mmagon.jwebswing.demo.screens.*;
import za.co.mmagon.jwebswing.demo.screens.layout.DemoOuterLayout;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourNames;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementPercentages;

public class DemoApplicationBody extends Body
{

    private static final long serialVersionUID = 1L;
    private DemoOuterLayout dol;
    private JQXButton titleHeader;
    private DemoPanel centerDiv = new DemoPanel();
    private DemoPanel sourceDiv = new DemoPanel();
    private DemoPanel canvasDiv = new DemoPanel();
    private DemoPanel systemLogDiv = new DemoPanel();

    private JQXNotification notificationPanel;

    public static final JQXWidgetThemes jqxTheme = JQXWidgetThemes.MetroDark;

    public DemoApplicationBody(Page p)
    {
        super(p);
        getCss().getBackground().setBackgroundColor$(ColourNames.Black);
        addTheme(jqxTheme);
        addTheme(JQUIThemes.DotLuv);
        configureJQLayout();

        DemoApplicationScreens screen = DemoApplicationScreens.BubbleGraphDemo;

        changeScreen(screen);
    }

    /*
     * private DemoRibbon getCenterRibbon()
     * {
     * return new WelcomeToJWebSwingScreen();
     * }
     */
    public final void changeScreen(DemoApplicationScreens screenToDisplay)
    {
        screenToDisplay.getScreenToDisplay().setID("UpdateDiv");
        screenToDisplay.getScreenToDisplay().setTouched(true);
        dol.getCenter().getContentDiv().getChildren().clear();
        dol.getCenter().getContentDiv().add(screenToDisplay.getScreenToDisplay());
    }

    public JQXNotification getNotificationPanel()
    {
        if (notificationPanel == null)
        {
            notificationPanel = new JQXNotification();
        }
        return notificationPanel;
    }

    private void configureJQLayout()
    {
        dol = new DemoOuterLayout(this);
        dol.getWest().getContentDiv().add(getWestNavigationRibbon());
        dol.getWest().getOptions().setMinSize(300);
        //dol.getWest().addFooter(notificationPanel);
        dol.getEast().getContentDiv().add(getEastNavigationRibbon());
        notificationPanel = new JQXNotification();

        //dol.getWest().add(getNotificationPanel());
        notificationPanel.getOptions().setAutoClose(true);
        notificationPanel.getOptions().setBlink(true);
        notificationPanel.add("<strong>Please Set A UI Theme</strong><br><i>Some pages may not display correctly without a theme chosen.</i>");
        notificationPanel.getOptions().setPosition(JQXNotificationPositions.bottom_right);
        notificationPanel.getOptions().setAutoOpen(true);
    }

    private DemoRibbon westRibbon;

    private JQXRibbon getWestNavigationRibbon()
    {
        if (westRibbon == null)
        {
            westRibbon = new DemoRibbon();
        }
        //westRibbon.setBackground_Color$(ColourNames.Black);
        westRibbon.addRibbonItem("Home", new HomeTree());
        westRibbon.addRibbonItem("JQuery UI", new UITree());
        westRibbon.addRibbonItem("JQ Widgets*", new JQXTreeDisplay());
        westRibbon.addRibbonItem("JQ Plot Graphs", new PlotTree());
        westRibbon.addRibbonItem("Base Components", new BasicComponentsTree());

//        westRibbon.addRibbonItem("Events Handling", new EventsTree());
//        westRibbon.addRibbonItem("Push System", new PushTree());
//        westRibbon.addRibbonItem("JQuery Layout", new LayoutTree());
//
//
//        westRibbon.addRibbonItem("JQ Metro Tiles", new MetroTree());
//        westRibbon.addRibbonItem("JQ Data Table", new DataTablesTree());
//        westRibbon.addRibbonItem("JW Image Map", new ImageMapTree());
//        westRibbon.addRibbonItem("JW/D3 Graphs", new D3Tree());
//        westRibbon.addRibbonItem("Source Prettfy", new SourcePrettifyTree());
//        westRibbon.addRibbonItem("Spectrum", new SourcePrettifyTree());
//        westRibbon.addRibbonItem("JQRuler", new SourcePrettifyTree());
        westRibbon.getOptions().setHeight(MeasurementPercentages.hundredPercent);
        westRibbon.getOptions().setWidth(MeasurementPercentages.hundredPercent);
        westRibbon.getOptions().setPosition(JQXRibbonPositions.left);

        //westRibbon.getOptions().setInitContent(new JQXInitContent(westRibbon));
        return westRibbon;
    }

    private DemoRibbon eastRibbon;
    private ComponentOptionsScreen optionsScreen;

    private DemoRibbon getEastNavigationRibbon()
    {
        if (eastRibbon == null)
        {
            eastRibbon = new DemoRibbon();
        }
        eastRibbon.getOptions().setPosition(JQXRibbonPositions.top);
        eastRibbon.getOptions().setHeight(MeasurementPercentages.hundredPercent);
        eastRibbon.addRibbonItem("Properties", optionsScreen = new ComponentOptionsScreen());
        eastRibbon.addRibbonItem("Styles", new CssOptionsScreen());
        eastRibbon.addRibbonItem("UI Themes", new JQUIThemeManagerScreen());
        eastRibbon.addRibbonItem("JQX Themes", new JQXThemeManagerScreen());

        optionsScreen.configureDisplayedComponents("JQLayout Options", new JQLayoutOptions());
        //optionsScreen.configureDisplayedComponents("JQLayout Options", new JQLayoutDefaultOptions());
        //

        //eastRibbon.addRibbonItem("Source Code Themes", new SourceCodeThemeScreen());
        //eastRibbon.getOptions().setInitContent(new JQXInitContent(eastRibbon));
        return eastRibbon;
    }

    /*
     * private DemoRibbon getCenterRibbon()
     * {
     * return new WelcomeToJWebSwingScreen();
     * }
     */
    public final void DemoApplicationScreens(DefaultScreenDisplay screenToDisplay)
    {
        screenToDisplay.setID("UpdateDiv");
        screenToDisplay.setTouched(true);
        dol.getCenter().getContentDiv().getChildren().clear();
        dol.getCenter().getContentDiv().add(screenToDisplay);
    }

    public DemoPanel getCenterDiv()
    {
        return centerDiv;
    }

    public DemoPanel getSourceDiv()
    {
        return sourceDiv;
    }

    public DemoPanel getCanvasDiv()
    {
        return canvasDiv;
    }

    public DemoPanel getSystemLogDiv()
    {
        return systemLogDiv;
    }
}
