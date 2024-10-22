package com.security.xvpn.z35kb.television.account;

import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.account.SignInActivity;
import defpackage.b42;
import defpackage.cu3;
import defpackage.e;
import defpackage.er;
import defpackage.eu3;
import defpackage.ew3;
import defpackage.f70;
import defpackage.gi2;
import defpackage.gm3;
import defpackage.hu2;
import defpackage.hu3;
import defpackage.hx2;
import defpackage.l81;
import defpackage.lt2;
import defpackage.m20;
import defpackage.m81;
import defpackage.mt2;
import defpackage.n01;
import defpackage.nd3;
import defpackage.ot2;
import defpackage.pd0;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.qt3;
import defpackage.rt3;
import defpackage.t9;
import defpackage.tf3;
import defpackage.xm3;
import defpackage.yc2;
import defpackage.zf3;

/* loaded from: classes2.dex */
public final class SignInActivity extends nd3 implements qt3 {
    public static final /* synthetic */ int A = 0;
    public eu3 g;
    public eu3 h;
    public eu3 i;
    public AppCompatTextView j;
    public eu3 k;
    public AppCompatTextView l;
    public AppCompatTextView m;
    public AppCompatImageView n;
    public AppCompatImageView o;
    public eu3 p;
    public eu3 q;
    public AppCompatEditText r;
    public AppCompatEditText s;
    public AppCompatTextView t;
    public AppCompatTextView u;
    public AppCompatTextView v;
    public AppCompatTextView w;
    public hu3 x;
    public AppCompatButton y;
    public boolean f = true;
    public final gm3 z = new gm3(gi2.a(hu2.class), new l81(this, 3), e.D, new m81(this, 1));

    @Override // defpackage.nd3, defpackage.x33
    public final void A() {
        super.A();
        R().f.i(Boolean.FALSE);
    }

    @Override // defpackage.nd3
    public final String M() {
        return "TVSignInPage";
    }

    public final hu2 R() {
        return (hu2) this.z.getValue();
    }

    public final void S() {
        int i = 0;
        R().q.d(this, new qt2(i, new mt2(this, i)));
        R().r.d(this, new qt2(i, new mt2(this, 1)));
        R().s.d(this, new qt2(i, new mt2(this, 2)));
        R().j.d(this, new qt2(i, new mt2(this, 3)));
        R().k.d(this, new qt2(i, new mt2(this, 4)));
        R().f.d(this, new qt2(i, new mt2(this, 5)));
        R().g.d(this, new qt2(i, new mt2(this, 8)));
        R().h.d(this, new qt2(i, new mt2(this, 11)));
    }

    public final void T() {
        float width;
        hu3 hu3Var;
        eu3 eu3Var = this.g;
        hu3 hu3Var2 = null;
        if (eu3Var == null) {
            eu3Var = null;
        }
        m20.g1(eu3Var, this.f);
        eu3 eu3Var2 = this.h;
        if (eu3Var2 == null) {
            eu3Var2 = null;
        }
        m20.g1(eu3Var2, !this.f);
        if (this.f) {
            AppCompatTextView appCompatTextView = this.v;
            if (appCompatTextView == null) {
                appCompatTextView = null;
            }
            appCompatTextView.setTypeface(n01.c());
            AppCompatTextView appCompatTextView2 = this.w;
            if (appCompatTextView2 == null) {
                appCompatTextView2 = null;
            }
            appCompatTextView2.setTypeface(n01.d());
        } else {
            AppCompatTextView appCompatTextView3 = this.w;
            if (appCompatTextView3 == null) {
                appCompatTextView3 = null;
            }
            appCompatTextView3.setTypeface(n01.c());
            AppCompatTextView appCompatTextView4 = this.v;
            if (appCompatTextView4 == null) {
                appCompatTextView4 = null;
            }
            appCompatTextView4.setTypeface(n01.d());
        }
        if (this.f) {
            width = 0.0f;
        } else {
            float K = tf3.K(28);
            AppCompatTextView appCompatTextView5 = this.v;
            if (appCompatTextView5 == null) {
                appCompatTextView5 = null;
            }
            int width2 = appCompatTextView5.getWidth();
            AppCompatTextView appCompatTextView6 = this.w;
            if (appCompatTextView6 == null) {
                appCompatTextView6 = null;
            }
            width = K + ((appCompatTextView6.getWidth() + width2) / 2.0f);
        }
        hu3 hu3Var3 = this.x;
        if (hu3Var3 == null) {
            hu3Var = null;
        } else {
            hu3Var = hu3Var3;
        }
        float[] fArr = new float[2];
        if (hu3Var3 != null) {
            hu3Var2 = hu3Var3;
        }
        fArr[0] = hu3Var2.getTranslationX();
        fArr[1] = width;
        ObjectAnimator.ofFloat(hu3Var, "translationX", fArr).setDuration(300L).start();
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        if (z && !isFinishing()) {
            ew3.T0("");
            t9.a();
            tf3.g0(this, HomeActivity.class, new Bundle(0), 32768);
            yc2.a();
            finish();
        }
    }

    @Override // defpackage.nd3, defpackage.x33
    public final void o() {
        super.o();
        R().f.i(Boolean.FALSE);
    }

    @Override // defpackage.nd3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        f70 f70Var;
        Typeface d;
        f70 f70Var2;
        Typeface d2;
        f70 f70Var3;
        f70 f70Var4;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        LinearLayout.LayoutParams layoutParams6;
        LinearLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8;
        LinearLayout.LayoutParams layoutParams9;
        LinearLayout.LayoutParams layoutParams10;
        LinearLayout.LayoutParams layoutParams11;
        LinearLayout.LayoutParams layoutParams12;
        LinearLayout.LayoutParams layoutParams13;
        LinearLayout.LayoutParams layoutParams14;
        LinearLayout.LayoutParams layoutParams15;
        LinearLayout.LayoutParams layoutParams16;
        LinearLayout.LayoutParams layoutParams17;
        LinearLayout.LayoutParams layoutParams18;
        LinearLayout.LayoutParams layoutParams19;
        super.onCreate(bundle);
        final int i = 0;
        R().t = getIntent().getBooleanExtra("needBind", false);
        AppCompatTextView appCompatTextView = null;
        eu3 eu3Var = new eu3(this, null, 6, 0);
        final int i2 = 1;
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        eu3Var.setBackgroundColor(-16316665);
        eu3Var.setGravity(1);
        ViewGroup.LayoutParams layoutParams20 = eu3Var.getLayoutParams();
        if (layoutParams20 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams20;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 1;
        eu3Var.setLayoutParams(layoutParams);
        tf3.w0(eu3Var, 0, tf3.K(65), 5);
        AppCompatImageView appCompatImageView = new AppCompatImageView(eu3Var.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.tv_ic_x_logo);
        eu3Var.addView(appCompatImageView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setText(pd0.y(R.string.SignInToYourAccount));
        appCompatTextView2.setTypeface(n01.a());
        appCompatTextView2.setTextSize(28.5f);
        appCompatTextView2.setTextColor(-1);
        int K = tf3.K(20);
        ViewGroup.LayoutParams layoutParams21 = appCompatTextView2.getLayoutParams();
        if (layoutParams21 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams21;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams2);
        eu3Var.addView(appCompatTextView2);
        int generateViewId = View.generateViewId();
        int generateViewId2 = View.generateViewId();
        cu3 cu3Var = new cu3(eu3Var.getContext(), null, 6);
        cu3Var.setId(R.id.tabBar);
        int K2 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams22 = cu3Var.getLayoutParams();
        if (layoutParams22 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams22;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K2, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        cu3Var.setLayoutParams(layoutParams3);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setId(generateViewId);
        appCompatTextView3.setFocusable(true);
        ViewGroup.LayoutParams layoutParams23 = appCompatTextView3.getLayoutParams();
        if (layoutParams23 instanceof f70) {
            f70Var = (f70) layoutParams23;
        } else {
            f70Var = null;
        }
        if (f70Var == null) {
            f70Var = new f70(-2, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var).width = -2;
        appCompatTextView3.setLayoutParams(f70Var);
        appCompatTextView3.setTextSize(16.0f);
        appCompatTextView3.setText(pd0.y(R.string.ViaMobilePhone));
        appCompatTextView3.setTextColor(zf3.y(R.color.tv_common_item_text));
        if (this.f) {
            d = n01.c();
        } else {
            d = n01.d();
        }
        appCompatTextView3.setTypeface(d);
        tf3.k0(appCompatTextView3, new ot2(appCompatTextView3, 0));
        appCompatTextView3.setStateListAnimator(tf3.z0());
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                AppCompatEditText appCompatEditText = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i3) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i4 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i5 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i6 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText2 = signInActivity.r;
                        if (appCompatEditText2 != null) {
                            appCompatEditText = appCompatEditText2;
                        }
                        xm3.g(appCompatEditText);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText);
                        return;
                }
            }
        });
        ViewGroup.LayoutParams layoutParams24 = appCompatTextView3.getLayoutParams();
        if (layoutParams24 instanceof f70) {
            f70Var2 = (f70) layoutParams24;
        } else {
            f70Var2 = null;
        }
        if (f70Var2 == null) {
            f70Var2 = new f70(-2, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var2).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
        f70Var2.e = 0;
        f70Var2.g = generateViewId2;
        f70Var2.i = 0;
        ((ViewGroup.MarginLayoutParams) f70Var2).leftMargin = tf3.K(15);
        appCompatTextView3.setLayoutParams(f70Var2);
        cu3Var.addView(appCompatTextView3);
        this.v = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setId(R.id.account_container);
        appCompatTextView4.setFocusable(true);
        appCompatTextView4.setTextSize(16.0f);
        appCompatTextView4.setTextColor(zf3.y(R.color.tv_common_item_text));
        if (!this.f) {
            d2 = n01.c();
        } else {
            d2 = n01.d();
        }
        appCompatTextView4.setTypeface(d2);
        appCompatTextView4.setText(pd0.y(R.string.EmailAndPassword));
        tf3.k0(appCompatTextView4, new ot2(appCompatTextView4, 1));
        appCompatTextView4.setStateListAnimator(tf3.z0());
        final int i3 = 3;
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                AppCompatEditText appCompatEditText = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i32) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i4 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i5 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i6 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText2 = signInActivity.r;
                        if (appCompatEditText2 != null) {
                            appCompatEditText = appCompatEditText2;
                        }
                        xm3.g(appCompatEditText);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText);
                        return;
                }
            }
        });
        ViewGroup.LayoutParams layoutParams25 = appCompatTextView4.getLayoutParams();
        if (layoutParams25 instanceof f70) {
            f70Var3 = (f70) layoutParams25;
        } else {
            f70Var3 = null;
        }
        if (f70Var3 == null) {
            f70Var3 = new f70(-2, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var3).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var3).height = -2;
        f70Var3.i = 0;
        f70Var3.h = 0;
        f70Var3.f = generateViewId;
        ((ViewGroup.MarginLayoutParams) f70Var3).leftMargin = tf3.K(28);
        ((ViewGroup.MarginLayoutParams) f70Var3).rightMargin = tf3.K(15);
        appCompatTextView4.setLayoutParams(f70Var3);
        cu3Var.addView(appCompatTextView4);
        this.w = appCompatTextView4;
        hu3 hu3Var = new hu3(cu3Var.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13841976);
        gradientDrawable.setCornerRadius(2 * tf3.F);
        hu3Var.setBackground(gradientDrawable);
        cu3Var.addView(hu3Var);
        int K3 = tf3.K(34);
        int K4 = tf3.K(4);
        ViewGroup.LayoutParams layoutParams26 = hu3Var.getLayoutParams();
        if (layoutParams26 instanceof f70) {
            f70Var4 = (f70) layoutParams26;
        } else {
            f70Var4 = null;
        }
        if (f70Var4 == null) {
            f70Var4 = new f70(K3, K4);
        }
        ((ViewGroup.MarginLayoutParams) f70Var4).width = K3;
        ((ViewGroup.MarginLayoutParams) f70Var4).height = K4;
        f70Var4.e = generateViewId;
        f70Var4.h = generateViewId;
        f70Var4.j = generateViewId;
        ((ViewGroup.MarginLayoutParams) f70Var4).topMargin = tf3.K(7);
        hu3Var.setLayoutParams(f70Var4);
        this.x = hu3Var;
        if (cu3Var.getAttachToParent()) {
            eu3Var.addView(cu3Var);
        }
        tf3.w0(eu3Var, 0, tf3.K(20), 5);
        eu3 eu3Var2 = new eu3(eu3Var.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(-1);
        eu3Var2.setGravity(1);
        ViewGroup.LayoutParams layoutParams27 = eu3Var2.getLayoutParams();
        if (layoutParams27 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams27;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        layoutParams4.width = -2;
        layoutParams4.height = -1;
        eu3Var2.setLayoutParams(layoutParams4);
        eu3 h = hx2.h(eu3Var2.getContext(), null, 6, 0, 0);
        h.setId(-1);
        ViewGroup.LayoutParams layoutParams28 = h.getLayoutParams();
        if (layoutParams28 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams28;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(-1, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        layoutParams5.width = -2;
        h.setLayoutParams(layoutParams5);
        h.setGravity(16);
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setTextSize(60.0f);
        appCompatTextView5.setTextColor(-1);
        h.addView(appCompatTextView5);
        this.l = appCompatTextView5;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView6.setId(-1);
        appCompatTextView6.setText("");
        tf3.A0(appCompatTextView6);
        appCompatTextView6.setTextSize(15.0f);
        appCompatTextView6.setTextColor(-1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-13841976);
        gradientDrawable2.setCornerRadius(5 * tf3.F);
        appCompatTextView6.setBackground(gradientDrawable2);
        appCompatTextView6.setGravity(17);
        int K5 = tf3.K(45);
        int K6 = tf3.K(31);
        int K7 = tf3.K(15);
        ViewGroup.LayoutParams layoutParams29 = appCompatTextView6.getLayoutParams();
        if (layoutParams29 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams29;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(K5, K6);
        }
        layoutParams6.width = K5;
        layoutParams6.height = K6;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(K7, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView6.setLayoutParams(layoutParams6);
        h.addView(appCompatTextView6);
        this.m = appCompatTextView6;
        if (h.getAttachToParent()) {
            eu3Var2.addView(h);
        }
        this.k = h;
        eu3 eu3Var3 = new eu3(eu3Var2.getContext(), null, 6, 0);
        eu3Var3.setOrientation(1);
        eu3Var3.setId(-1);
        ViewGroup.LayoutParams layoutParams30 = eu3Var3.getLayoutParams();
        if (layoutParams30 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams30;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams7.width = -2;
        layoutParams7.height = -2;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        layoutParams7.width = -2;
        eu3Var3.setLayoutParams(layoutParams7);
        eu3Var3.setGravity(1);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(eu3Var3.getContext(), null);
        appCompatTextView7.setId(-1);
        appCompatTextView7.setText("");
        tf3.A0(appCompatTextView7);
        appCompatTextView7.setTextSize(30.0f);
        appCompatTextView7.setTextColor(-1);
        ViewGroup.LayoutParams layoutParams31 = appCompatTextView7.getLayoutParams();
        if (layoutParams31 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams31;
        } else {
            layoutParams8 = null;
        }
        if (layoutParams8 == null) {
            layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams8.width = -2;
        layoutParams8.height = -2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        layoutParams8.width = -2;
        appCompatTextView7.setLayoutParams(layoutParams8);
        eu3Var3.addView(appCompatTextView7);
        this.j = appCompatTextView7;
        AppCompatButton appCompatButton = new AppCompatButton(eu3Var3.getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        ViewGroup.LayoutParams layoutParams32 = appCompatButton.getLayoutParams();
        if (layoutParams32 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams32;
        } else {
            layoutParams9 = null;
        }
        if (layoutParams9 == null) {
            layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams9.width = -2;
        layoutParams9.height = -2;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(-1, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        layoutParams9.width = tf3.K(318);
        layoutParams9.height = tf3.K(40);
        layoutParams9.leftMargin = tf3.K(16);
        layoutParams9.rightMargin = tf3.K(16);
        layoutParams9.bottomMargin = tf3.K(10);
        layoutParams9.topMargin = tf3.K(17);
        appCompatButton.setLayoutParams(layoutParams9);
        AppCompatTextView appCompatTextView8 = this.v;
        if (appCompatTextView8 == null) {
            appCompatTextView8 = null;
        }
        appCompatButton.setNextFocusUpId(appCompatTextView8.getId());
        xm3.d(appCompatButton);
        appCompatButton.setText(pd0.y(R.string.TapToRefresh));
        final int i4 = 4;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                AppCompatEditText appCompatEditText = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i32) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i42 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i5 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i6 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText2 = signInActivity.r;
                        if (appCompatEditText2 != null) {
                            appCompatEditText = appCompatEditText2;
                        }
                        xm3.g(appCompatEditText);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText);
                        return;
                }
            }
        });
        xm3.d(appCompatButton);
        eu3Var3.addView(appCompatButton);
        if (eu3Var3.getAttachToParent()) {
            eu3Var2.addView(eu3Var3);
        }
        this.i = eu3Var3;
        Space space = new Space(eu3Var2.getContext());
        if (space.getLayoutParams() == null) {
            hx2.v(-2, -2, space);
        }
        ViewGroup.LayoutParams layoutParams33 = space.getLayoutParams();
        if (layoutParams33 instanceof LinearLayout.LayoutParams) {
            layoutParams10 = (LinearLayout.LayoutParams) layoutParams33;
        } else {
            layoutParams10 = null;
        }
        if (layoutParams10 == null) {
            layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams10.width = -2;
        layoutParams10.height = -2;
        layoutParams10.weight = Math.max(-1.0f, layoutParams10.weight);
        layoutParams10.gravity = Math.max(-1, layoutParams10.gravity);
        layoutParams10.leftMargin = Math.max(-1, layoutParams10.leftMargin);
        layoutParams10.topMargin = Math.max(-1, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(-1, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        layoutParams10.weight = 1.0f;
        space.setLayoutParams(layoutParams10);
        eu3Var2.addView(space);
        AppCompatTextView appCompatTextView9 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView9.setId(-1);
        appCompatTextView9.setText("");
        tf3.A0(appCompatTextView9);
        appCompatTextView9.setText(pd0.y(R.string.ViaMobilePhoneTips));
        appCompatTextView9.setTextSize(16.0f);
        appCompatTextView9.setTextColor(-6710887);
        appCompatTextView9.setLineHeight(tf3.S(26));
        ViewGroup.LayoutParams layoutParams34 = appCompatTextView9.getLayoutParams();
        if (layoutParams34 instanceof LinearLayout.LayoutParams) {
            layoutParams11 = (LinearLayout.LayoutParams) layoutParams34;
        } else {
            layoutParams11 = null;
        }
        if (layoutParams11 == null) {
            layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams11.width = -2;
        layoutParams11.height = -2;
        layoutParams11.weight = Math.max(-1.0f, layoutParams11.weight);
        layoutParams11.gravity = Math.max(-1, layoutParams11.gravity);
        layoutParams11.leftMargin = Math.max(-1, layoutParams11.leftMargin);
        layoutParams11.topMargin = Math.max(-1, layoutParams11.topMargin);
        layoutParams11.rightMargin = Math.max(-1, layoutParams11.rightMargin);
        layoutParams11.bottomMargin = Math.max(-1, layoutParams11.bottomMargin);
        layoutParams11.width = -2;
        appCompatTextView9.setLayoutParams(layoutParams11);
        eu3Var2.addView(appCompatTextView9);
        tf3.w0(eu3Var2, 0, tf3.K(92), 5);
        if (eu3Var2.getAttachToParent()) {
            eu3Var.addView(eu3Var2);
        }
        this.g = eu3Var2;
        eu3 eu3Var4 = new eu3(eu3Var.getContext(), null, 6, 0);
        eu3Var4.setOrientation(1);
        eu3Var4.setId(-1);
        eu3Var4.setGravity(1);
        eu3 h2 = hx2.h(eu3Var4.getContext(), null, 6, 0, 0);
        h2.setId(-1);
        h2.setFocusable(true);
        ViewGroup.LayoutParams layoutParams35 = h2.getLayoutParams();
        if (layoutParams35 instanceof LinearLayout.LayoutParams) {
            layoutParams12 = (LinearLayout.LayoutParams) layoutParams35;
        } else {
            layoutParams12 = null;
        }
        if (layoutParams12 == null) {
            layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams12.width = -2;
        layoutParams12.height = -2;
        layoutParams12.weight = Math.max(-1.0f, layoutParams12.weight);
        layoutParams12.gravity = Math.max(-1, layoutParams12.gravity);
        layoutParams12.leftMargin = Math.max(-1, layoutParams12.leftMargin);
        layoutParams12.topMargin = Math.max(-1, layoutParams12.topMargin);
        layoutParams12.rightMargin = Math.max(-1, layoutParams12.rightMargin);
        layoutParams12.bottomMargin = Math.max(-1, layoutParams12.bottomMargin);
        layoutParams12.width = tf3.K(318);
        h2.setLayoutParams(layoutParams12);
        AppCompatTextView appCompatTextView10 = this.w;
        if (appCompatTextView10 == null) {
            appCompatTextView10 = null;
        }
        h2.setNextFocusUpId(appCompatTextView10.getId());
        h2.setGravity(16);
        final int i5 = 5;
        h2.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i5;
                AppCompatEditText appCompatEditText = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i32) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i42 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i52 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i6 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText2 = signInActivity.r;
                        if (appCompatEditText2 != null) {
                            appCompatEditText = appCompatEditText2;
                        }
                        xm3.g(appCompatEditText);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText);
                        return;
                }
            }
        });
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(h2.getContext(), null);
        appCompatImageView2.setId(-1);
        appCompatImageView2.setPadding(tf3.K(10), tf3.K(0), tf3.K(10), 0);
        appCompatImageView2.setDuplicateParentStateEnabled(true);
        appCompatImageView2.setImageResource(R.drawable.tv_ic_email);
        h2.addView(appCompatImageView2);
        this.n = appCompatImageView2;
        AppCompatEditText appCompatEditText = new AppCompatEditText(h2.getContext(), null);
        appCompatEditText.setId(-1);
        tf3.A0(appCompatEditText);
        ViewGroup.LayoutParams layoutParams36 = appCompatEditText.getLayoutParams();
        if (layoutParams36 instanceof LinearLayout.LayoutParams) {
            layoutParams13 = (LinearLayout.LayoutParams) layoutParams36;
        } else {
            layoutParams13 = null;
        }
        if (layoutParams13 == null) {
            layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams13.width = -2;
        layoutParams13.height = -2;
        layoutParams13.weight = Math.max(-1.0f, layoutParams13.weight);
        layoutParams13.gravity = Math.max(-1, layoutParams13.gravity);
        layoutParams13.leftMargin = Math.max(-1, layoutParams13.leftMargin);
        layoutParams13.topMargin = Math.max(-1, layoutParams13.topMargin);
        layoutParams13.rightMargin = Math.max(-1, layoutParams13.rightMargin);
        layoutParams13.bottomMargin = Math.max(-1, layoutParams13.bottomMargin);
        layoutParams13.width = -1;
        appCompatEditText.setLayoutParams(layoutParams13);
        AppCompatTextView appCompatTextView11 = this.w;
        if (appCompatTextView11 == null) {
            appCompatTextView11 = null;
        }
        appCompatEditText.setNextFocusUpId(appCompatTextView11.getId());
        appCompatEditText.setHint(pd0.y(R.string.Email));
        appCompatEditText.setHintTextColor(-10066330);
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine(true);
        m20.J(appCompatEditText);
        appCompatEditText.setImeOptions(5);
        appCompatEditText.setOnEditorActionListener(new er(this, 2));
        appCompatEditText.setBackground(null);
        xm3.h(appCompatEditText);
        appCompatEditText.setTextColor(zf3.y(R.color.tv_common_input_text));
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: kt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f3009b;

            {
                this.f3009b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i6 = i;
                AppCompatImageView appCompatImageView3 = null;
                SignInActivity signInActivity = this.f3009b;
                switch (i6) {
                    case 0:
                        eu3 eu3Var5 = signInActivity.p;
                        if (eu3Var5 == null) {
                            eu3Var5 = null;
                        }
                        eu3Var5.setSelected(z);
                        AppCompatImageView appCompatImageView4 = signInActivity.n;
                        if (appCompatImageView4 != null) {
                            appCompatImageView3 = appCompatImageView4;
                        }
                        appCompatImageView3.setSelected(z);
                        return;
                    default:
                        eu3 eu3Var6 = signInActivity.q;
                        if (eu3Var6 == null) {
                            eu3Var6 = null;
                        }
                        eu3Var6.setSelected(z);
                        AppCompatImageView appCompatImageView5 = signInActivity.o;
                        if (appCompatImageView5 != null) {
                            appCompatImageView3 = appCompatImageView5;
                        }
                        appCompatImageView3.setSelected(z);
                        return;
                }
            }
        });
        appCompatEditText.addTextChangedListener(new pt2(this, i));
        h2.addView(appCompatEditText);
        this.r = appCompatEditText;
        if (h2.getAttachToParent()) {
            eu3Var4.addView(h2);
        }
        this.p = h2;
        AppCompatTextView appCompatTextView12 = new AppCompatTextView(eu3Var4.getContext(), null);
        appCompatTextView12.setId(-1);
        appCompatTextView12.setText("");
        tf3.A0(appCompatTextView12);
        appCompatTextView12.setTextSize(12.0f);
        appCompatTextView12.setTextColor(zf3.v(R.color.tvErrorColor));
        int K8 = tf3.K(318);
        int K9 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams37 = appCompatTextView12.getLayoutParams();
        if (layoutParams37 instanceof LinearLayout.LayoutParams) {
            layoutParams14 = (LinearLayout.LayoutParams) layoutParams37;
        } else {
            layoutParams14 = null;
        }
        if (layoutParams14 == null) {
            layoutParams14 = new LinearLayout.LayoutParams(K8, -2);
        }
        layoutParams14.width = K8;
        layoutParams14.height = -2;
        layoutParams14.weight = Math.max(-1.0f, layoutParams14.weight);
        layoutParams14.gravity = Math.max(-1, layoutParams14.gravity);
        layoutParams14.leftMargin = Math.max(-1, layoutParams14.leftMargin);
        layoutParams14.topMargin = Math.max(K9, layoutParams14.topMargin);
        layoutParams14.rightMargin = Math.max(-1, layoutParams14.rightMargin);
        layoutParams14.bottomMargin = Math.max(-1, layoutParams14.bottomMargin);
        appCompatTextView12.setLayoutParams(layoutParams14);
        eu3Var4.addView(appCompatTextView12);
        this.t = appCompatTextView12;
        eu3 h3 = hx2.h(eu3Var4.getContext(), null, 6, 0, 0);
        h3.setId(-1);
        h3.setFocusable(true);
        int K10 = tf3.K(318);
        int K11 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams38 = h3.getLayoutParams();
        if (layoutParams38 instanceof LinearLayout.LayoutParams) {
            layoutParams15 = (LinearLayout.LayoutParams) layoutParams38;
        } else {
            layoutParams15 = null;
        }
        if (layoutParams15 == null) {
            layoutParams15 = new LinearLayout.LayoutParams(K10, -2);
        }
        layoutParams15.width = K10;
        layoutParams15.height = -2;
        layoutParams15.weight = Math.max(-1.0f, layoutParams15.weight);
        layoutParams15.gravity = Math.max(-1, layoutParams15.gravity);
        layoutParams15.leftMargin = Math.max(-1, layoutParams15.leftMargin);
        layoutParams15.topMargin = Math.max(K11, layoutParams15.topMargin);
        layoutParams15.rightMargin = Math.max(-1, layoutParams15.rightMargin);
        layoutParams15.bottomMargin = Math.max(-1, layoutParams15.bottomMargin);
        h3.setLayoutParams(layoutParams15);
        h3.setGravity(16);
        final int i6 = 6;
        h3.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i6;
                AppCompatEditText appCompatEditText2 = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i32) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i42 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i52 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i62 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText22 = signInActivity.r;
                        if (appCompatEditText22 != null) {
                            appCompatEditText2 = appCompatEditText22;
                        }
                        xm3.g(appCompatEditText2);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText2 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText2);
                        return;
                }
            }
        });
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(h3.getContext(), null);
        appCompatImageView3.setId(-1);
        appCompatImageView3.setPadding(tf3.K(10), tf3.K(0), tf3.K(10), 0);
        appCompatImageView3.setDuplicateParentStateEnabled(true);
        appCompatImageView3.setImageResource(R.drawable.tv_ic_password_lock);
        h3.addView(appCompatImageView3);
        this.o = appCompatImageView3;
        AppCompatEditText appCompatEditText2 = new AppCompatEditText(h3.getContext(), null);
        appCompatEditText2.setId(-1);
        tf3.A0(appCompatEditText2);
        ViewGroup.LayoutParams layoutParams39 = appCompatEditText2.getLayoutParams();
        if (layoutParams39 instanceof LinearLayout.LayoutParams) {
            layoutParams16 = (LinearLayout.LayoutParams) layoutParams39;
        } else {
            layoutParams16 = null;
        }
        if (layoutParams16 == null) {
            layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams16.width = -2;
        layoutParams16.height = -2;
        layoutParams16.weight = Math.max(-1.0f, layoutParams16.weight);
        layoutParams16.gravity = Math.max(-1, layoutParams16.gravity);
        layoutParams16.leftMargin = Math.max(-1, layoutParams16.leftMargin);
        layoutParams16.topMargin = Math.max(-1, layoutParams16.topMargin);
        layoutParams16.rightMargin = Math.max(-1, layoutParams16.rightMargin);
        layoutParams16.bottomMargin = Math.max(-1, layoutParams16.bottomMargin);
        layoutParams16.width = -1;
        appCompatEditText2.setLayoutParams(layoutParams16);
        appCompatEditText2.setHint(pd0.y(R.string.Password));
        appCompatEditText2.setHintTextColor(-10066330);
        appCompatEditText2.setMaxLines(1);
        appCompatEditText2.setSingleLine(true);
        appCompatEditText2.setBackground(null);
        xm3.h(appCompatEditText2);
        appCompatEditText2.setTextColor(zf3.y(R.color.tv_common_input_text));
        appCompatEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: kt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f3009b;

            {
                this.f3009b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i62 = i2;
                AppCompatImageView appCompatImageView32 = null;
                SignInActivity signInActivity = this.f3009b;
                switch (i62) {
                    case 0:
                        eu3 eu3Var5 = signInActivity.p;
                        if (eu3Var5 == null) {
                            eu3Var5 = null;
                        }
                        eu3Var5.setSelected(z);
                        AppCompatImageView appCompatImageView4 = signInActivity.n;
                        if (appCompatImageView4 != null) {
                            appCompatImageView32 = appCompatImageView4;
                        }
                        appCompatImageView32.setSelected(z);
                        return;
                    default:
                        eu3 eu3Var6 = signInActivity.q;
                        if (eu3Var6 == null) {
                            eu3Var6 = null;
                        }
                        eu3Var6.setSelected(z);
                        AppCompatImageView appCompatImageView5 = signInActivity.o;
                        if (appCompatImageView5 != null) {
                            appCompatImageView32 = appCompatImageView5;
                        }
                        appCompatImageView32.setSelected(z);
                        return;
                }
            }
        });
        appCompatEditText2.addTextChangedListener(new pt2(this, i2));
        appCompatEditText2.setInputType(128);
        appCompatEditText2.setImeOptions(6);
        appCompatEditText2.setOnEditorActionListener(new b42(i2, appCompatEditText2, this));
        appCompatEditText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        h3.addView(appCompatEditText2);
        this.s = appCompatEditText2;
        if (h3.getAttachToParent()) {
            eu3Var4.addView(h3);
        }
        this.q = h3;
        AppCompatTextView appCompatTextView13 = new AppCompatTextView(eu3Var4.getContext(), null);
        appCompatTextView13.setId(-1);
        appCompatTextView13.setText("");
        tf3.A0(appCompatTextView13);
        appCompatTextView13.setTextSize(12.0f);
        appCompatTextView13.setTextColor(zf3.v(R.color.tvErrorColor));
        int K12 = tf3.K(318);
        int K13 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams40 = appCompatTextView13.getLayoutParams();
        if (layoutParams40 instanceof LinearLayout.LayoutParams) {
            layoutParams17 = (LinearLayout.LayoutParams) layoutParams40;
        } else {
            layoutParams17 = null;
        }
        if (layoutParams17 == null) {
            layoutParams17 = new LinearLayout.LayoutParams(K12, -2);
        }
        layoutParams17.width = K12;
        layoutParams17.height = -2;
        layoutParams17.weight = Math.max(-1.0f, layoutParams17.weight);
        layoutParams17.gravity = Math.max(-1, layoutParams17.gravity);
        layoutParams17.leftMargin = Math.max(-1, layoutParams17.leftMargin);
        layoutParams17.topMargin = Math.max(K13, layoutParams17.topMargin);
        layoutParams17.rightMargin = Math.max(-1, layoutParams17.rightMargin);
        layoutParams17.bottomMargin = Math.max(-1, layoutParams17.bottomMargin);
        appCompatTextView13.setLayoutParams(layoutParams17);
        eu3Var4.addView(appCompatTextView13);
        this.u = appCompatTextView13;
        AppCompatButton appCompatButton2 = new AppCompatButton(eu3Var4.getContext(), null);
        appCompatButton2.setId(-1);
        appCompatButton2.setText("");
        tf3.A0(appCompatButton2);
        ViewGroup.LayoutParams layoutParams41 = appCompatButton2.getLayoutParams();
        if (layoutParams41 instanceof LinearLayout.LayoutParams) {
            layoutParams18 = (LinearLayout.LayoutParams) layoutParams41;
        } else {
            layoutParams18 = null;
        }
        if (layoutParams18 == null) {
            layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams18.width = -2;
        layoutParams18.height = -2;
        layoutParams18.weight = Math.max(-1.0f, layoutParams18.weight);
        layoutParams18.gravity = Math.max(-1, layoutParams18.gravity);
        layoutParams18.leftMargin = Math.max(-1, layoutParams18.leftMargin);
        layoutParams18.topMargin = Math.max(-1, layoutParams18.topMargin);
        layoutParams18.rightMargin = Math.max(-1, layoutParams18.rightMargin);
        layoutParams18.bottomMargin = Math.max(-1, layoutParams18.bottomMargin);
        layoutParams18.width = tf3.K(318);
        layoutParams18.height = tf3.K(40);
        layoutParams18.leftMargin = tf3.K(16);
        layoutParams18.rightMargin = tf3.K(16);
        layoutParams18.topMargin = tf3.K(25);
        appCompatButton2.setLayoutParams(layoutParams18);
        appCompatButton2.setText(pd0.y(R.string.SignIn));
        appCompatButton2.setTextSize(15.0f);
        appCompatButton2.setOnFocusChangeListener(new lt2(appCompatButton2, i));
        xm3.d(appCompatButton2);
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i2;
                AppCompatEditText appCompatEditText22 = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i32) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i42 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i52 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i62 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText222 = signInActivity.r;
                        if (appCompatEditText222 != null) {
                            appCompatEditText22 = appCompatEditText222;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText22 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                }
            }
        });
        eu3Var4.addView(appCompatButton2);
        this.y = appCompatButton2;
        AppCompatTextView appCompatTextView14 = new AppCompatTextView(eu3Var4.getContext(), null);
        appCompatTextView14.setId(-1);
        appCompatTextView14.setText("");
        tf3.A0(appCompatTextView14);
        appCompatTextView14.setId(View.generateViewId());
        appCompatTextView14.setNextFocusLeftId(appCompatTextView14.getId());
        appCompatTextView14.setNextFocusRightId(appCompatTextView14.getId());
        int K14 = tf3.K(5);
        int K15 = tf3.K(15);
        ViewGroup.LayoutParams layoutParams42 = appCompatTextView14.getLayoutParams();
        if (layoutParams42 instanceof LinearLayout.LayoutParams) {
            layoutParams19 = (LinearLayout.LayoutParams) layoutParams42;
        } else {
            layoutParams19 = null;
        }
        if (layoutParams19 == null) {
            layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams19.width = -2;
        layoutParams19.height = -2;
        layoutParams19.weight = Math.max(-1.0f, layoutParams19.weight);
        layoutParams19.gravity = Math.max(-1, layoutParams19.gravity);
        layoutParams19.leftMargin = Math.max(-1, layoutParams19.leftMargin);
        layoutParams19.topMargin = Math.max(K15, layoutParams19.topMargin);
        layoutParams19.rightMargin = Math.max(-1, layoutParams19.rightMargin);
        layoutParams19.bottomMargin = Math.max(K14, layoutParams19.bottomMargin);
        appCompatTextView14.setLayoutParams(layoutParams19);
        appCompatTextView14.setText(pd0.y(R.string.CreateAccount));
        final int i7 = 2;
        appCompatTextView14.setOnClickListener(new View.OnClickListener(this) { // from class: jt2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInActivity f2827b;

            {
                this.f2827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i7;
                AppCompatEditText appCompatEditText22 = null;
                SignInActivity signInActivity = this.f2827b;
                switch (i32) {
                    case 0:
                        signInActivity.f = true;
                        signInActivity.T();
                        return;
                    case 1:
                        int i42 = SignInActivity.A;
                        signInActivity.R().n();
                        return;
                    case 2:
                        int i52 = SignInActivity.A;
                        bx3.f0(signInActivity, signInActivity.R().t);
                        return;
                    case 3:
                        signInActivity.f = false;
                        signInActivity.T();
                        hu2 R = signInActivity.R();
                        o03 o03Var = R.u;
                        if (o03Var != null) {
                            o03Var.c(null);
                        }
                        o03 o03Var2 = R.v;
                        if (o03Var2 != null) {
                            o03Var2.c(null);
                            return;
                        }
                        return;
                    case 4:
                        int i62 = SignInActivity.A;
                        signInActivity.R().m();
                        return;
                    case 5:
                        AppCompatEditText appCompatEditText222 = signInActivity.r;
                        if (appCompatEditText222 != null) {
                            appCompatEditText22 = appCompatEditText222;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    default:
                        AppCompatEditText appCompatEditText3 = signInActivity.s;
                        if (appCompatEditText3 != null) {
                            appCompatEditText22 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                }
            }
        });
        xm3.f(appCompatTextView14);
        eu3Var4.addView(appCompatTextView14);
        if (eu3Var4.getAttachToParent()) {
            eu3Var.addView(eu3Var4);
        }
        this.h = eu3Var4;
        if (eu3Var.getAttachToParent()) {
            setContentView(eu3Var);
        }
        AppCompatTextView appCompatTextView15 = this.v;
        if (appCompatTextView15 != null) {
            appCompatTextView = appCompatTextView15;
        }
        appCompatTextView.requestFocus();
        S();
        R().l();
    }

    @Override // defpackage.nd3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
        rt3.e().c(this);
    }

    @Override // defpackage.nd3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        rt3.e().l(this);
        super.onStop();
    }
}
