package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class fn0 extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public en0 f2123a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f2124b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean h;
    public qw3 i;
    public long j;
    public long k;
    public dn0 l;
    public int e = 255;
    public int g = -1;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.e
            r3.setAlpha(r9)
            r13.j = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            en0 r9 = r13.f2123a
            int r9 = r9.y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.j = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.d
            if (r9 == 0) goto L65
            long r10 = r13.k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.d = r0
            r13.k = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            en0 r4 = r13.f2123a
            int r4 = r4.z
            int r3 = r3 / r4
            int r4 = r13.e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.k = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            qw3 r14 = r13.i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn0.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        en0 en0Var = this.f2123a;
        if (theme != null) {
            en0Var.c();
            int i = en0Var.h;
            Drawable[] drawableArr = en0Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && bn0.b(drawable)) {
                    bn0.a(drawableArr[i2], theme);
                    en0Var.e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                en0Var.f1965b = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = en0Var.c;
                en0Var.c = i3;
                if (i4 != i3) {
                    en0Var.m = false;
                    en0Var.j = false;
                    return;
                }
                return;
            }
            return;
        }
        en0Var.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.l == null) {
            this.l = new dn0();
        }
        dn0 dn0Var = this.l;
        dn0Var.f1808b = drawable.getCallback();
        drawable.setCallback(dn0Var);
        try {
            if (this.f2123a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            en0 en0Var = this.f2123a;
            if (en0Var.C) {
                drawable.setColorFilter(en0Var.B);
            } else {
                if (en0Var.F) {
                    bn0.h(drawable, en0Var.D);
                }
                en0 en0Var2 = this.f2123a;
                if (en0Var2.G) {
                    bn0.i(drawable, en0Var2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2123a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                t9.o0(drawable, t9.J(this));
            }
            an0.e(drawable, this.f2123a.A);
            Rect rect = this.f2124b;
            if (rect != null) {
                bn0.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            dn0 dn0Var2 = this.l;
            Drawable.Callback callback = (Drawable.Callback) dn0Var2.f1808b;
            dn0Var2.f1808b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            en0 r0 = r9.f2123a
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.c
            if (r0 == 0) goto L29
            r9.d = r0
            en0 r0 = r9.f2123a
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.k = r0
            goto L35
        L29:
            r9.d = r4
            r9.k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            en0 r0 = r9.f2123a
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.c = r0
            r9.g = r10
            if (r0 == 0) goto L5a
            en0 r10 = r9.f2123a
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.c = r4
            r10 = -1
            r9.g = r10
        L5a:
            long r0 = r9.j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7a
        L67:
            qw3 r0 = r9.i
            if (r0 != 0) goto L74
            qw3 r0 = new qw3
            r1 = 3
            r0.<init>(r9, r1)
            r9.i = r0
            goto L77
        L74:
            r9.unscheduleSelf(r0)
        L77:
            r9.a(r10)
        L7a:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn0.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f2123a.canApplyTheme();
    }

    public abstract void d(ib ibVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        en0 en0Var = this.f2123a;
        return changingConfigurations | en0Var.e | en0Var.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        en0 en0Var = this.f2123a;
        if (en0Var.u) {
            z = en0Var.v;
        } else {
            en0Var.c();
            en0Var.u = true;
            int i = en0Var.h;
            Drawable[] drawableArr = en0Var.g;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        en0Var.v = false;
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    en0Var.v = true;
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f2123a.d = getChangingConfigurations();
            return this.f2123a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2124b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        en0 en0Var = this.f2123a;
        if (en0Var.l) {
            if (!en0Var.m) {
                en0Var.b();
            }
            return en0Var.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        en0 en0Var = this.f2123a;
        if (en0Var.l) {
            if (!en0Var.m) {
                en0Var.b();
            }
            return en0Var.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        en0 en0Var = this.f2123a;
        if (en0Var.l) {
            if (!en0Var.m) {
                en0Var.b();
            }
            return en0Var.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        en0 en0Var = this.f2123a;
        if (en0Var.l) {
            if (!en0Var.m) {
                en0Var.b();
            }
            return en0Var.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        en0 en0Var = this.f2123a;
        if (en0Var.r) {
            return en0Var.s;
        }
        en0Var.c();
        int i2 = en0Var.h;
        Drawable[] drawableArr = en0Var.g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        en0Var.s = i;
        en0Var.r = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        en0 en0Var = this.f2123a;
        boolean z = true;
        Rect rect2 = null;
        if (!en0Var.i) {
            Rect rect3 = en0Var.k;
            if (rect3 == null && !en0Var.j) {
                en0Var.c();
                Rect rect4 = new Rect();
                int i = en0Var.h;
                Drawable[] drawableArr = en0Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                en0Var.j = true;
                en0Var.k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (!this.f2123a.A || t9.J(this) != 1) {
            z = false;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        en0 en0Var = this.f2123a;
        if (en0Var != null) {
            en0Var.r = false;
            en0Var.t = false;
        }
        if (drawable == this.c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f2123a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            lb lbVar = (lb) this;
            ib ibVar = new ib(lbVar.p, lbVar, null);
            ibVar.e();
            d(ibVar);
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean z;
        en0 en0Var = this.f2123a;
        int i2 = this.g;
        int i3 = en0Var.h;
        Drawable[] drawableArr = en0Var.g;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = t9.o0(drawable, i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        en0Var.x = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (!this.f || this.e != i) {
            this.f = true;
            this.e = i;
            Drawable drawable = this.c;
            if (drawable != null) {
                if (this.j == 0) {
                    drawable.setAlpha(i);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        en0 en0Var = this.f2123a;
        if (en0Var.A != z) {
            en0Var.A = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                an0.e(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        en0 en0Var = this.f2123a;
        en0Var.C = true;
        if (en0Var.B != colorFilter) {
            en0Var.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        en0 en0Var = this.f2123a;
        if (en0Var.w != z) {
            en0Var.w = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            bn0.e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f2124b;
        if (rect == null) {
            this.f2124b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            bn0.f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        en0 en0Var = this.f2123a;
        en0Var.F = true;
        if (en0Var.D != colorStateList) {
            en0Var.D = colorStateList;
            t9.s0(this.c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        en0 en0Var = this.f2123a;
        en0Var.G = true;
        if (en0Var.E != mode) {
            en0Var.E = mode;
            t9.t0(this.c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
