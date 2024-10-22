package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class w40 {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, wm1 wm1Var) {
        configuration.setLocales((LocaleList) wm1Var.f5038a.b());
    }
}
