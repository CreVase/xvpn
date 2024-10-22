package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ri2 implements p90 {

    /* renamed from: a, reason: collision with root package name */
    public final float f4159a;

    public ri2(float f) {
        this.f4159a = f;
    }

    @Override // defpackage.p90
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f4159a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ri2) && this.f4159a == ((ri2) obj).f4159a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4159a)});
    }
}
