package defpackage;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class wu0 {
    private final int number;
    private final Object object;

    public wu0(Object obj, int i) {
        this.object = obj;
        this.number = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wu0)) {
            return false;
        }
        wu0 wu0Var = (wu0) obj;
        if (this.object != wu0Var.object || this.number != wu0Var.number) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (System.identityHashCode(this.object) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.number;
    }
}
