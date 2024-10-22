package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum nr3 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(vs.f4885b),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f3526a;

    nr3(Serializable serializable) {
        this.f3526a = serializable;
    }
}
