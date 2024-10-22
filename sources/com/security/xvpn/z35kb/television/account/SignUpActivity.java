package com.security.xvpn.z35kb.television.account;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.InputFilter;
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
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.account.SignUpActivity;
import defpackage.b42;
import defpackage.e;
import defpackage.er;
import defpackage.eu3;
import defpackage.ew3;
import defpackage.gi2;
import defpackage.gm3;
import defpackage.hu2;
import defpackage.hu3;
import defpackage.hx2;
import defpackage.ku2;
import defpackage.l81;
import defpackage.lt2;
import defpackage.m20;
import defpackage.m81;
import defpackage.mu2;
import defpackage.n01;
import defpackage.nd3;
import defpackage.pd0;
import defpackage.qt2;
import defpackage.qt3;
import defpackage.rt3;
import defpackage.t9;
import defpackage.tf3;
import defpackage.xm3;
import defpackage.yc2;
import defpackage.zf3;

/* loaded from: classes2.dex */
public final class SignUpActivity extends nd3 implements qt3 {
    public static final /* synthetic */ int q = 0;
    public AppCompatImageView f;
    public AppCompatImageView g;
    public eu3 h;
    public eu3 i;
    public AppCompatButton j;
    public AppCompatEditText k;
    public AppCompatEditText l;
    public AppCompatTextView m;
    public AppCompatTextView n;
    public eu3 o;
    public final gm3 p = new gm3(gi2.a(hu2.class), new l81(this, 5), e.E, new m81(this, 2));

    @Override // defpackage.nd3
    public final String M() {
        return "TVSignUpPage";
    }

    public final hu2 R() {
        return (hu2) this.p.getValue();
    }

    public final void S() {
        int i = 1;
        R().l.d(this, new qt2(i, new ku2(this, 0)));
        R().m.d(this, new qt2(i, new ku2(this, i)));
        R().f.d(this, new qt2(i, new ku2(this, 2)));
        R().n.d(this, new qt2(i, new ku2(this, 3)));
        R().g.d(this, new qt2(i, new ku2(this, 6)));
        R().i.d(this, new qt2(i, new ku2(this, 9)));
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

    @Override // defpackage.nd3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
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
        super.onCreate(bundle);
        final int i = 0;
        R().t = getIntent().getBooleanExtra("needBind", false);
        LinearLayout.LayoutParams layoutParams19 = null;
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
        Space space = new Space(eu3Var.getContext());
        if (space.getLayoutParams() == null) {
            hx2.v(-2, -2, space);
        }
        ViewGroup.LayoutParams layoutParams21 = space.getLayoutParams();
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
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        layoutParams2.weight = 1.0f;
        space.setLayoutParams(layoutParams2);
        eu3Var.addView(space);
        AppCompatImageView appCompatImageView = new AppCompatImageView(eu3Var.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.tv_ic_x_logo);
        eu3Var.addView(appCompatImageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(pd0.y(R.string.SignUpAccount));
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(28.5f);
        appCompatTextView.setTextColor(-1);
        int K = tf3.K(20);
        ViewGroup.LayoutParams layoutParams22 = appCompatTextView.getLayoutParams();
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
        layoutParams3.topMargin = Math.max(K, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams3);
        eu3Var.addView(appCompatTextView);
        eu3 h = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        int K2 = tf3.K(318);
        int K3 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams23 = h.getLayoutParams();
        if (layoutParams23 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams23;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(K2, -2);
        }
        layoutParams4.width = K2;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K3, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        h.setLayoutParams(layoutParams4);
        h.setFocusable(true);
        h.setGravity(16);
        h.setOnClickListener(new View.OnClickListener(this) { // from class: iu2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2651b;

            {
                this.f2651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                AppCompatEditText appCompatEditText = null;
                SignUpActivity signUpActivity = this.f2651b;
                switch (i3) {
                    case 0:
                        AppCompatEditText appCompatEditText2 = signUpActivity.k;
                        if (appCompatEditText2 != null) {
                            appCompatEditText = appCompatEditText2;
                        }
                        xm3.g(appCompatEditText);
                        return;
                    case 1:
                        int i4 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 2:
                        int i5 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 3:
                        AppCompatEditText appCompatEditText3 = signUpActivity.l;
                        if (appCompatEditText3 != null) {
                            appCompatEditText = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText);
                        return;
                    default:
                        int i6 = SignUpActivity.q;
                        signUpActivity.R().s();
                        return;
                }
            }
        });
        h.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ju2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2833b;

            {
                this.f2833b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v11, types: [androidx.appcompat.widget.AppCompatEditText] */
            /* JADX WARN: Type inference failed for: r3v6, types: [androidx.appcompat.widget.AppCompatEditText] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i3 = i;
                AppCompatImageView appCompatImageView2 = null;
                SignUpActivity signUpActivity = this.f2833b;
                switch (i3) {
                    case 0:
                        ?? r3 = signUpActivity.k;
                        if (r3 != 0) {
                            appCompatImageView2 = r3;
                        }
                        appCompatImageView2.setSelected(z);
                        return;
                    case 1:
                        eu3 eu3Var2 = signUpActivity.h;
                        if (eu3Var2 == null) {
                            eu3Var2 = null;
                        }
                        eu3Var2.setSelected(z);
                        AppCompatImageView appCompatImageView3 = signUpActivity.f;
                        if (appCompatImageView3 != null) {
                            appCompatImageView2 = appCompatImageView3;
                        }
                        appCompatImageView2.setSelected(z);
                        return;
                    case 2:
                        ?? r32 = signUpActivity.l;
                        if (r32 != 0) {
                            appCompatImageView2 = r32;
                        }
                        appCompatImageView2.setSelected(z);
                        return;
                    default:
                        eu3 eu3Var3 = signUpActivity.i;
                        if (eu3Var3 == null) {
                            eu3Var3 = null;
                        }
                        eu3Var3.setSelected(z);
                        AppCompatImageView appCompatImageView4 = signUpActivity.g;
                        if (appCompatImageView4 != null) {
                            appCompatImageView2 = appCompatImageView4;
                        }
                        appCompatImageView2.setSelected(z);
                        return;
                }
            }
        });
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(h.getContext(), null);
        appCompatImageView2.setId(-1);
        appCompatImageView2.setPadding(tf3.K(10), tf3.K(0), tf3.K(10), 0);
        appCompatImageView2.setDuplicateParentStateEnabled(true);
        appCompatImageView2.setImageResource(R.drawable.tv_ic_email);
        h.addView(appCompatImageView2);
        this.f = appCompatImageView2;
        AppCompatEditText appCompatEditText = new AppCompatEditText(h.getContext(), null);
        appCompatEditText.setId(-1);
        tf3.A0(appCompatEditText);
        ViewGroup.LayoutParams layoutParams24 = appCompatEditText.getLayoutParams();
        if (layoutParams24 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams24;
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
        layoutParams5.width = -1;
        appCompatEditText.setLayoutParams(layoutParams5);
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine(true);
        appCompatEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(72)});
        m20.J(appCompatEditText);
        appCompatEditText.setImeOptions(5);
        appCompatEditText.setOnEditorActionListener(new er(this, 3));
        appCompatEditText.setBackground(null);
        appCompatEditText.setHint(pd0.y(R.string.Email));
        appCompatEditText.setHintTextColor(-10066330);
        xm3.h(appCompatEditText);
        appCompatEditText.setTextColor(zf3.y(R.color.tv_common_input_text));
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ju2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2833b;

            {
                this.f2833b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v11, types: [androidx.appcompat.widget.AppCompatEditText] */
            /* JADX WARN: Type inference failed for: r3v6, types: [androidx.appcompat.widget.AppCompatEditText] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i3 = i2;
                AppCompatImageView appCompatImageView22 = null;
                SignUpActivity signUpActivity = this.f2833b;
                switch (i3) {
                    case 0:
                        ?? r3 = signUpActivity.k;
                        if (r3 != 0) {
                            appCompatImageView22 = r3;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    case 1:
                        eu3 eu3Var2 = signUpActivity.h;
                        if (eu3Var2 == null) {
                            eu3Var2 = null;
                        }
                        eu3Var2.setSelected(z);
                        AppCompatImageView appCompatImageView3 = signUpActivity.f;
                        if (appCompatImageView3 != null) {
                            appCompatImageView22 = appCompatImageView3;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    case 2:
                        ?? r32 = signUpActivity.l;
                        if (r32 != 0) {
                            appCompatImageView22 = r32;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    default:
                        eu3 eu3Var3 = signUpActivity.i;
                        if (eu3Var3 == null) {
                            eu3Var3 = null;
                        }
                        eu3Var3.setSelected(z);
                        AppCompatImageView appCompatImageView4 = signUpActivity.g;
                        if (appCompatImageView4 != null) {
                            appCompatImageView22 = appCompatImageView4;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                }
            }
        });
        appCompatEditText.addTextChangedListener(new mu2(this, i));
        h.addView(appCompatEditText);
        this.k = appCompatEditText;
        if (h.getAttachToParent()) {
            eu3Var.addView(h);
        }
        this.h = h;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setTextColor(zf3.v(R.color.tvErrorColor));
        int K4 = tf3.K(318);
        int K5 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams25 = appCompatTextView2.getLayoutParams();
        if (layoutParams25 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams25;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(K4, -2);
        }
        layoutParams6.width = K4;
        layoutParams6.height = -2;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(K5, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams6);
        eu3Var.addView(appCompatTextView2);
        this.m = appCompatTextView2;
        eu3 h2 = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h2.setId(-1);
        int K6 = tf3.K(318);
        int K7 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams26 = h2.getLayoutParams();
        if (layoutParams26 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams26;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new LinearLayout.LayoutParams(K6, -2);
        }
        layoutParams7.width = K6;
        layoutParams7.height = -2;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(K7, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        h2.setLayoutParams(layoutParams7);
        h2.setFocusable(true);
        h2.setGravity(16);
        final int i3 = 3;
        h2.setOnClickListener(new View.OnClickListener(this) { // from class: iu2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2651b;

            {
                this.f2651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                AppCompatEditText appCompatEditText2 = null;
                SignUpActivity signUpActivity = this.f2651b;
                switch (i32) {
                    case 0:
                        AppCompatEditText appCompatEditText22 = signUpActivity.k;
                        if (appCompatEditText22 != null) {
                            appCompatEditText2 = appCompatEditText22;
                        }
                        xm3.g(appCompatEditText2);
                        return;
                    case 1:
                        int i4 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 2:
                        int i5 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 3:
                        AppCompatEditText appCompatEditText3 = signUpActivity.l;
                        if (appCompatEditText3 != null) {
                            appCompatEditText2 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText2);
                        return;
                    default:
                        int i6 = SignUpActivity.q;
                        signUpActivity.R().s();
                        return;
                }
            }
        });
        final int i4 = 2;
        h2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ju2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2833b;

            {
                this.f2833b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v11, types: [androidx.appcompat.widget.AppCompatEditText] */
            /* JADX WARN: Type inference failed for: r3v6, types: [androidx.appcompat.widget.AppCompatEditText] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i32 = i4;
                AppCompatImageView appCompatImageView22 = null;
                SignUpActivity signUpActivity = this.f2833b;
                switch (i32) {
                    case 0:
                        ?? r3 = signUpActivity.k;
                        if (r3 != 0) {
                            appCompatImageView22 = r3;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    case 1:
                        eu3 eu3Var2 = signUpActivity.h;
                        if (eu3Var2 == null) {
                            eu3Var2 = null;
                        }
                        eu3Var2.setSelected(z);
                        AppCompatImageView appCompatImageView3 = signUpActivity.f;
                        if (appCompatImageView3 != null) {
                            appCompatImageView22 = appCompatImageView3;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    case 2:
                        ?? r32 = signUpActivity.l;
                        if (r32 != 0) {
                            appCompatImageView22 = r32;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    default:
                        eu3 eu3Var3 = signUpActivity.i;
                        if (eu3Var3 == null) {
                            eu3Var3 = null;
                        }
                        eu3Var3.setSelected(z);
                        AppCompatImageView appCompatImageView4 = signUpActivity.g;
                        if (appCompatImageView4 != null) {
                            appCompatImageView22 = appCompatImageView4;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                }
            }
        });
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(h2.getContext(), null);
        appCompatImageView3.setId(-1);
        appCompatImageView3.setPadding(tf3.K(10), tf3.K(0), tf3.K(10), 0);
        appCompatImageView3.setDuplicateParentStateEnabled(true);
        appCompatImageView3.setImageResource(R.drawable.tv_ic_password_lock);
        h2.addView(appCompatImageView3);
        this.g = appCompatImageView3;
        AppCompatEditText appCompatEditText2 = new AppCompatEditText(h2.getContext(), null);
        appCompatEditText2.setId(-1);
        tf3.A0(appCompatEditText2);
        ViewGroup.LayoutParams layoutParams27 = appCompatEditText2.getLayoutParams();
        if (layoutParams27 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams27;
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
        layoutParams8.width = -1;
        appCompatEditText2.setLayoutParams(layoutParams8);
        appCompatEditText2.setMaxLines(1);
        appCompatEditText2.setSingleLine(true);
        appCompatEditText2.setBackground(null);
        appCompatEditText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(72)});
        xm3.h(appCompatEditText2);
        appCompatEditText2.setTextColor(zf3.y(R.color.tv_common_input_text));
        appCompatEditText2.setHint(pd0.y(R.string.Password));
        appCompatEditText2.setHintTextColor(-10066330);
        final int i5 = 3;
        appCompatEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ju2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2833b;

            {
                this.f2833b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v11, types: [androidx.appcompat.widget.AppCompatEditText] */
            /* JADX WARN: Type inference failed for: r3v6, types: [androidx.appcompat.widget.AppCompatEditText] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i32 = i5;
                AppCompatImageView appCompatImageView22 = null;
                SignUpActivity signUpActivity = this.f2833b;
                switch (i32) {
                    case 0:
                        ?? r3 = signUpActivity.k;
                        if (r3 != 0) {
                            appCompatImageView22 = r3;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    case 1:
                        eu3 eu3Var2 = signUpActivity.h;
                        if (eu3Var2 == null) {
                            eu3Var2 = null;
                        }
                        eu3Var2.setSelected(z);
                        AppCompatImageView appCompatImageView32 = signUpActivity.f;
                        if (appCompatImageView32 != null) {
                            appCompatImageView22 = appCompatImageView32;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    case 2:
                        ?? r32 = signUpActivity.l;
                        if (r32 != 0) {
                            appCompatImageView22 = r32;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                    default:
                        eu3 eu3Var3 = signUpActivity.i;
                        if (eu3Var3 == null) {
                            eu3Var3 = null;
                        }
                        eu3Var3.setSelected(z);
                        AppCompatImageView appCompatImageView4 = signUpActivity.g;
                        if (appCompatImageView4 != null) {
                            appCompatImageView22 = appCompatImageView4;
                        }
                        appCompatImageView22.setSelected(z);
                        return;
                }
            }
        });
        appCompatEditText2.addTextChangedListener(new mu2(this, i2));
        appCompatEditText2.setInputType(128);
        appCompatEditText2.setImeOptions(6);
        appCompatEditText2.setOnEditorActionListener(new b42(i4, appCompatEditText2, this));
        appCompatEditText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        h2.addView(appCompatEditText2);
        this.l = appCompatEditText2;
        if (h2.getAttachToParent()) {
            eu3Var.addView(h2);
        }
        this.i = h2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setTextSize(12.0f);
        appCompatTextView3.setTextColor(zf3.v(R.color.tvErrorColor));
        int K8 = tf3.K(318);
        int K9 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams28 = appCompatTextView3.getLayoutParams();
        if (layoutParams28 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams28;
        } else {
            layoutParams9 = null;
        }
        if (layoutParams9 == null) {
            layoutParams9 = new LinearLayout.LayoutParams(K8, -2);
        }
        layoutParams9.width = K8;
        layoutParams9.height = -2;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(K9, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams9);
        eu3Var.addView(appCompatTextView3);
        this.n = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setText(pd0.y(R.string.PasswordStrength));
        appCompatTextView4.setTextSize(12.0f);
        appCompatTextView4.setTextColor(-2763307);
        int K10 = tf3.K(318);
        int K11 = tf3.K(16);
        int K12 = tf3.K(16);
        int K13 = tf3.K(4);
        ViewGroup.LayoutParams layoutParams29 = appCompatTextView4.getLayoutParams();
        if (layoutParams29 instanceof LinearLayout.LayoutParams) {
            layoutParams10 = (LinearLayout.LayoutParams) layoutParams29;
        } else {
            layoutParams10 = null;
        }
        if (layoutParams10 == null) {
            layoutParams10 = new LinearLayout.LayoutParams(K10, -2);
        }
        layoutParams10.width = K10;
        layoutParams10.height = -2;
        layoutParams10.weight = Math.max(-1.0f, layoutParams10.weight);
        layoutParams10.gravity = Math.max(-1, layoutParams10.gravity);
        layoutParams10.leftMargin = Math.max(K11, layoutParams10.leftMargin);
        layoutParams10.topMargin = Math.max(K13, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(K12, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams10);
        eu3Var.addView(appCompatTextView4);
        eu3 h3 = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h3.setId(-1);
        int K14 = tf3.K(318);
        int K15 = tf3.K(16);
        int K16 = tf3.K(16);
        int K17 = tf3.K(8);
        ViewGroup.LayoutParams layoutParams30 = h3.getLayoutParams();
        if (layoutParams30 instanceof LinearLayout.LayoutParams) {
            layoutParams11 = (LinearLayout.LayoutParams) layoutParams30;
        } else {
            layoutParams11 = null;
        }
        if (layoutParams11 == null) {
            layoutParams11 = new LinearLayout.LayoutParams(K14, -2);
        }
        layoutParams11.width = K14;
        layoutParams11.height = -2;
        layoutParams11.weight = Math.max(-1.0f, layoutParams11.weight);
        layoutParams11.gravity = Math.max(-1, layoutParams11.gravity);
        layoutParams11.leftMargin = Math.max(K15, layoutParams11.leftMargin);
        layoutParams11.topMargin = Math.max(K17, layoutParams11.topMargin);
        layoutParams11.rightMargin = Math.max(K16, layoutParams11.rightMargin);
        layoutParams11.bottomMargin = Math.max(-1, layoutParams11.bottomMargin);
        h3.setLayoutParams(layoutParams11);
        e eVar = e.F;
        View hu3Var = new hu3(h3.getContext());
        hu3Var.setBackground((Drawable) eVar.invoke());
        h3.addView(hu3Var);
        ViewGroup.LayoutParams layoutParams31 = hu3Var.getLayoutParams();
        if (layoutParams31 instanceof LinearLayout.LayoutParams) {
            layoutParams12 = (LinearLayout.LayoutParams) layoutParams31;
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
        layoutParams12.height = tf3.K(5);
        layoutParams12.weight = 1.0f;
        hu3Var.setLayoutParams(layoutParams12);
        View hu3Var2 = new hu3(h3.getContext());
        hu3Var2.setBackground((Drawable) eVar.invoke());
        h3.addView(hu3Var2);
        ViewGroup.LayoutParams layoutParams32 = hu3Var2.getLayoutParams();
        if (layoutParams32 instanceof LinearLayout.LayoutParams) {
            layoutParams13 = (LinearLayout.LayoutParams) layoutParams32;
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
        layoutParams13.height = tf3.K(5);
        layoutParams13.weight = 1.0f;
        layoutParams13.leftMargin = tf3.K(9);
        hu3Var2.setLayoutParams(layoutParams13);
        View hu3Var3 = new hu3(h3.getContext());
        hu3Var3.setBackground((Drawable) eVar.invoke());
        h3.addView(hu3Var3);
        ViewGroup.LayoutParams layoutParams33 = hu3Var3.getLayoutParams();
        if (layoutParams33 instanceof LinearLayout.LayoutParams) {
            layoutParams14 = (LinearLayout.LayoutParams) layoutParams33;
        } else {
            layoutParams14 = null;
        }
        if (layoutParams14 == null) {
            layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams14.width = -2;
        layoutParams14.height = -2;
        layoutParams14.weight = Math.max(-1.0f, layoutParams14.weight);
        layoutParams14.gravity = Math.max(-1, layoutParams14.gravity);
        layoutParams14.leftMargin = Math.max(-1, layoutParams14.leftMargin);
        layoutParams14.topMargin = Math.max(-1, layoutParams14.topMargin);
        layoutParams14.rightMargin = Math.max(-1, layoutParams14.rightMargin);
        layoutParams14.bottomMargin = Math.max(-1, layoutParams14.bottomMargin);
        layoutParams14.height = tf3.K(5);
        layoutParams14.weight = 1.0f;
        layoutParams14.leftMargin = tf3.K(9);
        hu3Var3.setLayoutParams(layoutParams14);
        if (h3.getAttachToParent()) {
            eu3Var.addView(h3);
        }
        this.o = h3;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setText(pd0.y(R.string.PasswordStrengthDetails));
        appCompatTextView5.setTextSize(12.0f);
        appCompatTextView5.setTextColor(-10066330);
        int K18 = tf3.K(318);
        int K19 = tf3.K(16);
        int K20 = tf3.K(16);
        int K21 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams34 = appCompatTextView5.getLayoutParams();
        if (layoutParams34 instanceof LinearLayout.LayoutParams) {
            layoutParams15 = (LinearLayout.LayoutParams) layoutParams34;
        } else {
            layoutParams15 = null;
        }
        if (layoutParams15 == null) {
            layoutParams15 = new LinearLayout.LayoutParams(K18, -2);
        }
        layoutParams15.width = K18;
        layoutParams15.height = -2;
        layoutParams15.weight = Math.max(-1.0f, layoutParams15.weight);
        layoutParams15.gravity = Math.max(-1, layoutParams15.gravity);
        layoutParams15.leftMargin = Math.max(K19, layoutParams15.leftMargin);
        layoutParams15.topMargin = Math.max(K21, layoutParams15.topMargin);
        layoutParams15.rightMargin = Math.max(K20, layoutParams15.rightMargin);
        layoutParams15.bottomMargin = Math.max(-1, layoutParams15.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams15);
        eu3Var.addView(appCompatTextView5);
        AppCompatButton appCompatButton = new AppCompatButton(eu3Var.getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        ViewGroup.LayoutParams layoutParams35 = appCompatButton.getLayoutParams();
        if (layoutParams35 instanceof LinearLayout.LayoutParams) {
            layoutParams16 = (LinearLayout.LayoutParams) layoutParams35;
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
        layoutParams16.width = tf3.K(318);
        layoutParams16.height = tf3.K(40);
        layoutParams16.leftMargin = tf3.K(16);
        layoutParams16.rightMargin = tf3.K(16);
        layoutParams16.topMargin = tf3.K(25);
        appCompatButton.setLayoutParams(layoutParams16);
        appCompatButton.setText(pd0.y(R.string.SignUp));
        appCompatButton.setTextSize(15.0f);
        appCompatButton.setOnFocusChangeListener(new lt2(appCompatButton, 1));
        xm3.d(appCompatButton);
        final int i6 = 4;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: iu2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2651b;

            {
                this.f2651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i6;
                AppCompatEditText appCompatEditText22 = null;
                SignUpActivity signUpActivity = this.f2651b;
                switch (i32) {
                    case 0:
                        AppCompatEditText appCompatEditText222 = signUpActivity.k;
                        if (appCompatEditText222 != null) {
                            appCompatEditText22 = appCompatEditText222;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    case 1:
                        int i42 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 2:
                        int i52 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 3:
                        AppCompatEditText appCompatEditText3 = signUpActivity.l;
                        if (appCompatEditText3 != null) {
                            appCompatEditText22 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    default:
                        int i62 = SignUpActivity.q;
                        signUpActivity.R().s();
                        return;
                }
            }
        });
        eu3Var.addView(appCompatButton);
        this.j = appCompatButton;
        tf3.w0(eu3Var, 0, tf3.K(13), 5);
        eu3 h4 = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h4.setId(-1);
        h4.setGravity(16);
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(h4.getContext(), null);
        appCompatTextView6.setId(-1);
        appCompatTextView6.setText("");
        tf3.A0(appCompatTextView6);
        xm3.f(appCompatTextView6);
        appCompatTextView6.setText(pd0.y(R.string.TermsOfService));
        appCompatTextView6.setIncludeFontPadding(false);
        appCompatTextView6.setPadding(tf3.K(20), tf3.K(6), tf3.K(20), tf3.K(6));
        final int i7 = 1;
        appCompatTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: iu2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2651b;

            {
                this.f2651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i7;
                AppCompatEditText appCompatEditText22 = null;
                SignUpActivity signUpActivity = this.f2651b;
                switch (i32) {
                    case 0:
                        AppCompatEditText appCompatEditText222 = signUpActivity.k;
                        if (appCompatEditText222 != null) {
                            appCompatEditText22 = appCompatEditText222;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    case 1:
                        int i42 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 2:
                        int i52 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 3:
                        AppCompatEditText appCompatEditText3 = signUpActivity.l;
                        if (appCompatEditText3 != null) {
                            appCompatEditText22 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    default:
                        int i62 = SignUpActivity.q;
                        signUpActivity.R().s();
                        return;
                }
            }
        });
        appCompatTextView6.setStateListAnimator(tf3.z0());
        h4.addView(appCompatTextView6);
        View hu3Var4 = new hu3(h4.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(10 * tf3.F);
        gradientDrawable.setColor(-10066330);
        hu3Var4.setBackground(gradientDrawable);
        int K22 = tf3.K(2);
        int K23 = tf3.K(2);
        int K24 = tf3.K(6);
        ViewGroup.LayoutParams layoutParams36 = hu3Var4.getLayoutParams();
        if (layoutParams36 instanceof LinearLayout.LayoutParams) {
            layoutParams17 = (LinearLayout.LayoutParams) layoutParams36;
        } else {
            layoutParams17 = null;
        }
        if (layoutParams17 == null) {
            layoutParams17 = new LinearLayout.LayoutParams(K22, K23);
        }
        layoutParams17.width = K22;
        layoutParams17.height = K23;
        layoutParams17.weight = Math.max(-1.0f, layoutParams17.weight);
        layoutParams17.gravity = Math.max(-1, layoutParams17.gravity);
        layoutParams17.leftMargin = Math.max(-1, layoutParams17.leftMargin);
        layoutParams17.topMargin = Math.max(-1, layoutParams17.topMargin);
        layoutParams17.rightMargin = Math.max(-1, layoutParams17.rightMargin);
        layoutParams17.bottomMargin = Math.max(K24, layoutParams17.bottomMargin);
        hu3Var4.setLayoutParams(layoutParams17);
        h4.addView(hu3Var4);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(h4.getContext(), null);
        appCompatTextView7.setId(-1);
        appCompatTextView7.setText("");
        tf3.A0(appCompatTextView7);
        xm3.f(appCompatTextView7);
        appCompatTextView7.setIncludeFontPadding(false);
        appCompatTextView7.setText(pd0.y(R.string.PrivacyPolicy));
        appCompatTextView7.setPadding(tf3.K(20), tf3.K(6), tf3.K(20), tf3.K(6));
        final int i8 = 2;
        appCompatTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: iu2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpActivity f2651b;

            {
                this.f2651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i8;
                AppCompatEditText appCompatEditText22 = null;
                SignUpActivity signUpActivity = this.f2651b;
                switch (i32) {
                    case 0:
                        AppCompatEditText appCompatEditText222 = signUpActivity.k;
                        if (appCompatEditText222 != null) {
                            appCompatEditText22 = appCompatEditText222;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    case 1:
                        int i42 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 2:
                        int i52 = SignUpActivity.q;
                        tf3.h0(signUpActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", "")), 0, 4);
                        return;
                    case 3:
                        AppCompatEditText appCompatEditText3 = signUpActivity.l;
                        if (appCompatEditText3 != null) {
                            appCompatEditText22 = appCompatEditText3;
                        }
                        xm3.g(appCompatEditText22);
                        return;
                    default:
                        int i62 = SignUpActivity.q;
                        signUpActivity.R().s();
                        return;
                }
            }
        });
        appCompatTextView7.setStateListAnimator(tf3.z0());
        h4.addView(appCompatTextView7);
        if (h4.getAttachToParent()) {
            eu3Var.addView(h4);
        }
        ViewGroup.LayoutParams layoutParams37 = h4.getLayoutParams();
        if (layoutParams37 instanceof LinearLayout.LayoutParams) {
            layoutParams18 = (LinearLayout.LayoutParams) layoutParams37;
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
        layoutParams18.width = -2;
        h4.setLayoutParams(layoutParams18);
        Space space2 = new Space(eu3Var.getContext());
        if (space2.getLayoutParams() == null) {
            hx2.v(-2, -2, space2);
        }
        ViewGroup.LayoutParams layoutParams38 = space2.getLayoutParams();
        if (layoutParams38 instanceof LinearLayout.LayoutParams) {
            layoutParams19 = (LinearLayout.LayoutParams) layoutParams38;
        }
        if (layoutParams19 == null) {
            layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams19.width = -2;
        layoutParams19.height = -2;
        layoutParams19.weight = Math.max(-1.0f, layoutParams19.weight);
        layoutParams19.gravity = Math.max(-1, layoutParams19.gravity);
        layoutParams19.leftMargin = Math.max(-1, layoutParams19.leftMargin);
        layoutParams19.topMargin = Math.max(-1, layoutParams19.topMargin);
        layoutParams19.rightMargin = Math.max(-1, layoutParams19.rightMargin);
        layoutParams19.bottomMargin = Math.max(-1, layoutParams19.bottomMargin);
        layoutParams19.weight = 1.0f;
        space2.setLayoutParams(layoutParams19);
        eu3Var.addView(space2);
        if (eu3Var.getAttachToParent()) {
            setContentView(eu3Var);
        }
        S();
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
