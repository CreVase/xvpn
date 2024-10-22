package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* loaded from: classes.dex */
public final class lr1 extends zf3 {
    public final MeasurementManager i;

    public lr1(Context context) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) x2.l());
        this.i = x2.c(systemService);
    }

    @Override // defpackage.zf3
    public Object D(c90 c90Var) {
        vu vuVar = new vu(1, t9.P(c90Var));
        vuVar.s();
        this.i.getMeasurementApiStatus(new zf(2), new f90(vuVar));
        Object r = vuVar.r();
        ba0 ba0Var = ba0.f430a;
        return r;
    }

    @Override // defpackage.zf3
    public Object Z(Uri uri, InputEvent inputEvent, c90 c90Var) {
        vu vuVar = new vu(1, t9.P(c90Var));
        vuVar.s();
        this.i.registerSource(uri, inputEvent, new zf(6), new f90(vuVar));
        Object r = vuVar.r();
        if (r == ba0.f430a) {
            return r;
        }
        return ch3.f636a;
    }

    @Override // defpackage.zf3
    public Object a0(Uri uri, c90 c90Var) {
        vu vuVar = new vu(1, t9.P(c90Var));
        vuVar.s();
        this.i.registerTrigger(uri, new zf(3), new f90(vuVar));
        Object r = vuVar.r();
        if (r == ba0.f430a) {
            return r;
        }
        return ch3.f636a;
    }

    public Object q0(gk0 gk0Var, c90 c90Var) {
        new vu(1, t9.P(c90Var)).s();
        x2.p();
        throw null;
    }

    public Object r0(to3 to3Var, c90 c90Var) {
        new vu(1, t9.P(c90Var)).s();
        x2.w();
        throw null;
    }

    public Object s0(uo3 uo3Var, c90 c90Var) {
        new vu(1, t9.P(c90Var)).s();
        x2.x();
        throw null;
    }
}
