package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbrv extends zzbry {
    private final Map zza;
    private final Context zzb;

    public zzbrv(zzcgb zzcgbVar, Map map) {
        super(zzcgbVar, "storePicture");
        this.zza = map;
        this.zzb = zzcgbVar.zzi();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbbs(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
                com.google.android.gms.ads.internal.zzt.zzp();
                AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.zzb);
                if (zzd != null) {
                    str = zzd.getString(R.string.s1);
                } else {
                    str = "Save image";
                }
                zzJ.setTitle(str);
                if (zzd != null) {
                    str2 = zzd.getString(R.string.s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzJ.setMessage(str2);
                if (zzd != null) {
                    str3 = zzd.getString(R.string.s3);
                } else {
                    str3 = "Accept";
                }
                zzJ.setPositiveButton(str3, new zzbrt(this, str5, lastPathSegment));
                if (zzd != null) {
                    str4 = zzd.getString(R.string.s4);
                } else {
                    str4 = "Decline";
                }
                zzJ.setNegativeButton(str4, new zzbru(this));
                zzJ.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        zzg("Invalid image url: ".concat(String.valueOf(str5)));
    }
}
