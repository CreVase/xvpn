package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.ml1;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfjd {
    public static void zza(ml1 ml1Var, zzfje zzfjeVar, zzfit zzfitVar) {
        zzg(ml1Var, zzfjeVar, zzfitVar, false);
    }

    public static void zzb(ml1 ml1Var, zzfje zzfjeVar, zzfit zzfitVar) {
        zzg(ml1Var, zzfjeVar, zzfitVar, true);
    }

    public static void zzc(ml1 ml1Var, zzfje zzfjeVar, zzfit zzfitVar) {
        if (!((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            return;
        }
        zzfzt.zzr(zzfzk.zzu(ml1Var), new zzfjc(zzfjeVar, zzfitVar), zzcbg.zzf);
    }

    public static void zzd(ml1 ml1Var, zzfit zzfitVar) {
        if (!((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            return;
        }
        zzfzt.zzr(zzfzk.zzu(ml1Var), new zzfja(zzfitVar), zzcbg.zzf);
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziz), str);
    }

    public static int zzf(zzfdn zzfdnVar) {
        int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfdnVar) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    private static void zzg(ml1 ml1Var, zzfje zzfjeVar, zzfit zzfitVar, boolean z) {
        if (!((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            return;
        }
        zzfzt.zzr(zzfzk.zzu(ml1Var), new zzfjb(zzfjeVar, zzfitVar, z), zzcbg.zzf);
    }
}
