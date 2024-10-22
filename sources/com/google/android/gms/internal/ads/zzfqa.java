package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzfqa {
    public static ml1 zza(Task task) {
        final zzfpz zzfpzVar = new zzfpz(task);
        task.addOnCompleteListener(zzgaj.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfpy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfpz zzfpzVar2 = zzfpz.this;
                if (task2.isCanceled()) {
                    zzfpzVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfpzVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception != null) {
                    zzfpzVar2.zzd(exception);
                    return;
                }
                throw new IllegalStateException();
            }
        });
        return zzfpzVar;
    }
}
