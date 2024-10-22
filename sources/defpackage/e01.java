package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.vungle.ads.VungleError;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class e01 {

    /* renamed from: a, reason: collision with root package name */
    public static final mo1 f1869a = new mo1(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1870b;
    public static final Object c;
    public static final uu2 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, VungleError.DEFAULT, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new nj2());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1870b = threadPoolExecutor;
        c = new Object();
        d = new uu2();
    }

    public static d01 a(String str, Context context, kc kcVar, int i) {
        int i2;
        mo1 mo1Var = f1869a;
        Typeface typeface = (Typeface) mo1Var.get(str);
        if (typeface != null) {
            return new d01(typeface);
        }
        try {
            q9 y = cp3.y(context, kcVar);
            int i3 = y.f3969a;
            int i4 = 1;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                l01[] l01VarArr = (l01[]) y.f3970b;
                if (l01VarArr != null && l01VarArr.length != 0) {
                    for (l01 l01Var : l01VarArr) {
                        int i5 = l01Var.e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
            }
            if (i2 != 0) {
                return new d01(i2);
            }
            Typeface z = jf3.f2758a.z(context, (l01[]) y.f3970b, i);
            if (z != null) {
                mo1Var.put(str, z);
                return new d01(z);
            }
            return new d01(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new d01(-1);
        }
    }
}
