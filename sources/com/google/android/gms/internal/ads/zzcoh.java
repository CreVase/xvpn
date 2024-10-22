package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import defpackage.p71;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcoh implements zzcnl {
    private final CookieManager zza;

    public zzcoh(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcnl
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaM);
            String cookie = this.zza.getCookie(str);
            if (cookie != null) {
                List zzf = zzftj.zzc(zzfsh.zzc(';')).zzf(cookie);
                for (int i = 0; i < zzf.size(); i++) {
                    CookieManager cookieManager = this.zza;
                    Iterator it = zzftj.zzc(zzfsh.zzc('=')).zzd((String) zzf.get(i)).iterator();
                    it.getClass();
                    if (it.hasNext()) {
                        cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaw))));
                    } else {
                        throw new IndexOutOfBoundsException(p71.k("position (0) must be less than the number of elements that remained (", 0, ")"));
                    }
                }
                return;
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaM), str2);
    }
}
