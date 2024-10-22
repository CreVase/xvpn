package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzano implements zzanp {
    private static final Logger zzb = Logger.getLogger(zzano.class.getName());
    final ThreadLocal zza = new zzann(this);

    public abstract zzans zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzanp
    public final zzans zzb(zzhao zzhaoVar, zzant zzantVar) throws IOException {
        int zza;
        long j;
        String str;
        long zzb2 = zzhaoVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhaoVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzanr.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhaoVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        j = zzanr.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else if (zze == 0) {
                        j = zzhaoVar.zzc() - zzhaoVar.zzb();
                    } else {
                        j = zze - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhaoVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    if (zzantVar instanceof zzans) {
                        str = ((zzans) zzantVar).zza();
                    } else {
                        str = "";
                    }
                    zzans zza2 = zza(str2, bArr, str);
                    zza2.zzc(zzantVar);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhaoVar, (ByteBuffer) this.zza.get(), j2, this);
                    return zza2;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (zza >= 0);
        zzhaoVar.zze(zzb2);
        throw new EOFException();
    }
}
