package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ey2 extends z33 implements l41 {
    public final /* synthetic */ SpeedTestActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey2(SpeedTestActivity speedTestActivity, c90 c90Var) {
        super(2, c90Var);
        this.e = speedTestActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new ey2(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ey2 ey2Var = (ey2) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        ey2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        int i = SpeedTestActivity.u;
        ArrayList b0 = this.e.b0();
        rb2[] rb2VarArr = new rb2[b0.size()];
        for (int i2 = 0; i2 < b0.size(); i2++) {
            rb2VarArr[i2] = fl.u((zp2) b0.get(i2));
        }
        bx bxVar = new bx();
        bxVar.y(rb2VarArr.length);
        for (rb2 rb2Var : rb2VarArr) {
            if (rb2Var == null) {
                rb2Var = new rb2();
            }
            ew3.r0(bxVar, rb2Var);
        }
        du.d(456, bxVar);
        bxVar.h();
        return ch3.f636a;
    }
}
