package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class zzum implements zztu, zztt {
    private final zztu[] zza;
    private zztt zze;
    private zzvx zzf;
    private final zzth zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzvq zzh = new zztg(new zzvq[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zztu[] zzg = new zztu[0];

    public zzum(zzth zzthVar, long[] jArr, zztu... zztuVarArr) {
        this.zzi = zzthVar;
        this.zza = zztuVarArr;
        for (int i = 0; i < zztuVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzuk(zztuVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zza(long j, zzlv zzlvVar) {
        zztu zztuVar;
        zztu[] zztuVarArr = this.zzg;
        if (zztuVarArr.length > 0) {
            zztuVar = zztuVarArr[0];
        } else {
            zztuVar = this.zza[0];
        }
        return zztuVar.zza(j, zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zztu zztuVar : this.zzg) {
            long zzd = zztuVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zztu zztuVar2 : this.zzg) {
                        if (zztuVar2 == zztuVar) {
                            break;
                        }
                        if (zztuVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zztuVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zztu[] zztuVarArr = this.zzg;
            if (i < zztuVarArr.length) {
                if (zztuVarArr[i].zze(zze) == zze) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return zze;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final long zzf(zzxk[] zzxkVarArr, boolean[] zArr, zzvo[] zzvoVarArr, boolean[] zArr2, long j) {
        int length;
        zzvo zzvoVar;
        int intValue;
        int length2 = zzxkVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzxkVarArr.length;
            Integer num = null;
            if (i >= length) {
                break;
            }
            zzvo zzvoVar2 = zzvoVarArr[i];
            if (zzvoVar2 != null) {
                num = (Integer) this.zzb.get(zzvoVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i] = intValue;
            zzxk zzxkVar = zzxkVarArr[i];
            if (zzxkVar != null) {
                String str = zzxkVar.zze().zzc;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.zzb.clear();
        zzvo[] zzvoVarArr2 = new zzvo[length];
        zzvo[] zzvoVarArr3 = new zzvo[length];
        zzxk[] zzxkVarArr2 = new zzxk[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < this.zza.length) {
            for (int i3 = 0; i3 < zzxkVarArr.length; i3++) {
                if (iArr[i3] == i2) {
                    zzvoVar = zzvoVarArr[i3];
                } else {
                    zzvoVar = null;
                }
                zzvoVarArr3[i3] = zzvoVar;
                if (iArr2[i3] == i2) {
                    zzxk zzxkVar2 = zzxkVarArr[i3];
                    zzxkVar2.getClass();
                    zzcx zzcxVar = (zzcx) this.zzd.get(zzxkVar2.zze());
                    zzcxVar.getClass();
                    zzxkVarArr2[i3] = new zzuj(zzxkVar2, zzcxVar);
                } else {
                    zzxkVarArr2[i3] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzxk[] zzxkVarArr3 = zzxkVarArr2;
            zzvo[] zzvoVarArr4 = zzvoVarArr3;
            long zzf = this.zza[i2].zzf(zzxkVarArr2, zArr, zzvoVarArr3, zArr2, j2);
            if (i2 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i4 = 0; i4 < zzxkVarArr.length; i4++) {
                boolean z2 = true;
                if (iArr2[i4] == i2) {
                    zzvo zzvoVar3 = zzvoVarArr4[i4];
                    zzvoVar3.getClass();
                    zzvoVarArr2[i4] = zzvoVar3;
                    this.zzb.put(zzvoVar3, Integer.valueOf(i2));
                    z = true;
                } else if (iArr[i4] == i2) {
                    if (zzvoVarArr4[i4] != null) {
                        z2 = false;
                    }
                    zzdx.zzf(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i2]);
            }
            i2++;
            arrayList = arrayList2;
            zzxkVarArr2 = zzxkVarArr3;
            zzvoVarArr3 = zzvoVarArr4;
        }
        System.arraycopy(zzvoVarArr2, 0, zzvoVarArr, 0, length);
        zztu[] zztuVarArr = (zztu[]) arrayList.toArray(new zztu[0]);
        this.zzg = zztuVarArr;
        this.zzh = new zztg(zztuVarArr);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final /* bridge */ /* synthetic */ void zzg(zzvq zzvqVar) {
        zztt zzttVar = this.zze;
        zzttVar.getClass();
        zzttVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zzvx zzh() {
        zzvx zzvxVar = this.zzf;
        zzvxVar.getClass();
        return zzvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zzi(zztu zztuVar) {
        this.zzc.remove(zztuVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zztu zztuVar2 : this.zza) {
            i += zztuVar2.zzh().zzc;
        }
        zzcx[] zzcxVarArr = new zzcx[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zztu[] zztuVarArr = this.zza;
            if (i2 < zztuVarArr.length) {
                zzvx zzh = zztuVarArr[i2].zzh();
                int i4 = zzh.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzcx zzb = zzh.zzb(i5);
                    zzcx zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                    this.zzd.put(zzc, zzb);
                    zzcxVarArr[i3] = zzc;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.zzf = new zzvx(zzcxVarArr);
                zztt zzttVar = this.zze;
                zzttVar.getClass();
                zzttVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzj(long j, boolean z) {
        for (zztu zztuVar : this.zzg) {
            zztuVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zztu[] zztuVarArr = this.zza;
            if (i < zztuVarArr.length) {
                zztuVarArr[i].zzk();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzl(zztt zzttVar, long j) {
        this.zze = zzttVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zztu[] zztuVarArr = this.zza;
            if (i < zztuVarArr.length) {
                zztuVarArr[i].zzl(this, j);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zztu zzn(int i) {
        zztu zztuVar;
        zztu zztuVar2 = this.zza[i];
        if (zztuVar2 instanceof zzuk) {
            zztuVar = ((zzuk) zztuVar2).zza;
            return zztuVar;
        }
        return zztuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final boolean zzo(zzks zzksVar) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i = 0; i < size; i++) {
                ((zztu) this.zzc.get(i)).zzo(zzksVar);
            }
            return false;
        }
        return this.zzh.zzo(zzksVar);
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzvq
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
