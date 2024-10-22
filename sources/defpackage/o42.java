package defpackage;

/* loaded from: classes.dex */
public final class o42 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3598a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3599b;

    public o42(Object obj, Object obj2) {
        this.f3598a = obj;
        this.f3599b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o42)) {
            return false;
        }
        o42 o42Var = (o42) obj;
        if (!w12.a(o42Var.f3598a, this.f3598a) || !w12.a(o42Var.f3599b, this.f3599b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.f3598a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f3599b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f3598a + " " + this.f3599b + "}";
    }
}
