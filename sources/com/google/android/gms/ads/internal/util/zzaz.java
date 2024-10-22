package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzamc;
import com.google.android.gms.internal.ads.zzamg;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzamv;
import com.google.android.gms.internal.ads.zzanc;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcam;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzaz extends zzamv {
    private final Context zzc;

    private zzaz(Context context, zzamu zzamuVar) {
        super(zzamuVar);
        this.zzc = context;
    }

    public static zzamj zzb(Context context) {
        zzamj zzamjVar = new zzamj(new zzanc(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaz(context, new zzang()), 4);
        zzamjVar.zzd();
        return zzamjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv, com.google.android.gms.internal.ads.zzalz
    public final zzamc zza(zzamg zzamgVar) throws zzamp {
        if (zzamgVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeo), zzamgVar.zzk())) {
                Context context = this.zzc;
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzcam.zzs(context, 13400000)) {
                    zzamc zza = new zzblf(this.zzc).zza(zzamgVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzamgVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzamgVar.zzk())));
                }
            }
        }
        return super.zza(zzamgVar);
    }
}
