package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class PS {
    public T3 A00;
    public final AnonymousClass19 A01;
    public final C1K A02;
    public final C1O A03;
    public final C1X A04;
    public final YA A05;
    public final C0452In A06;
    public static String[] A07 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A0A = (int) (C0506Ku.A02 * 4.0f);
    public static final int A08 = (int) (C0506Ku.A02 * 72.0f);
    public static final int A09 = (int) (C0506Ku.A02 * 8.0f);

    public PS(YA ya, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS) {
        this.A05 = ya;
        this.A06 = new C0452In(abstractC0924aS.A11(), interfaceC0444If);
        this.A01 = abstractC0924aS.A0u();
        this.A02 = abstractC0924aS.A0v().A0E();
        this.A04 = abstractC0924aS.A0z();
        this.A03 = abstractC0924aS.A0v().A0G();
    }

    private View A00(T3 t3) {
        C0578No c0578No = new C0578No(this.A05, this.A01.A01(), true, false, false);
        c0578No.A03(this.A02.A06(), this.A02.A01(), null, false, true);
        c0578No.setAlignment(17);
        C0572Ni c0572Ni = new C0572Ni(this.A05);
        LV.A0M(c0572Ni, 0);
        c0572Ni.setRadius(50);
        new T8(c0572Ni, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A08;
        linearLayout.addView(c0572Ni, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A09;
        imageParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(c0578No, imageParams);
        if (t3 != null) {
            LV.A0J(t3);
            linearLayout.addView(t3, imageParams);
            if (TextUtils.isEmpty(t3.getText())) {
                LV.A0H(t3);
            }
        }
        return linearLayout;
    }

    private ED A01() {
        ED ed = new ED(this.A05);
        ed.setLayoutManager(new ZC(this.A05, 0, false));
        ed.setAdapter(new C0676Ri(this.A05, this.A03.A01(), A0A, this.A00));
        return ed;
    }

    private final PR A02() {
        if (!this.A03.A01().isEmpty()) {
            return PR.A04;
        }
        PR pr = PR.A03;
        String[] strArr = A07;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A07[4] = "qwlEjiYhEcV8j1J";
        return pr;
    }

    public final Pair<PR, View> A03(T3 t3) {
        View A01;
        this.A00 = t3;
        PR A02 = A02();
        switch (PQ.A00[A02.ordinal()]) {
            case 1:
                A01 = A01();
                break;
            default:
                T3 t32 = this.A00;
                if (A07[4].length() == 15) {
                    String[] strArr = A07;
                    strArr[3] = "Oe6IO8Uak3tx5GvHWoKp5mKUb4E2rtDt";
                    strArr[7] = "t7tx5cDm578ghKblxCWBuUm65hKnqcQl";
                    A01 = A00(t32);
                    break;
                } else {
                    throw new RuntimeException();
                }
        }
        C0454Ip.A04(A01, this.A06, EnumC0451Im.A0S);
        return new Pair<>(A02, A01);
    }
}
