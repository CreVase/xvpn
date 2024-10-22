package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0840Xu implements InterfaceC0486Jy {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0486Jy
    public final void AEc(Throwable th, Object obj) {
        if (obj instanceof C7P) {
            YA adContext = ((C7P) obj).A5p();
            if (adContext != null) {
                adContext.A0I(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof YA)) {
            return;
        }
        ((YA) context).A0I(th);
    }
}
