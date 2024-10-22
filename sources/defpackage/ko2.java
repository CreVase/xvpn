package defpackage;

/* loaded from: classes.dex */
public final class ko2 {

    /* renamed from: a, reason: collision with root package name */
    public final no2 f2988a;

    /* renamed from: b, reason: collision with root package name */
    public final no2 f2989b;

    public ko2(no2 no2Var, no2 no2Var2) {
        this.f2988a = no2Var;
        this.f2989b = no2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ko2.class != obj.getClass()) {
            return false;
        }
        ko2 ko2Var = (ko2) obj;
        if (this.f2988a.equals(ko2Var.f2988a) && this.f2989b.equals(ko2Var.f2989b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2989b.hashCode() + (this.f2988a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        no2 no2Var = this.f2988a;
        sb.append(no2Var);
        no2 no2Var2 = this.f2989b;
        if (no2Var.equals(no2Var2)) {
            str = "";
        } else {
            str = ", " + no2Var2;
        }
        return hx2.s(sb, str, "]");
    }
}
