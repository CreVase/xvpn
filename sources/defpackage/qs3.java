package defpackage;

/* loaded from: classes.dex */
public final class qs3 {

    /* renamed from: a, reason: collision with root package name */
    public String f4051a;

    /* renamed from: b, reason: collision with root package name */
    public fs3 f4052b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs3)) {
            return false;
        }
        qs3 qs3Var = (qs3) obj;
        if (this.f4052b != qs3Var.f4052b) {
            return false;
        }
        return this.f4051a.equals(qs3Var.f4051a);
    }

    public final int hashCode() {
        return this.f4052b.hashCode() + (this.f4051a.hashCode() * 31);
    }
}
