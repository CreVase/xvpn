package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class c22 {

    /* renamed from: a, reason: collision with root package name */
    public int f570a;

    /* renamed from: b, reason: collision with root package name */
    public long f571b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final r42 g = new r42(255);

    public final boolean a(ev0 ev0Var, boolean z) {
        boolean z2;
        boolean z3;
        this.f570a = 0;
        this.f571b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        r42 r42Var = this.g;
        r42Var.D(27);
        try {
            z2 = ev0Var.e(r42Var.f4098a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (!z2 || r42Var.w() != 1332176723) {
            return false;
        }
        if (r42Var.v() != 0) {
            if (z) {
                return false;
            }
            throw u42.b("unsupported bit stream revision");
        }
        this.f570a = r42Var.v();
        this.f571b = r42Var.j();
        r42Var.l();
        r42Var.l();
        r42Var.l();
        int v = r42Var.v();
        this.c = v;
        this.d = v + 27;
        r42Var.D(v);
        try {
            z3 = ev0Var.e(r42Var.f4098a, 0, this.c, z);
        } catch (EOFException e2) {
            if (z) {
                z3 = false;
            } else {
                throw e2;
            }
        }
        if (!z3) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int v2 = r42Var.v();
            this.f[i] = v2;
            this.e += v2;
        }
        return true;
    }

    public final boolean b(ev0 ev0Var, long j) {
        boolean z;
        boolean z2;
        if (ev0Var.getPosition() == ev0Var.f()) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        r42 r42Var = this.g;
        r42Var.D(4);
        while (true) {
            if (j != -1 && ev0Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                z2 = ev0Var.e(r42Var.f4098a, 0, 4, true);
            } catch (EOFException unused) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            r42Var.G(0);
            if (r42Var.w() == 1332176723) {
                ev0Var.l();
                return true;
            }
            ev0Var.m(1);
        }
        do {
            if (j != -1 && ev0Var.getPosition() >= j) {
                break;
            }
        } while (ev0Var.i(1) != -1);
        return false;
    }
}
