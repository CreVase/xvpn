package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wz extends fr1 implements Drawable.Callback, x63 {
    public static final int[] S0 = {R.attr.state_enabled};
    public static final ShapeDrawable T0 = new ShapeDrawable(new OvalShape());
    public float A;
    public int A0;
    public ColorStateList B;
    public int B0;
    public float C;
    public int C0;
    public ColorStateList D;
    public boolean D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public int F0;
    public Drawable G;
    public ColorFilter G0;
    public ColorStateList H;
    public PorterDuffColorFilter H0;
    public float I;
    public ColorStateList I0;
    public boolean J;
    public PorterDuff.Mode J0;
    public boolean K;
    public int[] K0;
    public Drawable L;
    public boolean L0;
    public RippleDrawable M;
    public ColorStateList M0;
    public ColorStateList N;
    public WeakReference N0;
    public float O;
    public TextUtils.TruncateAt O0;
    public SpannableStringBuilder P;
    public boolean P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public boolean R0;
    public Drawable X;
    public ColorStateList Y;
    public jx1 Z;
    public jx1 h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public final Context q0;
    public final Paint r0;
    public final Paint.FontMetrics s0;
    public final RectF t0;
    public final PointF u0;
    public final Path v0;
    public final y63 w0;
    public ColorStateList x;
    public int x0;
    public ColorStateList y;
    public int y0;
    public float z;
    public int z0;

    public wz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.w);
        this.A = -1.0f;
        this.r0 = new Paint(1);
        this.s0 = new Paint.FontMetrics();
        this.t0 = new RectF();
        this.u0 = new PointF();
        this.v0 = new Path();
        this.F0 = 255;
        this.J0 = PorterDuff.Mode.SRC_IN;
        this.N0 = new WeakReference(null);
        h(context);
        this.q0 = context;
        y63 y63Var = new y63(this);
        this.w0 = y63Var;
        this.E = "";
        y63Var.f5281a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = S0;
        setState(iArr);
        if (!Arrays.equals(this.K0, iArr)) {
            this.K0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.P0 = true;
        T0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean t(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(float f) {
        if (this.A != f) {
            this.A = f;
            fs2 fs2Var = this.f2139a.f1978a;
            fs2Var.getClass();
            jk jkVar = new jk(fs2Var);
            jkVar.e = new s(f);
            jkVar.f = new s(f);
            jkVar.g = new s(f);
            jkVar.h = new s(f);
            setShapeAppearanceModel(new fs2(jkVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof ct3;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((dt3) ((ct3) drawable3)).f;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p = p();
            if (drawable != null) {
                drawable4 = t9.L0(drawable).mutate();
            }
            this.G = drawable4;
            float p2 = p();
            U(drawable2);
            if (S()) {
                n(this.G);
            }
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.I != f) {
            float p = p();
            this.I = f;
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (S()) {
                bn0.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        boolean z2;
        if (this.F != z) {
            boolean S = S();
            this.F = z;
            boolean S2 = S();
            if (S != S2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (S2) {
                    n(this.G);
                } else {
                    U(this.G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.R0) {
                er1 er1Var = this.f2139a;
                if (er1Var.d != colorStateList) {
                    er1Var.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.C != f) {
            this.C = f;
            this.r0.setStrokeWidth(f);
            if (this.R0) {
                this.f2139a.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.L;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof ct3;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((dt3) ((ct3) drawable3)).f;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q = q();
            if (drawable != null) {
                drawable4 = t9.L0(drawable).mutate();
            }
            this.L = drawable4;
            this.M = new RippleDrawable(ya0.d0(this.D), this.L, T0);
            float q2 = q();
            U(drawable2);
            if (T()) {
                n(this.L);
            }
            invalidateSelf();
            if (q != q2) {
                u();
            }
        }
    }

    public final void I(float f) {
        if (this.o0 != f) {
            this.o0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.O != f) {
            this.O = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (T()) {
                bn0.h(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        boolean z2;
        if (this.K != z) {
            boolean T = T();
            this.K = z;
            boolean T2 = T();
            if (T != T2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (T2) {
                    n(this.L);
                } else {
                    U(this.L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.k0 != f) {
            float p = p();
            this.k0 = f;
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.j0 != f) {
            float p = p();
            this.j0 = f;
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.L0) {
                colorStateList2 = ya0.d0(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.M0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void Q(s63 s63Var) {
        y63 y63Var = this.w0;
        if (y63Var.f != s63Var) {
            y63Var.f = s63Var;
            if (s63Var != null) {
                TextPaint textPaint = y63Var.f5281a;
                Context context = this.q0;
                sz szVar = y63Var.f5282b;
                s63Var.f(context, textPaint, szVar);
                x63 x63Var = (x63) y63Var.e.get();
                if (x63Var != null) {
                    textPaint.drawableState = x63Var.getState();
                }
                s63Var.e(context, textPaint, szVar);
                y63Var.d = true;
            }
            x63 x63Var2 = (x63) y63Var.e.get();
            if (x63Var2 != null) {
                wz wzVar = (wz) x63Var2;
                wzVar.u();
                wzVar.invalidateSelf();
                wzVar.onStateChange(x63Var2.getState());
            }
        }
    }

    public final boolean R() {
        if (this.R && this.X != null && this.D0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.F && this.G != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.K && this.L != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        RectF rectF;
        int i4;
        int i5;
        boolean z;
        int i6;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.F0) != 0) {
            if (i < 255) {
                float f = bounds.left;
                float f2 = bounds.top;
                float f3 = bounds.right;
                float f4 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f, f2, f3, f4, i);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
                }
                i2 = saveLayerAlpha;
            } else {
                i2 = 0;
            }
            boolean z2 = this.R0;
            Paint paint = this.r0;
            RectF rectF2 = this.t0;
            if (!z2) {
                paint.setColor(this.x0);
                paint.setStyle(Paint.Style.FILL);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (!this.R0) {
                paint.setColor(this.y0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.G0;
                if (colorFilter == null) {
                    colorFilter = this.H0;
                }
                paint.setColorFilter(colorFilter);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (this.R0) {
                super.draw(canvas);
            }
            if (this.C > 0.0f && !this.R0) {
                paint.setColor(this.A0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.R0) {
                    ColorFilter colorFilter2 = this.G0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.H0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f5 = bounds.left;
                float f6 = this.C / 2.0f;
                rectF2.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
                float f7 = this.A - (this.C / 2.0f);
                canvas.drawRoundRect(rectF2, f7, f7, paint);
            }
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            if (!this.R0) {
                canvas.drawRoundRect(rectF2, r(), r(), paint);
                i3 = 0;
            } else {
                RectF rectF3 = new RectF(bounds);
                Path path = this.v0;
                is2 is2Var = this.r;
                er1 er1Var = this.f2139a;
                is2Var.a(er1Var.f1978a, er1Var.j, rectF3, this.q, path);
                i3 = 0;
                e(canvas, paint, path, this.f2139a.f1978a, g());
            }
            if (S()) {
                o(bounds, rectF2);
                float f8 = rectF2.left;
                float f9 = rectF2.top;
                canvas.translate(f8, f9);
                this.G.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
                this.G.draw(canvas);
                canvas.translate(-f8, -f9);
            }
            if (R()) {
                o(bounds, rectF2);
                float f10 = rectF2.left;
                float f11 = rectF2.top;
                canvas.translate(f10, f11);
                this.X.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
                this.X.draw(canvas);
                canvas.translate(-f10, -f11);
            }
            if (this.P0 && this.E != null) {
                PointF pointF = this.u0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.E;
                y63 y63Var = this.w0;
                if (charSequence != null) {
                    float p = p() + this.i0 + this.l0;
                    if (t9.J(this) == 0) {
                        pointF.x = bounds.left + p;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - p;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = y63Var.f5281a;
                    Paint.FontMetrics fontMetrics = this.s0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF2.setEmpty();
                if (this.E != null) {
                    float p2 = p() + this.i0 + this.l0;
                    float q = q() + this.p0 + this.m0;
                    if (t9.J(this) == 0) {
                        rectF2.left = bounds.left + p2;
                        rectF2.right = bounds.right - q;
                    } else {
                        rectF2.left = bounds.left + q;
                        rectF2.right = bounds.right - p2;
                    }
                    rectF2.top = bounds.top;
                    rectF2.bottom = bounds.bottom;
                }
                s63 s63Var = y63Var.f;
                TextPaint textPaint2 = y63Var.f5281a;
                if (s63Var != null) {
                    textPaint2.drawableState = getState();
                    y63Var.f.e(this.q0, textPaint2, y63Var.f5282b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(y63Var.a(this.E.toString())) > Math.round(rectF2.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i6 = canvas.save();
                    canvas.clipRect(rectF2);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence2 = this.E;
                if (z && this.O0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF2.width(), this.O0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f12 = pointF.x;
                float f13 = pointF.y;
                i5 = 255;
                rectF = rectF2;
                i4 = i2;
                canvas.drawText(charSequence3, 0, length, f12, f13, textPaint2);
                if (z) {
                    canvas.restoreToCount(i6);
                }
            } else {
                rectF = rectF2;
                i4 = i2;
                i5 = 255;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f14 = this.p0 + this.o0;
                    if (t9.J(this) == 0) {
                        float f15 = bounds.right - f14;
                        rectF.right = f15;
                        rectF.left = f15 - this.O;
                    } else {
                        float f16 = bounds.left + f14;
                        rectF.left = f16;
                        rectF.right = f16 + this.O;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f17 = this.O;
                    float f18 = exactCenterY - (f17 / 2.0f);
                    rectF.top = f18;
                    rectF.bottom = f18 + f17;
                }
                float f19 = rectF.left;
                float f20 = rectF.top;
                canvas.translate(f19, f20);
                this.L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                this.M.draw(canvas);
                canvas.translate(-f19, -f20);
            }
            if (this.F0 < i5) {
                canvas.restoreToCount(i4);
            }
        }
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.w0.a(this.E.toString()) + p() + this.i0 + this.l0 + this.m0 + this.p0), this.Q0);
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.R0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.z, this.A);
        }
        outline.setAlpha(this.F0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (s(this.x) || s(this.y) || s(this.B)) {
            return true;
        }
        if (this.L0 && s(this.M0)) {
            return true;
        }
        s63 s63Var = this.w0.f;
        if (s63Var != null && (colorStateList = s63Var.j) != null && colorStateList.isStateful()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.R && this.X != null && this.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || t(this.G) || t(this.X) || s(this.I0)) {
            return true;
        }
        return false;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        t9.o0(drawable, t9.J(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.L) {
            if (drawable.isStateful()) {
                drawable.setState(this.K0);
            }
            bn0.h(drawable, this.N);
            return;
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.J) {
            bn0.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.i0 + this.j0;
            if (this.D0) {
                drawable = this.X;
            } else {
                drawable = this.G;
            }
            float f3 = this.I;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (t9.J(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            if (this.D0) {
                drawable2 = this.X;
            } else {
                drawable2 = this.G;
            }
            float f6 = this.I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(cp3.s(this.q0, 24));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f6;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= t9.o0(this.G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= t9.o0(this.X, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= t9.o0(this.L, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (S()) {
            onLevelChange |= this.G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.X.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.R0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.K0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.j0;
        if (this.D0) {
            drawable = this.X;
        } else {
            drawable = this.G;
        }
        float f2 = this.I;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.k0;
    }

    public final float q() {
        if (T()) {
            return this.n0 + this.O + this.o0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.R0) {
            return this.f2139a.f1978a.e.a(g());
        }
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G0 != colorFilter) {
            this.G0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.fr1, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.J0 != mode) {
            this.J0 = mode;
            ColorStateList colorStateList = this.I0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.H0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (S()) {
            visible |= this.G.setVisible(z, z2);
        }
        if (R()) {
            visible |= this.X.setVisible(z, z2);
        }
        if (T()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        vz vzVar = (vz) this.N0.get();
        if (vzVar != null) {
            Chip chip = (Chip) vzVar;
            chip.b(chip.p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.v(int[], int[]):boolean");
    }

    public final void w(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            float p = p();
            if (!z && this.D0) {
                this.D0 = false;
            }
            float p2 = p();
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.X != drawable) {
            float p = p();
            this.X = drawable;
            float p2 = p();
            U(this.X);
            n(this.X);
            invalidateSelf();
            if (p != p2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        boolean z;
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (this.R && this.X != null && this.Q) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bn0.h(this.X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        boolean z2;
        if (this.R != z) {
            boolean R = R();
            this.R = z;
            boolean R2 = R();
            if (R != R2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (R2) {
                    n(this.X);
                } else {
                    U(this.X);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
