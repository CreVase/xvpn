package defpackage;

/* loaded from: classes2.dex */
public final class bl extends hb0 {

    /* renamed from: a, reason: collision with root package name */
    public final gb0 f482a;

    /* renamed from: b, reason: collision with root package name */
    public final gb1 f483b;
    public final gb1 c;
    public final Boolean d;
    public final int e;

    public bl(gb0 gb0Var, gb1 gb1Var, gb1 gb1Var2, Boolean bool, int i) {
        this.f482a = gb0Var;
        this.f483b = gb1Var;
        this.c = gb1Var2;
        this.d = bool;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        gb1 gb1Var;
        gb1 gb1Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        bl blVar = (bl) ((hb0) obj);
        if (this.f482a.equals(blVar.f482a) && ((gb1Var = this.f483b) != null ? gb1Var.equals(blVar.f483b) : blVar.f483b == null) && ((gb1Var2 = this.c) != null ? gb1Var2.equals(blVar.c) : blVar.c == null) && ((bool = this.d) != null ? bool.equals(blVar.d) : blVar.d == null) && this.e == blVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f482a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        gb1 gb1Var = this.f483b;
        if (gb1Var == null) {
            hashCode = 0;
        } else {
            hashCode = gb1Var.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        gb1 gb1Var2 = this.c;
        if (gb1Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gb1Var2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((i3 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f482a);
        sb.append(", customAttributes=");
        sb.append(this.f483b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", uiOrientation=");
        return hx2.r(sb, this.e, "}");
    }
}
