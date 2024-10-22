package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class zzffw {
    private final zzffa zza;
    private final zzffu zzb;
    private final zzfew zzc;
    private zzfgc zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzffw(zzffa zzffaVar, zzfew zzfewVar, zzffu zzffuVar) {
        this.zza = zzffaVar;
        this.zzc = zzfewVar;
        this.zzb = zzffuVar;
        zzfewVar.zzb(new zzffr(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgl)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzffv zzffvVar = (zzffv) this.zzd.pollFirst();
                if (zzffvVar == null || (zzffvVar.zza() != null && this.zza.zze(zzffvVar.zza()))) {
                    zzfgc zzfgcVar = new zzfgc(this.zza, this.zzb, zzffvVar);
                    this.zze = zzfgcVar;
                    zzfgcVar.zzd(new zzffs(this, zzffvVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized ml1 zza(zzffv zzffvVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzffvVar);
    }

    public final synchronized void zze(zzffv zzffvVar) {
        this.zzd.add(zzffvVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
