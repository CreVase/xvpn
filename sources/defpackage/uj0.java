package defpackage;

import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class uj0 implements dw2 {

    /* renamed from: a, reason: collision with root package name */
    public final rr f4680a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f4681b;
    public boolean c;

    public uj0(wg2 wg2Var, Deflater deflater) {
        this.f4680a = wg2Var;
        this.f4681b = deflater;
    }

    public final void a(boolean z) {
        so2 S;
        int deflate;
        rr rrVar = this.f4680a;
        lr b2 = rrVar.b();
        while (true) {
            S = b2.S(1);
            Deflater deflater = this.f4681b;
            byte[] bArr = S.f4386a;
            if (z) {
                int i = S.c;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = S.c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (deflate > 0) {
                S.c += deflate;
                b2.f3176b += deflate;
                rrVar.m();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (S.f4387b == S.c) {
            b2.f3175a = S.a();
            uo2.a(S);
        }
    }

    @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f4681b;
        if (this.c) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f4680a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // defpackage.dw2, java.io.Flushable
    public final void flush() {
        a(true);
        this.f4680a.flush();
    }

    @Override // defpackage.dw2
    public final d93 timeout() {
        return this.f4680a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f4680a + ')';
    }

    @Override // defpackage.dw2
    public final void write(lr lrVar, long j) {
        t9.u(lrVar.f3176b, 0L, j);
        while (j > 0) {
            so2 so2Var = lrVar.f3175a;
            int min = (int) Math.min(j, so2Var.c - so2Var.f4387b);
            this.f4681b.setInput(so2Var.f4386a, so2Var.f4387b, min);
            a(false);
            long j2 = min;
            lrVar.f3176b -= j2;
            int i = so2Var.f4387b + min;
            so2Var.f4387b = i;
            if (i == so2Var.c) {
                lrVar.f3175a = so2Var.a();
                uo2.a(so2Var);
            }
            j -= j2;
        }
    }
}
