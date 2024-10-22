package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class gs1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2315b;
    public final boolean c;

    public gs1(String str, boolean z, boolean z2) {
        this.f2314a = str;
        this.f2315b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != gs1.class) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        if (TextUtils.equals(this.f2314a, gs1Var.f2314a) && this.f2315b == gs1Var.f2315b && this.c == gs1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h = p71.h(this.f2314a, 31, 31);
        int i2 = 1231;
        if (this.f2315b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (h + i) * 31;
        if (!this.c) {
            i2 = 1237;
        }
        return i3 + i2;
    }
}
