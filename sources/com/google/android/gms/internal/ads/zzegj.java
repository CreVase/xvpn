package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import defpackage.ml1;
import defpackage.wc0;
import defpackage.x50;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzegj implements zzeeu {
    private final Context zza;
    private final zzdgx zzb;
    private final Executor zzc;
    private final zzfcq zzd;

    public zzegj(Context context, Executor executor, zzdgx zzdgxVar, zzfcq zzfcqVar) {
        this.zza = context;
        this.zzb = zzdgxVar;
        this.zzc = executor;
        this.zzd = zzfcqVar;
    }

    private static String zzd(zzfcr zzfcrVar) {
        try {
            return zzfcrVar.zzx.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar) {
        final Uri uri;
        String zzd = zzd(zzfcrVar);
        if (zzd != null) {
            uri = Uri.parse(zzd);
        } else {
            uri = null;
        }
        return zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzegj.this.zzc(uri, zzfdeVar, zzfcrVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final boolean zzb(zzfde zzfdeVar, zzfcr zzfcrVar) {
        Context context = this.zza;
        if ((context instanceof Activity) && zzbdj.zzg(context) && !TextUtils.isEmpty(zzd(zzfcrVar))) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ ml1 zzc(Uri uri, zzfde zzfdeVar, zzfcr zzfcrVar, Object obj) throws Exception {
        try {
            x50 a2 = new wc0().a();
            ((Intent) a2.f5117b).setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc((Intent) a2.f5117b, null);
            final zzcbl zzcblVar = new zzcbl();
            zzdfx zze = this.zzb.zze(new zzctm(zzfdeVar, zzfcrVar, null), new zzdga(new zzdhf() { // from class: com.google.android.gms.internal.ads.zzegi
                @Override // com.google.android.gms.internal.ads.zzdhf
                public final void zza(boolean z, Context context, zzcxy zzcxyVar) {
                    zzcbl zzcblVar2 = zzcbl.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcblVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcblVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzcaz(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfzt.zzh(zze.zzg());
        } catch (Throwable th) {
            zzcat.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
