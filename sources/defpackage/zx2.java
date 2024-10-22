package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class zx2 extends z33 implements l41 {
    public final /* synthetic */ SpeedTestActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx2(SpeedTestActivity speedTestActivity, c90 c90Var) {
        super(2, c90Var);
        this.e = speedTestActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new zx2(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        zx2 zx2Var = (zx2) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        zx2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        gc3 F;
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        bx bxVar = new bx();
        du.d(459, bxVar);
        int t = (int) bxVar.t();
        rb2[] rb2VarArr = new rb2[t];
        for (int i = 0; i < t; i++) {
            rb2 rb2Var = new rb2();
            ew3.s0(bxVar, rb2Var);
            rb2VarArr[i] = rb2Var;
        }
        bxVar.h();
        ArrayList j0 = tf3.j0(fl.W(rb2VarArr, false));
        SpeedTestActivity speedTestActivity = this.e;
        c00 c00Var = speedTestActivity.t;
        if (c00Var != null) {
            if (c00Var.c() > 1) {
                for (gc3 gc3Var : c00Var.f) {
                    if (gc3Var.c && (F = tf3.F(gc3Var, j0)) != null) {
                        F.c = true;
                    }
                }
            }
            speedTestActivity.Z().m.l0();
            LinkedList L = tf3.L(j0);
            zp2 zp2Var = new zp2();
            zp2Var.f5529b = "All";
            zp2Var.f5528a = "8ebagyhr8n";
            L.add(0, new gc3(zp2Var));
            c00Var.f = L;
            c00Var.f();
        }
        return ch3.f636a;
    }
}
