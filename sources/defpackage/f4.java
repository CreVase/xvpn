package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class f4 extends lo implements qt3 {
    public static final /* synthetic */ int q = 0;
    public AppCompatTextView e;
    public AppCompatTextView f;
    public AppCompatButton g;
    public AppCompatTextView h;
    public AppCompatTextView i;
    public bf3 j;
    public bf3 k;
    public bf3 l;
    public bf3 m;
    public cf3 n;
    public int o = -1;
    public boolean p;

    public static final void D(f4 f4Var) {
        nd3.P((HomeActivity) f4Var.requireActivity());
        zf3.T(f4Var, null, new b4(f4Var, null), 3);
    }

    public final void E(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        bf3 bf3Var = this.j;
        bf3 bf3Var2 = null;
        if (bf3Var == null) {
            bf3Var = null;
        }
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        bf3Var.setSelected(z);
        bf3 bf3Var3 = this.l;
        if (bf3Var3 == null) {
            bf3Var3 = null;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bf3Var3.setSelected(z2);
        bf3 bf3Var4 = this.m;
        if (bf3Var4 != null) {
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            bf3Var4.setSelected(z3);
        }
        bf3 bf3Var5 = this.k;
        if (bf3Var5 != null) {
            bf3Var2 = bf3Var5;
        }
        if (i == 3) {
            z4 = true;
        }
        bf3Var2.setSelected(z4);
        if (this.o == i) {
            return;
        }
        this.o = i;
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        boolean z3;
        ec2 ec2Var;
        int i;
        String str;
        String str2;
        boolean X = ew3.X();
        sb2 k = ew3.k();
        ec2[] L = ew3.L();
        if (L.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AppCompatButton appCompatButton = null;
        if (z3) {
            ec2Var = null;
        } else {
            ec2Var = L[0];
        }
        if (X) {
            i = R.string.PremiumAccount;
        } else {
            i = R.string.FreeAccount;
        }
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setText(pd0.y(i));
        AppCompatTextView appCompatTextView2 = this.f;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        appCompatTextView2.setText(k.f4307a);
        if (!X && (ec2Var == null || !m20.L(ec2Var.f1916b, "Premium for all platform"))) {
            AppCompatTextView appCompatTextView3 = this.h;
            if (appCompatTextView3 == null) {
                appCompatTextView3 = null;
            }
            tf3.V(appCompatTextView3);
            AppCompatTextView appCompatTextView4 = this.i;
            if (appCompatTextView4 == null) {
                appCompatTextView4 = null;
            }
            tf3.V(appCompatTextView4);
        } else {
            String str3 = k.f4308b;
            m20.L(str3, "End");
            m20.L(str3, "PauseEndsOn");
            if (!m20.L(str3, "HoldOn")) {
                m20.L(str3, "Broadband");
            }
            m20.L(str3, "Recovered");
            AppCompatTextView appCompatTextView5 = this.h;
            if (appCompatTextView5 == null) {
                appCompatTextView5 = null;
            }
            String str4 = "";
            if (ec2Var == null || (str = ec2Var.f1916b) == null) {
                str = "";
            }
            try {
                Matcher matcher = Pattern.compile(" \\(.+\\)").matcher(str);
                if (!matcher.find()) {
                    str2 = "";
                } else {
                    str2 = matcher.group();
                }
                str = pd0.A(matcher.replaceAll("")) + str2;
            } catch (Exception e) {
                e.printStackTrace();
            }
            appCompatTextView5.setText(str);
            AppCompatTextView appCompatTextView6 = this.i;
            if (appCompatTextView6 == null) {
                appCompatTextView6 = null;
            }
            if (ec2Var != null) {
                str4 = p71.m(pd0.A(ec2Var.c), ": ", ec2Var.f1915a);
            }
            appCompatTextView6.setText(str4);
            AppCompatTextView appCompatTextView7 = this.h;
            if (appCompatTextView7 == null) {
                appCompatTextView7 = null;
            }
            tf3.v0(appCompatTextView7);
            AppCompatTextView appCompatTextView8 = this.i;
            if (appCompatTextView8 == null) {
                appCompatTextView8 = null;
            }
            tf3.v0(appCompatTextView8);
        }
        AppCompatButton appCompatButton2 = this.g;
        if (appCompatButton2 != null) {
            appCompatButton = appCompatButton2;
        }
        m20.g1(appCompatButton, !X);
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
        int i;
        LinearLayout.LayoutParams layoutParams8;
        int i2;
        LinearLayout.LayoutParams layoutParams9;
        int i3;
        LinearLayout.LayoutParams layoutParams10;
        int i4;
        LinearLayout.LayoutParams layoutParams11;
        int i5;
        LinearLayout.LayoutParams layoutParams12;
        int i6;
        LinearLayout.LayoutParams layoutParams13;
        int i7;
        int i8;
        LinearLayout.LayoutParams layoutParams14 = null;
        final int i9 = 0;
        eu3 h = hx2.h(layoutInflater.getContext(), null, 6, 0, 0);
        h.setId(-1);
        cf3 cf3Var = new cf3(h.getContext());
        cf3Var.setId(-1);
        cf3Var.setId(R.id.tabBar);
        ViewGroup.LayoutParams layoutParams15 = cf3Var.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams15;
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
        layoutParams.width = tf3.K(250);
        cf3Var.setLayoutParams(layoutParams);
        cf3Var.setPadding(tf3.K(40), tf3.K(40), 0, cf3Var.getPaddingBottom());
        final int i10 = 2;
        cf3Var.setOnBackPressed(new y3(this, 2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(cf3Var.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "Account", appCompatTextView, 27);
        ViewGroup.LayoutParams layoutParams16 = appCompatTextView.getLayoutParams();
        if (layoutParams16 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams16;
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
        layoutParams2.leftMargin = Math.max(g, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setTextSize(21.0f);
        appCompatTextView.setTypeface(n01.a());
        cf3Var.addView(appCompatTextView);
        bf3 bf3Var = new bf3(cf3Var.getContext(), null);
        bf3Var.setId(-1);
        bf3Var.setText(R.string.AccountInformation);
        int K = tf3.K(40);
        int K2 = tf3.K(5);
        int K3 = tf3.K(60);
        ViewGroup.LayoutParams layoutParams17 = bf3Var.getLayoutParams();
        if (layoutParams17 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams17;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-1, K);
        }
        layoutParams3.width = -1;
        layoutParams3.height = K;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K3, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(K2, layoutParams3.bottomMargin);
        bf3Var.setLayoutParams(layoutParams3);
        tf3.k0(bf3Var, new c4(bf3Var, 0));
        bf3Var.setOnClickListener(new View.OnClickListener(this) { // from class: w3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f4931b;

            {
                this.f4931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i9;
                int i12 = 1;
                f4 f4Var = this.f4931b;
                switch (i11) {
                    case 0:
                        int i13 = f4.q;
                        f4Var.E(0);
                        return;
                    case 1:
                        int i14 = f4.q;
                        f4Var.E(1);
                        f4Var.requireActivity();
                        md3 md3Var = md3.k;
                        yc2.a();
                        md3Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i15 = f4.q;
                        int i16 = 2;
                        f4Var.E(2);
                        if (ew3.X()) {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i12));
                            return;
                        } else {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i16));
                            return;
                        }
                    case 3:
                        int i17 = f4.q;
                        f4Var.E(3);
                        m20.a1(f4Var.requireActivity(), new z3(f4Var, 3));
                        return;
                    default:
                        int i18 = f4.q;
                        Bundle bundle2 = new Bundle();
                        Context context = f4Var.getContext();
                        if (context != null) {
                            tf3.g0(context, PurchaseActivity.class, bundle2, 0);
                            return;
                        }
                        return;
                }
            }
        });
        cf3Var.addView(bf3Var);
        this.j = bf3Var;
        bf3 bf3Var2 = new bf3(cf3Var.getContext(), null);
        bf3Var2.setId(-1);
        bf3Var2.setText(R.string.RestorePurchase);
        int K4 = tf3.K(40);
        int K5 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams18 = bf3Var2.getLayoutParams();
        if (layoutParams18 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams18;
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
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(K5, layoutParams4.bottomMargin);
        bf3Var2.setLayoutParams(layoutParams4);
        final int i11 = 3;
        tf3.k0(bf3Var2, new y3(this, 3));
        final int i12 = 1;
        bf3Var2.setOnClickListener(new View.OnClickListener(this) { // from class: w3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f4931b;

            {
                this.f4931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                int i122 = 1;
                f4 f4Var = this.f4931b;
                switch (i112) {
                    case 0:
                        int i13 = f4.q;
                        f4Var.E(0);
                        return;
                    case 1:
                        int i14 = f4.q;
                        f4Var.E(1);
                        f4Var.requireActivity();
                        md3 md3Var = md3.k;
                        yc2.a();
                        md3Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i15 = f4.q;
                        int i16 = 2;
                        f4Var.E(2);
                        if (ew3.X()) {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i122));
                            return;
                        } else {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i16));
                            return;
                        }
                    case 3:
                        int i17 = f4.q;
                        f4Var.E(3);
                        m20.a1(f4Var.requireActivity(), new z3(f4Var, 3));
                        return;
                    default:
                        int i18 = f4.q;
                        Bundle bundle2 = new Bundle();
                        Context context = f4Var.getContext();
                        if (context != null) {
                            tf3.g0(context, PurchaseActivity.class, bundle2, 0);
                            return;
                        }
                        return;
                }
            }
        });
        cf3Var.addView(bf3Var2);
        this.l = bf3Var2;
        bf3 bf3Var3 = new bf3(cf3Var.getContext(), null);
        bf3Var3.setId(-1);
        bf3Var3.setText(R.string.DeleteAccount);
        int K6 = tf3.K(40);
        int K7 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams19 = bf3Var3.getLayoutParams();
        if (layoutParams19 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams19;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-1, K6);
        }
        layoutParams5.width = -1;
        layoutParams5.height = K6;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(-1, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(K7, layoutParams5.bottomMargin);
        bf3Var3.setLayoutParams(layoutParams5);
        tf3.k0(bf3Var3, new y3(this, 4));
        bf3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: w3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f4931b;

            {
                this.f4931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i10;
                int i122 = 1;
                f4 f4Var = this.f4931b;
                switch (i112) {
                    case 0:
                        int i13 = f4.q;
                        f4Var.E(0);
                        return;
                    case 1:
                        int i14 = f4.q;
                        f4Var.E(1);
                        f4Var.requireActivity();
                        md3 md3Var = md3.k;
                        yc2.a();
                        md3Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i15 = f4.q;
                        int i16 = 2;
                        f4Var.E(2);
                        if (ew3.X()) {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i122));
                            return;
                        } else {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i16));
                            return;
                        }
                    case 3:
                        int i17 = f4.q;
                        f4Var.E(3);
                        m20.a1(f4Var.requireActivity(), new z3(f4Var, 3));
                        return;
                    default:
                        int i18 = f4.q;
                        Bundle bundle2 = new Bundle();
                        Context context = f4Var.getContext();
                        if (context != null) {
                            tf3.g0(context, PurchaseActivity.class, bundle2, 0);
                            return;
                        }
                        return;
                }
            }
        });
        cf3Var.addView(bf3Var3);
        this.m = bf3Var3;
        bf3 bf3Var4 = new bf3(cf3Var.getContext(), null);
        bf3Var4.setId(-1);
        bf3Var4.setText(R.string.SignOut);
        int K8 = tf3.K(40);
        int K9 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams20 = bf3Var4.getLayoutParams();
        if (layoutParams20 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams20;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(-1, K8);
        }
        layoutParams6.width = -1;
        layoutParams6.height = K8;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(K9, layoutParams6.bottomMargin);
        bf3Var4.setLayoutParams(layoutParams6);
        tf3.k0(bf3Var4, new y3(this, 7));
        bf3Var4.setOnClickListener(new View.OnClickListener(this) { // from class: w3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f4931b;

            {
                this.f4931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                int i122 = 1;
                f4 f4Var = this.f4931b;
                switch (i112) {
                    case 0:
                        int i13 = f4.q;
                        f4Var.E(0);
                        return;
                    case 1:
                        int i14 = f4.q;
                        f4Var.E(1);
                        f4Var.requireActivity();
                        md3 md3Var = md3.k;
                        yc2.a();
                        md3Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i15 = f4.q;
                        int i16 = 2;
                        f4Var.E(2);
                        if (ew3.X()) {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i122));
                            return;
                        } else {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i16));
                            return;
                        }
                    case 3:
                        int i17 = f4.q;
                        f4Var.E(3);
                        m20.a1(f4Var.requireActivity(), new z3(f4Var, 3));
                        return;
                    default:
                        int i18 = f4.q;
                        Bundle bundle2 = new Bundle();
                        Context context = f4Var.getContext();
                        if (context != null) {
                            tf3.g0(context, PurchaseActivity.class, bundle2, 0);
                            return;
                        }
                        return;
                }
            }
        });
        cf3Var.addView(bf3Var4);
        this.k = bf3Var4;
        h.addView(cf3Var);
        this.n = cf3Var;
        eu3 eu3Var = new eu3(h.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        int K10 = tf3.H - tf3.K(350);
        ViewGroup.LayoutParams layoutParams21 = eu3Var.getLayoutParams();
        if (layoutParams21 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams21;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            i = -2;
            layoutParams7 = new LinearLayout.LayoutParams(K10, -2);
        } else {
            i = -2;
        }
        layoutParams7.width = K10;
        layoutParams7.height = i;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        eu3Var.setLayoutParams(layoutParams7);
        eu3 eu3Var2 = new eu3(eu3Var.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(-1);
        ViewGroup.LayoutParams layoutParams22 = eu3Var2.getLayoutParams();
        if (layoutParams22 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams22;
        } else {
            layoutParams8 = null;
        }
        if (layoutParams8 == null) {
            i2 = -2;
            layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i2 = -2;
        }
        layoutParams8.width = i2;
        layoutParams8.height = i2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        eu3Var2.setLayoutParams(layoutParams8);
        String y = pd0.y(R.string.Account);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var2.getContext(), null);
        int g2 = p71.g(appCompatTextView2, -1, y, appCompatTextView2, 135);
        ViewGroup.LayoutParams layoutParams23 = appCompatTextView2.getLayoutParams();
        if (layoutParams23 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams23;
        } else {
            layoutParams9 = null;
        }
        if (layoutParams9 == null) {
            i3 = -2;
            layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i3 = -2;
        }
        layoutParams9.width = i3;
        layoutParams9.height = i3;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(g2, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams9);
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setTextSize(20.0f);
        appCompatTextView2.setTypeface(n01.a());
        eu3Var2.addView(appCompatTextView2);
        this.e = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(eu3Var2.getContext(), null);
        int g3 = p71.g(appCompatTextView3, -1, "", appCompatTextView3, 12);
        ViewGroup.LayoutParams layoutParams24 = appCompatTextView3.getLayoutParams();
        if (layoutParams24 instanceof LinearLayout.LayoutParams) {
            layoutParams10 = (LinearLayout.LayoutParams) layoutParams24;
        } else {
            layoutParams10 = null;
        }
        if (layoutParams10 == null) {
            i4 = -2;
            layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i4 = -2;
        }
        layoutParams10.width = i4;
        layoutParams10.height = i4;
        layoutParams10.weight = Math.max(-1.0f, layoutParams10.weight);
        layoutParams10.gravity = Math.max(-1, layoutParams10.gravity);
        layoutParams10.leftMargin = Math.max(-1, layoutParams10.leftMargin);
        layoutParams10.topMargin = Math.max(g3, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(-1, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams10);
        appCompatTextView3.setTextColor(-6710887);
        appCompatTextView3.setTextSize(15.0f);
        eu3Var2.addView(appCompatTextView3);
        this.f = appCompatTextView3;
        String y2 = pd0.y(R.string.SubscriptionSStatus);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(eu3Var2.getContext(), null);
        int g4 = p71.g(appCompatTextView4, -1, y2, appCompatTextView4, 40);
        ViewGroup.LayoutParams layoutParams25 = appCompatTextView4.getLayoutParams();
        if (layoutParams25 instanceof LinearLayout.LayoutParams) {
            layoutParams11 = (LinearLayout.LayoutParams) layoutParams25;
        } else {
            layoutParams11 = null;
        }
        if (layoutParams11 == null) {
            i5 = -2;
            layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i5 = -2;
        }
        layoutParams11.width = i5;
        layoutParams11.height = i5;
        layoutParams11.weight = Math.max(-1.0f, layoutParams11.weight);
        layoutParams11.gravity = Math.max(-1, layoutParams11.gravity);
        layoutParams11.leftMargin = Math.max(-1, layoutParams11.leftMargin);
        layoutParams11.topMargin = Math.max(g4, layoutParams11.topMargin);
        layoutParams11.rightMargin = Math.max(-1, layoutParams11.rightMargin);
        layoutParams11.bottomMargin = Math.max(-1, layoutParams11.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams11);
        appCompatTextView4.setTextColor(-1);
        appCompatTextView4.setTextSize(20.0f);
        appCompatTextView4.setTypeface(n01.a());
        eu3Var2.addView(appCompatTextView4);
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(eu3Var2.getContext(), null);
        int g5 = p71.g(appCompatTextView5, -1, "", appCompatTextView5, 12);
        ViewGroup.LayoutParams layoutParams26 = appCompatTextView5.getLayoutParams();
        if (layoutParams26 instanceof LinearLayout.LayoutParams) {
            layoutParams12 = (LinearLayout.LayoutParams) layoutParams26;
        } else {
            layoutParams12 = null;
        }
        if (layoutParams12 == null) {
            i6 = -2;
            layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i6 = -2;
        }
        layoutParams12.width = i6;
        layoutParams12.height = i6;
        layoutParams12.weight = Math.max(-1.0f, layoutParams12.weight);
        layoutParams12.gravity = Math.max(-1, layoutParams12.gravity);
        layoutParams12.leftMargin = Math.max(-1, layoutParams12.leftMargin);
        layoutParams12.topMargin = Math.max(g5, layoutParams12.topMargin);
        layoutParams12.rightMargin = Math.max(-1, layoutParams12.rightMargin);
        layoutParams12.bottomMargin = Math.max(-1, layoutParams12.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams12);
        appCompatTextView5.setTextColor(-6710887);
        appCompatTextView5.setTextSize(15.0f);
        eu3Var2.addView(appCompatTextView5);
        this.h = appCompatTextView5;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(eu3Var2.getContext(), null);
        int g6 = p71.g(appCompatTextView6, -1, "", appCompatTextView6, 2);
        ViewGroup.LayoutParams layoutParams27 = appCompatTextView6.getLayoutParams();
        if (layoutParams27 instanceof LinearLayout.LayoutParams) {
            layoutParams13 = (LinearLayout.LayoutParams) layoutParams27;
        } else {
            layoutParams13 = null;
        }
        if (layoutParams13 == null) {
            i7 = -2;
            layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i7 = -2;
        }
        layoutParams13.width = i7;
        layoutParams13.height = i7;
        layoutParams13.weight = Math.max(-1.0f, layoutParams13.weight);
        layoutParams13.gravity = Math.max(-1, layoutParams13.gravity);
        layoutParams13.leftMargin = Math.max(-1, layoutParams13.leftMargin);
        layoutParams13.topMargin = Math.max(g6, layoutParams13.topMargin);
        layoutParams13.rightMargin = Math.max(-1, layoutParams13.rightMargin);
        layoutParams13.bottomMargin = Math.max(-1, layoutParams13.bottomMargin);
        appCompatTextView6.setLayoutParams(layoutParams13);
        appCompatTextView6.setTextColor(-6710887);
        appCompatTextView6.setTextSize(15.0f);
        eu3Var2.addView(appCompatTextView6);
        this.i = appCompatTextView6;
        AppCompatButton appCompatButton = new AppCompatButton(eu3Var2.getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        int K11 = tf3.K(40);
        int K12 = tf3.K(25);
        int K13 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams28 = appCompatButton.getLayoutParams();
        if (layoutParams28 instanceof LinearLayout.LayoutParams) {
            layoutParams14 = (LinearLayout.LayoutParams) layoutParams28;
        }
        if (layoutParams14 == null) {
            i8 = -2;
            layoutParams14 = new LinearLayout.LayoutParams(-2, K11);
        } else {
            i8 = -2;
        }
        layoutParams14.width = i8;
        layoutParams14.height = K11;
        layoutParams14.weight = Math.max(-1.0f, layoutParams14.weight);
        layoutParams14.gravity = Math.max(-1, layoutParams14.gravity);
        layoutParams14.leftMargin = Math.max(-1, layoutParams14.leftMargin);
        layoutParams14.topMargin = Math.max(K12, layoutParams14.topMargin);
        layoutParams14.rightMargin = Math.max(-1, layoutParams14.rightMargin);
        layoutParams14.bottomMargin = Math.max(K13, layoutParams14.bottomMargin);
        appCompatButton.setLayoutParams(layoutParams14);
        xm3.d(appCompatButton);
        appCompatButton.setPadding(tf3.K(48), 0, tf3.K(48), 0);
        appCompatButton.setText(pd0.y(R.string.GoPremium));
        final int i13 = 4;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: w3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f4 f4931b;

            {
                this.f4931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                int i122 = 1;
                f4 f4Var = this.f4931b;
                switch (i112) {
                    case 0:
                        int i132 = f4.q;
                        f4Var.E(0);
                        return;
                    case 1:
                        int i14 = f4.q;
                        f4Var.E(1);
                        f4Var.requireActivity();
                        md3 md3Var = md3.k;
                        yc2.a();
                        md3Var.invoke(GoogleIABHelper.g);
                        return;
                    case 2:
                        int i15 = f4.q;
                        int i16 = 2;
                        f4Var.E(2);
                        if (ew3.X()) {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i122));
                            return;
                        } else {
                            m20.a1(f4Var.requireActivity(), new z3(f4Var, i16));
                            return;
                        }
                    case 3:
                        int i17 = f4.q;
                        f4Var.E(3);
                        m20.a1(f4Var.requireActivity(), new z3(f4Var, 3));
                        return;
                    default:
                        int i18 = f4.q;
                        Bundle bundle2 = new Bundle();
                        Context context = f4Var.getContext();
                        if (context != null) {
                            tf3.g0(context, PurchaseActivity.class, bundle2, 0);
                            return;
                        }
                        return;
                }
            }
        });
        appCompatButton.setOnKeyListener(new x3(this, 0));
        eu3Var2.addView(appCompatButton);
        this.g = appCompatButton;
        Iterator it = ew3.O0(eu3Var2).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = tf3.K(20);
            marginLayoutParams.rightMargin = tf3.K(20);
            view.setLayoutParams(marginLayoutParams);
        }
        if (eu3Var2.getAttachToParent()) {
            eu3Var.addView(eu3Var2);
        }
        if (eu3Var.getAttachToParent()) {
            h.addView(eu3Var);
        }
        return h;
    }

    @Override // defpackage.lo, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.p && z) {
            E(0);
            cf3 cf3Var = this.n;
            if (cf3Var == null) {
                cf3Var = null;
            }
            View lastFocusChild = cf3Var.getLastFocusChild();
            if (lastFocusChild != null) {
                lastFocusChild.setSelected(false);
            }
            cf3 cf3Var2 = this.n;
            if (cf3Var2 == null) {
                cf3Var2 = null;
            }
            cf3Var2.setLastFocusChild(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        rt3.e().c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        rt3.e().l(this);
        super.onStop();
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        this.p = true;
        E(0);
    }
}
