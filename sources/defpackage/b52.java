package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b52 extends ig2 {
    public static final String d = wi3.z(1);
    public static final qy2 e = new qy2(24);
    public final float c;

    public b52() {
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b52)) {
            return false;
        }
        if (this.c != ((b52) obj).c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(ig2.f2588a, 1);
        bundle.putFloat(d, this.c);
        return bundle;
    }

    public b52(float f) {
        cp3.f(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.c = f;
    }
}
