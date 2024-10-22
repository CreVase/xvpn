package androidx.work;

import defpackage.es3;
import defpackage.g63;
import defpackage.jd0;
import defpackage.ls3;
import defpackage.m92;
import defpackage.s01;
import defpackage.y33;
import defpackage.ys3;
import defpackage.zs3;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f289a;

    /* renamed from: b, reason: collision with root package name */
    public final jd0 f290b;
    public final HashSet c;
    public final y33 d;
    public final int e;
    public final Executor f;
    public final g63 g;
    public final zs3 h;
    public final m92 i;
    public final s01 j;

    public WorkerParameters(UUID uuid, jd0 jd0Var, List list, y33 y33Var, int i, ExecutorService executorService, g63 g63Var, ys3 ys3Var, ls3 ls3Var, es3 es3Var) {
        this.f289a = uuid;
        this.f290b = jd0Var;
        this.c = new HashSet(list);
        this.d = y33Var;
        this.e = i;
        this.f = executorService;
        this.g = g63Var;
        this.h = ys3Var;
        this.i = ls3Var;
        this.j = es3Var;
    }
}
