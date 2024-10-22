package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class fc1 implements mx2 {

    /* renamed from: a, reason: collision with root package name */
    public final sr f2073a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f2074b;
    public int c;
    public boolean d;

    public fc1(xg2 xg2Var, Inflater inflater) {
        this.f2073a = xg2Var;
        this.f2074b = inflater;
    }

    public final long a(lr lrVar, long j) {
        boolean z;
        Inflater inflater = this.f2074b;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.d) {
                if (j == 0) {
                    return 0L;
                }
                try {
                    so2 S = lrVar.S(1);
                    int min = (int) Math.min(j, 8192 - S.c);
                    boolean needsInput = inflater.needsInput();
                    sr srVar = this.f2073a;
                    if (needsInput && !srVar.j()) {
                        so2 so2Var = srVar.b().f3175a;
                        int i = so2Var.c;
                        int i2 = so2Var.f4387b;
                        int i3 = i - i2;
                        this.c = i3;
                        inflater.setInput(so2Var.f4386a, i2, i3);
                    }
                    int inflate = inflater.inflate(S.f4386a, S.c, min);
                    int i4 = this.c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.c -= remaining;
                        srVar.skip(remaining);
                    }
                    if (inflate > 0) {
                        S.c += inflate;
                        long j2 = inflate;
                        lrVar.f3176b += j2;
                        return j2;
                    }
                    if (S.f4387b == S.c) {
                        lrVar.f3175a = S.a();
                        uo2.a(S);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f2074b.end();
        this.d = true;
        this.f2073a.close();
    }

    @Override // defpackage.mx2
    public final long read(lr lrVar, long j) {
        do {
            long a2 = a(lrVar, j);
            if (a2 > 0) {
                return a2;
            }
            Inflater inflater = this.f2074b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f2073a.j());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.mx2
    public final d93 timeout() {
        return this.f2073a.timeout();
    }
}
