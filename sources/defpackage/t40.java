package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t40 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4449a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4450b;

    public t40(boolean z) {
        this.f4450b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f4450b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder n = p71.n(str);
        n.append(this.f4449a.incrementAndGet());
        return new Thread(runnable, n.toString());
    }
}
