package defpackage;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ur {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4720a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        tr trVar = tr.f4560a;
        if (i >= 30) {
            trVar.a(30);
        }
        if (i >= 30) {
            trVar.a(31);
        }
        if (i >= 30) {
            trVar.a(33);
        }
        if (i >= 30) {
            trVar.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (m20.L("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && (i < 30 || !a("S", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 32 || !a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }
}
