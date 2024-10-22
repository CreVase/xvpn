package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.zza;

/* loaded from: classes2.dex */
public final /* synthetic */ class tf implements wc1 {
    public final void a(zza zzaVar) {
        if (zzaVar.f1572a == 11) {
            xx3 xx3Var = uf.c;
            if (xx3Var == null) {
                xx3Var = null;
            }
            String packageName = xx3Var.c.getPackageName();
            uy3 uy3Var = xx3Var.f5243a;
            az3 az3Var = uy3Var.f4760a;
            if (az3Var == null) {
                uy3.c();
                return;
            }
            uy3.e.g("completeUpdate(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            az3Var.a().post(new ly3(az3Var, taskCompletionSource, taskCompletionSource, new ly3(uy3Var, taskCompletionSource, taskCompletionSource, packageName, 1), 2));
            taskCompletionSource.getTask();
        }
    }
}
