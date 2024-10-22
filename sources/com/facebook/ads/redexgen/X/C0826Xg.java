package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0826Xg implements C8P {
    public final /* synthetic */ String[] A00;

    public C0826Xg(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.X.C8P
    public final boolean A2V(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
