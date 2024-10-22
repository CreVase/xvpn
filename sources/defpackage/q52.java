package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class q52 implements bs {
    public static final q52 d = new q52(1.0f, 1.0f);
    public static final String e = wi3.z(0);
    public static final String f = wi3.z(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3958b;
    public final int c;

    public q52(float f2, float f3) {
        boolean z;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        cp3.e(f3 > 0.0f);
        this.f3957a = f2;
        this.f3958b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q52.class != obj.getClass()) {
            return false;
        }
        q52 q52Var = (q52) obj;
        if (this.f3957a == q52Var.f3957a && this.f3958b == q52Var.f3958b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3958b) + ((Float.floatToRawIntBits(this.f3957a) + 527) * 31);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(e, this.f3957a);
        bundle.putFloat(f, this.f3958b);
        return bundle;
    }

    public final String toString() {
        return wi3.m("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f3957a), Float.valueOf(this.f3958b));
    }
}
