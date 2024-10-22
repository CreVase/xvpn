package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.protobuf.v;

/* loaded from: assets/audience_network.dex */
public class ZN extends C00802v {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C3V A00;

    public ZN(C3V c3v) {
        this.A00 = c3v;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A05() > 1;
    }

    @Override // com.facebook.ads.redexgen.X.C00802v
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C3V.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A05());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C00802v
    public final void A08(View view, C00913g c00913g) {
        super.A08(view, c00913g);
        c00913g.A0O(C3V.class.getName());
        c00913g.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c00913g.A0N(v.DEFAULT_BUFFER_SIZE);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c00913g.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C00802v
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case v.DEFAULT_BUFFER_SIZE /* 4096 */:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                C3V c3v = this.A00;
                c3v.setCurrentItem(c3v.A00 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                C3V c3v2 = this.A00;
                int i2 = c3v2.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
                    throw new RuntimeException();
                }
                A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
                c3v2.setCurrentItem(i2 - 1);
                return true;
            default:
                return false;
        }
    }
}
