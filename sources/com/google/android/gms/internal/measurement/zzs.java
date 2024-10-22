package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    private final int zzg;

    zzs(int i) {
        this.zzg = i;
    }

    public static zzs zza(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        return INFO;
                    }
                    return ERROR;
                }
                return WARN;
            }
            return DEBUG;
        }
        return VERBOSE;
    }
}
