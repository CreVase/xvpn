package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.c5;
import defpackage.cg2;
import defpackage.ew3;
import defpackage.iu1;
import defpackage.ju1;
import defpackage.lv1;
import defpackage.su1;
import defpackage.u4;
import defpackage.v4;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements lv1, View.OnClickListener, c5 {
    public su1 h;
    public CharSequence i;
    public Drawable j;
    public iu1 k;
    public u4 l;
    public v4 m;
    public boolean n;
    public boolean o;
    public final int p;
    public int q;
    public final int r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.n = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg2.ActionMenuItemView, 0, 0);
        this.p = obtainStyledAttributes.getDimensionPixelSize(cg2.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.q = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.c5
    public final boolean a() {
        return l();
    }

    @Override // defpackage.c5
    public final boolean b() {
        if (l() && this.h.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lv1
    public final void c(su1 su1Var) {
        int i;
        this.h = su1Var;
        setIcon(su1Var.getIcon());
        setTitle(su1Var.getTitleCondensed());
        setId(su1Var.f4414a);
        if (su1Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(su1Var.isEnabled());
        if (su1Var.hasSubMenu() && this.l == null) {
            this.l = new u4(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.lv1
    public su1 getItemData() {
        return this.h;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && ((i < 640 || i2 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.i);
        if (this.j != null) {
            if ((this.h.y & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.n && !this.o)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence3 = null;
        if (z4) {
            charSequence = this.i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.h.q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.h.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.h.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z4) {
                charSequence3 = this.h.e;
            }
            ew3.c1(this, charSequence3);
            return;
        }
        ew3.c1(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        iu1 iu1Var = this.k;
        if (iu1Var != null) {
            iu1Var.a(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n = m();
        n();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean l = l();
        if (l && (i4 = this.q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.p;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!l && this.j != null) {
            super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u4 u4Var;
        if (this.h.hasSubMenu() && (u4Var = this.l) != null && u4Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.o != z) {
            this.o = z;
            su1 su1Var = this.h;
            if (su1Var != null) {
                ju1 ju1Var = su1Var.n;
                ju1Var.k = true;
                ju1Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(iu1 iu1Var) {
        this.k = iu1Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(v4 v4Var) {
        this.m = v4Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        n();
    }
}
