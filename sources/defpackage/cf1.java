package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum cf1 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(vs.class, vs.f4885b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f625a;

    cf1(Class cls, Serializable serializable) {
        this.f625a = serializable;
    }
}
