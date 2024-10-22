package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdid implements zzbjj {
    private final WeakReference zza;

    public /* synthetic */ zzdid(zzdig zzdigVar, zzdic zzdicVar) {
        this.zza = new WeakReference(zzdigVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        zzcxj zzcxjVar;
        zzdfb zzdfbVar;
        zzdfb zzdfbVar2;
        zzdig zzdigVar = (zzdig) this.zza.get();
        if (zzdigVar == null) {
            return;
        }
        zzcxjVar = zzdigVar.zzh;
        zzcxjVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjU)).booleanValue()) {
            zzdfbVar = zzdigVar.zzi;
            zzdfbVar.zzbK();
            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                zzdfbVar2 = zzdigVar.zzi;
                zzdfbVar2.zzs();
            }
        }
    }
}
