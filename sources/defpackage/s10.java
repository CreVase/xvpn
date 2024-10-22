package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class s10 extends IOException {
    private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
    private static final long serialVersionUID = -6947486886997889499L;

    public s10(String str) {
        super(hx2.p("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
    }

    public s10(String str, Throwable th) {
        super(hx2.p("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public s10() {
        super(MESSAGE);
    }

    public s10(Throwable th) {
        super(MESSAGE, th);
    }
}
