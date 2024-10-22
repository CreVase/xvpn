package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class lz2 extends sn {
    public static final /* synthetic */ int h = 0;
    public final int d;
    public tz2 e;
    public yo2 f;
    public e8 g;

    public lz2() {
        super(0);
        this.d = R.id.root_view;
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        FrameLayout.LayoutParams layoutParams = null;
        du3 du3Var = new du3(context, null, 6, 0);
        du3Var.setId(-1);
        du3Var.setId(this.d);
        du3Var.setAttachToParent(false);
        ViewGroup.LayoutParams layoutParams2 = du3Var.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        du3Var.setLayoutParams(layoutParams);
        du3Var.setOnKeyListener(new x3(this, 4));
        if ((context instanceof Activity) && du3Var.getAttachToParent()) {
            ((Activity) context).setContentView(du3Var);
        }
        return du3Var;
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        tz2 tz2Var;
        yo2 yo2Var;
        e8 e8Var;
        p childFragmentManager = getChildFragmentManager();
        Fragment C = childFragmentManager.C("main");
        if (C instanceof tz2) {
            tz2Var = (tz2) C;
        } else {
            tz2Var = null;
        }
        if (tz2Var == null) {
            tz2Var = new tz2();
        }
        this.e = tz2Var;
        Fragment C2 = childFragmentManager.C("selectedAppsFragment");
        if (C2 instanceof yo2) {
            yo2Var = (yo2) C2;
        } else {
            yo2Var = null;
        }
        if (yo2Var == null) {
            yo2Var = new yo2();
        }
        this.f = yo2Var;
        Fragment C3 = childFragmentManager.C("addAppsFragment");
        if (C3 instanceof e8) {
            e8Var = (e8) C3;
        } else {
            e8Var = null;
        }
        if (e8Var == null) {
            e8Var = new e8();
        }
        this.g = e8Var;
        tz2 tz2Var2 = this.e;
        if (tz2Var2 != null) {
            tz2Var2.d = new kz2(childFragmentManager, this, 0);
        }
        yo2 yo2Var2 = this.f;
        if (yo2Var2 != null) {
            yo2Var2.d = new kz2(childFragmentManager, this, 1);
        }
        a aVar = new a(childFragmentManager);
        yo2 yo2Var3 = this.f;
        if (yo2Var3 != null) {
            aVar.k(yo2Var3);
        }
        e8 e8Var2 = this.g;
        if (e8Var2 != null) {
            aVar.k(e8Var2);
        }
        tz2 tz2Var3 = this.e;
        if (tz2Var3 != null) {
            if (!tz2Var3.isAdded()) {
                aVar.d(this.d, tz2Var3, null, 1);
            }
            aVar.l(tz2Var3);
            aVar.h();
        }
    }
}
