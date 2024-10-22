package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbcm {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdn.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbdy.zza);
        zzc(arrayList, zzbdy.zzb);
        zzc(arrayList, zzbdy.zzc);
        zzc(arrayList, zzbdy.zzd);
        zzc(arrayList, zzbdy.zze);
        zzc(arrayList, zzbdy.zzu);
        zzc(arrayList, zzbdy.zzf);
        zzc(arrayList, zzbdy.zzm);
        zzc(arrayList, zzbdy.zzn);
        zzc(arrayList, zzbdy.zzo);
        zzc(arrayList, zzbdy.zzp);
        zzc(arrayList, zzbdy.zzq);
        zzc(arrayList, zzbdy.zzr);
        zzc(arrayList, zzbdy.zzs);
        zzc(arrayList, zzbdy.zzt);
        zzc(arrayList, zzbdy.zzg);
        zzc(arrayList, zzbdy.zzh);
        zzc(arrayList, zzbdy.zzi);
        zzc(arrayList, zzbdy.zzj);
        zzc(arrayList, zzbdy.zzk);
        zzc(arrayList, zzbdy.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbem.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbdn zzbdnVar) {
        String str = (String) zzbdnVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
