package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum zzmx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzhm.zza),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzmx(Object obj) {
        this.zzk = obj;
    }
}
