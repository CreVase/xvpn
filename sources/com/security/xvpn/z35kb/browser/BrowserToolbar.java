package com.security.xvpn.z35kb.browser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.security.xvpn.z35kb.R;
import defpackage.bx3;
import defpackage.cr1;
import defpackage.er;
import defpackage.fc;
import defpackage.fr;
import defpackage.io0;
import defpackage.o4;
import defpackage.pd0;
import defpackage.tv0;
import defpackage.u01;
import defpackage.ya0;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public class BrowserToolbar extends FrameLayout implements fc {
    public static final /* synthetic */ int Q = 0;
    public EditText A;
    public ValueAnimator B;
    public View C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public Drawable J;
    public String K;
    public StaticLayout L;
    public float M;
    public Drawable N;
    public boolean O;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public fr f1598a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f1599b;
    public RectF c;
    public RectF d;
    public RectF e;
    public Rect f;
    public float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public float r;
    public float s;
    public Paint t;
    public TextPaint u;
    public Paint v;
    public Path w;
    public boolean x;
    public String y;
    public String z;

    public BrowserToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = 0.0f;
        this.y = "";
        this.z = "";
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.K = "";
        this.M = 0.0f;
        this.O = false;
        this.P = false;
        this.h = (int) (bx3.z(context) * 44);
        int z = (int) (bx3.z(context) * 10);
        this.i = z;
        this.j = (int) (bx3.z(context) * 4);
        this.k = (int) (bx3.z(context) * 7);
        this.l = (int) (bx3.z(context) * 9);
        this.m = (int) (bx3.z(context) * 20);
        this.n = (int) (bx3.z(context) * 30);
        this.o = (int) (bx3.z(context) * 50);
        this.p = (int) (bx3.z(context) * 16);
        this.q = (int) (bx3.z(context) * 2);
        bx3.z(context);
        setWillNotDraw(false);
        this.I = getResources().getDrawable(R.drawable.ic_browser_reload);
        this.J = getResources().getDrawable(R.drawable.ic_browser_stop_load);
        this.f1599b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Rect();
        Paint paint = new Paint();
        this.t = paint;
        paint.setColor(-10921639);
        this.t.setStyle(Paint.Style.FILL);
        TextPaint textPaint = new TextPaint();
        this.u = textPaint;
        textPaint.setColor(-1);
        this.u.setTextSize(z);
        this.u.setAntiAlias(true);
        this.u.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint();
        this.v = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.v.setColor(-14908425);
        this.w = new Path();
    }

    @Override // defpackage.cc
    public final void a(int i) {
        this.f1599b.top = Math.abs(i);
        float height = ((this.f1599b.height() - this.m) * 1.0f) / (this.h - r0);
        this.g = height;
        if (height < 0.0f) {
            this.g = 0.0f;
        }
        this.r = this.D.getMeasuredWidth();
        postInvalidateOnAnimation();
    }

    public final void b(int i, String str) {
        if (this.G) {
            this.P = false;
            this.B.setFloatValues(0.0f, this.M);
            this.B.start();
            this.G = false;
        }
        if (i == 4) {
            this.K = str.substring(str.lastIndexOf("=") + 1);
            this.f1598a.a(4, str);
        } else {
            this.f1598a.a(i, str);
        }
    }

    public final void c() {
        View view;
        setUrl("");
        if (this.G && (view = this.D) != null) {
            view.callOnClick();
        }
        EditText editText = this.A;
        if (editText == null) {
            return;
        }
        editText.setTranslationX(0.0f);
        this.A.setAlpha(1.0f);
        this.A.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.O = false;
                    this.F = false;
                    this.E = false;
                }
            } else {
                if (this.O) {
                    this.O = false;
                    fr frVar = this.f1598a;
                    if (frVar != null) {
                        frVar.a(8, null);
                    }
                    return true;
                }
                if (this.F) {
                    this.F = false;
                    if (this.d.contains(motionEvent.getX(), motionEvent.getY()) && motionEvent.getX() >= this.f.left && motionEvent.getX() <= this.f.right) {
                        if (this.G) {
                            this.A.setText("");
                        } else {
                            fr frVar2 = this.f1598a;
                            if (frVar2 != null) {
                                Drawable drawable = this.N;
                                if (drawable == this.I) {
                                    frVar2.a(1, null);
                                } else if (drawable == this.J) {
                                    frVar2.a(2, null);
                                }
                            }
                        }
                        return true;
                    }
                }
                if (this.E && this.d.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.E = false;
                    if (this.A.getText().length() == 0) {
                        this.A.setText(this.z);
                    }
                    this.B.setFloatValues(0.0f, this.M);
                    this.P = true;
                    this.B.reverse();
                    this.G = true;
                    fr frVar3 = this.f1598a;
                    if (frVar3 != null) {
                        frVar3.a(6, this.z);
                    }
                    return true;
                }
            }
        } else {
            if (this.f1599b.top != 0.0f) {
                this.O = true;
                return true;
            }
            if (this.d.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getX() >= this.f.left && motionEvent.getX() <= this.f.right) {
                    this.F = true;
                    return true;
                }
                if (!this.G) {
                    this.E = true;
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getToolbarHeight() {
        return this.f1599b.height();
    }

    public String getUrl() {
        return this.z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof AppBarLayout) {
            ((AppBarLayout) getParent()).a(this);
        }
        EditText editText = (EditText) findViewById(R.id.et_url_input);
        this.A = editText;
        editText.setHint(pd0.y(R.string.BrowserInputHint));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        this.B = ofFloat;
        ofFloat.setDuration(200L);
        this.B.setInterpolator(new tv0());
        this.B.addListener(new o4(this, 8));
        this.B.addUpdateListener(new io0(this, 2));
        this.A.addTextChangedListener(new u01(this, 2));
        this.A.setOnEditorActionListener(new er(this, 0));
        this.D = findViewById(R.id.btn_cancel);
        this.C = findViewById(R.id.btn_toSetting);
        this.D.setTranslationX(0.0f);
        this.D.setOnClickListener(new cr1(this, 14));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-10921639);
        float f = this.o;
        if (this.D.getTranslationX() < this.r - f) {
            float translationX = this.D.getTranslationX();
            if (translationX < 0.0f) {
                translationX = this.r - f;
            }
            f = this.r - translationX;
        }
        this.d.right = getWidth() - f;
        this.t.setColor(-5855578);
        this.t.setAlpha((int) (this.g * 255.0f));
        RectF rectF = this.d;
        int i = this.n;
        canvas.drawRoundRect(rectF, i / 2.0f, i / 2.0f, this.t);
        boolean isEmpty = TextUtils.isEmpty(this.z);
        int i2 = this.j;
        int i3 = this.i;
        if (!isEmpty || this.G) {
            this.N = this.I;
            if (this.x) {
                this.N = this.J;
            } else if (this.G) {
                EditText editText = this.A;
                if (editText != null && editText.getText().length() == 0) {
                    this.N = null;
                } else {
                    this.N = this.J;
                }
            }
            int layoutDirection = getLayoutDirection();
            int i4 = this.l;
            if (layoutDirection == 1) {
                Rect rect = this.f;
                RectF rectF2 = this.d;
                float f2 = rectF2.left;
                rect.set((int) (i3 + f2), ((int) rectF2.top) + i4, (int) ((rectF2.height() + f2) - (i2 * 2)), ((int) this.d.bottom) - i4);
            } else {
                Rect rect2 = this.f;
                RectF rectF3 = this.d;
                int height = (int) ((rectF3.right - rectF3.height()) + (i2 * 2));
                RectF rectF4 = this.d;
                rect2.set(height, ((int) rectF4.top) + i4, ((int) rectF4.right) - i3, ((int) rectF4.bottom) - i4);
            }
            this.N.setBounds(this.f);
            this.N.setAlpha(this.t.getAlpha());
            this.N.draw(canvas);
        }
        this.u.setTextSize((this.g * i2) + i3);
        canvas.save();
        this.f1599b.centerX();
        float f3 = this.d.left;
        this.L.getEllipsizedWidth();
        RectF rectF5 = this.d;
        canvas.translate(rectF5.height() + rectF5.left, this.f1599b.centerY() - ((this.L.getLineDescent(0) - this.L.getLineAscent(0)) / 2.0f));
        this.u.setAlpha((int) ((1.0f - this.A.getAlpha()) * 255.0f));
        try {
            if (!this.G) {
                this.L.draw(canvas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        canvas.restore();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).setAlpha(this.g);
        }
        if (this.x && !this.G) {
            canvas.save();
            canvas.clipPath(this.w);
            this.v.setAlpha((int) (this.g * 255.0f));
            canvas.drawRect(this.e, this.v);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= 0 && i2 >= 0) {
            float f = i;
            this.f1599b.set(0.0f, 0.0f, f, this.h);
            this.c.set(0.0f, i2 - r0, f, i2);
            RectF rectF = this.d;
            int i5 = this.o;
            int i6 = this.k;
            float f2 = i - i5;
            int i7 = this.n;
            rectF.set(i5, i6, f2, i6 + i7);
            if (this.d.width() < this.d.height() * 2.0f) {
                RectF rectF2 = this.d;
                rectF2.right = (rectF2.height() * 2.0f) + rectF2.left;
            }
            this.w.rewind();
            this.w.addRoundRect(this.d, i7 / 2.0f, i7 / 2.0f, Path.Direction.CW);
            RectF rectF3 = this.e;
            RectF rectF4 = this.d;
            float f3 = rectF4.left;
            float f4 = rectF4.bottom;
            rectF3.set(f3, f4 - this.q, rectF4.right, f4);
            setUrl(this.z);
        }
    }

    public void setActionListener(fr frVar) {
        this.f1598a = frVar;
    }

    public void setShowProgress(boolean z) {
        this.x = z;
        postInvalidateOnAnimation();
    }

    public void setUrl(String str) {
        String replaceAll;
        EditText editText;
        EditText editText2;
        int i;
        float f;
        if (str == null) {
            replaceAll = "";
        } else {
            replaceAll = str.replaceAll("\n", "").replaceAll("\r", "").replaceAll("\t", "");
        }
        this.H = TextUtils.isEmpty(replaceAll);
        this.z = replaceAll;
        if (URLUtil.isAboutUrl(replaceAll)) {
            this.y = "";
            this.z = "";
            this.H = true;
        }
        if (URLUtil.isValidUrl(this.z)) {
            try {
                this.z = URLDecoder.decode(this.z);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!this.z.startsWith(ya0.P(this.K)) && !this.z.endsWith(ya0.P(this.K))) {
                this.y = Uri.parse(this.z).getHost();
            } else {
                this.y = this.K;
            }
        } else {
            this.y = this.z;
        }
        EditText editText3 = this.A;
        if (editText3 != null && !this.G) {
            editText3.setText(this.z);
        }
        this.u.setTextSize(this.i + this.j);
        if (this.y == null) {
            this.y = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(this.y, this.u, (int) (this.d.width() - (this.d.height() * 2.0f)), TextUtils.TruncateAt.END);
        this.L = new StaticLayout(ellipsize, 0, ellipsize.length(), this.u, (int) (this.d.width() - (this.d.height() * 2.0f)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.f1599b.centerX();
        float f2 = this.d.left;
        this.L.getEllipsizedWidth();
        this.s = BoringLayout.isBoring(Uri.parse(this.z).getScheme() + "://", this.u).width;
        this.M = (((this.f1599b.centerX() - this.d.left) - ((float) this.p)) - (this.L.getLineWidth(0) / 2.0f)) - this.s;
        if (!this.G && (editText2 = this.A) != null) {
            if (this.H) {
                i = 0;
            } else {
                i = 4;
            }
            editText2.setVisibility(i);
            EditText editText4 = this.A;
            if (this.H) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            editText4.setAlpha(f);
        }
        if (TextUtils.isEmpty(this.z) && (editText = this.A) != null) {
            editText.setTranslationX(0.0f);
            this.A.setAlpha(1.0f);
            this.A.setVisibility(0);
        }
        postInvalidateOnAnimation();
    }

    public void setWebProgress(float f) {
        RectF rectF = this.e;
        rectF.right = (this.d.width() * f) + rectF.left;
        postInvalidateOnAnimation();
    }
}
