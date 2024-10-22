package defpackage;

import a.du;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;

/* loaded from: classes2.dex */
public final class lg2 extends rn {
    public static final /* synthetic */ int g = 0;
    public Activity d;
    public String e;
    public final ui1 f = m20.D0(kj1.f2953a, new kg2(this, 0));

    @Override // androidx.fragment.app.f
    public final void dismiss() {
        l activity = getActivity();
        boolean z = false;
        if (activity != null && !activity.isFinishing()) {
            z = true;
        }
        if (z) {
            try {
                dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return t().f2965a;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) (307 * Resources.getSystem().getDisplayMetrics().density), (int) (229 * Resources.getSystem().getDisplayMetrics().density));
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // defpackage.rn
    public final void s(View view, Bundle bundle) {
        final int i = 0;
        if (XApplication.c) {
            t().c.requestFocus();
        } else {
            t().f2966b.setFocusable(false);
            t().f2966b.setFocusableInTouchMode(false);
            t().c.setFocusable(false);
            t().c.setFocusableInTouchMode(false);
            t().c.setBackground(null);
        }
        t().d.setText(pd0.y(R.string.RatingDialogContent));
        t().f2966b.setOnClickListener(new View.OnClickListener(this) { // from class: jg2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lg2 f2762b;

            {
                this.f2762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str = null;
                int i2 = i;
                lg2 lg2Var = this.f2762b;
                switch (i2) {
                    case 0:
                        int i3 = lg2.g;
                        lg2Var.dismiss();
                        return;
                    case 1:
                        int i4 = lg2.g;
                        lg2Var.dismiss();
                        Activity activity = lg2Var.d;
                        if (activity == null) {
                            activity = null;
                        }
                        if (v73.r(activity)) {
                            du.d(540, null);
                            String str2 = lg2Var.e;
                            if (str2 != null) {
                                str = str2;
                            }
                            p71.x(str, 640);
                            return;
                        }
                        return;
                    default:
                        int i5 = lg2.g;
                        lg2Var.dismiss();
                        Activity activity2 = lg2Var.d;
                        if (activity2 == null) {
                            activity2 = null;
                        }
                        if (v73.r(activity2)) {
                            du.d(540, null);
                            String str3 = lg2Var.e;
                            if (str3 != null) {
                                str = str3;
                            }
                            p71.x(str, 640);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        t().c.setOnClickListener(new View.OnClickListener(this) { // from class: jg2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lg2 f2762b;

            {
                this.f2762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str = null;
                int i22 = i2;
                lg2 lg2Var = this.f2762b;
                switch (i22) {
                    case 0:
                        int i3 = lg2.g;
                        lg2Var.dismiss();
                        return;
                    case 1:
                        int i4 = lg2.g;
                        lg2Var.dismiss();
                        Activity activity = lg2Var.d;
                        if (activity == null) {
                            activity = null;
                        }
                        if (v73.r(activity)) {
                            du.d(540, null);
                            String str2 = lg2Var.e;
                            if (str2 != null) {
                                str = str2;
                            }
                            p71.x(str, 640);
                            return;
                        }
                        return;
                    default:
                        int i5 = lg2.g;
                        lg2Var.dismiss();
                        Activity activity2 = lg2Var.d;
                        if (activity2 == null) {
                            activity2 = null;
                        }
                        if (v73.r(activity2)) {
                            du.d(540, null);
                            String str3 = lg2Var.e;
                            if (str3 != null) {
                                str = str3;
                            }
                            p71.x(str, 640);
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 2;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: jg2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lg2 f2762b;

            {
                this.f2762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str = null;
                int i22 = i3;
                lg2 lg2Var = this.f2762b;
                switch (i22) {
                    case 0:
                        int i32 = lg2.g;
                        lg2Var.dismiss();
                        return;
                    case 1:
                        int i4 = lg2.g;
                        lg2Var.dismiss();
                        Activity activity = lg2Var.d;
                        if (activity == null) {
                            activity = null;
                        }
                        if (v73.r(activity)) {
                            du.d(540, null);
                            String str2 = lg2Var.e;
                            if (str2 != null) {
                                str = str2;
                            }
                            p71.x(str, 640);
                            return;
                        }
                        return;
                    default:
                        int i5 = lg2.g;
                        lg2Var.dismiss();
                        Activity activity2 = lg2Var.d;
                        if (activity2 == null) {
                            activity2 = null;
                        }
                        if (v73.r(activity2)) {
                            du.d(540, null);
                            String str3 = lg2Var.e;
                            if (str3 != null) {
                                str = str3;
                            }
                            p71.x(str, 640);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final kl0 t() {
        return (kl0) this.f.getValue();
    }
}
