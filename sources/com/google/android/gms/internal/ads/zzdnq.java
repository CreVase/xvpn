package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.kg;
import defpackage.uu2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdnq extends zzbgh {
    private final Context zza;
    private final zzdjj zzb;
    private zzdkj zzc;
    private zzdje zzd;

    public zzdnq(Context context, zzdjj zzdjjVar, zzdkj zzdkjVar, zzdje zzdjeVar) {
        this.zza = context;
        this.zzb = zzdjjVar;
        this.zzc = zzdkjVar;
        this.zzd = zzdjeVar;
    }

    private final zzbfb zzd(String str) {
        return new zzdnp(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzbfl zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzbfo zzg(String str) {
        return (zzbfo) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final List zzk() {
        try {
            uu2 zzh = this.zzb.zzh();
            uu2 zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.c + zzi.c];
            int i = 0;
            for (int i2 = 0; i2 < zzh.c; i2++) {
                strArr[i] = (String) zzh.i(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzi.c; i3++) {
                strArr[i] = (String) zzi.i(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzl() {
        zzdje zzdjeVar = this.zzd;
        if (zzdjeVar != null) {
            zzdjeVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (zzC != "Google" && (zzC == null || !zzC.equals("Google"))) {
                if (TextUtils.isEmpty(zzC)) {
                    zzcat.zzj("Not starting OMID session. OM partner name has not been configured.");
                    return;
                }
                zzdje zzdjeVar = this.zzd;
                if (zzdjeVar != null) {
                    zzdjeVar.zzf(zzC, false);
                    return;
                }
                return;
            }
            zzcat.zzj("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzn(String str) {
        zzdje zzdjeVar = this.zzd;
        if (zzdjeVar != null) {
            zzdjeVar.zzD(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzo() {
        zzdje zzdjeVar = this.zzd;
        if (zzdjeVar != null) {
            zzdjeVar.zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdje zzdjeVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdjeVar = this.zzd) != null) {
            zzdjeVar.zzH((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzq() {
        zzdje zzdjeVar = this.zzd;
        if ((zzdjeVar != null && !zzdjeVar.zzU()) || this.zzb.zzr() == null || this.zzb.zzs() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdkj zzdkjVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdkjVar = this.zzc) == null || !zzdkjVar.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzq().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdkj zzdkjVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdkjVar = this.zzc) == null || !zzdkjVar.zzg((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzs().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzt() {
        zzfkc zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzi(zzu);
            if (this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new kg());
                return true;
            }
            return true;
        }
        zzcat.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
