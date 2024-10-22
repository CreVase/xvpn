package defpackage;

/* loaded from: classes.dex */
public final class s92 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4296b;

    public s92(int i, boolean z) {
        this.f4295a = i;
        this.f4296b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s92.class != obj.getClass()) {
            return false;
        }
        s92 s92Var = (s92) obj;
        if (this.f4295a == s92Var.f4295a && this.f4296b == s92Var.f4296b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4295a * 31) + (this.f4296b ? 1 : 0);
    }
}
