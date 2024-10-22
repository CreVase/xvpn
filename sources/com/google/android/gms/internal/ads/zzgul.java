package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzgul extends IOException {
    private zzgvj zza;
    private boolean zzb;

    public zzgul(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzguk zza() {
        return new zzguk("Protocol message tag had invalid wire type.");
    }

    public static zzgul zzb() {
        return new zzgul("Protocol message end-group tag did not match expected tag.");
    }

    public static zzgul zzc() {
        return new zzgul("Protocol message contained an invalid tag (zero).");
    }

    public static zzgul zzd() {
        return new zzgul("Protocol message had invalid UTF-8.");
    }

    public static zzgul zze() {
        return new zzgul("CodedInputStream encountered a malformed varint.");
    }

    public static zzgul zzf() {
        return new zzgul("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgul zzg() {
        return new zzgul("Failed to parse the message.");
    }

    public static zzgul zzi() {
        return new zzgul("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzgul zzj() {
        return new zzgul("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgul zzh(zzgvj zzgvjVar) {
        this.zza = zzgvjVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzgul(String str) {
        super(str);
        this.zza = null;
    }
}
