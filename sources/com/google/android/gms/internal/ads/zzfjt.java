package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import defpackage.hx2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfjt {
    private final zzeio zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfdf zzf;
    private final zzfdg zzg;
    private final Clock zzh;
    private final zzaro zzi;

    public zzfjt(zzeio zzeioVar, zzcaz zzcazVar, String str, String str2, Context context, zzfdf zzfdfVar, zzfdg zzfdgVar, Clock clock, zzaro zzaroVar) {
        this.zza = zzeioVar;
        this.zzb = zzcazVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfdfVar;
        this.zzg = zzfdgVar;
        this.zzh = clock;
        this.zzi = zzaroVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", hx2.m("2.", i2)));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (zzcas.zzk()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfde zzfdeVar, zzfcr zzfcrVar, List list) {
        return zzd(zzfdeVar, zzfcrVar, false, "", "", list);
    }

    public final List zzd(zzfde zzfdeVar, zzfcr zzfcrVar, boolean z, String str, String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            if (true != z) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfdeVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfcrVar != null) {
                zzj = zzbza.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfcrVar.zzA), "@gw_adnetid@", zzfcrVar.zzz), "@gw_allocid@", zzfcrVar.zzy), this.zze, zzfcrVar.zzY);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdm)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (!z3) {
                if (!z4) {
                    arrayList.add(zzj2);
                }
            } else {
                z2 = z4;
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfcr r10, java.util.List r11, com.google.android.gms.internal.ads.zzbvw r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbci.zzdn
            com.google.android.gms.internal.ads.zzbcg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzfdg r4 = r9.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfss r4 = com.google.android.gms.internal.ads.zzfss.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzfdf r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzfdf r4 = r9.zzf
        L37:
            com.google.android.gms.internal.ads.zzfss r4 = com.google.android.gms.internal.ads.zzfss.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfjr r5 = new com.google.android.gms.internal.ads.zzfsk() { // from class: com.google.android.gms.internal.ads.zzfjr
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfjr r0 = new com.google.android.gms.internal.ads.zzfjr
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzfjr) com.google.android.gms.internal.ads.zzfjr.zza com.google.android.gms.internal.ads.zzfjr
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjr.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjr.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfsk
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzfdf r1 = (com.google.android.gms.internal.ads.zzfdf) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzfjt.zza(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjr.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfss r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfjs r7 = new com.google.android.gms.internal.ads.zzfsk() { // from class: com.google.android.gms.internal.ads.zzfjs
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfjs r0 = new com.google.android.gms.internal.ads.zzfjs
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzfjs) com.google.android.gms.internal.ads.zzfjs.zza com.google.android.gms.internal.ads.zzfjs
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjs.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjs.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfsk
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzfdf r1 = (com.google.android.gms.internal.ads.zzfdf) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzfjt.zzb(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjs.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfss r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzj(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzj(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzY
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbza.zzc(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzcat.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjt.zze(com.google.android.gms.internal.ads.zzfcr, java.util.List, com.google.android.gms.internal.ads.zzbvw):java.util.List");
    }
}
