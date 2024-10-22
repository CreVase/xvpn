package defpackage;

import a.bx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class cz {
    public static boolean A;
    public static boolean B;
    public static tt3 C;
    public static tt3 D;
    public static tt3 E;
    public static boolean F;
    public static int G;
    public static long H;
    public static boolean I;
    public static wt3 J;
    public static String K;
    public static final HashSet L;
    public static String M;
    public static Pattern N;
    public static ky O;

    /* renamed from: a, reason: collision with root package name */
    public static int f1702a;

    /* renamed from: b, reason: collision with root package name */
    public static int f1703b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static float i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static Drawable q;
    public static Drawable r;
    public static Drawable s;
    public static Drawable t;
    public static sp0 u;
    public static final ey1 v = new ey1();
    public static int w = -1;
    public static final long x;
    public static final long y;
    public static final long z;

    static {
        bx i2 = hx2.i(23);
        long t2 = i2.t();
        i2.h();
        x = t2;
        bx i3 = hx2.i(24);
        long t3 = i3.t();
        i3.h();
        y = t3;
        bx i4 = hx2.i(25);
        long t4 = i4.t();
        i4.h();
        z = t4;
        K = "";
        L = new HashSet();
        M = "";
    }

    public static void a(Context context) {
        if (w < 0) {
            int i2 = context.getSharedPreferences("message", 0).getInt("unread_message", 0);
            w = i2;
            v.j(Integer.valueOf(i2));
        }
    }
}
