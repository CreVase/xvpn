package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbno implements zzbmf, zzbnn {
    private final zzbnn zza;
    private final HashSet zzb = new HashSet();

    public zzbno(zzbnn zzbnnVar) {
        this.zza = zzbnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf, com.google.android.gms.internal.ads.zzbmq
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf, com.google.android.gms.internal.ads.zzbmq
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbme.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjj) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbjj) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbme.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf, com.google.android.gms.internal.ads.zzbmd
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbme.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbme.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zzq(String str, zzbjj zzbjjVar) {
        this.zza.zzq(str, zzbjjVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zzr(String str, zzbjj zzbjjVar) {
        this.zza.zzr(str, zzbjjVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjjVar));
    }
}
