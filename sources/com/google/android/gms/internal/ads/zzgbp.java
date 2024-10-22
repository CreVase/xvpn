package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgbp {
    private final List zza = new ArrayList();
    private final zzgmc zzb = zzgmc.zza;
    private boolean zzc = false;

    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgbn) it.next()).zza = false;
        }
    }

    public final zzgbp zza(zzgbn zzgbnVar) {
        zzgbp zzgbpVar;
        boolean z;
        zzgbpVar = zzgbnVar.zzf;
        if (zzgbpVar == null) {
            z = zzgbnVar.zza;
            if (z) {
                zzd();
            }
            zzgbnVar.zzf = this;
            this.zza.add(zzgbnVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgbs zzb() throws GeneralSecurityException {
        zzgbo zzgboVar;
        zzgbo zzgboVar2;
        zzgbo zzgboVar3;
        int i;
        zzgbw zzgbwVar;
        boolean z;
        zzgbj zzgbjVar;
        zzgbo zzgboVar4;
        zzgbo zzgboVar5;
        zzgbo zzgboVar6;
        zzgbo zzgboVar7;
        zzgbj unused;
        zzgbo unused2;
        if (!this.zzc) {
            char c = 1;
            this.zzc = true;
            List list = this.zza;
            zzgpj zzd = zzgpm.zzd();
            int i2 = 0;
            while (i2 < list.size() - 1) {
                int i3 = i2 + 1;
                zzgboVar4 = ((zzgbn) list.get(i2)).zze;
                zzgboVar5 = zzgbo.zza;
                if (zzgboVar4 == zzgboVar5) {
                    zzgboVar6 = ((zzgbn) list.get(i3)).zze;
                    zzgboVar7 = zzgbo.zza;
                    if (zzgboVar6 != zzgboVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                i2 = i3;
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzgbn zzgbnVar : this.zza) {
                unused = zzgbnVar.zzb;
                zzgboVar = zzgbnVar.zze;
                if (zzgboVar != null) {
                    zzgboVar2 = zzgbnVar.zze;
                    zzgboVar3 = zzgbo.zza;
                    int i4 = 3;
                    if (zzgboVar2 == zzgboVar3) {
                        i = 0;
                        while (true) {
                            if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[4];
                            int i5 = 0;
                            while (i5 == 0) {
                                secureRandom.nextBytes(bArr);
                                int i6 = bArr[0] & 255;
                                i5 = ((bArr[c] & 255) << 16) | (i6 << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                                c = 1;
                            }
                            i = i5;
                        }
                    } else {
                        unused2 = zzgbnVar.zze;
                        i = 0;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgbn.zza(zzgbnVar);
                        zzgbwVar = zzgbnVar.zzd;
                        zzgbj zzc = zzgbnVar.zzc();
                        zzgbj zzgbjVar2 = zzgbj.zza;
                        if (!zzgbjVar2.equals(zzc)) {
                            if (zzgbj.zzb.equals(zzc)) {
                                i4 = 4;
                            } else if (zzgbj.zzc.equals(zzc)) {
                                i4 = 5;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                        }
                        if (!(zzgbwVar instanceof zzghy)) {
                            zzgjd zzgjdVar = (zzgjd) zzgii.zzb().zzc(zzgbwVar, zzgjd.class);
                            zzgoz zza = zzgcg.zza(zzgjdVar.zzb());
                            zzgpk zzd2 = zzgpl.zzd();
                            zzd2.zzb(i);
                            zzd2.zzd(i4);
                            zzd2.zza(zza);
                            zzd2.zzc(zzgjdVar.zzb().zze());
                            zzd.zza((zzgpl) zzd2.zzal());
                            z = zzgbnVar.zza;
                            if (z) {
                                if (num == null) {
                                    zzgbjVar = zzgbnVar.zzb;
                                    if (zzgbjVar == zzgbjVar2) {
                                        num = valueOf;
                                    } else {
                                        throw new GeneralSecurityException("Primary key is not enabled");
                                    }
                                } else {
                                    throw new GeneralSecurityException("Two primaries were set");
                                }
                            }
                            c = 1;
                        } else {
                            throw null;
                        }
                    } else {
                        throw new GeneralSecurityException(p71.k("Id ", i, " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzd.zzb(num.intValue());
                return zzgbs.zzb((zzgpm) zzd.zzal(), this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
