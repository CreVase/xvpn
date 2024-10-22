package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public interface yp1 {
    Map<?, ?> forMapData(Object obj);

    qp1 forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
