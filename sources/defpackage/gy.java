package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class gy extends z33 implements l41 {
    public final /* synthetic */ ChatActivity e;
    public final /* synthetic */ ut3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(ChatActivity chatActivity, ut3 ut3Var, c90 c90Var) {
        super(2, c90Var);
        this.e = chatActivity;
        this.f = ut3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new gy(this.e, this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        gy gyVar = (gy) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        gyVar.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        String str = this.e.q;
        Long.toHexString(System.currentTimeMillis());
        bx bxVar = new bx();
        ut3 ut3Var = this.f;
        if (ut3Var == null) {
            ut3Var = new ut3();
        }
        tf3.n(bxVar, ut3Var);
        du.d(29, bxVar);
        bxVar.h();
        return ch3.f636a;
    }
}
