package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdu extends zzdr {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[ADDED_TO_REGION, LOOP:6: B:43:0x00e9->B:44:0x00eb, LOOP_START, PHI: r0
  0x00e9: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:14:0x003e, B:44:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdu.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdo zzi(zzdo zzdoVar) throws zzdp {
        int i = zzdoVar.zzd;
        if (i != 3) {
            if (i != 2) {
                if (i != 268435456 && i != 536870912 && i != 1342177280 && i != 805306368 && i != 1610612736 && i != 4) {
                    throw new zzdp("Unhandled input format:", zzdoVar);
                }
            } else {
                return zzdo.zza;
            }
        }
        return new zzdo(zzdoVar.zzb, zzdoVar.zzc, 2);
    }
}
