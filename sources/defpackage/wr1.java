package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class wr1 extends ds1 implements rr1 {
    public final Context O0;
    public final x50 P0;
    public final ji Q0;
    public int R0;
    public boolean S0;
    public y01 T0;
    public y01 U0;
    public long V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public cu0 Z0;

    public wr1(Context context, y42 y42Var, Handler handler, yt0 yt0Var, ig0 ig0Var) {
        super(1, y42Var, 44100.0f);
        this.O0 = context.getApplicationContext();
        this.Q0 = ig0Var;
        this.P0 = new x50(handler, yt0Var);
        ig0Var.r = new ja1(this);
    }

    public static hb1 r0(es1 es1Var, y01 y01Var, boolean z, ji jiVar) {
        boolean z2;
        zr1 zr1Var;
        String str = y01Var.l;
        if (str == null) {
            db1 db1Var = hb1.f2394b;
            return ji2.e;
        }
        if (((ig0) jiVar).f(y01Var) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            List e = ks1.e("audio/raw", false, false);
            if (e.isEmpty()) {
                zr1Var = null;
            } else {
                zr1Var = (zr1) e.get(0);
            }
            if (zr1Var != null) {
                return hb1.q(zr1Var);
            }
        }
        ((df0) es1Var).getClass();
        List e2 = ks1.e(str, z, false);
        String b2 = ks1.b(y01Var);
        if (b2 == null) {
            return hb1.l(e2);
        }
        List e3 = ks1.e(b2, z, false);
        db1 db1Var2 = hb1.f2394b;
        cb1 cb1Var = new cb1();
        cb1Var.a0(e2);
        cb1Var.a0(e3);
        return cb1Var.b0();
    }

    @Override // defpackage.ds1
    public final xe0 A(zr1 zr1Var, y01 y01Var, y01 y01Var2) {
        int i;
        xe0 b2 = zr1Var.b(y01Var, y01Var2);
        int q0 = q0(y01Var2, zr1Var);
        int i2 = this.R0;
        int i3 = b2.e;
        if (q0 > i2) {
            i3 |= 64;
        }
        int i4 = i3;
        String str = zr1Var.f5535a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = b2.d;
        }
        return new xe0(str, y01Var, y01Var2, i, i4);
    }

    @Override // defpackage.ds1
    public final float K(float f, y01[] y01VarArr) {
        int i = -1;
        for (y01 y01Var : y01VarArr) {
            int i2 = y01Var.z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    @Override // defpackage.ds1
    public final ArrayList L(es1 es1Var, y01 y01Var, boolean z) {
        hb1 r0 = r0(es1Var, y01Var, z, this.Q0);
        Pattern pattern = ks1.f3004a;
        ArrayList arrayList = new ArrayList(r0);
        Collections.sort(arrayList, new jw3(new fs1(y01Var), 1));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.sr1 N(defpackage.zr1 r12, defpackage.y01 r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.N(zr1, y01, android.media.MediaCrypto, float):sr1");
    }

    @Override // defpackage.ds1
    public final void S(Exception exc) {
        sn1.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        x50 x50Var = this.P0;
        Handler handler = (Handler) x50Var.f5117b;
        if (handler != null) {
            handler.post(new ci(x50Var, exc, 1));
        }
    }

    @Override // defpackage.ds1
    public final void T(String str, long j, long j2) {
        x50 x50Var = this.P0;
        Handler handler = (Handler) x50Var.f5117b;
        if (handler != null) {
            handler.post(new di(x50Var, str, j, j2, 0));
        }
    }

    @Override // defpackage.ds1
    public final void U(String str) {
        x50 x50Var = this.P0;
        Handler handler = (Handler) x50Var.f5117b;
        if (handler != null) {
            handler.post(new lf(11, x50Var, str));
        }
    }

    @Override // defpackage.ds1
    public final xe0 V(x50 x50Var) {
        y01 y01Var = (y01) x50Var.c;
        y01Var.getClass();
        this.T0 = y01Var;
        xe0 V = super.V(x50Var);
        y01 y01Var2 = this.T0;
        x50 x50Var2 = this.P0;
        Handler handler = (Handler) x50Var2.f5117b;
        if (handler != null) {
            handler.post(new cq0(9, x50Var2, y01Var2, V));
        }
        return V;
    }

    @Override // defpackage.ds1
    public final void W(y01 y01Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        y01 y01Var2 = this.U0;
        int[] iArr = null;
        if (y01Var2 != null) {
            y01Var = y01Var2;
        } else if (this.G != null) {
            if ("audio/raw".equals(y01Var.l)) {
                i = y01Var.A;
            } else if (wi3.f5017a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = wi3.r(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            x01 x01Var = new x01();
            x01Var.k = "audio/raw";
            x01Var.z = i;
            x01Var.A = y01Var.B;
            x01Var.B = y01Var.C;
            x01Var.x = mediaFormat.getInteger("channel-count");
            x01Var.y = mediaFormat.getInteger("sample-rate");
            y01 y01Var3 = new y01(x01Var);
            if (this.S0 && y01Var3.y == 6 && (i2 = y01Var.y) < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            }
            y01Var = y01Var3;
        }
        try {
            ((ig0) this.Q0).b(y01Var, iArr);
        } catch (fi e) {
            throw e(5001, e.f2093a, e, false);
        }
    }

    @Override // defpackage.ds1
    public final void X() {
        this.Q0.getClass();
    }

    @Override // defpackage.ds1
    public final void Z() {
        ((ig0) this.Q0).G = true;
    }

    @Override // defpackage.rr1
    public final void a(q52 q52Var) {
        ig0 ig0Var = (ig0) this.Q0;
        ig0Var.getClass();
        q52 q52Var2 = new q52(wi3.h(q52Var.f3957a, 0.1f, 8.0f), wi3.h(q52Var.f3958b, 0.1f, 8.0f));
        if (ig0Var.k && wi3.f5017a >= 23) {
            ig0Var.s(q52Var2);
        } else {
            ig0Var.r(q52Var2, ig0Var.g().f629b);
        }
    }

    @Override // defpackage.ds1
    public final void a0(ve0 ve0Var) {
        if (this.W0 && !ve0Var.h()) {
            if (Math.abs(ve0Var.f - this.V0) > 500000) {
                this.V0 = ve0Var.f;
            }
            this.W0 = false;
        }
    }

    @Override // defpackage.rr1
    public final long b() {
        if (this.f == 2) {
            s0();
        }
        return this.V0;
    }

    @Override // defpackage.ko, defpackage.b62
    public final void c(int i, Object obj) {
        boolean z;
        ji jiVar = this.Q0;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    switch (i) {
                        case 9:
                            ig0 ig0Var = (ig0) jiVar;
                            ig0Var.r(ig0Var.g().f628a, ((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            ig0 ig0Var2 = (ig0) jiVar;
                            if (ig0Var2.W != intValue) {
                                ig0Var2.W = intValue;
                                if (intValue != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ig0Var2.V = z;
                                ig0Var2.d();
                                return;
                            }
                            return;
                        case 11:
                            this.Z0 = (cu0) obj;
                            return;
                        case 12:
                            if (wi3.f5017a >= 23) {
                                vr1.a(jiVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                mm mmVar = (mm) obj;
                ig0 ig0Var3 = (ig0) jiVar;
                if (!ig0Var3.X.equals(mmVar)) {
                    mmVar.getClass();
                    if (ig0Var3.u != null) {
                        ig0Var3.X.getClass();
                    }
                    ig0Var3.X = mmVar;
                    return;
                }
                return;
            }
            qh qhVar = (qh) obj;
            ig0 ig0Var4 = (ig0) jiVar;
            if (!ig0Var4.v.equals(qhVar)) {
                ig0Var4.v = qhVar;
                if (!ig0Var4.Z) {
                    ig0Var4.d();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        ig0 ig0Var5 = (ig0) jiVar;
        if (ig0Var5.J != floatValue) {
            ig0Var5.J = floatValue;
            ig0Var5.t();
        }
    }

    @Override // defpackage.ds1
    public final boolean c0(long j, long j2, ur1 ur1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, y01 y01Var) {
        byteBuffer.getClass();
        if (this.U0 != null && (i2 & 2) != 0) {
            ur1Var.getClass();
            ur1Var.h(i, false);
            return true;
        }
        ji jiVar = this.Q0;
        if (z) {
            if (ur1Var != null) {
                ur1Var.h(i, false);
            }
            this.J0.f += i3;
            ((ig0) jiVar).G = true;
            return true;
        }
        try {
            if (!((ig0) jiVar).j(byteBuffer, j3, i3)) {
                return false;
            }
            if (ur1Var != null) {
                ur1Var.h(i, false);
            }
            this.J0.e += i3;
            return true;
        } catch (gi e) {
            throw e(5001, this.T0, e, e.f2256b);
        } catch (ii e2) {
            throw e(5002, y01Var, e2, e2.f2599b);
        }
    }

    @Override // defpackage.rr1
    public final q52 d() {
        ig0 ig0Var = (ig0) this.Q0;
        if (ig0Var.k) {
            return ig0Var.y;
        }
        return ig0Var.g().f628a;
    }

    @Override // defpackage.ds1
    public final void f0() {
        try {
            ig0 ig0Var = (ig0) this.Q0;
            if (!ig0Var.S && ig0Var.m() && ig0Var.c()) {
                ig0Var.o();
                ig0Var.S = true;
            }
        } catch (ii e) {
            throw e(5002, e.c, e, e.f2599b);
        }
    }

    @Override // defpackage.ko
    public final rr1 g() {
        return this;
    }

    @Override // defpackage.ko
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ds1, defpackage.ko
    public final boolean j() {
        boolean z;
        if (!this.F0) {
            return false;
        }
        ig0 ig0Var = (ig0) this.Q0;
        if (ig0Var.m() && (!ig0Var.S || ig0Var.k())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ds1, defpackage.ko
    public final boolean k() {
        if (!((ig0) this.Q0).k() && !super.k()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ds1, defpackage.ko
    public final void l() {
        x50 x50Var = this.P0;
        this.Y0 = true;
        this.T0 = null;
        try {
            ((ig0) this.Q0).d();
            try {
                super.l();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.l();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.ds1
    public final boolean l0(y01 y01Var) {
        if (((ig0) this.Q0).f(y01Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko
    public final void m(boolean z, boolean z2) {
        se0 se0Var = new se0();
        this.J0 = se0Var;
        x50 x50Var = this.P0;
        Handler handler = (Handler) x50Var.f5117b;
        int i = 1;
        if (handler != null) {
            handler.post(new bi(x50Var, se0Var, i));
        }
        cj2 cj2Var = this.c;
        cj2Var.getClass();
        boolean z3 = cj2Var.f650a;
        boolean z4 = false;
        ji jiVar = this.Q0;
        if (z3) {
            ig0 ig0Var = (ig0) jiVar;
            ig0Var.getClass();
            if (wi3.f5017a >= 21) {
                z4 = true;
            }
            cp3.m(z4);
            cp3.m(ig0Var.V);
            if (!ig0Var.Z) {
                ig0Var.Z = true;
                ig0Var.d();
            }
        } else {
            ig0 ig0Var2 = (ig0) jiVar;
            if (ig0Var2.Z) {
                ig0Var2.Z = false;
                ig0Var2.d();
            }
        }
        z52 z52Var = this.e;
        z52Var.getClass();
        ((ig0) jiVar).q = z52Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:            if (r4 != null) goto L33;     */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m0(defpackage.es1 r12, defpackage.y01 r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.m0(es1, y01):int");
    }

    @Override // defpackage.ds1, defpackage.ko
    public final void n(long j, boolean z) {
        super.n(j, z);
        ((ig0) this.Q0).d();
        this.V0 = j;
        this.W0 = true;
        this.X0 = true;
    }

    @Override // defpackage.ko
    public final void o() {
        ji jiVar = this.Q0;
        try {
            try {
                C();
                e0();
                rn0 rn0Var = this.A;
                if (rn0Var != null) {
                    rn0Var.c(null);
                }
                this.A = null;
            } catch (Throwable th) {
                rn0 rn0Var2 = this.A;
                if (rn0Var2 != null) {
                    rn0Var2.c(null);
                }
                this.A = null;
                throw th;
            }
        } finally {
            if (this.Y0) {
                this.Y0 = false;
                ((ig0) jiVar).q();
            }
        }
    }

    @Override // defpackage.ko
    public final void p() {
        ig0 ig0Var = (ig0) this.Q0;
        ig0Var.U = true;
        if (ig0Var.m()) {
            mi miVar = ig0Var.i.f;
            miVar.getClass();
            miVar.a();
            ig0Var.u.play();
        }
    }

    @Override // defpackage.ko
    public final void q() {
        s0();
        ig0 ig0Var = (ig0) this.Q0;
        boolean z = false;
        ig0Var.U = false;
        if (ig0Var.m()) {
            ni niVar = ig0Var.i;
            niVar.c();
            if (niVar.y == -9223372036854775807L) {
                mi miVar = niVar.f;
                miVar.getClass();
                miVar.a();
                z = true;
            }
            if (z) {
                ig0Var.u.pause();
            }
        }
    }

    public final int q0(y01 y01Var, zr1 zr1Var) {
        int i;
        if ("OMX.google.raw.decoder".equals(zr1Var.f5535a) && (i = wi3.f5017a) < 24 && (i != 23 || !wi3.B(this.O0))) {
            return -1;
        }
        return y01Var.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0301 A[ADDED_TO_REGION, EDGE_INSN: B:120:0x0301->B:97:0x0301 BREAK  A[LOOP:1: B:91:0x02e4->B:95:0x02f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7 A[Catch: Exception -> 0x01f2, TRY_LEAVE, TryCatch #0 {Exception -> 0x01f2, blocks: (B:55:0x01bc, B:57:0x01e7), top: B:54:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0() {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.s0():void");
    }
}
