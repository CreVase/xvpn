package defpackage;

import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import java.util.List;

/* loaded from: classes2.dex */
public final class cy2 extends z33 implements l41 {
    public final /* synthetic */ SpeedTestActivity e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy2(SpeedTestActivity speedTestActivity, List list, c90 c90Var) {
        super(2, c90Var);
        this.e = speedTestActivity;
        this.f = list;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new cy2(this.e, this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        cy2 cy2Var = (cy2) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        cy2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        SpeedTestActivity speedTestActivity = this.e;
        speedTestActivity.n.clear();
        speedTestActivity.n.addAll(this.f);
        speedTestActivity.m.f();
        return ch3.f636a;
    }
}
