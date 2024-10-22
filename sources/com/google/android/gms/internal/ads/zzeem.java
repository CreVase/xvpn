package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzeem implements zzeen {
    public static /* synthetic */ zzfkc zzc(String str, String str2, String str3, zzeeo zzeeoVar, String str4, WebView webView, String str5, String str6, zzeep zzeepVar) {
        zzfkm zza = zzfkm.zza("Google", str2);
        zzfkl zzm = zzm("javascript");
        zzfkh zzk = zzk(zzeeoVar.toString());
        zzfkl zzfklVar = zzfkl.NONE;
        if (zzm == zzfklVar) {
            zzcat.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzk == null) {
            zzcat.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeeoVar)));
            return null;
        }
        zzfkl zzm2 = zzm(str4);
        if (zzk == zzfkh.VIDEO && zzm2 == zzfklVar) {
            zzcat.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzfkc.zza(zzfkd.zza(zzk, zzl(zzeepVar.toString()), zzm, zzm2, true), zzfke.zzb(zza, webView, str5, ""));
    }

    public static /* synthetic */ zzfkc zzd(String str, String str2, String str3, String str4, zzeeo zzeeoVar, WebView webView, String str5, String str6, zzeep zzeepVar) {
        zzfkm zza = zzfkm.zza(str, str2);
        zzfkl zzm = zzm("javascript");
        zzfkl zzm2 = zzm(str4);
        zzfkh zzk = zzk(zzeeoVar.toString());
        zzfkl zzfklVar = zzfkl.NONE;
        if (zzm == zzfklVar) {
            zzcat.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzk == null) {
            zzcat.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeeoVar)));
            return null;
        }
        if (zzk == zzfkh.VIDEO && zzm2 == zzfklVar) {
            zzcat.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzfkc.zza(zzfkd.zza(zzk, zzl(zzeepVar.toString()), zzm, zzm2, true), zzfke.zzc(zza, webView, str5, ""));
    }

    private static zzfkh zzk(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("video")) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzfkh.VIDEO;
            }
            return zzfkh.NATIVE_DISPLAY;
        }
        return zzfkh.HTML_DISPLAY;
    }

    private static zzfkk zzl(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return zzfkk.UNSPECIFIED;
                }
                return zzfkk.ONE_PIXEL;
            }
            return zzfkk.DEFINED_BY_JAVASCRIPT;
        }
        return zzfkk.BEGIN_TO_RENDER;
    }

    private static zzfkl zzm(String str) {
        if ("native".equals(str)) {
            return zzfkl.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfkl.JAVASCRIPT;
        }
        return zzfkl.NONE;
    }

    private static final Object zzn(zzeel zzeelVar) {
        try {
            return zzeelVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final zzfkc zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzeep zzeepVar, final zzeeo zzeeoVar, final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
            final String str6 = "";
            final String str7 = "javascript";
            final String str8 = "Google";
            return (zzfkc) zzn(new zzeel(str8, str, str7, zzeeoVar, str4, webView, str5, str6, zzeepVar) { // from class: com.google.android.gms.internal.ads.zzeei
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzeeo zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeep zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzeeoVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzeepVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeel
                public final Object zza() {
                    return zzeem.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final zzfkc zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeep zzeepVar, final zzeeo zzeeoVar, final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
            final String str7 = "";
            final String str8 = "javascript";
            return (zzfkc) zzn(new zzeel(str5, str, str8, str4, zzeeoVar, webView, str6, str7, zzeepVar) { // from class: com.google.android.gms.internal.ads.zzeef
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzeeo zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeep zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzeeoVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzeepVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeel
                public final Object zza() {
                    return zzeem.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final String zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue()) {
            return null;
        }
        return (String) zzn(new zzeel() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzeel
            public final Object zza() {
                return "a.1.4.8-google_20230803";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final void zzf(final zzfkc zzfkcVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
                    zzfkc.this.zzb(view, zzfkj.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final void zzg(final zzfkc zzfkcVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
                    zzfkc.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final void zzh(final zzfkc zzfkcVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
                    zzfkc.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final void zzi(final zzfkc zzfkcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
            zzfkcVar.getClass();
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeg
                @Override // java.lang.Runnable
                public final void run() {
                    zzfkc.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeen
    public final boolean zzj(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeS)).booleanValue()) {
            zzcat.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzn(new zzeel() { // from class: com.google.android.gms.internal.ads.zzeeh
            @Override // com.google.android.gms.internal.ads.zzeel
            public final Object zza() {
                if (zzfka.zzb()) {
                    return Boolean.TRUE;
                }
                zzfka.zza(context);
                return Boolean.valueOf(zzfka.zzb());
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
