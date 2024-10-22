package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes2.dex */
final class zzgu implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzgp zza;

    public zzgu(zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z, boolean z2) {
        zzft zzc;
        int i = zzgw.zza[zzsVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        zzc = this.zza.zzj().zzn();
                    } else {
                        zzc = this.zza.zzj().zzp();
                    }
                } else if (z) {
                    zzc = this.zza.zzj().zzw();
                } else if (!z2) {
                    zzc = this.zza.zzj().zzv();
                } else {
                    zzc = this.zza.zzj().zzu();
                }
            } else if (z) {
                zzc = this.zza.zzj().zzm();
            } else if (!z2) {
                zzc = this.zza.zzj().zzh();
            } else {
                zzc = this.zza.zzj().zzg();
            }
        } else {
            zzc = this.zza.zzj().zzc();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    zzc.zza(str);
                    return;
                } else {
                    zzc.zza(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            zzc.zza(str, list.get(0), list.get(1));
            return;
        }
        zzc.zza(str, list.get(0));
    }
}
