package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzarg implements Runnable {
    final /* synthetic */ zzarh zza;

    public zzarg(zzarh zzarhVar) {
        this.zza = zzarhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfmq zzfmqVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (!z) {
                this.zza.zzp = true;
                try {
                    zzarh.zzj(this.zza);
                } catch (Exception e) {
                    zzfmqVar = this.zza.zzh;
                    zzfmqVar.zzc(2023, -1L, e);
                }
                obj2 = this.zza.zzo;
                synchronized (obj2) {
                    this.zza.zzp = false;
                }
            }
        }
    }
}
