package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class xs0 extends vm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f5209b;
    public final /* synthetic */ long c = 2;
    public final /* synthetic */ TimeUnit d;

    public xs0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f5208a = str;
        this.f5209b = executorService;
        this.d = timeUnit;
    }

    @Override // defpackage.vm
    public final void a() {
        ExecutorService executorService = this.f5209b;
        try {
            executorService.shutdown();
            if (!executorService.awaitTermination(this.c, this.d)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f5208a);
            executorService.shutdownNow();
        }
    }
}
