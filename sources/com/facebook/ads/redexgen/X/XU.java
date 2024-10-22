package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XU implements InterfaceC02479u {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;
    public final BK<X6> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{113, 80, 83, 84, 64, 89, 65, 103, 80, 91, 81, 80, 71, 80, 71, 70, 115, 84, 86, 65, 90, 71, 76, Byte.MAX_VALUE, 72, 72, 85, 72, 26, 83, 84, 73, 78, 91, 84, 78, 83, 91, 78, 83, 84, 93, 26, 124, 124, 87, 74, 95, 93, 26, 95, 66, 78, 95, 84, 73, 83, 85, 84, 60, 11, 11, 22, 11, 89, 16, 23, 10, 13, 24, 23, 13, 16, 24, 13, 16, 23, 30, 89, 63, 53, 56, 58, 89, 28, 1, 13, 28, 23, 10, 16, 22, 23, 59, 12, 12, 17, 12, 94, 23, 16, 13, 10, 31, 16, 10, 23, 31, 10, 23, 16, 25, 94, 49, 14, 11, 13, 94, 27, 6, 10, 27, 16, 13, 23, 17, 16, 24, 47, 47, 50, 47, 125, 52, 51, 46, 41, 60, 51, 41, 52, 60, 41, 52, 51, 58, 125, 11, 13, 100, 125, 56, 37, 41, 56, 51, 46, 52, 50, 51, 93, 126, 112, 117, 116, 117, 49, 87, 119, 124, 97, 116, 118, 80, 100, 117, 120, 126, 67, 116, Byte.MAX_VALUE, 117, 116, 99, 116, 99, 63, 81, 114, 124, 121, 120, 121, 61, 81, 116, Byte.MAX_VALUE, 123, 113, 124, 126, 92, 104, 121, 116, 114, 79, 120, 115, 121, 120, 111, 120, 111, 51, 45, 14, 0, 5, 4, 5, 65, 45, 8, 3, 14, 17, 20, 18, 32, 20, 5, 8, 14, 51, 4, 15, 5, 4, 19, 4, 19, 79, 54, 21, 27, 30, 31, 30, 90, 54, 19, 24, 12, 10, 2, 44, 19, 30, 31, 21, 40, 31, 20, 30, 31, 8, 31, 8, 84, 75, 71, 69, 6, 78, 73, 75, 77, 74, 71, 71, 67, 6, 73, 76, 91, 6, 65, 70, 92, 77, 90, 70, 73, 68, 6, 77, 80, 71, 88, 68, 73, 81, 77, 90, 26, 6, 77, 80, 92, 6, 78, 78, 69, 88, 77, 79, 6, 110, 78, 69, 88, 77, 79, 105, 93, 76, 65, 71, 122, 77, 70, 76, 77, 90, 77, 90, 84, 88, 90, 25, 81, 86, 84, 82, 85, 88, 88, 92, 25, 86, 83, 68, 25, 94, 89, 67, 82, 69, 89, 86, 91, 25, 82, 79, 88, 71, 91, 86, 78, 82, 69, 5, 25, 82, 79, 67, 25, 81, 91, 86, 84, 25, 123, 94, 85, 81, 91, 86, 84, 118, 66, 83, 94, 88, 101, 82, 89, 83, 82, 69, 82, 69, 87, 91, 89, 26, 82, 85, 87, 81, 86, 91, 91, 95, 26, 85, 80, 71, 26, 93, 90, 64, 81, 70, 90, 85, 88, 26, 81, 76, 91, 68, 88, 85, 77, 81, 70, 6, 26, 81, 76, 64, 26, 91, 68, 65, 71, 26, 120, 93, 86, 91, 68, 65, 71, 117, 65, 80, 93, 91, 102, 81, 90, 80, 81, 70, 81, 70, 60, 48, 50, 113, 57, 62, 60, 58, 61, 48, 48, 52, 113, 62, 59, 44, 113, 54, 49, 43, 58, 45, 49, 62, 51, 113, 58, 39, 48, 47, 51, 62, 38, 58, 45, 109, 113, 58, 39, 43, 113, 41, 47, 102, 113, 19, 54, 61, 41, 47, 39, 9, 54, 59, 58, 48, 13, 58, 49, 59, 58, 45, 58, 45};
    }

    public XU(Context context) {
        this(context, 0);
    }

    public XU(Context context, int i) {
        this(context, null, i, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public XU(Context context, BK<X6> bk, int i, long j) {
        this.A02 = context;
        this.A00 = i;
        this.A01 = j;
        this.A03 = bk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, BK<X6> bk, long j, Handler handler, IL il, int extensionRendererIndex, ArrayList<XS> arrayList) {
        Class<?> cls;
        Class<?> clazz;
        Class<?> clazz2;
        Class<?> clazz3;
        arrayList.add(new C1A(context, D4.A00, j, bk, false, handler, il, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                cls = Class.forName(A00(469, 64, 11));
                clazz = Boolean.TYPE;
                clazz2 = Long.TYPE;
                clazz3 = Integer.TYPE;
            } catch (ClassNotFoundException unused) {
                return;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            arrayList.add(size, (XS) cls.getConstructor(clazz, clazz2, Handler.class, IL.class, clazz3).newInstance(true, Long.valueOf(j), handler, il, 50));
            Log.i(A00(0, 23, 97), A00(243, 27, 46));
        } catch (Exception e2) {
            e = e2;
            throw new RuntimeException(A00(127, 33, 9), e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(1:7)|8|(2:9|10)|(2:11|12)|14|15|16|17|(5:18|19|21|22|23)) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(1:7)|8|9|10|(2:11|12)|14|15|16|17|(5:18|19|21|22|23)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:            r2 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:            r5 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:            r3 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:            throw new java.lang.RuntimeException(A00(59, 34, 45), r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:            r3 = e;     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(android.content.Context r15, com.facebook.ads.redexgen.X.BK<com.facebook.ads.redexgen.X.X6> r16, com.facebook.ads.redexgen.X.AJ[] r17, android.os.Handler r18, com.facebook.ads.redexgen.X.AR r19, int r20, java.util.ArrayList<com.facebook.ads.redexgen.X.XS> r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XU.A03(android.content.Context, com.facebook.ads.redexgen.X.BK, com.facebook.ads.redexgen.X.AJ[], android.os.Handler, com.facebook.ads.redexgen.X.AR, int, java.util.ArrayList):void");
    }

    private final void A04(Context context, DH dh, Looper looper, int i, ArrayList<XS> arrayList) {
        arrayList.add(new C3D(dh, looper));
    }

    private final void A05(Context context, FZ fz, Looper looper, int i, ArrayList<XS> arrayList) {
        arrayList.add(new C3B(fz, looper));
    }

    private final AJ[] A06() {
        return new AJ[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02479u
    public final XS[] A4h(Handler handler, IL il, AR ar, FZ fz, DH dh, BK<X6> bk) {
        BK<X6> bk2 = bk;
        if (bk2 == null) {
            bk2 = this.A03;
        }
        ArrayList<XS> arrayList = new ArrayList<>();
        A02(this.A02, bk2, this.A01, handler, il, this.A00, arrayList);
        A03(this.A02, bk2, A06(), handler, ar, this.A00, arrayList);
        A05(this.A02, fz, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, dh, handler.getLooper(), this.A00, arrayList);
        return (XS[]) arrayList.toArray(new XS[arrayList.size()]);
    }
}
