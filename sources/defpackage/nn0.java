package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class nn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3496b;
    public final Drawable c;
    public final int d;
    public boolean e;
    public final v31 f;

    public nn0(String str, int i, int i2, kn0 kn0Var, int i3) {
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        v31 v31Var = (i3 & 32) != 0 ? m01.l : kn0Var;
        this.f3495a = str;
        this.f3496b = i;
        this.c = null;
        this.d = i2;
        this.e = false;
        this.f = v31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn0)) {
            return false;
        }
        nn0 nn0Var = (nn0) obj;
        return m20.L(this.f3495a, nn0Var.f3495a) && this.f3496b == nn0Var.f3496b && m20.L(this.c, nn0Var.c) && this.d == nn0Var.d && this.e == nn0Var.e && m20.L(this.f, nn0Var.f);
    }

    public final int hashCode() {
        int hashCode = ((this.f3495a.hashCode() * 31) + this.f3496b) * 31;
        Drawable drawable = this.c;
        return this.f.hashCode() + ((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "DrawerItem(title=" + this.f3495a + ", iconRes=" + this.f3496b + ", icon=" + this.c + ", dividerType=" + this.d + ", showRedPoint=" + this.e + ", onClick=" + this.f + ")";
    }
}
