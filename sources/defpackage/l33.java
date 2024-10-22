package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public final class l33 extends rn {
    public String d = "";
    public final ui1 e = m20.D0(kj1.f2953a, new kg2(this, 1));

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        nc0 nc0Var = new nc0(requireContext());
        nc0Var.setCancelable(false);
        nc0Var.setCanceledOnTouchOutside(false);
        return nc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return t().f3149a;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // defpackage.rn
    public final void s(View view, Bundle bundle) {
        XTextViewNew xTextViewNew = t().c;
        if (xTextViewNew != null) {
            xTextViewNew.setText(this.d);
        }
        t().f3150b.setBackground(new zg2(1000008, 8 * tf3.F, 0.0f, false));
        fl.j(t().f3150b, this);
        fl.n(this, t().c, 1000015);
        setCancelable(false);
    }

    public final ll0 t() {
        return (ll0) this.e.getValue();
    }
}
