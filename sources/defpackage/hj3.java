package defpackage;

import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import com.google.protobuf.g;

/* loaded from: classes2.dex */
public interface hj3 extends zv1 {
    boolean getBoolValue();

    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    ej3 getKindCase();

    ListValue getListValue();

    r12 getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    g getStringValueBytes();

    Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();
}
