package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqm implements zzetw {
    private final Context zza;
    private final zzgad zzb;

    public zzeqm(Context context, zzgad zzgadVar) {
        this.zza = context;
        this.zzb = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeql zzc() throws Exception {
        String string;
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzp();
        String str = "";
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfY)).booleanValue()) {
            string = "";
        } else {
            string = this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzga)).booleanValue()) {
            str = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        Context context = this.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfZ)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        }
        return new zzeql(string, str, bundle, null);
    }
}
