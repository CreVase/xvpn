package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* loaded from: classes2.dex */
public final class pn0 extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3877b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final TextPaint j;
    public int k;
    public int l;
    public StaticLayout m;
    public float n;
    public v31 o;
    public boolean p;
    public int q;
    public Drawable r;
    public String s;

    public pn0(Context context) {
        super(context);
        this.f3876a = tf3.K(49);
        int K = tf3.K(20);
        this.f3877b = K;
        this.c = tf3.K(24);
        this.d = tf3.K(15);
        this.e = tf3.K(15);
        this.f = tf3.K(12);
        float f = tf3.F;
        this.g = 3.0f * f;
        this.h = 38 * f;
        float f2 = 15;
        this.i = f * f2;
        TextPaint textPaint = new TextPaint(5);
        this.j = textPaint;
        this.k = K;
        this.o = m01.m;
        this.q = -1;
        this.s = "";
        setBackground(v73.v(0.0f, 1000008, 3));
        setClickable(true);
        textPaint.setColor(v73.j(1000013));
        textPaint.setTextSize(f2 * tf3.F);
        m20.G0(this, new fv2(this, 20));
    }

    public final void a() {
        this.l = Math.max((getWidth() - this.k) - this.e, 0);
        this.m = new StaticLayout(this.s, this.j, this.l, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        this.n = (getHeight() - this.m.getHeight()) / 2.0f;
        invalidate();
    }

    public final void b() {
        int i;
        int i2;
        int i3;
        boolean Y = tf3.Y(this);
        int i4 = this.c;
        int i5 = this.d;
        if (Y) {
            i = (getMeasuredWidth() - i5) - i4;
        } else {
            i = i5;
        }
        if (tf3.Y(this)) {
            i2 = getMeasuredWidth() - i5;
        } else {
            i2 = i5 + i4;
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            int i6 = this.f;
            drawable.setBounds(i, i6, i2, i4 + i6);
        }
        if (this.r == null) {
            i3 = this.f3877b;
        } else {
            i3 = this.f3876a;
        }
        this.k = i3;
        a();
        invalidate();
    }

    public final Drawable getIcon() {
        return this.r;
    }

    public final int getIconRes() {
        return this.q;
    }

    public final v31 getItemClick() {
        return this.o;
    }

    public final boolean getShowRedPoint() {
        return this.p;
    }

    public final String getText() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        this.j.setColor(v73.j(1000013));
        Drawable drawable = this.r;
        if (drawable instanceof h93) {
            ((h93) drawable).setTint(v73.j(1000026));
        } else if (drawable != 0) {
            drawable.setTint(v73.j(1000026));
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (tf3.Y(this)) {
            i = this.e;
        } else {
            i = this.k;
        }
        float f = this.n;
        int save = canvas.save();
        canvas.translate(i, f);
        try {
            StaticLayout staticLayout = this.m;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            canvas.restoreToCount(save);
            if (this.p) {
                canvas.drawCircle(this.h, this.i, this.g, tf3.E(-505040));
            }
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(tf3.K(48), 1073741824));
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        b();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    public final void setIcon(Drawable drawable) {
        this.r = drawable;
        b();
    }

    public final void setIconRes(int i) {
        this.q = i;
        if (i != -1) {
            setIcon(t9.L0(zf3.A(i)));
        }
    }

    public final void setItemClick(v31 v31Var) {
        this.o = v31Var;
    }

    public final void setShowRedPoint(boolean z) {
        this.p = z;
    }

    public final void setText(String str) {
        this.s = str;
        a();
        setContentDescription(str);
    }
}
