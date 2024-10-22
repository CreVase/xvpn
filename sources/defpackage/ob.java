package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class ob extends kj3 implements Animatable {
    public static final /* synthetic */ int g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final mb f3634b;
    public final Context c;
    public o4 d = null;
    public ArrayList e = null;
    public final dn0 f;

    public ob(Context context) {
        dn0 dn0Var = new dn0(this);
        this.f = dn0Var;
        this.c = context;
        this.f3634b = new mb(dn0Var);
    }

    @Override // defpackage.kj3, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            bn0.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return bn0.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        mb mbVar = this.f3634b;
        mbVar.f3264a.draw(canvas);
        if (mbVar.f3265b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return an0.a(drawable);
        }
        return this.f3634b.f3264a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3634b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return bn0.c(drawable);
        }
        return this.f3634b.f3264a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2957a != null && Build.VERSION.SDK_INT >= 24) {
            return new nb(this.f2957a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f3634b.f3264a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f3634b.f3264a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f3634b.f3264a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x013b, code lost:            if (r8.f3265b != null) goto L73;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x013d, code lost:            r8.f3265b = new android.animation.AnimatorSet();     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0144, code lost:            r8.f3265b.playTogether(r8.c);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014b, code lost:            return;     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return an0.d(drawable);
        }
        return this.f3634b.f3264a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f3634b.f3265b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f3634b.f3264a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3634b.f3264a.setBounds(rect);
        }
    }

    @Override // defpackage.kj3, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f3634b.f3264a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f3634b.f3264a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3634b.f3264a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            an0.e(drawable, z);
        } else {
            this.f3634b.f3264a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3634b.f3264a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.h93
    public final void setTint(int i) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            t9.r0(drawable, i);
        } else {
            this.f3634b.f3264a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            t9.s0(drawable, colorStateList);
        } else {
            this.f3634b.f3264a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            t9.t0(drawable, mode);
        } else {
            this.f3634b.f3264a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3634b.f3264a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        mb mbVar = this.f3634b;
        if (mbVar.f3265b.isStarted()) {
            return;
        }
        mbVar.f3265b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2957a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3634b.f3265b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
