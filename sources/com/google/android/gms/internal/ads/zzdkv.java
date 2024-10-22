package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdkv {
    private final zzdpt zza;
    private final zzdoi zzb;
    private final zzcqb zzc;
    private final zzdjr zzd;

    public zzdkv(zzdpt zzdptVar, zzdoi zzdoiVar, zzcqb zzcqbVar, zzdjr zzdjrVar) {
        this.zza = zzdptVar;
        this.zzb = zzdoiVar;
        this.zzc = zzcqbVar;
        this.zzd = zzdjrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcgm {
        zzcgb zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzad("/sendMessageToSdk", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdkv.this.zzb((zzcgb) obj, map);
            }
        });
        zza.zzad("/adMuted", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdkv.this.zzc((zzcgb) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, final Map map) {
                zzcgb zzcgbVar = (zzcgb) obj;
                zzcho zzN = zzcgbVar.zzN();
                final zzdkv zzdkvVar = zzdkv.this;
                zzN.zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdkp
                    @Override // com.google.android.gms.internal.ads.zzchm
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdkv.this.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcgbVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcgbVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdkv.this.zze((zzcgb) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdku
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdkv.this.zzf((zzcgb) obj, map);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcgb zzcgbVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcgb zzcgbVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(zzcgb zzcgbVar, Map map) {
        zzcat.zzi("Showing native ads overlay.");
        zzcgbVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcgb zzcgbVar, Map map) {
        zzcat.zzi("Hiding native ads overlay.");
        zzcgbVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
