package org;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceLoader {
    private static ResourceBundle bundle = null;

    public static ResourceBundle loadResource(String resourceName, Locale locale){
        if(bundle==null){
            synchronized (ResourceLoader.class){
                if(locale!=null)
                    bundle = ResourceBundle.getBundle(resourceName,locale);
                else   bundle = ResourceBundle.getBundle(resourceName);
            }
        }
        return bundle;
    }
}