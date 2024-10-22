package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ic0 implements bs {
    public static final String c;
    public static final String d;

    /* renamed from: a, reason: collision with root package name */
    public final hb1 f2565a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2566b;

    static {
        db1 db1Var = hb1.f2394b;
        new ic0(ji2.e, 0L);
        c = wi3.z(0);
        d = wi3.z(1);
    }

    public ic0(List list, long j) {
        this.f2565a = hb1.l(list);
        this.f2566b = j;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        db1 db1Var = hb1.f2394b;
        m20.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (true) {
            hb1 hb1Var = this.f2565a;
            if (i < hb1Var.size()) {
                if (((hc0) hb1Var.get(i)).d == null) {
                    hc0 hc0Var = (hc0) hb1Var.get(i);
                    hc0Var.getClass();
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        objArr = Arrays.copyOf(objArr, pe0.q(objArr.length, i3));
                    }
                    objArr[i2] = hc0Var;
                    i2 = i3;
                }
                i++;
            } else {
                bundle.putParcelableArrayList(c, cp3.R(hb1.j(i2, objArr)));
                bundle.putLong(d, this.f2566b);
                return bundle;
            }
        }
    }
}
