package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class p40 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3779b;

    public /* synthetic */ p40(String str, int i) {
        this.f3778a = i;
        this.f3779b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f3778a;
        String str = this.f3779b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i2 = wi3.f5017a;
                return new Thread(runnable, str);
        }
    }
}
