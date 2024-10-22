package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeim implements zzfzp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcv zzb;
    final /* synthetic */ zzfcr zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjt zze;
    final /* synthetic */ zzfde zzf;
    final /* synthetic */ zzeio zzg;

    public zzeim(zzeio zzeioVar, long j, zzfcv zzfcvVar, zzfcr zzfcrVar, String str, zzfjt zzfjtVar, zzfde zzfdeVar) {
        this.zzg = zzeioVar;
        this.zza = j;
        this.zzb = zzfcvVar;
        this.zzc = zzfcrVar;
        this.zzd = str;
        this.zze = zzfjtVar;
        this.zzf = zzfdeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzfzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeim.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        boolean z2;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzeez zzeezVar;
        LinkedHashMap linkedHashMap2;
        zzeip zzeipVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzeio zzeioVar = this.zzg;
            z = zzeioVar.zze;
            if (z) {
                zzeipVar = zzeioVar.zzb;
                zzeipVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            zzeio zzeioVar2 = this.zzg;
            z2 = zzeioVar2.zzg;
            if (!z2) {
                zzq = zzeioVar2.zzq(this.zzc);
                if (zzq) {
                    linkedHashMap2 = this.zzg.zzd;
                    ((zzein) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
                } else {
                    linkedHashMap = this.zzg.zzd;
                    zzfcr zzfcrVar = this.zzc;
                    linkedHashMap.put(zzfcrVar, new zzein(this.zzd, zzfcrVar.zzah, 0, elapsedRealtime, null));
                }
                zzeezVar = this.zzg.zzf;
                zzeezVar.zzg(this.zzc, elapsedRealtime, null);
            }
        }
    }
}
