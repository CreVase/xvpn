package defpackage;

import com.google.protobuf.Option;
import com.google.protobuf.g;
import java.util.List;

/* loaded from: classes2.dex */
public interface sw1 extends zv1 {
    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    String getName();

    g getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    g getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    g getResponseTypeUrlBytes();

    o43 getSyntax();

    int getSyntaxValue();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();
}
