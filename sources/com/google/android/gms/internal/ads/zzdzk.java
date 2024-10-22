package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdzk {
    private final zzgad zza;
    private final zzgad zzb;
    private final zzeac zzc;

    public zzdzk(zzgad zzgadVar, zzgad zzgadVar2, zzeac zzeacVar) {
        this.zza = zzgadVar;
        this.zzb = zzgadVar2;
        this.zzc = zzeacVar;
    }

    public final /* synthetic */ ml1 zza(zzbuk zzbukVar) throws Exception {
        return this.zzc.zza(zzbukVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkA)).longValue());
    }

    public final ml1 zzb(final zzbuk zzbukVar) {
        ml1 zzf;
        String str = zzbukVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzfzt.zzg(new zzdyo(1, "Ads signal service force local"));
        } else {
            zzf = zzfzt.zzf(zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzdzg
                @Override // com.google.android.gms.internal.ads.zzfyz
                public final ml1 zza() {
                    return zzdzk.this.zza(zzbukVar);
                }
            }, this.zza), ExecutionException.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzh
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzfzt.zzg(th);
                }
            }, this.zzb);
        }
        return zzfzt.zzn(zzfzt.zzf(zzfzk.zzu(zzf), zzdyo.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(null);
            }
        }, this.zzb), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzj
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzfzt.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzM(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzfzt.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
