package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class py3 extends yx3 {

    /* renamed from: b, reason: collision with root package name */
    public final pq0 f3941b;
    public final TaskCompletionSource c;
    public final /* synthetic */ uy3 d;

    public py3(uy3 uy3Var, pq0 pq0Var, TaskCompletionSource taskCompletionSource) {
        this.d = uy3Var;
        this.f3941b = pq0Var;
        this.c = taskCompletionSource;
    }

    @Override // defpackage.cy3
    public void d(Bundle bundle) {
        az3 az3Var = this.d.f4760a;
        TaskCompletionSource taskCompletionSource = this.c;
        synchronized (az3Var.f) {
            az3Var.e.remove(taskCompletionSource);
        }
        az3Var.a().post(new ty3(az3Var, 0));
        this.f3941b.g("onRequestInfo", new Object[0]);
    }

    @Override // defpackage.cy3
    public void zzb(Bundle bundle) {
        az3 az3Var = this.d.f4760a;
        TaskCompletionSource taskCompletionSource = this.c;
        synchronized (az3Var.f) {
            az3Var.e.remove(taskCompletionSource);
        }
        az3Var.a().post(new ty3(az3Var, 0));
        this.f3941b.g("onCompleteUpdate", new Object[0]);
    }
}
