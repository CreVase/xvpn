package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgji {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgji() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgji zza(zzghp zzghpVar) throws GeneralSecurityException {
        zzgjk zzgjkVar = new zzgjk(zzghpVar.zzd(), zzghpVar.zzc(), null);
        if (this.zzb.containsKey(zzgjkVar)) {
            zzghp zzghpVar2 = (zzghp) this.zzb.get(zzgjkVar);
            if (!zzghpVar2.equals(zzghpVar) || !zzghpVar.equals(zzghpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgjkVar.toString()));
            }
        } else {
            this.zzb.put(zzgjkVar, zzghpVar);
        }
        return this;
    }

    public final zzgji zzb(zzght zzghtVar) throws GeneralSecurityException {
        zzgjm zzgjmVar = new zzgjm(zzghtVar.zzb(), zzghtVar.zzc(), null);
        if (this.zza.containsKey(zzgjmVar)) {
            zzght zzghtVar2 = (zzght) this.zza.get(zzgjmVar);
            if (!zzghtVar2.equals(zzghtVar) || !zzghtVar.equals(zzghtVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgjmVar.toString()));
            }
        } else {
            this.zza.put(zzgjmVar, zzghtVar);
        }
        return this;
    }

    public final zzgji zzc(zzgim zzgimVar) throws GeneralSecurityException {
        zzgjk zzgjkVar = new zzgjk(zzgimVar.zzc(), zzgimVar.zzb(), null);
        if (this.zzd.containsKey(zzgjkVar)) {
            zzgim zzgimVar2 = (zzgim) this.zzd.get(zzgjkVar);
            if (!zzgimVar2.equals(zzgimVar) || !zzgimVar.equals(zzgimVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgjkVar.toString()));
            }
        } else {
            this.zzd.put(zzgjkVar, zzgimVar);
        }
        return this;
    }

    public final zzgji zzd(zzgiq zzgiqVar) throws GeneralSecurityException {
        zzgjm zzgjmVar = new zzgjm(zzgiqVar.zzc(), zzgiqVar.zzd(), null);
        if (this.zzc.containsKey(zzgjmVar)) {
            zzgiq zzgiqVar2 = (zzgiq) this.zzc.get(zzgjmVar);
            if (!zzgiqVar2.equals(zzgiqVar) || !zzgiqVar.equals(zzgiqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgjmVar.toString()));
            }
        } else {
            this.zzc.put(zzgjmVar, zzgiqVar);
        }
        return this;
    }

    public zzgji(zzgjo zzgjoVar) {
        this.zza = new HashMap(zzgjo.zzd(zzgjoVar));
        this.zzb = new HashMap(zzgjo.zzc(zzgjoVar));
        this.zzc = new HashMap(zzgjo.zzf(zzgjoVar));
        this.zzd = new HashMap(zzgjo.zze(zzgjoVar));
    }
}
