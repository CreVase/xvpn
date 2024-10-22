package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.af;
import defpackage.bn3;
import defpackage.h83;
import defpackage.hk;
import defpackage.i93;
import defpackage.ie2;
import defpackage.kc;
import defpackage.m93;
import defpackage.pd;
import defpackage.re;
import defpackage.t9;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements hk, m93 {

    /* renamed from: a, reason: collision with root package name */
    public final kc f153a;

    /* renamed from: b, reason: collision with root package name */
    public final re f154b;
    public pd c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ie2.buttonStyle);
    }

    private pd getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new pd(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f153a;
        if (kcVar != null) {
            kcVar.a();
        }
        re reVar = this.f154b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (bn3.f495b) {
            return super.getAutoSizeMaxTextSize();
        }
        re reVar = this.f154b;
        if (reVar != null) {
            return Math.round(reVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (bn3.f495b) {
            return super.getAutoSizeMinTextSize();
        }
        re reVar = this.f154b;
        if (reVar != null) {
            return Math.round(reVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (bn3.f495b) {
            return super.getAutoSizeStepGranularity();
        }
        re reVar = this.f154b;
        if (reVar != null) {
            return Math.round(reVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (bn3.f495b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        re reVar = this.f154b;
        if (reVar != null) {
            return reVar.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (bn3.f495b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        re reVar = this.f154b;
        if (reVar == null) {
            return 0;
        }
        return reVar.i.f72a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t9.J0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f153a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f153a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f154b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f154b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        re reVar = this.f154b;
        if (reVar != null && !bn3.f495b) {
            reVar.i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        re reVar = this.f154b;
        if (reVar != null && !bn3.f495b) {
            af afVar = reVar.i;
            if (afVar.h() && afVar.f72a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            reVar.i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.hk
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (bn3.f495b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        re reVar = this.f154b;
        if (reVar != null) {
            reVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (bn3.f495b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        re reVar = this.f154b;
        if (reVar != null) {
            reVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView, defpackage.hk
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (bn3.f495b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        re reVar = this.f154b;
        if (reVar != null) {
            reVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f153a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f153a;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t9.M0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        re reVar = this.f154b;
        if (reVar != null) {
            reVar.f4139a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f153a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f153a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.f154b;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.f154b;
        reVar.m(mode);
        reVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        re reVar = this.f154b;
        if (reVar != null) {
            reVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = bn3.f495b;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        re reVar = this.f154b;
        if (reVar != null && !z2) {
            af afVar = reVar.i;
            if (afVar.h() && afVar.f72a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                afVar.e(f, i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i93.a(context);
        h83.a(getContext(), this);
        kc kcVar = new kc(this);
        this.f153a = kcVar;
        kcVar.e(attributeSet, i);
        re reVar = new re(this);
        this.f154b = reVar;
        reVar.f(attributeSet, i);
        reVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
