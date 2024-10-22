package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class yz extends rn {
    public static final /* synthetic */ int g = 0;
    public int d;
    public List e = cr0.f1659a;
    public x31 f = md3.n;

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        pc0 pc0Var = new pc0(requireContext());
        pc0Var.setCanceledOnTouchOutside(false);
        return pc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        Context context = layoutInflater.getContext();
        LinearLayout.LayoutParams layoutParams4 = null;
        boolean z = true;
        eu3 h = hx2.h(context, null, 6, 0, 1);
        h.setId(-1);
        h.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParams5 = h.getLayoutParams();
        if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams5;
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
        h.setBackgroundColor(-16316665);
        h.setGravity(1);
        h.setPadding(tf3.K(210), 0, tf3.K(210), 0);
        tf3.w0(h, 0, tf3.K(80), 5);
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(pd0.y(R.string.TvChooseBindSubscribeDesc));
        appCompatTextView.setTextSize(28.5f);
        appCompatTextView.setLineHeight(tf3.S(35));
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextColor(-1);
        h.addView(appCompatTextView);
        tf3.w0(h, 0, tf3.K(15), 5);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setText(pd0.y(R.string.TvChooseBindSubscribeDesc2));
        appCompatTextView2.setTextSize(18.0f);
        appCompatTextView2.setTextColor(-10066330);
        int K = tf3.K(320);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView2.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(K, -2);
        }
        layoutParams2.width = K;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams2);
        h.addView(appCompatTextView2);
        tf3.w0(h, 0, tf3.K(20), 5);
        RecyclerView recyclerView = new RecyclerView(h.getContext(), null);
        int K2 = tf3.K(320);
        ViewGroup.LayoutParams layoutParams7 = recyclerView.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(K2, -2);
        }
        layoutParams3.width = K2;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        recyclerView.setLayoutParams(layoutParams3);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new n40(this));
        h.addView(recyclerView);
        tf3.w0(h, 0, tf3.K(20), 5);
        AppCompatButton appCompatButton = new AppCompatButton(h.getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        appCompatButton.setText(pd0.y(R.string.RestorePurchase));
        int K3 = tf3.K(318);
        int K4 = tf3.K(40);
        ViewGroup.LayoutParams layoutParams8 = appCompatButton.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams8;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(K3, K4);
        }
        layoutParams4.width = K3;
        layoutParams4.height = K4;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatButton.setLayoutParams(layoutParams4);
        appCompatButton.setOnClickListener(new cr1(this, 24));
        xm3.d(appCompatButton);
        if (this.d == -1) {
            z = false;
        }
        appCompatButton.setEnabled(z);
        h.addView(appCompatButton);
        tf3.w0(h, 0, tf3.K(92), 5);
        if ((context instanceof Activity) && h.getAttachToParent()) {
            ((Activity) context).setContentView(h);
        }
        return h;
    }

    @Override // defpackage.rn
    public final void s(View view, Bundle bundle) {
    }
}
