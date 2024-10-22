package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class lo1 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3161a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3162b;

    public lo1(float[] fArr) {
        this.f3161a = fArr;
        this.f3162b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3161a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f3162b;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return hx2.f(fArr[min + 1], f4, f3, f4);
    }
}
