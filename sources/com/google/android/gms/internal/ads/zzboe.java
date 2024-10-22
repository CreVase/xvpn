package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.ml1;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzboe implements zzbnq {
    private final zzbns zza;
    private final zzbnt zzb;
    private final zzbnm zzc;
    private final String zzd;

    public zzboe(zzbnm zzbnmVar, String str, zzbnt zzbntVar, zzbns zzbnsVar) {
        this.zzc = zzbnmVar;
        this.zzd = str;
        this.zzb = zzbntVar;
        this.zza = zzbnsVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzboe zzboeVar, zzbng zzbngVar, zzbnn zzbnnVar, Object obj, zzcbl zzcblVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbji.zzo.zzc(uuid, new zzbod(zzboeVar, zzbngVar, zzcblVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzboeVar.zzb.zzb(obj));
            zzbnnVar.zzl(zzboeVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcblVar.zzd(e);
                zzcat.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbngVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final ml1 zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final ml1 zzb(Object obj) {
        zzcbl zzcblVar = new zzcbl();
        zzbng zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbob(this, zzb, obj, zzcblVar), new zzboc(this, zzcblVar, zzb));
        return zzcblVar;
    }
}
