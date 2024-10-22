package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ml1;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbju implements zzbjj {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdso zzb;
    private final zzfib zzc;
    private final zzbrs zze;
    private final zzedo zzf;
    private final zzcou zzg;
    private com.google.android.gms.ads.internal.overlay.zzx zzh = null;
    private final zzgad zzi = zzcbg.zzf;
    private final zzcay zzd = new zzcay(null);

    public zzbju(com.google.android.gms.ads.internal.zzb zzbVar, zzbrs zzbrsVar, zzedo zzedoVar, zzdso zzdsoVar, zzfib zzfibVar, zzcou zzcouVar) {
        this.zza = zzbVar;
        this.zze = zzbrsVar;
        this.zzf = zzedoVar;
        this.zzb = zzdsoVar;
        this.zzc = zzfibVar;
        this.zzg = zzcouVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    public static Uri zzc(Context context, zzaro zzaroVar, Uri uri, View view, Activity activity) {
        if (zzaroVar == null) {
            return uri;
        }
        try {
            if (zzaroVar.zze(uri)) {
                return zzaroVar.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzarp unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcat.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        HashMap hashMap;
        boolean z4;
        String str4;
        boolean z5;
        Object obj;
        zzcgb zzcgbVar = (zzcgb) zzaVar;
        zzfcr zzD = zzcgbVar.zzD();
        zzfcv zzP = zzcgbVar.zzP();
        boolean z6 = false;
        if (zzD == null || zzP == null) {
            str3 = "";
            z = false;
        } else {
            String str5 = zzP.zzb;
            z = zzD.zzak;
            str3 = str5;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjS)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcgbVar.zzaA()) {
                zzcat.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzchg) zzaVar).zzaF(zzf(map), zzb(map), z2);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkQ)).booleanValue() && ((obj = map.get("is_allowed_for_lock_screen")) == "1" || (obj != null && obj.equals("1")))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (str != null) {
                ((zzchg) zzaVar).zzaH(zzf(map), zzb(map), str, z2, z5);
                return;
            } else {
                ((zzchg) zzaVar).zzaG(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z2);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcgbVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzes)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzey)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzew)).booleanValue()) {
                        String str6 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzex);
                        if (!str6.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = zzftj.zzc(zzfsh.zzc(';')).zzd(str6).iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equals(packageName)) {
                                }
                            }
                        }
                    }
                    z6 = true;
                    break;
                }
            }
            boolean zzg = zzbdj.zzg(zzcgbVar.getContext());
            if (z6) {
                if (!zzg) {
                    zzm(4);
                } else {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcat.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcgbVar.getContext(), zzcgbVar.zzI(), Uri.parse(str), zzcgbVar.zzF(), zzcgbVar.zzi()));
                    if (z && this.zzf != null && zzl(zzaVar, zzcgbVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbjr(this);
                    ((zzchg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z2);
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z, str3, z2);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z, str3, z2);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhY)).booleanValue()) {
                return;
            }
            zzk(true);
            String str7 = (String) map.get("p");
            if (str7 == null) {
                zzcat.zzj("Package name missing from open app action.");
                return;
            }
            if (z && this.zzf != null && zzl(zzaVar, zzcgbVar.getContext(), str7, str3)) {
                return;
            }
            PackageManager packageManager = zzcgbVar.getContext().getPackageManager();
            if (packageManager == null) {
                zzcat.zzj("Cannot get package manager from open app action.");
                return;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str7);
            if (launchIntentForPackage != null) {
                ((zzchg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z2);
                return;
            }
            return;
        }
        zzk(true);
        String str8 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str8)) {
            try {
                intent = Intent.parseUri(str8, 0);
            } catch (URISyntaxException e) {
                zzcat.zzh("Error parsing the url: ".concat(String.valueOf(str8)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcgbVar.getContext(), zzcgbVar.zzI(), data, zzcgbVar.zzF(), zzcgbVar.zzi()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhZ)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzin)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id")) {
            z3 = true;
        } else {
            z3 = false;
        }
        HashMap hashMap2 = new HashMap();
        if (z3) {
            hashMap = hashMap2;
            this.zzh = new zzbjs(this, z2, zzaVar, hashMap2, map);
            z4 = false;
        } else {
            hashMap = hashMap2;
            z4 = z2;
        }
        if (intent2 != null) {
            if (z && this.zzf != null && zzl(zzaVar, zzcgbVar.getContext(), intent2.getData().toString(), str3)) {
                if (z3) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbmd) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
            ((zzchg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzh), z4);
            return;
        }
        HashMap hashMap4 = hashMap;
        if (!TextUtils.isEmpty(str)) {
            str4 = zzd(zzc(zzcgbVar.getContext(), zzcgbVar.zzI(), Uri.parse(str), zzcgbVar.zzF(), zzcgbVar.zzi())).toString();
        } else {
            str4 = str;
        }
        if (z && this.zzf != null && zzl(zzaVar, zzcgbVar.getContext(), str4, str3)) {
            if (z3) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((zzbmd) zzaVar).zzd("openIntentAsync", hashMap4);
                return;
            }
            return;
        }
        ((zzchg) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), str4, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z4);
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdso zzdsoVar = this.zzb;
        if (zzdsoVar != null) {
            zzedz.zzc(context, zzdsoVar, this.zzc, this.zzf, str, "dialog_not_shown", zzfvv.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:            if (com.google.android.gms.internal.ads.zzbjt.zzc(r11, r5, r6, r7) == null) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:            r11 = r16;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbju.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzk(boolean z) {
        zzbrs zzbrsVar = this.zze;
        if (zzbrsVar != null) {
            zzbrsVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:            if (r2 != false) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbju.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfib zzfibVar = this.zzc;
            String zza = zzbdi.zza(i);
            zzfia zzb = zzfia.zzb("cct_action");
            zzb.zza("cct_open_status", zza);
            zzfibVar.zzb(zzb);
            return;
        }
        zzdsn zza2 = this.zzb.zza();
        zza2.zzb("action", "cct_action");
        zza2.zzb("cct_open_status", zzbdi.zza(i));
        zza2.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ml1 zzh;
        zzcou zzcouVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String zzc = zzbza.zzc((String) map.get("u"), ((zzcgb) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcat.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            zzbVar.zzb(zzc);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzju)).booleanValue() && (zzcouVar = this.zzg) != null) {
            zzh = zzcouVar.zzc(zzc, com.google.android.gms.ads.internal.client.zzay.zze());
        } else {
            zzh = zzfzt.zzh(zzc);
        }
        zzfzt.zzr(zzh, new zzbjq(this, zzaVar, map, str), this.zzi);
    }
}
