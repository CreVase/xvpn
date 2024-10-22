package com.security.xvpn.z35kb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import defpackage.cu3;
import defpackage.f70;
import defpackage.ke1;
import defpackage.ll3;
import defpackage.m20;
import defpackage.n01;
import defpackage.sf2;
import defpackage.tf3;
import defpackage.v73;
import defpackage.vk3;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class QuickConnAddItemView extends cu3 implements ke1 {
    public final AppCompatImageView r;
    public final AppCompatTextView s;
    public final AppCompatTextView t;
    public boolean u;

    public QuickConnAddItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4);
        f70 f70Var;
        f70 f70Var2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        WeakHashMap weakHashMap = ll3.f3151a;
        appCompatImageView.setId(vk3.a());
        appCompatImageView.setImageResource(R.drawable.ic_quick_conn_widget_add);
        int K = tf3.K(20);
        int K2 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams instanceof f70) {
            f70Var = (f70) layoutParams;
        } else {
            f70Var = null;
        }
        f70Var = f70Var == null ? new f70(K, K2) : f70Var;
        ((ViewGroup.MarginLayoutParams) f70Var).width = K;
        ((ViewGroup.MarginLayoutParams) f70Var).height = K2;
        f70Var.i = 0;
        f70Var.l = 0;
        f70Var.v = 0;
        f70Var.setMarginEnd(tf3.K(20));
        appCompatImageView.setLayoutParams(f70Var);
        addView(appCompatImageView);
        this.r = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setId(vk3.a());
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
        if (layoutParams2 instanceof f70) {
            f70Var2 = (f70) layoutParams2;
        } else {
            f70Var2 = null;
        }
        f70Var2 = f70Var2 == null ? new f70(0, -2) : f70Var2;
        ((ViewGroup.MarginLayoutParams) f70Var2).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
        f70Var2.i = 0;
        f70Var2.t = 0;
        f70Var2.u = appCompatImageView.getId();
        ((ViewGroup.MarginLayoutParams) f70Var2).topMargin = tf3.K(12);
        f70Var2.setMarginStart(tf3.K(20));
        f70Var2.setMarginEnd(tf3.K(30));
        appCompatTextView.setLayoutParams(f70Var2);
        addView(appCompatTextView);
        this.s = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setId(vk3.a());
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setTypeface(n01.b());
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView2.getLayoutParams();
        f70 f70Var3 = layoutParams3 instanceof f70 ? (f70) layoutParams3 : null;
        f70Var3 = f70Var3 == null ? new f70(0, -2) : f70Var3;
        ((ViewGroup.MarginLayoutParams) f70Var3).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var3).height = -2;
        f70Var3.l = 0;
        f70Var3.t = 0;
        f70Var3.u = appCompatImageView.getId();
        f70Var3.j = appCompatTextView.getId();
        ((ViewGroup.MarginLayoutParams) f70Var3).topMargin = tf3.K(5);
        ((ViewGroup.MarginLayoutParams) f70Var3).bottomMargin = tf3.K(12);
        f70Var3.setMarginStart(tf3.K(20));
        f70Var3.setMarginEnd(tf3.K(30));
        appCompatTextView2.setLayoutParams(f70Var3);
        addView(appCompatTextView2);
        this.t = appCompatTextView2;
        if (isInEditMode()) {
            tf3.B0(context);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sf2.QuickConnAddItemView, 0, 0);
        appCompatTextView.setText(obtainStyledAttributes.getString(3));
        appCompatTextView2.setText(obtainStyledAttributes.getString(0));
        if (obtainStyledAttributes.getBoolean(2, true)) {
            m20.Y0(appCompatImageView);
        } else {
            m20.u0(appCompatImageView);
        }
        setShowLargeTitle(obtainStyledAttributes.getBoolean(1, false));
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.ke1
    public final void a() {
        this.s.setTextColor(v73.j(1000151));
        this.t.setTextColor(v73.j(1000152));
        setBackgroundColor(v73.e());
    }

    public final AppCompatImageView getIvAdd() {
        return this.r;
    }

    public final boolean getShowLargeTitle() {
        return this.u;
    }

    public final AppCompatTextView getTvDetails() {
        return this.t;
    }

    public final AppCompatTextView getTvTitle() {
        return this.s;
    }

    public final void setShowLargeTitle(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        AppCompatTextView appCompatTextView = this.s;
        if (z) {
            appCompatTextView.setTextSize(17.0f);
            appCompatTextView.setTypeface(n01.c());
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = tf3.K(8);
                appCompatTextView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTypeface(n01.d());
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = tf3.K(5);
            appCompatTextView.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
