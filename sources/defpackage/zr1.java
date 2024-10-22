package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zr1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5536b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public zr1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f5535a = str;
        this.f5536b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = vw1.i(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = wi3.f5017a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:            if (r11 == null) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:            if (defpackage.wi3.f5017a < 21) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:            if (r11.isFeatureSupported("secure-playback") == false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:            r15 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:            if (r15 == false) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:            r15 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:            r7 = false;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zr1 h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            zr1 r13 = new zr1
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L46
            int r1 = defpackage.wi3.f5017a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L46
            r2 = 22
            if (r1 > r2) goto L41
            java.lang.String r1 = defpackage.wi3.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
        L2f:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L41
        L3f:
            r1 = 1
            goto L42
        L41:
            r1 = 0
        L42:
            if (r1 != 0) goto L46
            r6 = 1
            goto L47
        L46:
            r6 = 0
        L47:
            r1 = 21
            if (r11 == 0) goto L5a
            int r2 = defpackage.wi3.f5017a
            if (r2 < r1) goto L59
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L59
            r2 = 1
            goto L5a
        L59:
            r2 = 0
        L5a:
            if (r15 != 0) goto L72
            if (r11 == 0) goto L70
            int r15 = defpackage.wi3.f5017a
            if (r15 < r1) goto L6c
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L6c
            r15 = 1
            goto L6d
        L6c:
            r15 = 0
        L6d:
            if (r15 == 0) goto L70
            goto L72
        L70:
            r7 = 0
            goto L73
        L72:
            r7 = 1
        L73:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr1.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):zr1");
    }

    public final xe0 b(y01 y01Var, y01 y01Var2) {
        int i;
        int i2;
        boolean z = false;
        if (!wi3.a(y01Var.l, y01Var2.l)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.h) {
            if (y01Var.t != y01Var2.t) {
                i |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.e && (y01Var.q != y01Var2.q || y01Var.r != y01Var2.r)) {
                i |= 512;
            }
            if (!wi3.a(y01Var.x, y01Var2.x)) {
                i |= 2048;
            }
            if (wi3.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f5535a)) {
                z = true;
            }
            if (z && !y01Var.c(y01Var2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.f5535a;
                if (y01Var.c(y01Var2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new xe0(str, y01Var, y01Var2, i2, 0);
            }
        } else {
            if (y01Var.y != y01Var2.y) {
                i |= v.DEFAULT_BUFFER_SIZE;
            }
            if (y01Var.z != y01Var2.z) {
                i |= 8192;
            }
            if (y01Var.A != y01Var2.A) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str2 = this.f5536b;
            if (i == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair d = ks1.d(y01Var);
                Pair d2 = ks1.d(y01Var2);
                if (d != null && d2 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new xe0(this.f5535a, y01Var, y01Var2, 3, 0);
                    }
                }
            }
            if (!y01Var.c(y01Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i |= 2;
            }
            if (i == 0) {
                return new xe0(this.f5535a, y01Var, y01Var2, 1, 0);
            }
        }
        return new xe0(this.f5535a, y01Var, y01Var2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.y01 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr1.c(y01, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.y01 r10) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr1.d(y01):boolean");
    }

    public final boolean e(y01 y01Var) {
        if (this.h) {
            return this.e;
        }
        Pair d = ks1.d(y01Var);
        if (d != null && ((Integer) d.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i, int i2, double d) {
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (wi3.f5017a >= 29) {
            int a2 = yr1.a(videoCapabilities, i, i2, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder t = hx2.t("sizeAndRate.cover, ", i, "x", i2, "@");
                t.append(d);
                g(t.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f5535a) && "mcv5a".equals(wi3.f5018b)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && a(videoCapabilities, i2, i, d)) {
                    hx2.t("sizeAndRate.rotated, ", i, "x", i2, "@").append(d);
                    int i3 = wi3.f5017a;
                    sn1.b();
                }
            }
            StringBuilder t2 = hx2.t("sizeAndRate.support, ", i, "x", i2, "@");
            t2.append(d);
            g(t2.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        int i = wi3.f5017a;
        sn1.b();
    }

    public final String toString() {
        return this.f5535a;
    }
}
