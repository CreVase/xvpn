package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class v61 implements dw2 {

    /* renamed from: a, reason: collision with root package name */
    public final wg2 f4782a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f4783b;
    public final uj0 c;
    public boolean d;
    public final CRC32 e;

    public v61(lr lrVar) {
        wg2 wg2Var = new wg2(lrVar);
        this.f4782a = wg2Var;
        Deflater deflater = new Deflater(-1, true);
        this.f4783b = deflater;
        this.c = new uj0(wg2Var, deflater);
        this.e = new CRC32();
        lr lrVar2 = wg2Var.f5004b;
        lrVar2.a0(8075);
        lrVar2.V(8);
        lrVar2.V(0);
        lrVar2.Y(0);
        lrVar2.V(0);
        lrVar2.V(0);
    }

    @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f4783b;
        wg2 wg2Var = this.f4782a;
        if (this.d) {
            return;
        }
        try {
            uj0 uj0Var = this.c;
            uj0Var.f4681b.finish();
            uj0Var.a(false);
            wg2Var.a((int) this.e.getValue());
            wg2Var.a((int) deflater.getBytesRead());
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
            wg2Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // defpackage.dw2, java.io.Flushable
    public final void flush() {
        this.c.flush();
    }

    @Override // defpackage.dw2
    public final d93 timeout() {
        return this.f4782a.timeout();
    }

    @Override // defpackage.dw2
    public final void write(lr lrVar, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == 0) {
                return;
            }
            so2 so2Var = lrVar.f3175a;
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, so2Var.c - so2Var.f4387b);
                this.e.update(so2Var.f4386a, so2Var.f4387b, min);
                j2 -= min;
                so2Var = so2Var.f;
            }
            this.c.write(lrVar, j);
            return;
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }
}
