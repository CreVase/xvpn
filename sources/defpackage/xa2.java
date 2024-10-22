package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.util.CenterScrollLayoutManager;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class xa2 extends lo {
    public static final /* synthetic */ int o = 0;
    public final ArrayList e;
    public final i60 f;
    public cf3 g;
    public RecyclerView h;
    public gu3 i;
    public AppCompatEditText j;
    public AppCompatTextView k;
    public du3 l;
    public du3 m;
    public AppCompatTextView n;

    public xa2() {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new i60(arrayList);
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        LinearLayout.LayoutParams layoutParams6;
        String str;
        FrameLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8;
        LinearLayout.LayoutParams layoutParams9;
        LinearLayout.LayoutParams layoutParams10;
        FrameLayout.LayoutParams layoutParams11;
        FrameLayout.LayoutParams layoutParams12;
        LinearLayout.LayoutParams layoutParams13;
        int i;
        LinearLayout.LayoutParams layoutParams14;
        int i2;
        LinearLayout.LayoutParams layoutParams15;
        int i3;
        LinearLayout.LayoutParams layoutParams16;
        int i4;
        ei2 ei2Var = new ei2();
        qe3 qe3Var = new qe3(layoutInflater.getContext());
        int i5 = 0;
        qe3Var.setOrientation(0);
        qe3Var.setId(-1);
        qe3Var.setAttachToParent(false);
        cf3 cf3Var = new cf3(qe3Var.getContext());
        cf3Var.setId(R.id.protocolTabGroup);
        cf3Var.setPadding(tf3.K(40), tf3.K(40), 0, cf3Var.getPaddingBottom());
        cf3Var.setOnChildFocusChange(new a60(2, ei2Var, this));
        cf3Var.setOnBackPressed(new ua2(this, i5));
        AppCompatTextView appCompatTextView = new AppCompatTextView(cf3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText(R.string.Protocol);
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(21.0f);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextColor(-1);
        int K = tf3.K(28);
        int K2 = tf3.K(60);
        ViewGroup.LayoutParams layoutParams17 = appCompatTextView.getLayoutParams();
        if (layoutParams17 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams17;
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
        layoutParams.leftMargin = Math.max(K, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(0, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(K2, layoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams);
        cf3Var.addView(appCompatTextView);
        bf3 bf3Var = new bf3(cf3Var.getContext(), null);
        bf3Var.setId(R.id.protocolTabList);
        bf3Var.setText(R.string.EverestProtocol);
        int i6 = 1;
        bf3Var.setSelected(true);
        bf3Var.setNextFocusRightId(R.id.recyclerViewFocusItem);
        cf3Var.addView(bf3Var);
        bf3 bf3Var2 = new bf3(cf3Var.getContext(), null);
        bf3Var2.setId(-1);
        bf3Var2.setText(R.string.AdvancedConfig);
        bf3Var2.setSelected(false);
        cf3Var.addView(bf3Var2);
        int K3 = tf3.K(40);
        int K4 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams18 = bf3Var2.getLayoutParams();
        if (layoutParams18 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams18;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-1, K3);
        }
        layoutParams2.width = -1;
        layoutParams2.height = K3;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K4, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        bf3Var2.setLayoutParams(layoutParams2);
        qe3Var.addView(cf3Var);
        int K5 = tf3.K(250);
        ViewGroup.LayoutParams layoutParams19 = cf3Var.getLayoutParams();
        if (layoutParams19 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams19;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(K5, -1);
        }
        layoutParams3.width = K5;
        layoutParams3.height = -1;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        cf3Var.setLayoutParams(layoutParams3);
        this.g = cf3Var;
        eu3 eu3Var = new eu3(qe3Var.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText(R.string.TvProtocolTopTips);
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setTextColor(zf3.v(R.color.textTertiary));
        eu3Var.addView(appCompatTextView2);
        int K6 = tf3.K(467);
        int K7 = tf3.K(45);
        int K8 = tf3.K(17);
        ViewGroup.LayoutParams layoutParams20 = appCompatTextView2.getLayoutParams();
        if (layoutParams20 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams20;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(K6, -2);
        }
        layoutParams4.width = K6;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K7, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(K8, layoutParams4.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams4);
        RecyclerView recyclerView = new RecyclerView(eu3Var.getContext(), null);
        recyclerView.setFocusable(false);
        recyclerView.setLayoutManager(new CenterScrollLayoutManager(requireContext()));
        recyclerView.i(new px1(i6));
        recyclerView.setAdapter(this.f);
        eu3Var.addView(recyclerView);
        ViewGroup.LayoutParams layoutParams21 = recyclerView.getLayoutParams();
        if (layoutParams21 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams21;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams5.width = -1;
        layoutParams5.height = -1;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(-1, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        recyclerView.setLayoutParams(layoutParams5);
        this.h = recyclerView;
        gu3 gu3Var = new gu3(eu3Var.getContext());
        m20.u0(gu3Var);
        qe3 qe3Var2 = new qe3(gu3Var.getContext());
        qe3Var2.setOrientation(1);
        qe3Var2.setId(-1);
        qe3Var2.setFocusable(false);
        qe3Var2.setFocusSearchListener(new y9(this, i6));
        eu3 eu3Var2 = new eu3(qe3Var2.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(-1);
        eu3Var2.setFocusable(false);
        eu3Var2.setBackgroundResource(R.drawable.tv_protocol_config_panel);
        eu3Var2.setPadding(tf3.K(25), tf3.K(20), tf3.K(25), 0);
        eu3Var2.setClipToPadding(false);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText(R.string.TvHTTPDomainSetting);
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setTextSize(19.0f);
        appCompatTextView3.setTextColor(-1);
        eu3Var2.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText(R.string.TvHTTPDomainSettingTips);
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setTextSize(12.0f);
        appCompatTextView4.setTextColor(zf3.v(R.color.textSecondary));
        eu3Var2.addView(appCompatTextView4);
        int K9 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams22 = appCompatTextView4.getLayoutParams();
        if (layoutParams22 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams22;
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
        layoutParams6.topMargin = Math.max(K9, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams6);
        du3 du3Var = new du3(eu3Var2.getContext(), null, 6, 0);
        du3Var.setId(-1);
        du3Var.setFocusable(true);
        du3Var.setBackgroundResource(R.drawable.tv_protocol_config_input_wrapper);
        eu3Var2.setGravity(16);
        du3Var.setOnKeyListener(new x3(this, 1));
        AppCompatEditText appCompatEditText = new AppCompatEditText(du3Var.getContext(), null);
        appCompatEditText.setId(-1);
        tf3.A0(appCompatEditText);
        appCompatEditText.setPadding(tf3.K(18), 0, 0, 0);
        appCompatEditText.setGravity(19);
        appCompatEditText.setBackgroundResource(R.drawable.tv_protocol_config_input_border);
        Drawable A = zf3.A(R.drawable.tv_ic_protocol_edit);
        A.setTintList(zf3.y(R.color.tv_protocol_config_input_icon));
        appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(A, (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatEditText.setCompoundDrawablePadding(tf3.K(15));
        Context z = zf3.z();
        if (z == null || (str = z.getString(R.string.ProtocalEnterDomainHint)) == null) {
            str = "";
        }
        appCompatEditText.setHint(str);
        appCompatEditText.setTextSize(14.0f);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(6);
        appCompatEditText.setTextColor(zf3.y(R.color.tv_common_input_text));
        appCompatEditText.setOnEditorActionListener(new er(this, 4));
        appCompatEditText.setOnKeyListener(new x3(this, 1));
        du3Var.addView(appCompatEditText);
        int K10 = tf3.K(46);
        ViewGroup.LayoutParams layoutParams23 = appCompatEditText.getLayoutParams();
        if (layoutParams23 instanceof FrameLayout.LayoutParams) {
            layoutParams7 = (FrameLayout.LayoutParams) layoutParams23;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new FrameLayout.LayoutParams(-1, K10);
        }
        layoutParams7.width = -1;
        layoutParams7.height = K10;
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.setMarginStart(Math.max(-1, layoutParams7.leftMargin));
        layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
        layoutParams7.setMarginEnd(Math.max(-1, layoutParams7.rightMargin));
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        appCompatEditText.setLayoutParams(layoutParams7);
        this.j = appCompatEditText;
        m20.G0(du3Var, new va2(this, i5));
        if (du3Var.getAttachToParent()) {
            eu3Var2.addView(du3Var);
        }
        int K11 = tf3.K(18);
        ViewGroup.LayoutParams layoutParams24 = du3Var.getLayoutParams();
        if (layoutParams24 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams24;
        } else {
            layoutParams8 = null;
        }
        if (layoutParams8 == null) {
            layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams8.width = -1;
        layoutParams8.height = -2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(K11, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        du3Var.setLayoutParams(layoutParams8);
        this.m = du3Var;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setTextSize(11.0f);
        m20.w0(appCompatTextView5);
        eu3Var2.addView(appCompatTextView5);
        int K12 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams25 = appCompatTextView5.getLayoutParams();
        if (layoutParams25 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams25;
        } else {
            layoutParams9 = null;
        }
        if (layoutParams9 == null) {
            layoutParams9 = new LinearLayout.LayoutParams(-2, K12);
        }
        layoutParams9.width = -2;
        layoutParams9.height = K12;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(-1, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams9);
        this.n = appCompatTextView5;
        if (eu3Var2.getAttachToParent()) {
            qe3Var2.addView(eu3Var2);
        }
        eu3 eu3Var3 = new eu3(qe3Var2.getContext(), null, 6, 0);
        eu3Var3.setOrientation(1);
        eu3Var3.setId(-1);
        eu3Var3.setFocusable(false);
        eu3Var3.setBackgroundResource(R.drawable.tv_protocol_config_panel);
        eu3Var3.setPadding(tf3.K(25), tf3.K(20), tf3.K(25), tf3.K(20));
        eu3Var3.setClipToPadding(false);
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(eu3Var3.getContext(), null);
        appCompatTextView6.setId(-1);
        appCompatTextView6.setText(R.string.TvTLSAdvancedSetting);
        tf3.A0(appCompatTextView6);
        appCompatTextView6.setTextSize(19.0f);
        appCompatTextView6.setTextColor(-1);
        eu3Var3.addView(appCompatTextView6);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(eu3Var3.getContext(), null);
        appCompatTextView7.setId(-1);
        appCompatTextView7.setText(R.string.TvTLSAdvancedSettingTips);
        tf3.A0(appCompatTextView7);
        appCompatTextView7.setTextSize(12.0f);
        appCompatTextView7.setTextColor(zf3.v(R.color.textSecondary));
        eu3Var3.addView(appCompatTextView7);
        int K13 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams26 = appCompatTextView7.getLayoutParams();
        if (layoutParams26 instanceof LinearLayout.LayoutParams) {
            layoutParams10 = (LinearLayout.LayoutParams) layoutParams26;
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
        layoutParams10.topMargin = Math.max(K13, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(-1, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        appCompatTextView7.setLayoutParams(layoutParams10);
        du3 du3Var2 = new du3(eu3Var3.getContext(), null, 6, 0);
        du3Var2.setId(-1);
        du3Var2.setFocusable(true);
        du3Var2.setBackgroundResource(R.drawable.tv_protocol_config_input_wrapper);
        du3Var2.setOnKeyListener(new x3(this, 1));
        AppCompatImageView appCompatImageView = new AppCompatImageView(du3Var2.getContext(), null);
        appCompatImageView.setId(-1);
        pe0.Q(appCompatImageView, zf3.y(R.color.tv_protocol_config_input_icon));
        appCompatImageView.setImageResource(R.drawable.tv_ic_protocol_edit);
        du3Var2.addView(appCompatImageView);
        int K14 = tf3.K(18);
        int K15 = tf3.K(15);
        ViewGroup.LayoutParams layoutParams27 = appCompatImageView.getLayoutParams();
        if (layoutParams27 instanceof FrameLayout.LayoutParams) {
            layoutParams11 = (FrameLayout.LayoutParams) layoutParams27;
        } else {
            layoutParams11 = null;
        }
        if (layoutParams11 == null) {
            layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams11.width = -2;
        layoutParams11.height = -2;
        layoutParams11.gravity = Math.max(16, layoutParams11.gravity);
        layoutParams11.setMarginStart(Math.max(K14, layoutParams11.leftMargin));
        layoutParams11.topMargin = Math.max(-1, layoutParams11.topMargin);
        layoutParams11.setMarginEnd(Math.max(K15, layoutParams11.rightMargin));
        layoutParams11.bottomMargin = Math.max(-1, layoutParams11.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams11);
        AppCompatTextView appCompatTextView8 = new AppCompatTextView(du3Var2.getContext(), null);
        appCompatTextView8.setId(-1);
        appCompatTextView8.setText("");
        tf3.A0(appCompatTextView8);
        appCompatTextView8.setDuplicateParentStateEnabled(true);
        appCompatTextView8.setGravity(16);
        appCompatTextView8.setTextColor(-10066330);
        appCompatTextView8.setPadding(tf3.K(50), 0, 0, 0);
        du3Var2.addView(appCompatTextView8);
        int K16 = tf3.K(46);
        ViewGroup.LayoutParams layoutParams28 = appCompatTextView8.getLayoutParams();
        if (layoutParams28 instanceof FrameLayout.LayoutParams) {
            layoutParams12 = (FrameLayout.LayoutParams) layoutParams28;
        } else {
            layoutParams12 = null;
        }
        if (layoutParams12 == null) {
            layoutParams12 = new FrameLayout.LayoutParams(-1, K16);
        }
        layoutParams12.width = -1;
        layoutParams12.height = K16;
        layoutParams12.gravity = Math.max(16, layoutParams12.gravity);
        layoutParams12.setMarginStart(Math.max(-1, layoutParams12.leftMargin));
        layoutParams12.topMargin = Math.max(-1, layoutParams12.topMargin);
        layoutParams12.setMarginEnd(Math.max(-1, layoutParams12.rightMargin));
        layoutParams12.bottomMargin = Math.max(-1, layoutParams12.bottomMargin);
        appCompatTextView8.setLayoutParams(layoutParams12);
        this.k = appCompatTextView8;
        m20.G0(du3Var2, new va2(this, 2));
        if (du3Var2.getAttachToParent()) {
            eu3Var3.addView(du3Var2);
        }
        int K17 = tf3.K(18);
        ViewGroup.LayoutParams layoutParams29 = du3Var2.getLayoutParams();
        if (layoutParams29 instanceof LinearLayout.LayoutParams) {
            layoutParams13 = (LinearLayout.LayoutParams) layoutParams29;
        } else {
            layoutParams13 = null;
        }
        if (layoutParams13 == null) {
            i = -2;
            layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        } else {
            i = -2;
        }
        layoutParams13.width = -1;
        layoutParams13.height = i;
        layoutParams13.weight = Math.max(-1.0f, layoutParams13.weight);
        layoutParams13.gravity = Math.max(-1, layoutParams13.gravity);
        layoutParams13.leftMargin = Math.max(-1, layoutParams13.leftMargin);
        layoutParams13.topMargin = Math.max(K17, layoutParams13.topMargin);
        layoutParams13.rightMargin = Math.max(-1, layoutParams13.rightMargin);
        layoutParams13.bottomMargin = Math.max(-1, layoutParams13.bottomMargin);
        du3Var2.setLayoutParams(layoutParams13);
        this.l = du3Var2;
        if (eu3Var3.getAttachToParent()) {
            qe3Var2.addView(eu3Var3);
        }
        int K18 = tf3.K(15);
        ViewGroup.LayoutParams layoutParams30 = eu3Var3.getLayoutParams();
        if (layoutParams30 instanceof LinearLayout.LayoutParams) {
            layoutParams14 = (LinearLayout.LayoutParams) layoutParams30;
        } else {
            layoutParams14 = null;
        }
        if (layoutParams14 == null) {
            i2 = -2;
            layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
        } else {
            i2 = -2;
        }
        layoutParams14.width = -1;
        layoutParams14.height = i2;
        layoutParams14.weight = Math.max(-1.0f, layoutParams14.weight);
        layoutParams14.gravity = Math.max(-1, layoutParams14.gravity);
        layoutParams14.leftMargin = Math.max(-1, layoutParams14.leftMargin);
        layoutParams14.topMargin = Math.max(K18, layoutParams14.topMargin);
        layoutParams14.rightMargin = Math.max(-1, layoutParams14.rightMargin);
        layoutParams14.bottomMargin = Math.max(-1, layoutParams14.bottomMargin);
        eu3Var3.setLayoutParams(layoutParams14);
        if (qe3Var2.getAttachToParent()) {
            gu3Var.addView(qe3Var2);
        }
        if (gu3Var.getAttachToParent()) {
            eu3Var.addView(gu3Var);
        }
        int K19 = tf3.K(467);
        ViewGroup.LayoutParams layoutParams31 = gu3Var.getLayoutParams();
        if (layoutParams31 instanceof LinearLayout.LayoutParams) {
            layoutParams15 = (LinearLayout.LayoutParams) layoutParams31;
        } else {
            layoutParams15 = null;
        }
        if (layoutParams15 == null) {
            i3 = -2;
            layoutParams15 = new LinearLayout.LayoutParams(K19, -2);
        } else {
            i3 = -2;
        }
        layoutParams15.width = K19;
        layoutParams15.height = i3;
        layoutParams15.weight = Math.max(-1.0f, layoutParams15.weight);
        layoutParams15.gravity = Math.max(-1, layoutParams15.gravity);
        layoutParams15.leftMargin = Math.max(-1, layoutParams15.leftMargin);
        layoutParams15.topMargin = Math.max(-1, layoutParams15.topMargin);
        layoutParams15.rightMargin = Math.max(-1, layoutParams15.rightMargin);
        layoutParams15.bottomMargin = Math.max(-1, layoutParams15.bottomMargin);
        gu3Var.setLayoutParams(layoutParams15);
        this.i = gu3Var;
        if (eu3Var.getAttachToParent()) {
            qe3Var.addView(eu3Var);
        }
        int K20 = tf3.K(73);
        ViewGroup.LayoutParams layoutParams32 = eu3Var.getLayoutParams();
        if (layoutParams32 instanceof LinearLayout.LayoutParams) {
            layoutParams16 = (LinearLayout.LayoutParams) layoutParams32;
        } else {
            layoutParams16 = null;
        }
        if (layoutParams16 == null) {
            i4 = -2;
            layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i4 = -2;
        }
        layoutParams16.width = i4;
        layoutParams16.height = i4;
        layoutParams16.weight = Math.max(-1.0f, layoutParams16.weight);
        layoutParams16.gravity = Math.max(-1, layoutParams16.gravity);
        layoutParams16.leftMargin = Math.max(K20, layoutParams16.leftMargin);
        layoutParams16.topMargin = Math.max(-1, layoutParams16.topMargin);
        layoutParams16.rightMargin = Math.max(-1, layoutParams16.rightMargin);
        layoutParams16.bottomMargin = Math.max(-1, layoutParams16.bottomMargin);
        eu3Var.setLayoutParams(layoutParams16);
        return qe3Var;
    }

    @Override // defpackage.lo, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            AppCompatEditText appCompatEditText = this.j;
            if (appCompatEditText != null) {
                appCompatEditText.setText(ew3.a0());
            }
            AppCompatTextView appCompatTextView = this.n;
            if (appCompatTextView != null) {
                m20.w0(appCompatTextView);
            }
            String str = ew3.D().f445a;
            i60 i60Var = this.f;
            i60Var.h = str;
            i60Var.f();
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        int i = 3;
        zf3.T(this, null, new wa2(this, null), 3);
        AppCompatEditText appCompatEditText = this.j;
        if (appCompatEditText != null) {
            appCompatEditText.setText(ew3.a0());
        }
        AppCompatTextView appCompatTextView = this.k;
        if (appCompatTextView != null) {
            appCompatTextView.setText(ew3.H());
        }
        va2 va2Var = new va2(this, i);
        i60 i60Var = this.f;
        i60Var.e = va2Var;
        i60Var.f = new ua2(this, 1);
    }
}
