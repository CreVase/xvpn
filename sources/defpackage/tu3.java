package defpackage;

import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public final class tu3 extends LinearInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb f4581a;

    public tu3(fb fbVar) {
        this.f4581a = fbVar;
    }

    @Override // android.view.animation.LinearInterpolator, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        this.f4581a.f2068b = f;
        return super.getInterpolation(f);
    }
}
