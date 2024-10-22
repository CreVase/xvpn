package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaek {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzaek() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzaej zzaejVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaejVar.zza);
            String str = zzaejVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzaejVar.zzc);
            this.zzb.writeLong(zzaejVar.zzd);
            this.zzb.write(zzaejVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
