package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzejy implements zzeew {
    private final zzelc zza;
    private final zzdqj zzb;

    public zzejy(zzelc zzelcVar, zzdqj zzdqjVar) {
        this.zza = zzelcVar;
        this.zzb = zzdqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeew
    public final zzeex zza(String str, JSONObject jSONObject) throws zzfds {
        zzbqv zzbqvVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbC)).booleanValue()) {
            try {
                zzbqvVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                zzcat.zzh("Coundn't create RTB adapter: ", e);
                zzbqvVar = null;
            }
        } else {
            zzbqvVar = this.zza.zza(str);
        }
        if (zzbqvVar == null) {
            return null;
        }
        return new zzeex(zzbqvVar, new zzegq(), str);
    }
}
