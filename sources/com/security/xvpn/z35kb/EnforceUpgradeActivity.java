package com.security.xvpn.z35kb;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import b.ContentWrapper;
import defpackage.cr1;
import defpackage.dn;
import defpackage.eu3;
import defpackage.fl;
import defpackage.hx2;
import defpackage.n01;
import defpackage.pd0;
import defpackage.rr0;
import defpackage.tf3;

/* loaded from: classes2.dex */
public final class EnforceUpgradeActivity extends dn {
    public static final /* synthetic */ int k = 0;

    @Override // defpackage.lt3
    public final String M() {
        return "UpgradePage";
    }

    @Override // defpackage.lt3
    public final void R() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        LinearLayout.LayoutParams layoutParams6;
        LinearLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8 = null;
        ContentWrapper contentWrapper = new ContentWrapper(this, null, 6);
        contentWrapper.setId(-1);
        int i = 0;
        eu3 eu3Var = new eu3(contentWrapper.getContext(), null, 6, 0);
        int i2 = 1;
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        eu3Var.setGravity(1);
        eu3 eu3Var2 = new eu3(eu3Var.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(-1);
        eu3Var2.setGravity(1);
        fl.g(this, eu3Var2, 1000003);
        Space space = new Space(eu3Var2.getContext());
        if (space.getLayoutParams() == null) {
            hx2.v(-2, -2, space);
        }
        ViewGroup.LayoutParams layoutParams9 = space.getLayoutParams();
        if (layoutParams9 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams9;
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
        layoutParams.weight = 0.41f;
        space.setLayoutParams(layoutParams);
        eu3Var2.addView(space);
        String y = pd0.y(R.string.AppUpgradeTitle);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText(y);
        tf3.A0(appCompatTextView);
        appCompatTextView.setGravity(1);
        appCompatTextView.setTypeface(n01.c());
        appCompatTextView.setTextSize(19.0f);
        fl.n(this, appCompatTextView, 1000013);
        eu3Var2.addView(appCompatTextView);
        Space space2 = new Space(eu3Var2.getContext());
        if (space2.getLayoutParams() == null) {
            hx2.v(-2, -2, space2);
        }
        ViewGroup.LayoutParams layoutParams10 = space2.getLayoutParams();
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
        layoutParams2.weight = 1.0f;
        space2.setLayoutParams(layoutParams2);
        eu3Var2.addView(space2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(eu3Var2.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.img_app_upgrade);
        eu3Var2.addView(appCompatImageView);
        Space space3 = new Space(eu3Var2.getContext());
        if (space3.getLayoutParams() == null) {
            hx2.v(-2, -2, space3);
        }
        ViewGroup.LayoutParams layoutParams11 = space3.getLayoutParams();
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
        space3.setLayoutParams(layoutParams3);
        eu3Var2.addView(space3);
        contentWrapper.a(new rr0(eu3Var2, i));
        if (eu3Var2.getAttachToParent()) {
            eu3Var.addView(eu3Var2);
        }
        ViewGroup.LayoutParams layoutParams12 = eu3Var2.getLayoutParams();
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
        layoutParams4.width = -1;
        layoutParams4.weight = 1.0f;
        eu3Var2.setLayoutParams(layoutParams4);
        Space space4 = new Space(eu3Var.getContext());
        if (space4.getLayoutParams() == null) {
            hx2.v(-2, -2, space4);
        }
        ViewGroup.LayoutParams layoutParams13 = space4.getLayoutParams();
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
        layoutParams5.weight = 0.12f;
        space4.setLayoutParams(layoutParams5);
        eu3Var.addView(space4);
        String y2 = pd0.y(R.string.AppUpgradeDetails);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText(y2);
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextSize(12.0f);
        fl.n(this, appCompatTextView2, 1000014);
        eu3Var.addView(appCompatTextView2);
        Space space5 = new Space(eu3Var.getContext());
        if (space5.getLayoutParams() == null) {
            hx2.v(-2, -2, space5);
        }
        ViewGroup.LayoutParams layoutParams14 = space5.getLayoutParams();
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
        layoutParams6.weight = 0.4f;
        space5.setLayoutParams(layoutParams6);
        eu3Var.addView(space5);
        String y3 = pd0.y(R.string.AppUpgradeBtn);
        AppCompatButton appCompatButton = new AppCompatButton(eu3Var.getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText(y3);
        tf3.A0(appCompatButton);
        appCompatButton.setTextColor(-1);
        appCompatButton.setBackgroundResource(R.drawable.btn_blue_round_full);
        appCompatButton.setAllCaps(false);
        ViewGroup.LayoutParams layoutParams15 = appCompatButton.getLayoutParams();
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
        layoutParams7.height = tf3.K(48);
        layoutParams7.width = tf3.K(280);
        appCompatButton.setLayoutParams(layoutParams7);
        appCompatButton.setOnClickListener(new cr1(this, 7));
        eu3Var.addView(appCompatButton);
        Space space6 = new Space(eu3Var.getContext());
        if (space6.getLayoutParams() == null) {
            hx2.v(-2, -2, space6);
        }
        ViewGroup.LayoutParams layoutParams16 = space6.getLayoutParams();
        if (layoutParams16 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams16;
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
        layoutParams8.weight = 0.2f;
        space6.setLayoutParams(layoutParams8);
        eu3Var.addView(space6);
        contentWrapper.a(new rr0(eu3Var, i2));
        if (eu3Var.getAttachToParent()) {
            contentWrapper.addView(eu3Var);
        }
        setContentView(contentWrapper);
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        moveTaskToBack(true);
    }
}
