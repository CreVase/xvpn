package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzebm implements zzfgu {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfit zzc;
    private final zzfje zzd;

    public zzebm(String str, zzfje zzfjeVar, zzfit zzfitVar) {
        this.zzb = str;
        this.zzd = zzfjeVar;
        this.zzc = zzfitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbvj zzbvjVar;
        zzdwm zzdwmVar;
        zzbvj zzbvjVar2;
        zzbvj zzbvjVar3;
        zzbvj zzbvjVar4;
        zzbvj zzbvjVar5;
        zzbvj zzbvjVar6;
        zzbvj zzbvjVar7;
        zzbvj zzbvjVar8;
        JSONObject jSONObject2;
        String str;
        zzebl zzeblVar = (zzebl) obj;
        jSONObject = zzeblVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbvjVar = zzeblVar.zzb;
        String str2 = "";
        if (zzbvjVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbvjVar2 = zzeblVar.zzb;
            if (zzbvjVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaN)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            zzbvjVar3 = zzeblVar.zzb;
            if (zzbvjVar3.zzi()) {
                jSONObject2 = zzeblVar.zza;
                zzebn.zza(hashMap, jSONObject2);
            }
            zzbvjVar4 = zzeblVar.zzb;
            if (zzbvjVar4 != null) {
                zzbvjVar7 = zzeblVar.zzb;
                if (!TextUtils.isEmpty(zzbvjVar7.zzd())) {
                    zzbvjVar8 = zzeblVar.zzb;
                    str2 = zzbvjVar8.zzd();
                }
            }
            zzfje zzfjeVar = this.zzd;
            zzfit zzfitVar = this.zzc;
            zzfitVar.zzf(true);
            zzfjeVar.zza(zzfitVar);
            zzbvjVar5 = zzeblVar.zzb;
            String zze = zzbvjVar5.zze();
            byte[] bytes = str2.getBytes(zzfsi.zzc);
            zzbvjVar6 = zzeblVar.zzb;
            return new zzebh(zze, optInt, hashMap, bytes, "", zzbvjVar6.zzi());
        }
        if (zzbvjVar.zza() == 1) {
            if (zzbvjVar.zzf() != null) {
                str2 = TextUtils.join(", ", zzbvjVar.zzf());
                zzcat.zzg(str2);
            }
            zzdwmVar = new zzdwm(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdwmVar = new zzdwm(1);
        }
        zzfje zzfjeVar2 = this.zzd;
        zzfit zzfitVar2 = this.zzc;
        zzfitVar2.zzg(zzdwmVar);
        zzfitVar2.zzf(false);
        zzfjeVar2.zza(zzfitVar2);
        throw zzdwmVar;
    }
}
