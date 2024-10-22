package defpackage;

import a.bx;
import android.graphics.Rect;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class rr0 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ eu3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr0(eu3 eu3Var, int i) {
        super(1);
        this.f = i;
        this.g = eu3Var;
    }

    public final void a(Rect rect) {
        int i = this.f;
        eu3 eu3Var = this.g;
        switch (i) {
            case 0:
                eu3Var.setPadding(0, rect.top, 0, 0);
                return;
            case 1:
                eu3Var.setPadding(0, 0, 0, rect.bottom);
                return;
            default:
                eu3Var.setPadding(0, rect.top, 0, rect.bottom);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((Rect) obj);
                return ch3Var;
            case 1:
                a((Rect) obj);
                return ch3Var;
            case 2:
                a((Rect) obj);
                return ch3Var;
            default:
                p9 p9Var = (p9) obj;
                p9Var.f3798a = pd0.y(R.string.KillSwitchIsActive);
                p9Var.l = this.g;
                bx i = hx2.i(355);
                boolean q = i.q();
                i.h();
                p9Var.p = !q;
                p9.b(p9Var, pd0.y(R.string.Recover), m01.o, 2);
                return ch3Var;
        }
    }
}
