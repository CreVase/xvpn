package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzbza {
    public static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            StringBuilder sb = new StringBuilder(str.substring(0, i));
            p71.A(sb, str2, "=", str3, "&");
            sb.append(str.substring(i));
            return Uri.parse(sb.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzt.zzn().zzu(context)) {
            return uri.toString();
        }
        String zza = com.google.android.gms.ads.internal.zzt.zzn().zza(context);
        if (zza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzae);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzad)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
            return zzd(uri2, context).replace(str, zza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
        com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
        return uri3;
    }

    public static String zzc(String str, Context context, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzal)).booleanValue() && !z) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(context) && !TextUtils.isEmpty(str)) {
            String zza = com.google.android.gms.ads.internal.zzt.zzn().zza(context);
            if (zza == null) {
                return str;
            }
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzae);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzad)).booleanValue() && str.contains(str2)) {
                if (com.google.android.gms.ads.internal.zzt.zzp().zzi(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
                    return zzd(str, context).replace(str2, zza);
                }
                if (com.google.android.gms.ads.internal.zzt.zzp().zzj(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzn(context, zza);
                    return zzd(str, context).replace(str2, zza);
                }
                return str;
            }
            if (!str.contains("fbs_aeid")) {
                if (com.google.android.gms.ads.internal.zzt.zzp().zzi(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
                    return zza(zzd(str, context), "fbs_aeid", zza).toString();
                }
                if (com.google.android.gms.ads.internal.zzt.zzp().zzj(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzn(context, zza);
                    return zza(zzd(str, context), "fbs_aeid", zza).toString();
                }
                return str;
            }
            return str;
        }
        return str;
    }

    private static String zzd(String str, Context context) {
        String zze = com.google.android.gms.ads.internal.zzt.zzn().zze(context);
        String zzc = com.google.android.gms.ads.internal.zzt.zzn().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zze)) {
            str = zza(str, "gmp_app_id", zze).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(zzc)) {
            return zza(str, "fbs_aiid", zzc).toString();
        }
        return str;
    }
}
