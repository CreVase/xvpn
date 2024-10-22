package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w71 extends ig2 {
    public static final String e = wi3.z(1);
    public static final String f = wi3.z(2);
    public static final qy2 g = new qy2(18);
    public final boolean c;
    public final boolean d;

    public w71() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w71)) {
            return false;
        }
        w71 w71Var = (w71) obj;
        if (this.d != w71Var.d || this.c != w71Var.c) {
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
        bundle.putInt(ig2.f2588a, 0);
        bundle.putBoolean(e, this.c);
        bundle.putBoolean(f, this.d);
        return bundle;
    }

    public w71(boolean z) {
        this.c = true;
        this.d = z;
    }
}
