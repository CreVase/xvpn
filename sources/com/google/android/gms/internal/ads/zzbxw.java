package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class zzbxw implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzbyy zzd;
    private String zze = "-1";
    private int zzf = -1;

    public zzbxw(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyy zzbyyVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzbyyVar;
    }

    private final void zzb() {
        this.zzc.zzH(true);
        new Bundle();
        throw null;
    }

    private final void zzc(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzav)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        this.zzc.zzH(z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgf)).booleanValue() && z && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        this.zzd.zzt();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzax)).booleanValue()) {
            if (zzbxv.zza(str, "gad_has_consent_for_cookies")) {
                int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i != this.zzc.zzb()) {
                    zzb();
                }
                this.zzc.zzE(i);
                return;
            }
            if (zzbxv.zza(str, "IABTCF_gdprApplies") || zzbxv.zza(str, "IABTCF_TCString") || zzbxv.zza(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.zzc.zzn(str))) {
                    zzb();
                }
                this.zzc.zzF(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzav)).booleanValue() && i2 != -1 && this.zzf != i2) {
                this.zzf = i2;
                zzc(string2, i2);
                return;
            }
            return;
        }
        if (!string2.equals("-1") && !this.zze.equals(string2)) {
            this.zze = string2;
            zzc(string2, i2);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzax)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        }
    }
}
