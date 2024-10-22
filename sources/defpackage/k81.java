package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;

/* loaded from: classes2.dex */
public final class k81 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ HomeActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k81(HomeActivity homeActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = homeActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        k81 k81Var = new k81(this.f, c90Var);
        k81Var.e = obj;
        return k81Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        k81 k81Var = (k81) create((he3) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        k81Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        String z;
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        he3 he3Var = (he3) this.e;
        boolean z2 = he3Var instanceof fe3;
        int i = 0;
        HomeActivity homeActivity = this.f;
        int i2 = 1;
        if (z2) {
            ac2 G = ew3.G();
            if (m20.L(((fe3) he3Var).f2085a, "ryjpfh54p9")) {
                z = pd0.y(R.string.TvProtocolAutoChangeToEverestForEverestLine);
            } else if (G.f55a) {
                z = pd0.z(R.string.TvProtocolAutoChangeToEverest, G.c);
            } else {
                z = pd0.z(R.string.TvProtocolAutoChangeToNotEverest, G.f56b, G.c);
            }
            m20.Z0(homeActivity.getSupportFragmentManager(), "ProtocolChange", new yy(z, 3));
        } else if (he3Var instanceof ae3) {
            m20.a1(homeActivity, new h81(he3Var, homeActivity, i));
        } else if (he3Var instanceof ce3) {
            m20.a1(homeActivity, new h81(he3Var, homeActivity, i2));
        } else if (m20.L(he3Var, be3.f454a)) {
            m20.a1(homeActivity, new j81(homeActivity, i));
        } else if (m20.L(he3Var, de3.f1766a)) {
            tf3.h0(homeActivity, PurchaseActivity.class, null, 0, 6);
        } else if (m20.L(he3Var, ee3.f1925a)) {
            if (homeActivity.getSupportFragmentManager().C("PasswordExpired") == null) {
                j81 j81Var = new j81(homeActivity, i2);
                bd3 bd3Var = new bd3();
                j81Var.invoke(bd3Var.e);
                bd3Var.show(homeActivity.getSupportFragmentManager(), "PasswordExpired");
            }
        } else if (m20.L(he3Var, ge3.f2242a)) {
            m20.a1(homeActivity, d42.y);
        }
        return ch3.f636a;
    }
}
