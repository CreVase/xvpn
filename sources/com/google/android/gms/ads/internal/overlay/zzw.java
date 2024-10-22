package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzfqo;
import com.google.android.gms.internal.ads.zzfqp;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfra;
import com.google.android.gms.internal.ads.zzfrc;
import com.google.android.gms.internal.ads.zzfrd;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrz;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzw {
    private zzfrd zzf;
    private zzcgb zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfqq zzd = null;
    private String zzb = null;

    private final zzfrf zzl() {
        zzfre zzc = zzfrf.zzc();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzc.zza(this.zzb);
        } else {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcgb zzcgbVar, Context context) {
        this.zzc = zzcgbVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfqq zzfqqVar;
        if (this.zze && (zzfqqVar = this.zzd) != null) {
            zzfqqVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final void zzc() {
        zzfqq zzfqqVar;
        if (this.zze && (zzfqqVar = this.zzd) != null) {
            zzfqo zzc = zzfqp.zzc();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
                zzc.zza(this.zzb);
            } else {
                String str = this.zza;
                if (str != null) {
                    zzc.zzb(str);
                } else {
                    zzf("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzfqqVar.zzb(zzc.zzc(), this.zzf);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    public final void zze(final String str, final Map map) {
        zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.zzh(str, map);
            }
        });
    }

    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfqq zzfqqVar;
        if (this.zze && (zzfqqVar = this.zzd) != null) {
            zzfqqVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcgb zzcgbVar = this.zzc;
        if (zzcgbVar != null) {
            zzcgbVar.zzd(str, map);
        }
    }

    public final void zzi(zzfrc zzfrcVar) {
        if (!TextUtils.isEmpty(zzfrcVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue()) {
                this.zza = zzfrcVar.zzb();
            }
        }
        switch (zzfrcVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put(MRAIDPresenter.ERROR, String.valueOf(zzfrcVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(zzcgb zzcgbVar, zzfra zzfraVar) {
        if (zzcgbVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcgbVar;
        if (!this.zze && !zzk(zzcgbVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue()) {
            this.zzb = zzfraVar.zzg();
        }
        zzm();
        zzfqq zzfqqVar = this.zzd;
        if (zzfqqVar != null) {
            zzfqqVar.zzd(zzfraVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfrz.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfqr.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
