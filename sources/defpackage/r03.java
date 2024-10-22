package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r03 extends ig2 {
    public static final String e = wi3.z(1);
    public static final String f = wi3.z(2);
    public static final qb0 g = new qb0(0);
    public final int c;
    public final float d;

    public r03(int i) {
        cp3.f(i > 0, "maxStars must be a positive integer");
        this.c = i;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r03)) {
            return false;
        }
        r03 r03Var = (r03) obj;
        if (this.c != r03Var.c || this.d != r03Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(ig2.f2588a, 2);
        bundle.putInt(e, this.c);
        bundle.putFloat(f, this.d);
        return bundle;
    }

    public r03(int i, float f2) {
        boolean z = false;
        cp3.f(i > 0, "maxStars must be a positive integer");
        if (f2 >= 0.0f && f2 <= i) {
            z = true;
        }
        cp3.f(z, "starRating is out of range [0, maxStars]");
        this.c = i;
        this.d = f2;
    }
}
