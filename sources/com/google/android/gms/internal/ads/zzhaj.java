package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class zzhaj implements zzans {
    private static final zzhau zza = zzhau.zzb(zzhaj.class);
    protected final String zzb;
    long zze;
    zzhao zzg;
    private zzant zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    public zzhaj(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        String str;
        if (!this.zzd) {
            try {
                zzhau zzhauVar = zza;
                String str2 = this.zzb;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzhauVar.zza(str);
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzb(zzhao zzhaoVar, ByteBuffer byteBuffer, long j, zzanp zzanpVar) throws IOException {
        this.zze = zzhaoVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzhaoVar;
        zzhaoVar.zze(zzhaoVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzc(zzant zzantVar) {
        this.zzh = zzantVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzhau zzhauVar = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzhauVar.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
