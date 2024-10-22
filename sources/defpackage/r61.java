package defpackage;

import a.du;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.view.b;

/* loaded from: classes2.dex */
public final class r61 extends qn implements qt3 {
    public static long l;
    public final hl0 j;
    public final b k;

    public r61(Context context) {
        super(context, R.style.DialogBase_Fullscreen);
        rt3.e().c(this);
        setOwnerActivity((Activity) context);
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        int i = hl0.D;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        hl0 hl0Var = (hl0) tl3.i(layoutInflater, R.layout.dialog_guide_to_subscribe, viewGroup, null);
        this.j = hl0Var;
        b bVar = new b(ya0.S(context).getApplication());
        this.k = bVar;
        bVar.e = 2;
        il0 il0Var = (il0) hl0Var;
        final int i2 = 0;
        il0Var.n(0, bVar);
        il0Var.C = bVar;
        synchronized (il0Var) {
            il0Var.F |= 1;
        }
        il0Var.e(12);
        il0Var.m();
        hl0Var.z.setMovementMethod(LinkMovementMethod.getInstance());
        setContentView(hl0Var.e);
        hl0Var.o.setOnClickListener(new View.OnClickListener(this) { // from class: p61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r61 f3789b;

            {
                this.f3789b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                r61 r61Var = this.f3789b;
                switch (i3) {
                    case 0:
                        r61Var.dismiss();
                        return;
                    default:
                        r61Var.getOwnerActivity();
                        yc2.a();
                        GoogleIABHelper.g.l();
                        return;
                }
            }
        });
        fl.g(this, hl0Var.s, 1000004);
        fl.n(this, hl0Var.B, 1000013);
        fl.n(this, hl0Var.x, 1000014);
        fl.n(this, hl0Var.A, 1000014);
        fl.n(this, hl0Var.z, 1000015);
        fl.n(this, hl0Var.w, 1000013);
        fl.n(this, hl0Var.y, 1000014);
        fl.n(this, hl0Var.r, 1000117);
        hl0Var.r.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        String str = "$" + ew3.z().f;
        if (!TextUtils.isEmpty(str)) {
            bVar.g = str;
            bVar.i(20);
        }
        bVar.f = new ut0(this, 13);
        hl0Var.p.setBackground(v73.u(1000004));
        hl0Var.q.setBackground(v73.u(1000004));
        fl.j(hl0Var.q, this);
        fl.j(hl0Var.p, this);
        hl0Var.q.setOnClickListener(new q61(context, i2));
        final int i3 = 1;
        hl0Var.p.setOnClickListener(new View.OnClickListener(this) { // from class: p61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r61 f3789b;

            {
                this.f3789b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                r61 r61Var = this.f3789b;
                switch (i32) {
                    case 0:
                        r61Var.dismiss();
                        return;
                    default:
                        r61Var.getOwnerActivity();
                        yc2.a();
                        GoogleIABHelper.g.l();
                        return;
                }
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        rt3.e().l(this);
    }

    @Override // defpackage.ld, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        rt3.e().l(this);
    }

    @Override // defpackage.qn
    public final String f() {
        return "GuideToSubscribeDialog";
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        hl0 hl0Var = this.j;
        if (hl0Var != null) {
            if (z) {
                hl0Var.t.setVisibility(8);
                hl0Var.q.setVisibility(8);
            } else {
                hl0Var.t.setVisibility(0);
                hl0Var.q.setVisibility(0);
            }
        }
        if (z2) {
            rt3.e().l(this);
            try {
                dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public final void l(int i) {
        boolean z;
        b bVar = this.k;
        bVar.e = i;
        if (getWindow().getDecorView() != null) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            if (Build.VERSION.SDK_INT >= 23) {
                if (bVar.e == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    systemUiVisibility &= -8193;
                }
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
        }
        if (i != 2 || !XApplication.c || getOwnerActivity() == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        hl0 hl0Var = this.j;
        hl0Var.e.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = hl0Var.o;
        appCompatImageView.setBackgroundResource(R.drawable.bg_status_bar_icon_tv);
        ScrollView scrollView = hl0Var.v;
        scrollView.setVerticalFadingEdgeEnabled(false);
        scrollView.setFocusable(false);
        scrollView.setFocusableInTouchMode(false);
        Button button = hl0Var.r;
        button.setFocusable(true);
        appCompatImageView.setFocusable(true);
        button.requestFocus();
    }

    @Override // defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rt3.e().l(this);
    }

    @Override // android.app.Dialog
    public final void show() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - l < 500) {
            return;
        }
        try {
            super.show();
            l = elapsedRealtime;
            int i = this.k.e;
            if (i != 2) {
                if (i == 30) {
                    du.d(345, null);
                }
            } else {
                du.d(322, null);
            }
        } catch (Exception unused) {
        }
        rt3.e().m();
    }
}
