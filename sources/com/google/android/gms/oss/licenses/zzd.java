package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes2.dex */
public final class zzd {
    private static zzd zza;
    private zzl zzb;
    private final Context zzc;

    private zzd(Context context) {
        this.zzc = context.getApplicationContext();
    }

    public static zzc zza(Context context, String str) {
        try {
            return new zzc(context.getPackageManager().getResourcesForApplication(str), str, null);
        } catch (PackageManager.NameNotFoundException unused) {
            return new zzc(context.getResources(), context.getPackageName(), null);
        }
    }

    public static zzd zzb(Context context) {
        if (zza == null) {
            zzd zzdVar = new zzd(context);
            zza = zzdVar;
            zzdVar.zzb = new zzl(zzdVar.zzc);
        }
        return zza;
    }

    public static final int zzd(zzc zzcVar) {
        return zzcVar.zza.getIdentifier("libraries_social_licenses_license", "layout", zzcVar.zzb);
    }

    public static final int zze(zzc zzcVar) {
        return zzcVar.zza.getIdentifier("license", FacebookMediationAdapter.KEY_ID, zzcVar.zzb);
    }

    public final zzl zzc() {
        return this.zzb;
    }
}
