package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class e92 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1901b;

    public /* synthetic */ e92(Context context, int i) {
        this.f1900a = i;
        this.f1901b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1900a;
        Context context = this.f1901b;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e92(context, 1));
                return;
            default:
                ew3.h1(context, new zf(12), ew3.s, false);
                return;
        }
    }
}
