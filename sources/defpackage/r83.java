package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r83 extends ig2 {
    public static final String e = wi3.z(1);
    public static final String f = wi3.z(2);
    public static final qb0 g = new qb0(1);
    public final boolean c;
    public final boolean d;

    public r83() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r83)) {
            return false;
        }
        r83 r83Var = (r83) obj;
        if (this.d != r83Var.d || this.c != r83Var.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(ig2.f2588a, 3);
        bundle.putBoolean(e, this.c);
        bundle.putBoolean(f, this.d);
        return bundle;
    }

    public r83(boolean z) {
        this.c = true;
        this.d = z;
    }
}
