package defpackage;

import a.bx;
import a.du;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class tz2 extends sn implements qt3 {
    public static final /* synthetic */ int m = 0;
    public v31 d;
    public AppCompatTextView e;
    public AppCompatTextView f;
    public qe3 g;
    public AppCompatTextView h;
    public AppCompatTextView i;
    public AppCompatTextView j;
    public boolean k;
    public v31 l;

    public tz2() {
        super(0);
    }

    public final void D() {
        m20.a1(requireActivity(), new fv2(this, 17));
    }

    public final void E(boolean z) {
        if (z && !ew3.X()) {
            bx3.d0(requireActivity());
            return;
        }
        if (ew3.C() == z) {
            return;
        }
        int i = 0;
        if (m20.B0()) {
            D();
            this.l = new sz2(this, z, i);
        } else if (!z) {
            ew3.h0(false);
            mz2.c = ew3.C();
        } else {
            ew3.g("tm5pxn6s9d");
            ew3.h0(z);
            z();
        }
    }

    public final void G(boolean z) {
        if (z && !ew3.X()) {
            bx3.d0(requireActivity());
            return;
        }
        int i = 1;
        if (z && !ew3.R()) {
            if (mz2.f3380b) {
                return;
            }
            m20.a1(requireActivity(), new jd3(i, this, z));
            return;
        }
        if (ew3.u() == z) {
            return;
        }
        if (m20.B0()) {
            D();
            this.l = new sz2(this, z, 2);
            return;
        }
        bx bxVar = new bx();
        bxVar.v(z);
        du.d(521, bxVar);
        bxVar.h();
        boolean u = ew3.u();
        mz2.f3380b = u;
        AppCompatTextView appCompatTextView = this.e;
        qe3 qe3Var = null;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setSelected(u);
        AppCompatTextView appCompatTextView2 = this.f;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        appCompatTextView2.setSelected(true ^ mz2.f3380b);
        qe3 qe3Var2 = this.g;
        if (qe3Var2 != null) {
            qe3Var = qe3Var2;
        }
        int childCount = qe3Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = qe3Var.getChildAt(i2);
            if (i2 > 4) {
                m20.g1(childAt, mz2.f3380b);
            }
        }
        if (mz2.f3380b) {
            z();
        }
    }

    public final void H(boolean z) {
        if (z && !ew3.X()) {
            bx3.d0(requireActivity());
            return;
        }
        if (ew3.v() == z) {
            return;
        }
        if (m20.B0()) {
            D();
            this.l = new sz2(this, z, 3);
        } else if (!z) {
            ew3.f0(false);
            mz2.d = ew3.v();
        } else {
            ew3.g("tm5pxn6s9d");
            ew3.f0(z);
            z();
        }
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        z();
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
        LinearLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8;
        LinearLayout.LayoutParams layoutParams9;
        LinearLayout.LayoutParams layoutParams10;
        int i;
        LinearLayout.LayoutParams layoutParams11;
        qe3 qe3Var = new qe3(layoutInflater.getContext());
        final int i2 = 1;
        qe3Var.setOrientation(1);
        qe3Var.setId(-1);
        this.g = qe3Var;
        final int i3 = 0;
        qe3Var.setAttachToParent(false);
        ViewGroup.LayoutParams layoutParams12 = qe3Var.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams12;
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
        qe3Var.setLayoutParams(layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(qe3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(20.0f);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(pd0.y(R.string.SplitTunneling));
        int K = tf3.K(40);
        ViewGroup.LayoutParams layoutParams13 = appCompatTextView.getLayoutParams();
        if (layoutParams13 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams13;
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
        appCompatTextView.setLayoutParams(layoutParams2);
        qe3Var.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(qe3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(15.0f);
        appCompatTextView2.setTextColor(-2763307);
        appCompatTextView2.setText(pd0.y(R.string.TvSplitTunnelingDesc));
        int K2 = tf3.K(14);
        ViewGroup.LayoutParams layoutParams14 = appCompatTextView2.getLayoutParams();
        if (layoutParams14 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams14;
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
        appCompatTextView2.setLayoutParams(layoutParams3);
        qe3Var.addView(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(qe3Var.getContext(), null);
        int g = p71.g(appCompatTextView3, -1, "", appCompatTextView3, 22);
        ViewGroup.LayoutParams layoutParams15 = appCompatTextView3.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams15;
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
        layoutParams4.topMargin = Math.max(g, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams4);
        appCompatTextView3.setText(pd0.y(R.string.Status));
        appCompatTextView3.setTextSize(16.0f);
        appCompatTextView3.setTextColor(-2763307);
        qe3Var.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(qe3Var.getContext(), null);
        int g2 = p71.g(appCompatTextView4, -1, "", appCompatTextView4, 45);
        int K3 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams16 = appCompatTextView4.getLayoutParams();
        if (layoutParams16 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams16;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-1, g2);
        }
        layoutParams5.width = -1;
        layoutParams5.height = g2;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(K3, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams5);
        appCompatTextView4.setText(pd0.y(R.string.DarkModeOff));
        xm3.e(appCompatTextView4);
        appCompatTextView4.setSelected(!mz2.f3380b);
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: nz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tz2 f3571b;

            {
                this.f3571b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                tz2 tz2Var = this.f3571b;
                switch (i4) {
                    case 0:
                        int i5 = tz2.m;
                        tz2Var.G(false);
                        return;
                    case 1:
                        int i6 = tz2.m;
                        tz2Var.G(true);
                        return;
                    case 2:
                        int i7 = tz2.m;
                        tz2Var.E(true);
                        return;
                    case 3:
                        int i8 = tz2.m;
                        tz2Var.H(true);
                        return;
                    default:
                        int i9 = tz2.m;
                        if (m20.B0()) {
                            m20.a1(tz2Var.requireActivity(), md3.p);
                            return;
                        }
                        tz2Var.k = true;
                        v31 v31Var = tz2Var.d;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView4);
        this.f = appCompatTextView4;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(qe3Var.getContext(), null);
        int g3 = p71.g(appCompatTextView5, -1, "", appCompatTextView5, 45);
        int K4 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams17 = appCompatTextView5.getLayoutParams();
        if (layoutParams17 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams17;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(-1, g3);
        }
        layoutParams6.width = -1;
        layoutParams6.height = g3;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(K4, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams6);
        appCompatTextView5.setText(pd0.y(R.string.On));
        xm3.e(appCompatTextView5);
        appCompatTextView5.setSelected(mz2.f3380b);
        appCompatTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: nz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tz2 f3571b;

            {
                this.f3571b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                tz2 tz2Var = this.f3571b;
                switch (i4) {
                    case 0:
                        int i5 = tz2.m;
                        tz2Var.G(false);
                        return;
                    case 1:
                        int i6 = tz2.m;
                        tz2Var.G(true);
                        return;
                    case 2:
                        int i7 = tz2.m;
                        tz2Var.E(true);
                        return;
                    case 3:
                        int i8 = tz2.m;
                        tz2Var.H(true);
                        return;
                    default:
                        int i9 = tz2.m;
                        if (m20.B0()) {
                            m20.a1(tz2Var.requireActivity(), md3.p);
                            return;
                        }
                        tz2Var.k = true;
                        v31 v31Var = tz2Var.d;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView5);
        this.e = appCompatTextView5;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(qe3Var.getContext(), null);
        int g4 = p71.g(appCompatTextView6, -1, "", appCompatTextView6, 27);
        ViewGroup.LayoutParams layoutParams18 = appCompatTextView6.getLayoutParams();
        if (layoutParams18 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams18;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams7.width = -1;
        layoutParams7.height = -2;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(g4, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        appCompatTextView6.setLayoutParams(layoutParams7);
        appCompatTextView6.setText(pd0.y(R.string.WorkingMode));
        appCompatTextView6.setTypeface(n01.a());
        appCompatTextView6.setTextSize(16.0f);
        appCompatTextView6.setTextColor(-2763307);
        qe3Var.addView(appCompatTextView6);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(qe3Var.getContext(), null);
        int g5 = p71.g(appCompatTextView7, -1, "", appCompatTextView7, 45);
        int K5 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams19 = appCompatTextView7.getLayoutParams();
        if (layoutParams19 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams19;
        } else {
            layoutParams8 = null;
        }
        if (layoutParams8 == null) {
            layoutParams8 = new LinearLayout.LayoutParams(-1, g5);
        }
        layoutParams8.width = -1;
        layoutParams8.height = g5;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(K5, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        appCompatTextView7.setLayoutParams(layoutParams8);
        appCompatTextView7.setText(pd0.y(R.string.SelectedAppsNotUseVPN));
        xm3.e(appCompatTextView7);
        appCompatTextView7.setSelected(mz2.c);
        final int i4 = 2;
        appCompatTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: nz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tz2 f3571b;

            {
                this.f3571b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                tz2 tz2Var = this.f3571b;
                switch (i42) {
                    case 0:
                        int i5 = tz2.m;
                        tz2Var.G(false);
                        return;
                    case 1:
                        int i6 = tz2.m;
                        tz2Var.G(true);
                        return;
                    case 2:
                        int i7 = tz2.m;
                        tz2Var.E(true);
                        return;
                    case 3:
                        int i8 = tz2.m;
                        tz2Var.H(true);
                        return;
                    default:
                        int i9 = tz2.m;
                        if (m20.B0()) {
                            m20.a1(tz2Var.requireActivity(), md3.p);
                            return;
                        }
                        tz2Var.k = true;
                        v31 v31Var = tz2Var.d;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView7);
        this.j = appCompatTextView7;
        AppCompatTextView appCompatTextView8 = new AppCompatTextView(qe3Var.getContext(), null);
        int g6 = p71.g(appCompatTextView8, -1, "", appCompatTextView8, 45);
        int K6 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams20 = appCompatTextView8.getLayoutParams();
        if (layoutParams20 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams20;
        } else {
            layoutParams9 = null;
        }
        if (layoutParams9 == null) {
            layoutParams9 = new LinearLayout.LayoutParams(-1, g6);
        }
        layoutParams9.width = -1;
        layoutParams9.height = g6;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(K6, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        appCompatTextView8.setLayoutParams(layoutParams9);
        appCompatTextView8.setText(pd0.y(R.string.SelectedAppsUseVPN));
        xm3.e(appCompatTextView8);
        appCompatTextView8.setSelected(mz2.d);
        final int i5 = 3;
        appCompatTextView8.setOnClickListener(new View.OnClickListener(this) { // from class: nz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tz2 f3571b;

            {
                this.f3571b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                tz2 tz2Var = this.f3571b;
                switch (i42) {
                    case 0:
                        int i52 = tz2.m;
                        tz2Var.G(false);
                        return;
                    case 1:
                        int i6 = tz2.m;
                        tz2Var.G(true);
                        return;
                    case 2:
                        int i7 = tz2.m;
                        tz2Var.E(true);
                        return;
                    case 3:
                        int i8 = tz2.m;
                        tz2Var.H(true);
                        return;
                    default:
                        int i9 = tz2.m;
                        if (m20.B0()) {
                            m20.a1(tz2Var.requireActivity(), md3.p);
                            return;
                        }
                        tz2Var.k = true;
                        v31 v31Var = tz2Var.d;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView8);
        this.h = appCompatTextView8;
        AppCompatTextView appCompatTextView9 = new AppCompatTextView(qe3Var.getContext(), null);
        int g7 = p71.g(appCompatTextView9, -1, "", appCompatTextView9, 32);
        ViewGroup.LayoutParams layoutParams21 = appCompatTextView9.getLayoutParams();
        if (layoutParams21 instanceof LinearLayout.LayoutParams) {
            layoutParams10 = (LinearLayout.LayoutParams) layoutParams21;
        } else {
            layoutParams10 = null;
        }
        if (layoutParams10 == null) {
            layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams10.width = -1;
        layoutParams10.height = -2;
        layoutParams10.weight = Math.max(-1.0f, layoutParams10.weight);
        layoutParams10.gravity = Math.max(-1, layoutParams10.gravity);
        layoutParams10.leftMargin = Math.max(-1, layoutParams10.leftMargin);
        layoutParams10.topMargin = Math.max(g7, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(-1, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        appCompatTextView9.setLayoutParams(layoutParams10);
        appCompatTextView9.setText(pd0.y(R.string.AppConfig));
        appCompatTextView9.setTypeface(n01.a());
        appCompatTextView9.setTextSize(16.0f);
        appCompatTextView9.setTextColor(-2763307);
        qe3Var.addView(appCompatTextView9);
        int size = mz2.f3379a.size();
        if (size > 1) {
            i = R.string.NAppsSelected;
        } else {
            i = R.string.NAppsSelectedSingular;
        }
        AppCompatTextView appCompatTextView10 = new AppCompatTextView(qe3Var.getContext(), null);
        int g8 = p71.g(appCompatTextView10, -1, "", appCompatTextView10, 45);
        int K7 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams22 = appCompatTextView10.getLayoutParams();
        if (layoutParams22 instanceof LinearLayout.LayoutParams) {
            layoutParams11 = (LinearLayout.LayoutParams) layoutParams22;
        } else {
            layoutParams11 = null;
        }
        if (layoutParams11 == null) {
            layoutParams11 = new LinearLayout.LayoutParams(-1, g8);
        }
        layoutParams11.width = -1;
        layoutParams11.height = g8;
        layoutParams11.weight = Math.max(-1.0f, layoutParams11.weight);
        layoutParams11.gravity = Math.max(-1, layoutParams11.gravity);
        layoutParams11.leftMargin = Math.max(-1, layoutParams11.leftMargin);
        layoutParams11.topMargin = Math.max(K7, layoutParams11.topMargin);
        layoutParams11.rightMargin = Math.max(-1, layoutParams11.rightMargin);
        layoutParams11.bottomMargin = Math.max(-1, layoutParams11.bottomMargin);
        appCompatTextView10.setLayoutParams(layoutParams11);
        appCompatTextView10.setText(pd0.z(i, Integer.valueOf(size)));
        xm3.c(appCompatTextView10);
        final int i6 = 4;
        appCompatTextView10.setOnClickListener(new View.OnClickListener(this) { // from class: nz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tz2 f3571b;

            {
                this.f3571b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i6;
                tz2 tz2Var = this.f3571b;
                switch (i42) {
                    case 0:
                        int i52 = tz2.m;
                        tz2Var.G(false);
                        return;
                    case 1:
                        int i62 = tz2.m;
                        tz2Var.G(true);
                        return;
                    case 2:
                        int i7 = tz2.m;
                        tz2Var.E(true);
                        return;
                    case 3:
                        int i8 = tz2.m;
                        tz2Var.H(true);
                        return;
                    default:
                        int i9 = tz2.m;
                        if (m20.B0()) {
                            m20.a1(tz2Var.requireActivity(), md3.p);
                            return;
                        }
                        tz2Var.k = true;
                        v31 v31Var = tz2Var.d;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView10);
        this.i = appCompatTextView10;
        Iterator it = ew3.O0(qe3Var).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i7 = i3 + 1;
            if (i3 >= 0) {
                View view = (View) next;
                if (!(view instanceof ViewGroup)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = tf3.K(30);
                    marginLayoutParams.rightMargin = tf3.K(30);
                    view.setLayoutParams(marginLayoutParams);
                }
                if (i3 > 4) {
                    m20.g1(view, mz2.f3380b);
                }
                i3 = i7;
            } else {
                tf3.y0();
                throw null;
            }
        }
        return qe3Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        rt3.e().l(this);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (getView() != null && !z) {
            if (this.k) {
                AppCompatTextView appCompatTextView = this.i;
                if (appCompatTextView == null) {
                    appCompatTextView = null;
                }
                appCompatTextView.requestFocus();
                this.k = false;
            }
            z();
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        zf3.T(this, null, new pz2(this, null), 3);
        rt3.e().c(this);
    }

    public final void z() {
        zf3.T(this, null, new rz2(this, null), 3);
    }
}
