package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.server.ServerChooseActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class uo1 implements a22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn f4709b;

    public /* synthetic */ uo1(dn dnVar, int i) {
        this.f4708a = i;
        this.f4709b = dnVar;
    }

    @Override // defpackage.a22
    public final void F(Object obj) {
        int i = this.f4708a;
        dn dnVar = this.f4709b;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) dnVar;
                int i2 = MainActivity.y;
                mainActivity.getClass();
                mainActivity.q = ((Integer) obj).intValue();
                ew3.d0(new qo1(mainActivity, 7));
                return;
            default:
                ServerChooseActivity serverChooseActivity = (ServerChooseActivity) dnVar;
                zp2 zp2Var = (zp2) obj;
                boolean z = ServerChooseActivity.u;
                if (zp2Var != null) {
                    if (zp2Var.d()) {
                        if (ew3.V()) {
                            serverChooseActivity.getClass();
                            t9.u0(serverChooseActivity, new cq2(serverChooseActivity, 2));
                            return;
                        } else {
                            serverChooseActivity.e0(zp2Var);
                            return;
                        }
                    }
                    if (zp2Var.h) {
                        String a2 = zp2Var.a();
                        bx bxVar = new bx();
                        bxVar.z(a2);
                        du.d(468, bxVar);
                        bxVar.h();
                        serverChooseActivity.getClass();
                        ew3.b0(new g53(serverChooseActivity, 8));
                        return;
                    }
                    String a3 = zp2Var.a();
                    bx bxVar2 = new bx();
                    bxVar2.z(a3);
                    du.d(469, bxVar2);
                    bxVar2.h();
                    serverChooseActivity.getClass();
                    ew3.b0(new g53(serverChooseActivity, 8));
                    return;
                }
                return;
        }
    }
}
