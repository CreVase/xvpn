package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.ml1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzfyp extends zzfzj implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ml1 zza;
    Object zzb;

    public zzfyp(ml1 ml1Var, Object obj) {
        ml1Var.getClass();
        this.zza = ml1Var;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ml1 ml1Var = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (ml1Var == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.zza = null;
        if (ml1Var.isCancelled()) {
            zzs(ml1Var);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzfzt.zzp(ml1Var));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzgak.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zzd(e2);
        } catch (ExecutionException e3) {
            zzd(e3.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        String str;
        ml1 ml1Var = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (ml1Var != null) {
            str = hx2.q("inputFuture=[", ml1Var.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
