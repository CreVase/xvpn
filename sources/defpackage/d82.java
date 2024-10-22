package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d82 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1747b;
    public final HashMap c;

    public d82(String str, int i) {
        HashMap hashMap = new HashMap();
        this.f1746a = str;
        this.f1747b = i;
        this.c = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d82)) {
            return false;
        }
        d82 d82Var = (d82) obj;
        return m20.L(this.f1746a, d82Var.f1746a) && this.f1747b == d82Var.f1747b && m20.L(this.c, d82Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f1746a.hashCode() * 31) + this.f1747b) * 31);
    }

    public final String toString() {
        return "PrivacyPolicyItem(content=" + this.f1746a + ", type=" + this.f1747b + ", styles=" + this.c + ")";
    }
}
