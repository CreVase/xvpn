package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdkn implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdoi zzd;
    private final Clock zze;
    private zzbhi zzf;
    private zzbjj zzg;

    public zzdkn(zzdoi zzdoiVar, Clock clock) {
        this.zzd = zzdoiVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (this.zza != null && this.zzb != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(FacebookMediationAdapter.KEY_ID, this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbhi zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbhi zzbhiVar) {
        this.zzf = zzbhiVar;
        zzbjj zzbjjVar = this.zzg;
        if (zzbjjVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbjjVar);
        }
        zzbjj zzbjjVar2 = new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdkn zzdknVar = zzdkn.this;
                try {
                    zzdknVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzcat.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhi zzbhiVar2 = zzbhiVar;
                zzdknVar.zza = (String) map.get(FacebookMediationAdapter.KEY_ID);
                String str = (String) map.get("asset_id");
                if (zzbhiVar2 == null) {
                    zzcat.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbhiVar2.zzf(str);
                } catch (RemoteException e) {
                    zzcat.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbjjVar2;
        this.zzd.zzi("/unconfirmedClick", zzbjjVar2);
    }
}
