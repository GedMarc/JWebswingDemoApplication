package za.co.mmagon.jwebswing.demo.screens.view.jqueryui;

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.components.globalize.cultures.GlobalizeCultures;
import za.co.mmagon.jwebswing.components.jqueryui.spinner.JQUISpinner;
import za.co.mmagon.jwebswing.components.jqueryui.spinner.JQUISpinnerTime;
import za.co.mmagon.jwebswing.demo.DefaultScreenDisplay;
import za.co.mmagon.jwebswing.demo.components.DemoHeader;
import za.co.mmagon.jwebswing.demo.screens.ComponentOptionsScreen;
import za.co.mmagon.jwebswing.demo.screens.MainWindowDisplay;
import za.co.mmagon.jwebswing.demo.screens.SourceCodeScreen;

/**
 *
 * @author GedMarc
 * @since 01 May 2015
 */
public class JQUISpinnerDemo extends DefaultScreenDisplay
{

    private static final long serialVersionUID = 1L;
    private final String headerText = "JQuery UI Spinner Demo";

    @Override
    public SourceCodeScreen getSourceCodeScreen()
    {
        SourceCodeScreen scs = new SourceCodeScreen();
        scs.addButton("Spinner Demo", this.getClass());
        return scs;
    }

    @Override
    public ComponentOptionsScreen getComponentOptionsScreen()
    {
        return new ComponentOptionsScreen();
    }

    private JQUISpinner spinner;
    private JQUISpinner spinnerCurrency;
    private JQUISpinner spinnerCurrencyRand;
    private JQUISpinner spinnerDecimal;
    private JQUISpinner spinnerMapLong;
    private JQUISpinner spinnerMapLat;
    private JQUISpinnerTime spinnerTime;

    public JQUISpinner getSpinner()
    {
        if (spinner == null)
        {
            spinner = new JQUISpinner("This is a Basic Spinner");
        }
        spinner.getOptions().setIncremental(true);
        return spinner;
    }

    public JQUISpinner getSpinnerCurrency()
    {
        if (spinnerCurrency == null)
        {
            spinnerCurrency = new JQUISpinner("This is a Currency Spinner (Euro)");
        }

        spinnerCurrency.addGlobalization(GlobalizeCultures.eu);

        spinnerCurrency.getOptions().setNumberFormat("C");
        spinnerCurrency.getOptions().setMin(5);
        spinnerCurrency.getOptions().setMax(2500);
        spinnerCurrency.getOptions().setStep(25);
        return spinnerCurrency;
    }

    public JQUISpinner getSpinnerCurrencyRand()
    {
        if (spinnerCurrencyRand == null)
        {
            spinnerCurrencyRand = new JQUISpinner("This is a Currency Spinner (Rand)");
        }

        spinnerCurrencyRand.addGlobalization(GlobalizeCultures.af_ZA);

        spinnerCurrencyRand.getOptions().setNumberFormat("C");
        spinnerCurrencyRand.getOptions().setMin(5);
        spinnerCurrencyRand.getOptions().setMax(2500);
        spinnerCurrencyRand.getOptions().setStep(25);

        return spinnerCurrencyRand;
    }

    public JQUISpinner getSpinnerDecimal()
    {
        if (spinnerDecimal == null)
        {
            spinnerDecimal = new JQUISpinner("This is a Decimal Spinner");
        }

        spinnerDecimal.addGlobalization(GlobalizeCultures.eu);

        spinnerDecimal.getOptions().setNumberFormat("N");
        spinnerDecimal.getOptions().setStep(0.25);
        return spinnerDecimal;
    }

    public JQUISpinner getSpinnerMapLong()
    {
        if (spinnerMapLong == null)
        {
            spinnerMapLong = new JQUISpinner("This is a Longitude Setting");
        }
        spinnerMapLong.setID("long");
        spinnerMapLong.addGlobalization(GlobalizeCultures.eu);

        spinnerMapLong.getOptions().setNumberFormat("N");
        spinnerMapLong.getOptions().setStep(0.25);
        spinnerMapLong.getInput().addAttribute(GlobalAttributes.Value, "-93.278");

        return spinnerMapLong;
    }

    public JQUISpinner getSpinnerMapLat()
    {
        if (spinnerMapLat == null)
        {
            spinnerMapLat = new JQUISpinner("This is a Latitude Setting");
        }
        spinnerMapLat.setID("lat");
        spinnerMapLat.addGlobalization(GlobalizeCultures.eu);

        spinnerMapLat.getOptions().setNumberFormat("N");
        spinnerMapLat.getOptions().setStep(0.25);

        spinnerMapLat.getInput().addAttribute(GlobalAttributes.Value, "44.797");

        return spinnerMapLat;
    }

    public JQUISpinnerTime getSpinnerTime()
    {
        if (spinnerTime == null)
        {
            spinnerTime = new JQUISpinnerTime("This is a Time Spinner");
        }

        spinnerTime.addGlobalization(GlobalizeCultures.eu);

        return spinnerTime;
    }

    /**
     * Returns the spinner demo screen
     *
     * @return
     */
    @Override
    public MainWindowDisplay getDefaultDisplayScreen()
    {
        MainWindowDisplay mwd = new MainWindowDisplay();
        mwd.add(new DemoHeader(HeaderTypes.H1, headerText));
        mwd.add("All Spinners Have Globalization Already Implemented.<br>"
                + "These spinners are configured with the following settings<br>"
                + "<ul><li>Min : 5</li><li>Max : 2500</li><li>Culture : Euro</li><li>Step : 25</li></ul><br>"
                + "");
        mwd.add(getSpinner());
        mwd.add(getSpinnerCurrency());
        mwd.add(getSpinnerCurrencyRand());
        mwd.add(getSpinnerDecimal());
        mwd.add(getSpinnerTime());
        mwd.add(getSpinnerMapLat());
        mwd.add(getSpinnerMapLong());

        return mwd;
    }

}
