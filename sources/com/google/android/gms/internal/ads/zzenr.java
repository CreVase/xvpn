package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzenr implements zzetv {
    final zzfdn zza;
    private final long zzb;

    public zzenr(zzfdn zzfdnVar, long j) {
        Preconditions.checkNotNull(zzfdnVar, "the targeting must not be null");
        this.zza = zzfdnVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        if (i != 0) {
            int i2 = i - 1;
            boolean z7 = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb));
            if (zzlVar.zzb != -1) {
                z = true;
            } else {
                z = false;
            }
            zzfdz.zzf(bundle, "cust_age", format, z);
            zzfdz.zzb(bundle, "extras", zzlVar.zzc);
            int i3 = zzlVar.zzd;
            if (i3 != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzfdz.zze(bundle, "cust_gender", i3, z2);
            zzfdz.zzd(bundle, "kw", zzlVar.zze);
            int i4 = zzlVar.zzg;
            if (i4 != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzfdz.zze(bundle, "tag_for_child_directed_treatment", i4, z3);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzlVar.zzy);
            if (zzlVar.zza >= 2 && zzlVar.zzh) {
                z4 = true;
            } else {
                z4 = false;
            }
            zzfdz.zze(bundle, "d_imp_hdr", 1, z4);
            String str = zzlVar.zzi;
            if (zzlVar.zza >= 2 && !TextUtils.isEmpty(str)) {
                z5 = true;
            } else {
                z5 = false;
            }
            zzfdz.zzf(bundle, "ppid", str, z5);
            Location location = zzlVar.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy() * 1000.0f;
                long time = location.getTime() * 1000;
                double latitude = location.getLatitude() * 1.0E7d;
                double longitude = location.getLongitude() * 1.0E7d;
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy);
                bundle2.putLong("lat", (long) latitude);
                bundle2.putLong("long", (long) longitude);
                bundle2.putLong("time", time);
                bundle.putBundle("uule", bundle2);
            }
            zzfdz.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
            zzfdz.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
            zzfdz.zzb(bundle, "custom_targeting", zzlVar.zzn);
            zzfdz.zzd(bundle, "category_exclusions", zzlVar.zzo);
            zzfdz.zzc(bundle, "request_agent", zzlVar.zzp);
            zzfdz.zzc(bundle, "request_pkg", zzlVar.zzq);
            boolean z8 = zzlVar.zzr;
            if (zzlVar.zza >= 7) {
                z6 = true;
            } else {
                z6 = false;
            }
            zzfdz.zzg(bundle, "is_designed_for_families", z8, z6);
            if (zzlVar.zza >= 8) {
                int i5 = zzlVar.zzt;
                if (i5 == -1) {
                    z7 = false;
                }
                zzfdz.zze(bundle, "tag_for_under_age_of_consent", i5, z7);
                zzfdz.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
