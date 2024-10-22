package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzcai;

/* loaded from: classes.dex */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzemVar) {
        this.zza = zzemVar;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    private static void zza(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdx zza;
        zzbci.zza(context);
        if (((Boolean) zzbdz.zzk.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdx zza2;
                        AdRequest adRequest2 = adRequest;
                        if (adRequest2 == null) {
                            zza2 = null;
                        } else {
                            zza2 = adRequest2.zza();
                        }
                        QueryInfoGenerationCallback queryInfoGenerationCallback2 = queryInfoGenerationCallback;
                        String str2 = str;
                        new zzbtm(context, adFormat, zza2, str2).zzb(queryInfoGenerationCallback2);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            zza = null;
        } else {
            zza = adRequest.zza();
        }
        new zzbtm(context, adFormat, zza, str).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
