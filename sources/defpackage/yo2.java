package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.util.CenterScrollLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class yo2 extends sn {
    public static final /* synthetic */ int g = 0;
    public v31 d;
    public du3 e;
    public ac f;

    public yo2() {
        super(0);
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        LinearLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        Context context = layoutInflater.getContext();
        LinearLayout.LayoutParams layoutParams5 = null;
        eu3 h = hx2.h(context, null, 6, 0, 1);
        h.setId(-1);
        ViewGroup.LayoutParams layoutParams6 = h.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        h.setLayoutParams(layoutParams);
        h.setAttachToParent(false);
        if (mz2.d) {
            i = R.string.AppsUseVPN;
        } else {
            i = R.string.AppsDoNotUseVPN;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(pd0.y(i));
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(20.0f);
        appCompatTextView.setTextColor(-1);
        int K = tf3.K(40);
        int K2 = tf3.K(30);
        int K3 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams7;
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
        layoutParams2.leftMargin = Math.max(K2, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(K3, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        h.addView(appCompatTextView);
        du3 du3Var = new du3(h.getContext(), null, 6, 0);
        du3Var.setId(-1);
        this.e = du3Var;
        du3Var.setFocusable(true);
        du3Var.setBackgroundResource(R.drawable.tv_common_item_background);
        du3Var.setStateListAnimator(tf3.z0());
        AppCompatImageView appCompatImageView = new AppCompatImageView(du3Var.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        appCompatImageView.setImageTintList(xm3.f5183a);
        ViewGroup.LayoutParams layoutParams8 = appCompatImageView.getLayoutParams();
        if (layoutParams8 instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) layoutParams8;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.setMarginStart(Math.max(-1, layoutParams3.leftMargin));
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.setMarginEnd(Math.max(-1, layoutParams3.rightMargin));
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setImageResource(R.drawable.tv_ic_add_app);
        du3Var.addView(appCompatImageView);
        du3Var.setOnKeyListener(new x3(this, 3));
        du3Var.setOnClickListener(new cr1(this, 26));
        du3Var.requestFocus();
        if (du3Var.getAttachToParent()) {
            h.addView(du3Var);
        }
        int K4 = tf3.K(45);
        int K5 = tf3.K(27);
        int K6 = tf3.K(30);
        int K7 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams9 = du3Var.getLayoutParams();
        if (layoutParams9 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams9;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-1, K4);
        }
        layoutParams4.width = -1;
        layoutParams4.height = K4;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(K6, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K5, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(K7, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        du3Var.setLayoutParams(layoutParams4);
        RecyclerView recyclerView = new RecyclerView(h.getContext(), null);
        recyclerView.setFocusable(false);
        recyclerView.setFocusableInTouchMode(false);
        int K8 = tf3.K(320);
        int K9 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams10 = recyclerView.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams10;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-1, K8);
        }
        layoutParams5.width = -1;
        layoutParams5.height = K8;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(K9, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        recyclerView.setLayoutParams(layoutParams5);
        recyclerView.setLayoutManager(new CenterScrollLayoutManager(recyclerView.getContext()));
        ac acVar = new ac(getParentFragmentManager());
        this.f = acVar;
        acVar.f = true;
        acVar.g = new q90(16, this, recyclerView);
        recyclerView.setAdapter(acVar);
        h.addView(recyclerView);
        if ((context instanceof Activity) && h.getAttachToParent()) {
            ((Activity) context).setContentView(h);
        }
        return h;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (getView() != null && !z) {
            du3 du3Var = this.e;
            if (du3Var == null) {
                du3Var = null;
            }
            du3Var.requestFocus();
            z();
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        z();
    }

    public final void z() {
        List R0;
        List<String> list = mz2.f3379a;
        ArrayList arrayList = new ArrayList(a20.C0(list, 10));
        for (String str : list) {
            d5 d5Var = gf.f2243a;
            arrayList.add(new ef(d5.x(requireContext(), str), d5.w(requireContext(), str), str, false, 0, 56));
        }
        if (arrayList.size() <= 1) {
            R0 = d20.Q0(arrayList);
        } else {
            R0 = d20.R0(arrayList);
            Collections.reverse(R0);
        }
        ac acVar = this.f;
        if (acVar != null) {
            acVar.e = R0;
        }
        if (acVar != null) {
            acVar.f();
        }
    }
}
