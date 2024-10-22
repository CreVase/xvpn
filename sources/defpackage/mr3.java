package defpackage;

import com.google.protobuf.g;

/* loaded from: classes2.dex */
public enum mr3 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(g.EMPTY),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    mr3(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
