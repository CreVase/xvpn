package defpackage;

import a.du;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.view.GuidePurchaseHeaderView;

/* loaded from: classes2.dex */
public final class q50 extends qn implements qt3 {
    public final al0 j;
    public final r50 k;
    public zb2 l;

    public q50(Activity activity) {
        super(activity, R.style.DialogBase_Fullscreen);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = al0.x;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        al0 al0Var = (al0) tl3.i(layoutInflater, R.layout.dialog_connected_new, null, null);
        this.j = al0Var;
        r50 r50Var = new r50(activity.getApplication());
        this.k = r50Var;
        r50Var.g = this;
        bl0 bl0Var = (bl0) al0Var;
        bl0Var.n(0, r50Var);
        bl0Var.w = r50Var;
        synchronized (bl0Var) {
            bl0Var.B |= 1;
        }
        bl0Var.e(12);
        bl0Var.m();
        setOnDismissListener(new p50(this));
    }

    @Override // defpackage.qn
    public final String f() {
        return "ConnectedNewDialog";
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        if (z2 && this.k.e != 3) {
            dismiss();
        }
    }

    public final void l() {
        int i;
        al0 al0Var = this.j;
        fl.g(this, al0Var.e, 1000004);
        fl.n(this, al0Var.v, 1000014);
        fl.n(this, al0Var.u, 1000014);
        Drawable L0 = t9.L0(zf3.A(R.drawable.shadow_sign_up_success_panel));
        L0.setTint(v73.j(1000004));
        al0Var.t.setBackground(L0);
        GuidePurchaseHeaderView guidePurchaseHeaderView = al0Var.s;
        if (v73.l()) {
            i = R.drawable.img_connected_dialog_premium_dark;
        } else {
            i = R.drawable.img_connected_dialog_premium;
        }
        guidePurchaseHeaderView.setImageResource(i);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
        rt3.e().c(this);
    }

    @Override // defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        al0 al0Var = this.j;
        setContentView(al0Var.e);
        this.l = ew3.z();
        getWindow().setLayout(-1, -1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            i = 9984;
        } else {
            i = 1792;
        }
        if (i2 >= 26) {
            i |= 16;
        }
        getWindow().getDecorView().setSystemUiVisibility(i);
        getWindow().addFlags(Integer.MIN_VALUE);
        final int i3 = 0;
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        al0Var.o.setOnClickListener(new View.OnClickListener(this) { // from class: o50

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q50 f3601b;

            {
                this.f3601b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                q50 q50Var = this.f3601b;
                switch (i4) {
                    case 0:
                        q50Var.dismiss();
                        return;
                    case 1:
                        q50Var.getClass();
                        int i5 = lg2.g;
                        v73.r(q50Var.getContext());
                        ew3.Z("fcs", "evaluation");
                        return;
                    default:
                        m20.X0((l) q50Var.getOwnerActivity());
                        return;
                }
            }
        });
        final int i4 = 1;
        al0Var.q.setOnClickListener(new View.OnClickListener(this) { // from class: o50

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q50 f3601b;

            {
                this.f3601b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                q50 q50Var = this.f3601b;
                switch (i42) {
                    case 0:
                        q50Var.dismiss();
                        return;
                    case 1:
                        q50Var.getClass();
                        int i5 = lg2.g;
                        v73.r(q50Var.getContext());
                        ew3.Z("fcs", "evaluation");
                        return;
                    default:
                        m20.X0((l) q50Var.getOwnerActivity());
                        return;
                }
            }
        });
        final int i5 = 2;
        al0Var.p.setOnClickListener(new View.OnClickListener(this) { // from class: o50

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q50 f3601b;

            {
                this.f3601b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                q50 q50Var = this.f3601b;
                switch (i42) {
                    case 0:
                        q50Var.dismiss();
                        return;
                    case 1:
                        q50Var.getClass();
                        int i52 = lg2.g;
                        v73.r(q50Var.getContext());
                        ew3.Z("fcs", "evaluation");
                        return;
                    default:
                        m20.X0((l) q50Var.getOwnerActivity());
                        return;
                }
            }
        });
        r50 r50Var = this.k;
        if (r50Var.e != 3) {
            du.d(320, null);
        }
        String str = this.l.f;
        r50Var.i(20);
        r50Var.getClass();
        l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        rt3.e().l(this);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.qn, defpackage.w73
    public final void p(boolean z) {
        int i;
        super.p(z);
        if (!z) {
            Drawable L0 = t9.L0(zf3.A(R.drawable.shadow_sign_up_success_panel));
            L0.setTint(v73.j(1000004));
            al0 al0Var = this.j;
            al0Var.t.setBackground(L0);
            GuidePurchaseHeaderView guidePurchaseHeaderView = al0Var.s;
            if (v73.l()) {
                i = R.drawable.img_connected_dialog_premium_dark;
            } else {
                i = R.drawable.img_connected_dialog_premium;
            }
            guidePurchaseHeaderView.setImageResource(i);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
    }
}
