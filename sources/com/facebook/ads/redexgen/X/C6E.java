package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6E extends PX {
    public final Paint A00;
    public final YA A01;
    public final C0452In A02;
    public final AbstractC0591Ob A03;
    public final MU A04;
    public final MI A05;
    public final Q4 A06;

    public C6E(YA ya, boolean z, C0452In c0452In) {
        super(ya);
        this.A04 = new MU() { // from class: com.facebook.ads.redexgen.X.6Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                Q4 q4;
                q4 = C6E.this.A06;
                q4.setChecked(true);
            }
        };
        this.A05 = new MI() { // from class: com.facebook.ads.redexgen.X.6X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                Q4 q4;
                q4 = C6E.this.A06;
                q4.setChecked(false);
            }
        };
        this.A03 = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.6K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                Q4 q4;
                q4 = C6E.this.A06;
                q4.setChecked(true);
            }
        };
        this.A02 = c0452In;
        this.A01 = ya;
        Q4 q4 = new Q4(ya, z);
        this.A06 = q4;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        q4.setLayoutParams(layoutParams);
        q4.setChecked(true);
        q4.setClickable(false);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        if (z) {
            paint.setColor(-1728053248);
        } else {
            paint.setColor(-1);
            paint.setAlpha(204);
        }
        LV.A0M(this, 0);
        addView(q4);
        setGravity(17);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layout.addRule(13);
        setLayoutParams(layout);
        LV.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new Q1(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
