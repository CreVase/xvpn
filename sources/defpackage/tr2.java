package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class tr2 extends lo {
    public static final /* synthetic */ int p = 0;
    public int e = -1;
    public bf3 f;
    public bf3 g;
    public bf3 h;
    public bf3 i;
    public bf3 j;
    public bf3 k;
    public cf3 l;
    public AppCompatTextView m;
    public AppCompatTextView n;
    public boolean o;

    public final void D(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        bf3 bf3Var = this.f;
        AppCompatTextView appCompatTextView = null;
        if (bf3Var == null) {
            bf3Var = null;
        }
        boolean z8 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        bf3Var.setSelected(z);
        bf3 bf3Var2 = this.g;
        if (bf3Var2 == null) {
            bf3Var2 = null;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bf3Var2.setSelected(z2);
        bf3 bf3Var3 = this.h;
        if (bf3Var3 == null) {
            bf3Var3 = null;
        }
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        bf3Var3.setSelected(z3);
        bf3 bf3Var4 = this.i;
        if (bf3Var4 == null) {
            bf3Var4 = null;
        }
        if (i == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        bf3Var4.setSelected(z4);
        bf3 bf3Var5 = this.j;
        if (bf3Var5 == null) {
            bf3Var5 = null;
        }
        if (i == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        bf3Var5.setSelected(z5);
        bf3 bf3Var6 = this.k;
        if (bf3Var6 == null) {
            bf3Var6 = null;
        }
        if (i == 5) {
            z6 = true;
        } else {
            z6 = false;
        }
        bf3Var6.setSelected(z6);
        AppCompatTextView appCompatTextView2 = this.m;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        if (i < 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        appCompatTextView2.setSelected(z7);
        AppCompatTextView appCompatTextView3 = this.n;
        if (appCompatTextView3 != null) {
            appCompatTextView = appCompatTextView3;
        }
        if (i >= 3) {
            z8 = true;
        }
        appCompatTextView.setSelected(z8);
        if (this.e == i) {
            return;
        }
        Fragment C = getParentFragmentManager().C("setting_" + this.e);
        this.e = i;
        String m = hx2.m("setting_", i);
        Fragment C2 = getParentFragmentManager().C(m);
        if (C2 == null) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    C2 = new o();
                                } else {
                                    throw new IllegalAccessException(hx2.m("illegal index = ", i));
                                }
                            } else {
                                C2 = new z70();
                            }
                        } else {
                            C2 = new pi1();
                        }
                    } else {
                        C2 = new lz2();
                    }
                } else {
                    C2 = new e03();
                }
            } else {
                C2 = new hi1();
            }
        }
        p parentFragmentManager = getParentFragmentManager();
        a k = hx2.k(parentFragmentManager, parentFragmentManager);
        if (C != null) {
            k.k(C);
        }
        if (!C2.isAdded()) {
            k.d(R.id.select_panel, C2, m, 1);
        }
        k.l(C2);
        k.h();
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr2.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.lo, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!this.o) {
            return;
        }
        if (z) {
            cf3 cf3Var = this.l;
            if (cf3Var == null) {
                cf3Var = null;
            }
            View lastFocusChild = cf3Var.getLastFocusChild();
            if (lastFocusChild != null) {
                lastFocusChild.setSelected(false);
            }
            cf3 cf3Var2 = this.l;
            if (cf3Var2 == null) {
                cf3Var2 = null;
            }
            cf3Var2.setLastFocusChild(null);
        }
        D(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("tab", this.e);
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        int i;
        this.o = true;
        if (bundle != null) {
            i = bundle.getInt("tab");
        } else {
            i = -1;
        }
        D(Math.max(i, 0));
    }
}
