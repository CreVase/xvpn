package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzt extends zzmo {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzv> zzc;
    private Long zzd;
    private Long zze;

    public zzt(zzmp zzmpVar) {
        super(zzmpVar);
    }

    private final zzv zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzv zzvVar = new zzv(this, this.zza);
        this.zzc.put(num, zzvVar);
        return zzvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfi.zzc> zza(java.lang.String r48, java.util.List<com.google.android.gms.internal.measurement.zzfi.zze> r49, java.util.List<com.google.android.gms.internal.measurement.zzfi.zzn> r50, java.lang.Long r51, java.lang.Long r52) {
        /*
            Method dump skipped, instructions count: 1771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    private final boolean zza(int i, int i2) {
        zzv zzvVar = this.zzc.get(Integer.valueOf(i));
        if (zzvVar == null) {
            return false;
        }
        return zzv.zza(zzvVar).get(i2);
    }
}
