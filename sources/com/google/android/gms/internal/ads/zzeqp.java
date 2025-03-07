package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqp implements zzetw {
    private final Context zza;
    private final zzgad zzb;

    public zzeqp(Context context, zzgad zzgadVar) {
        this.zza = context;
        this.zzb = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzavv zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzg();
                Bundle bundle = null;
                if (zzg != null && (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() || !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzavl zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzw(zzj);
                        }
                        if (zzk != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzy(zzk);
                        }
                    } else {
                        zzj = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzj();
                        zzk = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                        if (zzk != null && !TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", zzk);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeqq(bundle);
            }
        });
    }
}
