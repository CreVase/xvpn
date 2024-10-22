package defpackage;

/* loaded from: classes2.dex */
public final class w50 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4943b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public int j;

    public w50(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i2) {
        this.f4942a = i;
        this.f4943b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        return this.f4942a == w50Var.f4942a && m20.L(this.f4943b, w50Var.f4943b) && m20.L(this.c, w50Var.c) && m20.L(this.d, w50Var.d) && m20.L(this.e, w50Var.e) && m20.L(this.f, w50Var.f) && m20.L(this.g, w50Var.g) && m20.L(this.h, w50Var.h) && this.i == w50Var.i && this.j == w50Var.j;
    }

    public final int hashCode() {
        int i;
        int h = p71.h(this.h, p71.h(this.g, p71.h(this.f, p71.h(this.e, p71.h(this.d, p71.h(this.c, p71.h(this.f4943b, this.f4942a * 31, 31), 31), 31), 31), 31), 31), 31);
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((h + i) * 31) + this.j;
    }

    public final String toString() {
        return "ConnectionLog(type=" + this.f4942a + ", id=" + this.f4943b + ", status=" + this.c + ", serverName=" + this.d + ", protocolName=" + this.e + ", connIP=" + this.f + ", connTimeStr=" + this.g + ", from=" + this.h + ", saved=" + this.i + ", pingStatus=" + this.j + ")";
    }
}
