package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.h83;
import defpackage.i93;
import defpackage.j93;
import defpackage.kc;
import defpackage.rd;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final kc f157a;

    /* renamed from: b, reason: collision with root package name */
    public final rd f158b;
    public boolean c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f157a;
        if (kcVar != null) {
            kcVar.a();
        }
        rd rdVar = this.f158b;
        if (rdVar != null) {
            rdVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f157a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f157a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        j93 j93Var;
        rd rdVar = this.f158b;
        if (rdVar == null || (j93Var = (j93) rdVar.d) == null) {
            return null;
        }
        return (ColorStateList) j93Var.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j93 j93Var;
        rd rdVar = this.f158b;
        if (rdVar == null || (j93Var = (j93) rdVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) j93Var.e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f158b.f4133b).getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f157a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f157a;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        rd rdVar = this.f158b;
        if (rdVar != null) {
            rdVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        rd rdVar = this.f158b;
        if (rdVar != null && drawable != null && !this.c) {
            rdVar.f4132a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (rdVar != null) {
            rdVar.a();
            if (!this.c && ((ImageView) rdVar.f4133b).getDrawable() != null) {
                ((ImageView) rdVar.f4133b).getDrawable().setLevel(rdVar.f4132a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        rd rdVar = this.f158b;
        if (rdVar != null) {
            rdVar.e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        rd rdVar = this.f158b;
        if (rdVar != null) {
            rdVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f157a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f157a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        rd rdVar = this.f158b;
        if (rdVar != null) {
            rdVar.f(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        rd rdVar = this.f158b;
        if (rdVar != null) {
            rdVar.g(mode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i93.a(context);
        this.c = false;
        h83.a(getContext(), this);
        kc kcVar = new kc(this);
        this.f157a = kcVar;
        kcVar.e(attributeSet, i);
        rd rdVar = new rd(this);
        this.f158b = rdVar;
        rdVar.c(attributeSet, i);
    }
}
