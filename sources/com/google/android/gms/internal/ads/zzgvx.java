package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgvx {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgvx() {
    }

    public static /* bridge */ /* synthetic */ zzgsr zza(zzgvx zzgvxVar, zzgsr zzgsrVar, zzgsr zzgsrVar2) {
        zzgvxVar.zzb(zzgsrVar);
        zzgvxVar.zzb(zzgsrVar2);
        zzgsr zzgsrVar3 = (zzgsr) zzgvxVar.zza.pop();
        while (!zzgvxVar.zza.isEmpty()) {
            zzgsrVar3 = new zzgwb((zzgsr) zzgvxVar.zza.pop(), zzgsrVar3);
        }
        return zzgsrVar3;
    }

    private final void zzb(zzgsr zzgsrVar) {
        zzgsr zzgsrVar2;
        zzgsr zzgsrVar3;
        if (zzgsrVar.zzh()) {
            int zzc = zzc(zzgsrVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzgwb.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzgsr) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgwb.zzc(zzc);
                zzgsr zzgsrVar4 = (zzgsr) this.zza.pop();
                while (true) {
                    if (this.zza.isEmpty() || ((zzgsr) this.zza.peek()).zzd() >= zzc3) {
                        break;
                    } else {
                        zzgsrVar4 = new zzgwb((zzgsr) this.zza.pop(), zzgsrVar4);
                    }
                }
                zzgwb zzgwbVar = new zzgwb(zzgsrVar4, zzgsrVar);
                while (!this.zza.isEmpty()) {
                    int zzc4 = zzc(zzgwbVar.zzd()) + 1;
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzgsr) arrayDeque2.peek()).zzd() >= zzgwb.zzc(zzc4)) {
                        break;
                    } else {
                        zzgwbVar = new zzgwb((zzgsr) this.zza.pop(), zzgwbVar);
                    }
                }
                this.zza.push(zzgwbVar);
                return;
            }
            this.zza.push(zzgsrVar);
            return;
        }
        if (zzgsrVar instanceof zzgwb) {
            zzgwb zzgwbVar2 = (zzgwb) zzgsrVar;
            zzgsrVar2 = zzgwbVar2.zzd;
            zzb(zzgsrVar2);
            zzgsrVar3 = zzgwbVar2.zze;
            zzb(zzgsrVar3);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgsrVar.getClass())));
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgwb.zza, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzgvx(zzgvw zzgvwVar) {
    }
}
