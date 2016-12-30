/*
 * Copyright (C) 2016 GedMarc
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.JQUITab;
import za.co.mmagon.jwebswing.components.jqueryui.tabs.Tab;
import za.co.mmagon.jwebswing.components.jqxwidgets.buttons.JQXButtonTemplates;
import za.co.mmagon.jwebswing.components.jqxwidgets.slider.JQXSlider;
import za.co.mmagon.jwebswing.components.jqxwidgets.slider.JQXSliderModes;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;

/**
 *
 * @author GedMarc
 * @since 10 Mar 2016
 */
public class TestScreen extends DefaultScreenDisplay
{

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        return new SourceCodeScreen();
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        ComponentOptionsScreen p = new ComponentOptionsScreen();
        return p;
    }

    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay p = new MainWindowDisplay();

        JQXSlider slider = new JQXSlider();
        slider.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        slider.getOptions().setMin(0);
        slider.getOptions().setMax(1);
        slider.getOptions().setStep(1);
        slider.getOptions().setMode(JQXSliderModes.Fixed);
        slider.getOptions().setTemplate(JQXButtonTemplates.Primary);
        //slider.getOptions().setTooltip(true);

        p.add(slider);

        JQUITab tab = new JQUITab();
        tab.addTab(new Tab(new ListItem("Tab 1"), new Div()));
        p.add(tab);

        return p;
    }
}
