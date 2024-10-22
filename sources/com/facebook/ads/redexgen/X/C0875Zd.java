package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0875Zd implements C2L {
    public final SharedPreferences.Editor A00;

    public C0875Zd(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C0875Zd A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C0875Zd A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
