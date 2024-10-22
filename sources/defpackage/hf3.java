package defpackage;

import com.google.protobuf.Field;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.g;
import java.util.List;

/* loaded from: classes2.dex */
public interface hf3 extends zv1 {
    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    Field getFields(int i);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    g getNameBytes();

    String getOneofs(int i);

    g getOneofsBytes(int i);

    int getOneofsCount();

    List<String> getOneofsList();

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
