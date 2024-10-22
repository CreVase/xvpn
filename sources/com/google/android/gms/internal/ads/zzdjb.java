package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdjb implements zzauw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdje zzb;

    public zzdjb(zzdje zzdjeVar, String str) {
        this.zzb = zzdjeVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzbt(zzauv zzauvVar) {
        Map map;
        zzdlf zzdlfVar;
        zzdlf zzdlfVar2;
        zzdlf zzdlfVar3;
        zzdlf zzdlfVar4;
        Map map2;
        zzdlf zzdlfVar5;
        zzdlf zzdlfVar6;
        zzdlf zzdlfVar7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbH)).booleanValue()) {
            synchronized (this) {
                if (zzauvVar.zzj) {
                    zzdje zzdjeVar = this.zzb;
                    zzdlfVar4 = zzdjeVar.zzo;
                    if (zzdlfVar4 != null) {
                        map2 = zzdjeVar.zzy;
                        map2.put(this.zza, Boolean.TRUE);
                        zzdje zzdjeVar2 = this.zzb;
                        zzdlfVar5 = zzdjeVar2.zzo;
                        View zzf = zzdlfVar5.zzf();
                        zzdlfVar6 = this.zzb.zzo;
                        Map zzl = zzdlfVar6.zzl();
                        zzdlfVar7 = this.zzb.zzo;
                        zzdjeVar2.zzz(zzf, zzl, zzdlfVar7.zzm(), true);
                    } else {
                        return;
                    }
                }
                return;
            }
        }
        if (zzauvVar.zzj) {
            zzdje zzdjeVar3 = this.zzb;
            String str = this.zza;
            map = zzdjeVar3.zzy;
            map.put(str, Boolean.TRUE);
            zzdje zzdjeVar4 = this.zzb;
            zzdlfVar = zzdjeVar4.zzo;
            View zzf2 = zzdlfVar.zzf();
            zzdlfVar2 = this.zzb.zzo;
            Map zzl2 = zzdlfVar2.zzl();
            zzdlfVar3 = this.zzb.zzo;
            zzdjeVar4.zzz(zzf2, zzl2, zzdlfVar3.zzm(), true);
        }
    }
}
