package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class c50 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f580a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f580a) {
            case 0:
                float f2 = f * 2.0f;
                if (f2 > 1.0f) {
                    return 1.0f;
                }
                return f2;
            default:
                if (f > 0.5d) {
                    return (f - 0.5f) * 2.0f;
                }
                return 0.0f;
        }
    }
}
