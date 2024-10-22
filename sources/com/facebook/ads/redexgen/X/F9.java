package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F9 extends AbstractC0925aT {
    public final YA A00;
    public final J6 A01;

    public F9(YA ya, C00310x c00310x, List<UJ> list, J6 j6) {
        super(c00310x, list, ya);
        this.A00 = ya;
        this.A01 = j6 == null ? new J6() : j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0728Tj A0C(ViewGroup viewGroup, int i) {
        return new C0728Tj(new C0533Lv(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0925aT, com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A0H */
    public final void A0E(C0728Tj c0728Tj, int i) {
        super.A0E(c0728Tj, i);
        C0533Lv c0533Lv = (C0533Lv) c0728Tj.A0l();
        A0F(c0533Lv.getImageCardView(), i);
        if (((AbstractC0925aT) this).A01.get(i) != null) {
            c0533Lv.setTitle(((AbstractC0925aT) this).A01.get(i).getAdHeadline());
            c0533Lv.setSubtitle(((AbstractC0925aT) this).A01.get(i).getAdLinkDescription());
            c0533Lv.setButtonText(((AbstractC0925aT) this).A01.get(i).getAdCallToAction());
        }
        UJ uj = ((AbstractC0925aT) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0533Lv);
        uj.A1O(c0533Lv, c0533Lv, arrayList);
    }
}
