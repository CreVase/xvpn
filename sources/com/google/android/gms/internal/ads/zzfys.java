package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzfys extends zzfyy {
    private static final Logger zza = Logger.getLogger(zzfys.class.getName());
    private zzfvn zzb;
    private final boolean zzc;
    private final boolean zze;

    public zzfys(zzfvn zzfvnVar, boolean z, boolean z2) {
        super(zzfvnVar.size());
        this.zzb = zzfvnVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzfzt.zzp(future));
        } catch (Error e) {
            e = e;
            zzI(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzI(e);
        } catch (ExecutionException e3) {
            zzI(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(zzfvn zzfvnVar) {
        boolean z;
        int zzA = zzA();
        int i = 0;
        if (zzA >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfsw.zzj(z, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfvnVar != null) {
                zzfxs it = zzfvnVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        zzfvn zzfvnVar = this.zzb;
        if (zzfvnVar != null) {
            return "futures=".concat(zzfvnVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzb() {
        zzfvn zzfvnVar = this.zzb;
        boolean z = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzfvnVar == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean zzt = zzt();
            zzfxs it = zzfvnVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final void zze(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzl = zzl();
            zzl.getClass();
            zzK(set, zzl);
        }
    }

    public abstract void zzf(int i, Object obj);

    public abstract void zzu();

    public final void zzv() {
        final zzfvn zzfvnVar;
        zzfvn zzfvnVar2 = this.zzb;
        zzfvnVar2.getClass();
        if (zzfvnVar2.isEmpty()) {
            zzu();
            return;
        }
        if (this.zzc) {
            zzfxs it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ml1 ml1Var = (ml1) it.next();
                ml1Var.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfys.this.zzw(ml1Var, i);
                    }
                }, zzfzh.INSTANCE);
                i++;
            }
            return;
        }
        if (this.zze) {
            zzfvnVar = this.zzb;
        } else {
            zzfvnVar = null;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfyr
            @Override // java.lang.Runnable
            public final void run() {
                zzfys.this.zzx(zzfvnVar);
            }
        };
        zzfxs it2 = this.zzb.iterator();
        while (it2.hasNext()) {
            ((ml1) it2.next()).addListener(runnable, zzfzh.INSTANCE);
        }
    }

    public final /* synthetic */ void zzw(ml1 ml1Var, int i) {
        try {
            if (ml1Var.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, ml1Var);
            }
        } finally {
            zzx(null);
        }
    }

    public void zzy(int i) {
        this.zzb = null;
    }
}
