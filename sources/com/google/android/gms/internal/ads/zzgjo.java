package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgjo {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgjo(zzgji zzgjiVar, zzgjn zzgjnVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgjiVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgjiVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgjiVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgjiVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) throws GeneralSecurityException {
        zzgjk zzgjkVar = new zzgjk(zzgjhVar.getClass(), zzgjhVar.zzd(), null);
        if (this.zzb.containsKey(zzgjkVar)) {
            return ((zzghp) this.zzb.get(zzgjkVar)).zza(zzgjhVar, zzgchVar);
        }
        throw new GeneralSecurityException(hx2.q("No Key Parser for requested key type ", zzgjkVar.toString(), " available"));
    }

    public final zzgjh zzb(zzgbw zzgbwVar, Class cls) throws GeneralSecurityException {
        zzgjm zzgjmVar = new zzgjm(zzgbwVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgjmVar)) {
            return ((zzgiq) this.zzc.get(zzgjmVar)).zza(zzgbwVar);
        }
        throw new GeneralSecurityException(hx2.q("No Key Format serializer for ", zzgjmVar.toString(), " available"));
    }

    public final boolean zzg(zzgjh zzgjhVar) {
        return this.zzb.containsKey(new zzgjk(zzgjhVar.getClass(), zzgjhVar.zzd(), null));
    }
}
