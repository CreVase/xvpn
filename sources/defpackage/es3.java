package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class es3 implements s01 {

    /* renamed from: a, reason: collision with root package name */
    public final g63 f1986a;

    /* renamed from: b, reason: collision with root package name */
    public final r01 f1987b;
    public final ts3 c;

    static {
        bo1.e("WMFgUpdater");
    }

    public es3(WorkDatabase workDatabase, r01 r01Var, g63 g63Var) {
        this.f1987b = r01Var;
        this.f1986a = g63Var;
        this.c = workDatabase.n();
    }
}
