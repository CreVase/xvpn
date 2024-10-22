package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.r1;
import com.google.protobuf.v;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rp1 {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final qp1 metadata;
    private final Object value;

    private rp1(kr3 kr3Var, Object obj, kr3 kr3Var2, Object obj2) {
        this.metadata = new qp1(kr3Var, obj, kr3Var2, obj2);
        this.key = obj;
        this.value = obj2;
    }

    public static <K, V> int computeSerializedSize(qp1 qp1Var, K k, V v) {
        return ww0.computeElementSize(qp1Var.valueType, 2, v) + ww0.computeElementSize(qp1Var.keyType, 1, k);
    }

    public static <K, V> rp1 newDefaultInstance(kr3 kr3Var, K k, kr3 kr3Var2, V v) {
        return new rp1(kr3Var, k, kr3Var2, v);
    }

    public static <T> T parseField(m mVar, xu0 xu0Var, kr3 kr3Var, T t) throws IOException {
        int i = pp1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[kr3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return (T) ww0.readPrimitiveField(mVar, kr3Var, true);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return (T) Integer.valueOf(mVar.readEnum());
        }
        xv1 builder = ((yv1) t).toBuilder();
        mVar.readMessage(builder, xu0Var);
        return (T) builder.buildPartial();
    }

    public static <K, V> void writeTo(v vVar, qp1 qp1Var, K k, V v) throws IOException {
        ww0.writeElement(vVar, qp1Var.keyType, 1, k);
        ww0.writeElement(vVar, qp1Var.valueType, 2, v);
    }

    public int computeMessageSize(int i, Object obj, Object obj2) {
        return v.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2)) + v.computeTagSize(i);
    }

    public Object getKey() {
        return this.key;
    }

    public qp1 getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry<Object, Object> parseEntry(g gVar, xu0 xu0Var) throws IOException {
        return parseEntry(gVar.newCodedInput(), this.metadata, xu0Var);
    }

    public void parseInto(wp1 wp1Var, m mVar, xu0 xu0Var) throws IOException {
        int pushLimit = mVar.pushLimit(mVar.readRawVarint32());
        qp1 qp1Var = this.metadata;
        Object obj = qp1Var.defaultKey;
        Object obj2 = qp1Var.defaultValue;
        while (true) {
            int readTag = mVar.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == r1.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(mVar, xu0Var, this.metadata.keyType, obj);
            } else if (readTag == r1.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(mVar, xu0Var, this.metadata.valueType, obj2);
            } else if (!mVar.skipField(readTag)) {
                break;
            }
        }
        mVar.checkLastTagWas(0);
        mVar.popLimit(pushLimit);
        wp1Var.put(obj, obj2);
    }

    public void serializeTo(v vVar, int i, Object obj, Object obj2) throws IOException {
        vVar.writeTag(i, 2);
        vVar.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(vVar, this.metadata, obj, obj2);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(m mVar, qp1 qp1Var, xu0 xu0Var) throws IOException {
        Object obj = qp1Var.defaultKey;
        Object obj2 = qp1Var.defaultValue;
        while (true) {
            int readTag = mVar.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == r1.makeTag(1, qp1Var.keyType.getWireType())) {
                obj = parseField(mVar, xu0Var, qp1Var.keyType, obj);
            } else if (readTag == r1.makeTag(2, qp1Var.valueType.getWireType())) {
                obj2 = parseField(mVar, xu0Var, qp1Var.valueType, obj2);
            } else if (!mVar.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private rp1(qp1 qp1Var, Object obj, Object obj2) {
        this.metadata = qp1Var;
        this.key = obj;
        this.value = obj2;
    }
}
