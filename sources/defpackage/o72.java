package defpackage;

/* loaded from: classes2.dex */
public final class o72 extends p32 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3615a;

    public o72(Object obj) {
        this.f3615a = obj;
    }

    @Override // defpackage.p32
    public final Object a() {
        return this.f3615a;
    }

    @Override // defpackage.p32
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o72) {
            return this.f3615a.equals(((o72) obj).f3615a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3615a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3615a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
