package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgws extends RuntimeException {
    public zzgws(zzgvj zzgvjVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgul zza() {
        return new zzgul(getMessage());
    }
}
