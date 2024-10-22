package com.security.xvpn.z35kb.livechat;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.security.xvpn.z35kb.R;
import defpackage.bw3;
import defpackage.ck2;
import defpackage.cz;
import defpackage.dz;
import defpackage.fb;
import defpackage.fz;
import defpackage.jk2;
import defpackage.ky;
import defpackage.lt3;
import defpackage.m4;
import defpackage.oa2;
import defpackage.pd0;
import defpackage.py;
import defpackage.tf3;
import defpackage.tt3;
import defpackage.ua1;
import defpackage.uu3;
import defpackage.v73;
import defpackage.zf3;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a extends ViewGroup implements ValueAnimator.AnimatorUpdateListener {
    public Drawable A;
    public final int B;
    public final SpannableString C;
    public final TextPaint D;
    public StaticLayout E;
    public final Paint F;
    public boolean G;
    public final int H;
    public final ky I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public final oa2 P;
    public fb Q;
    public final RectF R;

    /* renamed from: a, reason: collision with root package name */
    public tt3 f1605a;

    /* renamed from: b, reason: collision with root package name */
    public StaticLayout f1606b;
    public final TextPaint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float h0;
    public SpannableString i;
    public final int[] i0;
    public float j;
    public final int j0;
    public boolean k;
    public boolean k0;
    public float l;
    public boolean l0;
    public boolean m;
    public boolean m0;
    public final Paint n;
    public final GestureDetector n0;
    public boolean o;
    public final dz o0;
    public boolean p;
    public final m4 p0;
    public final ValueAnimator q;
    public float r;
    public final Rect s;
    public final RectF t;
    public String u;
    public boolean v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    public a(lt3 lt3Var, ky kyVar) {
        super(lt3Var);
        this.g = 0;
        this.h = 0;
        this.j = 0.0f;
        this.k = false;
        this.l = 0.0f;
        this.m = false;
        this.r = 0.0f;
        this.s = new Rect();
        this.t = new RectF();
        this.u = "";
        this.B = tf3.D(36);
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        this.F = new Paint(1);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.R = new RectF();
        this.i0 = new int[]{-1099190, -1036616, -12992166, -2535939, -474338, -13462018};
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = new GestureDetector(getContext(), new fz(this));
        this.o0 = new dz(this);
        this.p0 = new m4(this);
        this.I = kyVar;
        setWillNotDraw(false);
        setClickable(true);
        TextPaint textPaint2 = new TextPaint();
        this.c = textPaint2;
        textPaint2.setTextSize(cz.e);
        textPaint2.setAntiAlias(true);
        textPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint2.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint2.linkColor = -13982994;
        Paint paint = new Paint();
        paint.setColor(-1644824);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(5);
        this.d = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.n = paint3;
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(cz.k);
        paint3.setTextSize(cz.e);
        paint3.setTextAlign(Paint.Align.CENTER);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.9f);
        this.q = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(500L);
        ofFloat.setRepeatCount(-1);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setColor(-4671304);
        textPaint.setTextSize(tf3.D(14));
        String y = pd0.y(R.string.HoldMessageTo);
        SpannableString spannableString = new SpannableString(y);
        this.C = spannableString;
        int indexOf = y.indexOf("000");
        int indexOf2 = y.indexOf("111");
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = jk2.f2780a;
        Drawable a2 = ck2.a(resources, R.drawable.ic_livechat_mark_upgrade, theme);
        Drawable a3 = ck2.a(getResources(), R.drawable.ic_livechat_mark_downgrade, getContext().getTheme());
        int D = tf3.D(16);
        a2.setBounds(0, 0, D, D);
        a3.setBounds(0, 0, D, D);
        spannableString.setSpan(new ImageSpan(a3), indexOf, indexOf + 3, 17);
        spannableString.setSpan(new ImageSpan(a2), indexOf2, indexOf2 + 3, 17);
        this.j0 = tf3.D(8);
        this.H = (int) Math.ceil(2.5f * tf3.F);
        this.P = new oa2();
        c();
    }

    private int getBreakStrategy() {
        return 1;
    }

    private float getTextLayoutBottom() {
        return getTextLayoutTop() + this.f1606b.getHeight();
    }

    private float getTextLayoutLeft() {
        int i;
        if (this.f1605a.f4578b) {
            i = this.e + cz.c;
        } else {
            i = this.e;
        }
        return i;
    }

    private float getTextLayoutRight() {
        if (this.f1606b.getLineCount() == 1) {
            return this.f1606b.getLineWidth(0) + getTextLayoutLeft();
        }
        return getTextLayoutLeft() + this.f1606b.getWidth();
    }

    private float getTextLayoutTop() {
        int i;
        if (this.f1605a.f4578b) {
            i = this.f;
        } else {
            i = this.f;
        }
        return i;
    }

    public final void a(Canvas canvas, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        RectF rectF;
        float f;
        float f2;
        boolean z3;
        Drawable drawable;
        Drawable drawable2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        tt3 tt3Var = this.f1605a;
        boolean z4 = true;
        if (!tt3Var.n && !tt3Var.o) {
            z2 = false;
        } else {
            z2 = true;
        }
        fb fbVar = this.Q;
        if (fbVar != null) {
            valueAnimator = fbVar.f2067a;
        } else {
            valueAnimator = null;
        }
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            z4 = false;
        }
        if (!z2 && !z4) {
            return;
        }
        if (z) {
            rectF = this.R;
        } else {
            rectF = this.t;
        }
        if (z) {
            f = -cz.h;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = -cz.g;
        } else {
            f2 = 0.0f;
        }
        float f9 = rectF.right;
        int i = cz.f1703b;
        int i2 = this.B;
        float D = ((f9 + i) - i2) + f + tf3.D(4);
        float f10 = ((rectF.bottom + i) - i2) + f2 + this.H;
        float f11 = i2 + D;
        float f12 = i2 + f10;
        if (z4) {
            z3 = this.Q.c;
        } else {
            z3 = this.f1605a.n;
        }
        if (z2 || z4) {
            boolean l = v73.l();
            if (z3) {
                if (!l && this.x == null) {
                    Resources resources = getResources();
                    Resources.Theme theme = getContext().getTheme();
                    ThreadLocal threadLocal = jk2.f2780a;
                    this.x = ck2.a(resources, R.drawable.livechat_mark_upgrade, theme);
                } else if (l && this.y == null) {
                    Resources resources2 = getResources();
                    Resources.Theme theme2 = getContext().getTheme();
                    ThreadLocal threadLocal2 = jk2.f2780a;
                    this.y = ck2.a(resources2, R.drawable.livechat_mark_upgrade_dark, theme2);
                }
                if (l) {
                    drawable2 = this.y;
                } else {
                    drawable2 = this.x;
                }
                this.w = drawable2;
            } else {
                if (!l && this.z == null) {
                    Resources resources3 = getResources();
                    Resources.Theme theme3 = getContext().getTheme();
                    ThreadLocal threadLocal3 = jk2.f2780a;
                    this.z = ck2.a(resources3, R.drawable.livechat_mark_downgrade, theme3);
                } else if (l && this.A == null) {
                    Resources resources4 = getResources();
                    Resources.Theme theme4 = getContext().getTheme();
                    ThreadLocal threadLocal4 = jk2.f2780a;
                    this.A = ck2.a(resources4, R.drawable.livechat_mark_downgrade_dark, theme4);
                }
                if (l) {
                    drawable = this.A;
                } else {
                    drawable = this.z;
                }
                this.w = drawable;
            }
        }
        if (z2 && !z4) {
            this.w.setBounds((int) D, (int) f10, (int) (D + i2), (int) (f10 + i2));
            this.w.draw(canvas);
            return;
        }
        if (!z4) {
            return;
        }
        float f13 = this.Q.f2068b;
        float f14 = cz.f1703b / 2.0f;
        float f15 = (f14 * 2.0f) + i2;
        float f16 = D - f14;
        float f17 = f10 - f14;
        int i3 = this.j0;
        float f18 = ((f15 - i3) * f13 * 1.25f) + i3;
        if (f13 < 0.2f) {
            f4 = f18 / 2.0f;
            f3 = f10;
        } else if (f13 < 0.8f) {
            f3 = f10;
            float f19 = ((f15 - i3) / 2.0f) + i3;
            f4 = (f19 - (((f13 - 0.2f) * f19) * 1.6666f)) / 2.0f;
        } else {
            f3 = f10;
            f4 = 0.0f;
        }
        if (f13 > 0.4f) {
            if (f13 < 0.8f) {
                f8 = f18 - (f4 * 2.0f);
            } else {
                f8 = ((1.0f - f13) * (f15 - i2) * 5.0f) + i2;
            }
            float f20 = (f15 - f8) / 2.0f;
            float f21 = f16 + f20;
            float f22 = f20 + f17;
            f6 = f12;
            f5 = f11;
            f7 = D;
            this.w.setBounds((int) f21, (int) f22, (int) (f21 + f8), (int) (f22 + f8));
            this.w.draw(canvas);
        } else {
            f5 = f11;
            f6 = f12;
            f7 = D;
        }
        if (f13 > 0.8f) {
            invalidate();
            return;
        }
        float f23 = f4 / 2.0f;
        float f24 = ((((f16 * 2.0f) + f15) - f18) / 2.0f) + f23;
        float f25 = ((((f17 * 2.0f) + f15) - f18) / 2.0f) + f23;
        Paint paint = this.F;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f4);
        paint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        tf3.R().set(f24, f25, (f24 + f18) - f4, (f18 + f25) - f4);
        canvas.drawOval(tf3.R(), paint);
        canvas.save();
        float f26 = i3 / 2.0f;
        float f27 = (1.0f - f13) * i3;
        float f28 = f7 + f5;
        float f29 = (f28 - f27) / 2.0f;
        float f30 = (f17 + f26) - ((f26 * f13) * 1.25f);
        for (int i4 = 0; i4 < 6; i4++) {
            if (i4 != 0) {
                canvas.rotate(60.0f, f28 / 2.0f, (f3 + f6) / 2.0f);
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.i0[i4]);
            tf3.R().set(f29, f30, f29 + f27, f30 + f27);
            canvas.drawOval(tf3.R(), paint);
        }
        canvas.restore();
        invalidate();
    }

    public final int b(float f, float f2) {
        if (this.f1606b == null || f < getTextLayoutLeft() || f > getTextLayoutRight() || f2 < getTextLayoutTop() || f2 > getTextLayoutBottom()) {
            return -1;
        }
        return this.f1606b.getOffsetForHorizontal(this.f1606b.getLineForVertical((int) Math.min(getTextLayoutBottom() - 1.0f, Math.max(0.0f, f2 - getTextLayoutTop()))), Math.min(getTextLayoutRight() - 1.0f, Math.max(0.0f, f - getTextLayoutLeft())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x025a, code lost:            if (r11 <= 8297) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0264, code lost:            if (r11 <= 65528) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x026d, code lost:            if (r11 <= 921599) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0277, code lost:            if (r11 <= 65007) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0286, code lost:            if (r11 <= 8399) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0290, code lost:            if (r11 <= 57343) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0216, code lost:            if (r9 != 2) goto L128;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.livechat.a.c():void");
    }

    public int getContentRight() {
        float f;
        if (this.k) {
            f = this.t.right;
        } else {
            RectF rectF = this.R;
            f = rectF.right + rectF.left;
        }
        return (int) f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k) {
            ua1.b(getContext()).c(this.u, this.h, this.g, this.o0);
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.k) {
            ua1 b2 = ua1.b(getContext());
            b2.f4642b.remove(this.u);
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this);
        }
    }

    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (dragEvent.getAction() != 2) {
            return super.onDragEvent(dragEvent);
        }
        Selection.setSelection(this.i, b(dragEvent.getX(), dragEvent.getY()));
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        float f;
        float f2;
        int i3;
        int i4;
        super.onDraw(canvas);
        if (this.O) {
            canvas.save();
            int height = getHeight() - cz.f1703b;
            oa2 oa2Var = this.P;
            StaticLayout staticLayout = (StaticLayout) oa2Var.f3630a;
            if (staticLayout != null) {
                i4 = staticLayout.getHeight();
            } else {
                i4 = 0;
            }
            canvas.translate(0.0f, height - i4);
            ((TextPaint) oa2Var.f3631b).setColor(v73.j(1000014));
            ((StaticLayout) oa2Var.f3630a).draw(canvas);
            canvas.restore();
        }
        canvas.save();
        tt3 tt3Var = this.f1605a;
        if (tt3Var != null && tt3Var.f4578b) {
            canvas.translate(cz.c, 0.0f);
            if (this.f1605a.j) {
                cz.r.draw(canvas);
            } else {
                cz.q.draw(canvas);
            }
        }
        if (v73.l()) {
            if (this.f1605a.f4578b) {
                this.M = -13421773;
            } else {
                this.M = -15121607;
            }
            this.K = -9079435;
        } else if (this.f1605a.f4578b) {
            this.M = -2894893;
            this.K = -12166042;
        } else {
            this.M = -15295105;
            this.K = -1;
        }
        boolean z3 = this.k;
        RectF rectF = this.t;
        RectF rectF2 = this.R;
        TextPaint textPaint = this.c;
        Paint paint = this.d;
        if (z3) {
            this.f = 0;
            this.e = cz.d + cz.f1702a;
            if (!this.f1605a.f4578b) {
                this.e = (getWidth() - cz.c) - this.h;
            }
            rectF.set(0.0f, 0.0f, this.h, this.g);
            rectF.offset(this.e, this.f);
            boolean z4 = this.m;
            Paint paint2 = this.n;
            if (z4) {
                if (((Bitmap) ua1.b(getContext()).f4641a.get(this.u)) == null) {
                    this.m = false;
                    ua1.b(getContext()).c(this.u, this.h, this.g, this.o0);
                } else {
                    canvas.save();
                    Path path = new Path();
                    float f3 = cz.i;
                    path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                    canvas.clipPath(path);
                    textPaint.setColor(-16777216);
                    canvas.drawBitmap((Bitmap) ua1.b(getContext()).f4641a.get(this.u), this.e, this.f, textPaint);
                    canvas.restore();
                    if (this.G) {
                        canvas.save();
                        canvas.translate(rectF.left, rectF.height() + cz.n);
                        this.E.draw(canvas);
                        canvas.restore();
                    }
                    a(canvas, false);
                    i3 = 855638016;
                }
            } else {
                rectF2.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
                paint.setColor(-2367259);
                float f4 = cz.i;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
                RectF rectF3 = new RectF(rectF.centerX() - cz.j, rectF.centerY() - cz.j, rectF.centerX() + cz.j, rectF.centerY() + cz.j);
                paint2.setStrokeWidth(cz.k);
                paint2.setColor(855638016);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), (cz.k / 2) + cz.j, paint2);
                paint2.setColor(-1);
                paint2.setStyle(Paint.Style.STROKE);
                i3 = 855638016;
                canvas.drawArc(rectF3, -90.0f, this.l * 360.0f, false, paint2);
                paint2.setStrokeWidth(1.0f);
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                if (!this.o) {
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    canvas.drawText(Float.valueOf(this.l * 100.0f).intValue() + "%", rectF3.centerX(), (int) ((rectF3.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), paint2);
                }
            }
            if (this.o) {
                RectF rectF4 = new RectF(rectF.centerX() - cz.j, rectF.centerY() - cz.j, rectF.centerX() + cz.j, rectF.centerY() + cz.j);
                paint2.setStrokeWidth(cz.k);
                paint2.setColor(i3);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), (cz.k / 2) + cz.j, paint2);
                paint2.setColor(-1);
                paint2.setStyle(Paint.Style.STROKE);
                canvas.drawArc(rectF4, this.r, 80.0f, false, paint2);
            }
        } else {
            this.f = 0;
            this.e = cz.d + cz.f1702a;
            if (!this.f1605a.f4578b) {
                this.e = (int) (((getWidth() - cz.c) - this.j) - (cz.h * 2));
                this.J = -1;
                this.L = v73.j(1000077);
            } else {
                this.J = v73.y();
                this.L = v73.e();
            }
            if (this.v) {
                i = this.M;
            } else {
                i = this.L;
            }
            paint.setColor(i);
            if (this.v) {
                i2 = this.K;
            } else {
                i2 = this.J;
            }
            textPaint.setColor(i2);
            rectF2.set(0.0f, 0.0f, this.j + (cz.h * 2), (cz.g * 2) + this.f1606b.getHeight());
            float f5 = this.e;
            this.h0 = f5;
            canvas.translate(f5, this.f);
            float f6 = cz.i;
            canvas.drawRoundRect(rectF2, f6, f6, paint);
            if (this.v) {
                float width = rectF2.width();
                int i5 = cz.G;
                if (i5 == 0) {
                    i5 = tf3.D(100);
                }
                boolean z5 = this.f1605a.f4578b;
                if (!z5 && width >= i5) {
                    z = false;
                } else {
                    z = true;
                }
                if (z5 && width >= i5) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (cz.F) {
                    float f7 = rectF2.top;
                    f2 = f7;
                    f = cz.i + f7;
                } else {
                    float f8 = rectF2.bottom;
                    f = f8;
                    f2 = f8 - cz.i;
                }
                if (z) {
                    float f9 = rectF2.left;
                    canvas.drawRect(f9, f2, f9 + cz.i, f, paint);
                }
                if (z2) {
                    float f10 = rectF2.right;
                    canvas.drawRect(f10 - cz.i, f2, f10, f, paint);
                }
            }
            if (this.G) {
                canvas.save();
                canvas.translate(0.0f, rectF2.height() + cz.n);
                this.E.draw(canvas);
                canvas.restore();
            }
            this.e += cz.h;
            this.f += cz.g;
            canvas.translate(cz.h, cz.g);
            this.f1606b.draw(canvas);
            a(canvas, true);
        }
        canvas.restore();
        boolean z6 = this.f1605a.f4578b;
        Rect rect = this.s;
        if (!z6 && this.p) {
            int intrinsicWidth = cz.s.getIntrinsicWidth() / 2;
            int i6 = (this.e - intrinsicWidth) - cz.l;
            int i7 = (this.g / 2) + this.f;
            if (!TextUtils.equals("Image", this.f1605a.d)) {
                i7 = (this.f1606b.getHeight() / 2) + 0;
                i6 = ((-cz.h) - intrinsicWidth) - cz.l;
            }
            int i8 = intrinsicWidth * 2;
            rect.set(i6, i7, i6 + i8, i8 + i7);
            int i9 = -intrinsicWidth;
            rect.offset(i9, i9);
            if (!TextUtils.equals("Image", this.f1605a.d)) {
                rect.offset(this.e, this.f);
            }
            cz.s.setBounds(rect);
            cz.s.draw(canvas);
        }
        tt3 tt3Var2 = this.f1605a;
        if (!tt3Var2.f4578b && this.o && !TextUtils.equals("Image", tt3Var2.d)) {
            int intrinsicWidth2 = cz.t.getIntrinsicWidth() / 2;
            int i10 = (this.e - intrinsicWidth2) - cz.l;
            int i11 = (this.g / 2) + this.f;
            if (!TextUtils.equals("Image", this.f1605a.d)) {
                i11 = (this.f1606b.getHeight() / 2) + 0;
                i10 = ((-cz.h) - intrinsicWidth2) - cz.l;
            }
            int i12 = intrinsicWidth2 * 2;
            rect.set(i10, i11, i10 + i12, i12 + i11);
            int i13 = -intrinsicWidth2;
            rect.offset(i13, i13);
            if (!TextUtils.equals("Image", this.f1605a.d)) {
                rect.offset(this.e, this.f);
            }
            canvas.rotate(this.r, rect.centerX(), rect.centerY());
            cz.t.setBounds(rect);
            cz.t.draw(canvas);
        }
        if (this.f1605a.f4578b) {
            rectF.offset(cz.c, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        tt3 tt3Var;
        if (TextUtils.equals("Image", this.f1605a.d)) {
            i5 = cz.f1703b * 2;
            i3 = this.g;
        } else {
            StaticLayout staticLayout = this.f1606b;
            if (staticLayout != null) {
                i3 = (cz.f1703b * 2) + staticLayout.getHeight();
                i4 = cz.g;
            } else {
                i3 = (cz.f1703b * 2) + cz.f1702a;
                i4 = cz.g;
            }
            i5 = i4 * 2;
        }
        int i7 = i5 + i3;
        if (this.G || (cz.B && (tt3Var = cz.C) != null && this.f1605a.f4577a.equals(tt3Var.f4577a))) {
            i7 += tf3.D(30);
        }
        if (this.O) {
            StaticLayout staticLayout2 = (StaticLayout) this.P.f3630a;
            if (staticLayout2 != null) {
                i6 = staticLayout2.getHeight();
            } else {
                i6 = 0;
            }
            i7 += i6;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int action = motionEvent.getAction();
        RectF rectF = this.t;
        Rect rect = this.s;
        int i3 = 0;
        if (action != 0) {
            if (action == 1) {
                if (this.k0 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.k0 = false;
                    ChatActivity chatActivity = (ChatActivity) getContext();
                    String str = this.f1605a.m;
                    Iterator it = chatActivity.n.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i4 = i3 + 1;
                        tt3 tt3Var = (tt3) it.next();
                        if (TextUtils.equals(tt3Var.m, str)) {
                            zf3.T(chatActivity, null, new py(tt3Var, chatActivity, i3, null), 3);
                            break;
                        }
                        i3 = i4;
                    }
                    return true;
                }
                if (this.l0) {
                    rectF.contains(motionEvent.getX(), motionEvent.getY());
                }
            }
        } else {
            if (this.p && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.k0 = true;
                return true;
            }
            if (this.k) {
                float x = motionEvent.getX();
                if (this.f1605a.f4578b) {
                    i2 = cz.c;
                } else {
                    i2 = 0;
                }
                if (rectF.contains(x - i2, motionEvent.getY())) {
                    this.l0 = true;
                    this.p0.f3229b = this.u;
                }
            }
            boolean z = this.f1605a.p;
            RectF rectF2 = this.R;
            if (z && rectF2.contains(motionEvent.getX() - cz.c, motionEvent.getY())) {
                this.m0 = true;
            }
            if (this.i != null) {
                boolean z2 = this.k;
                if (z2 && !this.l0) {
                    return false;
                }
                if (!z2) {
                    float x2 = motionEvent.getX() - this.h0;
                    if (this.f1605a.f4578b) {
                        i = cz.c;
                    } else {
                        i = 0;
                    }
                    if (!rectF2.contains(x2 - i, motionEvent.getY())) {
                        return false;
                    }
                }
            }
        }
        if (this.n0.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setData(tt3 tt3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        StaticLayout.Builder obtain;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder alignment;
        StaticLayout build;
        StaticLayout.Builder obtain2;
        StaticLayout.Builder breakStrategy2;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout.Builder alignment2;
        StaticLayout build2;
        tt3 tt3Var2;
        this.l = 0.0f;
        this.m = false;
        this.f1605a = tt3Var;
        boolean z4 = true;
        if (tt3Var.h == cz.x) {
            z = true;
        } else {
            z = false;
        }
        setSending(z);
        if (tt3Var.h == cz.z) {
            z2 = true;
        } else {
            z2 = false;
        }
        setSendFailed(z2);
        String str = tt3Var.g;
        String str2 = tt3Var.c;
        if (bw3.c(str)) {
            str = str2;
        }
        this.u = str;
        c();
        if (!cz.A && (tt3Var2 = cz.C) != null && tt3Var.f4577a.equals(tt3Var2.f4577a)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.G = z3;
        tt3 tt3Var3 = cz.D;
        if (tt3Var3 == null || !tt3Var.f4577a.equals(tt3Var3.f4577a) || !tt3Var.m.equals(tt3Var3.m)) {
            z4 = false;
        }
        this.v = z4;
        this.Q = (fb) uu3.f4743a.get(tt3Var.f4577a + tt3Var.m);
        if (this.G) {
            int i = Build.VERSION.SDK_INT;
            TextPaint textPaint = this.D;
            SpannableString spannableString = this.C;
            if (i >= 24) {
                obtain2 = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, cz.f);
                breakStrategy2 = obtain2.setBreakStrategy(getBreakStrategy());
                hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(0);
                alignment2 = hyphenationFrequency2.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                build2 = alignment2.build();
                this.E = build2;
            } else {
                this.E = new StaticLayout(spannableString, textPaint, cz.f, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, false);
            }
            if (i >= 24) {
                obtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) this.E.getLineWidth(0));
                breakStrategy = obtain.setBreakStrategy(getBreakStrategy());
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
                alignment = hyphenationFrequency.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                build = alignment.build();
                this.E = build;
            } else {
                this.E = new StaticLayout(spannableString, textPaint, (int) this.E.getLineWidth(0), Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, false);
            }
        }
        invalidate();
    }

    public void setSendFailed(boolean z) {
        this.p = z;
        postInvalidate();
    }

    public void setSending(boolean z) {
        this.o = z;
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator.isStarted() && !z) {
            valueAnimator.cancel();
            postInvalidate();
        } else if (!valueAnimator.isStarted() && z) {
            valueAnimator.start();
        }
    }
}
