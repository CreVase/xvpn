package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00090a extends C00110c {
    @Override // com.facebook.ads.redexgen.X.C3G
    public final C3Y A08(View view, C3Y c3y) {
        WindowInsets result = (WindowInsets) C3Y.A01(c3y);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3Y.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final C3Y A09(View view, C3Y c3y) {
        WindowInsets result = (WindowInsets) C3Y.A01(c3y);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3Y.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A0F(View view, final AnonymousClass31 anonymousClass31) {
        if (anonymousClass31 == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3F
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C3Y compatInsets = anonymousClass31.AAV(view2, C3Y.A00(windowInsets));
                    return (WindowInsets) C3Y.A01(compatInsets);
                }
            });
        }
    }
}
