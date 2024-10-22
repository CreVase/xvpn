package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class es0 implements u23, hc2 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1982a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f1983b = new ArrayDeque();
    public final Executor c;

    public es0(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, hs0 hs0Var) {
        executor.getClass();
        if (!this.f1982a.containsKey(pd0.class)) {
            this.f1982a.put(pd0.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f1982a.get(pd0.class)).put(hs0Var, executor);
    }
}
