package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzesx implements zzetw {
    final String zza;
    private final zzgad zzb;
    private final ScheduledExecutorService zzc;
    private final zzelg zzd;
    private final Context zze;
    private final zzfdn zzf;
    private final zzelc zzg;
    private final zzdqj zzh;
    private final zzdut zzi;

    public zzesx(zzgad zzgadVar, ScheduledExecutorService scheduledExecutorService, String str, zzelg zzelgVar, Context context, zzfdn zzfdnVar, zzelc zzelcVar, zzdqj zzdqjVar, zzdut zzdutVar) {
        this.zzb = zzgadVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzelgVar;
        this.zze = context;
        this.zzf = zzfdnVar;
        this.zzg = zzelcVar;
        this.zzh = zzdqjVar;
        this.zzi = zzdutVar;
    }

    public static /* synthetic */ ml1 zzc(zzesx zzesxVar) {
        String str;
        final Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjX)).booleanValue()) {
            str = zzesxVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzesxVar.zzf.zzf;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbB)).booleanValue()) {
            bundle = zzesxVar.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbK)).booleanValue()) {
            for (Map.Entry entry : ((zzfvv) zzesxVar.zzd.zzb(zzesxVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzesxVar.zzg(str2, (List) entry.getValue(), zzesxVar.zzf(str2), true, true));
            }
            zzesxVar.zzi(arrayList, zzesxVar.zzd.zzc());
        } else {
            zzesxVar.zzi(arrayList, zzesxVar.zzd.zza(zzesxVar.zza, str));
        }
        return zzfzt.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ml1 ml1Var : arrayList) {
                    if (((JSONObject) ml1Var.get()) != null) {
                        jSONArray.put(ml1Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzesy(jSONArray.toString(), bundle);
            }
        }, zzesxVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzfzk zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfzk zzu = zzfzk.zzu(zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzfyz
            public final ml1 zza() {
                return zzesx.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbx)).booleanValue()) {
            zzu = (zzfzk) zzfzt.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbq)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfzk) zzfzt.zze(zzu, Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzcat.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbqv zzbqvVar, Bundle bundle, List list, zzelj zzeljVar) throws RemoteException {
        zzbqvVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeljVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzelk zzelkVar = (zzelk) ((Map.Entry) it.next()).getValue();
            String str = zzelkVar.zza;
            list.add(zzg(str, Collections.singletonList(zzelkVar.zze), zzf(str), zzelkVar.zzb, zzelkVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        zzfdn zzfdnVar = this.zzf;
        if (zzfdnVar.zzq) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbD)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfdnVar.zzd)))) {
                return zzfzt.zzh(new zzesy(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // com.google.android.gms.internal.ads.zzfyz
            public final ml1 zza() {
                return zzesx.zzc(zzesx.this);
            }
        }, this.zzb);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:            r13 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:            com.google.android.gms.internal.ads.zzcat.zzh("Couldn't create RTB adapter : ", r13);        r13 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.ml1 zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcbl r7 = new com.google.android.gms.internal.ads.zzcbl
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbca r13 = com.google.android.gms.internal.ads.zzbci.zzbC
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r13 = r1.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzelc r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzelc r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbqv r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdqj r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbqv r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.internal.ads.zzcat.zzh(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbca r10 = com.google.android.gms.internal.ads.zzbci.zzbs
            com.google.android.gms.internal.ads.zzbcg r11 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r11.zzb(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzelj.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzelj r6 = new com.google.android.gms.internal.ads.zzelj
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzbx
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r0.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzesw r0 = new com.google.android.gms.internal.ads.zzesw
            r0.<init>()
            com.google.android.gms.internal.ads.zzbca r1 = com.google.android.gms.internal.ads.zzbci.zzbq
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbca r9 = com.google.android.gms.internal.ads.zzbci.zzbE
            com.google.android.gms.internal.ads.zzbcg r12 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r12.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgad r9 = r8.zzb
            com.google.android.gms.internal.ads.zzest r12 = new com.google.android.gms.internal.ads.zzest
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesx.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):ml1");
    }

    public final /* synthetic */ void zze(zzbqv zzbqvVar, Bundle bundle, List list, zzelj zzeljVar, zzcbl zzcblVar) {
        try {
            zzh(zzbqvVar, bundle, list, zzeljVar);
        } catch (RemoteException e) {
            zzcblVar.zzd(e);
        }
    }
}
