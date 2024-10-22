package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ds1 extends ko {
    public static final byte[] N0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public rn0 A;
    public boolean A0;
    public MediaCrypto B;
    public boolean B0;
    public boolean C;
    public long C0;
    public final long D;
    public long D0;
    public float E;
    public boolean E0;
    public float F;
    public boolean F0;
    public ur1 G;
    public boolean G0;
    public y01 H;
    public boolean H0;
    public MediaFormat I;
    public jt0 I0;
    public boolean J;
    public se0 J0;
    public float K;
    public cs1 K0;
    public ArrayDeque L;
    public long L0;
    public bs1 M;
    public boolean M0;
    public zr1 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public dt l0;
    public final tr1 m;
    public long m0;
    public final es1 n;
    public int n0;
    public final boolean o;
    public int o0;
    public final float p;
    public ByteBuffer p0;
    public final ve0 q;
    public boolean q0;
    public final ve0 r;
    public boolean r0;
    public final ve0 s;
    public boolean s0;
    public final gp t;
    public boolean t0;
    public final ArrayList u;
    public boolean u0;
    public final MediaCodec.BufferInfo v;
    public boolean v0;
    public final ArrayDeque w;
    public int w0;
    public y01 x;
    public int x0;
    public y01 y;
    public int y0;
    public rn0 z;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds1(int i, y42 y42Var, float f) {
        super(i);
        df0 df0Var = es1.c0;
        this.m = y42Var;
        this.n = df0Var;
        this.o = false;
        this.p = f;
        this.q = new ve0(0);
        this.r = new ve0(0);
        this.s = new ve0(2);
        gp gpVar = new gp();
        this.t = gpVar;
        this.u = new ArrayList();
        this.v = new MediaCodec.BufferInfo();
        this.E = 1.0f;
        this.F = 1.0f;
        this.D = -9223372036854775807L;
        this.w = new ArrayDeque();
        j0(cs1.d);
        gpVar.k(0);
        gpVar.d.order(ByteOrder.nativeOrder());
        this.K = -1.0f;
        this.O = 0;
        this.w0 = 0;
        this.n0 = -1;
        this.o0 = -1;
        this.m0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.x0 = 0;
        this.y0 = 0;
    }

    public abstract xe0 A(zr1 zr1Var, y01 y01Var, y01 y01Var2);

    public xr1 B(IllegalStateException illegalStateException, zr1 zr1Var) {
        return new xr1(illegalStateException, zr1Var);
    }

    public final void C() {
        this.u0 = false;
        this.t.i();
        this.s.i();
        this.t0 = false;
        this.s0 = false;
    }

    public final boolean D() {
        if (this.z0) {
            this.x0 = 1;
            if (!this.Q && !this.X) {
                this.y0 = 2;
            } else {
                this.y0 = 3;
                return false;
            }
        } else {
            o0();
        }
        return true;
    }

    public final boolean E(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        MediaCodec.BufferInfo bufferInfo;
        boolean c0;
        boolean z4;
        int g;
        boolean z5;
        boolean z6;
        if (this.o0 >= 0) {
            z = true;
        } else {
            z = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.v;
        if (!z) {
            if (this.Y && this.A0) {
                try {
                    g = this.G.g(bufferInfo2);
                } catch (IllegalStateException unused) {
                    b0();
                    if (this.F0) {
                        e0();
                    }
                    return false;
                }
            } else {
                g = this.G.g(bufferInfo2);
            }
            if (g < 0) {
                if (g == -2) {
                    this.B0 = true;
                    MediaFormat b2 = this.G.b();
                    if (this.O != 0 && b2.getInteger("width") == 32 && b2.getInteger("height") == 32) {
                        this.j0 = true;
                    } else {
                        if (this.h0) {
                            b2.setInteger("channel-count", 1);
                        }
                        this.I = b2;
                        this.J = true;
                    }
                    return true;
                }
                if (this.k0 && (this.E0 || this.x0 == 2)) {
                    b0();
                }
                return false;
            }
            if (this.j0) {
                this.j0 = false;
                this.G.h(g, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                b0();
                return false;
            }
            this.o0 = g;
            ByteBuffer m = this.G.m(g);
            this.p0 = m;
            if (m != null) {
                m.position(bufferInfo2.offset);
                this.p0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Z && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.C0;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((Long) arrayList.get(i)).longValue() == j4) {
                        arrayList.remove(i);
                        z5 = true;
                        break;
                    }
                    i++;
                } else {
                    z5 = false;
                    break;
                }
            }
            this.q0 = z5;
            long j5 = this.D0;
            long j6 = bufferInfo2.presentationTimeUs;
            if (j5 == j6) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.r0 = z6;
            p0(j6);
        }
        if (this.Y && this.A0) {
            try {
                z2 = false;
                z3 = true;
            } catch (IllegalStateException unused2) {
                z2 = false;
            }
            try {
                c0 = c0(j, j2, this.G, this.p0, this.o0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.q0, this.r0, this.y);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                b0();
                if (this.F0) {
                    e0();
                }
                return z2;
            }
        } else {
            z2 = false;
            z3 = true;
            bufferInfo = bufferInfo2;
            c0 = c0(j, j2, this.G, this.p0, this.o0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.q0, this.r0, this.y);
        }
        if (c0) {
            Y(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.o0 = -1;
            this.p0 = null;
            if (!z4) {
                return z3;
            }
            b0();
        }
        return z2;
    }

    public final boolean F() {
        boolean z;
        fc0 fc0Var;
        ur1 ur1Var = this.G;
        if (ur1Var != null && this.x0 != 2 && !this.E0) {
            int i = this.n0;
            ve0 ve0Var = this.r;
            if (i < 0) {
                int e = ur1Var.e();
                this.n0 = e;
                if (e < 0) {
                    return false;
                }
                ve0Var.d = this.G.k(e);
                ve0Var.i();
            }
            if (this.x0 == 1) {
                if (!this.k0) {
                    this.A0 = true;
                    this.G.n(this.n0, 0, 0L, 4);
                    this.n0 = -1;
                    ve0Var.d = null;
                }
                this.x0 = 2;
                return false;
            }
            if (this.i0) {
                this.i0 = false;
                ve0Var.d.put(N0);
                this.G.n(this.n0, 38, 0L, 0);
                this.n0 = -1;
                ve0Var.d = null;
                this.z0 = true;
                return true;
            }
            if (this.w0 == 1) {
                for (int i2 = 0; i2 < this.H.n.size(); i2++) {
                    ve0Var.d.put((byte[]) this.H.n.get(i2));
                }
                this.w0 = 2;
            }
            int position = ve0Var.d.position();
            x50 x50Var = this.f2984b;
            x50Var.j();
            try {
                int s = s(x50Var, ve0Var, 0);
                if (i() || ve0Var.g(536870912)) {
                    this.D0 = this.C0;
                }
                if (s == -3) {
                    return false;
                }
                if (s == -5) {
                    if (this.w0 == 2) {
                        ve0Var.i();
                        this.w0 = 1;
                    }
                    V(x50Var);
                    return true;
                }
                if (ve0Var.g(4)) {
                    if (this.w0 == 2) {
                        ve0Var.i();
                        this.w0 = 1;
                    }
                    this.E0 = true;
                    if (!this.z0) {
                        b0();
                        return false;
                    }
                    try {
                        if (!this.k0) {
                            this.A0 = true;
                            this.G.n(this.n0, 0, 0L, 4);
                            this.n0 = -1;
                            ve0Var.d = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw e(wi3.o(e2.getErrorCode()), this.x, e2, false);
                    }
                }
                if (!this.z0 && !ve0Var.g(1)) {
                    ve0Var.i();
                    if (this.w0 == 2) {
                        this.w0 = 1;
                    }
                    return true;
                }
                boolean g = ve0Var.g(1073741824);
                fc0 fc0Var2 = ve0Var.c;
                if (g) {
                    if (position == 0) {
                        fc0Var2.getClass();
                    } else {
                        if (fc0Var2.d == null) {
                            int[] iArr = new int[1];
                            fc0Var2.d = iArr;
                            fc0Var2.i.numBytesOfClearData = iArr;
                        }
                        int[] iArr2 = fc0Var2.d;
                        iArr2[0] = iArr2[0] + position;
                    }
                }
                if (this.P && !g) {
                    ByteBuffer byteBuffer = ve0Var.d;
                    byte[] bArr = py1.f3937a;
                    int position2 = byteBuffer.position();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i5 < position2) {
                            int i6 = byteBuffer.get(i3) & 255;
                            if (i4 == 3) {
                                if (i6 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
                                    break;
                                }
                            } else if (i6 == 0) {
                                i4++;
                            }
                            if (i6 != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        } else {
                            byteBuffer.clear();
                            break;
                        }
                    }
                    if (ve0Var.d.position() == 0) {
                        return true;
                    }
                    this.P = false;
                }
                long j = ve0Var.f;
                dt dtVar = this.l0;
                if (dtVar != null) {
                    y01 y01Var = this.x;
                    if (dtVar.f1832b == 0) {
                        dtVar.f1831a = j;
                    }
                    if (!dtVar.c) {
                        ByteBuffer byteBuffer2 = ve0Var.d;
                        byteBuffer2.getClass();
                        int i7 = 0;
                        int i8 = 0;
                        for (int i9 = 4; i7 < i9; i9 = 4) {
                            i8 = (i8 << 8) | (byteBuffer2.get(i7) & 255);
                            i7++;
                        }
                        int Z = t9.Z(i8);
                        if (Z == -1) {
                            dtVar.c = true;
                            dtVar.f1832b = 0L;
                            dtVar.f1831a = ve0Var.f;
                            sn1.f();
                            j = ve0Var.f;
                        } else {
                            z = g;
                            long max = Math.max(0L, ((dtVar.f1832b - 529) * 1000000) / y01Var.z) + dtVar.f1831a;
                            dtVar.f1832b += Z;
                            j = max;
                            long j2 = this.C0;
                            dt dtVar2 = this.l0;
                            y01 y01Var2 = this.x;
                            dtVar2.getClass();
                            fc0Var = fc0Var2;
                            this.C0 = Math.max(j2, Math.max(0L, ((dtVar2.f1832b - 529) * 1000000) / y01Var2.z) + dtVar2.f1831a);
                        }
                    }
                    z = g;
                    long j22 = this.C0;
                    dt dtVar22 = this.l0;
                    y01 y01Var22 = this.x;
                    dtVar22.getClass();
                    fc0Var = fc0Var2;
                    this.C0 = Math.max(j22, Math.max(0L, ((dtVar22.f1832b - 529) * 1000000) / y01Var22.z) + dtVar22.f1831a);
                } else {
                    z = g;
                    fc0Var = fc0Var2;
                }
                if (ve0Var.h()) {
                    this.u.add(Long.valueOf(j));
                }
                if (this.G0) {
                    ArrayDeque arrayDeque = this.w;
                    if (!arrayDeque.isEmpty()) {
                        ((cs1) arrayDeque.peekLast()).c.a(j, this.x);
                    } else {
                        this.K0.c.a(j, this.x);
                    }
                    this.G0 = false;
                }
                this.C0 = Math.max(this.C0, j);
                ve0Var.l();
                if (ve0Var.g(268435456)) {
                    O(ve0Var);
                }
                a0(ve0Var);
                try {
                    if (z) {
                        this.G.i(this.n0, fc0Var, j);
                    } else {
                        this.G.n(this.n0, ve0Var.d.limit(), j, 0);
                    }
                    this.n0 = -1;
                    ve0Var.d = null;
                    this.z0 = true;
                    this.w0 = 0;
                    this.J0.c++;
                    return true;
                } catch (MediaCodec.CryptoException e3) {
                    throw e(wi3.o(e3.getErrorCode()), this.x, e3, false);
                }
            } catch (ue0 e4) {
                S(e4);
                d0(0);
                G();
                return true;
            }
        }
        return false;
    }

    public final void G() {
        try {
            this.G.flush();
        } finally {
            g0();
        }
    }

    public final boolean H() {
        boolean z;
        if (this.G == null) {
            return false;
        }
        int i = this.y0;
        if (i != 3 && !this.Q && ((!this.R || this.B0) && (!this.X || !this.A0))) {
            if (i == 2) {
                int i2 = wi3.f5017a;
                if (i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.m(z);
                if (i2 >= 23) {
                    try {
                        o0();
                    } catch (jt0 e) {
                        sn1.g("Failed to update the DRM session, releasing the codec instead.", e);
                        e0();
                        return true;
                    }
                }
            }
            G();
            return false;
        }
        e0();
        return true;
    }

    public final List I(boolean z) {
        y01 y01Var = this.x;
        es1 es1Var = this.n;
        ArrayList L = L(es1Var, y01Var, z);
        if (L.isEmpty() && z) {
            L = L(es1Var, this.x, false);
            if (!L.isEmpty()) {
                String str = this.x.l;
                L.toString();
                sn1.f();
            }
        }
        return L;
    }

    public boolean J() {
        return false;
    }

    public abstract float K(float f, y01[] y01VarArr);

    public abstract ArrayList L(es1 es1Var, y01 y01Var, boolean z);

    public final f31 M(rn0 rn0Var) {
        dc0 g = rn0Var.g();
        if (g != null && !(g instanceof f31)) {
            throw e(AdError.MEDIAVIEW_MISSING_ERROR_CODE, this.x, new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g), false);
        }
        return (f31) g;
    }

    public abstract sr1 N(zr1 zr1Var, y01 y01Var, MediaCrypto mediaCrypto, float f);

    public void O(ve0 ve0Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0374, code lost:            if ("stvm8".equals(r10) == false) goto L204;     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0384, code lost:            if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L204;     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(defpackage.zr1 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.P(zr1, android.media.MediaCrypto):void");
    }

    public final void Q() {
        y01 y01Var;
        boolean z;
        if (this.G == null && !this.s0 && (y01Var = this.x) != null) {
            if (this.A == null && l0(y01Var)) {
                y01 y01Var2 = this.x;
                C();
                String str = y01Var2.l;
                boolean equals = "audio/mp4a-latm".equals(str);
                gp gpVar = this.t;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    gpVar.getClass();
                    gpVar.l = 1;
                } else {
                    gpVar.getClass();
                    gpVar.l = 32;
                }
                this.s0 = true;
                return;
            }
            i0(this.A);
            String str2 = this.x.l;
            rn0 rn0Var = this.z;
            if (rn0Var != null) {
                if (this.B == null) {
                    f31 M = M(rn0Var);
                    if (M == null) {
                        if (this.z.f() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(M.f2038a, M.f2039b);
                            this.B = mediaCrypto;
                            if (!M.c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.C = z;
                        } catch (MediaCryptoException e) {
                            throw e(6006, this.x, e, false);
                        }
                    }
                }
                if (f31.d) {
                    int state = this.z.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        qn0 f = this.z.f();
                        f.getClass();
                        throw e(f.f4024a, this.x, f, false);
                    }
                }
            }
            try {
                R(this.B, this.C);
            } catch (bs1 e2) {
                throw e(4001, this.x, e2, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(android.media.MediaCrypto r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.R(android.media.MediaCrypto, boolean):void");
    }

    public abstract void S(Exception exc);

    public abstract void T(String str, long j, long j2);

    public abstract void U(String str);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0129, code lost:            if (D() == false) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0141, code lost:            if (r0 == false) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:            if (r12 != false) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:            if (D() == false) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:            r12 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0107, code lost:            if (r5.r == r6.r) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0115, code lost:            if (D() == false) goto L118;     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.xe0 V(defpackage.x50 r12) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.V(x50):xe0");
    }

    public abstract void W(y01 y01Var, MediaFormat mediaFormat);

    public void X() {
    }

    public void Y(long j) {
        this.L0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.w;
            if (!arrayDeque.isEmpty() && j >= ((cs1) arrayDeque.peek()).f1665a) {
                j0((cs1) arrayDeque.poll());
                Z();
            } else {
                return;
            }
        }
    }

    public abstract void Z();

    public abstract void a0(ve0 ve0Var);

    public final void b0() {
        int i = this.y0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.F0 = true;
                    f0();
                    return;
                } else {
                    e0();
                    Q();
                    return;
                }
            }
            G();
            o0();
            return;
        }
        G();
    }

    public abstract boolean c0(long j, long j2, ur1 ur1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, y01 y01Var);

    public final boolean d0(int i) {
        x50 x50Var = this.f2984b;
        x50Var.j();
        ve0 ve0Var = this.q;
        ve0Var.i();
        int s = s(x50Var, ve0Var, i | 4);
        if (s == -5) {
            V(x50Var);
            return true;
        }
        if (s == -4 && ve0Var.g(4)) {
            this.E0 = true;
            b0();
            return false;
        }
        return false;
    }

    public final void e0() {
        try {
            ur1 ur1Var = this.G;
            if (ur1Var != null) {
                ur1Var.release();
                this.J0.f4325b++;
                U(this.N.f5535a);
            }
            this.G = null;
            try {
                MediaCrypto mediaCrypto = this.B;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.G = null;
            try {
                MediaCrypto mediaCrypto2 = this.B;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void f0() {
    }

    public void g0() {
        this.n0 = -1;
        this.r.d = null;
        this.o0 = -1;
        this.p0 = null;
        this.m0 = -9223372036854775807L;
        this.A0 = false;
        this.z0 = false;
        this.i0 = false;
        this.j0 = false;
        this.q0 = false;
        this.r0 = false;
        this.u.clear();
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        dt dtVar = this.l0;
        if (dtVar != null) {
            dtVar.f1831a = 0L;
            dtVar.f1832b = 0L;
            dtVar.c = false;
        }
        this.x0 = 0;
        this.y0 = 0;
        this.w0 = this.v0 ? 1 : 0;
    }

    public final void h0() {
        g0();
        this.I0 = null;
        this.l0 = null;
        this.L = null;
        this.N = null;
        this.H = null;
        this.I = null;
        this.J = false;
        this.B0 = false;
        this.K = -1.0f;
        this.O = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.h0 = false;
        this.k0 = false;
        this.v0 = false;
        this.w0 = 0;
        this.C = false;
    }

    public final void i0(rn0 rn0Var) {
        rn0 rn0Var2 = this.z;
        if (rn0Var2 != rn0Var) {
            if (rn0Var != null) {
                rn0Var.d(null);
            }
            if (rn0Var2 != null) {
                rn0Var2.c(null);
            }
        }
        this.z = rn0Var;
    }

    @Override // defpackage.ko
    public boolean j() {
        return this.F0;
    }

    public final void j0(cs1 cs1Var) {
        this.K0 = cs1Var;
        if (cs1Var.f1666b != -9223372036854775807L) {
            this.M0 = true;
            X();
        }
    }

    @Override // defpackage.ko
    public boolean k() {
        boolean isReady;
        boolean z;
        if (this.x == null) {
            return false;
        }
        if (i()) {
            isReady = this.k;
        } else {
            rm2 rm2Var = this.g;
            rm2Var.getClass();
            isReady = rm2Var.isReady();
        }
        if (!isReady) {
            if (this.o0 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (this.m0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.m0)) {
                return false;
            }
        }
        return true;
    }

    public boolean k0(zr1 zr1Var) {
        return true;
    }

    @Override // defpackage.ko
    public void l() {
        this.x = null;
        j0(cs1.d);
        this.w.clear();
        H();
    }

    public boolean l0(y01 y01Var) {
        return false;
    }

    public abstract int m0(es1 es1Var, y01 y01Var);

    @Override // defpackage.ko
    public void n(long j, boolean z) {
        int i;
        this.E0 = false;
        this.F0 = false;
        this.H0 = false;
        if (this.s0) {
            this.t.i();
            this.s.i();
            this.t0 = false;
        } else if (H()) {
            Q();
        }
        nd1 nd1Var = this.K0.c;
        synchronized (nd1Var) {
            i = nd1Var.f3443b;
        }
        if (i > 0) {
            this.G0 = true;
        }
        this.K0.c.b();
        this.w.clear();
    }

    public final boolean n0(y01 y01Var) {
        if (wi3.f5017a >= 23 && this.G != null && this.y0 != 3 && this.f != 0) {
            float f = this.F;
            y01[] y01VarArr = this.h;
            y01VarArr.getClass();
            float K = K(f, y01VarArr);
            float f2 = this.K;
            if (f2 == K) {
                return true;
            }
            if (K == -1.0f) {
                if (this.z0) {
                    this.x0 = 1;
                    this.y0 = 3;
                    return false;
                }
                e0();
                Q();
                return false;
            }
            if (f2 == -1.0f && K <= this.p) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", K);
            this.G.c(bundle);
            this.K = K;
        }
        return true;
    }

    public final void o0() {
        try {
            this.B.setMediaDrmSession(M(this.A).f2039b);
            i0(this.A);
            this.x0 = 0;
            this.y0 = 0;
        } catch (MediaCryptoException e) {
            throw e(6006, this.x, e, false);
        }
    }

    public final void p0(long j) {
        Object obj;
        boolean z;
        nd1 nd1Var = this.K0.c;
        synchronized (nd1Var) {
            obj = null;
            while (nd1Var.f3443b > 0 && j - ((long[]) nd1Var.c)[nd1Var.f3442a] >= 0) {
                obj = nd1Var.g();
            }
        }
        y01 y01Var = (y01) obj;
        if (y01Var == null && this.M0 && this.I != null) {
            y01Var = (y01) this.K0.c.f();
        }
        if (y01Var != null) {
            this.y = y01Var;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.J && this.y != null)) {
            W(this.y, this.I);
            this.J = false;
            this.M0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:            if (r2 >= r7) goto L13;     */
    @Override // defpackage.ko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(defpackage.y01[] r6, long r7, long r9) {
        /*
            r5 = this;
            cs1 r6 = r5.K0
            long r6 = r6.f1666b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L16
            cs1 r6 = new cs1
            r6.<init>(r0, r9)
            r5.j0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque r6 = r5.w
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.C0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.L0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L42
        L2e:
            cs1 r6 = new cs1
            r6.<init>(r0, r9)
            r5.j0(r6)
            cs1 r6 = r5.K0
            long r6 = r6.f1666b
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L4c
            r5.Z()
            goto L4c
        L42:
            cs1 r7 = new cs1
            long r0 = r5.C0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.r(y01[], long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0067 A[LOOP:1: B:33:0x0047->B:42:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068 A[EDGE_INSN: B:43:0x0068->B:44:0x0068 BREAK  A[LOOP:1: B:33:0x0047->B:42:0x0067], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083 A[LOOP:2: B:45:0x0068->B:54:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084 A[EDGE_INSN: B:55:0x0084->B:56:0x0084 BREAK  A[LOOP:2: B:45:0x0068->B:54:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    @Override // defpackage.ko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.t(long, long):void");
    }

    @Override // defpackage.ko
    public void w(float f, float f2) {
        this.E = f;
        this.F = f2;
        n0(this.H);
    }

    @Override // defpackage.ko
    public final int x(y01 y01Var) {
        try {
            return m0(this.n, y01Var);
        } catch (hs1 e) {
            throw f(e, y01Var);
        }
    }

    @Override // defpackage.ko
    public final int y() {
        return 8;
    }

    public final boolean z(long j, long j2) {
        boolean z;
        gp gpVar;
        boolean z2;
        boolean z3;
        boolean z4;
        cp3.m(!this.F0);
        gp gpVar2 = this.t;
        int i = gpVar2.k;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c0(j, j2, null, gpVar2.d, this.o0, 0, i, gpVar2.f, gpVar2.h(), gpVar2.g(4), this.y)) {
                gpVar = gpVar2;
                Y(gpVar.j);
                gpVar.i();
            } else {
                return false;
            }
        } else {
            gpVar = gpVar2;
        }
        if (this.E0) {
            this.F0 = true;
            return false;
        }
        boolean z5 = this.t0;
        ve0 ve0Var = this.s;
        if (z5) {
            cp3.m(gpVar.m(ve0Var));
            this.t0 = false;
        }
        if (this.u0) {
            if (gpVar.k > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
            C();
            this.u0 = false;
            Q();
            if (!this.s0) {
                return false;
            }
        }
        cp3.m(!this.E0);
        x50 x50Var = this.f2984b;
        x50Var.j();
        ve0Var.i();
        while (true) {
            ve0Var.i();
            int s = s(x50Var, ve0Var, 0);
            if (s != -5) {
                if (s != -4) {
                    if (s != -3) {
                        throw new IllegalStateException();
                    }
                } else {
                    if (ve0Var.g(4)) {
                        this.E0 = true;
                        break;
                    }
                    if (this.G0) {
                        y01 y01Var = this.x;
                        y01Var.getClass();
                        this.y = y01Var;
                        W(y01Var, null);
                        this.G0 = false;
                    }
                    ve0Var.l();
                    if (!gpVar.m(ve0Var)) {
                        this.t0 = true;
                        break;
                    }
                }
            } else {
                V(x50Var);
                break;
            }
        }
        if (gpVar.k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            gpVar.l();
        }
        if (gpVar.k > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !this.E0 && !this.u0) {
            return false;
        }
        return true;
    }
}
