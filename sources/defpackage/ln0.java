package defpackage;

import a.bx;
import android.view.View;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.AccountActivityNew;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ln0 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ mn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln0(mn0 mn0Var, int i) {
        super(1);
        this.f = i;
        this.g = mn0Var;
    }

    public final void a(View view) {
        int i = this.f;
        mn0 mn0Var = this.g;
        switch (i) {
            case 0:
                if (!ew3.o() && !ew3.X()) {
                    l requireActivity = mn0Var.requireActivity();
                    bx i2 = hx2.i(118);
                    boolean q = i2.q();
                    i2.h();
                    bx3.G(requireActivity, q, null);
                    return;
                }
                ya0.H(mn0Var.requireActivity(), AccountActivityNew.class);
                return;
            default:
                if (!ew3.X()) {
                    m20.C0(mn0Var.requireActivity(), 3);
                    l activity = mn0Var.getActivity();
                    if (activity != null) {
                        activity.overridePendingTransition(R.anim.slide_bottom_in, R.anim.none);
                        return;
                    }
                    return;
                }
                tf3.V(view);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        boolean z;
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((View) obj);
                return ch3Var;
            case 1:
                a((View) obj);
                return ch3Var;
            default:
                Integer num = (Integer) obj;
                mn0 mn0Var = this.g;
                if (mn0Var.f > 0) {
                    ArrayList arrayList = mn0Var.d;
                    int size = arrayList.size();
                    int i = mn0Var.f;
                    if (size > i) {
                        nn0 nn0Var = (nn0) arrayList.get(i);
                        if (num.intValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        nn0Var.e = z;
                        mn0Var.e.g(mn0Var.f);
                    }
                }
                return ch3Var;
        }
    }
}
