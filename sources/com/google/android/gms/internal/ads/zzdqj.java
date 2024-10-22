package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdqj {
    private final zzfeh zza;
    private final zzdqg zzb;

    public zzdqj(zzfeh zzfehVar, zzdqg zzdqgVar) {
        this.zza = zzfehVar;
        this.zzb = zzdqgVar;
    }

    public final zzbox zza() throws RemoteException {
        zzbox zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzcat.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqv zzb(String str) throws RemoteException {
        zzbqv zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfej zzc(String str, JSONObject jSONObject) throws zzfds {
        zzbpa zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpy(new zzbrn());
            } else {
                zzbox zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        zzcat.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfej zzfejVar = new zzfej(zzb);
            this.zzb.zzd(str, zzfejVar);
            return zzfejVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjc)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfds(th);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzb() != null) {
            return true;
        }
        return false;
    }
}
