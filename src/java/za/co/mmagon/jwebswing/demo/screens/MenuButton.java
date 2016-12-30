package za.co.mmagon.jwebswing.demo.screens;

import java.util.logging.Level;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.base.events.click.ClickAdapter;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.components.jqueryui.position.PositionLocationHorizontal;
import za.co.mmagon.jwebswing.components.jqueryui.position.PositionLocationVertical;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButton;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButtonTemplates;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author MMagon
 * @since 06 Mar 2013
 * @version 1.0
 */
/*
 * @BoxModelCSS(Margin_Bottom = // =
 * @MeasurementCSS(5),
 * Margin_Left = // =
 * @MeasurementCSS(-35)
 */
/*
@CSS(Margin_Bottom = @MeasurementCSS(10),
     Margin_Left = @MeasurementCSS(10),
     Margin_Top = @MeasurementCSS(10),
     Margin_Right = @MeasurementCSS(10),
     Font_Size = @MeasurementCSS(12),
     Width = @MeasurementCSS(value = 90, MeasurementType = MeasurementTypes.Percent),
     Cursor = Cursors.Pointer)*/
public class MenuButton extends JQXButton
{

    private static final long serialVersionUID = 1L;

    private MenuButton me = this;
    private boolean selected = false;
    private PositionLocationHorizontal position = PositionLocationHorizontal.center;
    private PositionLocationVertical verticalPosition = PositionLocationVertical.bottom;

    public MenuButton(NavigationScreen navScreen, String text, String description, final DefaultScreenDisplay newScreen)
    {
        super(text);
        getOptions().setTheme("metrodark");
        getOptions().setTemplate(JQXButtonTemplates.Info);
        setID(text.replace(' ', '_') + "button");
        addAttribute(GlobalAttributes.Title, description);
        addEvent(new ClickAdapter(this)
        {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick(AjaxCall call, AjaxResponse response)
            {
                LogFactory.getInstance().getLogger("MenuButtonOnClick").log(Level.CONFIG, "Changing screen to " + newScreen);
                newScreen.getDefaultDisplayScreen().setID("UpdateDiv");
                newScreen.getSourceCodeScreen().setID("sourceScreen");
                newScreen.getComponentOptionsScreen().setID("compOptions");
                //newScreen.setID("UpdateDiv");
                response.addComponent(newScreen.getDefaultDisplayScreen());
                response.addComponent(newScreen.getSourceCodeScreen());
                //response.getUpdatedComponents().put("sourceScreen", );
                //response.getUpdatedComponents().put("compOptions", newScreen.getComponentOptionsScreen());
                response.addComponent(newScreen.getComponentOptionsScreen());
            }
        });
    }
}
