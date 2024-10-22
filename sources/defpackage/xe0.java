package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class xe0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5150a;

    /* renamed from: b, reason: collision with root package name */
    public final y01 f5151b;
    public final y01 c;
    public final int d;
    public final int e;

    public xe0(String str, y01 y01Var, y01 y01Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        cp3.e(z);
        if (!TextUtils.isEmpty(str)) {
            this.f5150a = str;
            y01Var.getClass();
            this.f5151b = y01Var;
            y01Var2.getClass();
            this.c = y01Var2;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xe0.class != obj.getClass()) {
            return false;
        }
        xe0 xe0Var = (xe0) obj;
        if (this.d == xe0Var.d && this.e == xe0Var.e && this.f5150a.equals(xe0Var.f5150a) && this.f5151b.equals(xe0Var.f5151b) && this.c.equals(xe0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f5151b.hashCode() + p71.h(this.f5150a, (((this.d + 527) * 31) + this.e) * 31, 31)) * 31);
    }
}
