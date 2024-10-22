package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class ly1 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3206a = 0;

    public static Context a(Context context) {
        Context createConfigurationContext;
        wm1 b2;
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        String P = ew3.P();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (sc.d().d()) {
                P = "auto";
            } else {
                P = sc.d().e();
            }
            ew3.l0(P.split("-")[0]);
        }
        if ("auto".equals(P)) {
            Context context2 = zf3.f5472a;
            wm1 wm1Var = wm1.f5037b;
            if (i >= 33) {
                Object systemService = context2.getSystemService("locale");
                if (systemService != null) {
                    wm1Var = wm1.f(cn1.b(systemService));
                }
            } else {
                Configuration configuration2 = Resources.getSystem().getConfiguration();
                if (i >= 24) {
                    b2 = bn1.a(configuration2);
                } else {
                    b2 = wm1.b(an1.a(configuration2.locale));
                }
                wm1Var = b2;
            }
            P = wm1Var.e().split("-")[0];
        }
        Locale locale = new Locale(P);
        if (i >= 24) {
            configuration.setLocale(locale);
            q2.D();
            LocaleList j = q2.j(new Locale[]{locale});
            LocaleList.setDefault(j);
            configuration.setLocales(j);
            createConfigurationContext = context.createConfigurationContext(configuration);
        } else {
            configuration.setLocale(locale);
            createConfigurationContext = context.createConfigurationContext(configuration);
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return createConfigurationContext;
    }

    public static Configuration b(Context context) {
        wm1 b2;
        a(context.getApplicationContext());
        Configuration configuration = context.getResources().getConfiguration();
        String P = ew3.P();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (sc.d().d()) {
                P = "auto";
            } else {
                P = sc.d().e();
            }
            ew3.l0(P.split("-")[0]);
        }
        if ("auto".equals(P)) {
            Context context2 = zf3.f5472a;
            wm1 wm1Var = wm1.f5037b;
            if (i >= 33) {
                Object systemService = context2.getSystemService("locale");
                if (systemService != null) {
                    wm1Var = wm1.f(cn1.b(systemService));
                }
            } else {
                Configuration configuration2 = Resources.getSystem().getConfiguration();
                if (i >= 24) {
                    b2 = bn1.a(configuration2);
                } else {
                    b2 = wm1.b(an1.a(configuration2.locale));
                }
                wm1Var = b2;
            }
            P = wm1Var.e().split("-")[0];
        }
        Locale locale = new Locale(P);
        if (i >= 26) {
            configuration.setLocale(locale);
            q2.D();
            LocaleList j = q2.j(new Locale[]{locale});
            LocaleList.setDefault(j);
            configuration.setLocales(j);
        } else {
            configuration.setLocale(locale);
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        return configuration;
    }
}
