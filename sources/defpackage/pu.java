package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class pu extends ru {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3916b;
    public final /* synthetic */ hs3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pu(hs3 hs3Var, Object obj, int i) {
        this.f3916b = i;
        this.c = hs3Var;
        this.d = obj;
    }

    @Override // defpackage.ru
    public final void b() {
        WorkDatabase workDatabase;
        int i = this.f3916b;
        Object obj = this.d;
        hs3 hs3Var = this.c;
        switch (i) {
            case 0:
                workDatabase = hs3Var.s;
                workDatabase.c();
                try {
                    ru.a(hs3Var, ((UUID) obj).toString());
                    workDatabase.h();
                    workDatabase.f();
                    kn2.a(hs3Var.r, hs3Var.s, hs3Var.u);
                    return;
                } finally {
                }
            default:
                workDatabase = hs3Var.s;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().g((String) obj).iterator();
                    while (it.hasNext()) {
                        ru.a(hs3Var, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    kn2.a(hs3Var.r, hs3Var.s, hs3Var.u);
                    return;
                } finally {
                }
        }
    }
}
