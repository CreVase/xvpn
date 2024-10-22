package com.google.android.material.button;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import defpackage.bn0;
import defpackage.dl2;
import defpackage.ew3;
import defpackage.fs2;
import defpackage.ja1;
import defpackage.jk;
import defpackage.ll3;
import defpackage.n73;
import defpackage.p71;
import defpackage.qf2;
import defpackage.rq1;
import defpackage.rs2;
import defpackage.s;
import defpackage.sq1;
import defpackage.t9;
import defpackage.vk3;
import defpackage.x80;
import defpackage.ya0;
import defpackage.zf3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, rs2 {
    public static final int[] r = {R.attr.state_checkable};
    public static final int[] s = {R.attr.state_checked};
    public static final int t = qf2.Widget_MaterialComponents_Button;
    public final sq1 d;
    public final LinkedHashSet e;
    public rq1 f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    public final boolean a() {
        sq1 sq1Var = this.d;
        if (sq1Var != null && !sq1Var.o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z;
        boolean z2;
        int i = this.q;
        boolean z3 = false;
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            n73.e(this, this.i, null, null, null);
            return;
        }
        if (i != 3 && i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            n73.e(this, null, null, this.i, null);
            return;
        }
        if (i == 16 || i == 32) {
            z3 = true;
        }
        if (z3) {
            n73.e(this, null, this.i, null, null);
        }
    }

    public final void c(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Drawable drawable = this.i;
        boolean z5 = true;
        if (drawable != null) {
            Drawable mutate = t9.L0(drawable).mutate();
            this.i = mutate;
            bn0.h(mutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                bn0.i(this.i, mode);
            }
            int i = this.k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.l;
            int i4 = this.m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] a2 = n73.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        int i5 = this.q;
        if (i5 != 1 && i5 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || drawable3 == this.i) {
            if (i5 != 3 && i5 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || drawable5 == this.i) {
                if (i5 != 16 && i5 != 32) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z4 || drawable4 == this.i) {
                    z5 = false;
                }
            }
        }
        if (z5) {
            b();
        }
    }

    public final void d(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.i != null && getLayout() != null) {
            int i3 = this.q;
            boolean z4 = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (i3 != 3 && i3 != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (i3 != 16 && i3 != 32) {
                        z4 = false;
                    }
                    if (z4) {
                        this.l = 0;
                        if (i3 == 16) {
                            this.m = 0;
                            c(false);
                            return;
                        }
                        int i4 = this.k;
                        if (i4 == 0) {
                            i4 = this.i.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.n) - getPaddingBottom()) / 2);
                        if (this.m != max) {
                            this.m = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.q;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.k;
                if (i6 == 0) {
                    i6 = this.i.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap weakHashMap = ll3.f3151a;
                int e = (((textLayoutWidth - vk3.e(this)) - i6) - this.n) - vk3.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e /= 2;
                }
                if (vk3.d(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.q != 4) {
                    z4 = false;
                }
                if (z2 != z4) {
                    e = -e;
                }
                if (this.l != e) {
                    this.l = e;
                    c(false);
                    return;
                }
                return;
            }
            this.l = 0;
            c(false);
        }
    }

    public String getA11yClassName() {
        boolean z;
        Class cls;
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        sq1 sq1Var = this.d;
        if (sq1Var != null && sq1Var.q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.l;
        }
        return null;
    }

    public fs2 getShapeAppearanceModel() {
        if (a()) {
            return this.d.f4397b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.d.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.d.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            zf3.h0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        sq1 sq1Var = this.d;
        if (sq1Var != null && sq1Var.q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        sq1 sq1Var = this.d;
        if (sq1Var != null && sq1Var.q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        sq1 sq1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (sq1Var = this.d) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = sq1Var.m;
            if (drawable != null) {
                drawable.setBounds(sq1Var.c, sq1Var.e, i6 - sq1Var.d, i5 - sq1Var.f);
            }
        }
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f200a);
        setChecked(savedState.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (sq1Var.b(false) != null) {
                sq1Var.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                sq1 sq1Var = this.d;
                sq1Var.o = true;
                ColorStateList colorStateList = sq1Var.j;
                MaterialButton materialButton = sq1Var.f4396a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(sq1Var.i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ew3.P0(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        boolean z2;
        sq1 sq1Var = this.d;
        if (sq1Var != null && sq1Var.q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && isEnabled() && this.o != z) {
            this.o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.o;
                if (!materialButtonToggleGroup.f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.p) {
                return;
            }
            this.p = true;
            Iterator it = this.e.iterator();
            if (!it.hasNext()) {
                this.p = false;
            } else {
                p71.C(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (!sq1Var.p || sq1Var.g != i) {
                sq1Var.g = i;
                sq1Var.p = true;
                fs2 fs2Var = sq1Var.f4397b;
                float f = i;
                fs2Var.getClass();
                jk jkVar = new jk(fs2Var);
                jkVar.e = new s(f);
                jkVar.f = new s(f);
                jkVar.g = new s(f);
                jkVar.h = new s(f);
                sq1Var.c(new fs2(jkVar));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.d.b(false).i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ew3.P0(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.k != i) {
                this.k = i;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(x80.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        sq1 sq1Var = this.d;
        sq1Var.d(sq1Var.e, i);
    }

    public void setInsetTop(int i) {
        sq1 sq1Var = this.d;
        sq1Var.d(i, sq1Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(rq1 rq1Var) {
        this.f = rq1Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        rq1 rq1Var = this.f;
        if (rq1Var != null) {
            ((MaterialButtonToggleGroup) ((ja1) rq1Var).f2735b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (sq1Var.l != colorStateList) {
                sq1Var.l = colorStateList;
                boolean z = sq1.u;
                MaterialButton materialButton = sq1Var.f4396a;
                if (z && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ya0.d0(colorStateList));
                } else if (!z && (materialButton.getBackground() instanceof dl2)) {
                    ((dl2) materialButton.getBackground()).setTintList(ya0.d0(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(x80.getColorStateList(getContext(), i));
        }
    }

    @Override // defpackage.rs2
    public void setShapeAppearanceModel(fs2 fs2Var) {
        if (a()) {
            this.d.c(fs2Var);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            sq1 sq1Var = this.d;
            sq1Var.n = z;
            sq1Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (sq1Var.k != colorStateList) {
                sq1Var.k = colorStateList;
                sq1Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(x80.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (sq1Var.h != i) {
                sq1Var.h = i;
                sq1Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (sq1Var.j != colorStateList) {
                sq1Var.j = colorStateList;
                if (sq1Var.b(false) != null) {
                    bn0.h(sq1Var.b(false), sq1Var.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            sq1 sq1Var = this.d;
            if (sq1Var.i != mode) {
                sq1Var.i = mode;
                if (sq1Var.b(false) != null && sq1Var.i != null) {
                    bn0.i(sq1Var.b(false), sq1Var.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }
}
