package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.protobuf.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzavz {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(v.DEFAULT_BUFFER_SIZE);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        try {
            this.zzb.close();
        } catch (IOException e) {
            zzcat.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zza.close();
            return this.zza.toString();
        } catch (IOException e2) {
            zzcat.zzh("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
