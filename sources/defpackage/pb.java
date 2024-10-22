package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public abstract class pb {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3811a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final uv0 f3812b = new uv0();
    public static final tv0 c = new tv0();
    public static final mk1 d = new mk1();
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : hx2.f(f2, f, (f5 - f3) / (f4 - f3), f);
    }
}
