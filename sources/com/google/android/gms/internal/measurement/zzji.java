package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzji extends IOException {
    private zzkj zza;

    public zzji(String str) {
        super(str);
        this.zza = null;
    }

    public static zzjh zza() {
        return new zzjh("Protocol message tag had invalid wire type.");
    }

    public static zzji zzb() {
        return new zzji("Protocol message end-group tag did not match expected tag.");
    }

    public static zzji zzc() {
        return new zzji("Protocol message contained an invalid tag (zero).");
    }

    public static zzji zzd() {
        return new zzji("Protocol message had invalid UTF-8.");
    }

    public static zzji zze() {
        return new zzji("CodedInputStream encountered a malformed varint.");
    }

    public static zzji zzf() {
        return new zzji("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzji zzg() {
        return new zzji("Failed to parse the message.");
    }

    public static zzji zzh() {
        return new zzji("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
