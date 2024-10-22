package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class vb3 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4810a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4811b;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f4810a = true;
        f4811b = true;
        if (i < 28) {
            z = false;
        }
        c = z;
    }
}
