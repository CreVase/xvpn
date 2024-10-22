package defpackage;

/* loaded from: classes2.dex */
public abstract class n83 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3412a = new ThreadLocal();

    public static ms0 a() {
        ThreadLocal threadLocal = f3412a;
        ms0 ms0Var = (ms0) threadLocal.get();
        if (ms0Var == null) {
            kq kqVar = new kq(Thread.currentThread());
            threadLocal.set(kqVar);
            return kqVar;
        }
        return ms0Var;
    }
}
