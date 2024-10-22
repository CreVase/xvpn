package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class mc extends CheckBox implements l93, m93 {

    /* renamed from: a, reason: collision with root package name */
    public final oc f3272a;

    /* renamed from: b, reason: collision with root package name */
    public final kc f3273b;
    public final re c;
    public pd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i93.a(context);
        h83.a(getContext(), this);
        oc ocVar = new oc(this, 1);
        this.f3272a = ocVar;
        ocVar.c(attributeSet, i);
        kc kcVar = new kc(this);
        this.f3273b = kcVar;
        kcVar.e(attributeSet, i);
        re reVar = new re(this);
        this.c = reVar;
        reVar.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private pd getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new pd(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            kcVar.a();
        }
        re reVar = this.c;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        oc ocVar = this.f3272a;
        if (ocVar != null) {
            ocVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    @Override // defpackage.l93
    public ColorStateList getSupportButtonTintList() {
        oc ocVar = this.f3272a;
        if (ocVar != null) {
            return ocVar.f3640b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        oc ocVar = this.f3272a;
        if (ocVar != null) {
            return ocVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        oc ocVar = this.f3272a;
        if (ocVar != null) {
            if (ocVar.f) {
                ocVar.f = false;
            } else {
                ocVar.f = true;
                ocVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        re reVar = this.c;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        re reVar = this.c;
        if (reVar != null) {
            reVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f3273b;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // defpackage.l93
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        oc ocVar = this.f3272a;
        if (ocVar != null) {
            ocVar.f3640b = colorStateList;
            ocVar.d = true;
            ocVar.a();
        }
    }

    @Override // defpackage.l93
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        oc ocVar = this.f3272a;
        if (ocVar != null) {
            ocVar.c = mode;
            ocVar.e = true;
            ocVar.a();
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.c;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.c;
        reVar.m(mode);
        reVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ew3.P0(getContext(), i));
    }
}
