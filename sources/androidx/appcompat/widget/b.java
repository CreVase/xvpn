package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.bv;
import defpackage.ce;
import defpackage.ew3;
import defpackage.fe;
import defpackage.ie;
import defpackage.kc;
import defpackage.z4;

/* loaded from: classes.dex */
public final class b extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final kc f174a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f175b;
    public final z4 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final ie f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:            if (r5 == null) goto L23;     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r0 = defpackage.ie2.spinnerStyle
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.h = r1
            android.content.Context r1 = r9.getContext()
            defpackage.h83.a(r1, r9)
            int[] r1 = defpackage.cg2.Spinner
            r2 = 0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r2)
            kc r3 = new kc
            r3.<init>(r9)
            r9.f174a = r3
            int r3 = defpackage.cg2.Spinner_popupTheme
            int r3 = r1.getResourceId(r3, r2)
            if (r3 == 0) goto L31
            b90 r4 = new b90
            r4.<init>(r10, r3)
            r9.f175b = r4
            goto L33
        L31:
            r9.f175b = r10
        L33:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.b.i     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r0, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            if (r6 == 0) goto L5b
            int r2 = r5.getInt(r2, r2)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            r3 = r2
            goto L5b
        L47:
            r10 = move-exception
            r4 = r5
            goto Ld9
        L4b:
            r2 = move-exception
            goto L52
        L4d:
            r10 = move-exception
            goto Ld9
        L50:
            r2 = move-exception
            r5 = r4
        L52:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r2)     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L5e
        L5b:
            r5.recycle()
        L5e:
            r2 = 1
            if (r3 == 0) goto L9e
            if (r3 == r2) goto L64
            goto Lad
        L64:
            he r3 = new he
            android.content.Context r5 = r9.f175b
            r3.<init>(r9, r5, r11, r0)
            android.content.Context r5 = r9.f175b
            int[] r6 = defpackage.cg2.Spinner
            go2 r5 = defpackage.go2.m(r5, r11, r6, r0)
            int r6 = defpackage.cg2.Spinner_android_dropDownWidth
            java.lang.Object r7 = r5.f2294b
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            r8 = -2
            int r6 = r7.getLayoutDimension(r6, r8)
            r9.g = r6
            int r6 = defpackage.cg2.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r6 = r5.e(r6)
            r3.j(r6)
            int r6 = defpackage.cg2.Spinner_android_prompt
            java.lang.String r6 = r1.getString(r6)
            r3.D = r6
            r5.o()
            r9.f = r3
            z4 r5 = new z4
            r5.<init>(r9, r9, r3, r2)
            r9.c = r5
            goto Lad
        L9e:
            ee r3 = new ee
            r3.<init>(r9)
            r9.f = r3
            int r5 = defpackage.cg2.Spinner_android_prompt
            java.lang.String r5 = r1.getString(r5)
            r3.c = r5
        Lad:
            int r3 = defpackage.cg2.Spinner_android_entries
            java.lang.CharSequence[] r3 = r1.getTextArray(r3)
            if (r3 == 0) goto Lc5
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r10, r6, r3)
            int r10 = defpackage.kf2.support_simple_spinner_dropdown_item
            r5.setDropDownViewResource(r10)
            r9.setAdapter(r5)
        Lc5:
            r1.recycle()
            r9.e = r2
            android.widget.SpinnerAdapter r10 = r9.d
            if (r10 == 0) goto Ld3
            r9.setAdapter(r10)
            r9.d = r4
        Ld3:
            kc r10 = r9.f174a
            r10.e(r11, r0)
            return
        Ld9:
            if (r4 == 0) goto Lde
            r4.recycle()
        Lde:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.h;
            drawable.getPadding(rect);
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f174a;
        if (kcVar != null) {
            kcVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ie ieVar = this.f;
        if (ieVar != null) {
            return ieVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ie ieVar = this.f;
        if (ieVar != null) {
            return ieVar.o();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f != null) {
            return this.g;
        }
        return super.getDropDownWidth();
    }

    public final ie getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ie ieVar = this.f;
        if (ieVar != null) {
            return ieVar.g();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f175b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ie ieVar = this.f;
        if (ieVar != null) {
            return ieVar.f();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f174a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f174a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ie ieVar = this.f;
        if (ieVar != null && ieVar.b()) {
            ieVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.f159a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new bv(this, 2));
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        ie ieVar = this.f;
        if (ieVar != null && ieVar.b()) {
            z = true;
        } else {
            z = false;
        }
        appCompatSpinner$SavedState.f159a = z;
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z4 z4Var = this.c;
        if (z4Var != null && z4Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ie ieVar = this.f;
        if (ieVar != null) {
            if (!ieVar.b()) {
                ieVar.n(ce.b(this), ce.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f174a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        kc kcVar = this.f174a;
        if (kcVar != null) {
            kcVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        ie ieVar = this.f;
        if (ieVar != null) {
            ieVar.m(i2);
            ieVar.e(i2);
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        ie ieVar = this.f;
        if (ieVar != null) {
            ieVar.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        ie ieVar = this.f;
        if (ieVar != null) {
            ieVar.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(ew3.P0(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        ie ieVar = this.f;
        if (ieVar != null) {
            ieVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f174a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f174a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ie ieVar = this.f;
        if (ieVar != null) {
            Context context = this.f175b;
            if (context == null) {
                context = getContext();
            }
            ieVar.p(new fe(spinnerAdapter, context.getTheme()));
        }
    }
}
