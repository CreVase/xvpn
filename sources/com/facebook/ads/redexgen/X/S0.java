package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class S0 extends AbstractC01174h {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    public OM A02;
    public C0643Qb A04;
    public List<PC> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final ZC A0C;
    public final AbstractC01244p A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final OQ A0F = new S3(this);
    public OO A03 = new S2(this);
    public final OP A0E = new S1(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, 29, 4, 7, 16, 17, 18, 29, 20, 7, 2, 3, 13, 29, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public S0(C2O c2o, int i, List<PC> list, C0643Qb c0643Qb, Bundle bundle) {
        this.A0C = c2o.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c0643Qb;
        this.A0D = new ZB(c2o.getContext());
        this.A0B = c2o.getContext();
        c2o.A1k(this);
        A0D(bundle);
    }

    private AbstractC0704Sk A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private AbstractC0704Sk A04(int i, int i2, boolean z) {
        AbstractC0704Sk abstractC0704Sk = null;
        while (i <= i2) {
            AbstractC0704Sk abstractC0704Sk2 = (AbstractC0704Sk) this.A0C.A1q(i);
            if (abstractC0704Sk2 == null || abstractC0704Sk2.A16()) {
                return null;
            }
            boolean A0b = A0b(abstractC0704Sk2);
            int i3 = A0I[2].length();
            if (i3 != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (abstractC0704Sk == null && abstractC0704Sk2.A17() && A0b && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(abstractC0704Sk2, this.A0A))) {
                abstractC0704Sk = abstractC0704Sk2;
            }
            if (abstractC0704Sk2.A17() && !A0b) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC0704Sk;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A28();
        int firstVisibleItem = this.A0C.A29();
        AbstractC0704Sk A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A14();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A27 = this.A0C.A27();
        if (A27 != -1) {
            int curPos = this.A05.size();
            if (A27 < curPos - 1) {
                int curPos2 = A27 + 1;
                A0V(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC0704Sk A04 = A04(i + 1, this.A0C.A29(), false);
        if (A04 != null) {
            A04.A14();
            A0V(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return IP.A2H(this.A0B) || this.A0A == 1;
    }

    public static boolean A0I(AbstractC0585Nv abstractC0585Nv, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i != 2) {
            allowedAreaMaxX = (int) (((abstractC0585Nv.getWidth() + C0506Ku.A03.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i2 = C0506Ku.A03.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            allowedAreaMaxX = i2 - 1;
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i3 = C0506Ku.A03.widthPixels;
            int allowedAreaMinX = abstractC0585Nv.getWidth();
            furthestX = (int) (((i3 - allowedAreaMinX) * 0.7f) / 2.0f);
        }
        float x = abstractC0585Nv.getX();
        int allowedAreaMinX2 = abstractC0585Nv.getWidth();
        return ((int) (x + ((float) allowedAreaMinX2))) <= allowedAreaMaxX && abstractC0585Nv.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC0704Sk abstractC0704Sk) {
        if (!this.A08 || !abstractC0704Sk.A17()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01174h
    public void A0L(ED ed, int i) {
        super.A0L(ed, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01174h
    public void A0M(ED ed, int i, int i2) {
        super.A0M(ed, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A28();
        int firstVisibleItem = this.A0C.A29();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0W(lastVisibleItem, firstVisibleItem, i);
    }

    public final OO A0N() {
        return this.A03;
    }

    public final OP A0O() {
        return this.A0E;
    }

    public final OQ A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int i = this.A0C.A29();
        for (int A28 = this.A0C.A28(); A28 <= i && A28 >= 0; A28++) {
            AbstractC0704Sk abstractC0704Sk = (AbstractC0704Sk) this.A0C.A1q(A28);
            if (abstractC0704Sk != null && abstractC0704Sk.A16()) {
                this.A01 = A28;
                abstractC0704Sk.A13();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC0704Sk abstractC0704Sk = (AbstractC0704Sk) this.A0C.A1q(this.A01);
        if (abstractC0704Sk != null && this.A01 >= 0) {
            abstractC0704Sk.A14();
        }
    }

    public final void A0S(int i) {
        AbstractC0704Sk abstractC0704Sk = (AbstractC0704Sk) this.A0C.A1q(i);
        if (abstractC0704Sk == null || A0b(abstractC0704Sk)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0a(abstractC0704Sk, false);
    }

    public final void A0T(int i) {
        List<PC> list;
        AbstractC0704Sk abstractC0704Sk = (AbstractC0704Sk) this.A0C.A1q(i);
        if (abstractC0704Sk == null) {
            return;
        }
        if (A0b(abstractC0704Sk)) {
            A0a(abstractC0704Sk, true);
        }
        if (A0J(abstractC0704Sk) && (list = this.A05) != null) {
            this.A0F.setVolume(list.get(((Integer) abstractC0704Sk.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i) {
        A0A(i, i);
    }

    public final void A0V(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0W(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A27();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AG4(recomputeFrom);
    }

    public final void A0X(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Z(OM om) {
        this.A02 = om;
    }

    public void A0a(AbstractC0704Sk abstractC0704Sk, boolean z) {
        if (A0H()) {
            A0Y(abstractC0704Sk, z);
        }
        if (z) {
            return;
        }
        boolean A16 = abstractC0704Sk.A16();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (A16) {
            abstractC0704Sk.A13();
        }
    }

    public boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
