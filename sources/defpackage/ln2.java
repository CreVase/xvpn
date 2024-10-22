package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface ln2 {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, sg2 sg2Var, xu0 xu0Var) throws IOException;

    void mergeFrom(Object obj, byte[] bArr, int i, int i2, fg fgVar) throws IOException;

    Object newInstance();

    void writeTo(Object obj, kt3 kt3Var) throws IOException;
}
