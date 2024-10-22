package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0940ai extends K8 {
    public final /* synthetic */ C0939ah A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C0940ai(C0939ah c0939ah, Map map, Map map2) {
        this.A00 = c0939ah;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        AnonymousClass12 anonymousClass12;
        YA ya;
        AnonymousClass12 anonymousClass122;
        anonymousClass12 = this.A00.A01;
        if (!TextUtils.isEmpty(anonymousClass12.A0Y())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            ya = this.A00.A09;
            InterfaceC0444If A09 = ya.A09();
            anonymousClass122 = this.A00.A01;
            A09.A9i(anonymousClass122.A0Y(), hashMap);
        }
    }
}
