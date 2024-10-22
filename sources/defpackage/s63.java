package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class s63 {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4282b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public s63(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, bg2.TextAppearance);
        this.k = obtainStyledAttributes.getDimension(bg2.TextAppearance_android_textSize, 0.0f);
        this.j = m20.j0(context, obtainStyledAttributes, bg2.TextAppearance_android_textColor);
        m20.j0(context, obtainStyledAttributes, bg2.TextAppearance_android_textColorHint);
        m20.j0(context, obtainStyledAttributes, bg2.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(bg2.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(bg2.TextAppearance_android_typeface, 1);
        int i2 = bg2.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : bg2.TextAppearance_android_fontFamily;
        this.l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f4282b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(bg2.TextAppearance_textAllCaps, false);
        this.f4281a = m20.j0(context, obtainStyledAttributes, bg2.TextAppearance_android_shadowColor);
        this.e = obtainStyledAttributes.getFloat(bg2.TextAppearance_android_shadowDx, 0.0f);
        this.f = obtainStyledAttributes.getFloat(bg2.TextAppearance_android_shadowDy, 0.0f);
        this.g = obtainStyledAttributes.getFloat(bg2.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, bg2.MaterialTextAppearance);
        int i3 = bg2.MaterialTextAppearance_android_letterSpacing;
        this.h = obtainStyledAttributes2.hasValue(i3);
        this.i = obtainStyledAttributes2.getFloat(i3, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.f4282b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        this.n = Typeface.DEFAULT;
                    } else {
                        this.n = Typeface.MONOSPACE;
                    }
                } else {
                    this.n = Typeface.SERIF;
                }
            } else {
                this.n = Typeface.SANS_SERIF;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = jk2.b(context, this.l);
                this.n = b2;
                if (b2 != null) {
                    this.n = Typeface.create(b2, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, bx3 bx3Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            bx3Var.Q(this.n, true);
            return;
        }
        try {
            q63 q63Var = new q63(this, bx3Var);
            ThreadLocal threadLocal = jk2.f2780a;
            if (context.isRestricted()) {
                q63Var.s(-4);
            } else {
                jk2.c(context, i, new TypedValue(), 0, q63Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            bx3Var.P(1);
        } catch (Exception unused2) {
            this.m = true;
            bx3Var.P(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal r0 = defpackage.jk2.f2780a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = defpackage.jk2.c(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s63.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, bx3 bx3Var) {
        int i;
        int i2;
        f(context, textPaint, bx3Var);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        ColorStateList colorStateList2 = this.f4281a;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(this.g, this.e, this.f, i2);
    }

    public final void f(Context context, TextPaint textPaint, bx3 bx3Var) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new r63(this, context, textPaint, bx3Var));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface F = cp3.F(context.getResources().getConfiguration(), typeface);
        if (F != null) {
            typeface = F;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
