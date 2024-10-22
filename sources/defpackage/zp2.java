package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zp2 {

    /* renamed from: a, reason: collision with root package name */
    public String f5528a;

    /* renamed from: b, reason: collision with root package name */
    public String f5529b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public ArrayList l;
    public int m;
    public int n;
    public boolean o = false;

    public final String a() {
        String str = this.f5528a;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int b() {
        if (this.j == 0) {
            this.j = fl.C(tf3.d(), this.c);
        }
        return this.j;
    }

    public final String c() {
        if (!TextUtils.isEmpty(this.f5529b)) {
            return this.f5529b;
        }
        String str = this.f5528a;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean d() {
        if (this.n == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zp2) {
            zp2 zp2Var = (zp2) obj;
            if (bw3.b(zp2Var.f5528a, this.f5528a) && zp2Var.i == this.i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5528a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
