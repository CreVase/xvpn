package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class um1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f4697a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        boolean z;
        boolean z2;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f4697a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (localeArr[i].equals(locale)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            int length2 = localeArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (localeArr[i2].equals(locale2)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                String a2 = m91.a(locale);
                if (a2.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return a2.equals(m91.a(locale2));
            }
        }
        return false;
    }
}
