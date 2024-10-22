package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.7H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7H extends AbstractC0723Td {
    public static byte[] A0F;
    public static String[] A0G = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC0924aS A03;
    public C6Q A04;
    public C2O A05;
    public C0571Nh A06;
    public S0 A07;
    public AbstractC0642Qa A08;
    public C0643Qb A09;
    public String A0A;
    public List<PC> A0B;
    public boolean A0C;
    public final YA A0D;
    public final LN A0E;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0G;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0B() {
        A0F = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114, 117, 98, 112, 102, 117, 99, 98, 99, 81, 110, 99, 98, 104, 70, 99, 67, 102, 115, 102, 69, 114, 105, 99, 107, 98};
    }

    static {
        A0B();
        A0H = (int) (C0506Ku.A02 * 48.0f);
        A0I = (int) (C0506Ku.A02 * 8.0f);
        A0J = (int) (C0506Ku.A02 * 8.0f);
        A0L = (int) (C0506Ku.A02 * 56.0f);
        A0K = (int) (C0506Ku.A02 * 12.0f);
    }

    public C7H(YA ya, InterfaceC0444If interfaceC0444If, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt, C0361Ey c0361Ey) {
        super(ya, interfaceC0444If, interfaceC0531Lt, c0361Ey);
        this.A0E = new LN();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new PU(ya, new TQ(), super.A0A.A0S(), interfaceC0531Lt);
        this.A04 = c6q;
        this.A0D = ya;
    }

    public C7H(YA ya, InterfaceC0444If interfaceC0444If, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt, F0 f0) {
        super(ya, interfaceC0444If, interfaceC0531Lt, f0);
        this.A0E = new LN();
        this.A0C = false;
        this.A04 = c6q;
        this.A0D = ya;
    }

    private AbstractC0924aS A00(Intent intent) {
        if (super.A07) {
            return (AbstractC0924aS) intent.getSerializableExtra(A09(14, 25, 77));
        }
        return (AbstractC0924aS) intent.getSerializableExtra(A09(0, 14, 93));
    }

    private final void A0C() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2O c2o = this.A05;
        if (c2o != null) {
            c2o.removeAllViews();
            this.A05.A1R();
            this.A05 = null;
        }
        C0571Nh c0571Nh = this.A06;
        if (c0571Nh != null) {
            c0571Nh.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x012e, code lost:            if (r6 != false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:            r24.A0D.A0A().AGA(r24.A05, r24.A0A.A11(), false);     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0141, code lost:            A0W(r24.A02, false, r25);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014e, code lost:            if (r6 != false) goto L21;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0D(int r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7H.A0D(int, android.os.Bundle):void");
    }

    private void A0E(AbstractC0924aS abstractC0924aS) {
        this.A03 = abstractC0924aS;
        this.A0A = abstractC0924aS.A11();
        this.A00 = this.A03.A0C();
        this.A01 = this.A03.A0D();
        List<C1D> A13 = this.A03.A13();
        List<AdInfo> adInfoList = new ArrayList<>(A13.size());
        this.A0B = adInfoList;
        int i = 0;
        while (true) {
            int size = A13.size();
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[4];
            int i2 = str.charAt(16);
            if (i2 == str2.charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "1AHb04hcylshFNuVFPVd0IA840Fx90m0";
            if (i < size) {
                C1D c1d = A13.get(i);
                List<PC> list = this.A0B;
                int i3 = A13.size();
                list.add(new PC(i, i3, c1d));
                i++;
            } else {
                return;
            }
        }
    }

    private void A0F(S0 s0) {
        new EE().A0G(this.A05);
        s0.A0Z(new C0681Rn(this));
        this.A06 = new C0571Nh(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        AbstractC0924aS dataBundle = A00(intent);
        A0X(c5j);
        A0E(dataBundle);
        A0D(c5j.A0J().getResources().getConfiguration().orientation, bundle);
        c5j.A0N(new C0680Rm(this, c5j));
        AbstractC0924aS dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A0v().A0D().A03();
        if (super.A07) {
            AbstractC0924aS dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A0v().A0D().A02();
        }
        if (unskippableSec > 0) {
            A0V(unskippableSec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        super.ACJ(z);
        S0 s0 = this.A07;
        if (s0 != null) {
            s0.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        super.ACj(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
        S0 s0 = this.A07;
        if (s0 != null) {
            s0.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEt(bundle);
        A0C();
        A0D(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        super.onDestroy();
        if (IP.A1X(this.A0D)) {
            this.A0D.A0A().AFz(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9J(this.A0A, new NL().A03(this.A09).A02(this.A0E).A05());
        }
        A0C();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
