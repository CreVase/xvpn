package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.o;
import com.google.protobuf.r1;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class fh3 {
    public abstract void addFixed32(Object obj, int i, int i2);

    public abstract void addFixed64(Object obj, int i, long j);

    public abstract void addGroup(Object obj, int i, Object obj2);

    public abstract void addLengthDelimited(Object obj, int i, g gVar);

    public abstract void addVarint(Object obj, int i, long j);

    public abstract Object getBuilderFromMessage(Object obj);

    public abstract Object getFromMessage(Object obj);

    public abstract int getSerializedSize(Object obj);

    public abstract int getSerializedSizeAsMessageSet(Object obj);

    public abstract void makeImmutable(Object obj);

    public abstract Object merge(Object obj, Object obj2);

    public final void mergeFrom(Object obj, sg2 sg2Var) throws IOException {
        o oVar;
        do {
            oVar = (o) sg2Var;
            if (oVar.getFieldNumber() == Integer.MAX_VALUE) {
                return;
            }
        } while (mergeOneFieldFrom(obj, oVar));
    }

    public final boolean mergeOneFieldFrom(Object obj, sg2 sg2Var) throws IOException {
        o oVar = (o) sg2Var;
        int tag = oVar.getTag();
        int tagFieldNumber = r1.getTagFieldNumber(tag);
        int tagWireType = r1.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(obj, tagFieldNumber, oVar.readFixed32());
                                return true;
                            }
                            throw he1.invalidWireType();
                        }
                        return false;
                    }
                    Object newBuilder = newBuilder();
                    int makeTag = r1.makeTag(tagFieldNumber, 4);
                    mergeFrom(newBuilder, oVar);
                    if (makeTag == oVar.getTag()) {
                        addGroup(obj, tagFieldNumber, toImmutable(newBuilder));
                        return true;
                    }
                    throw he1.invalidEndTag();
                }
                addLengthDelimited(obj, tagFieldNumber, oVar.readBytes());
                return true;
            }
            addFixed64(obj, tagFieldNumber, oVar.readFixed64());
            return true;
        }
        addVarint(obj, tagFieldNumber, oVar.readInt64());
        return true;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object obj, Object obj2);

    public abstract void setToMessage(Object obj, Object obj2);

    public abstract boolean shouldDiscardUnknownFields(sg2 sg2Var);

    public abstract Object toImmutable(Object obj);

    public abstract void writeAsMessageSetTo(Object obj, kt3 kt3Var) throws IOException;

    public abstract void writeTo(Object obj, kt3 kt3Var) throws IOException;
}
