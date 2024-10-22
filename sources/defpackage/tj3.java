package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class tj3 extends kj3 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public rj3 f4518b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public tj3() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f4518b = new rj3();
    }

    public static tj3 a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            tj3 tj3Var = new tj3();
            ThreadLocal threadLocal = jk2.f2780a;
            tj3Var.f2957a = ck2.a(resources, i, theme);
            new sj3(tj3Var.f2957a.getConstantState());
            return tj3Var;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                tj3 tj3Var2 = new tj3();
                tj3Var2.inflate(resources, xml, asAttributeSet, theme);
                return tj3Var2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            bn0.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:            if (r10 == false) goto L40;     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return an0.a(drawable);
        }
        return this.f4518b.f4165b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4518b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return bn0.c(drawable);
        }
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2957a != null && Build.VERSION.SDK_INT >= 24) {
            return new sj3(this.f2957a.getConstantState());
        }
        this.f4518b.f4164a = getChangingConfigurations();
        return this.f4518b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4518b.f4165b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4518b.f4165b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return an0.d(drawable);
        }
        return this.f4518b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            rj3 rj3Var = this.f4518b;
            if (rj3Var != null) {
                qj3 qj3Var = rj3Var.f4165b;
                if (qj3Var.n == null) {
                    qj3Var.n = Boolean.valueOf(qj3Var.g.a());
                }
                if (qj3Var.n.booleanValue() || ((colorStateList = this.f4518b.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            this.f4518b = new rj3(this.f4518b);
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        rj3 rj3Var = this.f4518b;
        ColorStateList colorStateList = rj3Var.c;
        if (colorStateList != null && (mode = rj3Var.d) != null) {
            this.c = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        qj3 qj3Var = rj3Var.f4165b;
        if (qj3Var.n == null) {
            qj3Var.n = Boolean.valueOf(qj3Var.g.a());
        }
        if (qj3Var.n.booleanValue()) {
            boolean b2 = rj3Var.f4165b.g.b(iArr);
            rj3Var.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4518b.f4165b.getRootAlpha() != i) {
            this.f4518b.f4165b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            an0.e(drawable, z);
        } else {
            this.f4518b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.h93
    public final void setTint(int i) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            t9.r0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            bn0.h(drawable, colorStateList);
            return;
        }
        rj3 rj3Var = this.f4518b;
        if (rj3Var.c != colorStateList) {
            rj3Var.c = colorStateList;
            this.c = b(colorStateList, rj3Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            bn0.i(drawable, mode);
            return;
        }
        rj3 rj3Var = this.f4518b;
        if (rj3Var.d != mode) {
            rj3Var.d = mode;
            this.c = b(rj3Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public tj3(rj3 rj3Var) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f4518b = rj3Var;
        this.c = b(rj3Var.c, rj3Var.d);
    }
}
