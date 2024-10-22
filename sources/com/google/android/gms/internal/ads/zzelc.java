package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzelc {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqj zzb;

    public zzelc(zzdqj zzdqjVar) {
        this.zzb = zzdqjVar;
    }

    public final zzbqv zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbqv) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zzcat.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
