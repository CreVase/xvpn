package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class x3 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn f5110b;

    public /* synthetic */ x3(sn snVar, int i) {
        this.f5109a = i;
        this.f5110b = snVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = this.f5109a;
        sn snVar = this.f5110b;
        switch (i2) {
            case 0:
                f4 f4Var = (f4) snVar;
                int i3 = f4.q;
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                cf3 cf3Var = f4Var.n;
                if (cf3Var == null) {
                    cf3Var = null;
                }
                return cf3Var.requestFocus();
            case 1:
                xa2 xa2Var = (xa2) snVar;
                int i4 = xa2.o;
                if ((i == 4 || i == 21) && keyEvent.getAction() == 0) {
                    cf3 cf3Var2 = xa2Var.g;
                    if (cf3Var2 == null) {
                        return true;
                    }
                    cf3Var2.requestFocus();
                    return true;
                }
                return false;
            case 2:
                e8 e8Var = (e8) snVar;
                int i5 = e8.j;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0 && e8Var.getParentFragmentManager().E() > 0) {
                    e8Var.getParentFragmentManager().P();
                    return true;
                }
                if (keyEvent.getAction() == 0 && i == 21) {
                    return true;
                }
                return false;
            case 3:
                yo2 yo2Var = (yo2) snVar;
                int i6 = yo2.g;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0 && yo2Var.getParentFragmentManager().E() > 0) {
                    yo2Var.getParentFragmentManager().P();
                    return true;
                }
                if (keyEvent.getAction() == 0 && (i == 19 || i == 21)) {
                    return true;
                }
                return false;
            default:
                lz2 lz2Var = (lz2) snVar;
                int i7 = lz2.h;
                if (i == 4 && keyEvent.getAction() == 0 && lz2Var.requireActivity().getSupportFragmentManager().E() > 0) {
                    lz2Var.requireActivity().getSupportFragmentManager().P();
                    return true;
                }
                return false;
        }
    }
}
