package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f8 implements p90 {

    /* renamed from: a, reason: collision with root package name */
    public final p90 f2056a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2057b;

    public f8(float f, p90 p90Var) {
        while (p90Var instanceof f8) {
            p90Var = ((f8) p90Var).f2056a;
            f += ((f8) p90Var).f2057b;
        }
        this.f2056a = p90Var;
        this.f2057b = f;
    }

    @Override // defpackage.p90
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2056a.a(rectF) + this.f2057b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        if (this.f2056a.equals(f8Var.f2056a) && this.f2057b == f8Var.f2057b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2056a, Float.valueOf(this.f2057b)});
    }
}
