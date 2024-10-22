package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.vungle.ads.VungleError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0466Jb extends RelativeLayout implements InterfaceC0626Pk {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC02028a A03;
    public AbstractC02028a A04;
    public AbstractC02028a A05;
    public AbstractC02028a A06;
    public RX A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (C0506Ku.A02 * 6.0f);
    }

    public C0466Jb(YA ya) {
        this(ya, A09, -12549889, 0);
    }

    public C0466Jb(YA ya, int i, int i2, int i3) {
        super(ya);
        this.A00 = -1;
        this.A06 = new M9() { // from class: com.facebook.ads.redexgen.X.4y
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass71 anonymousClass71) {
                RX rx;
                rx = C0466Jb.this.A07;
                if (rx != null) {
                    C0466Jb c0466Jb = C0466Jb.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    c0466Jb.A07(true);
                }
            }
        };
        this.A04 = new MU() { // from class: com.facebook.ads.redexgen.X.4q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                C0466Jb.this.A02();
            }
        };
        this.A05 = new MI() { // from class: com.facebook.ads.redexgen.X.4e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                RX rx;
                rx = C0466Jb.this.A07;
                if (rx != null) {
                    C0466Jb.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.4b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                RX rx;
                rx = C0466Jb.this.A07;
                if (rx != null) {
                    C0466Jb.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(ya, null, R.attr.progressBarStyleHorizontal);
        A06(i2, i3);
        this.A02.setMax(VungleError.DEFAULT);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01 = ofInt;
        ofInt.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i = duration > 0 ? (currentPositionInMillis * VungleError.DEFAULT) / duration : 0;
        int i2 = this.A00;
        if (i2 >= i || duration <= currentPositionInMillis) {
            return;
        }
        if (z) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i2, i);
            this.A01 = ofInt;
            int position = Math.min(250, duration - currentPositionInMillis);
            ofInt.setDuration(position);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i);
        }
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void A9D(RX rx) {
        this.A07 = rx;
        rx.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void AG0(RX rx) {
        rx.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
