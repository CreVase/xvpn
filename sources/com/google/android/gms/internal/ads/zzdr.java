package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class zzdr implements zzdq {
    protected zzdo zzb;
    protected zzdo zzc;
    private zzdo zzd;
    private zzdo zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdr() {
        ByteBuffer byteBuffer = zzdq.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdo zzdoVar = zzdo.zza;
        this.zzd = zzdoVar;
        this.zze = zzdoVar;
        this.zzb = zzdoVar;
        this.zzc = zzdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final zzdo zza(zzdo zzdoVar) throws zzdp {
        this.zzd = zzdoVar;
        this.zze = zzi(zzdoVar);
        if (zzg()) {
            return this.zze;
        }
        return zzdo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzdq.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzc() {
        this.zzg = zzdq.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzf() {
        zzc();
        this.zzf = zzdq.zza;
        zzdo zzdoVar = zzdo.zza;
        this.zzd = zzdoVar;
        this.zze = zzdoVar;
        this.zzb = zzdoVar;
        this.zzc = zzdoVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public boolean zzg() {
        if (this.zze != zzdo.zza) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public boolean zzh() {
        return this.zzh && this.zzg == zzdq.zza;
    }

    public zzdo zzi(zzdo zzdoVar) throws zzdp {
        throw null;
    }

    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
