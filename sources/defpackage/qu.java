package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qu extends ru {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hs3 f4058b;
    public final /* synthetic */ String c = null;
    public final /* synthetic */ boolean d = false;

    public qu(hs3 hs3Var) {
        this.f4058b = hs3Var;
    }

    @Override // defpackage.ru
    public final void b() {
        hs3 hs3Var = this.f4058b;
        WorkDatabase workDatabase = hs3Var.s;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().f(this.c).iterator();
            while (it.hasNext()) {
                ru.a(hs3Var, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.d) {
                kn2.a(hs3Var.r, hs3Var.s, hs3Var.u);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
