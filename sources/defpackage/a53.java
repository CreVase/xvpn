package defpackage;

/* loaded from: classes.dex */
public final class a53 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28b;

    public a53(String str, int i) {
        this.f27a = str;
        this.f28b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a53)) {
            return false;
        }
        a53 a53Var = (a53) obj;
        if (this.f28b != a53Var.f28b) {
            return false;
        }
        return this.f27a.equals(a53Var.f27a);
    }

    public final int hashCode() {
        return (this.f27a.hashCode() * 31) + this.f28b;
    }
}
