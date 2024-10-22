package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class zf implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5469a;

    public /* synthetic */ zf(int i) {
        this.f5469a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5469a) {
            case 1:
                ag.C0().K.L.execute(runnable);
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
            case 5:
            case 7:
            default:
                runnable.run();
                return;
            case 6:
                runnable.run();
                return;
            case 8:
                runnable.run();
                return;
            case 9:
                runnable.run();
                return;
            case 10:
                runnable.run();
                return;
            case 11:
                runnable.run();
                return;
            case 12:
                runnable.run();
                return;
            case 13:
                runnable.run();
                return;
            case 14:
                runnable.run();
                return;
            case 15:
                runnable.run();
                return;
            case 16:
                runnable.run();
                return;
            case 17:
                runnable.run();
                return;
            case 18:
                runnable.run();
                return;
        }
    }
}
