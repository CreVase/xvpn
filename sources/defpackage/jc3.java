package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class jc3 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2749b;
    public final Object c;

    public jc3(Object obj, Object obj2, Object obj3) {
        this.f2748a = obj;
        this.f2749b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3)) {
            return false;
        }
        jc3 jc3Var = (jc3) obj;
        return m20.L(this.f2748a, jc3Var.f2748a) && m20.L(this.f2749b, jc3Var.f2749b) && m20.L(this.c, jc3Var.c);
    }

    public final int hashCode() {
        Object obj = this.f2748a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2749b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2748a + ", " + this.f2749b + ", " + this.c + ')';
    }
}
