package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VQ implements FW {
    public static byte[] A04;
    public final int A00;
    public final List<VR> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{19};
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VQ(java.util.List<com.facebook.ads.redexgen.X.VR> r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A01 = r8
            int r0 = r8.size()
            r7.A00 = r0
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A02 = r0
            r6 = 0
        L12:
            int r0 = r7.A00
            if (r6 >= r0) goto L2f
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.VR r5 = (com.facebook.ads.redexgen.X.VR) r5
            int r4 = r6 * 2
            long[] r2 = r7.A02
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A02
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L12
        L2f:
            long[] r1 = r7.A02
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A03 = r0
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VQ.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final List<FV> A6T(long j) {
        ArrayList arrayList = null;
        VR vr = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                VR vr2 = this.A01.get(i);
                if (vr2.A00()) {
                    if (vr == null) {
                        vr = vr2;
                    } else {
                        String A00 = A00(0, 1, 53);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(vr.A0C).append((CharSequence) A00).append(vr2.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(vr2.A0C);
                        }
                    }
                } else {
                    arrayList.add(vr2);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new VR(normalCueTextBuilder));
        } else if (vr != null) {
            arrayList.add(vr);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final long A6t(int i) {
        boolean z = true;
        HI.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        HI.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A6u() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final int A7L(long j) {
        int A0A = C0436Hx.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
