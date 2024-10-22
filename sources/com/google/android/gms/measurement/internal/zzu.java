package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class zzu {
    private final zzhf zza;

    public zzu(zzhf zzhfVar) {
        this.zza = zzhfVar;
    }

    private final boolean zzc() {
        if (this.zza.zzn().zzs.zza() > 0) {
            return true;
        }
        return false;
    }

    private final boolean zzd() {
        if (!zzc() || this.zza.zzb().currentTimeMillis() - this.zza.zzn().zzs.zza() <= this.zza.zzf().zzc(null, zzbi.zzas)) {
            return false;
        }
        return true;
    }

    public final void zza(String str, Bundle bundle) {
        String str2;
        this.zza.zzl().zzt();
        if (this.zza.zzac()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.zzn().zzr.zza(str2);
        this.zza.zzn().zzs.zza(this.zza.zzb().currentTimeMillis());
    }

    public final void zzb() {
        if (zzc() && zzd()) {
            this.zza.zzn().zzr.zza(null);
        }
    }

    public final void zza() {
        this.zza.zzl().zzt();
        if (zzc()) {
            if (zzd()) {
                this.zza.zzn().zzr.zza(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.zza.zzp().zzc("auto", "_cmpx", bundle);
            } else {
                String zza = this.zza.zzn().zzr.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzj().zzm().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = ((this.zza.zzn().zzs.zza() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", zza2);
                    Object obj = pair.first;
                    this.zza.zzp().zzc(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.zza.zzn().zzr.zza(null);
            }
            this.zza.zzn().zzs.zza(0L);
        }
    }
}
