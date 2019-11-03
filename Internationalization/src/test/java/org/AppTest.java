package org;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final String GERMAN = "de";
    private static final String ENGLISH = "en";
    private static final String RESOURCE_NAME = "xplorr";
    private static final String LANGUAGE = "language";
    private static final String MESSAGE_KEY = "message";

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testInternationalization()
    {
        String country = System.getProperty(LANGUAGE);
        ResourceBundle bundle = null;

        if(country.equalsIgnoreCase(GERMAN))
            bundle = ResourceLoader.loadResource(RESOURCE_NAME, Locale.GERMAN);
        else if(country.equalsIgnoreCase(ENGLISH))
            bundle = ResourceLoader.loadResource(RESOURCE_NAME, Locale.ENGLISH);
        else bundle = ResourceLoader.loadResource(RESOURCE_NAME, Locale.ENGLISH);

        System.out.println(bundle.getString(MESSAGE_KEY));
    }
}