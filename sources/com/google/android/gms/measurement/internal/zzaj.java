package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
enum zzaj {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');

    private final char zzj;

    zzaj(char c) {
        this.zzj = c;
    }

    public static zzaj zza(char c) {
        for (zzaj zzajVar : values()) {
            if (zzajVar.zzj == c) {
                return zzajVar;
            }
        }
        return UNSET;
    }
}
