package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01344z {
    public C01314w A00 = new C01314w();
    public final InterfaceC01324x A01;

    public C01344z(InterfaceC01324x interfaceC01324x) {
        this.A01 = interfaceC01324x;
    }

    public final View A00(int i, int i2, int i3, int i4) {
        int A7T = this.A01.A7T();
        int next = this.A01.A7S();
        int childEnd = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View A6H = this.A01.A6H(i);
            int A6K = this.A01.A6K(A6H);
            int i5 = this.A01.A6J(A6H);
            this.A00.A03(A7T, next, A6K, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return A6H;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = A6H;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
