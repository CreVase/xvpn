package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzcat;

/* loaded from: classes.dex */
public final class zzep implements MediaContent {
    private final zzbfl zza;
    private final VideoController zzb = new VideoController();
    private final zzbgi zzc;

    public zzep(zzbfl zzbflVar, zzbgi zzbgiVar) {
        this.zza = zzbflVar;
        this.zzc = zzbgiVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.unwrap(zzi);
            }
            return null;
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e) {
            zzcat.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final zzbgi zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
            return false;
        }
    }

    public final zzbfl zzc() {
        return this.zza;
    }
}
