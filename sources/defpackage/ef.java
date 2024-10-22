package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ef {

    /* renamed from: a, reason: collision with root package name */
    public final String f1926a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f1927b;
    public final String c;
    public final boolean d;
    public final int e;
    public boolean f;

    public ef(String str, Drawable drawable, String str2, boolean z, int i, int i2) {
        z = (i2 & 8) != 0 ? false : z;
        i = (i2 & 16) != 0 ? -1 : i;
        this.f1926a = str;
        this.f1927b = drawable;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj;
        return m20.L(this.f1926a, efVar.f1926a) && m20.L(this.f1927b, efVar.f1927b) && m20.L(this.c, efVar.c) && this.d == efVar.d && this.e == efVar.e && this.f == efVar.f;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.f1926a.hashCode() * 31;
        Drawable drawable = this.f1927b;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int h = p71.h(this.c, (hashCode2 + hashCode) * 31, 31);
        int i2 = 1231;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (((h + i) * 31) + this.e) * 31;
        if (!this.f) {
            i2 = 1237;
        }
        return i3 + i2;
    }

    public final String toString() {
        return "AppInfoData(name=" + this.f1926a + ", icon=" + this.f1927b + ", packageName=" + this.c + ", isAllList=" + this.d + ", flag=" + this.e + ", isGroupHead=" + this.f + ")";
    }
}
