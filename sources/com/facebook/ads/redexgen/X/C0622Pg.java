package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0622Pg extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    public C01666j A00;
    public WeakReference<InterfaceC0621Pf> A01;
    public final QW A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C0622Pg(YA ya, QW qw) {
        super(ya);
        this.A02 = qw;
        LV.A0J((View) qw);
        addView(qw.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(PX px) {
        addView(px, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C01666j) px;
    }

    public final void A01(PX px) {
        LV.A0J(px);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8S();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C01666j c01666j = this.A00;
        if (c01666j != null) {
            c01666j.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:            if (r6 > r5) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:            r4 = (r0 * r8) / r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:            if (r6 > r5) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:            if (r5 == Integer.MIN_VALUE) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:            if (r0 <= r6) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:            r0 = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:            if (r5 == Integer.MIN_VALUE) goto L43;     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0622Pg.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(InterfaceC0621Pf interfaceC0621Pf) {
        this.A01 = new WeakReference<>(interfaceC0621Pf);
    }
}
