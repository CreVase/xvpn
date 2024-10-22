package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0378Fp {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", "", "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C0370Fh A04;
    public final C0371Fi A05;
    public final C0377Fo A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0370Fh A04(C0419Hg c0419Hg, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i2 = 8;
        int A045 = c0419Hg.A04(8);
        c0419Hg.A08(8);
        int i3 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int A046 = c0419Hg.A04(i2);
            int A047 = c0419Hg.A04(i2);
            int i4 = i3 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = c0419Hg.A04(i2);
                A042 = c0419Hg.A04(i2);
                A043 = c0419Hg.A04(i2);
                A044 = c0419Hg.A04(i2);
                i3 = i4 - 4;
            } else {
                A04 = c0419Hg.A04(6) << 2;
                A042 = c0419Hg.A04(4) << 4;
                A043 = c0419Hg.A04(4) << 4;
                A044 = c0419Hg.A04(2) << 6;
                i3 = i4 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), C0436Hx.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), C0436Hx.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), C0436Hx.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i2 = 8;
        }
        return new C0370Fh(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0371Fi A05(C0419Hg c0419Hg) {
        int i;
        int i2;
        int i3;
        int i4;
        c0419Hg.A08(4);
        boolean A0F = c0419Hg.A0F();
        c0419Hg.A08(3);
        int A04 = c0419Hg.A04(16);
        int A042 = c0419Hg.A04(16);
        if (A0F) {
            i = c0419Hg.A04(16);
            i4 = c0419Hg.A04(16);
            i2 = c0419Hg.A04(16);
            i3 = c0419Hg.A04(16);
        } else {
            i = 0;
            i2 = 0;
            i3 = A042;
            i4 = A04;
        }
        return new C0371Fi(A04, A042, i, i4, i2, i3);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 27
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0375Fm A08(C0419Hg c0419Hg, int i) {
        int i2 = 8;
        int A04 = c0419Hg.A04(8);
        c0419Hg.A08(4);
        boolean A0F = c0419Hg.A0F();
        c0419Hg.A08(3);
        int A042 = c0419Hg.A04(16);
        int A043 = c0419Hg.A04(16);
        int A044 = c0419Hg.A04(3);
        int A045 = c0419Hg.A04(3);
        c0419Hg.A08(2);
        int A046 = c0419Hg.A04(8);
        int A047 = c0419Hg.A04(8);
        int A048 = c0419Hg.A04(4);
        int A049 = c0419Hg.A04(2);
        c0419Hg.A08(2);
        int i3 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int A0410 = c0419Hg.A04(16);
            int A0411 = c0419Hg.A04(2);
            int A0412 = c0419Hg.A04(2);
            int A0413 = c0419Hg.A04(12);
            c0419Hg.A08(4);
            int A0414 = c0419Hg.A04(12);
            i3 -= 6;
            int i4 = 0;
            int i5 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i4 = c0419Hg.A04(i2);
                i5 = c0419Hg.A04(i2);
                i3 -= 2;
            }
            sparseArray.put(A0410, new C0376Fn(A0411, A0412, A0413, A0414, i4, i5));
            i2 = 8;
        }
        return new C0375Fm(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{18, 55, 34, 55, 118, 48, 63, 51, 58, 50, 118, 58, 51, 56, 49, 34, 62, 118, 51, 46, 53, 51, 51, 50, 37, 118, 58, 63, 59, 63, 34, 106, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final List<FV> A0I(byte[] bArr, int i) {
        C0419Hg c0419Hg = new C0419Hg(bArr, i);
        while (c0419Hg.A01() >= 48 && c0419Hg.A04(8) == 15) {
            A0C(c0419Hg, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        C0371Fi c0371Fi = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c0371Fi.A05 + 1 != this.A00.getWidth() || c0371Fi.A00 + 1 != this.A00.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0371Fi.A05 + 1, c0371Fi.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            this.A01.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C0374Fl> sparseArray = this.A06.A01.A03;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C0374Fl valueAt = sparseArray.valueAt(i2);
            C0375Fm c0375Fm = this.A06.A08.get(sparseArray.keyAt(i2));
            int i3 = valueAt.A00 + c0371Fi.A02;
            int i4 = valueAt.A01 + c0371Fi.A04;
            this.A01.clipRect(i3, i4, Math.min(c0375Fm.A08 + i3, c0371Fi.A01), Math.min(c0375Fm.A02 + i4, c0371Fi.A03), Region.Op.REPLACE);
            C0370Fh c0370Fh = this.A06.A06.get(c0375Fm.A00);
            if (c0370Fh == null && (c0370Fh = this.A06.A04.get(c0375Fm.A00)) == null) {
                c0370Fh = this.A04;
            }
            SparseArray<C0376Fn> sparseArray2 = c0375Fm.A09;
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                int keyAt = sparseArray2.keyAt(i5);
                C0376Fn valueAt2 = sparseArray2.valueAt(i5);
                C0372Fj c0372Fj = this.A06.A07.get(keyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (c0372Fj == null) {
                    c0372Fj = this.A06.A05.get(keyAt);
                }
                if (c0372Fj != null) {
                    A0B(c0372Fj, c0370Fh, c0375Fm.A01, i3 + valueAt2.A02, i4 + valueAt2.A05, c0372Fj.A01 ? null : this.A02, this.A01);
                }
            }
            if (c0375Fm.A0A) {
                this.A03.setColor(c0375Fm.A01 == 3 ? c0370Fh.A03[c0375Fm.A07] : c0375Fm.A01 == 2 ? c0370Fh.A02[c0375Fm.A06] : c0370Fh.A01[c0375Fm.A05]);
                this.A01.drawRect(i3, i4, c0375Fm.A08 + i3, c0375Fm.A02 + i4, this.A03);
            }
            arrayList.add(new FV(Bitmap.createBitmap(this.A00, i3, i4, c0375Fm.A08, c0375Fm.A02), i3 / c0371Fi.A05, 0, i4 / c0371Fi.A00, 0, c0375Fm.A08 / c0371Fi.A05, c0375Fm.A02 / c0371Fi.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0378Fp(int i, int i2) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0371Fi(719, 575, 0, 719, 0, 575);
        this.A04 = new C0370Fh(0, A0F(), A0G(), A0H());
        this.A06 = new C0377Fo(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C0419Hg c0419Hg, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int i4 = 0;
            int A04 = c0419Hg.A04(2);
            if (A04 != 0) {
                i4 = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
            } else if (c0419Hg.A0F()) {
                i4 = c0419Hg.A04(3) + 3;
                A04 = c0419Hg.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c0419Hg.A0F()) {
                i4 = 1;
                A04 = 0;
            } else {
                switch (c0419Hg.A04(2)) {
                    case 0:
                        z = true;
                        A04 = 0;
                        break;
                    case 1:
                        i4 = 2;
                        A04 = 0;
                        break;
                    case 2:
                        i4 = c0419Hg.A04(4) + 12;
                        A04 = c0419Hg.A04(2);
                        break;
                    case 3:
                        i4 = c0419Hg.A04(8) + 29;
                        if (A08[1].length() == 29) {
                            A08[5] = "eZC8v48u";
                            A04 = c0419Hg.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + i4, i2 + 1, paint);
            }
            i3 += i4;
        } while (!z);
        return i3;
    }

    public static int A02(C0419Hg c0419Hg, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int peek = 0;
            int A04 = c0419Hg.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!c0419Hg.A0F()) {
                int A042 = c0419Hg.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z = true;
                    A04 = 0;
                }
            } else if (!c0419Hg.A0F()) {
                peek = c0419Hg.A04(2) + 4;
                A04 = c0419Hg.A04(4);
            } else {
                switch (c0419Hg.A04(2)) {
                    case 0:
                        peek = 1;
                        if (A08[1].length() == 29) {
                            String[] strArr = A08;
                            strArr[3] = "b";
                            strArr[4] = "RKCQrML1KI9i2rbeBXbE06C32ORX";
                            A04 = 0;
                            break;
                        } else {
                            A04 = 0;
                            break;
                        }
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = c0419Hg.A04(4) + 9;
                        A04 = c0419Hg.A04(4);
                        break;
                    case 3:
                        peek = c0419Hg.A04(8) + 25;
                        String[] strArr2 = A08;
                        if (strArr2[3].length() == strArr2[4].length()) {
                            throw new RuntimeException();
                        }
                        A08[6] = "tDVEwF5JbpPt";
                        A04 = c0419Hg.A04(4);
                        break;
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                float f = i3;
                float f2 = i2;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f, f2, i3 + peek, i2 + 1, paint);
            }
            i3 += peek;
        } while (!z);
        return i3;
    }

    public static int A03(C0419Hg c0419Hg, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int clutIndex;
        int i3 = i;
        boolean z = false;
        do {
            int A04 = c0419Hg.A04(8);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!c0419Hg.A0F()) {
                clutIndex = c0419Hg.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    A04 = 0;
                } else {
                    z = true;
                    clutIndex = 0;
                    A04 = 0;
                }
            } else {
                clutIndex = c0419Hg.A04(7);
                A04 = c0419Hg.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + clutIndex, i2 + 1, paint);
            }
            i3 += clutIndex;
        } while (!z);
        return i3;
    }

    public static C0372Fj A06(C0419Hg c0419Hg) {
        int A04 = c0419Hg.A04(16);
        c0419Hg.A08(4);
        int objectId = c0419Hg.A04(2);
        boolean A0F = c0419Hg.A0F();
        c0419Hg.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c0419Hg.A04(8);
            c0419Hg.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c0419Hg.A04(16);
            int objectId2 = c0419Hg.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c0419Hg.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c0419Hg.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new C0372Fj(A04, A0F, bArr, bArr2);
    }

    public static C0373Fk A07(C0419Hg c0419Hg, int i) {
        int A04 = c0419Hg.A04(8);
        int A042 = c0419Hg.A04(4);
        int A043 = c0419Hg.A04(2);
        c0419Hg.A08(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int remainingLength = c0419Hg.A04(8);
            c0419Hg.A08(8);
            int version = c0419Hg.A04(16);
            int timeoutSecs = c0419Hg.A04(16);
            i2 -= 6;
            sparseArray.put(remainingLength, new C0374Fl(version, timeoutSecs));
        }
        return new C0373Fk(A04, A042, A043, sparseArray);
    }

    public static void A0B(C0372Fj c0372Fj, C0370Fh c0370Fh, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0370Fh.A03;
        } else {
            if (A08[2].length() == 20) {
                throw new RuntimeException();
            }
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i == 2) {
                iArr = c0370Fh.A02;
            } else {
                iArr = c0370Fh.A01;
            }
        }
        A0D(c0372Fj.A03, iArr, i, i2, i3, paint, canvas);
        A0D(c0372Fj.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:            if (r0 != 0) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:            r7.A01 = r4;        r7.A08.clear();        r7.A06.clear();        r7.A07.clear();     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:            if (r5 == null) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:            r1 = r5.A02;        r0 = r4.A02;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:            if (r1 == r0) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:            r7.A01 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:            if (r0 != 0) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(com.facebook.ads.redexgen.X.C0419Hg r6, com.facebook.ads.redexgen.X.C0377Fo r7) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0378Fp.A0C(com.facebook.ads.redexgen.X.Hg, com.facebook.ads.redexgen.X.Fo):void");
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i3;
        C0419Hg c0419Hg = new C0419Hg(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i2;
        while (c0419Hg.A01() != 0) {
            switch (c0419Hg.A04(8)) {
                case 16:
                    if (i == 3) {
                        clutMapTable4To82 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i == 2) {
                        clutMapTable4To82 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To82 = null;
                        if (A08[5].length() == 5) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[0] = "aCQdDxqS2bkmSWw219FL9FrVQLNlGxjh";
                        strArr[7] = "CXVqOrR1KNECyNPiemwICdwFVxmD3XsB";
                    }
                    if (A08[5].length() == 5) {
                        throw new RuntimeException();
                    }
                    A08[1] = "sxwfPuAvCy0meNXm9qprXKFgJpDmZ";
                    column = A01(c0419Hg, iArr, clutMapTable4To82, column, line, paint, canvas);
                    c0419Hg.A05();
                    break;
                case 17:
                    if (i == 3) {
                        clutMapTable4To8 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To8 = null;
                    }
                    column = A02(c0419Hg, iArr, clutMapTable4To8, column, line, paint, canvas);
                    c0419Hg.A05();
                    break;
                case 18:
                    column = A03(c0419Hg, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c0419Hg);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c0419Hg);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c0419Hg);
                    break;
                case 240:
                    line += 2;
                    column = i2;
                    break;
            }
        }
    }

    public static byte[] A0E(int i, int i2, C0419Hg c0419Hg) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0419Hg.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i2 = i & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i3 = i2 != 0 ? 255 : 0;
                iArr[i] = A00(255, i3, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i4 = (i & 1) != 0 ? 127 : 0;
                iArr[i] = A00(255, i4, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x003c, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:            if (r4 != 0) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:            r0 = 170;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:            r0 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:            if (r4 != 0) goto L32;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0378Fp.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
