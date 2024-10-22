package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;

/* loaded from: classes.dex */
final class zzyv {
    private final Context zza;
    private final zzdi zzb;
    private final zzaaf zzc;
    private zzyu zzd;
    private List zze;
    private zzzj zzf;
    private boolean zzg;

    public zzyv(Context context, zzdi zzdiVar, zzaaf zzaafVar) {
        this.zza = context;
        this.zzb = zzdiVar;
        this.zzc = zzaafVar;
    }

    public final zzaah zza() {
        zzyu zzyuVar = this.zzd;
        zzdx.zzb(zzyuVar);
        return zzyuVar;
    }

    public final void zzb() {
        zzdx.zzb(this.zzd);
        throw null;
    }

    public final void zzc(zzam zzamVar) throws zzaag {
        boolean z = false;
        if (!this.zzg && this.zzd == null) {
            z = true;
        }
        zzdx.zzf(z);
        zzdx.zzb(this.zze);
        try {
            zzyu zzyuVar = new zzyu(this.zza, this.zzb, this.zzc, zzamVar);
            this.zzd = zzyuVar;
            zzzj zzzjVar = this.zzf;
            if (zzzjVar != null) {
                zzyuVar.zze(zzzjVar);
            }
        } catch (zzdh e) {
            throw new zzaag(e, zzamVar);
        }
    }

    public final void zzd() {
        if (this.zzg) {
            return;
        }
        if (this.zzd == null) {
            this.zzg = true;
            return;
        }
        throw null;
    }

    public final void zze(Surface surface, zzfc zzfcVar) {
        zzyu zzyuVar = this.zzd;
        zzdx.zzb(zzyuVar);
        zzyuVar.zzc(surface, zzfcVar);
    }

    public final void zzf(long j) {
        zzdx.zzb(this.zzd);
    }

    public final void zzg(List list) {
        this.zze = list;
        if (zzi()) {
            zzyu zzyuVar = this.zzd;
            zzdx.zzb(zzyuVar);
            zzyuVar.zzd(list);
        }
    }

    public final void zzh(zzzj zzzjVar) {
        this.zzf = zzzjVar;
        if (zzi()) {
            zzyu zzyuVar = this.zzd;
            zzdx.zzb(zzyuVar);
            zzyuVar.zze(zzzjVar);
        }
    }

    public final boolean zzi() {
        return this.zzd != null;
    }
}
