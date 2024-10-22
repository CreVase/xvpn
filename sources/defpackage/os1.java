package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class os1 extends ds1 {
    public static boolean A1;
    public static final int[] y1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean z1;
    public final Context O0;
    public final fk3 P0;
    public final jk3 Q0;
    public final long R0;
    public final int S0;
    public final boolean T0;
    public pm U0;
    public boolean V0;
    public boolean W0;
    public Surface X0;
    public PlaceholderSurface Y0;
    public boolean Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public long e1;
    public long f1;
    public long g1;
    public int h1;
    public int i1;
    public int j1;
    public long k1;
    public long l1;
    public long m1;
    public int n1;
    public long o1;
    public int p1;
    public int q1;
    public int r1;
    public float s1;
    public lk3 t1;
    public boolean u1;
    public int v1;
    public ns1 w1;
    public zt0 x1;

    public os1(Context context, y42 y42Var, Handler handler, yt0 yt0Var) {
        super(2, y42Var, 30.0f);
        this.R0 = 5000L;
        this.S0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.O0 = applicationContext;
        this.P0 = new fk3(applicationContext);
        this.Q0 = new jk3(handler, yt0Var);
        this.T0 = "NVIDIA".equals(wi3.c);
        this.f1 = -9223372036854775807L;
        this.p1 = -1;
        this.q1 = -1;
        this.s1 = -1.0f;
        this.a1 = 1;
        this.v1 = 0;
        this.t1 = null;
    }

    public static boolean r0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (os1.class) {
            if (!z1) {
                A1 = s0();
                z1 = true;
            }
        }
        return A1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0848, code lost:            if (r0.equals("PGN528") == false) goto L91;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean s0() {
        /*
            Method dump skipped, instructions count: 3186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os1.s0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:            if (r4.equals("video/hevc") == false) goto L19;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int t0(defpackage.y01 r10, defpackage.zr1 r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os1.t0(y01, zr1):int");
    }

    public static hb1 u0(Context context, es1 es1Var, y01 y01Var, boolean z, boolean z2) {
        String str = y01Var.l;
        if (str == null) {
            db1 db1Var = hb1.f2394b;
            return ji2.e;
        }
        ((df0) es1Var).getClass();
        List e = ks1.e(str, z, z2);
        String b2 = ks1.b(y01Var);
        if (b2 == null) {
            return hb1.l(e);
        }
        List e2 = ks1.e(b2, z, z2);
        if (wi3.f5017a >= 26 && "video/dolby-vision".equals(y01Var.l) && !e2.isEmpty() && !ms1.a(context)) {
            return hb1.l(e2);
        }
        db1 db1Var2 = hb1.f2394b;
        cb1 cb1Var = new cb1();
        cb1Var.a0(e);
        cb1Var.a0(e2);
        return cb1Var.b0();
    }

    public static int v0(y01 y01Var, zr1 zr1Var) {
        if (y01Var.m != -1) {
            List list = y01Var.n;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) list.get(i2)).length;
            }
            return y01Var.m + i;
        }
        return t0(y01Var, zr1Var);
    }

    @Override // defpackage.ds1
    public final xe0 A(zr1 zr1Var, y01 y01Var, y01 y01Var2) {
        int i;
        xe0 b2 = zr1Var.b(y01Var, y01Var2);
        pm pmVar = this.U0;
        int i2 = pmVar.f3870a;
        int i3 = y01Var2.q;
        int i4 = b2.e;
        if (i3 > i2 || y01Var2.r > pmVar.f3871b) {
            i4 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (v0(y01Var2, zr1Var) > this.U0.c) {
            i4 |= 64;
        }
        int i5 = i4;
        String str = zr1Var.f5535a;
        if (i5 != 0) {
            i = 0;
        } else {
            i = b2.d;
        }
        return new xe0(str, y01Var, y01Var2, i, i5);
    }

    public final void A0(ur1 ur1Var, int i, long j) {
        y0();
        m20.N("releaseOutputBuffer");
        ur1Var.d(i, j);
        m20.e0();
        this.l1 = SystemClock.elapsedRealtime() * 1000;
        this.J0.e++;
        this.i1 = 0;
        x0();
    }

    @Override // defpackage.ds1
    public final xr1 B(IllegalStateException illegalStateException, zr1 zr1Var) {
        return new ls1(illegalStateException, zr1Var, this.X0);
    }

    public final boolean B0(zr1 zr1Var) {
        if (wi3.f5017a >= 23 && !this.u1 && !r0(zr1Var.f5535a) && (!zr1Var.f || PlaceholderSurface.b(this.O0))) {
            return true;
        }
        return false;
    }

    public final void C0(ur1 ur1Var, int i) {
        m20.N("skipVideoBuffer");
        ur1Var.h(i, false);
        m20.e0();
        this.J0.f++;
    }

    public final void D0(int i, int i2) {
        se0 se0Var = this.J0;
        se0Var.h += i;
        int i3 = i + i2;
        se0Var.g += i3;
        this.h1 += i3;
        int i4 = this.i1 + i3;
        this.i1 = i4;
        se0Var.i = Math.max(i4, se0Var.i);
        int i5 = this.S0;
        if (i5 > 0 && this.h1 >= i5) {
            w0();
        }
    }

    public final void E0(long j) {
        se0 se0Var = this.J0;
        se0Var.k += j;
        se0Var.l++;
        this.m1 += j;
        this.n1++;
    }

    @Override // defpackage.ds1
    public final boolean J() {
        if (this.u1 && wi3.f5017a < 23) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ds1
    public final float K(float f, y01[] y01VarArr) {
        float f2 = -1.0f;
        for (y01 y01Var : y01VarArr) {
            float f3 = y01Var.s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.ds1
    public final ArrayList L(es1 es1Var, y01 y01Var, boolean z) {
        hb1 u0 = u0(this.O0, es1Var, y01Var, z, this.u1);
        Pattern pattern = ks1.f3004a;
        ArrayList arrayList = new ArrayList(u0);
        Collections.sort(arrayList, new jw3(new fs1(y01Var), 1));
        return arrayList;
    }

    @Override // defpackage.ds1
    public final sr1 N(zr1 zr1Var, y01 y01Var, MediaCrypto mediaCrypto, float f) {
        int i;
        e20 e20Var;
        pm pmVar;
        boolean z;
        int i2;
        int i3;
        Point point;
        float f2;
        int i4;
        int i5;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        Pair d;
        int t0;
        PlaceholderSurface placeholderSurface = this.Y0;
        if (placeholderSurface != null && placeholderSurface.f1514a != zr1Var.f) {
            if (this.X0 == placeholderSurface) {
                this.X0 = null;
            }
            placeholderSurface.release();
            this.Y0 = null;
        }
        String str = zr1Var.c;
        y01[] y01VarArr = this.h;
        y01VarArr.getClass();
        int i8 = y01Var.q;
        int v0 = v0(y01Var, zr1Var);
        int length = y01VarArr.length;
        float f3 = y01Var.s;
        int i9 = y01Var.q;
        e20 e20Var2 = y01Var.x;
        int i10 = y01Var.r;
        if (length == 1) {
            if (v0 != -1 && (t0 = t0(y01Var, zr1Var)) != -1) {
                v0 = Math.min((int) (v0 * 1.5f), t0);
            }
            pmVar = new pm(i8, i10, v0);
            i = i10;
            e20Var = e20Var2;
        } else {
            int length2 = y01VarArr.length;
            int i11 = i10;
            int i12 = 0;
            boolean z4 = false;
            while (i12 < length2) {
                y01 y01Var2 = y01VarArr[i12];
                y01[] y01VarArr2 = y01VarArr;
                if (e20Var2 != null && y01Var2.x == null) {
                    x01 x01Var = new x01(y01Var2);
                    x01Var.w = e20Var2;
                    y01Var2 = new y01(x01Var);
                }
                if (zr1Var.b(y01Var, y01Var2).d != 0) {
                    int i13 = y01Var2.r;
                    i6 = length2;
                    int i14 = y01Var2.q;
                    if (i14 != -1 && i13 != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z4 |= z2;
                    int max = Math.max(i8, i14);
                    i11 = Math.max(i11, i13);
                    i8 = max;
                    v0 = Math.max(v0, v0(y01Var2, zr1Var));
                } else {
                    i6 = length2;
                }
                i12++;
                y01VarArr = y01VarArr2;
                length2 = i6;
            }
            if (z4) {
                sn1.f();
                if (i10 > i9) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = i10;
                } else {
                    i2 = i9;
                }
                if (z) {
                    i3 = i9;
                } else {
                    i3 = i10;
                }
                float f4 = i3 / i2;
                int[] iArr = y1;
                i = i10;
                e20Var = e20Var2;
                int i15 = 0;
                while (i15 < 9) {
                    int i16 = iArr[i15];
                    int[] iArr2 = iArr;
                    int i17 = (int) (i16 * f4);
                    if (i16 <= i2 || i17 <= i3) {
                        break;
                    }
                    int i18 = i2;
                    int i19 = i3;
                    if (wi3.f5017a >= 21) {
                        if (z) {
                            i5 = i17;
                        } else {
                            i5 = i16;
                        }
                        if (!z) {
                            i16 = i17;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = zr1Var.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f2 = f4;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f4;
                            point2 = new Point((((i5 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i16 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (zr1Var.f(point2.x, point2.y, f3)) {
                            point = point3;
                            break;
                        }
                        i15++;
                        iArr = iArr2;
                        i2 = i18;
                        i3 = i19;
                        f4 = f2;
                    } else {
                        f2 = f4;
                        try {
                            int i20 = (((i16 + 16) - 1) / 16) * 16;
                            int i21 = (((i17 + 16) - 1) / 16) * 16;
                            if (i20 * i21 <= ks1.i()) {
                                if (z) {
                                    i4 = i21;
                                } else {
                                    i4 = i20;
                                }
                                if (!z) {
                                    i20 = i21;
                                }
                                point = new Point(i4, i20);
                            } else {
                                i15++;
                                iArr = iArr2;
                                i2 = i18;
                                i3 = i19;
                                f4 = f2;
                            }
                        } catch (hs1 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i11 = Math.max(i11, point.y);
                    x01 x01Var2 = new x01(y01Var);
                    x01Var2.p = i8;
                    x01Var2.q = i11;
                    v0 = Math.max(v0, t0(new y01(x01Var2), zr1Var));
                    sn1.f();
                }
            } else {
                i = i10;
                e20Var = e20Var2;
            }
            pmVar = new pm(i8, i11, v0);
        }
        this.U0 = pmVar;
        if (this.u1) {
            i7 = this.v1;
        } else {
            i7 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i9);
        mediaFormat.setInteger("height", i);
        m20.U0(mediaFormat, y01Var.n);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        m20.E0(mediaFormat, "rotation-degrees", y01Var.t);
        if (e20Var != null) {
            e20 e20Var3 = e20Var;
            m20.E0(mediaFormat, "color-transfer", e20Var3.c);
            m20.E0(mediaFormat, "color-standard", e20Var3.f1875a);
            m20.E0(mediaFormat, "color-range", e20Var3.f1876b);
            byte[] bArr = e20Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(y01Var.l) && (d = ks1.d(y01Var)) != null) {
            m20.E0(mediaFormat, Scopes.PROFILE, ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", pmVar.f3870a);
        mediaFormat.setInteger("max-height", pmVar.f3871b);
        m20.E0(mediaFormat, "max-input-size", pmVar.c);
        if (wi3.f5017a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.T0) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i7 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i7);
        }
        if (this.X0 == null) {
            if (B0(zr1Var)) {
                if (this.Y0 == null) {
                    this.Y0 = PlaceholderSurface.d(this.O0, zr1Var.f);
                }
                this.X0 = this.Y0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new sr1(zr1Var, mediaFormat, y01Var, this.X0, mediaCrypto);
    }

    @Override // defpackage.ds1
    public final void O(ve0 ve0Var) {
        if (!this.W0) {
            return;
        }
        ByteBuffer byteBuffer = ve0Var.g;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b2 = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            byteBuffer.position(0);
            if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                if (b4 == 0 || b4 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    ur1 ur1Var = this.G;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    ur1Var.c(bundle);
                }
            }
        }
    }

    @Override // defpackage.ds1
    public final void S(Exception exc) {
        sn1.d("MediaCodecVideoRenderer", "Video codec error", exc);
        jk3 jk3Var = this.Q0;
        Handler handler = jk3Var.f2782a;
        if (handler != null) {
            handler.post(new lf(20, jk3Var, exc));
        }
    }

    @Override // defpackage.ds1
    public final void T(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        jk3 jk3Var = this.Q0;
        Handler handler = jk3Var.f2782a;
        if (handler != null) {
            handler.post(new di(jk3Var, str, j, j2, 1));
        }
        this.V0 = r0(str);
        zr1 zr1Var = this.N;
        zr1Var.getClass();
        boolean z = false;
        if (wi3.f5017a >= 29 && "video/x-vnd.on2.vp9".equals(zr1Var.f5536b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = zr1Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.W0 = z;
        if (wi3.f5017a >= 23 && this.u1) {
            ur1 ur1Var = this.G;
            ur1Var.getClass();
            this.w1 = new ns1(this, ur1Var);
        }
    }

    @Override // defpackage.ds1
    public final void U(String str) {
        jk3 jk3Var = this.Q0;
        Handler handler = jk3Var.f2782a;
        if (handler != null) {
            handler.post(new lf(18, jk3Var, str));
        }
    }

    @Override // defpackage.ds1
    public final xe0 V(x50 x50Var) {
        xe0 V = super.V(x50Var);
        y01 y01Var = (y01) x50Var.c;
        jk3 jk3Var = this.Q0;
        Handler handler = jk3Var.f2782a;
        if (handler != null) {
            handler.post(new cq0(13, jk3Var, y01Var, V));
        }
        return V;
    }

    @Override // defpackage.ds1
    public final void W(y01 y01Var, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        ur1 ur1Var = this.G;
        if (ur1Var != null) {
            ur1Var.j(this.a1);
        }
        if (this.u1) {
            this.p1 = y01Var.q;
            this.q1 = y01Var.r;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.p1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.q1 = integer2;
        }
        float f = y01Var.u;
        this.s1 = f;
        int i = wi3.f5017a;
        int i2 = y01Var.t;
        if (i >= 21) {
            if (i2 == 90 || i2 == 270) {
                int i3 = this.p1;
                this.p1 = this.q1;
                this.q1 = i3;
                this.s1 = 1.0f / f;
            }
        } else {
            this.r1 = i2;
        }
        fk3 fk3Var = this.P0;
        fk3Var.f = y01Var.s;
        ny0 ny0Var = fk3Var.f2105a;
        ny0Var.f3561a.c();
        ny0Var.f3562b.c();
        ny0Var.c = false;
        ny0Var.d = -9223372036854775807L;
        ny0Var.e = 0;
        fk3Var.b();
    }

    @Override // defpackage.ds1
    public final void Y(long j) {
        super.Y(j);
        if (!this.u1) {
            this.j1--;
        }
    }

    @Override // defpackage.ds1
    public final void Z() {
        q0();
    }

    @Override // defpackage.ds1
    public final void a0(ve0 ve0Var) {
        boolean z = this.u1;
        if (!z) {
            this.j1++;
        }
        if (wi3.f5017a < 23 && z) {
            long j = ve0Var.f;
            p0(j);
            y0();
            this.J0.e++;
            x0();
            Y(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.Surface] */
    @Override // defpackage.ko, defpackage.b62
    public final void c(int i, Object obj) {
        PlaceholderSurface placeholderSurface;
        Handler handler;
        PlaceholderSurface placeholderSurface2;
        long j;
        Handler handler2;
        int intValue;
        fk3 fk3Var = this.P0;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i == 5 && fk3Var.j != (intValue = ((Integer) obj).intValue())) {
                            fk3Var.j = intValue;
                            fk3Var.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.a1 = intValue2;
                    ur1 ur1Var = this.G;
                    if (ur1Var != null) {
                        ur1Var.j(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.v1 != intValue3) {
                    this.v1 = intValue3;
                    if (this.u1) {
                        e0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.x1 = (zt0) obj;
            return;
        }
        if (obj instanceof Surface) {
            placeholderSurface = (Surface) obj;
        } else {
            placeholderSurface = null;
        }
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface3 = this.Y0;
            if (placeholderSurface3 != null) {
                placeholderSurface = placeholderSurface3;
            } else {
                zr1 zr1Var = this.N;
                if (zr1Var != null && B0(zr1Var)) {
                    placeholderSurface = PlaceholderSurface.d(this.O0, zr1Var.f);
                    this.Y0 = placeholderSurface;
                }
            }
        }
        Surface surface = this.X0;
        int i2 = 19;
        jk3 jk3Var = this.Q0;
        if (surface != placeholderSurface) {
            this.X0 = placeholderSurface;
            fk3Var.getClass();
            if (placeholderSurface instanceof PlaceholderSurface) {
                placeholderSurface2 = null;
            } else {
                placeholderSurface2 = placeholderSurface;
            }
            if (fk3Var.e != placeholderSurface2) {
                fk3Var.a();
                fk3Var.e = placeholderSurface2;
                fk3Var.c(true);
            }
            this.Z0 = false;
            int i3 = this.f;
            ur1 ur1Var2 = this.G;
            if (ur1Var2 != null) {
                if (wi3.f5017a >= 23 && placeholderSurface != null && !this.V0) {
                    ur1Var2.l(placeholderSurface);
                } else {
                    e0();
                    Q();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.Y0) {
                lk3 lk3Var = this.t1;
                if (lk3Var != null && (handler2 = jk3Var.f2782a) != null) {
                    handler2.post(new lf(i2, jk3Var, lk3Var));
                }
                q0();
                if (i3 == 2) {
                    long j2 = this.R0;
                    if (j2 > 0) {
                        j = SystemClock.elapsedRealtime() + j2;
                    } else {
                        j = -9223372036854775807L;
                    }
                    this.f1 = j;
                    return;
                }
                return;
            }
            this.t1 = null;
            q0();
            return;
        }
        if (placeholderSurface != null && placeholderSurface != this.Y0) {
            lk3 lk3Var2 = this.t1;
            if (lk3Var2 != null && (handler = jk3Var.f2782a) != null) {
                handler.post(new lf(i2, jk3Var, lk3Var2));
            }
            if (this.Z0) {
                Surface surface2 = this.X0;
                Handler handler3 = jk3Var.f2782a;
                if (handler3 != null) {
                    handler3.post(new ik3(jk3Var, surface2, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:            if ((r11 == 0 ? false : r13.g[(int) ((r11 - 1) % 15)]) != false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:            if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r19 > 100000) != false) goto L83;     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015d  */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c0(long r24, long r26, defpackage.ur1 r28, java.nio.ByteBuffer r29, int r30, int r31, int r32, long r33, boolean r35, boolean r36, defpackage.y01 r37) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os1.c0(long, long, ur1, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, y01):boolean");
    }

    @Override // defpackage.ds1
    public final void g0() {
        super.g0();
        this.j1 = 0;
    }

    @Override // defpackage.ko
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.ds1, defpackage.ko
    public final boolean k() {
        PlaceholderSurface placeholderSurface;
        if (super.k() && (this.b1 || (((placeholderSurface = this.Y0) != null && this.X0 == placeholderSurface) || this.G == null || this.u1))) {
            this.f1 = -9223372036854775807L;
            return true;
        }
        if (this.f1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f1) {
            return true;
        }
        this.f1 = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.ds1
    public final boolean k0(zr1 zr1Var) {
        if (this.X0 == null && !B0(zr1Var)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ds1, defpackage.ko
    public final void l() {
        jk3 jk3Var = this.Q0;
        this.t1 = null;
        q0();
        int i = 0;
        this.Z0 = false;
        this.w1 = null;
        try {
            super.l();
            se0 se0Var = this.J0;
            jk3Var.getClass();
            synchronized (se0Var) {
            }
            Handler handler = jk3Var.f2782a;
            if (handler != null) {
                handler.post(new gk3(jk3Var, se0Var, i));
            }
        } catch (Throwable th) {
            jk3Var.a(this.J0);
            throw th;
        }
    }

    @Override // defpackage.ko
    public final void m(boolean z, boolean z2) {
        boolean z3;
        this.J0 = new se0();
        cj2 cj2Var = this.c;
        cj2Var.getClass();
        int i = 1;
        boolean z4 = cj2Var.f650a;
        if (z4 && this.v1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        cp3.m(z3);
        if (this.u1 != z4) {
            this.u1 = z4;
            e0();
        }
        se0 se0Var = this.J0;
        jk3 jk3Var = this.Q0;
        Handler handler = jk3Var.f2782a;
        if (handler != null) {
            handler.post(new gk3(jk3Var, se0Var, i));
        }
        this.c1 = z2;
        this.d1 = false;
    }

    @Override // defpackage.ds1
    public final int m0(es1 es1Var, y01 y01Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!vw1.i(y01Var.l)) {
            return p71.a(0, 0, 0);
        }
        if (y01Var.o != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.O0;
        hb1 u0 = u0(context, es1Var, y01Var, z, false);
        if (z && u0.isEmpty()) {
            u0 = u0(context, es1Var, y01Var, false, false);
        }
        if (u0.isEmpty()) {
            return p71.a(1, 0, 0);
        }
        int i6 = y01Var.G;
        if (i6 != 0 && i6 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return p71.a(2, 0, 0);
        }
        zr1 zr1Var = (zr1) u0.get(0);
        boolean d = zr1Var.d(y01Var);
        if (!d) {
            for (int i7 = 1; i7 < u0.size(); i7++) {
                zr1 zr1Var2 = (zr1) u0.get(i7);
                if (zr1Var2.d(y01Var)) {
                    zr1Var = zr1Var2;
                    z3 = false;
                    d = true;
                    break;
                }
            }
        }
        z3 = true;
        if (d) {
            i = 4;
        } else {
            i = 3;
        }
        if (zr1Var.e(y01Var)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (zr1Var.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z3) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (wi3.f5017a >= 26 && "video/dolby-vision".equals(y01Var.l) && !ms1.a(context)) {
            i4 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (d) {
            hb1 u02 = u0(context, es1Var, y01Var, z, true);
            if (!u02.isEmpty()) {
                Pattern pattern = ks1.f3004a;
                ArrayList arrayList = new ArrayList(u02);
                Collections.sort(arrayList, new jw3(new fs1(y01Var), 1));
                zr1 zr1Var3 = (zr1) arrayList.get(0);
                if (zr1Var3.d(y01Var) && zr1Var3.e(y01Var)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    @Override // defpackage.ds1, defpackage.ko
    public final void n(long j, boolean z) {
        super.n(j, z);
        q0();
        fk3 fk3Var = this.P0;
        fk3Var.m = 0L;
        fk3Var.p = -1L;
        fk3Var.n = -1L;
        long j2 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
        this.e1 = -9223372036854775807L;
        this.i1 = 0;
        if (z) {
            long j3 = this.R0;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            }
            this.f1 = j2;
            return;
        }
        this.f1 = -9223372036854775807L;
    }

    @Override // defpackage.ko
    public final void o() {
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
            PlaceholderSurface placeholderSurface = this.Y0;
            if (placeholderSurface != null) {
                if (this.X0 == placeholderSurface) {
                    this.X0 = null;
                }
                placeholderSurface.release();
                this.Y0 = null;
            }
        }
    }

    @Override // defpackage.ko
    public final void p() {
        this.h1 = 0;
        this.g1 = SystemClock.elapsedRealtime();
        this.l1 = SystemClock.elapsedRealtime() * 1000;
        this.m1 = 0L;
        this.n1 = 0;
        fk3 fk3Var = this.P0;
        fk3Var.d = true;
        fk3Var.m = 0L;
        fk3Var.p = -1L;
        fk3Var.n = -1L;
        bk3 bk3Var = fk3Var.f2106b;
        if (bk3Var != null) {
            ek3 ek3Var = fk3Var.c;
            ek3Var.getClass();
            ek3Var.f1952b.sendEmptyMessage(1);
            bk3Var.a(new z5(fk3Var, 25));
        }
        fk3Var.c(false);
    }

    @Override // defpackage.ko
    public final void q() {
        this.f1 = -9223372036854775807L;
        w0();
        int i = this.n1;
        if (i != 0) {
            long j = this.m1;
            jk3 jk3Var = this.Q0;
            Handler handler = jk3Var.f2782a;
            if (handler != null) {
                handler.post(new hk3(jk3Var, j, i));
            }
            this.m1 = 0L;
            this.n1 = 0;
        }
        fk3 fk3Var = this.P0;
        fk3Var.d = false;
        bk3 bk3Var = fk3Var.f2106b;
        if (bk3Var != null) {
            bk3Var.b();
            ek3 ek3Var = fk3Var.c;
            ek3Var.getClass();
            ek3Var.f1952b.sendEmptyMessage(2);
        }
        fk3Var.a();
    }

    public final void q0() {
        ur1 ur1Var;
        this.b1 = false;
        if (wi3.f5017a >= 23 && this.u1 && (ur1Var = this.G) != null) {
            this.w1 = new ns1(this, ur1Var);
        }
    }

    @Override // defpackage.ds1, defpackage.ko
    public final void w(float f, float f2) {
        super.w(f, f2);
        fk3 fk3Var = this.P0;
        fk3Var.i = f;
        fk3Var.m = 0L;
        fk3Var.p = -1L;
        fk3Var.n = -1L;
        fk3Var.c(false);
    }

    public final void w0() {
        if (this.h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.g1;
            int i = this.h1;
            jk3 jk3Var = this.Q0;
            Handler handler = jk3Var.f2782a;
            if (handler != null) {
                handler.post(new hk3(jk3Var, i, j));
            }
            this.h1 = 0;
            this.g1 = elapsedRealtime;
        }
    }

    public final void x0() {
        this.d1 = true;
        if (!this.b1) {
            this.b1 = true;
            Surface surface = this.X0;
            jk3 jk3Var = this.Q0;
            Handler handler = jk3Var.f2782a;
            if (handler != null) {
                handler.post(new ik3(jk3Var, surface, SystemClock.elapsedRealtime()));
            }
            this.Z0 = true;
        }
    }

    public final void y0() {
        int i = this.p1;
        if (i != -1 || this.q1 != -1) {
            lk3 lk3Var = this.t1;
            if (lk3Var == null || lk3Var.f3145a != i || lk3Var.f3146b != this.q1 || lk3Var.c != this.r1 || lk3Var.d != this.s1) {
                lk3 lk3Var2 = new lk3(this.p1, this.q1, this.r1, this.s1);
                this.t1 = lk3Var2;
                jk3 jk3Var = this.Q0;
                Handler handler = jk3Var.f2782a;
                if (handler != null) {
                    handler.post(new lf(19, jk3Var, lk3Var2));
                }
            }
        }
    }

    public final void z0(ur1 ur1Var, int i) {
        y0();
        m20.N("releaseOutputBuffer");
        ur1Var.h(i, true);
        m20.e0();
        this.l1 = SystemClock.elapsedRealtime() * 1000;
        this.J0.e++;
        this.i1 = 0;
        x0();
    }
}
