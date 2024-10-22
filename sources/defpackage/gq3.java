package defpackage;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class gq3 extends hq3 {
    public final WindowInsetsAnimation e;

    public gq3(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.hq3
    public final long a() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.hq3
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.hq3
    public final int c() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.hq3
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
