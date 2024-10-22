package defpackage;

import a.bx;
import a.du;
import android.view.View;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class qo1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4031b;

    public /* synthetic */ qo1(MainActivity mainActivity, int i) {
        this.f4030a = i;
        this.f4031b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.f4030a;
        int i3 = 2;
        int i4 = 8;
        int i5 = 3;
        int i6 = 0;
        MainActivity mainActivity = this.f4031b;
        switch (i2) {
            case 0:
                int i7 = MainActivity.y;
                mainActivity.getClass();
                ew3.p();
                mainActivity.runOnUiThread(new qo1(mainActivity, i5));
                mainActivity.x.unlock();
                return;
            case 1:
                int i8 = MainActivity.y;
                mainActivity.getClass();
                bx bxVar = new bx();
                du.d(364, bxVar);
                boolean q = bxVar.q();
                bxVar.h();
                String p = ew3.p();
                if (bw3.a(p, "AccountV5AuthFailed")) {
                    ew3.q();
                    rt3.e().i(false, ew3.X());
                    if (!ew3.U()) {
                        t9.a();
                    }
                    ew3.d0(new qo1(mainActivity, i3));
                } else if (q) {
                    bx i9 = hx2.i(370);
                    boolean q2 = i9.q();
                    i9.h();
                    if (q2) {
                        if (ew3.T()) {
                            ew3.d0(new to1(i6, mainActivity, p));
                        }
                        ew3.d0(new qo1(mainActivity, 6));
                    }
                }
                rt3.e().i(ew3.o(), ew3.X());
                try {
                    rx0.a().c(ew3.w());
                } catch (Exception unused) {
                }
                mainActivity.v.unlock();
                return;
            case 2:
                if (mainActivity.s) {
                    mainActivity.s = false;
                    return;
                }
                t9.v0(mainActivity, "PasswordExpireDialog", new ro1(mainActivity, 3));
                if (m20.A0()) {
                    r9 r9Var = mainActivity.o;
                    if (r9Var != null && r9Var.t()) {
                        mainActivity.o.dismissAllowingStateLoss();
                    }
                    mainActivity.o = ya0.g0(mainActivity, 2);
                    return;
                }
                return;
            case 3:
                mainActivity.b0();
                return;
            case 4:
                int i10 = MainActivity.y;
                mainActivity.getClass();
                bx bxVar2 = new bx();
                du.d(98, bxVar2);
                boolean q3 = bxVar2.q();
                bxVar2.h();
                if (q3) {
                    mainActivity.runOnUiThread(new qo1(mainActivity, i4));
                    return;
                }
                return;
            case 5:
                int i11 = MainActivity.y;
                mainActivity.getClass();
                ew3.d0(new qo1(mainActivity, 7));
                return;
            case 6:
                int i12 = MainActivity.y;
                if (!mainActivity.isFinishing()) {
                    mainActivity.c0();
                    ed2 ed2Var = new ed2(mainActivity, R.layout.dialog_purchase_bind_another);
                    ed2Var.m = 3;
                    ed2Var.show();
                    return;
                }
                return;
            case 7:
                int i13 = MainActivity.y;
                if (!mainActivity.d) {
                    View findViewById = mainActivity.findViewById(R.id.left_drawer_msg);
                    if (mainActivity.q > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                    View findViewById2 = mainActivity.findViewById(R.id.hasNewMessage);
                    if (mainActivity.q > 0) {
                        i4 = 0;
                    }
                    findViewById2.setVisibility(i4);
                    return;
                }
                return;
            default:
                int i14 = MainActivity.y;
                if (!mainActivity.d) {
                    m20.C0(mainActivity, 38);
                    return;
                }
                return;
        }
    }
}
