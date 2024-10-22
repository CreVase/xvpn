package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbrq extends zzbry {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrq(zzcgb zzcgbVar, Map map) {
        super(zzcgbVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcgbVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        if (TextUtils.isEmpty((CharSequence) this.zza.get(str))) {
            return "";
        }
        return (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbbs(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.zzb);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd != null) {
            str = zzd.getString(R.string.s5);
        } else {
            str = "Create calendar event";
        }
        zzJ.setTitle(str);
        if (zzd != null) {
            str2 = zzd.getString(R.string.s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        zzJ.setMessage(str2);
        if (zzd != null) {
            str3 = zzd.getString(R.string.s3);
        } else {
            str3 = "Accept";
        }
        zzJ.setPositiveButton(str3, new zzbro(this));
        if (zzd != null) {
            str4 = zzd.getString(R.string.s4);
        } else {
            str4 = "Decline";
        }
        zzJ.setNegativeButton(str4, new zzbrp(this));
        zzJ.create().show();
    }
}
