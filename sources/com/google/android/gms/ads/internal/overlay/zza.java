package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcat;

/* loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzz zzzVar, zzx zzxVar, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzzVar, zzxVar);
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(context, intent);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
            if (zzxVar != null) {
                zzxVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzcat.zzj(e.getMessage());
            if (zzxVar != null) {
                zzxVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzz zzzVar, zzx zzxVar) {
        int i = 0;
        if (zzcVar == null) {
            zzcat.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbci.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzzVar, zzxVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            zzcat.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzcVar.zzc)) {
            String str = zzcVar.zzb;
            intent2.setDataAndType(Uri.parse(str), zzcVar.zzc);
        } else {
            intent2.setData(Uri.parse(zzcVar.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                zzcat.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                zzcat.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzer)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzeq)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intent2);
            }
        }
        return zza(context, intent2, zzzVar, zzxVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzz zzzVar, zzx zzxVar) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzt.zzp().zzm(context, uri);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
        } catch (ActivityNotFoundException e) {
            zzcat.zzj(e.getMessage());
            i = 6;
        }
        if (zzxVar != null) {
            zzxVar.zzb(i);
        }
        if (i != 5) {
            return false;
        }
        return true;
    }
}
