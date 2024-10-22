package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzaua extends zzaud {
    private final View zzi;

    public zzaua(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, View view) {
        super(zzaspVar, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzaomVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdh);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzka);
            zzast zzastVar = new zzast((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaph zza = zzapi.zza();
            zza.zzb(zzastVar.zza.longValue());
            zza.zzd(zzastVar.zzb.longValue());
            zza.zze(zzastVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzastVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzastVar.zzd.longValue());
            }
            this.zze.zzY((zzapi) zza.zzal());
        }
    }
}
