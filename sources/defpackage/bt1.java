package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class bt1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f525b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public bt1(ct1 ct1Var) {
        this.f524a = (Uri) ct1Var.d;
        this.f525b = ct1Var.f1671a;
        this.c = (String) ct1Var.e;
        this.d = ct1Var.f1672b;
        this.e = ct1Var.c;
        this.f = (String) ct1Var.f;
        this.g = (String) ct1Var.g;
    }

    public final ct1 a() {
        return new ct1(this);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1Var = (bt1) obj;
        if (this.f524a.equals(bt1Var.f524a) && wi3.a(this.f525b, bt1Var.f525b) && wi3.a(this.c, bt1Var.c) && this.d == bt1Var.d && this.e == bt1Var.e && wi3.a(this.f, bt1Var.f) && wi3.a(this.g, bt1Var.g)) {
            return true;
        }
        return false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f524a.hashCode() * 31;
        int i = 0;
        String str = this.f525b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((((i2 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }
}
