package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.chartboost.sdk.impl.oa;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfzp;
import defpackage.ml1;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzw implements zzfzp {
    final /* synthetic */ ml1 zza;
    final /* synthetic */ zzbzo zzb;
    final /* synthetic */ zzbzh zzc;
    final /* synthetic */ zzfit zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    public zzw(zzaa zzaaVar, ml1 ml1Var, zzbzo zzbzoVar, zzbzh zzbzhVar, zzfit zzfitVar, long j) {
        this.zzf = zzaaVar;
        this.zza = ml1Var;
        this.zzb = zzbzoVar;
        this.zzc = zzbzhVar;
        this.zzd = zzfitVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzdst zzdstVar;
        zzdsj zzdsjVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzdstVar = zzaaVar.zzr;
        zzdsjVar = zzaaVar.zzj;
        zzf.zzc(zzdstVar, zzdsjVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        zzfje zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
            zzfit zzfitVar = this.zzd;
            zzfitVar.zzg(th);
            zzfitVar.zzf(false);
            zzr.zza(zzfitVar);
            zzr.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdst zzdstVar;
        zzdsj zzdsjVar;
        zzdsj zzdsjVar2;
        boolean z;
        boolean z2;
        zzdst zzdstVar2;
        zzdsj zzdsjVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcaz zzcazVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdst zzdstVar3;
        zzdsj zzdsjVar4;
        zzdst zzdstVar4;
        zzdsj zzdsjVar5;
        zzam zzamVar = (zzam) obj;
        zzfje zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzcat.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                zzfit zzfitVar = this.zzd;
                zzfitVar.zzc("QueryInfo generation has been disabled.");
                zzfitVar.zzf(false);
                zzr.zza(zzfitVar);
                zzr.zzg();
                return;
            }
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzamVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    zzdstVar4 = zzaaVar.zzr;
                    zzdsjVar5 = zzaaVar.zzj;
                    zzf.zzc(zzdstVar4, zzdsjVar5, "sgs", new Pair("rid", "-1"));
                    this.zzd.zzf(true);
                    if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                    String optString = jSONObject.optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        zzcat.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.zzf;
                        zzdstVar3 = zzaaVar2.zzr;
                        zzdsjVar4 = zzaaVar2.zzj;
                        zzf.zzc(zzdstVar3, zzdsjVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        zzfit zzfitVar2 = this.zzd;
                        zzfitVar2.zzc("Request ID empty");
                        zzfitVar2.zzf(false);
                        if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                            zzr.zza(this.zzd);
                            zzr.zzg();
                            return;
                        }
                        return;
                    }
                    zzaa zzaaVar3 = this.zzf;
                    String str7 = zzamVar.zzb;
                    zzdsjVar2 = zzaaVar3.zzj;
                    zzaa.zzG(zzaaVar3, optString, str7, zzdsjVar2);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.zzf;
                    z = zzaaVar4.zzw;
                    if (z && bundle != null) {
                        str5 = zzaaVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaa zzaaVar5 = this.zzf;
                            str6 = zzaaVar5.zzy;
                            atomicInteger = zzaaVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaa zzaaVar6 = this.zzf;
                    z2 = zzaaVar6.zzv;
                    if (z2 && bundle != null) {
                        str = zzaaVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzaa zzaaVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzaa zzaaVar8 = this.zzf;
                                context = zzaaVar8.zzg;
                                zzcazVar = zzaaVar8.zzA;
                                zzaaVar7.zzB = zzp.zzc(context, zzcazVar.zza);
                            }
                            zzaa zzaaVar9 = this.zzf;
                            str3 = zzaaVar9.zzx;
                            str4 = zzaaVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.zzf;
                    zzdstVar2 = zzaaVar10.zzr;
                    zzdsjVar3 = zzaaVar10.zzj;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                    String str8 = oa.f1052a;
                    if (((Boolean) zzba.zzc().zzb(zzbci.zzjm)).booleanValue()) {
                        try {
                            str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                        } catch (JSONException e2) {
                            zzcat.zzh("Error retrieving JSONObject from the requestJson, ", e2);
                        }
                    }
                    pairArr[1] = new Pair("tpc", str8);
                    zzf.zzc(zzdstVar2, zzdsjVar3, "sgs", pairArr);
                    this.zzd.zzf(true);
                    if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                    }
                } catch (JSONException e3) {
                    zzcat.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e3.toString());
                    zzaa zzaaVar11 = this.zzf;
                    zzdstVar = zzaaVar11.zzr;
                    zzdsjVar = zzaaVar11.zzj;
                    zzf.zzc(zzdstVar, zzdsjVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    zzfit zzfitVar3 = this.zzd;
                    zzfitVar3.zzg(e3);
                    zzfitVar3.zzf(false);
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                    }
                }
            } catch (Throwable th) {
                if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } catch (RemoteException e4) {
            zzfit zzfitVar4 = this.zzd;
            zzfitVar4.zzg(e4);
            zzfitVar4.zzf(false);
            zzcat.zzh("", e4);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
            if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzg();
            }
        }
    }
}
