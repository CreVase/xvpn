package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class rp0 {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4198b;
    public final int c;
    public final int d;
    public final float e;

    public rp0(Context context) {
        boolean K = cp3.K(context, he2.elevationOverlayEnabled, false);
        int w = zf3.w(context, he2.elevationOverlayColor, 0);
        int w2 = zf3.w(context, he2.elevationOverlayAccentColor, 0);
        int w3 = zf3.w(context, he2.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4197a = K;
        this.f4198b = w;
        this.c = w2;
        this.d = w3;
        this.e = f2;
    }
}
