package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes2.dex */
public final class kk0 {

    /* renamed from: a, reason: collision with root package name */
    public final rd2 f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2961b;
    public final int c;

    public kk0(int i, int i2, Class cls) {
        this(rd2.a(cls), i, i2);
    }

    public static kk0 a(Class cls) {
        return new kk0(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kk0)) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        if (!this.f2960a.equals(kk0Var.f2960a) || this.f2961b != kk0Var.f2961b || this.c != kk0Var.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f2960a.hashCode() ^ 1000003) * 1000003) ^ this.f2961b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2960a);
        sb.append(", type=");
        int i = this.f2961b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(hx2.m("Unsupported injection: ", i2));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = DevicePublicKeyStringDef.DIRECT;
        }
        return hx2.s(sb, str2, "}");
    }

    public kk0(rd2 rd2Var, int i, int i2) {
        if (rd2Var != null) {
            this.f2960a = rd2Var;
            this.f2961b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null dependency anInterface.");
    }
}
