package defpackage;

/* loaded from: classes2.dex */
public final class br2 {

    /* renamed from: a, reason: collision with root package name */
    public final er2 f516a;

    /* renamed from: b, reason: collision with root package name */
    public final vf f517b;

    public br2(er2 er2Var, vf vfVar) {
        this.f516a = er2Var;
        this.f517b = vfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br2)) {
            return false;
        }
        br2 br2Var = (br2) obj;
        br2Var.getClass();
        return m20.L(this.f516a, br2Var.f516a) && m20.L(this.f517b, br2Var.f517b);
    }

    public final int hashCode() {
        return this.f517b.hashCode() + ((this.f516a.hashCode() + (ps0.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + ps0.SESSION_START + ", sessionData=" + this.f516a + ", applicationInfo=" + this.f517b + ')';
    }
}
