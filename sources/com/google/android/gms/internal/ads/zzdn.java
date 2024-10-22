package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdn {
    private final zzfvs zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdo zzd;
    private zzdo zze;
    private boolean zzf;

    public zzdn(zzfvs zzfvsVar) {
        this.zza = zzfvsVar;
        zzdo zzdoVar = zzdo.zza;
        this.zzd = zzdoVar;
        this.zze = zzdoVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            int i = 0;
            z = false;
            while (i <= zzi()) {
                int i2 = i + 1;
                if (!this.zzc[i].hasRemaining()) {
                    zzdq zzdqVar = (zzdq) this.zzb.get(i);
                    if (zzdqVar.zzh()) {
                        if (!this.zzc[i].hasRemaining() && i < zzi()) {
                            ((zzdq) this.zzb.get(i2)).zzd();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.zzc[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = zzdq.zza;
                        }
                        long remaining = byteBuffer2.remaining();
                        zzdqVar.zze(byteBuffer2);
                        this.zzc[i] = zzdqVar.zzb();
                        boolean z2 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    }
                }
                i = i2;
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        if (this.zza.size() != zzdnVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzdnVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdo zza(zzdo zzdoVar) throws zzdp {
        if (!zzdoVar.equals(zzdo.zza)) {
            for (int i = 0; i < this.zza.size(); i++) {
                zzdq zzdqVar = (zzdq) this.zza.get(i);
                zzdo zza = zzdqVar.zza(zzdoVar);
                if (zzdqVar.zzg()) {
                    zzdx.zzf(!zza.equals(zzdo.zza));
                    zzdoVar = zza;
                }
            }
            this.zze = zzdoVar;
            return zzdoVar;
        }
        throw new zzdp("Unhandled input format:", zzdoVar);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdq.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdq.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdq zzdqVar = (zzdq) this.zza.get(i);
            zzdqVar.zzc();
            if (zzdqVar.zzg()) {
                this.zzb.add(zzdqVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdq) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzf) {
            this.zzf = true;
            ((zzdq) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzf) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdq zzdqVar = (zzdq) this.zza.get(i);
            zzdqVar.zzc();
            zzdqVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdo zzdoVar = zzdo.zza;
        this.zzd = zzdoVar;
        this.zze = zzdoVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        if (this.zzf && ((zzdq) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }
}
