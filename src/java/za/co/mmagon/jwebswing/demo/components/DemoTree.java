package za.co.mmagon.jwebswing.demo.components;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTree;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeItem;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeSelectEvent;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeSourceDataAdapter;
import za.co.mmagon.jwebswing.components.jqxwidgets.tree.JQXTreeToggleModes;
import za.co.mmagon.jwebswing.demo.DemoApplicationBody;
import za.co.mmagon.jwebswing.demo.DemoApplicationScreens;
import za.co.mmagon.jwebswing.demo.screens.MenuTreeItem;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourNames;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;

/**
 * This Class
 *
 * @author GedMarc
 * @since 31 Dec 2015
 */
public class DemoTree extends DemoPanel
{

    private JQXTree newTree;
    private ArrayList<JQXTreeItem> treeItems;// = new ArrayList<>();
    private JQXTreeSourceDataAdapter treeAdapter;// = new JQXTreeSourceDataAdapter(newTree);

    public DemoTree()
    {
        newTree = new JQXTree();
        newTree.getOptions().setTheme(DemoApplicationBody.jqxTheme);
        newTree.getOptions().setToggleMode(JQXTreeToggleModes.click);
        //newTree.getOptions().setExpandAll(true);
        newTree.getOptions().setWidth(MeasurementCSSImpl.hundredPercent);
        newTree.getOptions().setHeight(MeasurementCSSImpl.hundredPercent);
        newTree.getOptions().setSource(getTreeItems());
        // newTree.addClass(format);
        add(newTree);
        newTree.setBackgroundColor$(ColourNames.Black);
        setBackgroundColor$(ColourNames.Black);

        getNewTree().addEvent(new JQXTreeSelectEvent(getNewTree())
        {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void onSelect(AjaxCall ajaxObject, AjaxResponse ajaxReceiver)
            {
                DemoApplicationScreens screen = DemoApplicationScreens.valueOf(ajaxObject.getValue().getData());
                screen.getScreenToDisplay().setTouched(true);
                ajaxReceiver.addComponent(screen.getScreenToDisplay());
            }
            
            
        });

    }

    public JQXTree getNewTree()
    {
        return newTree;
    }

    public void setNewTree(JQXTree newTree)
    {
        this.newTree = newTree;
    }

    public ArrayList<JQXTreeItem> getTreeItems()
    {
        if (treeItems == null)
        {
            treeItems = new ArrayList<>();
        }
        return treeItems;
    }

    public void setTreeItems(ArrayList<JQXTreeItem> treeItems)
    {
        this.treeItems = treeItems;
    }

    public JQXTreeSourceDataAdapter getTreeAdapter()
    {
        return treeAdapter;
    }

    public void setTreeAdapter(JQXTreeSourceDataAdapter treeAdapter)
    {
        this.treeAdapter = treeAdapter;
    }

    public MenuTreeItem addItem(String name)
    {
        return addItem(name, DemoApplicationScreens.ComingSoon);
    }

    public MenuTreeItem addItem(String name, DemoApplicationScreens screen)
    {
        MenuTreeItem mti = new MenuTreeItem(name, screen);
        getNewTree().getOptions().getSource().add(mti);
        return mti;
    }

    public ArrayList<JQXTreeItem> addList(String header)
    {
        MenuTreeItem mti = addItem(header);
        mti.setExpanded(true);
        return mti.getItems();
    }

    public ArrayList<JQXTreeItem> addList(String header, String url)
    {
        MenuTreeItem mti = addItem(header);
        mti.setExpanded(true);
        mti.setIcon(url);
        return mti.getItems();
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
