package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.ml1;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbom implements zzfza {
    private final zzbns zza;
    private final zzbnt zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final ml1 zzd;

    public zzbom(ml1 ml1Var, String str, zzbnt zzbntVar, zzbns zzbnsVar) {
        this.zzd = ml1Var;
        this.zzb = zzbntVar;
        this.zza = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final ml1 zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ml1 zzb(final Object obj) {
        return zzfzt.zzn(this.zzd, new zzfza() { // from class: com.google.android.gms.internal.ads.zzbok
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj2) {
                return zzbom.this.zzc(obj, (zzbnn) obj2);
            }
        }, zzcbg.zzf);
    }

    public final /* synthetic */ ml1 zzc(Object obj, zzbnn zzbnnVar) throws Exception {
        zzcbl zzcblVar = new zzcbl();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbji.zzo.zzc(uuid, new zzbol(this, zzcblVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbnnVar.zzl(this.zzc, jSONObject);
        return zzcblVar;
    }
}
