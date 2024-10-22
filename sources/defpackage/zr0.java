package defpackage;

import com.google.protobuf.EnumValue;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.g;
import java.util.List;

/* loaded from: classes2.dex */
public interface zr0 extends zv1 {
    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    EnumValue getEnumvalue(int i);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    g getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    o43 getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();
}
