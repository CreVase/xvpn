package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class x10 {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f5104a;
    public float a0;

    /* renamed from: b, reason: collision with root package name */
    public float f5105b;
    public float b0;
    public final Rect c;
    public CharSequence c0;
    public final Rect d;
    public final RectF e;
    public ColorStateList j;
    public ColorStateList k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public Typeface r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public su y;
    public int f = 16;
    public int g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt z = TextUtils.TruncateAt.END;
    public final boolean D = true;
    public final int d0 = 1;
    public final float e0 = 1.0f;
    public final int f0 = i13.m;

    public x10(View view) {
        this.f5104a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = pb.f3811a;
        return hx2.f(f2, f, f3, f);
    }

    public final boolean b(CharSequence charSequence) {
        v63 v63Var;
        WeakHashMap weakHashMap = ll3.f3151a;
        boolean z = true;
        if (vk3.d(this.f5104a) != 1) {
            z = false;
        }
        if (this.D) {
            if (z) {
                v63Var = w63.d;
            } else {
                v63Var = w63.c;
            }
            return v63Var.b(charSequence, charSequence.length());
        }
        return z;
    }

    public final void c(float f, boolean z) {
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        Typeface typeface;
        boolean z4;
        boolean z5;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = this.i;
            f3 = this.V;
            this.F = 1.0f;
            typeface = this.r;
        } else {
            float f4 = this.h;
            float f5 = this.W;
            Typeface typeface2 = this.u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f, this.Q) / this.h;
            }
            float f6 = this.i / this.h;
            float f7 = width2 * f6;
            if (!z && f7 > width) {
                width = Math.min(width / f6, width2);
            } else {
                width = width2;
            }
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (width > 0.0f) {
            if (this.G != f2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.X != f3) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (this.x != typeface) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.Y != null && width != r10.getWidth()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z6 && !z7 && !z9 && !z8 && !this.M) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.G = f2;
            this.X = f3;
            this.x = typeface;
            this.M = false;
            if (this.F != 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setLinearText(z10);
        } else {
            z4 = false;
        }
        if (this.B == null || z4) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.x);
            textPaint.setLetterSpacing(this.X);
            boolean b2 = b(this.A);
            this.C = b2;
            int i = this.d0;
            if (i > 1 && !b2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f, b2 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.C) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.C) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                i13 i13Var = new i13(this.A, textPaint, (int) width);
                i13Var.l = this.z;
                i13Var.k = b2;
                i13Var.e = alignment;
                i13Var.j = false;
                i13Var.f = i;
                float f8 = this.e0;
                i13Var.g = 0.0f;
                i13Var.h = f8;
                i13Var.i = this.f0;
                staticLayout = i13Var.a();
            } catch (h13 e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayout = null;
            }
            staticLayout.getClass();
            this.Y = staticLayout;
            this.B = staticLayout.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.t;
            if (typeface != null) {
                this.s = cp3.F(configuration, typeface);
            }
            Typeface typeface2 = this.w;
            if (typeface2 != null) {
                this.v = cp3.F(configuration, typeface2);
            }
            Typeface typeface3 = this.s;
            if (typeface3 == null) {
                typeface3 = this.t;
            }
            this.r = typeface3;
            Typeface typeface4 = this.v;
            if (typeface4 == null) {
                typeface4 = this.w;
            }
            this.u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z) {
        float f;
        float f2;
        StaticLayout staticLayout;
        View view = this.f5104a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z) {
            c(1.0f, z);
            CharSequence charSequence = this.B;
            TextPaint textPaint = this.N;
            if (charSequence != null && (staticLayout = this.Y) != null) {
                this.c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.z);
            }
            CharSequence charSequence2 = this.c0;
            if (charSequence2 != null) {
                this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.C ? 1 : 0);
            int i = absoluteGravity & 112;
            Rect rect = this.d;
            if (i != 48) {
                if (i != 80) {
                    this.m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.m = rect.top;
            }
            int i2 = absoluteGravity & 8388615;
            if (i2 != 1) {
                if (i2 != 5) {
                    this.o = rect.left;
                } else {
                    this.o = rect.right - this.Z;
                }
            } else {
                this.o = rect.centerX() - (this.Z / 2.0f);
            }
            c(0.0f, z);
            StaticLayout staticLayout2 = this.Y;
            if (staticLayout2 != null) {
                f = staticLayout2.getHeight();
            } else {
                f = 0.0f;
            }
            StaticLayout staticLayout3 = this.Y;
            if (staticLayout3 != null && this.d0 > 1) {
                f2 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.B;
                if (charSequence3 != null) {
                    f2 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f2 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.C ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            Rect rect2 = this.c;
            if (i3 != 48) {
                if (i3 != 80) {
                    this.l = rect2.centerY() - (f / 2.0f);
                } else {
                    this.l = textPaint.descent() + (rect2.bottom - f);
                }
            } else {
                this.l = rect2.top;
            }
            int i4 = absoluteGravity2 & 8388615;
            if (i4 != 1) {
                if (i4 != 5) {
                    this.n = rect2.left;
                } else {
                    this.n = rect2.right - f2;
                }
            } else {
                this.n = rect2.centerX() - (f2 / 2.0f);
            }
            Bitmap bitmap = this.E;
            if (bitmap != null) {
                bitmap.recycle();
                this.E = null;
            }
            l(this.f5105b);
            float f3 = this.f5105b;
            float f4 = f(rect2.left, rect.left, f3, this.P);
            RectF rectF = this.e;
            rectF.left = f4;
            rectF.top = f(this.l, this.m, f3, this.P);
            rectF.right = f(rect2.right, rect.right, f3, this.P);
            rectF.bottom = f(rect2.bottom, rect.bottom, f3, this.P);
            this.p = f(this.n, this.o, f3, this.P);
            this.q = f(this.l, this.m, f3, this.P);
            l(f3);
            uv0 uv0Var = pb.f3812b;
            this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, uv0Var);
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(view);
            this.b0 = f(1.0f, 0.0f, f3, uv0Var);
            uk3.k(view);
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f3, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.V;
            float f6 = this.W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f3, uv0Var));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.H = f(0.0f, this.R, f3, null);
            this.I = f(0.0f, this.S, f3, null);
            this.J = f(0.0f, this.T, f3, null);
            int a2 = a(f3, e(null), e(this.U));
            this.K = a2;
            textPaint.setShadowLayer(this.H, this.I, this.J, a2);
            uk3.k(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k != colorStateList || this.j != colorStateList) {
            this.k = colorStateList;
            this.j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        su suVar = this.y;
        if (suVar != null) {
            suVar.n = true;
        }
        if (this.t != typeface) {
            this.t = typeface;
            Typeface F = cp3.F(this.f5104a.getContext().getResources().getConfiguration(), typeface);
            this.s = F;
            if (F == null) {
                F = this.t;
            }
            this.r = F;
            return true;
        }
        return false;
    }

    public final void k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f5105b) {
            this.f5105b = f;
            float f2 = this.c.left;
            Rect rect = this.d;
            float f3 = f(f2, rect.left, f, this.P);
            RectF rectF = this.e;
            rectF.left = f3;
            rectF.top = f(this.l, this.m, f, this.P);
            rectF.right = f(r2.right, rect.right, f, this.P);
            rectF.bottom = f(r2.bottom, rect.bottom, f, this.P);
            this.p = f(this.n, this.o, f, this.P);
            this.q = f(this.l, this.m, f, this.P);
            l(f);
            uv0 uv0Var = pb.f3812b;
            this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, uv0Var);
            WeakHashMap weakHashMap = ll3.f3151a;
            View view = this.f5104a;
            uk3.k(view);
            this.b0 = f(1.0f, 0.0f, f, uv0Var);
            uk3.k(view);
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.V;
            float f5 = this.W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(f(f5, f4, f, uv0Var));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.H = f(0.0f, this.R, f, null);
            this.I = f(0.0f, this.S, f, null);
            this.J = f(0.0f, this.T, f, null);
            int a2 = a(f, e(null), e(this.U));
            this.K = a2;
            textPaint.setShadowLayer(this.H, this.I, this.J, a2);
            uk3.k(view);
        }
    }

    public final void l(float f) {
        c(f, false);
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.k(this.f5104a);
    }

    public final void m(Typeface typeface) {
        boolean z;
        boolean j = j(typeface);
        if (this.w != typeface) {
            this.w = typeface;
            Typeface F = cp3.F(this.f5104a.getContext().getResources().getConfiguration(), typeface);
            this.v = F;
            if (F == null) {
                F = this.w;
            }
            this.u = F;
            z = true;
        } else {
            z = false;
        }
        if (j || z) {
            h(false);
        }
    }
}
