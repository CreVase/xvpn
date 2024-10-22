package com.google.android.material.checkbox;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import defpackage.ar1;
import defpackage.bn0;
import defpackage.cp3;
import defpackage.en2;
import defpackage.ew3;
import defpackage.he2;
import defpackage.k40;
import defpackage.m20;
import defpackage.mb;
import defpackage.mc;
import defpackage.mf2;
import defpackage.o4;
import defpackage.ob;
import defpackage.p71;
import defpackage.qf2;
import defpackage.tf3;
import defpackage.xe2;
import defpackage.zf3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class b extends mc {
    public static final int[] A;
    public static final int[][] B;
    public static final int C;
    public static final int y = qf2.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] z = {he2.state_indeterminate};
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;
    public ColorStateList o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final ob w;
    public final ar1 x;

    static {
        int i = he2.state_error;
        A = new int[]{i};
        B = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.r;
        if (i == 1) {
            return getResources().getString(mf2.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(mf2.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(mf2.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int x = zf3.x(this, he2.colorControlActivated);
            int x2 = zf3.x(this, he2.colorError);
            int x3 = zf3.x(this, he2.colorSurface);
            int x4 = zf3.x(this, he2.colorOnSurface);
            this.g = new ColorStateList(B, new int[]{zf3.U(1.0f, x3, x2), zf3.U(1.0f, x3, x), zf3.U(0.54f, x3, x4), zf3.U(0.38f, x3, x4), zf3.U(0.38f, x3, x4)});
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        o4 o4Var;
        this.l = m20.Z(this.l, this.o, k40.b(this));
        this.m = m20.Z(this.m, this.p, this.q);
        if (this.n) {
            ob obVar = this.w;
            if (obVar != null) {
                Drawable drawable = obVar.f2957a;
                ar1 ar1Var = this.x;
                if (drawable != null) {
                    ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(ar1Var.a());
                }
                ArrayList arrayList = obVar.e;
                mb mbVar = obVar.f3634b;
                if (arrayList != null && ar1Var != null) {
                    arrayList.remove(ar1Var);
                    if (obVar.e.size() == 0 && (o4Var = obVar.d) != null) {
                        mbVar.f3265b.removeListener(o4Var);
                        obVar.d = null;
                    }
                }
                Drawable drawable2 = obVar.f2957a;
                if (drawable2 != null) {
                    ((AnimatedVectorDrawable) drawable2).registerAnimationCallback(ar1Var.a());
                } else if (ar1Var != null) {
                    if (obVar.e == null) {
                        obVar.e = new ArrayList();
                    }
                    if (!obVar.e.contains(ar1Var)) {
                        obVar.e.add(ar1Var);
                        if (obVar.d == null) {
                            obVar.d = new o4(obVar, 2);
                        }
                        mbVar.f3265b.addListener(obVar.d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && obVar != null) {
                    int i = xe2.checked;
                    int i2 = xe2.unchecked;
                    ((AnimatedStateListDrawable) drawable3).addTransition(i, i2, obVar, false);
                    ((AnimatedStateListDrawable) this.l).addTransition(xe2.indeterminate, i2, obVar, false);
                }
            }
        }
        Drawable drawable4 = this.l;
        if (drawable4 != null && (colorStateList2 = this.o) != null) {
            bn0.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.m;
        if (drawable5 != null && (colorStateList = this.p) != null) {
            bn0.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.l;
        Drawable drawable7 = this.m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, new en2(drawable7, intrinsicWidth, intrinsicHeight).f2795a});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, max, max2, max, max2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.r == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, z);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                }
                i2++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable H;
        int i;
        if (this.i && TextUtils.isEmpty(getText()) && (H = tf3.H(this)) != null) {
            if (cp3.D(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - H.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = H.getBounds();
                bn0.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f1532a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f1532a = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // defpackage.mc, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ew3.P0(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(ew3.P0(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z2;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i) {
            this.r = i;
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setChecked(z2);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    p71.C(it.next());
                    throw null;
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            return;
        }
        p71.C(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            k40.c(this, getMaterialThemeColorsTintList());
        } else {
            k40.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.mc, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        a();
    }
}
