package za.co.mmagon.jwebswing.demo.components;

import za.co.mmagon.jwebswing.base.html.Image;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.Paragraph;
import za.co.mmagon.jwebswing.base.html.TableBodyGroup;
import za.co.mmagon.jwebswing.base.html.TableCell;
import za.co.mmagon.jwebswing.base.html.TableHeaderGroup;
import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.base.html.attributes.ImageAttributes;
import za.co.mmagon.jwebswing.components.jqdatatable.JQDataTable;
import za.co.mmagon.jwebswing.components.jqueryui.themes.JQUIThemeBlocks;
import za.co.mmagon.jwebswing.htmlbuilder.css.CSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.DisplayCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.displays.Overflows;
import za.co.mmagon.jwebswing.htmlbuilder.css.heightwidth.HeightWidthCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementTypes;

/**
 *
 * @author GedMarc
 * @since 02 May 2015
 */
@CSS(Dimensions = @HeightWidthCSS(
        Width = @MeasurementCSS(MeasurementType = MeasurementTypes.Percent, value = 100), Height = @MeasurementCSS(200)),
     Display = @DisplayCSS(Overflow = Overflows.Scroll))
public class FrameworksTable extends JQDataTable<FrameworksTableRow>
{

    private static final long serialVersionUID = 1L;
    private FrameworksTableRow jQuery = new FrameworksTableRow("JQuery", "1.12.0", "", "http://www.jquery.com",
                                                               "jQuery is a fast, small, and feature-rich JavaScript library. It makes things like HTML document traversal and manipulation, event handling, animation, and Ajax much simpler with an easy-to-use API that works across a multitude of browsers. With a combination of versatility and extensibility, jQuery has changed the way that millions of people write JavaScript."
                                                               + "<br><br>JQuery 2.2.0 will be used when setting minimal compatibility to IE 9 on a Page or when IE9 or greater logs on");
    private FrameworksTableRow jQueryMigrate = new FrameworksTableRow("JQuery Migrate", "1.2.1", "", "http://www.jquery.com",
                                                                      "JQuery loaded for Backwards Compatibility");
    private FrameworksTableRow jQueryUIRow = new FrameworksTableRow("JQuery UI", "1.11.4", "", "http://www.jqueryui.com",
                                                                    "jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.");
    private FrameworksTableRow jQueryMobileRow = new FrameworksTableRow("JQuery UI Mobile", "1.4.5", "", "http://www.jquerymobile.com",
                                                                        "jQuery Mobile is a HTML5-based user interface system designed to make responsive web sites and apps that are accessible on all smartphone, tablet and desktop devices.");

    private FrameworksTableRow jQueryUILayoutRow = new FrameworksTableRow("JQuery UI Layout", "1.4.4", "", "http://layout.jquery-dev.com/",
                                                                          "This plug-in was inspired by the extJS border-layout, and recreates that functionality as a jQuery plug-in. The UI Layout plug-in can create any UI look you want - from simple headers or sidebars, to a complex application with toolbars, menus, help-panels, status bars, sub-forms, etc.");

    private FrameworksTableRow jQueryAtmosphereRow = new FrameworksTableRow("Atmosphere", "3.0.0", "", "https://github.com/Atmosphere/atmosphere",
                                                                            "The Atmosphere Framework contains client and server side components for building Asynchronous Web Applications. The majority of popular frameworks are either supporting Atmosphere or supported natively by the framework. The Atmosphere Framework supports all major Browsers and Servers.");

    private FrameworksTableRow jQueryColourPickerLayoutRow = new FrameworksTableRow("Spectrum Color Picker", "1.7.0 Customized", "", "https://bgrins.github.io/spectrum/",
                                                                                    "Spectrum colour picker provides all the best of a colour picker. <br>Works with JQuery UI Theme Roller");

    private FrameworksTableRow jQueryJQPlotLayoutRow = new FrameworksTableRow("jqPlot", "1.0.9", "", "http://www.jqplot.com/",
                                                                              "jqPlot is a plotting and charting plugin for the jQuery Javascript framework. jqPlot produces beautiful line, bar and pie charts with many features:");

    private FrameworksTableRow jQueryPrettifyRow = new FrameworksTableRow("google-prettify", "4.03.1", "", "https://code.google.com/p/google-code-prettify/",
                                                                          "An embeddable script that makes source-code snippets in HTML prettier.");

    private FrameworksTableRow jQueryUADetectorRow = new FrameworksTableRow("UA-Dectector", "0.9.22", "", "http://uadetector.sourceforge.net/",
                                                                            "Allows for precise detection of client browser information through the user-agent variable");

    private FrameworksTableRow jQueryLog4JRow = new FrameworksTableRow("Log4J", "1.2.17", "", "http://logging.apache.org/log4j/",
                                                                       "Flexible logging tools providing the capability to log to a web component");

    private FrameworksTableRow metroJSRow = new FrameworksTableRow("Metro JS", "0.9.77", "", "http://www.drewgreenwell.com/projects/metrojs",
                                                                   "The Windows Metro Tile Addon");

    private FrameworksTableRow mapHighlightRow = new FrameworksTableRow("Map Highlight", "1.0 Customized", "", "http://davidlynch.org/projects/maphilight/docs/",
                                                                        "A customized addon of David Lynch's Map Highlight Addon."
                                                                        + "<br>This allows for dynamic selection of area's "
                                                                        + "<br>Heat-Map Support for up to 3 colour selections"
                                                                        + "<br>Dynamic Legend"
                                                                        + "<br>Tooltip Tracking"
                                                                        + "<br>JWDialog Tooltips");

    private FrameworksTableRow scrollPaneJSRow = new FrameworksTableRow("JScrollPane", "2.0.19", "", "http://jscrollpane.kelvinluck.com/",
                                                                        "Allows for customization of the scroll bars");

    private FrameworksTableRow dataTablesJSRow = new FrameworksTableRow("Data Tables", "1.10.10", "", "https://www.datatables.net/",
                                                                        "DataTables is a plug-in for the jQuery Javascript library. It is a highly flexible tool, based upon the foundations of progressive enhancement, and will add advanced interaction controls to any HTML table.");
    private FrameworksTableRow gradientJSRow = new FrameworksTableRow("Gradient Backgrounds", "1.0", "", "http://brandonaaron.net",
                                                                      "The gradient generator");

    private FrameworksTableRow jqRulerJSRow = new FrameworksTableRow("JQRulerGuides", "1.0 Customized", "", "https://mark-rolich.github.io/RulersGuides.js/",
                                                                     "The gradient generator");

    private FrameworksTableRow jqPaceRow = new FrameworksTableRow("PACE", "1.0 Customized", "", "http://github.hubspot.com/pace/docs/welcome/",
                                                                  "A CSS Customized Loading Window");

    private FrameworksTableRow jqxWidgetLibraryRow = new FrameworksTableRow("JQX Widgets*", "3.9.1", "", "http://www.jqwidgets.com/",
                                                                            "The commercial version is suitable for any commercial use (corporate websites, mobile apps, web applications, internal projects, etc.), see License and Pricing.");

    private FrameworksTableRow c3Row = new FrameworksTableRow("C3", "1.0.0", "", "http://c3js.org/", "C3 makes it easy to generate D3-based charts by wrapping the code required to construct the entire chart. We don't need to write D3 code any more. ");
    private FrameworksTableRow d3Row = new FrameworksTableRow("D3*", "3.516", "", "https://d3js.org/", "D3.js is a JavaScript library for manipulating documents based on data. D3 helps you bring data to life using HTML, SVG, and CSS. D3’s emphasis on web standards gives you the full capabilities of modern browsers without tying yourself to a proprietary framework, combining powerful visualization components and a data-driven approach to DOM manipulation. ");
    private FrameworksTableRow d3RadialGraphRow = new FrameworksTableRow("D3 - Radial Graph Row", "Customized", "http://bl.ocks.org/mbostock/4063550", "https://d3js.org/", "The tree layout implements the Reingold-Tilford algorithm for efficient, tidy arrangement of layered nodes. The depth of nodes is computed by distance from the root, leading to a ragged appearance. Cartesian orientations are also supported. Implementation based on work by Jeff Heer and Jason Davies using Buchheim et al.'s linear-time variant of the Reingold-Tilford algorithm. Data shows the Flare class hierarchy, also courtesy Jeff Heer.");
    private FrameworksTableRow d3ReingoldGraphRow = new FrameworksTableRow("Reingold–Tilford Tree", "Customized", "", "http://bl.ocks.org/mbostock/4339184", "The tree layout implements the Reingold-Tilford algorithm for efficient, tidy arrangement of layered nodes. The depth of nodes is computed by distance from the root, leading to a ragged appearance. Radial orientations are also supported. Implementation based on work by Jeff Heer and Jason Davies using Buchheim et al.'s linear-time variant of the Reingold-Tilford algorithm. Data shows the Flare class hierarchy, also courtesy Jeff Heer.");

    private final TableHeaderGroup headerGroup = new TableHeaderGroup();
    private final TableRow headerGroupRow = new TableRow();

    private final TableBodyGroup bodyGroup = new TableBodyGroup();

    // private JQDataTableFeature table;
    public FrameworksTable()
    {
        super(null, true);
        //feat.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        //addFeature(table = new JQDataTableFeature(this));
        //getOptions().setjQueryUI(true);
        //table.getOptions().setScrollY(true);
        //table.getOptions().set(true);
        //getOptions().setDom("<\"top\"iflp<\"clear\">>rt<\"bottom\"iflp<\"clear\">>");

        headerGroup.add(headerGroupRow);
        headerGroupRow.add(new TableCell("Project"));
        headerGroupRow.add(new TableCell("Version"));
        headerGroupRow.add(new TableCell("Support Page"));
        headerGroupRow.add(new TableCell("Description"));
        add(headerGroup);
        // bodyGroup.addClass(JQUIThemeBlocks.UI_Widget_Content);
        bodyGroup.add(jQuery);
        bodyGroup.add(jQueryMigrate);
        bodyGroup.add(jQueryUIRow);
        bodyGroup.add(jQueryMobileRow);
        bodyGroup.add(jQueryUILayoutRow);
        bodyGroup.add(jQueryColourPickerLayoutRow);
        bodyGroup.add(jQueryJQPlotLayoutRow);
        bodyGroup.add(jQueryAtmosphereRow);
        bodyGroup.add(jQueryUADetectorRow);
        bodyGroup.add(jQueryPrettifyRow);
        bodyGroup.add(jQueryLog4JRow);
        bodyGroup.add(metroJSRow);
        bodyGroup.add(mapHighlightRow);
        bodyGroup.add(scrollPaneJSRow);
        bodyGroup.add(dataTablesJSRow);
        bodyGroup.add(gradientJSRow);
        bodyGroup.add(jqRulerJSRow);
        bodyGroup.add(jqxWidgetLibraryRow);
        bodyGroup.add(jqPaceRow);
        bodyGroup.add(c3Row);
        bodyGroup.add(d3Row);
        bodyGroup.add(d3RadialGraphRow);
        bodyGroup.add(d3ReingoldGraphRow);

        add(bodyGroup);
    }
}

class FrameworksTableRow extends TableRow
{

    private String addonName;
    private String version;
    private String iconReference;
    private String htmlLink;
    private String notes;

    private Paragraph addonParagraph;
    private Paragraph versionParagraph;

    private Link link;
    private Image image;

    @CSS()
    private Paragraph notesParagraph;

    public FrameworksTableRow(String name, String version, String iconReference, String htmlLink, String notes)
    {
        addClass(JQUIThemeBlocks.UI_State_Active);
        this.addonName = name;
        this.version = version;
        this.iconReference = iconReference;
        this.htmlLink = htmlLink;
        this.notes = notes;

        addonParagraph = new Paragraph(addonName);
        versionParagraph = new Paragraph(version);
        image = new Image(iconReference);
        image.addAttribute(ImageAttributes.Alt, name);
        link = new Link(htmlLink);
        link.add(image);

        notesParagraph = new Paragraph(notes);

        TableCell addonCell = new TableCell(addonParagraph);
        TableCell versionCell = new TableCell(versionParagraph);
        TableCell linkCell = new TableCell(link);
        TableCell notesCell = new TableCell(notesParagraph);

        add(addonCell);
        add(versionCell);
        add(linkCell);
        add(notesCell);

    }

    public String getIconReference()
    {
        return iconReference;
    }

    public void setIconReference(String iconReference)
    {
        this.iconReference = iconReference;
    }

    public String getHtmlLink()
    {
        return htmlLink;
    }

    public void setHtmlLink(String htmlLink)
    {
        this.htmlLink = htmlLink;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

}
