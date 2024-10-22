package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class n42 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3395a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3396b;

    public n42(Object obj, Object obj2) {
        this.f3395a = obj;
        this.f3396b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n42)) {
            return false;
        }
        n42 n42Var = (n42) obj;
        return m20.L(this.f3395a, n42Var.f3395a) && m20.L(this.f3396b, n42Var.f3396b);
    }

    public final int hashCode() {
        Object obj = this.f3395a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3396b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3395a + ", " + this.f3396b + ')';
    }
}
