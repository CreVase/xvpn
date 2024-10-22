package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class sa implements zq, ua, qj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta f4297a;

    public /* synthetic */ sa(ta taVar) {
        this.f4297a = taVar;
    }

    @Override // defpackage.ua
    public final void c(Bundle bundle) {
        this.f4297a.f4472a.c(bundle);
    }

    @Override // defpackage.qj0
    public final void g(fb2 fb2Var) {
        ta taVar = this.f4297a;
        taVar.getClass();
        qa qaVar = (qa) fb2Var.get();
        uo uoVar = new uo(qaVar);
        uy0 uy0Var = new uy0(16, 0);
        ra raVar = (ra) qaVar;
        uy0 b2 = raVar.b(uy0Var, "clx");
        if (b2 == null) {
            b2 = raVar.b(uy0Var, AppMeasurement.CRASH_ORIGIN);
        }
        if (b2 != null) {
            ja1 ja1Var = new ja1(29);
            iq iqVar = new iq(uoVar, TimeUnit.MILLISECONDS);
            synchronized (taVar) {
                Iterator it = taVar.c.iterator();
                while (it.hasNext()) {
                    ja1Var.f2735b = (oa0) it.next();
                }
                uy0Var.c = ja1Var;
                uy0Var.f4757b = iqVar;
                taVar.f4473b = ja1Var;
                taVar.f4472a = iqVar;
            }
        }
    }

    @Override // defpackage.zq
    public final void o(oa0 oa0Var) {
        ta taVar = this.f4297a;
        synchronized (taVar) {
            if (taVar.f4473b instanceof pl0) {
                taVar.c.add(oa0Var);
            }
            taVar.f4473b.o(oa0Var);
        }
    }
}
