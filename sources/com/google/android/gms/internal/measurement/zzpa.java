package com.google.android.gms.internal.measurement;

import defpackage.g33;
import defpackage.j33;

/* loaded from: classes.dex */
public final class zzpa implements g33 {
    private static zzpa zza = new zzpa();
    private final g33 zzb = new j33(new zzpc());

    public static double zza() {
        return ((zzpd) zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpd) zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpd) zza.get()).zzc();
    }

    public static String zzd() {
        return ((zzpd) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpd) zza.get()).zze();
    }

    @Override // defpackage.g33
    public final /* synthetic */ Object get() {
        return (zzpd) this.zzb.get();
    }
}
