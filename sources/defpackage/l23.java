package defpackage;

import com.google.protobuf.Value;
import java.util.Map;

/* loaded from: classes2.dex */
public interface l23 extends zv1 {
    boolean containsFields(String str);

    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();
}
