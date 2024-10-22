package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1A extends C3E {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e = {"1acRM6Cf6EhxOJODmj0H0eP8VC35ZmTt", "cV9GjlkLQwwiHa", "i1c6IC1hwgIn8DthxqNi0XpoGO8BN4qE", "gFn4mUSFpSKHUauCdH5nTsZh8y8bn5UZ", "9nkQNk0PAkkX03QPU4alH8fTsKo9h28D", "s2uNxYIY6duU338ylAtcR72UhbPyFCsP", "VOm8bC2ft6X0ZlQ", "HWs0n0OHt4vGmZ"};
    public static final int[] A0f;
    public I8 A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public I7 A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final IB A0W;
    public final IK A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Point A02(C0314Cy c0314Cy, Format format) throws D7 {
        boolean z = format.A08 > format.A0F;
        int i = z ? format.A08 : format.A0F;
        int i2 = z ? format.A0F : format.A08;
        float f = i2 / i;
        for (int i3 : A0f) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (C0436Hx.A02 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point A0E = c0314Cy.A0E(i5, i3);
                if (c0314Cy.A0H(A0E.x, A0E.y, format.A01)) {
                    return A0E;
                }
            } else {
                int A04 = C0436Hx.A04(i3, 16) * 16;
                int A042 = C0436Hx.A04(i4, 16) * 16;
                if (A04 * A042 <= D9.A00()) {
                    int i6 = z ? A042 : A04;
                    if (!z) {
                        A04 = A042;
                    }
                    return new Point(i6, A04);
                }
            }
        }
        return null;
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0d = new byte[]{10, 13, 11, 10, 93, 91, 93, 95, 112, 118, 112, 117, 6, 118, 119, 106, 112, 119, 1, 108, 28, 27, 29, 28, 126, 13, 15, 14, 9, 94, 11, 15, 76, 58, 61, 61, 61, 32, 108, 49, 71, 64, 64, 64, 0, 28, 5, 3, 64, 54, 49, 48, 49, 96, 53, 57, 64, 54, 49, 51, 49, 96, 53, 57, 81, 86, 68, 81, 82, 85, 71, 93, 88, 95, 77, 74, 74, 102, 106, 113, 100, 101, 24, 40, 44, 56, 9, 54, 46, 60, 43, 20, 80, 100, 99, 112, 78, 95, 126, 101, 116, 78, 35, 9, 7, 10, 8, 0, 102, 122, 19, 35, 51, 32, 55, 40, 32, 65, 85, 42, 65, 83, 81, 80, 84, 61, 45, 62, 41, 54, 62, 32, 62, 43, 41, 77, 51, 65, 55, 36, 76, 66, 67, 66, 43, 61, 68, 70, 103, 116, 108, 21, 18, 20, 29, 85, 70, 79, 46, 37, 73, 95, 38, 38, 81, 125, 118, 119, 113, 50, Byte.MAX_VALUE, 115, 106, 50, 96, 119, 97, 125, 126, 103, 102, 123, 125, 124, 50, 115, 118, 120, 103, 97, 102, 119, 118, 50, 102, 125, 40, 50, 104, 68, 70, 66, 68, 120, 26, 15, Byte.MAX_VALUE, 124, 126, 121, 122, 115, 106, 120, 126, 96, 126, 12, 96, 111, 77, 80, 124, 117, 108, 126, 120, 102, 119, 86, 77, 92, 43, 34, 59, 41, 47, 49, 62, 28, 7, 3, 44, 37, 60, 46, 40, 54, 59, 8, 16, 54, 49, 67, 112, 99, 116, 85, 114, 103, 116, 89, 85, 30, 107, 105, 105, 105, 43, 94, 92, 92, 94, 11, 126, 124, 124, 123, Byte.MAX_VALUE, 10, 11, 8, 8, 64, 53, 52, 55, 53, 90, 47, 46, 45, 41, 30, 107, 107, 105, 105, 25, 62, 51, 44, 58, 28, 55, 58, 60, 52, Byte.MAX_VALUE, 4, 51, 58, 56, 62, 60, 38, 25, 45, 62, 50, 58, 12, 54, 37, 58, 115, Byte.MAX_VALUE, 40, 38, 32, 33, 42, 42, 48, 40, 45, 35, 88, 92, 89, 95, 42, 36, 34, 35, 40, 40, 50, 62, 58, 58, 92, 91, 93, 84, 33, 47, 41, 40, 35, 35, 57, 53, 49, 49, 87, 80, 84, 81, 22, 24, 30, 31, 20, 20, 14, 2, 6, 6, 96, 103, 98, 96, 84, 90, 92, 93, 86, 86, 76, 68, 81, 95, 38, 36, 35, 43, Byte.MAX_VALUE, 113, 119, 118, 125, 125, 103, 111, 122, 116, 15, 11, 14, 13, 58, 52, 50, 51, 56, 56, 34, 42, 63, 49, 74, 72, 76, 68, 12, 34, 4, 5, 14, 14, 20, 8, 9, 7, 124, 126, 122, 120, 75, 101, 67, 66, 73, 73, 83, 75, 78, 64, 59, 63, 61, 53, 44, 51, 38, 40, 42, 73, 44, 97, 126, 106, 104, 100, 4, 97, 9, 22, 23, 15, 18, 108, 9, 119, 80, 88, 87, 80, 87, 70, 19, 102, 11, 9, 12, 0, 13, 16, 72, 54, 51, 98, 55, 51, 22, 27, 14, 18, 10, 20, 4, 27, 101, 125, 120, 121, Byte.MAX_VALUE, 8, 112, 38, 62, 54, 58, 41, 38, 44, 62, 70, 76, 89, 55, 53, 29, 28, 17, 25, 59, 23, 28, 29, 27, 46, 17, 28, 29, 23, 42, 29, 22, 28, 29, 10, 29, 10, 114, 106, 117, 120, 117, 125, 30, 8, 101, 100, 97, 26, 115, 101, 8, 10, 14, 119, 40, 42, 63, 73, 0, 8, 8, 0, 11, 2, 44, 13, 6, 51, 15, 22, 16, 86, 55, 41, 79, 65, 72, 96, 8, 5, 50, 32, 80, 79, 84, 85, 82, 47, 35, 52, 61, 70, 65, 75, 42, 61, 52, 76, 75, 74, 55, 32, 41, 81, 86, 86, 69, 89, 80, 124, 126, 99, 27, Byte.MAX_VALUE, 16, 40, 33, 46, 52, 47, 45, 118, 88, 97, 112, 97, 60, 37, 63, 87, 59, 79, 45, 20, 5, 20, 72, 80, 76, 77, 34, 73, 58, 3, 97, 103, 98, 109, 8, 14, 10, 12, 52, 81, 87, 82, 120, 29, 26, 24, 25, 119, 19, 81, 77, 49, 54, 88, 69, 95, 85, 25, 16, 121, 118, 65, 87, 75, 72, 81, 80, 77, 75, 74, 87, 4, 81, 74, 79, 74, 75, 83, 74, 10, 4, 103, 75, 64, 65, 71, 4, 73, 69, 92, 4, 86, 65, 87, 75, 72, 81, 80, 77, 75, 74, 30, 4, 27, 30, 24, 101, 12, 28, 30, 121, 125, 68, 123, 118, 99, 114, 72, 71, 101, 120, 107, 125, 12, 18, 8, 12, 15, 121, 1, 23, 102, 120, 98, 102, 101, 13, 51, 37, 84, 74, 95, 82, 87, 33, 68, 82, 35, 61, 40, 37, 32, 93, 15, 52, 52, 123, 54, 58, 53, 34, 123, 40, 47, 41, 62, 58, 54, 123, 56, 51, 58, 53, 60, 62, 40, 119, 123, 40, 52, 123, 63, 41, 52, 43, 43, 50, 53, 60, 123, 52, 61, 61, 40, 62, 47, 97, 123, 67, 36, 64, 36, 37, 81, 84, 55, 84, 44, 71, 43, 60, 63, 12, 17, 102, 12, 27, 23, 114, 117, 117, 112, 86, 61, 62, 83, 92, 94, 67, 14, 108, 100, 25, 93, 32, 91, 66, 86, 71, 74, 76, 14, 80, 70, 80, 80, 74, 76, 77, 14, 74, 71, 9, 29, 28, 7, 69, 14, 26, 11, 29, 12, 17, 14, 83, 28, 17, 10, 10, 17, 19, 11, 26, 7, 24, 69, 4, 13, 14, 28, 32, 49, 44, 51, 110, 49, 42, 36, 43, 55, 95, 78, 83, 76, 17, 72, 83, 76, 103, 114, 53, 58, 47, 106, 30, 31, 24, 96, 118, 107, 116, 82, 109, 96, 97, 107, 70, 113, 98, 98, 97, 118, 107, 97, 98, 10, 3, 31, 24, 9, 30, 45, 57, 42, 38, 46, 102, 57, 42, 63, 46, 126, 107, 112, Byte.MAX_VALUE, Byte.MAX_VALUE, 112, 119, 43, 38, 42, 36, 43, 55, 54, 42, 61, 1, 59, 107, 104, 51, 50, 1, 58, 42, 43, 50, 59, 36, 18, 31, 22, 126, 27, 120, 115, 
        112, 125, 125, 41, 38, 34, 36, 78, 40, 41, 33, 39, 84, 79, 84, 78, 11, 13, 13, 16, 1, 8, 59, 55, 80, 85, 64, 24, 82, 70, 94, 79, 67, 68, 89, 111, 102, 92, 123, 53, 55, 59, 52, 52, 51, 52, 61, 123, 119, 100, Byte.MAX_VALUE, 120, 121, 73, 112, 57, 53, 44, 121, 60, 49, 61, 51, 60, 32, 19, 31, 6, 83, 23, 16, 14, 11, 10, 83, 13, 23, 4, 27, 45, 33, 56, 109, 55, 41, 36, 52, 40, 54, 51, 109, 105, 100, 111, 76, 72, 76, 68, 96, 111, 99, 111, 122, 102, 18, 21, 31, 23, 16, 29, 9, 15, 35, 26, 79, 13, 14, 13, 56, 41, 38, 45, 36, 36, 23, 44, 50, 35, 44, 39, 46, 46, 29, 38, 46, 90, 75, 68, 79, 70, 70, 117, 78, 89, 112, 97, 110, 101, 108, 108, 95, 100, 116, 83, 81, 74, 76, 81, 74, 87, 90, 70, 81, 88, 81, 85, 71, 81, 123, 65, 64, 68, 65, 64, 118, 65, 82, 82, 81, 70, 27, 6, 29, 8, 29, 0, 6, 7, 68, 13, 12, 14, 27, 12, 12, 26, 113, 59, 50, 55, 122, 50, 51, 58, 65, 83, 92, 70, 93, 92, 91, 110, 118, 116, 109, 75, 116, 121, 120, 114, 95, 104, 123, 123, 120, 111, 71, 82, 90, 87, 92, 108, 65, 92, 68, 74, 93, 82, 97, 91, 75, 12, 13, 22, 22, 29, 20, 29, 28, 85, 8, 20, 25, 1, 26, 25, 27, 19, 29, 14, 25, 5, 14, 14, 52, 38, 94, 62, 33, 44, 45, 39, 103, 123, 47, 56, 56, 55, 40, 37, 36, 46, 110, 32, 55, 34, 0, 31, 18, 19, 25, 89, 30, 19, 0, 21, 38, 57, 52, 53, 63, Byte.MAX_VALUE, 61, 32, 100, 38, 125, 53, 35, 68, 91, 86, 87, 93, 29, 74, 31, 68, 92, 86, 28, 93, 92, 0, 28, 68, 66, 10, 50, 45, 32, 33, 43, 107, 60, 105, 50, 42, 32, 106, 43, 42, 118, 106, 50, 52, 125, 97, 119, 98, 101, 121, 120, 110, 113, 96, 107, 124, 125, 61, 35, 46, 62, 34, 15, 23, 23, 28, 11, 39, 30, 115, 107, 107, 96, 119, 91, 98, 106, 67};
    }

    static {
        A0D();
        A0f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C1A(Context context, D4 d4, long j, BK<X6> bk, boolean z, Handler handler, IL il, int i) {
        super(2, d4, bk, z);
        this.A0U = j;
        this.A0T = i;
        Context applicationContext = context.getApplicationContext();
        this.A0V = applicationContext;
        this.A0W = new IB(applicationContext);
        this.A0X = new IK(handler, il);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(C0314Cy c0314Cy, Format format) {
        if (format.A09 != -1) {
            int i = 0;
            int i2 = format.A0P.size();
            for (int initializationDataCount = 0; initializationDataCount < i2; initializationDataCount++) {
                int totalInitializationDataSize = format.A0P.get(initializationDataCount).length;
                i += totalInitializationDataSize;
            }
            int i3 = format.A09;
            int initializationDataCount2 = A0e[4].charAt(25);
            if (initializationDataCount2 == 101) {
                throw new RuntimeException();
            }
            A0e[5] = "PFjSJxahL7zuosjl0ltO07DmFDIUFrxC";
            return i3 + i;
        }
        return A01(c0314Cy, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:            if (r5.A05 != false) goto L40;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.X.C0314Cy r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1A.A01(com.facebook.ads.redexgen.X.Cy, java.lang.String, int, int):int");
    }

    private final MediaFormat A03(Format format, I7 i7, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 120), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 19), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 26), format.A08);
        DA.A06(mediaFormat, format.A0P);
        DA.A03(mediaFormat, A05(954, 10, 18), format.A01);
        DA.A04(mediaFormat, A05(1180, 16, 48), format.A0B);
        DA.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 25), i7.A02);
        mediaFormat.setInteger(A05(1055, 10, 13), i7.A00);
        DA.A04(mediaFormat, A05(1065, 14, 39), i7.A01);
        if (C0436Hx.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 122), 0);
        }
        if (z) {
            String A05 = A05(875, 8, 49);
            if (A0e[5].charAt(18) != 't') {
                throw new RuntimeException();
            }
            A0e[5] = "LIFMuRLmQz6XdmDBeptCblAg9hMw0FnF";
            mediaFormat.setInteger(A05, 0);
        }
        if (i != 0) {
            A0K(mediaFormat, i);
        }
        return mediaFormat;
    }

    private final I7 A04(C0314Cy c0314Cy, Format format, Format[] formatArr) throws D7 {
        int maxWidth;
        int i = format.A0F;
        int i2 = format.A08;
        int A00 = A00(c0314Cy, format);
        int maxHeight = formatArr.length;
        if (maxHeight == 1) {
            return new I7(i, i2, A00);
        }
        int i3 = 0;
        for (Format format2 : formatArr) {
            if (A0V(c0314Cy.A03, format, format2)) {
                int maxWidth2 = format2.A0F;
                if (maxWidth2 != -1) {
                    int maxWidth3 = format2.A08;
                    if (maxWidth3 != -1) {
                        maxWidth = 0;
                        i3 |= maxWidth;
                        int maxWidth4 = format2.A0F;
                        i = Math.max(i, maxWidth4);
                        int maxWidth5 = format2.A08;
                        i2 = Math.max(i2, maxWidth5);
                        int maxWidth6 = A00(c0314Cy, format2);
                        A00 = Math.max(A00, maxWidth6);
                    }
                }
                maxWidth = 1;
                i3 |= maxWidth;
                int maxWidth42 = format2.A0F;
                i = Math.max(i, maxWidth42);
                int maxWidth52 = format2.A08;
                i2 = Math.max(i2, maxWidth52);
                int maxWidth62 = A00(c0314Cy, format2);
                A00 = Math.max(A00, maxWidth62);
            }
        }
        if (i3 != 0) {
            StringBuilder append = new StringBuilder().append(A05(683, 43, 125)).append(i);
            String A05 = A05(1379, 1, 98);
            String sb = append.append(A05).append(i2).toString();
            String A052 = A05(522, 23, 33);
            Log.w(A052, sb);
            Point A02 = A02(c0314Cy, format);
            if (A02 != null) {
                int maxWidth7 = A02.x;
                i = Math.max(i, maxWidth7);
                int maxWidth8 = A02.y;
                i2 = Math.max(i2, maxWidth8);
                int maxWidth9 = A01(c0314Cy, format.A0O, i, i2);
                A00 = Math.max(A00, maxWidth9);
                Log.w(A052, A05(164, 34, 75) + i + A05 + i2);
            }
        }
        return new I7(i, i2, A00);
    }

    private void A06() {
        MediaCodec A1C;
        this.A0R = false;
        if (C0436Hx.A02 >= 23 && this.A0S && (A1C = A1C()) != null) {
            this.A00 = new I8(this, A1C);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0H;
            long elapsedMs = elapsedRealtime - now;
            this.A0X.A02(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0H = elapsedRealtime;
        }
    }

    private void A09() {
        int i = this.A08;
        if (i == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != i || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            this.A0X.A01(i, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        int i = this.A0E;
        if (i == -1) {
            int i2 = this.A0C;
            String[] strArr = A0e;
            if (strArr[0].charAt(20) != strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            A0e[6] = "GSr0Qxmd2Qhu1M0N5tyB3p9H4Vler7W";
            if (i2 == -1) {
                return;
            }
        }
        this.A0X.A01(i, this.A0C, this.A0D, this.A03);
    }

    private void A0C() {
        long j;
        if (this.A0U > 0) {
            j = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            j = -9223372036854775807L;
        }
        this.A0J = j;
    }

    private final void A0E(int i) {
        super.A0U.A02 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i, long j) {
        C0433Hu.A02(A05(930, 15, 93));
        mediaCodec.releaseOutputBuffer(i, false);
        C0433Hu.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i, long j) {
        A09();
        C0433Hu.A02(A05(1161, 19, 109));
        mediaCodec.releaseOutputBuffer(i, true);
        C0433Hu.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    private final void A0H(MediaCodec mediaCodec, int i, long j) {
        C0433Hu.A02(A05(1211, 15, 68));
        mediaCodec.releaseOutputBuffer(i, false);
        C0433Hu.A00();
        super.A0U.A08++;
    }

    private final void A0I(MediaCodec mediaCodec, int i, long j, long j2) {
        A09();
        C0433Hu.A02(A05(1161, 19, 109));
        mediaCodec.releaseOutputBuffer(i, j2);
        C0433Hu.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static void A0K(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 33), true);
        mediaFormat.setInteger(A05(859, 16, 122), i);
    }

    private void A0L(Surface surface) throws C9K {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                C0314Cy A1D = A1D();
                if (A1D != null && A0T(A1D)) {
                    this.A0N = DummySurface.A01(this.A0V, A1D.A05);
                    surface = this.A0N;
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            if (A0e[3].charAt(22) != 'Z') {
                throw new RuntimeException();
            }
            A0e[5] = "451d0u4cD9rJ2w2guGtx9AsvugCig8Nc";
            int A7t = A7t();
            if (A7t == 1 || A7t == 2) {
                MediaCodec A1C = A1C();
                if (C0436Hx.A02 >= 23 && A1C != null && surface != null && !this.A0Q) {
                    A0J(A1C, surface);
                } else {
                    A1G();
                    A1I();
                }
            }
            if (surface != null && surface != this.A0N) {
                A0B();
                A06();
                if (A7t == 2) {
                    A0C();
                    return;
                }
                return;
            }
            A07();
            if (A0e[5].charAt(18) != 't') {
                A06();
                return;
            } else {
                A0e[3] = "pSIGciD2qJewSpKsBqH446Zc9mkVUpAR";
                A06();
                return;
            }
        }
        if (surface != null) {
            Surface surface2 = this.A0N;
            String[] strArr = A0e;
            if (strArr[1].length() == strArr[7].length()) {
                String[] strArr2 = A0e;
                strArr2[1] = "4gXhdQ7K18codO";
                strArr2[7] = "dCZzuzcRJjaMd3";
                if (surface == surface2) {
                    return;
                }
            } else if (surface == surface2) {
                return;
            }
            A0B();
            A0A();
        }
    }

    public static boolean A0M() {
        return C0436Hx.A02 <= 22 && A05(948, 6, 53).equals(C0436Hx.A03) && A05(545, 6, 101).equals(C0436Hx.A05);
    }

    public static boolean A0N(long j) {
        return j < -30000;
    }

    public static boolean A0O(long j) {
        return j < -500000;
    }

    private final boolean A0P(long j, long j2) {
        return A0O(j);
    }

    private final boolean A0Q(long j, long j2) {
        return A0N(j);
    }

    private final boolean A0R(long j, long j2) {
        return A0N(j) && j2 > 100000;
    }

    private final boolean A0S(MediaCodec mediaCodec, int i, long j, long j2) throws C9K {
        int A0z = A0z(j2);
        if (A0z == 0) {
            return false;
        }
        C0272Au c0272Au = super.A0U;
        int droppedSourceBufferCount = c0272Au.A03;
        c0272Au.A03 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0E(droppedSourceBufferCount2 + A0z);
        A1F();
        return true;
    }

    private boolean A0T(C0314Cy c0314Cy) {
        return C0436Hx.A02 >= 23 && !this.A0S && !A0U(c0314Cy.A02) && (!c0314Cy.A05 || DummySurface.A05(this.A0V));
    }

    private final boolean A0U(String str) {
        char c = 0;
        char c2 = 27;
        if (C0436Hx.A02 >= 27 || str.startsWith(A05(563, 10, 62))) {
            return false;
        }
        synchronized (C1A.class) {
            if (!A0c) {
                String str2 = C0436Hx.A03;
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (str2.equals(A05(341, 14, 52))) {
                            c2 = '\'';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2144781185:
                        if (str2.equals(A05(355, 14, 63))) {
                            c2 = '(';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2144781160:
                        if (str2.equals(A05(369, 14, 8))) {
                            c2 = ')';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2097309513:
                        if (str2.equals(A05(489, 6, 90))) {
                            c2 = '9';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2022874474:
                        if (str2.equals(A05(138, 10, 45))) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1978993182:
                        if (str2.equals(A05(551, 6, 9))) {
                            c2 = 'E';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1978990237:
                        if (str2.equals(A05(557, 6, 100))) {
                            c2 = 'F';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1936688988:
                        if (str2.equals(A05(597, 6, 42))) {
                            c2 = 'P';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1936688066:
                        if (str2.equals(A05(603, 6, 35))) {
                            c2 = 'Q';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1936688065:
                        if (str2.equals(A05(609, 6, 62))) {
                            c2 = 'R';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1931988508:
                        if (str2.equals(A05(82, 10, 0))) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1696512866:
                        if (str2.equals(A05(839, 6, 26))) {
                            c2 = 's';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1680025915:
                        if (str2.equals(A05(198, 7, 114))) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1615810839:
                        if (str2.equals(A05(623, 8, 25))) {
                            c2 = 'S';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1554255044:
                        if (str2.equals(A05(1258, 9, 50))) {
                            c2 = 'l';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1481772737:
                        if (str2.equals(A05(1126, 9, 27))) {
                            c2 = 'L';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1481772730:
                        if (str2.equals(A05(1135, 9, 115))) {
                            c2 = 'M';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1481772729:
                        if (str2.equals(A05(1144, 9, 89))) {
                            c2 = 'N';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1320080169:
                        if (str2.equals(A05(439, 14, 85))) {
                            c2 = '%';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1217592143:
                        if (str2.equals(A05(125, 11, 38))) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1180384755:
                        if (str2.equals(A05(1012, 6, 100))) {
                            c2 = '5';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1139198265:
                        if (str2.equals(A05(735, 9, 78))) {
                            c2 = '`';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1052835013:
                        if (str2.equals(A05(1098, 6, 87))) {
                            c2 = 'C';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -993250464:
                        if (str2.equals(A05(12, 7, 30))) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -965403638:
                        if (str2.equals(A05(1196, 8, 91))) {
                            c2 = 'b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -958336948:
                        if (str2.equals(A05(242, 11, 48))) {
                            c2 = 26;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -879245230:
                        if (str2.equals(A05(1235, 6, 103))) {
                            c2 = 'h';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -842500323:
                        if (str2.equals(A05(1104, 10, 37))) {
                            c2 = 'D';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -821392978:
                        if (str2.equals(A05(32, 7, 84))) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -797483286:
                        if (str2.equals(A05(726, 9, 17))) {
                            c2 = 'a';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -794946968:
                        if (str2.equals(A05(1347, 6, 79))) {
                            c2 = 'm';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -788334647:
                        if (str2.equals(A05(1353, 6, 64))) {
                            c2 = 'n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -782144577:
                        if (str2.equals(A05(573, 9, 58))) {
                            c2 = 'G';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -575125681:
                        if (str2.equals(A05(425, 14, 18))) {
                            c2 = '$';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -521118391:
                        if (str2.equals(A05(327, 14, 54))) {
                            c2 = '&';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -430914369:
                        if (str2.equals(A05(631, 10, 81))) {
                            c2 = 'T';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -290434366:
                        if (str2.equals(A05(1226, 9, 106))) {
                            c2 = 'c';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -282781963:
                        if (str2.equals(A05(103, 8, 18))) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -277133239:
                        if (str2.equals(A05(845, 7, 85))) {
                            c2 = 't';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -173639913:
                        if (str2.equals(A05(210, 12, 102))) {
                            c2 = 23;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -56598463:
                        if (str2.equals(A05(1371, 8, 93))) {
                            c2 = 'p';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2126:
                        if (str2.equals(A05(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 2, 41))) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2564:
                        if (str2.equals(A05(670, 2, 127))) {
                            c2 = '\\';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2715:
                        if (str2.equals(A05(821, 2, 76))) {
                            c2 = 'i';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2719:
                        if (str2.equals(A05(828, 2, 56))) {
                            c2 = 'k';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3483:
                        if (str2.equals(A05(1088, 2, 2))) {
                            c2 = '@';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 73405:
                        if (str2.equals(A05(486, 3, 19))) {
                            c2 = '8';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 75739:
                        if (str2.equals(A05(508, 3, 28))) {
                            c2 = '<';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 76779:
                        if (str2.equals(A05(519, 3, 88))) {
                            c2 = 'B';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 78669:
                        if (str2.equals(A05(586, 3, 105))) {
                            c2 = 'J';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 79305:
                        if (str2.equals(A05(615, 3, 76))) {
                            c2 = 'V';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80618:
                        if (str2.equals(A05(680, 3, 17))) {
                            c2 = '^';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 88274:
                        if (str2.equals(A05(852, 3, 13))) {
                            c2 = 'u';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 98846:
                        if (str2.equals(A05(921, 3, 93))) {
                            c2 = 19;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 98848:
                        if (str2.equals(A05(924, 3, 0))) {
                            c2 = 20;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 99329:
                        if (str2.equals(A05(927, 3, 35))) {
                            c2 = 21;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 101481:
                        if (str2.equals(A05(945, 3, 84))) {
                            c2 = '#';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1513190:
                        if (str2.equals(A05(0, 4, 98))) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1514184:
                        if (str2.equals(A05(4, 4, 53))) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1514185:
                        if (str2.equals(A05(8, 4, 24))) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2436959:
                        if (str2.equals(A05(582, 4, 32))) {
                            c2 = 'I';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2463773:
                        if (str2.equals(A05(652, 4, 11))) {
                            c2 = 'X';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2464648:
                        if (str2.equals(A05(661, 4, 60))) {
                            c2 = 'Z';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2689555:
                        if (str2.equals(A05(835, 4, 13))) {
                            c2 = 'r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3351335:
                        if (str2.equals(A05(1090, 4, 89))) {
                            c2 = 'A';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3386211:
                        if (str2.equals(A05(1114, 4, 102))) {
                            c2 = 'H';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 41325051:
                        if (str2.equals(A05(511, 8, 42))) {
                            c2 = '?';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 55178625:
                        if (str2.equals(A05(92, 11, 72))) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 61542055:
                        if (str2.equals(A05(19, 5, 116))) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 65355429:
                        if (str2.equals(A05(205, 5, 19))) {
                            c2 = 22;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66214468:
                        if (str2.equals(A05(263, 5, 1))) {
                            c2 = 28;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66214470:
                        if (str2.equals(A05(268, 5, 52))) {
                            c2 = 29;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66214473:
                        if (str2.equals(A05(273, 5, 20))) {
                            c2 = 30;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66215429:
                        if (str2.equals(A05(278, 5, 96))) {
                            c2 = 31;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66215431:
                        if (str2.equals(A05(283, 5, 95))) {
                            c2 = ' ';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66215433:
                        if (str2.equals(A05(288, 5, 69))) {
                            c2 = '!';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66216390:
                        if (str2.equals(A05(293, 5, 1))) {
                            c2 = '\"';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 76402249:
                        if (str2.equals(A05(618, 5, 117))) {
                            c2 = 'W';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 76404105:
                        if (str2.equals(A05(656, 5, 101))) {
                            c2 = 'Y';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 76404911:
                        if (str2.equals(A05(665, 5, 112))) {
                            c2 = '[';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80963634:
                        if (str2.equals(A05(823, 5, 79))) {
                            c2 = 'j';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 82882791:
                        if (str2.equals(A05(830, 5, 45))) {
                            c2 = 'q';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 102844228:
                        if (str2.equals(A05(1035, 5, 90))) {
                            c2 = ':';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 165221241:
                        if (str2.equals(A05(24, 8, 102))) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 182191441:
                        if (str2.equals(A05(155, 9, 79))) {
                            c2 = 18;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 245388979:
                        if (str2.equals(A05(1047, 8, 79))) {
                            c2 = '>';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 287431619:
                        if (str2.equals(A05(964, 7, 64))) {
                            c2 = '-';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 307593612:
                        if (str2.equals(A05(48, 8, 88))) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 308517133:
                        if (str2.equals(A05(56, 8, 88))) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 316215098:
                        if (str2.equals(A05(744, 8, 102))) {
                            c2 = 'd';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 316215116:
                        if (str2.equals(A05(752, 8, 12))) {
                            c2 = 'e';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 316246811:
                        if (str2.equals(A05(760, 8, 62))) {
                            c2 = 'f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 316246818:
                        if (str2.equals(A05(768, 8, 73))) {
                            c2 = 'g';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 407160593:
                        if (str2.equals(A05(641, 11, 36))) {
                            c2 = 'U';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 507412548:
                        if (str2.equals(A05(672, 8, 89))) {
                            c2 = ']';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 793982701:
                        if (str2.equals(A05(383, 14, 74))) {
                            c2 = '*';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 794038622:
                        if (str2.equals(A05(397, 14, 97))) {
                            c2 = '+';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 794040393:
                        if (str2.equals(A05(411, 14, 36))) {
                            c2 = ',';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 835649806:
                        if (str2.equals(A05(1040, 7, 3))) {
                            c2 = '=';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 917340916:
                        if (str2.equals(A05(39, 9, 41))) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 958008161:
                        if (str2.equals(A05(1026, 9, 115))) {
                            c2 = '7';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1060579533:
                        if (str2.equals(A05(1118, 8, 17))) {
                            c2 = 'K';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1150207623:
                        if (str2.equals(A05(501, 7, 17))) {
                            c2 = ';';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1176899427:
                        if (str2.equals(A05(1018, 8, 61))) {
                            c2 = '6';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1280332038:
                        if (str2.equals(A05(991, 7, 10))) {
                            c2 = '/';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1306947716:
                        if (str2.equals(A05(253, 10, 95))) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1349174697:
                        if (str2.equals(A05(977, 14, 7))) {
                            c2 = '.';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1522194893:
                        if (str2.equals(A05(1364, 7, 33))) {
                            c2 = 'o';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1691543273:
                        if (str2.equals(A05(148, 7, 125))) {
                            c2 = 17;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1709443163:
                        if (str2.equals(A05(998, 14, 72))) {
                            c2 = '3';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1865889110:
                        if (str2.equals(A05(1204, 7, 107))) {
                            c2 = '_';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1906253259:
                        if (str2.equals(A05(589, 8, 59))) {
                            c2 = 'O';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1977196784:
                        if (str2.equals(A05(474, 12, 103))) {
                            c2 = '4';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2029784656:
                        if (str2.equals(A05(453, 7, 61))) {
                            c2 = '0';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2030379515:
                        if (str2.equals(A05(460, 7, 112))) {
                            c2 = '1';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2047190025:
                        if (str2.equals(A05(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 10, 96))) {
                            c2 = 24;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2047252157:
                        if (str2.equals(A05(232, 10, 55))) {
                            c2 = 25;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2048319463:
                        if (str2.equals(A05(467, 7, 24))) {
                            c2 = '2';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                        A0b = true;
                        break;
                }
                String str3 = C0436Hx.A06;
                switch (str3.hashCode()) {
                    case 2006354:
                        if (str3.equals(A05(64, 4, 73))) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 2006367:
                        if (str3.equals(A05(68, 4, 74))) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        A0b = true;
                        break;
                }
                A0c = true;
            }
        }
        return A0b;
    }

    public static boolean A0V(boolean z, Format format, Format format2) {
        return format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z || (format.A0F == format2.A0F && format.A08 == format2.A08)) && C0436Hx.A0g(format.A0J, format2.A0J);
    }

    @Override // com.facebook.ads.redexgen.X.C3E, com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A12() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A12();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3E, com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.C3E, com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A14() {
        this.A0J = -9223372036854775807L;
        A08();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3E, com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A15(long j, boolean z) throws C9K {
        super.A15(j, z);
        A06();
        this.A0I = -9223372036854775807L;
        this.A05 = 0;
        this.A0K = -9223372036854775807L;
        int i = this.A0A;
        if (i != 0) {
            this.A0M = this.A0Z[i - 1];
            this.A0A = 0;
        }
        if (z) {
            A0C();
        } else {
            this.A0J = -9223372036854775807L;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3E, com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A16(boolean z) throws C9K {
        super.A16(z);
        int i = A11().A00;
        this.A0G = i;
        this.A0S = i != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl
    public final void A17(Format[] formatArr, long j) throws C9K {
        if (this.A0M == -9223372036854775807L) {
            this.A0M = j;
        } else {
            int i = this.A0A;
            if (i == this.A0Z.length) {
                Log.w(A05(522, 23, 33), A05(776, 45, 2) + this.A0Z[this.A0A - 1]);
            } else {
                int i2 = i + 1;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0e[4] = "ShVF99lXvOUYr05H2Tvsc9mrs3vvqIZt";
                this.A0A = i2;
            }
            long[] jArr = this.A0Z;
            int i3 = this.A0A;
            jArr[i3 - 1] = j;
            this.A0a[i3 - 1] = this.A0K;
        }
        super.A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final int A1A(MediaCodec mediaCodec, C0314Cy c0314Cy, Format format, Format format2) {
        if (A0V(c0314Cy.A03, format, format2) && format2.A0F <= this.A0P.A02 && format2.A08 <= this.A0P.A00 && A00(c0314Cy, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:            if (r3 <= com.facebook.ads.redexgen.X.D9.A00()) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:            r6 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:            if (r6 != false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:            r3 = new java.lang.StringBuilder();        r0 = A05(298, 29, 6);        r3 = r3.append(r0).append(r12.A0F);        r0 = A05(1379, 1, 98);        r3 = r3.append(r0).append(r12.A08);        r0 = A05(856, 3, 89);        r1 = r3.append(r0);        r0 = com.facebook.ads.redexgen.X.C0436Hx.A04;        r3 = r1.append(r0);        r0 = A05(855, 1, 29);        r3.append(r0).toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:            r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:            if (r3 <= com.facebook.ads.redexgen.X.D9.A00()) goto L50;     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.C3E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1B(com.facebook.ads.redexgen.X.D4 r10, com.facebook.ads.redexgen.X.BK<com.facebook.ads.redexgen.X.X6> r11, com.facebook.ads.internal.exoplayer2.thirdparty.Format r12) throws com.facebook.ads.redexgen.X.D7 {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1A.A1B(com.facebook.ads.redexgen.X.D4, com.facebook.ads.redexgen.X.BK, com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1F() throws C9K {
        super.A1F();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1G() {
        try {
            super.A1G();
            this.A04 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                Surface surface2 = this.A0O;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0e[5] = "XHzJ2HWKwUKgXdkRP5t1s0JJnuLP0pfM";
                if (surface2 == surface) {
                    this.A0O = null;
                }
                surface.release();
                this.A0N = null;
            }
        } catch (Throwable th) {
            this.A04 = 0;
            if (this.A0N != null) {
                Surface surface3 = this.A0O;
                Surface surface4 = this.A0N;
                if (surface3 == surface4) {
                    this.A0O = null;
                }
                surface4.release();
                this.A0N = null;
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1J(long j) {
        this.A04--;
        while (true) {
            int i = this.A0A;
            if (i == 0) {
                return;
            }
            long j2 = this.A0a[0];
            if (A0e[4].charAt(25) == 'e') {
                throw new RuntimeException();
            }
            A0e[6] = "welnO5ckQSDvaPJP3GxM6gJ3";
            if (j >= j2) {
                long[] jArr = this.A0Z;
                this.A0M = jArr[0];
                int i2 = i - 1;
                this.A0A = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.A0a;
                System.arraycopy(jArr2, 1, jArr2, 0, this.A0A);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:            if (r4 == 270) goto L24;     */
    @Override // com.facebook.ads.redexgen.X.C3E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1K(android.media.MediaCodec r9, android.media.MediaFormat r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1A.A1K(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1L(Format format) throws C9K {
        super.A1L(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1M(XE xe) {
        this.A04++;
        this.A0K = Math.max(xe.A00, this.A0K);
        if (C0436Hx.A02 < 23 && this.A0S) {
            A1R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1N(C0314Cy c0314Cy, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws D7 {
        I7 A04 = A04(c0314Cy, format, A19());
        this.A0P = A04;
        MediaFormat A03 = A03(format, A04, this.A0Y, this.A0G);
        if (this.A0O == null) {
            HI.A04(A0T(c0314Cy));
            if (this.A0N == null) {
                this.A0N = DummySurface.A01(this.A0V, c0314Cy.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(A03, this.A0O, mediaCrypto, 0);
        if (C0436Hx.A02 >= 23 && this.A0S) {
            this.A00 = new I8(this, mediaCodec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A1O(String str, long j, long j2) {
        this.A0X.A07(str, j, j2);
        this.A0Q = A0U(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:            if (A0R(r8, r19 - r4) != false) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:            if (r9 != false) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:            if (r9 != false) goto L45;     */
    @Override // com.facebook.ads.redexgen.X.C3E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1P(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42) throws com.facebook.ads.redexgen.X.C9K {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1A.A1P(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final boolean A1Q(C0314Cy c0314Cy) {
        return this.A0O != null || A0T(c0314Cy);
    }

    public final void A1R() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0322Dl, com.facebook.ads.redexgen.X.InterfaceC02429p
    public final void A8L(int i, Object obj) throws C9K {
        if (i == 1) {
            A0L((Surface) obj);
            return;
        }
        if (i == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec A1C = A1C();
            if (A1C == null) {
                return;
            }
            int i2 = this.A0F;
            if (A0e[6].length() == 11) {
                throw new RuntimeException();
            }
            A0e[4] = "ynW9njiEKJeSgaNYH6SlaayD7qz19oDR";
            A1C.setVideoScalingMode(i2);
            return;
        }
        super.A8L(i, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:            if (r9.A0S == false) goto L20;     */
    @Override // com.facebook.ads.redexgen.X.C3E, com.facebook.ads.redexgen.X.XS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A90() {
        /*
            r9 = this;
            boolean r0 = super.A90()
            r8 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L3f
            boolean r0 = r9.A0R
            if (r0 != 0) goto L36
            android.view.Surface r1 = r9.A0N
            if (r1 == 0) goto L18
            android.view.Surface r0 = r9.A0O
            if (r0 == r1) goto L36
        L18:
            android.media.MediaCodec r3 = r9.A1C()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1A.A0e
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L39
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1A.A0e
            java.lang.String r1 = "3hQTJaHLIy4JZfUSwiFMMfqMh"
            r0 = 6
            r2[r0] = r1
            if (r3 == 0) goto L36
            boolean r0 = r9.A0S
            if (r0 == 0) goto L3f
        L36:
            r9.A0J = r5
            return r8
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            long r1 = r9.A0J
            r7 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L47
            return r7
        L47:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r9.A0J
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            return r8
        L52:
            r9.A0J = r5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1A.A90():boolean");
    }
}
