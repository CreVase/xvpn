package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public interface AJ {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A4N(int i, int i2, int i3) throws AI;

    ByteBuffer A7O();

    int A7P();

    int A7Q();

    int A7R();

    boolean A8l();

    boolean A8q();

    void AE6();

    void AE7(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
