package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class ad {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static wm1 b(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return wm1.b(languageTags);
    }

    public static void c(wm1 wm1Var) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(wm1Var.e());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void d(Configuration configuration, wm1 wm1Var) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(wm1Var.e());
        configuration.setLocales(forLanguageTags);
    }
}
