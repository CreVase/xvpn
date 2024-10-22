package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.security.xvpn.z35kb.R;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hi1 extends Fragment {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public AppCompatTextView f2427a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f2428b;

    public final void m(boolean z) {
        if (z && !ew3.X()) {
            bx3.d0(requireActivity());
            return;
        }
        if (z == ew3.U()) {
            return;
        }
        int i = 0;
        if (m20.B0()) {
            m20.a1(requireActivity(), new gi1(this, i));
            return;
        }
        int i2 = 1;
        if (!z) {
            ew3.m(false);
            boolean U = ew3.U();
            AppCompatTextView appCompatTextView = this.f2427a;
            AppCompatTextView appCompatTextView2 = null;
            if (appCompatTextView == null) {
                appCompatTextView = null;
            }
            appCompatTextView.setSelected(U);
            AppCompatTextView appCompatTextView3 = this.f2428b;
            if (appCompatTextView3 != null) {
                appCompatTextView2 = appCompatTextView3;
            }
            appCompatTextView2.setSelected(!U);
            return;
        }
        m20.a1(requireActivity(), new gi1(this, i2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        qe3 qe3Var = new qe3(layoutInflater.getContext());
        final int i = 1;
        qe3Var.setOrientation(1);
        qe3Var.setId(-1);
        LinearLayout.LayoutParams layoutParams4 = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(qe3Var.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "", appCompatTextView, 135);
        ViewGroup.LayoutParams layoutParams5 = appCompatTextView.getLayoutParams();
        if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams5;
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
        appCompatTextView.setText(pd0.y(R.string.KillSwitch));
        qe3Var.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(qe3Var.getContext(), null);
        int g2 = p71.g(appCompatTextView2, -1, "", appCompatTextView2, 12);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView2.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams6;
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
        appCompatTextView2.setText(pd0.y(R.string.KillSwitchDetails));
        qe3Var.addView(appCompatTextView2);
        boolean U = ew3.U();
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(qe3Var.getContext(), null);
        int g3 = p71.g(appCompatTextView3, -1, "", appCompatTextView3, 45);
        int ceil = (int) Math.ceil(tf3.F * 27.5d);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView3.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-1, g3);
        }
        layoutParams3.width = -1;
        layoutParams3.height = g3;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(ceil, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setText(pd0.y(R.string.DarkModeOff));
        xm3.e(appCompatTextView3);
        appCompatTextView3.setSelected(!U);
        final int i2 = 0;
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: ei1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ hi1 f1937b;

            {
                this.f1937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                hi1 hi1Var = this.f1937b;
                switch (i3) {
                    case 0:
                        int i4 = hi1.c;
                        hi1Var.m(false);
                        return;
                    default:
                        int i5 = hi1.c;
                        hi1Var.m(true);
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView3);
        this.f2428b = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(qe3Var.getContext(), null);
        int g4 = p71.g(appCompatTextView4, -1, "", appCompatTextView4, 45);
        int K = tf3.K(10);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView4.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams8;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-1, g4);
        }
        layoutParams4.width = -1;
        layoutParams4.height = g4;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams4);
        appCompatTextView4.setText(pd0.y(R.string.On));
        xm3.e(appCompatTextView4);
        appCompatTextView4.setSelected(U);
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: ei1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ hi1 f1937b;

            {
                this.f1937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                hi1 hi1Var = this.f1937b;
                switch (i3) {
                    case 0:
                        int i4 = hi1.c;
                        hi1Var.m(false);
                        return;
                    default:
                        int i5 = hi1.c;
                        hi1Var.m(true);
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView4);
        this.f2427a = appCompatTextView4;
        Iterator it = ew3.O0(qe3Var).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = tf3.K(30);
            marginLayoutParams.rightMargin = tf3.K(30);
            view.setLayoutParams(marginLayoutParams);
        }
        return qe3Var;
    }
}
