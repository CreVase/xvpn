package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzbko {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbkk zzc;

    public zzbko(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbci.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjo)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjq)).intValue()) {
            zzcat.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzay.zza().zzl(this.zza, new zzbou(), this.zzb);
    }

    public final void zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjo)).booleanValue()) {
            return;
        }
        zzd();
        zzbkk zzbkkVar = this.zzc;
        if (zzbkkVar != null) {
            try {
                zzbkkVar.zze();
            } catch (RemoteException e) {
                zzcat.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbkk zzbkkVar = this.zzc;
        if (zzbkkVar == null) {
            return false;
        }
        try {
            zzbkkVar.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
