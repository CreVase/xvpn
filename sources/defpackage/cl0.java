package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.p;

/* loaded from: classes.dex */
public final class cl0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f662b;

    public /* synthetic */ cl0(Object obj, int i) {
        this.f661a = i;
        this.f662b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f661a;
        Object obj = this.f662b;
        switch (i) {
            case 0:
                f fVar = (f) obj;
                f.access$100(fVar).onDismiss(f.access$000(fVar));
                return;
            default:
                ((p) obj).x(true);
                return;
        }
    }
}
