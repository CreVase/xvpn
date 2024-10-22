package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ma0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na0 f3259b;

    public ma0(na0 na0Var, long j) {
        this.f3259b = na0Var;
        this.f3258a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f3258a);
        this.f3259b.k.c(bundle);
        return null;
    }
}
