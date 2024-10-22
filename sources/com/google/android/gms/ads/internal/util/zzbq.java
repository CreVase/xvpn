package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzanm;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbl;
import defpackage.ml1;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbq {
    private static zzamj zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbl zza = new zzbi();

    public zzbq(Context context) {
        zzamj zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbci.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzen)).booleanValue()) {
                        zza2 = zzaz.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzanm.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final ml1 zza(String str) {
        zzcbl zzcblVar = new zzcbl();
        zzb.zza(new zzbp(str, null, zzcblVar));
        return zzcblVar;
    }

    public final ml1 zzb(int i, String str, Map map, byte[] bArr) {
        zzbn zzbnVar = new zzbn(null);
        zzbj zzbjVar = new zzbj(this, str, zzbnVar);
        zzcas zzcasVar = new zzcas(null);
        zzbk zzbkVar = new zzbk(this, i, str, zzbnVar, zzbjVar, bArr, map, zzcasVar);
        if (zzcas.zzk()) {
            try {
                zzcasVar.zzd(str, "GET", zzbkVar.zzl(), zzbkVar.zzx());
            } catch (zzalo e) {
                zzcat.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbkVar);
        return zzbnVar;
    }
}
