package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzawh implements Comparator {
    public zzawh(zzawi zzawiVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzavw zzavwVar = (zzavw) obj;
        zzavw zzavwVar2 = (zzavw) obj2;
        if (zzavwVar.zzd() < zzavwVar2.zzd()) {
            return -1;
        }
        if (zzavwVar.zzd() <= zzavwVar2.zzd()) {
            if (zzavwVar.zzb() < zzavwVar2.zzb()) {
                return -1;
            }
            if (zzavwVar.zzb() <= zzavwVar2.zzb()) {
                float zza = (zzavwVar.zza() - zzavwVar.zzd()) * (zzavwVar.zzc() - zzavwVar.zzb());
                float zza2 = (zzavwVar2.zza() - zzavwVar2.zzd()) * (zzavwVar2.zzc() - zzavwVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
