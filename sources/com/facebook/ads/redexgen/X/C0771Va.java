package com.facebook.ads.redexgen.X;

import android.text.Layout;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0771Va extends FV implements Comparable<C0771Va> {
    public final int A00;

    public C0771Va(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.A00 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0771Va c0771Va) {
        int i = c0771Va.A00;
        int i2 = this.A00;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }
}
