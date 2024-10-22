package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class xo extends FrameLayout {
    public static final wo l = new wo();

    /* renamed from: a */
    public yo f5193a;

    /* renamed from: b */
    public final fs2 f5194b;
    public int c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public Rect j;
    public boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public xo(Context context, AttributeSet attributeSet) {
        super(ir1.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Drawable L0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bg2.SnackbarLayout);
        int i = bg2.SnackbarLayout_elevation;
        if (obtainStyledAttributes.hasValue(i)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i, 0);
            WeakHashMap weakHashMap = ll3.f3151a;
            al3.s(this, dimensionPixelSize);
        }
        this.c = obtainStyledAttributes.getInt(bg2.SnackbarLayout_animationMode, 0);
        if (obtainStyledAttributes.hasValue(bg2.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(bg2.SnackbarLayout_shapeAppearanceOverlay)) {
            this.f5194b = new fs2(fs2.b(context2, attributeSet, 0, 0));
        }
        this.d = obtainStyledAttributes.getFloat(bg2.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(m20.j0(context2, obtainStyledAttributes, bg2.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(cp3.H(obtainStyledAttributes.getInt(bg2.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.e = obtainStyledAttributes.getFloat(bg2.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.f = obtainStyledAttributes.getDimensionPixelSize(bg2.SnackbarLayout_android_maxWidth, -1);
        this.g = obtainStyledAttributes.getDimensionPixelSize(bg2.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(l);
        setFocusable(true);
        if (getBackground() == null) {
            int U = zf3.U(getBackgroundOverlayColorAlpha(), zf3.x(this, he2.colorSurface), zf3.x(this, he2.colorOnSurface));
            fs2 fs2Var = this.f5194b;
            if (fs2Var != null) {
                uv0 uv0Var = yo.u;
                fr1 fr1Var = new fr1(fs2Var);
                fr1Var.j(ColorStateList.valueOf(U));
                gradientDrawable = fr1Var;
            } else {
                Resources resources = getResources();
                uv0 uv0Var2 = yo.u;
                float dimension = resources.getDimension(re2.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(U);
                gradientDrawable = gradientDrawable2;
            }
            if (this.h != null) {
                L0 = t9.L0(gradientDrawable);
                bn0.h(L0, this.h);
            } else {
                L0 = t9.L0(gradientDrawable);
            }
            WeakHashMap weakHashMap2 = ll3.f3151a;
            uk3.q(this, L0);
        }
    }

    public static /* synthetic */ void a(xo xoVar, yo yoVar) {
        xoVar.setBaseTransientBottomBar(yoVar);
    }

    public void setBaseTransientBottomBar(yo yoVar) {
        this.f5193a = yoVar;
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        yo yoVar = this.f5193a;
        if (yoVar != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                rootWindowInsets = yoVar.i.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                    i = mandatorySystemGestureInsets.bottom;
                    yoVar.p = i;
                    yoVar.e();
                }
            } else {
                yoVar.getClass();
            }
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        yk3.c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:            if (r1 == false) goto L54;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r6 = this;
            super.onDetachedFromWindow()
            yo r0 = r6.f5193a
            if (r0 == 0) goto L43
            ax2 r1 = defpackage.ax2.b()
            vo r2 = r0.t
            java.lang.Object r3 = r1.f359a
            monitor-enter(r3)
            boolean r4 = r1.c(r2)     // Catch: java.lang.Throwable -> L28
            r5 = 1
            if (r4 != 0) goto L32
            zw2 r1 = r1.d     // Catch: java.lang.Throwable -> L28
            r4 = 0
            if (r1 == 0) goto L2f
            if (r2 == 0) goto L2a
            java.lang.ref.WeakReference r1 = r1.f5563a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L28
            if (r1 != r2) goto L2a
            r1 = 1
            goto L2b
        L28:
            r0 = move-exception
            goto L41
        L2a:
            r1 = 0
        L2b:
            if (r1 == 0) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            if (r1 == 0) goto L33
        L32:
            r4 = 1
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L43
            android.os.Handler r1 = defpackage.yo.x
            to r2 = new to
            r2.<init>(r0, r5)
            r1.post(r2)
            goto L43
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo.onDetachedFromWindow():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        yo yoVar = this.f5193a;
        if (yoVar != null && yoVar.r) {
            yoVar.d();
            yoVar.r = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = t9.L0(drawable.mutate());
            bn0.h(drawable, this.h);
            bn0.i(drawable, this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable L0 = t9.L0(getBackground().mutate());
            bn0.h(L0, colorStateList);
            bn0.i(L0, this.i);
            if (L0 != getBackground()) {
                super.setBackgroundDrawable(L0);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable L0 = t9.L0(getBackground().mutate());
            bn0.i(L0, mode);
            if (L0 != getBackground()) {
                super.setBackgroundDrawable(L0);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            yo yoVar = this.f5193a;
            if (yoVar != null) {
                uv0 uv0Var = yo.u;
                yoVar.e();
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        wo woVar;
        if (onClickListener != null) {
            woVar = null;
        } else {
            woVar = l;
        }
        setOnTouchListener(woVar);
        super.setOnClickListener(onClickListener);
    }
}
