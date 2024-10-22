package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcob implements zzcnl {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzcob(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
            boolean parseBoolean = Boolean.parseBoolean(str);
            zzgVar.zzH(parseBoolean);
            if (parseBoolean) {
                Context context = this.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgf)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    zzfpw zzj = zzfpw.zzj(context);
                    zzfpx zzi = zzfpx.zzi(context);
                    zzj.zzk();
                    zzj.zzl();
                    zzi.zzj();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcM)).booleanValue()) {
                        zzi.zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcN)).booleanValue()) {
                        zzi.zzl();
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "clearStorageOnIdlessMode");
                }
            }
        }
        map.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
    }
}
