package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s implements p90 {

    /* renamed from: a, reason: collision with root package name */
    public final float f4245a;

    public s(float f) {
        this.f4245a = f;
    }

    @Override // defpackage.p90
    public final float a(RectF rectF) {
        return this.f4245a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && this.f4245a == ((s) obj).f4245a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4245a)});
    }
}
