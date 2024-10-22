package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class zzgby {
    private final Class zza;
    private zzgbz zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzgmc zze = zzgmc.zza;

    public /* synthetic */ zzgby(Class cls, zzgbx zzgbxVar) {
        this.zza = cls;
    }

    private final zzgby zze(Object obj, Object obj2, zzgpl zzgplVar, boolean z) throws GeneralSecurityException {
        byte[] array;
        if (this.zzb != null) {
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (zzgplVar.zzk() == 3) {
                Integer valueOf = Integer.valueOf(zzgplVar.zza());
                if (zzgplVar.zzf() == zzgqf.RAW) {
                    valueOf = null;
                }
                zzgbe zza = zzgii.zzb().zza(zzgjc.zza(zzgplVar.zzc().zzg(), zzgplVar.zzc().zzf(), zzgplVar.zzc().zzc(), zzgplVar.zzf(), valueOf), zzgch.zza());
                int ordinal = zzgplVar.zzf().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = zzgbc.zza;
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgplVar.zza()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgplVar.zza()).array();
                }
                zzgbz zzgbzVar = new zzgbz(obj, obj2, array, zzgplVar.zzk(), zzgplVar.zzf(), zzgplVar.zza(), zzgplVar.zzc().zzg(), zza);
                ConcurrentMap concurrentMap = this.zzb;
                List list = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzgbzVar);
                zzgcb zzgcbVar = new zzgcb(zzgbzVar.zzg(), null);
                List list2 = (List) concurrentMap.put(zzgcbVar, Collections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(zzgbzVar);
                    concurrentMap.put(zzgcbVar, Collections.unmodifiableList(arrayList2));
                }
                list.add(zzgbzVar);
                if (z) {
                    if (this.zzd == null) {
                        this.zzd = zzgbzVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public final zzgby zza(Object obj, Object obj2, zzgpl zzgplVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgplVar, false);
        return this;
    }

    public final zzgby zzb(Object obj, Object obj2, zzgpl zzgplVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgplVar, true);
        return this;
    }

    public final zzgby zzc(zzgmc zzgmcVar) {
        if (this.zzb != null) {
            this.zze = zzgmcVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzgcd zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzgcd zzgcdVar = new zzgcd(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzgcdVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
