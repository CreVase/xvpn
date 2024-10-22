package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbsa extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsa(zzbfg zzbfgVar) {
        zzbfo zzbfoVar;
        try {
            this.zzb = zzbfgVar.zzg();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfgVar.zzh()) {
                if (obj instanceof IBinder) {
                    zzbfoVar = zzbfn.zzg((IBinder) obj);
                } else {
                    zzbfoVar = null;
                }
                if (zzbfoVar != null) {
                    this.zza.add(new zzbsc(zzbfoVar));
                }
            }
        } catch (RemoteException e2) {
            zzcat.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
