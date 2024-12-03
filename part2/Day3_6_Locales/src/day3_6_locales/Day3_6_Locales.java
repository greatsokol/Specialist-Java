package day3_6_locales;

import java.util.Locale;
import java.util.ResourceBundle;

public class Day3_6_Locales {

    public static void main(String[] args) {
        Locale loc = Locale.forLanguageTag("en");
        System.out.println(loc.getDisplayLanguage());
        ResourceBundle bundle = ResourceBundle.getBundle("day3_6_locales.locale", loc);
        System.out.println(bundle.getLocale().getDisplayLanguage());
        System.out.println(bundle.getString("hello"));
    }
}
