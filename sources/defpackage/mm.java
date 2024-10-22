package defpackage;

/* loaded from: classes.dex */
public final class mm {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mm.class != obj.getClass()) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
