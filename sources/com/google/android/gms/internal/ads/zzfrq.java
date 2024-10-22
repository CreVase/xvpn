package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfrq extends zzfrm {
    final /* synthetic */ zzfrw zza;

    public zzfrq(zzfrw zzfrwVar) {
        this.zza = zzfrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfrl zzfrlVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfrl zzfrlVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzfrlVar2 = this.zza.zzc;
                    zzfrlVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfrw zzfrwVar = this.zza;
            iInterface = zzfrwVar.zzn;
            if (iInterface != null) {
                zzfrlVar = zzfrwVar.zzc;
                zzfrlVar.zzc("Unbind from service.", new Object[0]);
                zzfrw zzfrwVar2 = this.zza;
                context = zzfrwVar2.zzb;
                serviceConnection = zzfrwVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
