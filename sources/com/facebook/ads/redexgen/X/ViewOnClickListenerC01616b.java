package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC01616b extends PX implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final AbstractC0591Ob A00;
    public final MU A01;
    public final MI A02;
    public final MA A03;
    public final Q4 A04;

    public ViewOnClickListenerC01616b(YA ya) {
        this(ya, null);
    }

    public ViewOnClickListenerC01616b(YA ya, AttributeSet attributeSet) {
        this(ya, attributeSet, 0);
    }

    public ViewOnClickListenerC01616b(YA ya, AttributeSet attributeSet, int i) {
        super(ya, attributeSet, i);
        this.A03 = new MA() { // from class: com.facebook.ads.redexgen.X.6i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                ViewOnClickListenerC01616b.this.setVisibility(0);
            }
        };
        this.A01 = new MU() { // from class: com.facebook.ads.redexgen.X.6h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                Q4 q4;
                q4 = ViewOnClickListenerC01616b.this.A04;
                q4.setChecked(true);
            }
        };
        this.A02 = new MI() { // from class: com.facebook.ads.redexgen.X.6d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                Q4 q4;
                q4 = ViewOnClickListenerC01616b.this.A04;
                q4.setChecked(false);
            }
        };
        this.A00 = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.6c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                Q4 q4;
                q4 = ViewOnClickListenerC01616b.this.A04;
                q4.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Q4 q4 = new Q4(ya);
        this.A04 = q4;
        q4.setChecked(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(q4, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            RX videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == QY.A07 || videoView.getState() == QY.A05 || videoView.getState() == QY.A06) {
                videoView.A0b(EnumC0625Pj.A04, 11);
            } else if (videoView.getState() == QY.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            K0.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
