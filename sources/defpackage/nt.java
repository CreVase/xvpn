package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class nt implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final jt f3532a;

    /* renamed from: b, reason: collision with root package name */
    public final zd0 f3533b;
    public final n63 c;
    public final zd0 d;
    public final st e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public ce0 j;
    public ce0 k;
    public zd0 l;
    public long m;
    public long n;
    public long o;
    public wu2 p;
    public boolean q;
    public boolean r;
    public long s;

    public nt(jt jtVar, zd0 zd0Var, fx0 fx0Var, lt ltVar, int i) {
        boolean z;
        boolean z2;
        ef0 ef0Var = st.S;
        this.f3532a = jtVar;
        this.f3533b = fx0Var;
        this.e = ef0Var;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        this.h = (i & 4) != 0;
        if (zd0Var != null) {
            this.d = zd0Var;
            this.c = ltVar != null ? new n63(zd0Var, ltVar) : null;
        } else {
            this.d = i52.f2539a;
            this.c = null;
        }
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        boolean z;
        String str;
        char c;
        boolean z2;
        long min;
        nt ntVar = this;
        jt jtVar = ntVar.f3532a;
        try {
            ((ef0) ntVar.e).getClass();
            String str2 = ce0Var.h;
            if (str2 == null) {
                str2 = ce0Var.f617a.toString();
            }
            long j = ce0Var.f;
            Uri uri = ce0Var.f617a;
            long j2 = ce0Var.f618b;
            int i = ce0Var.c;
            byte[] bArr = ce0Var.d;
            Map map = ce0Var.e;
            long j3 = ce0Var.f;
            try {
                long j4 = ce0Var.g;
                int i2 = ce0Var.i;
                Object obj = ce0Var.j;
                cp3.p(uri, "The uri must be set.");
                ce0 ce0Var2 = new ce0(uri, j2, i, bArr, map, j3, j4, str2, i2, obj);
                ntVar = this;
                ntVar.j = ce0Var2;
                Uri uri2 = ce0Var2.f617a;
                byte[] bArr2 = (byte[]) ((vu2) jtVar).i(str2).f3656b.get("exo_redir");
                Uri uri3 = null;
                if (bArr2 != null) {
                    str = new String(bArr2, ex.c);
                } else {
                    str = null;
                }
                if (str != null) {
                    uri3 = Uri.parse(str);
                }
                if (uri3 != null) {
                    uri2 = uri3;
                }
                ntVar.i = uri2;
                ntVar.n = j;
                boolean z3 = ntVar.g;
                long j5 = ce0Var.g;
                if (z3 && ntVar.q) {
                    c = 0;
                } else if (ntVar.h && j5 == -1) {
                    c = 1;
                } else {
                    c = 65535;
                }
                if (c != 65535) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ntVar.r = z2;
                if (z2) {
                    ntVar.o = -1L;
                } else {
                    long b2 = hx2.b(((vu2) jtVar).i(str2));
                    ntVar.o = b2;
                    if (b2 != -1) {
                        long j6 = b2 - j;
                        ntVar.o = j6;
                        if (j6 < 0) {
                            throw new ae0(2008);
                        }
                    }
                }
                if (j5 != -1) {
                    long j7 = ntVar.o;
                    if (j7 == -1) {
                        min = j5;
                    } else {
                        min = Math.min(j7, j5);
                    }
                    ntVar.o = min;
                }
                long j8 = ntVar.o;
                if (j8 <= 0 && j8 != -1) {
                    z = false;
                } else {
                    z = false;
                    try {
                        ntVar.q(ce0Var2, false);
                    } catch (Throwable th) {
                        th = th;
                        if (ntVar.l == ntVar.f3533b) {
                            z = true;
                        }
                        if (z || (th instanceof ht)) {
                            ntVar.q = true;
                        }
                        throw th;
                    }
                }
                if (j5 == -1) {
                    return ntVar.o;
                }
                return j5;
            } catch (Throwable th2) {
                th = th2;
                z = false;
                ntVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    @Override // defpackage.zd0
    public final void close() {
        boolean z;
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            p();
        } catch (Throwable th) {
            if (this.l == this.f3533b) {
                z = true;
            } else {
                z = false;
            }
            if (z || (th instanceof ht)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
        hb3Var.getClass();
        this.f3533b.d(hb3Var);
        this.d.d(hb3Var);
    }

    @Override // defpackage.zd0
    public final Map k() {
        boolean z;
        if (this.l == this.f3533b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return this.d.k();
        }
        return Collections.emptyMap();
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.i;
    }

    public final void p() {
        jt jtVar = this.f3532a;
        zd0 zd0Var = this.l;
        if (zd0Var == null) {
            return;
        }
        try {
            zd0Var.close();
        } finally {
            this.k = null;
            this.l = null;
            wu2 wu2Var = this.p;
            if (wu2Var != null) {
                ((vu2) jtVar).k(wu2Var);
                this.p = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(defpackage.ce0 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt.q(ce0, boolean):void");
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        zd0 zd0Var = this.f3533b;
        boolean z3 = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        ce0 ce0Var = this.j;
        ce0Var.getClass();
        ce0 ce0Var2 = this.k;
        ce0Var2.getClass();
        try {
            if (this.n >= this.s) {
                q(ce0Var, true);
            }
            zd0 zd0Var2 = this.l;
            zd0Var2.getClass();
            int read = zd0Var2.read(bArr, i, i2);
            if (read != -1) {
                if (this.l == zd0Var) {
                }
                long j = read;
                this.n += j;
                this.m += j;
                long j2 = this.o;
                if (j2 != -1) {
                    this.o = j2 - j;
                }
                return read;
            }
            zd0 zd0Var3 = this.l;
            if (zd0Var3 == zd0Var) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i3 = read;
                long j3 = ce0Var2.g;
                if (j3 == -1 || this.m < j3) {
                    String str = ce0Var.h;
                    int i4 = wi3.f5017a;
                    this.o = 0L;
                    if (zd0Var3 == this.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        uy0 uy0Var = new uy0(8);
                        Long valueOf = Long.valueOf(this.n);
                        Map map = (Map) uy0Var.f4757b;
                        valueOf.getClass();
                        map.put("exo_len", valueOf);
                        ((List) uy0Var.c).remove("exo_len");
                        ((vu2) this.f3532a).c(uy0Var, str);
                        return i3;
                    }
                    return i3;
                }
            } else {
                i3 = read;
            }
            long j4 = this.o;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            p();
            q(ce0Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == zd0Var) {
                z3 = true;
            }
            if (z3 || (th instanceof ht)) {
                this.q = true;
            }
            throw th;
        }
    }
}
