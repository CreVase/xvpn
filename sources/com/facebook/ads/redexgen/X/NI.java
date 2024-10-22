package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class NI extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public NI(YA ya) {
        super(ya);
        this.A03 = new ImageView(ya);
        this.A02 = new ImageView(ya);
        A00();
    }

    public NI(YA ya, AttributeSet attributeSet) {
        super(ya, attributeSet);
        this.A03 = new ImageView(ya, attributeSet);
        this.A02 = new ImageView(ya, attributeSet);
        A00();
    }

    public NI(YA ya, AttributeSet attributeSet, int i) {
        super(ya, attributeSet, i);
        this.A03 = new ImageView(ya, attributeSet, i);
        this.A02 = new ImageView(ya, attributeSet, i);
        A00();
    }

    public NI(YA ya, AttributeSet attributeSet, int i, int i2) {
        super(ya, attributeSet, i, i2);
        this.A03 = new ImageView(ya, attributeSet, i, i2);
        this.A02 = new ImageView(ya, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC0511Kz.A04(this.A03, EnumC0511Kz.A0A);
        setId(LV.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.A01;
        if (i6 <= 0 || (i5 = this.A00) <= 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i7 = i3 - i;
        int i8 = i4 - i2;
        float min = Math.min(i7 / i6, i8 / i5);
        int i9 = (int) (this.A01 * min);
        int blurBorderViewWidth = (int) (this.A00 * min);
        this.A02.layout(i, i2, i3, i4);
        int expectedImageWidth = (i7 / 2) + i;
        int i10 = (i8 / 2) + i2;
        this.A03.layout(expectedImageWidth - (i9 / 2), i10 - (blurBorderViewWidth / 2), (i9 / 2) + expectedImageWidth, i10 + (blurBorderViewWidth / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            LV.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            LV.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
