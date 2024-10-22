package com.security.xvpn.z35kb.television;

import a.bx;
import android.app.Application;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import defpackage.d42;
import defpackage.du3;
import defpackage.eu3;
import defpackage.ew3;
import defpackage.g53;
import defpackage.g82;
import defpackage.hu3;
import defpackage.hx2;
import defpackage.l83;
import defpackage.m20;
import defpackage.n01;
import defpackage.nd3;
import defpackage.om1;
import defpackage.oy2;
import defpackage.tf3;
import defpackage.to1;
import defpackage.yb;
import defpackage.zf3;

/* loaded from: classes2.dex */
public final class SplashActivity extends nd3 {
    public static final /* synthetic */ int i = 0;
    public boolean f;
    public boolean g;
    public g82 h;

    public static final void R(SplashActivity splashActivity) {
        if (!splashActivity.g) {
            yb.f5305b.getClass();
            if (((Boolean) yb.f.getValue()).booleanValue() && splashActivity.f) {
                if (((Boolean) yb.d.getValue()).booleanValue()) {
                    if (splashActivity.h == null) {
                        splashActivity.h = new g82(splashActivity);
                    }
                    g82 g82Var = splashActivity.h;
                    if (g82Var != null) {
                        g82Var.show();
                        return;
                    }
                    return;
                }
                Application application = yb.c;
                if (application == null) {
                    application = null;
                }
                l83.a(application);
                if (ew3.o()) {
                    if (XApplication.c) {
                        tf3.h0(splashActivity, HomeActivity.class, null, 0, 6);
                    } else {
                        tf3.h0(splashActivity, MainActivity.class, null, 0, 6);
                    }
                } else if (XApplication.c) {
                    tf3.h0(splashActivity, GuideActivity.class, null, 0, 6);
                } else {
                    tf3.h0(splashActivity, GuideToPurchaseActivity.class, null, 0, 6);
                }
                splashActivity.finish();
            }
        }
    }

    @Override // defpackage.nd3
    public final String M() {
        return "TVSplashPage";
    }

    @Override // defpackage.nd3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FrameLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        LinearLayout.LayoutParams layoutParams6;
        LinearLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8;
        super.onCreate(bundle);
        if (!isTaskRoot()) {
            finish();
        }
        bx i2 = hx2.i(356);
        boolean q = i2.q();
        i2.h();
        this.g = q;
        du3 du3Var = new du3(this, null, 6, 0);
        du3Var.setId(-1);
        du3Var.setBackgroundColor(-16316665);
        ViewGroup.LayoutParams layoutParams9 = du3Var.getLayoutParams();
        if (layoutParams9 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams9;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        layoutParams.width = -1;
        layoutParams.height = -1;
        du3Var.setLayoutParams(layoutParams);
        eu3 eu3Var = new eu3(du3Var.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        ViewGroup.LayoutParams layoutParams10 = eu3Var.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams10;
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
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        eu3Var.setLayoutParams(layoutParams2);
        eu3Var.setGravity(1);
        Space space = new Space(eu3Var.getContext());
        if (space.getLayoutParams() == null) {
            hx2.v(-2, -2, space);
        }
        ViewGroup.LayoutParams layoutParams11 = space.getLayoutParams();
        if (layoutParams11 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams11;
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
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        layoutParams3.weight = 1.0f;
        space.setLayoutParams(layoutParams3);
        eu3Var.addView(space);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(100.0f);
        appCompatTextView.setTextColor(-12267312);
        appCompatTextView.setText("X-VPN");
        appCompatTextView.setTypeface(n01.a());
        ViewGroup.LayoutParams layoutParams12 = appCompatTextView.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams12;
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
        appCompatTextView.setLayoutParams(layoutParams4);
        appCompatTextView.post(new g53(appCompatTextView, 9));
        eu3Var.addView(appCompatTextView);
        tf3.w0(eu3Var, 0, tf3.K(33), 5);
        eu3Var.addView(new om1(eu3Var.getContext()));
        Space space2 = new Space(eu3Var.getContext());
        if (space2.getLayoutParams() == null) {
            hx2.v(-2, -2, space2);
        }
        ViewGroup.LayoutParams layoutParams13 = space2.getLayoutParams();
        if (layoutParams13 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams13;
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
        layoutParams5.weight = 1.0f;
        space2.setLayoutParams(layoutParams5);
        eu3Var.addView(space2);
        if (eu3Var.getAttachToParent()) {
            du3Var.addView(eu3Var);
        }
        eu3 h = hx2.h(du3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        ViewGroup.LayoutParams layoutParams14 = h.getLayoutParams();
        if (layoutParams14 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams14;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams6.width = -2;
        layoutParams6.height = -2;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        layoutParams6.width = -1;
        layoutParams6.height = -1;
        h.setLayoutParams(layoutParams6);
        View hu3Var = new hu3(h.getContext());
        ViewGroup.LayoutParams layoutParams15 = hu3Var.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams15;
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
        layoutParams7.width = tf3.K(400);
        layoutParams7.height = -1;
        hu3Var.setLayoutParams(layoutParams7);
        hu3Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, -16316665}));
        h.addView(hu3Var);
        View hu3Var2 = new hu3(h.getContext());
        ViewGroup.LayoutParams layoutParams16 = hu3Var2.getLayoutParams();
        if (layoutParams16 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams16;
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
        layoutParams8.weight = 1.0f;
        layoutParams8.height = -1;
        hu3Var2.setLayoutParams(layoutParams8);
        hu3Var2.setBackgroundColor(-16316665);
        h.addView(hu3Var2);
        h.post(new to1(15, h, this));
        if (h.getAttachToParent()) {
            du3Var.addView(h);
        }
        if (du3Var.getAttachToParent()) {
            setContentView(du3Var);
        }
        zf3.T(this, null, new oy2(this, null), 3);
        if (this.g) {
            m20.a1(this, d42.B);
        }
    }
}
