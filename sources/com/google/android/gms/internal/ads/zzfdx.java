package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfdx {
    private final zzfcr zza;
    private final zzfcv zzb;
    private final zzedo zzc;
    private final zzfjx zzd;
    private final zzfje zze;
    private final zzcou zzf;

    public zzfdx(zzedo zzedoVar, zzfjx zzfjxVar, zzfcr zzfcrVar, zzfcv zzfcvVar, zzcou zzcouVar, zzfje zzfjeVar) {
        this.zza = zzfcrVar;
        this.zzb = zzfcvVar;
        this.zzc = zzedoVar;
        this.zzd = zzfjxVar;
        this.zzf = zzcouVar;
        this.zze = zzfjeVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzedq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
        }
    }

    public final void zzc(List list, int i) {
        ml1 zzh;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzju)).booleanValue()) {
                zzh = this.zzf.zzc(str, com.google.android.gms.ads.internal.client.zzay.zze());
            } else {
                zzh = zzfzt.zzh(str);
            }
            zzfzt.zzr(zzh, new zzfdw(this, i), zzcbg.zza);
        }
    }
}
