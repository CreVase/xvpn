package defpackage;

/* loaded from: classes2.dex */
public enum zw0 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    zw0(boolean z) {
        this.isList = z;
    }

    public boolean isList() {
        return this.isList;
    }
}
