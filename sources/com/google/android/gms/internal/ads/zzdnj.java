package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzdnj extends zzblu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbez {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdje zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdnj(zzdje zzdjeVar, zzdjj zzdjjVar) {
        this.zza = zzdjjVar.zzf();
        this.zzb = zzdjjVar.zzj();
        this.zzc = zzdjeVar;
        if (zzdjjVar.zzs() != null) {
            zzdjjVar.zzs().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdje zzdjeVar = this.zzc;
        if (zzdjeVar != null && (view = this.zza) != null) {
            zzdjeVar.zzz(view, Collections.emptyMap(), Collections.emptyMap(), zzdje.zzV(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbly zzblyVar, int i) {
        try {
            zzblyVar.zze(i);
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcat.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final zzbfl zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcat.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdje zzdjeVar = this.zzc;
        if (zzdjeVar == null || zzdjeVar.zzc() == null) {
            return null;
        }
        return zzdjeVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdje zzdjeVar = this.zzc;
        if (zzdjeVar != null) {
            zzdjeVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdni(this));
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzf(IObjectWrapper iObjectWrapper, zzbly zzblyVar) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcat.zzg("Instream ad can not be shown after destroy().");
            zzi(zzblyVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                zzcat.zzg("Instream ad should not be used again.");
                zzi(zzblyVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcbt.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcbt.zzb(this.zza, this);
            zzg();
            try {
                zzblyVar.zzf();
                return;
            } catch (RemoteException e) {
                zzcat.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        zzcat.zzg("Instream internal error: ".concat(str));
        zzi(zzblyVar, 0);
    }
}
