package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t52 implements bs {

    /* renamed from: b, reason: collision with root package name */
    public static final String f4452b;

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f4453a;

    static {
        new u93(5).d();
        f4452b = wi3.z(0);
    }

    public t52(wy0 wy0Var) {
        this.f4453a = wy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t52)) {
            return false;
        }
        return this.f4453a.equals(((t52) obj).f4453a);
    }

    public final int hashCode() {
        return this.f4453a.hashCode();
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            wy0 wy0Var = this.f4453a;
            if (i < wy0Var.b()) {
                arrayList.add(Integer.valueOf(wy0Var.a(i)));
                i++;
            } else {
                bundle.putIntegerArrayList(f4452b, arrayList);
                return bundle;
            }
        }
    }
}
