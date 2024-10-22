package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class em1 extends IOException {
    public em1(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
