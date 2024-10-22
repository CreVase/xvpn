package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0868Yw extends AbstractC01154f {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public ED A00;
    public Scroller A01;
    public final AbstractC01174h A02 = new C0869Yx(this);

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC01124c abstractC01124c, int i, int i2);

    public abstract View A0D(AbstractC01124c abstractC01124c);

    public abstract int[] A0H(AbstractC01124c abstractC01124c, View view);

    static {
        A09();
    }

    private final ZB A05(AbstractC01124c abstractC01124c) {
        return A0E(abstractC01124c);
    }

    private void A07() {
        this.A00.A1l(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1k(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(AbstractC01124c abstractC01124c, int i, int i2) {
        ZB A05;
        if (!(abstractC01124c instanceof InterfaceC01234o) || (A05 = A05(abstractC01124c)) == null) {
            return false;
        }
        int A0C = A0C(abstractC01124c, i, i2);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (A0C == -1) {
            return false;
        }
        A05.A0A(A0C);
        abstractC01124c.A1L(A05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01154f
    public final boolean A0B(int i, int i2) {
        AbstractC01124c layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    @Deprecated
    public ZB A0E(AbstractC01124c abstractC01124c) {
        if (!(abstractC01124c instanceof InterfaceC01234o)) {
            return null;
        }
        return new EC(this, this.A00.getContext());
    }

    public final void A0F() {
        AbstractC01124c layoutManager;
        View A0D;
        ED ed = this.A00;
        if (ed == null || (layoutManager = ed.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1f(A0H[0], A0H[1]);
        }
    }

    public final void A0G(ED ed) throws IllegalStateException {
        ED ed2 = this.A00;
        if (ed2 == ed) {
            return;
        }
        if (ed2 != null) {
            A07();
        }
        this.A00 = ed;
        if (ed != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
