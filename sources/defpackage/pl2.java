package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class pl2 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f3867a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3868b = 0;

    public static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - f3867a) * f2) + (f * 1.5f));
        }
        return f * 1.5f;
    }
}
