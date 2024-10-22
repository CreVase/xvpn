package defpackage;

import android.content.res.Resources;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class jf3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ja1 f2758a;

    /* renamed from: b, reason: collision with root package name */
    public static final mo1 f2759b;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f2758a = new of3();
        } else if (i >= 28) {
            f2758a = new nf3();
        } else if (i >= 26) {
            f2758a = new mf3();
        } else {
            if (i >= 24) {
                if (lf3.e != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    f2758a = new lf3();
                }
            }
            f2758a = new kf3();
        }
        f2759b = new mo1(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:            if (r3.equals(r5) == false) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r19, defpackage.g01 r20, android.content.res.Resources r21, int r22, java.lang.String r23, int r24, int r25, defpackage.tf3 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf3.a(android.content.Context, g01, android.content.res.Resources, int, java.lang.String, int, int, tf3, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
