package defpackage;

import a.bx;
import a.du;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class mn0 extends sn implements qt3 {
    public final ArrayList d;
    public final rv0 e;
    public int f;
    public du3 g;
    public AppCompatImageView h;
    public AppCompatTextView i;
    public AppCompatTextView j;
    public final on0 k;

    public mn0() {
        super(0);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new rv0(arrayList, this, 1);
        this.f = -1;
        this.k = new on0(arrayList);
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        String y;
        int i;
        AppCompatImageView appCompatImageView = this.h;
        if (appCompatImageView != null) {
            if (z2) {
                i = R.drawable.ic_user_type_mobile;
            } else {
                i = R.drawable.ic_user_type_free;
            }
            appCompatImageView.setImageResource(i);
        }
        if (z2) {
            tf3.V(this.g);
            bx bxVar = new bx();
            du.d(376, bxVar);
            String u = bxVar.u();
            bxVar.h();
            if (m20.L(u, "For All")) {
                y = pd0.y(R.string.AccountVIPFull);
            } else if (m20.L(u, "For Netflix")) {
                y = pd0.y(R.string.AccountVIPStreaming);
            } else {
                y = pd0.y(R.string.AccountVIPMobile);
            }
        } else {
            tf3.v0(this.g);
            y = pd0.y(R.string.AccountFree);
        }
        a83 a83Var = this.c;
        if (z) {
            AppCompatTextView appCompatTextView = this.i;
            if (appCompatTextView != null) {
                a83Var.c(appCompatTextView);
                appCompatTextView.setTextColor(v73.y());
                fl.n(this, appCompatTextView, 1000013);
                appCompatTextView.setText(y);
            }
            AppCompatTextView appCompatTextView2 = this.j;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(ew3.k().f4307a);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView3 = this.i;
        if (appCompatTextView3 != null) {
            a83Var.c(appCompatTextView3);
            appCompatTextView3.setTextColor(-13982994);
            appCompatTextView3.setText(pd0.y(R.string.AccountUndefine));
        }
        AppCompatTextView appCompatTextView4 = this.j;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setText(y);
        }
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        rt3.e().c(this);
        int i = d83.f1748a;
        d83.d(this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0386  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn0.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        rt3.e().l(this);
        int i = d83.f1748a;
        d83.a(this.k);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        z();
    }

    @Override // defpackage.sn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        on0 on0Var = this.k;
        if (on0Var != null) {
            on0Var.p(z);
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        z();
        this.e.f();
        cz.v.d(this, new qt2(2, new ln0(this, 2)));
    }

    public final void z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nn0(pd0.y(R.string.RestorePurchase), R.drawable.ic_restore_purchase, 4, new kn0(this, 1), 20));
        this.f = arrayList.size();
        arrayList.add(new nn0(pd0.y(R.string.Support), R.drawable.icon_help, 1, new kn0(this, 2), 20));
        arrayList.add(new nn0(pd0.y(R.string.GameConsoles), R.drawable.icon_game_consoles, 8, new kn0(this, 3), 20));
        arrayList.add(new nn0(pd0.y(R.string.OtherDeviceUse), R.drawable.icon_other_devices, 8, new kn0(this, 4), 20));
        arrayList.add(new nn0(pd0.y(R.string.Language), R.drawable.icon_language, 12, new kn0(this, 5), 20));
        arrayList.add(new nn0(pd0.y(R.string.ShareApp), 0, 1, new kn0(this, 6), 22));
        bx bxVar = new bx();
        du.d(565, bxVar);
        boolean q = bxVar.q();
        bxVar.h();
        if (q) {
            arrayList.add(new nn0(pd0.y(R.string.RateUs), 0, 8, new kn0(this, 7), 22));
        }
        arrayList.add(new nn0(pd0.y(R.string.About), 0, 12, new kn0(this, 8), 22));
        if (ew3.T()) {
            arrayList.add(new nn0("Debug Console", 0, 6, new kn0(this, 0), 22));
        }
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        rv0 rv0Var = this.e;
        if (rv0Var != null) {
            rv0Var.f();
        }
    }
}
