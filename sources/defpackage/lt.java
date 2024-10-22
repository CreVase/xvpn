package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class lt {

    /* renamed from: a, reason: collision with root package name */
    public final jt f3184a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3185b;
    public final int c;
    public ce0 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public sk2 j;

    public lt(jt jtVar, long j, int i) {
        boolean z;
        if (j <= 0 && j != -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (j != -1 && j < 2097152) {
                sn1.f();
            }
            this.f3184a = jtVar;
            this.f3185b = j == -1 ? Long.MAX_VALUE : j;
            this.c = i;
            return;
        }
        throw new IllegalStateException("fragmentSize must be positive or C.LENGTH_UNSET.");
    }

    public final void a() {
        boolean z;
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            wi3.g(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            long j = this.h;
            vu2 vu2Var = (vu2) this.f3184a;
            synchronized (vu2Var) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    wu2 b2 = wu2.b(file, j, -9223372036854775807L, vu2Var.c);
                    b2.getClass();
                    wt k = vu2Var.c.k(b2.f4569a);
                    k.getClass();
                    cp3.m(k.c(b2.f4570b, b2.c));
                    long b3 = hx2.b(k.e);
                    if (b3 != -1) {
                        if (b2.f4570b + b2.c <= b3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cp3.m(z);
                    }
                    if (vu2Var.d != null) {
                        try {
                            vu2Var.d.d(b2.c, file.getName(), b2.f);
                        } catch (IOException e) {
                            throw new ht(e);
                        }
                    }
                    vu2Var.b(b2);
                    try {
                        vu2Var.c.E();
                        vu2Var.notifyAll();
                    } catch (IOException e2) {
                        throw new ht(e2);
                    }
                }
            }
        } catch (Throwable th) {
            wi3.g(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(ce0 ce0Var) {
        File c;
        long j = ce0Var.g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.i, this.e);
        }
        long j3 = j2;
        jt jtVar = this.f3184a;
        String str = ce0Var.h;
        int i = wi3.f5017a;
        long j4 = ce0Var.f + this.i;
        vu2 vu2Var = (vu2) jtVar;
        synchronized (vu2Var) {
            vu2Var.d();
            wt k = vu2Var.c.k(str);
            k.getClass();
            cp3.m(k.c(j4, j3));
            if (!vu2Var.f4899a.exists()) {
                vu2.e(vu2Var.f4899a);
                vu2Var.m();
            }
            vu2Var.f4900b.onStartFile(vu2Var, str, j4, j3);
            File file = new File(vu2Var.f4899a, Integer.toString(vu2Var.f.nextInt(10)));
            if (!file.exists()) {
                vu2.e(file);
            }
            c = wu2.c(file, k.f5067a, j4, System.currentTimeMillis());
        }
        this.f = c;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            sk2 sk2Var = this.j;
            if (sk2Var == null) {
                this.j = new sk2(fileOutputStream, this.c);
            } else {
                sk2Var.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }
}
