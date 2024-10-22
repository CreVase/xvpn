package defpackage;

import a.du;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final class fy2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SpeedTestActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy2(SpeedTestActivity speedTestActivity, c90 c90Var) {
        super(2, c90Var);
        this.g = speedTestActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        fy2 fy2Var = new fy2(this.g, c90Var);
        fy2Var.f = obj;
        return fy2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((fy2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            tj0 d = zf3.d((aa0) this.f, vl0.c, new ey2(this.g, null), 2);
            this.e = 1;
            if (d.q(this) == ba0Var) {
                return ba0Var;
            }
        }
        SpeedTestActivity speedTestActivity = this.g;
        int i3 = SpeedTestActivity.u;
        m20.u0(speedTestActivity.Z().i);
        m20.Y0(speedTestActivity.Z().h);
        m20.u0(speedTestActivity.Z().j);
        speedTestActivity.Z().m.setAdapter(speedTestActivity.m);
        RecyclerView recyclerView = speedTestActivity.Z().m;
        jy jyVar = speedTestActivity.s;
        recyclerView.q.remove(jyVar);
        if (recyclerView.r == jyVar) {
            recyclerView.r = null;
        }
        speedTestActivity.Z().m.q.add(jyVar);
        speedTestActivity.e0();
        this.g.Z().c.setSelected(true);
        this.g.Z().c.setText(pd0.y(R.string.StopAllCaps));
        this.g.findViewById(R.id.tv_ping_status).setVisibility(0);
        this.g.Z().c.setBackground(this.g.p);
        this.g.p.start();
        du.d(457, null);
        this.g.Z().m.f0(0);
        hy2 hy2Var = this.g.m;
        if (hy2Var != null) {
            hy2Var.f();
        }
        dw3 dw3Var = this.g.o;
        if (dw3Var != null) {
            dw3Var.f1852a = true;
        }
        hy2 hy2Var2 = this.g.m;
        if (hy2Var2 != null) {
            hy2Var2.e = true;
        }
        if (hy2Var2 != null) {
            hy2Var2.f();
        }
        SpeedTestActivity speedTestActivity2 = this.g;
        xx2 xx2Var = new xx2(speedTestActivity2, i2);
        dw3 dw3Var2 = new dw3();
        ew3.b0(new l30(dw3Var2, xx2Var, 500, 10));
        speedTestActivity2.o = dw3Var2;
        return ch3.f636a;
    }
}
