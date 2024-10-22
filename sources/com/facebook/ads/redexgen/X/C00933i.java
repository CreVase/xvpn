package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00933i {
    public static final InterfaceC00923h A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new EH();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new EI();
        } else {
            A01 = new ZG();
        }
    }

    public C00933i() {
        this.A00 = A01.AAC(this);
    }

    public C00933i(Object obj) {
        this.A00 = obj;
    }

    public final C00913g A00(int i) {
        return null;
    }

    public final C00913g A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C00913g> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}
