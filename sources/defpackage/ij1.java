package defpackage;

import com.google.protobuf.g;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public interface ij1 extends cb2 {
    void add(g gVar);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends g> collection);

    List<byte[]> asByteArrayList();

    @Override // defpackage.cb2
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i);

    g getByteString(int i);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    ij1 getUnmodifiableView();

    void mergeFrom(ij1 ij1Var);

    void set(int i, g gVar);

    void set(int i, byte[] bArr);
}
