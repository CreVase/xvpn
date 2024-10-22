package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class xx2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpeedTestActivity f5242b;

    public /* synthetic */ xx2(SpeedTestActivity speedTestActivity, int i) {
        this.f5241a = i;
        this.f5242b = speedTestActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5241a;
        int i2 = 3;
        SpeedTestActivity speedTestActivity = this.f5242b;
        switch (i) {
            case 0:
                int i3 = SpeedTestActivity.u;
                bx i4 = hx2.i(463);
                boolean q = i4.q();
                i4.h();
                if (q && ew3.K()) {
                    m20.Y0(speedTestActivity.Z().j);
                }
                hy2 hy2Var = speedTestActivity.m;
                if (hy2Var != null) {
                    hy2Var.f();
                }
                speedTestActivity.findViewById(R.id.tv_ping_status).setVisibility(4);
                speedTestActivity.p.stop();
                speedTestActivity.Z().c.setBackground(speedTestActivity.q);
                speedTestActivity.Z().c.setSelected(false);
                speedTestActivity.Z().c.setText(pd0.y(R.string.RunTest));
                return;
            case 1:
                l92 l92Var = speedTestActivity.p;
                l92Var.c = speedTestActivity.Z().c.getMeasuredHeight() / 2.0f;
                l92Var.a();
                float f = tf3.F * 2.0f;
                l92 l92Var2 = speedTestActivity.p;
                l92Var2.f3087b = f;
                l92Var2.e.setStrokeWidth(f);
                l92Var2.a();
                return;
            case 2:
                int i5 = SpeedTestActivity.u;
                speedTestActivity.e0();
                bx bxVar = new bx();
                du.d(462, bxVar);
                boolean q2 = bxVar.q();
                bxVar.h();
                if (q2) {
                    speedTestActivity.runOnUiThread(new xx2(speedTestActivity, i2));
                    speedTestActivity.g0(false);
                    return;
                }
                bx i6 = hx2.i(461);
                boolean q3 = i6.q();
                i6.h();
                if (q3) {
                    speedTestActivity.g0(true);
                    return;
                }
                return;
            default:
                t9.u0(speedTestActivity, new by2(speedTestActivity, i2));
                return;
        }
    }
}
