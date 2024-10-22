package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import b.ContentWrapper;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class rl0 extends rn {
    public static final /* synthetic */ int n = 0;
    public View d;
    public View e;
    public ViewGroup f;
    public ViewGroup g;
    public ViewGroup h;
    public View i;
    public View j;
    public Button k;
    public final String[] l = {"Unstable", "LowSpeed", "NotWork"};
    public final String[] m = {"Stable", "HighSpeed", "ItWorks"};

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        pc0 pc0Var = new pc0(requireContext());
        pc0Var.h = true;
        pc0Var.g = true;
        return pc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentWrapper contentWrapper = new ContentWrapper(layoutInflater.getContext(), null, 6);
        contentWrapper.setId(-1);
        fl.g(this, contentWrapper, 1000004);
        int i = 1;
        layoutInflater.inflate(R.layout.dialog_disconnected, (ViewGroup) contentWrapper, true);
        this.d = contentWrapper.findViewById(R.id.groupCommitted);
        this.e = contentWrapper.findViewById(R.id.groupEvaluation);
        this.f = (ViewGroup) contentWrapper.findViewById(R.id.groupDissatisfied);
        this.g = (ViewGroup) contentWrapper.findViewById(R.id.groupSatisfied);
        this.h = (ViewGroup) contentWrapper.findViewById(R.id.groupSupport);
        this.i = contentWrapper.findViewById(R.id.optionDissatisfied);
        this.j = contentWrapper.findViewById(R.id.optionSatisfied);
        TextView textView = (TextView) contentWrapper.findViewById(R.id.tvDisconnectTitle);
        fl.n(this, textView, 1000013);
        contentWrapper.a(new fv2(textView, 18));
        ImageView imageView = (ImageView) contentWrapper.findViewById(R.id.btnClose);
        contentWrapper.a(new fv2(imageView, 19));
        if (v73.l()) {
            imageView.setImageResource(R.drawable.icon_nav_cancel_light);
        }
        TextView textView2 = (TextView) contentWrapper.findViewById(R.id.tvGoLiveChat);
        textView2.getPaint().setUnderlineText(true);
        textView2.setSelected(true);
        textView2.setOnClickListener(new cr1(contentWrapper, 28));
        contentWrapper.findViewById(R.id.btnClose).setOnClickListener(new ql0(this, 0));
        TextView textView3 = (TextView) contentWrapper.findViewById(R.id.btnBackHomePage);
        textView3.getPaint().setUnderlineText(true);
        textView3.setOnClickListener(new ql0(this, i));
        TextView textView4 = (TextView) contentWrapper.findViewById(R.id.btnReconnect);
        if (textView4 != null) {
            textView4.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
            fl.n(this, textView4, 1000117);
            textView4.setOnClickListener(new ql0(this, 2));
        }
        Button button = (Button) contentWrapper.findViewById(R.id.btnSubmit);
        this.k = button;
        fl.n(this, button, 1000013);
        fl.n(this, (TextView) contentWrapper.findViewById(R.id.tvDisconnectTips), 1000013);
        fl.n(this, (TextView) contentWrapper.findViewById(R.id.tvEvaluationTips), 1000013);
        fl.n(this, (TextView) contentWrapper.findViewById(R.id.tvNeedSupport), 1000013);
        fl.n(this, (TextView) contentWrapper.findViewById(R.id.tv_flag_1), 1000013);
        fl.n(this, (TextView) contentWrapper.findViewById(R.id.tv_flag_2), 1000014);
        return contentWrapper;
    }

    @Override // defpackage.rn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        Button button = this.k;
        if (button != null) {
            float f = tf3.F;
            button.setBackground(v73.b(1000002, 20 * f, f * 1));
        }
    }

    @Override // defpackage.rn
    public final void s(View view, Bundle bundle) {
        View view2 = this.j;
        if (view2 != null) {
            view2.setOnClickListener(new ql0(this, 3));
        }
        View view3 = this.i;
        if (view3 != null) {
            view3.setOnClickListener(new ql0(this, 4));
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroup.getChildAt(i).setOnClickListener(new da(6));
            }
        }
        ViewGroup viewGroup2 = this.g;
        if (viewGroup2 != null) {
            int childCount2 = viewGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                viewGroup2.getChildAt(i2).setOnClickListener(new da(7));
            }
        }
        Button button = this.k;
        if (button != null) {
            button.setOnClickListener(new ql0(this, 5));
        }
        Button button2 = this.k;
        if (button2 != null) {
            float f = tf3.F;
            button2.setBackground(v73.b(1000004, 20 * f, 1 * f));
        }
    }
}
