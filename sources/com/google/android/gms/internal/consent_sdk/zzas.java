package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import defpackage.r60;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzas {
    static final zzdf zza = zzdf.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    public zzas(Application application) {
        this.zzb = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final r60 zzb() {
        return r60.valueOf(this.zzc.getString("privacy_options_requirement_status", "UNKNOWN"));
    }

    public final Map zzc() {
        String str;
        Application application = this.zzb;
        Set<String> stringSet = this.zzc.getStringSet("stored_info", zzdf.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            zzco zza2 = zzcq.zza(application, str2);
            if (zza2 == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str2));
            } else {
                Object obj = application.getSharedPreferences(zza2.zza, 0).getAll().get(zza2.zzb);
                if (obj == null) {
                    "Stored info not exists: ".concat(String.valueOf(str2));
                } else {
                    if (obj instanceof Boolean) {
                        if (true != ((Boolean) obj).booleanValue()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        "Failed to fetch stored info: ".concat(String.valueOf(str2));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        zzcq.zzb(this.zzb, this.zzd);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).apply();
    }

    public final void zzg(int i) {
        this.zzc.edit().putInt("consent_status", i).apply();
    }

    public final void zzh(r60 r60Var) {
        this.zzc.edit().putString("privacy_options_requirement_status", r60Var.name()).apply();
    }

    public final void zzi(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).apply();
    }
}
