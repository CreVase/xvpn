package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class at1 implements bs {
    public static final at1 d = new at1(new y33(15, 0));
    public static final String e = wi3.z(0);
    public static final String f = wi3.z(1);
    public static final String g = wi3.z(2);
    public static final qy2 h = new qy2(22);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f333a;

    /* renamed from: b, reason: collision with root package name */
    public final String f334b;
    public final Bundle c;

    public at1(y33 y33Var) {
        this.f333a = (Uri) y33Var.f5263b;
        this.f334b = (String) y33Var.c;
        this.c = (Bundle) y33Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at1)) {
            return false;
        }
        at1 at1Var = (at1) obj;
        if (wi3.a(this.f333a, at1Var.f333a) && wi3.a(this.f334b, at1Var.f334b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Uri uri = this.f333a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.f334b;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        Uri uri = this.f333a;
        if (uri != null) {
            bundle.putParcelable(e, uri);
        }
        String str = this.f334b;
        if (str != null) {
            bundle.putString(f, str);
        }
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putBundle(g, bundle2);
        }
        return bundle;
    }
}
