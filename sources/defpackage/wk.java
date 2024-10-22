package defpackage;

/* loaded from: classes2.dex */
public final class wk extends nb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5025a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5026b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final za0 g;
    public final mb0 h;
    public final lb0 i;
    public final ab0 j;
    public final gb1 k;
    public final int l;

    public wk(String str, String str2, String str3, long j, Long l, boolean z, za0 za0Var, mb0 mb0Var, lb0 lb0Var, ab0 ab0Var, gb1 gb1Var, int i) {
        this.f5025a = str;
        this.f5026b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = za0Var;
        this.h = mb0Var;
        this.i = lb0Var;
        this.j = ab0Var;
        this.k = gb1Var;
        this.l = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        wk wkVar = (wk) ((nb0) obj);
        if (this.f5025a.equals(wkVar.f5025a)) {
            if (this.f5026b.equals(wkVar.f5026b)) {
                String str = wkVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == wkVar.d) {
                        Long l = wkVar.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == wkVar.f && this.g.equals(wkVar.g)) {
                                mb0 mb0Var = wkVar.h;
                                mb0 mb0Var2 = this.h;
                                if (mb0Var2 != null ? mb0Var2.equals(mb0Var) : mb0Var == null) {
                                    lb0 lb0Var = wkVar.i;
                                    lb0 lb0Var2 = this.i;
                                    if (lb0Var2 != null ? lb0Var2.equals(lb0Var) : lb0Var == null) {
                                        ab0 ab0Var = wkVar.j;
                                        ab0 ab0Var2 = this.j;
                                        if (ab0Var2 != null ? ab0Var2.equals(ab0Var) : ab0Var == null) {
                                            gb1 gb1Var = wkVar.k;
                                            gb1 gb1Var2 = this.k;
                                            if (gb1Var2 != null ? gb1Var2.equals(gb1Var) : gb1Var == null) {
                                                if (this.l == wkVar.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f5025a.hashCode() ^ 1000003) * 1000003) ^ this.f5026b.hashCode()) * 1000003;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode6 ^ hashCode) * 1000003;
        long j = this.d;
        int i4 = (i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i5 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        mb0 mb0Var = this.h;
        if (mb0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mb0Var.hashCode();
        }
        int i6 = (hashCode7 ^ hashCode3) * 1000003;
        lb0 lb0Var = this.i;
        if (lb0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = lb0Var.hashCode();
        }
        int i7 = (i6 ^ hashCode4) * 1000003;
        ab0 ab0Var = this.j;
        if (ab0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = ab0Var.hashCode();
        }
        int i8 = (i7 ^ hashCode5) * 1000003;
        gb1 gb1Var = this.k;
        if (gb1Var != null) {
            i2 = gb1Var.hashCode();
        }
        return ((i8 ^ i2) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f5025a);
        sb.append(", identifier=");
        sb.append(this.f5026b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return hx2.r(sb, this.l, "}");
    }
}
