package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgbs {
    private final zzgpm zza;
    private final List zzb;
    private final zzgmc zzc;

    private zzgbs(zzgpm zzgpmVar, List list, zzgmc zzgmcVar) {
        this.zza = zzgpmVar;
        this.zzb = list;
        this.zzc = zzgmcVar;
    }

    public static final zzgbs zza(zzgpm zzgpmVar) throws GeneralSecurityException {
        zzi(zzgpmVar);
        return new zzgbs(zzgpmVar, zzh(zzgpmVar));
    }

    public static final zzgbs zzb(zzgpm zzgpmVar, zzgmc zzgmcVar) throws GeneralSecurityException {
        zzi(zzgpmVar);
        return new zzgbs(zzgpmVar, zzh(zzgpmVar), zzgmcVar);
    }

    public static final zzgbs zzc(zzgbw zzgbwVar) throws GeneralSecurityException {
        zzgbp zzgbpVar = new zzgbp();
        zzgbn zzgbnVar = new zzgbn(zzgbwVar, null);
        zzgbnVar.zze();
        zzgbnVar.zzd();
        zzgbpVar.zza(zzgbnVar);
        return zzgbpVar.zzb();
    }

    private static zzgjc zzf(zzgpl zzgplVar) {
        Integer valueOf;
        int zza = zzgplVar.zza();
        if (zzgplVar.zzf() == zzgqf.RAW) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(zza);
        }
        try {
            return zzgjc.zza(zzgplVar.zzc().zzg(), zzgplVar.zzc().zzf(), zzgplVar.zzc().zzc(), zzgplVar.zzf(), valueOf);
        } catch (GeneralSecurityException e) {
            throw new zzgjq("Creating a protokey serialization failed", e);
        }
    }

    private static Object zzg(zzghl zzghlVar, zzgpl zzgplVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgcg.zzc(zzgplVar.zzc(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzh(zzgpm zzgpmVar) {
        zzgbj zzgbjVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzgpmVar.zza());
        for (zzgpl zzgplVar : zzgpmVar.zzh()) {
            int zza = zzgplVar.zza();
            try {
                zzgbe zza2 = zzgii.zzb().zza(zzf(zzgplVar), zzgch.zza());
                int zzk = zzgplVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzgbjVar = zzgbj.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgbjVar = zzgbj.zzb;
                    }
                } else {
                    zzgbjVar = zzgbj.zza;
                }
                zzgbj zzgbjVar2 = zzgbjVar;
                if (zza == zzgpmVar.zzc()) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new zzgbr(zza2, zzgbjVar2, zza, z, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgpm zzgpmVar) throws GeneralSecurityException {
        if (zzgpmVar != null && zzgpmVar.zza() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object zzj(zzghl zzghlVar, zzgbe zzgbeVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgif.zza().zzc(zzgbeVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        Charset charset = zzgci.zza;
        zzgpm zzgpmVar = this.zza;
        zzgpo zza = zzgpr.zza();
        zza.zzb(zzgpmVar.zzc());
        for (zzgpl zzgplVar : zzgpmVar.zzh()) {
            zzgpp zza2 = zzgpq.zza();
            zza2.zzc(zzgplVar.zzc().zzg());
            zza2.zzd(zzgplVar.zzk());
            zza2.zzb(zzgplVar.zzf());
            zza2.zza(zzgplVar.zza());
            zza.zza((zzgpq) zza2.zzal());
        }
        return ((zzgpr) zza.zzal()).toString();
    }

    public final zzgpm zzd() {
        return this.zza;
    }

    public final Object zze(zzgbb zzgbbVar, Class cls) throws GeneralSecurityException {
        Object obj;
        boolean z;
        Class zzb = zzgcg.zzb(cls);
        if (zzb != null) {
            zzgpm zzgpmVar = this.zza;
            Charset charset = zzgci.zza;
            int zzc = zzgpmVar.zzc();
            int i = 0;
            boolean z2 = false;
            boolean z3 = true;
            for (zzgpl zzgplVar : zzgpmVar.zzh()) {
                if (zzgplVar.zzk() == 3) {
                    if (zzgplVar.zzj()) {
                        if (zzgplVar.zzf() != zzgqf.UNKNOWN_PREFIX) {
                            if (zzgplVar.zzk() != 2) {
                                if (zzgplVar.zza() == zzc) {
                                    if (!z2) {
                                        z2 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (zzgplVar.zzc().zzc() != zzgoy.ASYMMETRIC_PUBLIC) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                z3 &= z;
                                i++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgplVar.zza())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgplVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgplVar.zza())));
                    }
                }
            }
            if (i != 0) {
                if (!z2 && !z3) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                zzgby zzgbyVar = new zzgby(zzb, null);
                zzgbyVar.zzc(this.zzc);
                for (int i2 = 0; i2 < this.zza.zza(); i2++) {
                    zzgpl zze = this.zza.zze(i2);
                    if (zze.zzk() == 3) {
                        zzghl zzghlVar = (zzghl) zzgbbVar;
                        Object zzg = zzg(zzghlVar, zze, zzb);
                        if (this.zzb.get(i2) != null) {
                            obj = zzj(zzghlVar, ((zzgbr) this.zzb.get(i2)).zza(), zzb);
                        } else {
                            obj = null;
                        }
                        if (obj == null && zzg == null) {
                            throw new GeneralSecurityException("Unable to get primitive " + zzb.toString() + " for key of type " + zze.zzc().zzg());
                        }
                        if (zze.zza() == this.zza.zzc()) {
                            zzgbyVar.zzb(obj, zzg, zze);
                        } else {
                            zzgbyVar.zza(obj, zzg, zze);
                        }
                    }
                }
                return zzgif.zza().zzd(zzgbyVar.zzd(), cls);
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzgbs(zzgpm zzgpmVar, List list) {
        this.zza = zzgpmVar;
        this.zzb = list;
        this.zzc = zzgmc.zza;
    }
}
