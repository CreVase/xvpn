package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class t10 extends IOException {
    public t10(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
