package defpackage;

import com.google.protobuf.Option;
import com.google.protobuf.g;
import java.util.List;

/* loaded from: classes2.dex */
public interface sw0 extends zv1 {
    iw0 getCardinality();

    int getCardinalityValue();

    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    String getDefaultValue();

    g getDefaultValueBytes();

    String getJsonName();

    g getJsonNameBytes();

    lw0 getKind();

    int getKindValue();

    String getName();

    g getNameBytes();

    int getNumber();

    int getOneofIndex();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    g getTypeUrlBytes();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();
}
