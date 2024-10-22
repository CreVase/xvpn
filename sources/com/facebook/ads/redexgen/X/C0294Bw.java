package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Bw */
/* loaded from: assets/audience_network.dex */
public final class C0294Bw {
    public static byte[] A0h;
    public static String[] A0i = {"IyltKROI0dONAvxCzSFxMMbap986o", "mujPYAYhkPmTBtOccd1mpeNR", "0Po3ACznS97z3RfgrsPeIGcIu3WtX", "Uu0n9DuNw1LDS1xbXky22YF4xgkhplY6", "LMa7o3DPVrMB0USQzYMxMUIDtj36p7Zv", "YQocGDdhEprGCVrh1x2f0Ac7ybbPw1BN", "b3mlxzrKdW1g7zcxBPM3qbO1DSwndDSh", "Ser"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public C0287Bl A0V;
    public InterfaceC0288Bm A0W;
    public Bx A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<String, List<byte[]>> A00(C0420Hh c0420Hh) throws C02309d {
        try {
            c0420Hh.A0Z(16);
            long A0K = c0420Hh.A0K();
            if (A0K == 1482049860) {
                return new Pair<>(A01(881, 10, 51), null);
            }
            if (A0K != 826496599) {
                Log.w(A01(283, 17, 0), A01(419, 51, 45));
                return new Pair<>(A01(944, 15, 101), null);
            }
            byte[] bArr = c0420Hh.A00;
            for (int A06 = c0420Hh.A06() + 20; A06 < bArr.length - 4; A06++) {
                if (bArr[A06] == 0 && bArr[A06 + 1] == 0 && bArr[A06 + 2] == 1 && bArr[A06 + 3] == 15) {
                    return new Pair<>(A01(934, 10, 127), Collections.singletonList(Arrays.copyOfRange(bArr, A06, bArr.length)));
                }
            }
            throw new C02309d(A01(238, 45, 91));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C02309d(A01(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 33, 14));
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0i;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0i[5] = "YLAPK4AntFjLAXIjsqe57SorlZ7T8mVd";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
            i4++;
        }
    }

    public static void A04() {
        A0h = new byte[]{40, 38, 85, 99, 114, 114, 111, 104, 97, 38, 107, 111, 107, 99, 82, Byte.MAX_VALUE, 118, 99, 38, 114, 105, 38, 17, 15, 17, 17, 19, 64, 94, 64, 66, 50, 103, 121, 98, 114, 117, 82, 76, 87, 71, 64, 60, 86, 75, 67, 65, 86, 64, 64, 56, 38, 61, 45, 42, 86, 53, 54, 42, 42, 53, 60, 42, 42, 18, 12, 22, 18, 16, 96, 125, 99, 122, 112, 125, Byte.MAX_VALUE, 59, 37, 55, 42, 63, 61, 85, 54, 72, 23, 9, 27, 6, 19, 17, 121, 26, 101, 67, 93, 79, 81, 45, 67, 65, 79, 101, 123, 107, 116, 113, 119, 83, 77, 66, 81, 95, 61, 91, 92, 70, 61, 94, 91, 70, 75, 85, 94, 88, 95, 79, 66, 78, 17, 15, 6, 31, 2, 18, 25, 3, 67, 116, 116, 105, 116, 38, 118, 103, 116, 117, 111, 104, 97, 38, 64, 105, 115, 116, 69, 69, 38, 118, 116, 111, 112, 103, 114, 99, 38, 98, 103, 114, 103, 93, 106, 106, 119, 106, 56, 104, 121, 106, 107, 113, 118, Byte.MAX_VALUE, 56, 85, 75, 55, 89, 91, 85, 56, 123, 119, 124, 125, 123, 56, 104, 106, 113, 110, 121, 108, 125, 117, 66, 66, 95, 66, 16, 64, 81, 66, 67, 89, 94, 87, 16, 70, 95, 66, 82, 89, 67, 16, 83, 95, 84, 85, 83, 16, 64, 66, 89, 70, 81, 68, 85, 21, 50, 58, 63, 54, 55, 115, 39, 60, 115, 53, 58, 61, 55, 115, 21, 60, 38, 33, 16, 16, 115, 5, 16, 98, 115, 58, 61, 58, 39, 58, 50, 63, 58, 41, 50, 39, 58, 60, 61, 115, 55, 50, 39, 50, 69, 105, 124, 122, 103, 123, 99, 105, 77, 112, 124, 122, 105, 107, 124, 103, 122, 0, 33, 32, 99, 30, 13, 3, 110, 3, 29, 97, 15, 13, 3, 110, 39, 61, 110, 59, 32, 61, 59, 62, 62, 33, 60, 58, 43, 42, 96, 110, 29, 43, 58, 58, 39, 32, 41, 110, 35, 39, 35, 43, 26, 55, 62, 43, 110, 58, 33, 110, 126, 114, 105, 123, 111, 126, 120, 111, 46, 34, 53, 57, 48, 43, 82, 45, 58, 46, 82, 94, 85, 68, 89, 85, 46, 64, 82, 82, 48, 60, 55, 38, 59, 55, 76, 54, 55, 37, 91, 18, 30, 23, 14, 3, 18, 20, 3, 53, 14, 5, 24, 16, 5, 3, 20, 5, 4, 64, 45, 41, 45, 37, 64, 20, 25, 16, 5, 78, 112, 75, 78, 75, 74, 82, 75, 5, 99, 74, 80, 87, 102, 102, 11, 5, 118, 64, 81, 81, 76, 75, 66, 5, 72, 76, 72, 64, 113, 92, 85, 64, 5, 81, 74, 5, 83, 76, 65, 64, 74, 10, 93, 8, 80, 75, 78, 75, 74, 82, 75, 19, 40, 52, 35, 37, 41, 33, 40, 47, 60, 35, 34, 102, 37, 41, 34, 35, 37, 102, 47, 34, 35, 40, 50, 47, 32, 47, 35, 52, 104, 120, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 13, 125, 110, 96, 13, 79, 68, 89, 13, 73, 72, 93, 89, 69, 23, 13, 34, 43, 57, 36, 49, 51, 70, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 43, 58, 47, 38, 52, 41, 60, 62, 77, 86, 48, 42, 54, 86, 56, 42, 41, 116, 125, 111, 114, 103, 101, 22, 13, 107, 113, 109, 13, 99, 116, 97, 102, 111, 125, 96, 117, 119, 4, 31, 121, 99, Byte.MAX_VALUE, 31, 99, 96, 108, 101, 119, 106, Byte.MAX_VALUE, 125, 114, 21, 115, 105, 117, 21, 114, Byte.MAX_VALUE, 108, 121, 123, 114, 96, 126, 2, 123, 107, 122, 2, 107, 98, 120, Byte.MAX_VALUE, 110, 110, 94, 87, 92, 64, 77, 71, 90, 73, 14, 7, 14, 8, 96, 109, 100, 109, 107, 2, 89, 72, 72, 84, 81, 91, 89, 76, 81, 87, 86, 23, 92, 78, 90, 75, 77, 90, 75, 124, 109, 109, 113, 116, 126, 124, 105, 116, 114, 115, 50, 109, 122, 110, 31, 14, 14, 18, 23, 29, 31, 10, 23, 17, 16, 81, 8, 17, 28, 13, 11, 28, 16, 1, 1, 29, 24, 18, 16, 5, 24, 30, 31, 94, 9, 92, 2, 4, 19, 3, 24, 1, 115, 103, 118, 123, 125, 61, 115, 113, 33, 23, 3, 18, 31, 25, 89, 19, 23, 21, 69, 83, 71, 86, 91, 93, 29, 84, 94, 83, 81, 118, 98, 115, 126, 120, 56, 122, 103, 35, 118, 58, 123, 118, 99, 122, 18, 6, 23, 26, 28, 92, 30, 3, 22, 20, 70, 82, 67, 78, 72, 8, 74, 87, 66, 64, 10, 107, 21, 68, 80, 65, 76, 74, 10, 74, 85, 80, 86, 37, 49, 32, 45, 43, 107, 54, 37, 51, 34, 54, 39, 42, 44, 108, 55, 49, 54, 38, 110, 43, 39, 3, 23, 6, 11, 13, 77, 20, 12, 6, 76, 6, 22, 17, 123, 111, 126, 115, 117, 53, 108, 116, 126, 52, 126, 110, 105, 52, 114, 126, 120, 108, 125, 112, 118, 54, 111, 118, 107, 123, 112, 106, 101, 113, 96, 109, 107, 43, 124, 41, 113, 106, 111, 106, 107, 115, 106, 5, 14, 7, 125, 108, 113, 125, 38, 113, 36, 122, 122, 104, 77, 82, 95, 94, 84, 20, 8, 92, 75, 75, 22, 9, 4, 5, 15, 79, 1, 22, 3, 121, 102, 107, 106, 96, 32, 103, 106, 121, 108, 104, 119, 122, 123, 113, 49, 115, 110, 42, 104, 51, 123, 109, 103, 120, 117, 116, 126, 62, 124, 97, 116, 118, 35, 1, 30, 19, 18, 24, 88, 0, 1, 20, 70, 27, 4, 9, 8, 2, 66, 21, 64, 24, 3, 6, 3, 2, 26, 3, 69, 90, 87, 86, 92, 28, 75, 30, 69, 93, 87, 29, 92, 93, 1, 29, 69, 67, 11, 109, 114, Byte.MAX_VALUE, 126, 116, 52, 99, 54, 109, 117, Byte.MAX_VALUE, 53, 116, 117, 41, 53, 109, 107, 34};
    }

    static {
        A04();
    }

    public C0294Bw() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 104);
    }

    public /* synthetic */ C0294Bw(C0810Wq c0810Wq) {
        this();
    }

    public static /* synthetic */ String A02(C0294Bw c0294Bw, String str) {
        c0294Bw.A0g = str;
        return str;
    }

    public static List<byte[]> A03(byte[] bArr) throws C02309d {
        String A01 = A01(204, 34, 56);
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                if (A0i[5].charAt(0) != 'Y') {
                    throw new RuntimeException();
                }
                A0i[6] = "t9W1bu55HCX38CTD9AnwpVMfQcluPXu3";
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int vorbisInfoLength = i3 + 1;
                int i6 = i5 + bArr[i3];
                if (bArr[vorbisInfoLength] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, vorbisInfoLength, bArr2, 0, i4);
                    int vorbisInfoLength2 = vorbisInfoLength + i4;
                    if (bArr[vorbisInfoLength2] == 3) {
                        int vorbisInfoLength3 = vorbisInfoLength2 + i6;
                        if (bArr[vorbisInfoLength3] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength3];
                            System.arraycopy(bArr, vorbisInfoLength3, bArr3, 0, bArr.length - vorbisInfoLength3);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C02309d(A01);
                    }
                    throw new C02309d(A01);
                }
                throw new C02309d(A01);
            }
            throw new C02309d(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C02309d(A01);
        }
    }

    public static boolean A05(C0420Hh c0420Hh) throws C02309d {
        UUID uuid;
        UUID uuid2;
        try {
            int A0C = c0420Hh.A0C();
            if (A0C == 1) {
                return true;
            }
            if (A0C != 65534) {
                return false;
            }
            c0420Hh.A0Y(24);
            long A0L = c0420Hh.A0L();
            uuid = C0808Wo.A0s;
            long mostSignificantBits = uuid.getMostSignificantBits();
            if (A0i[0].length() != 29) {
                throw new RuntimeException();
            }
            A0i[6] = "mXDtn5ZrlLpOkU84k9DC3Hi3Pcorcpog";
            if (A0L == mostSignificantBits) {
                long A0L2 = c0420Hh.A0L();
                uuid2 = C0808Wo.A0s;
                if (A0L2 == uuid2.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C02309d(A01(170, 34, 16));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f) {
            return null;
        }
        float f = this.A07;
        if (A0i[6].charAt(11) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0i;
        strArr[2] = "PBvrZHKgmU2uAVRQDCT9n0bIRHOqM";
        strArr[1] = "guZt3O6voa6ads6nTVRQaZ05";
        if (f == -1.0f || this.A04 == -1.0f) {
            return null;
        }
        float f2 = this.A05;
        if (A0i[7].length() != 6) {
            String[] strArr2 = A0i;
            strArr2[2] = "PayVPjYQSmFvrGG0qfp7CT6HXa6Ad";
            strArr2[1] = "9Xa9tASZMquPJJBB3AwdoWSz";
            if (f2 == -1.0f) {
                return null;
            }
        } else if (f2 == -1.0f) {
            return null;
        }
        if (this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0K);
        hdrStaticInfo.putShort((short) this.A0L);
        return bArr;
    }

    public final void A07() {
        Bx bx = this.A0X;
        if (bx != null) {
            bx.A02(this);
        }
    }

    public final void A08() {
        Bx bx = this.A0X;
        if (bx != null) {
            bx.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0152, code lost:            if (r9.equals(A01(390, 4, 43)) != false) goto L270;     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0154, code lost:            r11 = 26;     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x016b, code lost:            if (r9.equals(A01(390, 8, 73)) != false) goto L270;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x064c, code lost:            if (r8 != false) goto L398;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x064e, code lost:            r3 = 1;        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(java.lang.Integer.toString(r31), r15, null, -1, r18, r29.A0B, r29.A0O, r21, r1, r29.A0U, r2, r29.A0g);     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x028e, code lost:            if (r9.equals(A01(379, 11, 107)) != false) goto L316;     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0290, code lost:            r11 = 24;     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x029e, code lost:            if (r9.equals(A01(379, 11, 107)) != false) goto L316;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x068b, code lost:            if (com.facebook.ads.redexgen.X.C0413Ha.A0B(r15) == false) goto L424;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x068d, code lost:            r3 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0690, code lost:            if (r29.A0H != 0) goto L415;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0692, code lost:            r2 = r29.A0I;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0694, code lost:            if (r2 != (-1)) goto L411;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0696, code lost:            r2 = r29.A0R;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0698, code lost:            r29.A0I = r2;        r2 = r29.A0G;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x069c, code lost:            if (r2 != (-1)) goto L414;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x069e, code lost:            r2 = r29.A0J;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x06a0, code lost:            r29.A0G = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x06a2, code lost:            r8 = -1.0f;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x06a6, code lost:            if (r29.A0I == (-1)) goto L420;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x06aa, code lost:            if (r29.A0G == (-1)) goto L420;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x06ac, code lost:            r8 = (r29.A0J * r5) / (r29.A0R * r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x06b5, code lost:            r7 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x06b8, code lost:            if (r29.A0b == false) goto L423;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x06ba, code lost:            r7 = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(r29.A0D, r29.A0C, r29.A0E, A06());     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x06c9, code lost:            r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(r31), r15, null, -1, r18, r29.A0R, r29.A0J, -1.0f, r1, -1, r8, r29.A0e, r29.A0P, r7, r29.A0U);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0703, code lost:            if (A01(693, 20, 121).equals(r15) == false) goto L427;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0705, code lost:            r3 = 3;        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(r31), r15, r2, r29.A0g, r29.A0U);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0714, code lost:            r7 = A01(871, 10, 1);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0729, code lost:            if (com.facebook.ads.redexgen.X.C0294Bw.A0i[4].charAt(3) == '7') goto L432;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x072f, code lost:            if (r7.equals(r15) == false) goto L435;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0731, code lost:            r3 = 3;        r5 = new java.util.ArrayList(2);        r1 = com.facebook.ads.redexgen.X.C0808Wo.A0t;        r5.add(r1);        r5.add(r29.A0d);        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(r31), r15, null, -1, r2, r29.A0g, -1, r29.A0U, Long.MAX_VALUE, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x077b, code lost:            if (A01(675, 18, 118).equals(r15) != false) goto L441;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x078b, code lost:            if (A01(660, 15, 21).equals(r15) != false) goto L441;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x079b, code lost:            if (A01(641, 19, 48).equals(r15) == false) goto L442;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x07c2, code lost:            throw new com.facebook.ads.redexgen.X.C02309d(A01(398, 21, 104));     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x079d, code lost:            r3 = 3;        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(r31), r15, null, -1, r2, r1, r29.A0g, r29.A0U);     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x075f, code lost:            com.facebook.ads.redexgen.X.C0294Bw.A0i[3] = "f7sm5I7gZdCZUZkEBQd8yi8YhLy9ImnH";     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x076a, code lost:            if (r7.equals(r15) == false) goto L435;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0684, code lost:            if (r8 != false) goto L398;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(com.facebook.ads.redexgen.X.InterfaceC0280Bc r30, int r31) throws com.facebook.ads.redexgen.X.C02309d {
        /*
            Method dump skipped, instructions count: 2168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0294Bw.A09(com.facebook.ads.redexgen.X.Bc, int):void");
    }
}
