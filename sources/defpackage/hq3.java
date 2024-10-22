package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class hq3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2471a;

    /* renamed from: b, reason: collision with root package name */
    public float f2472b;
    public final Interpolator c;
    public final long d;

    public hq3(int i, Interpolator interpolator, long j) {
        this.f2471a = i;
        this.c = interpolator;
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f2472b);
        }
        return this.f2472b;
    }

    public int c() {
        return this.f2471a;
    }

    public void d(float f) {
        this.f2472b = f;
    }
}
