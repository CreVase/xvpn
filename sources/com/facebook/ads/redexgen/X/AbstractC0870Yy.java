package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0870Yy extends C4Y {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC01294u abstractC01294u);

    public abstract boolean A0S(AbstractC01294u abstractC01294u);

    public abstract boolean A0T(AbstractC01294u abstractC01294u, int i, int i2, int i3, int i4);

    public abstract boolean A0U(AbstractC01294u abstractC01294u, AbstractC01294u abstractC01294u2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final boolean A0D(AbstractC01294u abstractC01294u) {
        return !this.A00 || abstractC01294u.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final boolean A0E(AbstractC01294u abstractC01294u, C4X c4x, C4X c4x2) {
        if (c4x != null && (c4x.A01 != c4x2.A01 || c4x.A03 != c4x2.A03)) {
            return A0T(abstractC01294u, c4x.A01, c4x.A03, c4x2.A01, c4x2.A03);
        }
        return A0R(abstractC01294u);
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final boolean A0F(AbstractC01294u abstractC01294u, C4X c4x, C4X c4x2) {
        int i = c4x.A01;
        int i2 = c4x.A03;
        View view = abstractC01294u.A0H;
        int oldLeft = c4x2 == null ? view.getLeft() : c4x2.A01;
        int oldTop = c4x2 == null ? view.getTop() : c4x2.A03;
        if (!abstractC01294u.A0c() && (i != oldLeft || i2 != oldTop)) {
            view.layout(oldLeft, oldTop, view.getWidth() + oldLeft, view.getHeight() + oldTop);
            return A0T(abstractC01294u, i, i2, oldLeft, oldTop);
        }
        return A0S(abstractC01294u);
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final boolean A0G(AbstractC01294u abstractC01294u, C4X c4x, C4X c4x2) {
        if (c4x.A01 != c4x2.A01 || c4x.A03 != c4x2.A03) {
            return A0T(abstractC01294u, c4x.A01, c4x.A03, c4x2.A01, c4x2.A03);
        }
        A0O(abstractC01294u);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final boolean A0H(AbstractC01294u abstractC01294u, AbstractC01294u abstractC01294u2, C4X c4x, C4X c4x2) {
        int fromTop;
        int toLeft;
        int i = c4x.A01;
        int fromLeft = c4x.A03;
        if (abstractC01294u2.A0h()) {
            fromTop = c4x.A01;
            toLeft = c4x.A03;
        } else {
            fromTop = c4x2.A01;
            toLeft = c4x2.A03;
        }
        int toTop = A01[1].length();
        if (toTop != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC01294u, abstractC01294u2, i, fromLeft, fromTop, toLeft);
    }

    public final void A0N(AbstractC01294u abstractC01294u) {
        A0C(abstractC01294u);
    }

    public final void A0O(AbstractC01294u abstractC01294u) {
        A0C(abstractC01294u);
    }

    public final void A0P(AbstractC01294u abstractC01294u) {
        A0C(abstractC01294u);
    }

    public final void A0Q(AbstractC01294u abstractC01294u, boolean z) {
        A0C(abstractC01294u);
    }
}
