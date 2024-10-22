package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public class k02 extends sn {
    public static final /* synthetic */ int d = 0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_account_notbind, viewGroup, false);
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        final int i = 0;
        view.findViewById(R.id.sign_up_btn).setOnClickListener(new View.OnClickListener(this) { // from class: j02

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k02 f2684b;

            {
                this.f2684b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ot3 ot3Var = ot3.c;
                int i2 = i;
                k02 k02Var = this.f2684b;
                switch (i2) {
                    case 0:
                        int i3 = k02.d;
                        k02Var.getClass();
                        ot3Var.f3728b = true;
                        bx3.G(k02Var.getActivity(), false, null);
                        return;
                    default:
                        int i4 = k02.d;
                        k02Var.getClass();
                        ot3Var.f3728b = true;
                        bx3.G(k02Var.getActivity(), true, null);
                        return;
                }
            }
        });
        final int i2 = 1;
        view.findViewById(R.id.sign_in_btn).setOnClickListener(new View.OnClickListener(this) { // from class: j02

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k02 f2684b;

            {
                this.f2684b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ot3 ot3Var = ot3.c;
                int i22 = i2;
                k02 k02Var = this.f2684b;
                switch (i22) {
                    case 0:
                        int i3 = k02.d;
                        k02Var.getClass();
                        ot3Var.f3728b = true;
                        bx3.G(k02Var.getActivity(), false, null);
                        return;
                    default:
                        int i4 = k02.d;
                        k02Var.getClass();
                        ot3Var.f3728b = true;
                        bx3.G(k02Var.getActivity(), true, null);
                        return;
                }
            }
        });
        fl.n(this, (TextView) s(R.id.bind_another_tip2_tv), 1000014);
        view.findViewById(R.id.sign_up_btn).setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        fl.n(this, (TextView) s(R.id.sign_up_btn), 1000117);
    }
}
