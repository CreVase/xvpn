package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class NR extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final YA A03;
    public final T3 A04;
    public final C0572Ni A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, 12, 12, 13, 28, 9, 17, 20, 27};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0C(int i);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public NR(YA ya, int i, C1M c1m, boolean z, String str, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, C0643Qb c0643Qb, LN ln, C1R c1r) {
        super(ya);
        LV.A0K(this);
        this.A03 = ya;
        this.A00 = i;
        C0572Ni c0572Ni = new C0572Ni(ya);
        this.A05 = c0572Ni;
        LV.A0M(c0572Ni, 0);
        LV.A0K(c0572Ni);
        T3 t3 = new T3(ya, str, c1m, z, interfaceC0444If, interfaceC0531Lt, c0643Qb, ln, c1r);
        this.A04 = t3;
        LV.A0G(1001, t3);
        this.A01 = C0583Nt.A03(t3, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(ya);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        LV.A0K(relativeLayout);
    }

    public void A09() {
    }

    public void A0A() {
    }

    public void A0B() {
        this.A05.setOnClickListener(this.A01);
    }

    public final T3 getCTAButton() {
        return this.A04;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1K c1k, C1N c1n, String str, String str2, NV nv) {
        this.A04.setCta(c1n, str, new HashMap(), nv);
        T8 t8 = new T8(this.A05, this.A03);
        int i = this.A00;
        t8.A05(i, i).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
