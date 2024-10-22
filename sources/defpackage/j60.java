package defpackage;

import a.bx;
import a.du;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.connlog.ConnectionLogItem$showConnectConfirmDialog$dialogText$1$1;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class j60 extends cu3 implements pt3, f83 {
    public static final /* synthetic */ int G = 0;
    public final AppCompatButton A;
    public final AppCompatTextView B;
    public x31 C;
    public w50 D;
    public int E;
    public int F;
    public final a83 r;
    public final AppCompatTextView s;
    public final AppCompatTextView t;
    public final AppCompatTextView u;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final AppCompatTextView x;
    public final AppCompatImageView y;
    public final AppCompatTextView z;

    public j60(Context context, a83 a83Var) {
        super(context, null, 6);
        f70 f70Var;
        f70 f70Var2;
        f70 f70Var3;
        f70 f70Var4;
        f70 f70Var5;
        f70 f70Var6;
        f70 f70Var7;
        f70 f70Var8;
        f70 f70Var9;
        f70 f70Var10;
        f70 f70Var11;
        f70 f70Var12;
        f70 f70Var13;
        this.r = a83Var;
        int i = 8;
        setBackground(new zg2(1000028, 8 * tf3.F));
        fl.j(this, this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof f70) {
            f70Var = (f70) layoutParams;
        } else {
            f70Var = null;
        }
        f70Var = f70Var == null ? new f70(-2, -2) : f70Var;
        ((ViewGroup.MarginLayoutParams) f70Var).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var).width = -1;
        setLayoutParams(f70Var);
        setPadding(0, 0, 0, tf3.K(15));
        setClipToPadding(false);
        View guideline = new Guideline(getContext());
        guideline.setId(R.id.leftSpace);
        ViewGroup.LayoutParams layoutParams2 = guideline.getLayoutParams();
        if (layoutParams2 instanceof f70) {
            f70Var2 = (f70) layoutParams2;
        } else {
            f70Var2 = null;
        }
        f70Var2 = f70Var2 == null ? new f70(-2, -2) : f70Var2;
        ((ViewGroup.MarginLayoutParams) f70Var2).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
        f70Var2.V = 1;
        f70Var2.f2052a = tf3.K(10);
        guideline.setLayoutParams(f70Var2);
        addView(guideline);
        View guideline2 = new Guideline(getContext());
        guideline2.setId(R.id.rightSpace);
        ViewGroup.LayoutParams layoutParams3 = guideline2.getLayoutParams();
        if (layoutParams3 instanceof f70) {
            f70Var3 = (f70) layoutParams3;
        } else {
            f70Var3 = null;
        }
        f70Var3 = f70Var3 == null ? new f70(-2, -2) : f70Var3;
        ((ViewGroup.MarginLayoutParams) f70Var3).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var3).height = -2;
        f70Var3.V = 1;
        f70Var3.f2053b = tf3.K(10);
        guideline2.setLayoutParams(f70Var3);
        addView(guideline2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        WeakHashMap weakHashMap = ll3.f3151a;
        appCompatTextView.setId(vk3.a());
        appCompatTextView.setBackgroundResource(R.drawable.img_log_from_ping_test);
        appCompatTextView.setText(pd0.y(R.string.StaticIPFromSpeedTest));
        appCompatTextView.setTypeface((Typeface) n01.f3385b.getValue());
        appCompatTextView.setPadding(tf3.K(10), 0, tf3.K(24), 0);
        appCompatTextView.setTextSize(11.0f);
        appCompatTextView.setTextColor(-1);
        ViewGroup.LayoutParams layoutParams4 = appCompatTextView.getLayoutParams();
        if (layoutParams4 instanceof f70) {
            f70Var4 = (f70) layoutParams4;
        } else {
            f70Var4 = null;
        }
        f70Var4 = f70Var4 == null ? new f70(-2, -2) : f70Var4;
        ((ViewGroup.MarginLayoutParams) f70Var4).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var4).height = -2;
        f70Var4.t = 0;
        f70Var4.i = 0;
        ((ViewGroup.MarginLayoutParams) f70Var4).topMargin = tf3.K(10);
        appCompatTextView.setLayoutParams(f70Var4);
        addView(appCompatTextView);
        this.B = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setId(R.id.tvConnectionTime);
        appCompatTextView2.setTypeface(n01.c());
        fl.n(this, appCompatTextView2, 1000014);
        ViewGroup.LayoutParams layoutParams5 = appCompatTextView2.getLayoutParams();
        if (layoutParams5 instanceof f70) {
            f70Var5 = (f70) layoutParams5;
        } else {
            f70Var5 = null;
        }
        f70Var5 = f70Var5 == null ? new f70(-2, -2) : f70Var5;
        ((ViewGroup.MarginLayoutParams) f70Var5).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var5).height = -2;
        f70Var5.t = R.id.leftSpace;
        f70Var5.j = appCompatTextView.getId();
        ((ViewGroup.MarginLayoutParams) f70Var5).topMargin = tf3.K(8);
        f70Var5.x = tf3.K(5);
        appCompatTextView2.setLayoutParams(f70Var5);
        addView(appCompatTextView2);
        this.s = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setId(R.id.tvConnectionLocation);
        appCompatTextView3.setTypeface(n01.b());
        appCompatTextView3.setTextSize(11.0f);
        fl.n(this, appCompatTextView3, 1000014);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView3.getLayoutParams();
        if (layoutParams6 instanceof f70) {
            f70Var6 = (f70) layoutParams6;
        } else {
            f70Var6 = null;
        }
        f70Var6 = f70Var6 == null ? new f70(-2, -2) : f70Var6;
        ((ViewGroup.MarginLayoutParams) f70Var6).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var6).height = -2;
        f70Var6.j = R.id.tvConnectionTime;
        f70Var6.t = R.id.leftSpace;
        ((ViewGroup.MarginLayoutParams) f70Var6).topMargin = tf3.K(8);
        appCompatTextView3.setLayoutParams(f70Var6);
        addView(appCompatTextView3);
        this.t = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setId(R.id.tvConnectionIP);
        appCompatTextView4.setTypeface(n01.b());
        appCompatTextView4.setTextSize(11.0f);
        fl.n(this, appCompatTextView4, 1000014);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView4.getLayoutParams();
        if (layoutParams7 instanceof f70) {
            f70Var7 = (f70) layoutParams7;
        } else {
            f70Var7 = null;
        }
        f70Var7 = f70Var7 == null ? new f70(-2, -2) : f70Var7;
        ((ViewGroup.MarginLayoutParams) f70Var7).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var7).height = -2;
        f70Var7.j = R.id.tvConnectionLocation;
        f70Var7.t = R.id.leftSpace;
        ((ViewGroup.MarginLayoutParams) f70Var7).topMargin = tf3.K(8);
        appCompatTextView4.setLayoutParams(f70Var7);
        addView(appCompatTextView4);
        this.u = appCompatTextView4;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setTypeface(n01.b());
        appCompatTextView5.setTextSize(11.0f);
        fl.n(this, appCompatTextView5, 1000014);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView5.getLayoutParams();
        if (layoutParams8 instanceof f70) {
            f70Var8 = (f70) layoutParams8;
        } else {
            f70Var8 = null;
        }
        f70Var8 = f70Var8 == null ? new f70(-2, -2) : f70Var8;
        ((ViewGroup.MarginLayoutParams) f70Var8).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var8).height = -2;
        f70Var8.s = R.id.tvConnectionIP;
        f70Var8.m = R.id.tvConnectionIP;
        ((ViewGroup.MarginLayoutParams) f70Var8).leftMargin = tf3.K(20);
        appCompatTextView5.setLayoutParams(f70Var8);
        addView(appCompatTextView5);
        this.v = appCompatTextView5;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(getContext(), null);
        appCompatTextView6.setId(-1);
        appCompatTextView6.setText("");
        tf3.A0(appCompatTextView6);
        appCompatTextView6.setId(vk3.a());
        appCompatTextView6.setText(pd0.y(R.string.StaticIPStatus));
        appCompatTextView6.setTextSize(11.0f);
        fl.n(this, appCompatTextView6, 1000014);
        ViewGroup.LayoutParams layoutParams9 = appCompatTextView6.getLayoutParams();
        if (layoutParams9 instanceof f70) {
            f70Var9 = (f70) layoutParams9;
        } else {
            f70Var9 = null;
        }
        f70Var9 = f70Var9 == null ? new f70(-2, -2) : f70Var9;
        ((ViewGroup.MarginLayoutParams) f70Var9).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var9).height = -2;
        f70Var9.j = R.id.tvConnectionIP;
        f70Var9.t = R.id.leftSpace;
        ((ViewGroup.MarginLayoutParams) f70Var9).topMargin = tf3.K(12);
        appCompatTextView6.setLayoutParams(f70Var9);
        addView(appCompatTextView6);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(getContext(), null);
        appCompatTextView7.setId(-1);
        appCompatTextView7.setText("");
        tf3.A0(appCompatTextView7);
        appCompatTextView7.setId(R.id.tvConnectionStatus);
        appCompatTextView7.setTextSize(11.0f);
        appCompatTextView7.setTextColor(-52361);
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView7.getLayoutParams();
        if (layoutParams10 instanceof f70) {
            f70Var10 = (f70) layoutParams10;
        } else {
            f70Var10 = null;
        }
        f70Var10 = f70Var10 == null ? new f70(-2, -2) : f70Var10;
        ((ViewGroup.MarginLayoutParams) f70Var10).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var10).height = -2;
        f70Var10.setMarginStart(tf3.K(5));
        f70Var10.m = appCompatTextView6.getId();
        f70Var10.s = appCompatTextView6.getId();
        appCompatTextView7.setLayoutParams(f70Var10);
        addView(appCompatTextView7);
        this.w = appCompatTextView7;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setId(R.id.ivConnectionPingStatus);
        ViewGroup.LayoutParams layoutParams11 = appCompatImageView.getLayoutParams();
        if (layoutParams11 instanceof f70) {
            f70Var11 = (f70) layoutParams11;
        } else {
            f70Var11 = null;
        }
        f70Var11 = f70Var11 == null ? new f70(-2, -2) : f70Var11;
        ((ViewGroup.MarginLayoutParams) f70Var11).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var11).height = -2;
        f70Var11.setMarginStart(tf3.K(4));
        f70Var11.s = R.id.tvConnectionStatus;
        f70Var11.i = R.id.tvConnectionStatus;
        f70Var11.l = R.id.tvConnectionStatus;
        appCompatImageView.setLayoutParams(f70Var11);
        addView(appCompatImageView);
        this.y = appCompatImageView;
        AppCompatTextView appCompatTextView8 = new AppCompatTextView(getContext(), null);
        appCompatTextView8.setId(-1);
        appCompatTextView8.setText("");
        tf3.A0(appCompatTextView8);
        appCompatTextView8.setText(pd0.y(R.string.Delete));
        appCompatTextView8.setPaintFlags(9);
        appCompatTextView8.setTextColor(-3355444);
        appCompatTextView8.setTextSize(12.0f);
        int K = tf3.K(10);
        appCompatTextView8.setPadding(K, K, K, K);
        ViewGroup.LayoutParams layoutParams12 = appCompatTextView8.getLayoutParams();
        if (layoutParams12 instanceof f70) {
            f70Var12 = (f70) layoutParams12;
        } else {
            f70Var12 = null;
        }
        f70Var12 = f70Var12 == null ? new f70(-2, -2) : f70Var12;
        ((ViewGroup.MarginLayoutParams) f70Var12).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var12).height = -2;
        f70Var12.i = 0;
        f70Var12.v = 0;
        ((ViewGroup.MarginLayoutParams) f70Var12).topMargin = tf3.K(7);
        appCompatTextView8.setLayoutParams(f70Var12);
        appCompatTextView8.setOnClickListener(new cr1(this, 15));
        addView(appCompatTextView8);
        this.z = appCompatTextView8;
        AppCompatButton appCompatButton = new AppCompatButton(getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        appCompatButton.setText(pd0.y(R.string.Connect));
        appCompatButton.setTypeface(n01.c());
        appCompatButton.setTextSize(12.0f);
        appCompatButton.setPadding(0, 0, 0, 0);
        appCompatButton.setAllCaps(false);
        appCompatButton.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        fl.n(this, appCompatButton, 1000117);
        ViewGroup.LayoutParams layoutParams13 = appCompatButton.getLayoutParams();
        if (layoutParams13 instanceof f70) {
            f70Var13 = (f70) layoutParams13;
        } else {
            f70Var13 = null;
        }
        f70Var13 = f70Var13 == null ? new f70(-2, -2) : f70Var13;
        ((ViewGroup.MarginLayoutParams) f70Var13).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var13).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var13).height = tf3.K(24);
        f70Var13.N = tf3.K(80);
        f70Var13.i = R.id.tvConnectionStatus;
        f70Var13.l = R.id.tvConnectionStatus;
        f70Var13.v = R.id.rightSpace;
        appCompatButton.setLayoutParams(f70Var13);
        appCompatButton.setOnClickListener(new ww2(i, context, this));
        addView(appCompatButton);
        this.A = appCompatButton;
        AppCompatTextView appCompatTextView9 = new AppCompatTextView(getContext(), null);
        appCompatTextView9.setId(-1);
        appCompatTextView9.setText("");
        tf3.A0(appCompatTextView9);
        appCompatTextView9.setTextSize(11.0f);
        appCompatTextView9.setTextColor(-52361);
        ViewGroup.LayoutParams layoutParams14 = appCompatTextView9.getLayoutParams();
        f70 f70Var14 = layoutParams14 instanceof f70 ? (f70) layoutParams14 : null;
        f70Var14 = f70Var14 == null ? new f70(-2, -2) : f70Var14;
        ((ViewGroup.MarginLayoutParams) f70Var14).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var14).height = -2;
        f70Var14.i = R.id.tvConnectionStatus;
        f70Var14.l = R.id.tvConnectionStatus;
        f70Var14.v = R.id.rightSpace;
        appCompatTextView9.setLayoutParams(f70Var14);
        addView(appCompatTextView9);
        this.x = appCompatTextView9;
        this.E = 65286;
        this.F = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0040, code lost:            if (r1 != false) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:            if (defpackage.m20.L(r1, r4) == false) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j60.A(int, int):void");
    }

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    @Override // defpackage.f83
    public final void addThemeInvalidateListener(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.f83
    public final void bindInvalidate(View view) {
        fl.j(view, this);
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        this.E = i;
        A(this.F, i);
    }

    public final w50 getLog() {
        return this.D;
    }

    public final x31 getOnDeleteAction() {
        return this.C;
    }

    @Override // defpackage.f83
    public a83 getThemeListeners() {
        return this.r;
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.f83
    public final void j(TextView textView, int i) {
        fl.n(this, textView, i);
    }

    @Override // defpackage.f83
    public final void k(pn0 pn0Var) {
        fl.i(this, pn0Var, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        w50 w50Var = this.D;
        boolean z2 = false;
        if (w50Var != null && w50Var.j == 1) {
            z = true;
        } else {
            z = false;
        }
        AppCompatImageView appCompatImageView = this.y;
        if (z) {
            appCompatImageView.startAnimation((Animation) k60.f2895a.getValue());
        } else {
            if (w50Var != null && w50Var.j == 5) {
                z2 = true;
            }
            if (!z2) {
                appCompatImageView.clearAnimation();
            }
        }
        rt3.e().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rt3.e().j(this);
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        getThemeListeners().b(z);
    }

    @Override // defpackage.f83
    public final void q(ke1 ke1Var) {
        fl.k(this, ke1Var);
    }

    @Override // defpackage.f83
    public final void r(View view, boolean z) {
        fl.i(this, view, z);
    }

    public final void setLog(w50 w50Var) {
        this.D = w50Var;
        if (w50Var != null) {
            this.s.setText(pd0.z(R.string.ConnLogTime, w50Var.g));
            this.t.setText(pd0.y(R.string.ConnLogServerName).concat(pd0.A(w50Var.d)));
            AppCompatTextView appCompatTextView = this.u;
            StringBuilder n = p71.n(pd0.y(R.string.ConnLogIP));
            n.append(w50Var.f);
            appCompatTextView.setText(n.toString());
            AppCompatTextView appCompatTextView2 = this.v;
            StringBuilder n2 = p71.n(pd0.y(R.string.ConnLogProtocol));
            n2.append(w50Var.e);
            appCompatTextView2.setText(n2.toString());
            bx bxVar = new bx();
            du.d(208, bxVar);
            String u = bxVar.u();
            bxVar.h();
            boolean L = m20.L(u, w50Var.h);
            AppCompatTextView appCompatTextView3 = this.B;
            if (L) {
                tf3.v0(appCompatTextView3);
            } else {
                tf3.V(appCompatTextView3);
            }
            int i = rt3.e().f4214b;
            this.E = i;
            int i2 = w50Var.j;
            this.F = i2;
            A(i2, i);
        }
    }

    public final void setOnDeleteAction(x31 x31Var) {
        this.C = x31Var;
    }

    @Override // defpackage.f83
    public final void u(ke1 ke1Var) {
        fl.l(this, ke1Var, false);
    }

    @Override // defpackage.f83
    public final void x(View view) {
        fl.g(this, view, 1000008);
    }

    public final void y() {
        if (!ew3.X()) {
            m20.C0(getContext(), 29);
            return;
        }
        String str = null;
        du.d(303, null);
        w50 w50Var = this.D;
        if (w50Var != null) {
            str = w50Var.f4943b;
        }
        p71.x(str, 205);
        Activity activity = tf3.t;
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }

    public final void z(String str) {
        p pVar;
        SpannableString valueOf = SpannableString.valueOf(bx3.f(str, v73.y(), 0, 5));
        bx3.i(valueOf, getResources().getString(R.string.StaticIPNoticeBold), new ConnectionLogItem$showConnectConfirmDialog$dialogText$1$1(v73.y()));
        bx3.i(valueOf, getResources().getString(R.string.StaticIPNoticeHighlight), new ForegroundColorSpan(-14366603));
        ic G2 = zf3.G();
        if (G2 != null) {
            pVar = G2.getSupportFragmentManager();
        } else {
            pVar = null;
        }
        t9.w0(pVar, new q90(9, valueOf, this));
    }
}
