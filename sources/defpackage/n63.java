package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class n63 implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final zd0 f3403a;

    /* renamed from: b, reason: collision with root package name */
    public final lt f3404b;
    public boolean c;
    public long d;

    public n63(zd0 zd0Var, lt ltVar) {
        zd0Var.getClass();
        this.f3403a = zd0Var;
        ltVar.getClass();
        this.f3404b = ltVar;
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        long j;
        boolean z;
        ce0 ce0Var2 = ce0Var;
        long c = this.f3403a.c(ce0Var2);
        this.d = c;
        if (c == 0) {
            return 0L;
        }
        long j2 = ce0Var2.g;
        if (j2 == -1 && c != -1 && j2 != c) {
            ce0Var2 = new ce0(ce0Var2.f617a, ce0Var2.f618b, ce0Var2.c, ce0Var2.d, ce0Var2.e, ce0Var2.f + 0, c, ce0Var2.h, ce0Var2.i, ce0Var2.j);
        }
        boolean z2 = true;
        this.c = true;
        lt ltVar = this.f3404b;
        ltVar.getClass();
        ce0Var2.h.getClass();
        long j3 = ce0Var2.g;
        int i = ce0Var2.i;
        try {
            if (j3 == -1) {
                if ((i & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ltVar.d = null;
                    return this.d;
                }
            }
            ltVar.b(ce0Var2);
            return this.d;
        } catch (IOException e) {
            throw new kt(e);
        }
        ltVar.d = ce0Var2;
        if ((i & 4) != 4) {
            z2 = false;
        }
        if (z2) {
            j = ltVar.f3185b;
        } else {
            j = Long.MAX_VALUE;
        }
        ltVar.e = j;
        ltVar.i = 0L;
    }

    @Override // defpackage.zd0
    public final void close() {
        lt ltVar = this.f3404b;
        try {
            this.f3403a.close();
            if (this.c) {
                this.c = false;
                if (ltVar.d != null) {
                    try {
                        ltVar.a();
                    } catch (IOException e) {
                        throw new kt(e);
                    }
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (ltVar.d != null) {
                    try {
                        ltVar.a();
                    } catch (IOException e2) {
                        throw new kt(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
        hb3Var.getClass();
        this.f3403a.d(hb3Var);
    }

    @Override // defpackage.zd0
    public final Map k() {
        return this.f3403a.k();
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.f3403a.o();
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int read = this.f3403a.read(bArr, i, i2);
        if (read > 0) {
            lt ltVar = this.f3404b;
            ce0 ce0Var = ltVar.d;
            if (ce0Var != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (ltVar.h == ltVar.e) {
                            ltVar.a();
                            ltVar.b(ce0Var);
                        }
                        int min = (int) Math.min(read - i3, ltVar.e - ltVar.h);
                        OutputStream outputStream = ltVar.g;
                        int i4 = wi3.f5017a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        ltVar.h += j;
                        ltVar.i += j;
                    } catch (IOException e) {
                        throw new kt(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - read;
            }
        }
        return read;
    }
}
