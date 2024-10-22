package androidx.cardview.widget;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import defpackage.d5;
import defpackage.ol2;
import defpackage.x50;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public static final d5 g = new d5();

    /* renamed from: a */
    public boolean f183a;

    /* renamed from: b */
    public boolean f184b;
    public final Rect c;
    public final Rect d;
    public final x50 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r0 = defpackage.de2.cardViewStyle
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.c = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.d = r2
            x50 r2 = new x50
            r2.<init>(r9)
            r9.e = r2
            int[] r3 = defpackage.uf2.CardView
            int r4 = defpackage.of2.CardView
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            int r11 = defpackage.uf2.CardView_cardBackgroundColor
            boolean r0 = r10.hasValue(r11)
            r3 = 0
            if (r0 == 0) goto L30
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L69
        L30:
            android.content.Context r11 = r9.getContext()
            int[] r0 = androidx.cardview.widget.CardView.f
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r0)
            int r0 = r11.getColor(r3, r3)
            r11.recycle()
            r11 = 3
            float[] r11 = new float[r11]
            android.graphics.Color.colorToHSV(r0, r11)
            r0 = 2
            r11 = r11[r0]
            r0 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L5b
            android.content.res.Resources r11 = r9.getResources()
            int r0 = defpackage.le2.cardview_light_background
            int r11 = r11.getColor(r0)
            goto L65
        L5b:
            android.content.res.Resources r11 = r9.getResources()
            int r0 = defpackage.le2.cardview_dark_background
            int r11 = r11.getColor(r0)
        L65:
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L69:
            int r0 = defpackage.uf2.CardView_cardCornerRadius
            r4 = 0
            float r0 = r10.getDimension(r0, r4)
            int r5 = defpackage.uf2.CardView_cardElevation
            float r5 = r10.getDimension(r5, r4)
            int r6 = defpackage.uf2.CardView_cardMaxElevation
            float r4 = r10.getDimension(r6, r4)
            int r6 = defpackage.uf2.CardView_cardUseCompatPadding
            boolean r6 = r10.getBoolean(r6, r3)
            r9.f183a = r6
            int r6 = defpackage.uf2.CardView_cardPreventCornerOverlap
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.f184b = r6
            int r6 = defpackage.uf2.CardView_contentPadding
            int r6 = r10.getDimensionPixelSize(r6, r3)
            int r8 = defpackage.uf2.CardView_contentPaddingLeft
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            int r8 = defpackage.uf2.CardView_contentPaddingTop
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            int r8 = defpackage.uf2.CardView_contentPaddingRight
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            int r8 = defpackage.uf2.CardView_contentPaddingBottom
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lb8
            r4 = r5
        Lb8:
            int r1 = defpackage.uf2.CardView_android_minWidth
            r10.getDimensionPixelSize(r1, r3)
            int r1 = defpackage.uf2.CardView_android_minHeight
            r10.getDimensionPixelSize(r1, r3)
            r10.recycle()
            d5 r10 = androidx.cardview.widget.CardView.g
            ol2 r1 = new ol2
            r1.<init>(r0, r11)
            r2.f5117b = r1
            java.lang.Object r11 = r2.c
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            r11.setBackgroundDrawable(r1)
            java.lang.Object r11 = r2.c
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            r11.setClipToOutline(r7)
            r11.setElevation(r5)
            r10.H(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.CardView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static /* synthetic */ void a(CardView cardView, int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ol2) ((Drawable) this.e.f5117b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((ol2) ((Drawable) this.e.f5117b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f184b;
    }

    public float getRadius() {
        return ((ol2) ((Drawable) this.e.f5117b)).f3689a;
    }

    public boolean getUseCompatPadding() {
        return this.f183a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        ol2 ol2Var = (ol2) ((Drawable) this.e.f5117b);
        ol2Var.b(valueOf);
        ol2Var.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        g.H(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f184b) {
            this.f184b = z;
            d5 d5Var = g;
            x50 x50Var = this.e;
            d5Var.H(x50Var, ((ol2) ((Drawable) x50Var.f5117b)).e);
        }
    }

    public void setRadius(float f2) {
        ol2 ol2Var = (ol2) ((Drawable) this.e.f5117b);
        if (f2 != ol2Var.f3689a) {
            ol2Var.f3689a = f2;
            ol2Var.c(null);
            ol2Var.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f183a != z) {
            this.f183a = z;
            d5 d5Var = g;
            x50 x50Var = this.e;
            d5Var.H(x50Var, ((ol2) ((Drawable) x50Var.f5117b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ol2 ol2Var = (ol2) ((Drawable) this.e.f5117b);
        ol2Var.b(colorStateList);
        ol2Var.invalidateSelf();
    }
}
