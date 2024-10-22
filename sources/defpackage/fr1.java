package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class fr1 extends Drawable implements h93, rs2 {
    public static final Paint w;

    /* renamed from: a, reason: collision with root package name */
    public er1 f2139a;

    /* renamed from: b, reason: collision with root package name */
    public final ps2[] f2140b;
    public final ps2[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public fs2 m;
    public final Paint n;
    public final Paint o;
    public final es2 p;
    public final ja1 q;
    public final is2 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public final RectF u;
    public final boolean v;

    static {
        Paint paint = new Paint(1);
        w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public fr1() {
        this(new fs2());
    }

    public final void a(RectF rectF, Path path) {
        is2 is2Var = this.r;
        er1 er1Var = this.f2139a;
        is2Var.a(er1Var.f1978a, er1Var.j, rectF, this.q, path);
        if (this.f2139a.i != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.f2139a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.u, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = c(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (c = c((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int c(int i) {
        boolean z;
        float f;
        int i2;
        er1 er1Var = this.f2139a;
        float f2 = er1Var.n + er1Var.o + er1Var.m;
        rp0 rp0Var = er1Var.f1979b;
        if (rp0Var != null && rp0Var.f4197a) {
            if (h20.d(i, 255) == rp0Var.d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (rp0Var.e > 0.0f && f2 > 0.0f) {
                    f = Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f = 0.0f;
                }
                int alpha = Color.alpha(i);
                int U = zf3.U(f, h20.d(i, 255), rp0Var.f4198b);
                if (f > 0.0f && (i2 = rp0Var.c) != 0) {
                    U = h20.b(h20.d(i2, rp0.f), U);
                }
                return h20.d(U, alpha);
            }
            return i;
        }
        return i;
    }

    public final void d(Canvas canvas) {
        this.d.cardinality();
        int i = this.f2139a.r;
        Path path = this.g;
        es2 es2Var = this.p;
        if (i != 0) {
            canvas.drawPath(path, es2Var.f1984a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ps2 ps2Var = this.f2140b[i2];
            int i3 = this.f2139a.q;
            Matrix matrix = ps2.f3908b;
            ps2Var.a(matrix, es2Var, i3, canvas);
            this.c[i2].a(matrix, es2Var, this.f2139a.q, canvas);
        }
        if (this.v) {
            er1 er1Var = this.f2139a;
            int sin = (int) (Math.sin(Math.toRadians(er1Var.s)) * er1Var.r);
            er1 er1Var2 = this.f2139a;
            int cos = (int) (Math.cos(Math.toRadians(er1Var2.s)) * er1Var2.r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, w);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:            if (r0 != false) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr1.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, fs2 fs2Var, RectF rectF) {
        if (fs2Var.d(rectF)) {
            float a2 = fs2Var.f.a(rectF) * this.f2139a.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void f(Canvas canvas) {
        boolean z;
        Paint paint = this.o;
        Path path = this.h;
        fs2 fs2Var = this.m;
        RectF rectF = this.j;
        rectF.set(g());
        Paint.Style style = this.f2139a.u;
        float f = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f, f);
        e(canvas, paint, path, fs2Var, rectF);
    }

    public final RectF g() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2139a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2139a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        er1 er1Var = this.f2139a;
        if (er1Var.p == 2) {
            return;
        }
        if (er1Var.f1978a.d(g())) {
            outline.setRoundRect(getBounds(), this.f2139a.f1978a.e.a(g()) * this.f2139a.j);
            return;
        }
        RectF g = g();
        Path path = this.g;
        a(g, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2139a.h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF g = g();
        Path path = this.g;
        a(g, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f2139a.f1979b = new rp0(context);
        m();
    }

    public final void i(float f) {
        er1 er1Var = this.f2139a;
        if (er1Var.n != f) {
            er1Var.n = f;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f2139a.f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f2139a.e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f2139a.d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f2139a.c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        er1 er1Var = this.f2139a;
        if (er1Var.c != colorStateList) {
            er1Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2139a.c != null && color2 != (colorForState2 = this.f2139a.c.getColorForState(iArr, (color2 = (paint2 = this.n).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.f2139a.d != null && color != (colorForState = this.f2139a.d.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        er1 er1Var = this.f2139a;
        this.s = b(er1Var.f, er1Var.g, this.n, true);
        er1 er1Var2 = this.f2139a;
        this.t = b(er1Var2.e, er1Var2.g, this.o, false);
        er1 er1Var3 = this.f2139a;
        if (er1Var3.t) {
            this.p.a(er1Var3.f.getColorForState(getState(), 0));
        }
        if (!w12.a(porterDuffColorFilter, this.s) || !w12.a(porterDuffColorFilter2, this.t)) {
            return true;
        }
        return false;
    }

    public final void m() {
        er1 er1Var = this.f2139a;
        float f = er1Var.n + er1Var.o;
        er1Var.q = (int) Math.ceil(0.75f * f);
        this.f2139a.r = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2139a = new er1(this.f2139a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean k = k(iArr);
        boolean l = l();
        if (!k && !l) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        er1 er1Var = this.f2139a;
        if (er1Var.l != i) {
            er1Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2139a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.rs2
    public final void setShapeAppearanceModel(fs2 fs2Var) {
        this.f2139a.f1978a = fs2Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.h93
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2139a.f = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        er1 er1Var = this.f2139a;
        if (er1Var.g != mode) {
            er1Var.g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public fr1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(fs2.b(context, attributeSet, i, i2).b());
    }

    public fr1(fs2 fs2Var) {
        this(new er1(fs2Var));
    }

    public fr1(er1 er1Var) {
        is2 is2Var;
        this.f2140b = new ps2[4];
        this.c = new ps2[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new es2();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            is2Var = gs2.f2316a;
        } else {
            is2Var = new is2();
        }
        this.r = is2Var;
        this.u = new RectF();
        this.v = true;
        this.f2139a = er1Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.q = new ja1(this, 26);
    }
}
