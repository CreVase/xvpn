package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ns implements rs {
    private ns() {
    }

    public /* synthetic */ ns(is isVar) {
        this();
    }

    @Override // defpackage.rs
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
