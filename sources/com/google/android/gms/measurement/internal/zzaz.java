package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.hx2;
import defpackage.p71;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzaz {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final zzbb zze;
    private final String zzf;

    public zzaz(zzhf zzhfVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbb zzbbVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = TextUtils.isEmpty(str) ? null : str;
        this.zzc = j;
        this.zzd = j2;
        if (j2 != 0 && j2 > j) {
            zzhfVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId", zzfr.zza(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhfVar.zzj().zzg().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzb = zzhfVar.zzt().zzb(next, bundle2.get(next));
                    if (zzb == null) {
                        zzhfVar.zzj().zzu().zza("Param value can't be null", zzhfVar.zzk().zzb(next));
                        it.remove();
                    } else {
                        zzhfVar.zzt().zza(bundle2, next, zzb);
                    }
                }
            }
            zzbbVar = new zzbb(bundle2);
        } else {
            zzbbVar = new zzbb(new Bundle());
        }
        this.zze = zzbbVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return hx2.s(p71.q("Event{appId='", str, "', name='", str2, "', params="), String.valueOf(this.zze), "}");
    }

    public final zzaz zza(zzhf zzhfVar, long j) {
        return new zzaz(zzhfVar, this.zzf, this.zza, this.zzb, this.zzc, j, this.zze);
    }

    private zzaz(zzhf zzhfVar, String str, String str2, String str3, long j, long j2, zzbb zzbbVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbbVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = TextUtils.isEmpty(str) ? null : str;
        this.zzc = j;
        this.zzd = j2;
        if (j2 != 0 && j2 > j) {
            zzhfVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId, name", zzfr.zza(str2), zzfr.zza(str3));
        }
        this.zze = zzbbVar;
    }
}
