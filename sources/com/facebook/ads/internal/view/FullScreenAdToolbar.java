package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.redexgen.X.AbstractC0530Ls;
import com.facebook.ads.redexgen.X.C00371d;
import com.facebook.ads.redexgen.X.C0452In;
import com.facebook.ads.redexgen.X.C0506Ku;
import com.facebook.ads.redexgen.X.C0528Lq;
import com.facebook.ads.redexgen.X.C0583Nt;
import com.facebook.ads.redexgen.X.C1M;
import com.facebook.ads.redexgen.X.C1X;
import com.facebook.ads.redexgen.X.EnumC0515Ld;
import com.facebook.ads.redexgen.X.InterfaceC0529Lr;
import com.facebook.ads.redexgen.X.InterfaceC0531Lt;
import com.facebook.ads.redexgen.X.LV;
import com.facebook.ads.redexgen.X.ME;
import com.facebook.ads.redexgen.X.PB;
import com.facebook.ads.redexgen.X.T3;
import com.facebook.ads.redexgen.X.ViewOnClickListenerC0536Ly;
import com.facebook.ads.redexgen.X.YA;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC0530Ls {
    public static byte[] A09;
    public static String[] A0A = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public C0528Lq A00;
    public InterfaceC0529Lr A01;
    public InterfaceC0529Lr A02;
    public boolean A03;
    public final RelativeLayout A04;
    public final C0452In A05;
    public final InterfaceC0531Lt A06;
    public final ME A07;
    public final PB A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74, 77, 72, 72, 69, 59, 58, 75};
    }

    static {
        A03();
        int i = (int) (C0506Ku.A02 * 10.0f);
        A0B = i;
        int i2 = (int) (C0506Ku.A02 * 16.0f);
        A0F = i2;
        A0D = i2 - i;
        A0E = (i2 * 2) - i;
        A0C = (int) (C0506Ku.A02 * 4.0f);
    }

    public FullScreenAdToolbar(YA ya, InterfaceC0531Lt interfaceC0531Lt, C0452In c0452In, int i) {
        super(ya);
        this.A01 = null;
        this.A03 = true;
        this.A06 = interfaceC0531Lt;
        this.A05 = c0452In;
        setGravity(16);
        ME me = new ME(ya, i);
        this.A07 = me;
        me.setContentDescription(A02(0, 8, 50));
        me.setActionClickListener(new ViewOnClickListenerC0536Ly(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A0D;
        layoutParams.setMargins(i2, i2, A0E, i2);
        addView(me, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(ya);
        this.A04 = relativeLayout;
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(0, -2);
        containerParams.weight = 1.0f;
        PB pb = new PB(ya);
        this.A08 = pb;
        LV.A0G(1006, pb);
        LinearLayout.LayoutParams toolbarActionViewParams = new LinearLayout.LayoutParams(-2, -2);
        toolbarActionViewParams.gravity = 17;
        pb.setLayoutParams(toolbarActionViewParams);
        relativeLayout.addView(pb);
        addView(relativeLayout, containerParams);
    }

    public FullScreenAdToolbar(YA ya, InterfaceC0531Lt interfaceC0531Lt, C0452In c0452In, int i, int i2) {
        this(ya, interfaceC0531Lt, c0452In, i);
        A09(ya, i2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public final void A04() {
        InterfaceC0529Lr interfaceC0529Lr = this.A01;
        if (interfaceC0529Lr != null) {
            this.A02 = interfaceC0529Lr;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public final void A05() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public final void A06(C1M c1m, boolean z) {
        boolean z2 = this.A03;
        int A04 = c1m.A04(z2);
        this.A08.A02(c1m.A0A(z2), A04);
        this.A00.setIconColors(A04);
        this.A00.setContentDescription(A02(8, 9, 117));
        this.A07.A02(c1m, z2, z);
        if (z2) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            LV.A0S(this, gradientDrawable);
            LV.A0Q(this.A00, 0, -16777216, A0C);
            return;
        }
        LV.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public final boolean A07() {
        return this.A07.A03();
    }

    public final void A08(C1X c1x, String str, int i) {
        this.A07.setInitialUnskippableSeconds(i);
        C0528Lq c0528Lq = this.A00;
        if (c0528Lq != null) {
            c0528Lq.setAdDetails(c1x, str, this.A05, this.A06);
        }
    }

    public final void A09(YA ya, int i) {
        C0528Lq c0528Lq = this.A00;
        if (c0528Lq != null) {
            LV.A0J(c0528Lq);
            this.A00.removeAllViews();
        }
        this.A00 = new C0528Lq(ya, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int i2 = A0F;
        layoutParams.setMargins(0, i2 / 2, i2 / 2, i2 / 2);
        addView(this.A00, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public View getDetailsContainer() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public int getToolbarActionMode() {
        return this.A07.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public int getToolbarHeight() {
        return AbstractC0530Ls.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public InterfaceC0529Lr getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setAdReportingVisible(boolean z) {
        this.A00.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setCTAClickListener(T3 t3) {
        this.A08.setOnClickListener(C0583Nt.A03(t3, A02(17, 7, 104)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setFullscreen(boolean z) {
        this.A03 = z;
    }

    public void setOnlyPageDetails(C1X c1x) {
        if (c1x != null) {
            this.A08.setPageDetails(c1x);
        } else {
            this.A08.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setPageDetails(C1X c1x, String str, int i, C00371d c00371d) {
        this.A07.setInitialUnskippableSeconds(i);
        this.A08.setPageDetails(c1x);
        C0528Lq c0528Lq = this.A00;
        if (c0528Lq != null) {
            c0528Lq.setAdDetails(c1x, str, this.A05, this.A06);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setPageDetailsVisible(boolean z) {
        this.A04.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A04;
            PB pb = this.A08;
            if (A0A[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(pb);
        }
        ME me = this.A07;
        String[] strArr2 = A0A;
        if (strArr2[2].length() == strArr2[3].length()) {
            me.setToolbarMessageEnabled(!z);
        } else {
            A0A[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
            me.setToolbarMessageEnabled(!z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setProgress(float f) {
        this.A07.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setProgressImage(EnumC0515Ld enumC0515Ld) {
        this.A07.setProgressImage(enumC0515Ld);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setProgressImmediate(float f) {
        this.A07.setProgressImmediate(f);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setProgressSpinnerInvisible(boolean z) {
        this.A07.setProgressSpinnerInvisible(z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setToolbarActionMessage(String str) {
        this.A07.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setToolbarActionMode(int i) {
        this.A07.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0530Ls
    public void setToolbarListener(InterfaceC0529Lr interfaceC0529Lr) {
        this.A02 = interfaceC0529Lr;
    }
}
