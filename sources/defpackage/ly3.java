package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class ly3 extends ny3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3207b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly3(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i) {
        super(taskCompletionSource);
        this.f3207b = i;
        this.e = obj;
        this.c = taskCompletionSource2;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [vx3, android.os.IInterface] */
    /* JADX WARN: Type inference failed for: r5v5, types: [vx3, android.os.IInterface] */
    @Override // defpackage.ny3
    public final void a() {
        switch (this.f3207b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.c;
                Object obj = this.e;
                Object obj2 = this.d;
                try {
                    uy3 uy3Var = (uy3) obj;
                    ((uy3) obj).f4760a.m.e(uy3Var.f4761b, uy3.a(uy3Var, (String) obj2), new sy3((uy3) obj, taskCompletionSource, (String) obj2));
                    return;
                } catch (RemoteException e) {
                    uy3.e.f(e, "requestUpdateInfo(%s)", (String) obj2);
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.c;
                Object obj3 = this.e;
                try {
                    ((uy3) obj3).f4760a.m.c(((uy3) obj3).f4761b, uy3.b(), new ry3((uy3) obj3, taskCompletionSource2));
                    return;
                } catch (RemoteException e2) {
                    uy3.e.f(e2, "completeUpdate(%s)", (String) this.d);
                    taskCompletionSource2.trySetException(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((az3) this.e).f) {
                    az3 az3Var = (az3) this.e;
                    TaskCompletionSource taskCompletionSource3 = this.c;
                    az3Var.e.add(taskCompletionSource3);
                    taskCompletionSource3.getTask().addOnCompleteListener(new oy3(az3Var, taskCompletionSource3, 0));
                    if (((az3) this.e).k.getAndIncrement() > 0) {
                        ((az3) this.e).f370b.g("Already connected to the service.", new Object[0]);
                    }
                    az3.b((az3) this.e, (ny3) this.d);
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly3(uy3 uy3Var, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f3207b = 0;
        this.e = uy3Var;
        this.d = str;
        this.c = taskCompletionSource2;
    }
}
