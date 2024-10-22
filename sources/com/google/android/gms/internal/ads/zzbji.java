package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.ml1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbji {
    public static final zzbjj zza = new zzbjj() { // from class: com.google.android.gms.internal.ads.zzbig
        @Override // com.google.android.gms.internal.ads.zzbjj
        public final void zza(Object obj, Map map) {
            String str;
            zzchc zzchcVar = (zzchc) obj;
            zzbjj zzbjjVar = zzbji.zza;
            String str2 = (String) map.get("urls");
            if (TextUtils.isEmpty(str2)) {
                zzcat.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str2.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzchcVar.getContext().getPackageManager();
            for (String str3 : split) {
                String[] split2 = str3.split(";", 2);
                String trim = split2[0].trim();
                boolean z = true;
                if (split2.length > 1) {
                    str = split2[1].trim();
                } else {
                    str = "android.intent.action.VIEW";
                }
                if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str3, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str3 + ";" + valueOf);
            }
            ((zzbmd) zzchcVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbjj zzb = new zzbjj() { // from class: com.google.android.gms.internal.ads.zzbii
        @Override // com.google.android.gms.internal.ads.zzbjj
        public final void zza(Object obj, Map map) {
            boolean z;
            zzchc zzchcVar = (zzchc) obj;
            zzbjj zzbjjVar = zzbji.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhY)).booleanValue()) {
                zzcat.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzcat.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (zzchcVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbmd) zzchcVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbjj zzc = new zzbjj() { // from class: com.google.android.gms.internal.ads.zzbil
        @Override // com.google.android.gms.internal.ads.zzbjj
        public final void zza(Object obj, Map map) {
            zzbji.zzb((zzchc) obj, map);
        }
    };
    public static final zzbjj zzd = new zzbja();
    public static final zzbjj zze = new zzbjb();
    public static final zzbjj zzf = new zzbjj() { // from class: com.google.android.gms.internal.ads.zzbim
        @Override // com.google.android.gms.internal.ads.zzbjj
        public final void zza(Object obj, Map map) {
            zzchc zzchcVar = (zzchc) obj;
            zzbjj zzbjjVar = zzbji.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzcat.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzca(zzchcVar.getContext(), ((zzchk) zzchcVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbjj zzg = new zzbjc();
    public static final zzbjj zzh = new zzbjd();
    public static final zzbjj zzi = new zzbjj() { // from class: com.google.android.gms.internal.ads.zzbik
        @Override // com.google.android.gms.internal.ads.zzbjj
        public final void zza(Object obj, Map map) {
            zzchj zzchjVar = (zzchj) obj;
            zzbjj zzbjjVar = zzbji.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzaro zzI = zzchjVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                zzcat.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbjj zzj = new zzbje();
    public static final zzbjj zzk = new zzbjf();
    public static final zzbjj zzl = new zzceb();
    public static final zzbjj zzm = new zzcec();
    public static final zzbjj zzn = new zzbic();
    public static final zzbjy zzo = new zzbjy();
    public static final zzbjj zzp = new zzbjg();
    public static final zzbjj zzq = new zzbjh();
    public static final zzbjj zzr = new zzbin();
    public static final zzbjj zzs = new zzbio();
    public static final zzbjj zzt = new zzbip();
    public static final zzbjj zzu = new zzbiq();
    public static final zzbjj zzv = new zzbir();
    public static final zzbjj zzw = new zzbis();
    public static final zzbjj zzx = new zzbit();
    public static final zzbjj zzy = new zzbiu();
    public static final zzbjj zzz = new zzbiv();
    public static final zzbjj zzA = new zzbiw();
    public static final zzbjj zzB = new zzbiy();
    public static final zzbjj zzC = new zzbiz();

    public static ml1 zza(zzcgb zzcgbVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaro zzI = zzcgbVar.zzI();
            if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcgbVar.getContext(), zzcgbVar.zzF(), zzcgbVar.zzi());
            }
        } catch (zzarp unused) {
            zzcat.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzbza.zzb(parse, zzcgbVar.getContext());
        long longValue = ((Long) zzbea.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 233702200) {
            zzfzk zzu2 = zzfzk.zzu(zzcgbVar.zzR());
            zzbid zzbidVar = new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbid
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbjj zzbjjVar = zzbji.zza;
                    if (((Boolean) zzbea.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzgad zzgadVar = zzcbg.zzf;
            return zzfzt.zze(zzfzt.zzm(zzfzt.zze(zzu2, Throwable.class, zzbidVar, zzgadVar), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbie
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    zzbjj zzbjjVar = zzbji.zza;
                    String str3 = zzb2;
                    if (str2 != null) {
                        if (((Boolean) zzbea.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str3).getHost();
                            for (int i = 0; i < 3; i++) {
                                if (!host.endsWith(strArr[i])) {
                                }
                            }
                        }
                        String str4 = (String) zzbea.zza.zze();
                        String str5 = (String) zzbea.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str3.replace(str4, str2);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str3);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                            }
                        }
                    }
                    return str3;
                }
            }, zzgadVar), Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbif
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbjj zzbjjVar = zzbji.zza;
                    if (((Boolean) zzbea.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                    }
                    return zzb2;
                }
            }, zzgadVar);
        }
        return zzfzt.zzh(zzb2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:            com.google.android.gms.internal.ads.zzcat.zzh("Error constructing openable urls response.", r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:            com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, r8.toString());     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzchc r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbji.zzb(com.google.android.gms.internal.ads.zzchc, java.util.Map):void");
    }

    public static void zzc(Map map, zzdfd zzdfdVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjT)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdfdVar != null) {
            zzdfdVar.zzbK();
        }
    }
}
