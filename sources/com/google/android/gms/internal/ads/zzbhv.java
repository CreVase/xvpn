package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbhv extends zzbgy {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbhv(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        AdListener adListener;
        if (zzbuVar != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbuVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                    com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzi();
                    if (zzgVar != null) {
                        adListener = zzgVar.zzb();
                    } else {
                        adListener = null;
                    }
                    adManagerAdView.setAdListener(adListener);
                }
            } catch (RemoteException e) {
                zzcat.zzh("", e);
            }
            try {
                if (zzbuVar.zzj() instanceof zzavk) {
                    zzavk zzavkVar = (zzavk) zzbuVar.zzj();
                    if (zzavkVar != null) {
                        appEventListener = zzavkVar.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzcat.zzh("", e2);
            }
            zzcam.zza.post(new zzbhu(this, adManagerAdView, zzbuVar));
        }
    }
}
