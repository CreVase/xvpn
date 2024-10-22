package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class x43 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f5115b;

    public x43(SystemForegroundService systemForegroundService, int i) {
        this.f5115b = systemForegroundService;
        this.f5114a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5115b.e.cancel(this.f5114a);
    }
}
