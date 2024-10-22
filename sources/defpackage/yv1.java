package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.v;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface yv1 extends zv1 {
    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    s42 getParserForType();

    int getSerializedSize();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();

    xv1 newBuilderForType();

    xv1 toBuilder();

    byte[] toByteArray();

    g toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(v vVar) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
