package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class ul3 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4694a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f4694a) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 1:
                float f3 = f * 2;
                if (f3 > 1.0f) {
                    return 1.0f;
                }
                return f3;
            default:
                if (f > 0.5d) {
                    return (f - 0.5f) * 2;
                }
                return 0.0f;
        }
    }
}
