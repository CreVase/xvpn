package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzfeu implements zzcxo {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcag zzc;

    public zzfeu(Context context, zzcag zzcagVar) {
        this.zzb = context;
        this.zzc = zzcagVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final synchronized void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
