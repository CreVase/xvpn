package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdvu implements com.google.android.gms.ads.internal.overlay.zzo, zzchm {
    private final Context zza;
    private final zzcaz zzb;
    private zzdvm zzc;
    private zzcgb zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzda zzh;
    private boolean zzi;

    public zzdvu(Context context, zzcaz zzcazVar) {
        this.zza = context;
        this.zzb = zzcazVar;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
            zzcat.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzfeo.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            zzcat.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdaVar.zze(zzfeo.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziI)).intValue()) {
                return true;
            }
        }
        zzcat.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdaVar.zze(zzfeo.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzchm
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        zzcat.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                zzdaVar.zze(zzfeo.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcgb zzcgbVar = this.zzd;
        if (zzcgbVar != null && !zzcgbVar.zzaz()) {
            return this.zzd.zzi();
        }
        return null;
    }

    public final void zzh(zzdvm zzdvmVar) {
        this.zzc = zzdvmVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzbkc zzbkcVar, zzbjv zzbjvVar) {
        if (!zzl(zzdaVar)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzz();
            zzcgb zza = zzcgn.zza(this.zza, zzchq.zza(), "", false, false, null, null, this.zzb, null, null, null, zzaxv.zza(), null, null, null);
            this.zzd = zza;
            zzcho zzN = zza.zzN();
            if (zzN == null) {
                zzcat.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzdaVar.zze(zzfeo.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InspectorUi.openInspector 3");
                    return;
                }
            }
            this.zzh = zzdaVar;
            zzN.zzM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbkcVar, null, new zzbkb(this.zza), zzbjvVar, null);
            zzN.zzA(this);
            this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziG));
            com.google.android.gms.ads.internal.zzt.zzi();
            com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
            this.zzg = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        } catch (zzcgm e2) {
            zzcat.zzk("Failed to obtain a web view for the ad inspector", e2);
            try {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "InspectorUi.openInspector 0");
                zzdaVar.zze(zzfeo.zzd(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException e3) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "InspectorUi.openInspector 1");
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvt
                @Override // java.lang.Runnable
                public final void run() {
                    zzdvu.this.zzi(str);
                }
            });
        }
    }
}
