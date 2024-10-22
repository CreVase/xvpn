package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class wm1 {

    /* renamed from: b, reason: collision with root package name */
    public static final wm1 f5037b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final ym1 f5038a;

    public wm1(ym1 ym1Var) {
        this.f5038a = ym1Var;
    }

    public static wm1 a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f(vm1.a(localeArr));
        }
        return new wm1(new xm1(localeArr));
    }

    public static wm1 b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = um1.a(split[i]);
            }
            return a(localeArr);
        }
        return f5037b;
    }

    public static wm1 f(LocaleList localeList) {
        return new wm1(new zm1(localeList));
    }

    public final Locale c(int i) {
        return this.f5038a.get(i);
    }

    public final boolean d() {
        return this.f5038a.isEmpty();
    }

    public final String e() {
        return this.f5038a.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wm1) {
            if (this.f5038a.equals(((wm1) obj).f5038a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5038a.hashCode();
    }

    public final String toString() {
        return this.f5038a.toString();
    }
}
