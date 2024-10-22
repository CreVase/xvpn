package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.bu0;
import defpackage.cp3;
import defpackage.d5;
import defpackage.ft1;
import defpackage.gt1;
import defpackage.ko;
import defpackage.kw1;
import defpackage.lw1;
import defpackage.p71;
import defpackage.pk0;
import defpackage.t9;
import defpackage.wi3;
import defpackage.x50;
import defpackage.y01;
import defpackage.yt0;
import defpackage.z5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends ko implements Handler.Callback {
    public final kw1 m;
    public final yt0 n;
    public final Handler o;
    public final lw1 p;
    public t9 q;
    public boolean r;
    public boolean s;
    public long t;
    public Metadata u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yt0 yt0Var, Looper looper) {
        super(5);
        Handler handler;
        d5 d5Var = kw1.d0;
        this.n = yt0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = wi3.f5017a;
            handler = new Handler(looper, this);
        }
        this.o = handler;
        this.m = d5Var;
        this.p = new lw1();
        this.v = -9223372036854775807L;
    }

    public final long A(long j) {
        boolean z;
        boolean z2 = true;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        if (this.v == -9223372036854775807L) {
            z2 = false;
        }
        cp3.m(z2);
        return j - this.v;
    }

    public final void B(Metadata metadata) {
        yt0 yt0Var = this.n;
        bu0 bu0Var = yt0Var.f5387a;
        gt1 gt1Var = bu0Var.Z;
        gt1Var.getClass();
        ft1 ft1Var = new ft1(gt1Var);
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f1467a;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].w(ft1Var);
            i++;
        }
        bu0Var.Z = new gt1(ft1Var);
        gt1 a2 = bu0Var.a();
        boolean equals = a2.equals(bu0Var.J);
        pk0 pk0Var = bu0Var.k;
        int i2 = 14;
        if (!equals) {
            bu0Var.J = a2;
            pk0Var.j(14, new z5(yt0Var, 13));
        }
        pk0Var.j(28, new z5(metadata, i2));
        pk0Var.g();
    }

    @Override // defpackage.ko
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            B((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ko
    public final boolean j() {
        return this.s;
    }

    @Override // defpackage.ko
    public final boolean k() {
        return true;
    }

    @Override // defpackage.ko
    public final void l() {
        this.u = null;
        this.q = null;
        this.v = -9223372036854775807L;
    }

    @Override // defpackage.ko
    public final void n(long j, boolean z) {
        this.u = null;
        this.r = false;
        this.s = false;
    }

    @Override // defpackage.ko
    public final void r(y01[] y01VarArr, long j, long j2) {
        this.q = ((d5) this.m).t(y01VarArr[0]);
        Metadata metadata = this.u;
        if (metadata != null) {
            long j3 = this.v;
            long j4 = metadata.f1468b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                metadata = new Metadata(j5, metadata.f1467a);
            }
            this.u = metadata;
        }
        this.v = j2;
    }

    @Override // defpackage.ko
    public final void t(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.r && this.u == null) {
                lw1 lw1Var = this.p;
                lw1Var.i();
                x50 x50Var = this.f2984b;
                x50Var.j();
                int s = s(x50Var, lw1Var, 0);
                if (s == -4) {
                    if (lw1Var.g(4)) {
                        this.r = true;
                    } else {
                        lw1Var.j = this.t;
                        lw1Var.l();
                        t9 t9Var = this.q;
                        int i = wi3.f5017a;
                        Metadata A = t9Var.A(lw1Var);
                        if (A != null) {
                            ArrayList arrayList = new ArrayList(A.f1467a.length);
                            z(A, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.u = new Metadata(A(lw1Var.f), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (s == -5) {
                    y01 y01Var = (y01) x50Var.c;
                    y01Var.getClass();
                    this.t = y01Var.p;
                }
            }
            Metadata metadata = this.u;
            if (metadata != null && metadata.f1468b <= A(j)) {
                Metadata metadata2 = this.u;
                Handler handler = this.o;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    B(metadata2);
                }
                this.u = null;
                z = true;
            } else {
                z = false;
            }
            if (this.r && this.u == null) {
                this.s = true;
            }
        }
    }

    @Override // defpackage.ko
    public final int x(y01 y01Var) {
        int i;
        if (((d5) this.m).K(y01Var)) {
            if (y01Var.G == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return p71.a(i, 0, 0);
        }
        return p71.a(0, 0, 0);
    }

    public final void z(Metadata metadata, ArrayList arrayList) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f1467a;
            if (i < entryArr.length) {
                y01 c = entryArr[i].c();
                if (c != null) {
                    d5 d5Var = (d5) this.m;
                    if (d5Var.K(c)) {
                        t9 t = d5Var.t(c);
                        byte[] x = entryArr[i].x();
                        x.getClass();
                        lw1 lw1Var = this.p;
                        lw1Var.i();
                        lw1Var.k(x.length);
                        lw1Var.d.put(x);
                        lw1Var.l();
                        Metadata A = t.A(lw1Var);
                        if (A != null) {
                            z(A, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(entryArr[i]);
                i++;
            } else {
                return;
            }
        }
    }
}
