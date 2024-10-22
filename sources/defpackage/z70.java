package defpackage;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.setting.ContactUsFragment$onCreateView$1$text$1$1;
import com.security.xvpn.z35kb.television.setting.ContactUsFragment$onCreateView$1$text$1$2;

/* loaded from: classes2.dex */
public final class z70 extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        qe3 qe3Var = new qe3(layoutInflater.getContext());
        qe3Var.setOrientation(1);
        qe3Var.setId(-1);
        qe3Var.setPadding(tf3.K(30), 0, tf3.K(30), 0);
        LinearLayout.LayoutParams layoutParams3 = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(qe3Var.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "", appCompatTextView, 135);
        ViewGroup.LayoutParams layoutParams4 = appCompatTextView.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams4;
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
        layoutParams.topMargin = Math.max(g, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(20.0f);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(pd0.y(R.string.ContactUs));
        qe3Var.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(qe3Var.getContext(), null);
        int g2 = p71.g(appCompatTextView2, -1, "", appCompatTextView2, 20);
        ViewGroup.LayoutParams layoutParams5 = appCompatTextView2.getLayoutParams();
        if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams5;
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
        layoutParams2.topMargin = Math.max(g2, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams2);
        appCompatTextView2.setTextSize(15.0f);
        appCompatTextView2.setTextColor(-2763307);
        appCompatTextView2.setText(pd0.y(R.string.TvContactUsDesc1));
        qe3Var.addView(appCompatTextView2);
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.TvContactUsDesc2));
        bx3.i(valueOf, "xvpn.io/help-center", new ContactUsFragment$onCreateView$1$text$1$1(zf3.v(R.color.tvBlue)));
        bx3.i(valueOf, "support@xvpn.io", new ContactUsFragment$onCreateView$1$text$1$2(zf3.v(R.color.tvBlue)));
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(qe3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setTextSize(14.0f);
        appCompatTextView3.setTextColor(-2763307);
        appCompatTextView3.setText(valueOf);
        int K = tf3.K(12);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView3.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams6;
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
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setLineSpacing(8 * tf3.G, 1.0f);
        qe3Var.addView(appCompatTextView3);
        return qe3Var;
    }
}
