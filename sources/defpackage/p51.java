package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class p51 implements f13 {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f3784a;

    public p51(TaskCompletionSource taskCompletionSource) {
        this.f3784a = taskCompletionSource;
    }

    @Override // defpackage.f13
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.f13
    public final boolean b(bm bmVar) {
        boolean z;
        boolean z2;
        boolean z3;
        c52 c52Var = c52.UNREGISTERED;
        c52 c52Var2 = bmVar.f487b;
        if (c52Var2 == c52Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (c52Var2 == c52.REGISTERED) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (c52Var2 == c52.REGISTER_ERROR) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return false;
                }
            }
        }
        this.f3784a.trySetResult(bmVar.f486a);
        return true;
    }
}
