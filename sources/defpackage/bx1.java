package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public abstract class bx1 extends rn {
    public int d = 1;
    public float e;
    public float f;
    public View g;
    public yh1 h;

    public long D() {
        return 300L;
    }

    public TimeInterpolator E() {
        return new uv0();
    }

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        pc0 pc0Var = new pc0(requireContext(), R.style.DialogBase_TVModelDrawer);
        pc0Var.setCancelable(false);
        pc0Var.setCanceledOnTouchOutside(false);
        return pc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yh1 yh1Var = new yh1(layoutInflater.getContext());
        yh1Var.setId(-1);
        this.h = yh1Var;
        yh1Var.setAttachToParent(false);
        yh1Var.setOnKeyAction(new fv2(this, 12));
        View z = z(yh1Var);
        this.g = z;
        d32.a(z, new y4(z, this, 22));
        return yh1Var;
    }

    @Override // defpackage.rn
    public void s(View view, Bundle bundle) {
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    public final void t() {
        View view = this.g;
        if (view != null) {
            view.animate().translationX(this.e).translationY(this.f).setInterpolator(new LinearInterpolator()).setDuration(200L).setListener(new py2(this, 1)).start();
            ObjectAnimator.ofArgb(this.h, "backgroundColor", -872415232, 0).setDuration(200L).start();
        }
    }

    public abstract View z(yh1 yh1Var);
}
