package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzle implements Runnable {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzcv zzc;
    private final /* synthetic */ zzkp zzd;

    public zzle(zzkp zzkpVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.zzd = zzkpVar;
        this.zza = zzbgVar;
        this.zzb = str;
        this.zzc = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        try {
            zzfkVar = this.zzd.zzb;
            if (zzfkVar == null) {
                this.zzd.zzj().zzg().zza("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] zza = zzfkVar.zza(this.zza, this.zzb);
            this.zzd.zzal();
            this.zzd.zzq().zza(this.zzc, zza);
        } catch (RemoteException e) {
            this.zzd.zzj().zzg().zza("Failed to send event to the service to bundle", e);
        } finally {
            this.zzd.zzq().zza(this.zzc, (byte[]) null);
        }
    }
}
