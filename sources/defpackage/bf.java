package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public final class bf extends ToggleButton implements m93 {

    /* renamed from: a, reason: collision with root package name */
    public final kc f455a;

    /* renamed from: b, reason: collision with root package name */
    public final re f456b;
    public pd c;

    public bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        h83.a(getContext(), this);
        kc kcVar = new kc(this);
        this.f455a = kcVar;
        kcVar.e(attributeSet, R.attr.buttonStyleToggle);
        re reVar = new re(this);
        this.f456b = reVar;
        reVar.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private pd getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new pd(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f455a;
        if (kcVar != null) {
            kcVar.a();
        }
        re reVar = this.f456b;
        if (reVar != null) {
            reVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f455a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f455a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f456b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f456b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f455a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f455a;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f456b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f456b;
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
        kc kcVar = this.f455a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f455a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.f456b;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.f456b;
        reVar.m(mode);
        reVar.b();
    }
}
