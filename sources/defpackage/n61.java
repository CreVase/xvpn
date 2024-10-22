package defpackage;

/* loaded from: classes2.dex */
public final class n61 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3402b;
    public final String c;
    public final String d;

    public n61(int i, String str, String str2, String str3) {
        this.f3401a = i;
        this.f3402b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n61)) {
            return false;
        }
        n61 n61Var = (n61) obj;
        return this.f3401a == n61Var.f3401a && m20.L(this.f3402b, n61Var.f3402b) && m20.L(this.c, n61Var.c) && m20.L(this.d, n61Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p71.h(this.c, p71.h(this.f3402b, this.f3401a * 31, 31), 31);
    }

    public final String toString() {
        return "CommentInfo(avatarRes=" + this.f3401a + ", name=" + this.f3402b + ", country=" + this.c + ", comment=" + this.d + ")";
    }
}
