package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class T7 extends C2S {
    public static byte[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC0924aS A02;
    public final YA A03;
    public final InterfaceC0444If A04;
    public final LN A05;
    public final InterfaceC0531Lt A06;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A05() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C0572Ni c0572Ni = new C0572Ni(this.A03);
        T8 t8 = new T8(c0572Ni, this.A03);
        int i = A0C;
        t8.A05(i, i).A07(this.A02.A0z().A01());
        c0572Ni.setFullCircleCorners(true);
        LV.A0M(c0572Ni, 0);
        LV.A0K(c0572Ni);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A0B;
        layoutParams.setMargins(i2, i2, i2, i2);
        layoutParams.addRule(14);
        relativeLayout.addView(c0572Ni, layoutParams);
        TextView textView = new TextView(this.A03);
        LV.A0K(textView);
        textView.setTextColor(this.A02.A0u().A01().A06(true));
        textView.setText(this.A02.A0v().A0E().A06());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c0572Ni.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        LV.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(i2, 0, i2, i2);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C0574Nk c0574Nk = new C0574Nk(this.A03, A0A, 5, A09, -1);
        c0574Nk.setGravity(16);
        linearLayout.addView(c0574Nk, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A0u().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LV.A0X(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A08;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A0v().A0E().A03())) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c0574Nk.setRating(Float.parseFloat(this.A02.A0v().A0E().A03()));
            if (this.A02.A0v().A0E().A02() != null) {
                textView2.setText(A03(0, 1, 20) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A0v().A0E().A02())) + A03(1, 1, 41));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A0u().A01().A06(true));
        textView3.setText(this.A02.A0v().A0E().A01());
        textView3.setGravity(17);
        textView3.setPadding(i2, i2, i2, i2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A06() {
        A07 = new byte[]{110, -124};
    }

    static {
        A06();
        A0B = (int) (C2S.A08 * 12.0f);
        A0C = (int) (C2S.A08 * 84.0f);
        A0A = (int) (C2S.A08 * 14.0f);
        A08 = (int) (C2S.A08 * 8.0f);
        A09 = C00632d.A01(-1, 77);
    }

    public T7(YA ya, AbstractC0924aS abstractC0924aS, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya);
        LN ln = new LN();
        this.A05 = ln;
        this.A03 = ya;
        this.A02 = abstractC0924aS;
        this.A04 = interfaceC0444If;
        this.A06 = interfaceC0531Lt;
        ln.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        RelativeLayout relativeLayout = new RelativeLayout(ya);
        this.A01 = relativeLayout;
        C0579Np.A00(ya, relativeLayout, abstractC0924aS.A0v().A0D().A07());
        LinearLayout linearLayout = new LinearLayout(ya);
        this.A00 = linearLayout;
        linearLayout.setOrientation(1);
        A05();
        A04();
        relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A04() {
        T3 t3 = new T3(this.A03, EnumC0628Pm.A04.A02(), this.A02.A0u().A01(), this.A02.A0v().A0F().A06(), this.A04, this.A06, null, this.A05, this.A02.A0x());
        t3.setViewShowsOverMedia(true);
        LV.A0G(1001, t3);
        t3.setCta(this.A02.A0v().A0F(), this.A02.A11(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = A0B;
        t3.setPadding(i, i, i, i);
        layoutParams.setMargins(i, i, i, i * 2);
        this.A00.addView(t3, layoutParams);
    }
}
