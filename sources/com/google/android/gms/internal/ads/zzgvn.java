package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzgvn implements zzgwc {
    private final zzgvj zza;
    private final zzgwt zzb;
    private final boolean zzc;
    private final zzgtm zzd;

    private zzgvn(zzgwt zzgwtVar, zzgtm zzgtmVar, zzgvj zzgvjVar) {
        this.zzb = zzgwtVar;
        this.zzc = zzgtmVar.zzh(zzgvjVar);
        this.zzd = zzgtmVar;
        this.zza = zzgvjVar;
    }

    public static zzgvn zzc(zzgwt zzgwtVar, zzgtm zzgtmVar, zzgvj zzgvjVar) {
        return new zzgvn(zzgwtVar, zzgtmVar, zzgvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final int zza(Object obj) {
        zzgwt zzgwtVar = this.zzb;
        int zzb = zzgwtVar.zzb(zzgwtVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final Object zze() {
        zzgvj zzgvjVar = this.zza;
        if (zzgvjVar instanceof zzgtz) {
            return ((zzgtz) zzgvjVar).zzaD();
        }
        return zzgvjVar.zzaP().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzg(Object obj, Object obj2) {
        zzgwe.zzq(this.zzb, obj, obj2);
        if (!this.zzc) {
            return;
        }
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzh(Object obj, zzgvu zzgvuVar, zzgtl zzgtlVar) throws IOException {
        boolean zzO;
        zzgwt zzgwtVar = this.zzb;
        Object zzc = zzgwtVar.zzc(obj);
        zzgtm zzgtmVar = this.zzd;
        zzgtq zzb = zzgtmVar.zzb(obj);
        while (zzgvuVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgvuVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgtmVar.zzc(zzgtlVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgtmVar.zzf(zzgvuVar, zzc2, zzgtlVar, zzb);
                        } else {
                            zzO = zzgwtVar.zzp(zzc, zzgvuVar);
                        }
                    } else {
                        zzO = zzgvuVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    Object obj2 = null;
                    zzgsr zzgsrVar = null;
                    int i = 0;
                    while (zzgvuVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgvuVar.zzd();
                        if (zzd2 == 16) {
                            i = zzgvuVar.zzj();
                            obj2 = zzgtmVar.zzc(zzgtlVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgtmVar.zzf(zzgvuVar, obj2, zzgtlVar, zzb);
                            } else {
                                zzgsrVar = zzgvuVar.zzp();
                            }
                        } else if (!zzgvuVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgvuVar.zzd() == 12) {
                        if (zzgsrVar != null) {
                            if (obj2 != null) {
                                zzgtmVar.zzg(zzgsrVar, obj2, zzgtlVar, zzb);
                            } else {
                                zzgwtVar.zzk(zzc, i, zzgsrVar);
                            }
                        }
                    } else {
                        throw zzgul.zzb();
                    }
                }
            } finally {
                zzgwtVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgsd zzgsdVar) throws IOException {
        zzgtz zzgtzVar = (zzgtz) obj;
        if (zzgtzVar.zzc == zzgwu.zzc()) {
            zzgtzVar.zzc = zzgwu.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final boolean zzj(Object obj, Object obj2) {
        zzgwt zzgwtVar = this.zzb;
        if (!zzgwtVar.zzd(obj).equals(zzgwtVar.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    public final void zzm(Object obj, zzgth zzgthVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
