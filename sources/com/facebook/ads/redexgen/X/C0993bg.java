package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0993bg<ModelType, StateType> {
    public static byte[] A06;
    public static String[] A07 = {"K3IBH5IY5D9A1s0otTNJJ1EDvo1qLs", "HR7iyfZ1MOS5huP42RSdRpCkeBunQMOf", "", "bEqFTGguyIKgMYqaAFudqvCpFKGvMgpm", "3wGEEC73gwsSkVWXWqLxZk", "wIAJ3aMEmj6qTKsV0aDgjtipvoJzkW0C", "SCvpsyQDnQo4JnEbtI83SB", "GSqpB1BwT3x"};
    public static final C0993bg A08;
    public boolean A00;
    public final C0993bg A01;
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final List<InterfaceC0996bj<ModelType, StateType>> A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A08 = new C0993bg(null, null, A01(0, 5, 123), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0993bg(com.facebook.ads.redexgen.X.C0994bh<ModelType, StateType> r7) {
        /*
            r6 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.X.C0994bh.A01(r7)
            java.lang.Object r2 = com.facebook.ads.redexgen.X.C0994bh.A02(r7)
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0994bh.A03(r7)
            java.util.List r0 = com.facebook.ads.redexgen.X.C0994bh.A04(r7)
            if (r0 != 0) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            com.facebook.ads.redexgen.X.bg r5 = com.facebook.ads.redexgen.X.C0994bh.A00(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            java.util.List r4 = com.facebook.ads.redexgen.X.C0994bh.A04(r7)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0993bg.<init>(com.facebook.ads.redexgen.X.bh):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C0993bg(ModelType model, StateType state, String str, List<InterfaceC0996bj<ModelType, StateType>> list, C0993bg c0993bg) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
        this.A01 = c0993bg;
        this.A00 = false;
        this.A05 = list;
    }

    public static <ModelType, StateType> C0994bh<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C0994bh<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bj != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC0982bV interfaceC0982bV) {
        Iterator<InterfaceC0996bj<ModelType, StateType>> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().A5X(this, interfaceC0982bV);
        }
        EnumC0983bW A8A = interfaceC0982bV.A8A(this);
        String[] strArr = A07;
        if (strArr[1].charAt(23) == strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "xMDdEaQw2xH";
        strArr2[2] = "";
        if (A8A == EnumC0983bW.A02) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A00;
    }
}
