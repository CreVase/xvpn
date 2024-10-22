package com.google.protobuf;

import defpackage.kr3;
import defpackage.rr3;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class r1 {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    private r1() {
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public static int getTagWireType(int i) {
        return i & 7;
    }

    public static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }

    public static Object readPrimitiveField(m mVar, kr3 kr3Var, rr3 rr3Var) throws IOException {
        switch (q1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[kr3Var.ordinal()]) {
            case 1:
                return Double.valueOf(mVar.readDouble());
            case 2:
                return Float.valueOf(mVar.readFloat());
            case 3:
                return Long.valueOf(mVar.readInt64());
            case 4:
                return Long.valueOf(mVar.readUInt64());
            case 5:
                return Integer.valueOf(mVar.readInt32());
            case 6:
                return Long.valueOf(mVar.readFixed64());
            case 7:
                return Integer.valueOf(mVar.readFixed32());
            case 8:
                return Boolean.valueOf(mVar.readBool());
            case 9:
                return mVar.readBytes();
            case 10:
                return Integer.valueOf(mVar.readUInt32());
            case 11:
                return Integer.valueOf(mVar.readSFixed32());
            case 12:
                return Long.valueOf(mVar.readSFixed64());
            case 13:
                return Integer.valueOf(mVar.readSInt32());
            case 14:
                return Long.valueOf(mVar.readSInt64());
            case 15:
                return rr3Var.readString(mVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
