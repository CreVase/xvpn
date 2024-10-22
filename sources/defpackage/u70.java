package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class u70 {
    public static final u70 i = new u70(new t70());

    /* renamed from: a, reason: collision with root package name */
    public uz1 f4633a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4634b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public j80 h;

    public u70() {
        this.f4633a = uz1.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new j80();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u70.class != obj.getClass()) {
            return false;
        }
        u70 u70Var = (u70) obj;
        if (this.f4634b != u70Var.f4634b || this.c != u70Var.c || this.d != u70Var.d || this.e != u70Var.e || this.f != u70Var.f || this.g != u70Var.g || this.f4633a != u70Var.f4633a) {
            return false;
        }
        return this.h.equals(u70Var.h);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f4633a.hashCode() * 31) + (this.f4634b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public u70(t70 t70Var) {
        this.f4633a = uz1.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new j80();
        this.f4634b = false;
        int i2 = Build.VERSION.SDK_INT;
        this.c = false;
        this.f4633a = t70Var.f4458a;
        this.d = false;
        this.e = false;
        if (i2 >= 24) {
            this.h = t70Var.f4459b;
            this.f = -1L;
            this.g = -1L;
        }
    }

    public u70(u70 u70Var) {
        this.f4633a = uz1.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new j80();
        this.f4634b = u70Var.f4634b;
        this.c = u70Var.c;
        this.f4633a = u70Var.f4633a;
        this.d = u70Var.d;
        this.e = u70Var.e;
        this.h = u70Var.h;
    }
}
