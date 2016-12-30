/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.demo;

import za.co.mmagon.jwebswing.base.references.JavascriptReference;

/**
 *
 * @author GedMarc
 * @since 27 Apr 2015
 */
public enum ThemeManagerSwitcherReferencePool
{

    JQueryThemeSwitcher(new JQueryThemeManagerReference());

    private ThemeManagerSwitcherReferencePool(JavascriptReference reference)
    {
        this.reference = reference;
    }

    private final JavascriptReference reference;

    public JavascriptReference getReference()
    {
        return reference;
    }
}
