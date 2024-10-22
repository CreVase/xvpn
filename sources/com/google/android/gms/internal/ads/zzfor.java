package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzfor {
    final /* synthetic */ zzfos zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfor(zzfos zzfosVar, byte[] bArr, zzfoq zzfoqVar) {
        this.zza = zzfosVar;
        this.zzb = bArr;
    }

    public final zzfor zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfor zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfos zzfosVar = this.zza;
            if (zzfosVar.zzb) {
                zzfosVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
