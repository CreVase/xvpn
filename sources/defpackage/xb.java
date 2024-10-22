package defpackage;

import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.g;
import java.util.List;

/* loaded from: classes2.dex */
public interface xb extends zv1 {
    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    Method getMethods(int i);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    g getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    o43 getSyntax();

    int getSyntaxValue();

    String getVersion();

    g getVersionBytes();

    boolean hasSourceContext();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();
}
