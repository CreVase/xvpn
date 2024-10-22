package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class za3 implements bs {
    public static final String c = wi3.z(0);
    public static final String d = wi3.z(1);

    /* renamed from: a, reason: collision with root package name */
    public final ua3 f5452a;

    /* renamed from: b, reason: collision with root package name */
    public final hb1 f5453b;

    static {
        new ef0(13);
    }

    public za3(ua3 ua3Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= ua3Var.f4643a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f5452a = ua3Var;
        this.f5453b = hb1.l(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || za3.class != obj.getClass()) {
            return false;
        }
        za3 za3Var = (za3) obj;
        if (this.f5452a.equals(za3Var.f5452a) && this.f5453b.equals(za3Var.f5453b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5453b.hashCode() * 31) + this.f5452a.hashCode();
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(c, this.f5452a.toBundle());
        bundle.putIntArray(d, cp3.Q(this.f5453b));
        return bundle;
    }
}
