package com.google.protobuf;

import defpackage.ax0;
import defpackage.fg;
import defpackage.fh3;
import defpackage.ga2;
import defpackage.gh3;
import defpackage.he1;
import defpackage.hx2;
import defpackage.ja2;
import defpackage.jt3;
import defpackage.kr3;
import defpackage.kt3;
import defpackage.ln2;
import defpackage.mr3;
import defpackage.n23;
import defpackage.ng2;
import defpackage.pw0;
import defpackage.qp1;
import defpackage.rn2;
import defpackage.rp1;
import defpackage.sd1;
import defpackage.sg2;
import defpackage.ti3;
import defpackage.ts;
import defpackage.tv1;
import defpackage.vk1;
import defpackage.wd1;
import defpackage.xu0;
import defpackage.xz1;
import defpackage.yp1;
import defpackage.yv1;
import defpackage.yz1;
import defpackage.zp1;
import defpackage.zu0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class v0 implements ln2 {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final yv1 defaultInstance;
    private final zu0 extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final vk1 listFieldSchema;
    private final boolean lite;
    private final yp1 mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final xz1 newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final fh3 unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = n1.getUnsafe();

    private v0(int[] iArr, Object[] objArr, int i, int i2, yv1 yv1Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, xz1 xz1Var, vk1 vk1Var, fh3 fh3Var, zu0 zu0Var, yp1 yp1Var) {
        boolean z3;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = yv1Var instanceof o0;
        this.proto3 = z;
        if (zu0Var != null && zu0Var.hasExtensions(yv1Var)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.hasExtensions = z3;
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = xz1Var;
        this.listFieldSchema = vk1Var;
        this.unknownFieldSchema = fh3Var;
        this.extensionSchema = zu0Var;
        this.defaultInstance = yv1Var;
        this.mapFieldSchema = yp1Var;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i) {
        if (isFieldPresent(obj, i) == isFieldPresent(obj2, i)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t, long j) {
        return n1.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, qp1 qp1Var, Map<K, V> map, fg fgVar) throws IOException {
        int i3;
        int decodeVarint32 = e.decodeVarint32(bArr, i, fgVar);
        int i4 = fgVar.int1;
        if (i4 >= 0 && i4 <= i2 - decodeVarint32) {
            int i5 = decodeVarint32 + i4;
            Object obj = qp1Var.defaultKey;
            Object obj2 = qp1Var.defaultValue;
            while (decodeVarint32 < i5) {
                int i6 = decodeVarint32 + 1;
                byte b2 = bArr[decodeVarint32];
                if (b2 < 0) {
                    i3 = e.decodeVarint32(b2, bArr, i6, fgVar);
                    b2 = fgVar.int1;
                } else {
                    i3 = i6;
                }
                int i7 = b2 >>> 3;
                int i8 = b2 & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == qp1Var.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, qp1Var.valueType, qp1Var.defaultValue.getClass(), fgVar);
                        obj2 = fgVar.object1;
                    }
                    decodeVarint32 = e.skipField(b2, bArr, i3, i2, fgVar);
                } else if (i8 == qp1Var.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, qp1Var.keyType, null, fgVar);
                    obj = fgVar.object1;
                } else {
                    decodeVarint32 = e.skipField(b2, bArr, i3, i2, fgVar);
                }
            }
            if (decodeVarint32 == i5) {
                map.put(obj, obj2);
                return i5;
            }
            throw he1.parseFailure();
        }
        throw he1.truncatedMessage();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private int decodeMapEntryValue(byte[] bArr, int i, int i2, kr3 kr3Var, Class<?> cls, fg fgVar) throws IOException {
        boolean z;
        switch (u0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[kr3Var.ordinal()]) {
            case 1:
                int decodeVarint64 = e.decodeVarint64(bArr, i, fgVar);
                if (fgVar.long1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                fgVar.object1 = Boolean.valueOf(z);
                return decodeVarint64;
            case 2:
                return e.decodeBytes(bArr, i, fgVar);
            case 3:
                fgVar.object1 = Double.valueOf(e.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                fgVar.object1 = Integer.valueOf(e.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                fgVar.object1 = Long.valueOf(e.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                fgVar.object1 = Float.valueOf(e.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = e.decodeVarint32(bArr, i, fgVar);
                fgVar.object1 = Integer.valueOf(fgVar.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = e.decodeVarint64(bArr, i, fgVar);
                fgVar.object1 = Long.valueOf(fgVar.long1);
                return decodeVarint642;
            case 14:
                return e.decodeMessageField(ja2.getInstance().schemaFor((Class) cls), bArr, i, i2, fgVar);
            case 15:
                int decodeVarint322 = e.decodeVarint32(bArr, i, fgVar);
                fgVar.object1 = Integer.valueOf(m.decodeZigZag32(fgVar.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = e.decodeVarint64(bArr, i, fgVar);
                fgVar.object1 = Long.valueOf(m.decodeZigZag64(fgVar.long1));
                return decodeVarint643;
            case 17:
                return e.decodeStringRequireUtf8(bArr, i, fgVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return n1.getDouble(t, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, fh3 fh3Var, Object obj2) {
        int numberAt = numberAt(i);
        Object object = n1.getObject(obj, offset(typeAndOffsetAt(i)));
        if (object == null) {
            return ub;
        }
        sd1 enumFieldVerifier = getEnumFieldVerifier(i);
        if (enumFieldVerifier == null) {
            return ub;
        }
        return (UB) filterUnknownEnumMap(i, numberAt, ((zp1) this.mapFieldSchema).forMutableMapData(object), enumFieldVerifier, ub, fh3Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, sd1 sd1Var, UB ub, fh3 fh3Var, Object obj) {
        qp1 forMapMetadata = ((zp1) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!sd1Var.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = (UB) fh3Var.getBuilderFromMessage(obj);
                }
                ts newCodedBuilder = g.newCodedBuilder(rp1.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    rp1.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    fh3Var.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return n1.getFloat(t, j);
    }

    private sd1 getEnumFieldVerifier(int i) {
        return (sd1) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private ln2 getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        ln2 ln2Var = (ln2) this.objects[i2];
        if (ln2Var != null) {
            return ln2Var;
        }
        ln2 schemaFor = ja2.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    public static gh3 getMutableUnknownFields(Object obj) {
        o0 o0Var = (o0) obj;
        gh3 gh3Var = o0Var.unknownFields;
        if (gh3Var == gh3.getDefaultInstance()) {
            gh3 newInstance = gh3.newInstance();
            o0Var.unknownFields = newInstance;
            return newInstance;
        }
        return gh3Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0062. Please report as an issue. */
    private int getSerializedSizeProto2(Object obj) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeStringSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i4);
            int numberAt = numberAt(i4);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i = this.buffer[i4 + 2];
                int i8 = i3 & i;
                i2 = 1 << (i >>> 20);
                if (i8 != i6) {
                    i7 = unsafe.getInt(obj, i8);
                    i6 = i8;
                }
            } else {
                if (this.useCachedSizeField && type >= ax0.DOUBLE_LIST_PACKED.id() && type <= ax0.SINT64_LIST_PACKED.id()) {
                    i = i3 & this.buffer[i4 + 2];
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            int i9 = i6;
            int i10 = i7;
            switch (type) {
                case 0:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeDoubleSize(numberAt, 0.0d);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeFloatSize(numberAt, 0.0f);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeUInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeFixed64Size(numberAt, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeFixed32Size(numberAt, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 7:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeBoolSize(numberAt, true);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 8:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, offset);
                        if (object instanceof g) {
                            computeStringSize = v.computeBytesSize(numberAt, (g) object);
                        } else {
                            computeStringSize = v.computeStringSize(numberAt, (String) object);
                        }
                        i5 += computeStringSize;
                        break;
                    }
                case 9:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = rn2.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 10:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeBytesSize(numberAt, (g) unsafe.getObject(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 11:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeUInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 12:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeEnumSize(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 13:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSFixed32Size(numberAt, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 14:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSFixed64Size(numberAt, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 15:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 16:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 17:
                    if ((i10 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = v.computeGroupSize(numberAt, (yv1) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 18:
                    computeDoubleSize = rn2.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = rn2.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = rn2.computeSizeInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = rn2.computeSizeUInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = rn2.computeSizeInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = rn2.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = rn2.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = rn2.computeSizeBoolList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = rn2.computeSizeStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i5 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = rn2.computeSizeMessageList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                    i5 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = rn2.computeSizeByteStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i5 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = rn2.computeSizeUInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = rn2.computeSizeEnumList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = rn2.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = rn2.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = rn2.computeSizeSInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = rn2.computeSizeSInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = rn2.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = rn2.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = rn2.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = rn2.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = rn2.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = rn2.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = rn2.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = rn2.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    computeDoubleSize = rn2.computeSizeGroupList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                    i5 += computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = ((zp1) this.mapFieldSchema).getSerializedSize(numberAt, unsafe.getObject(obj, offset), getMapFieldDefaultEntry(i4));
                    i5 += computeDoubleSize;
                    break;
                case 51:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeDoubleSize(numberAt, 0.0d);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 52:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeFloatSize(numberAt, 0.0f);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 53:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 54:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 55:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 56:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeFixed64Size(numberAt, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 57:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeFixed32Size(numberAt, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 58:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeBoolSize(numberAt, true);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 59:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, offset);
                        if (object2 instanceof g) {
                            computeStringSize = v.computeBytesSize(numberAt, (g) object2);
                        } else {
                            computeStringSize = v.computeStringSize(numberAt, (String) object2);
                        }
                        i5 += computeStringSize;
                        break;
                    }
                case 60:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = rn2.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 61:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeBytesSize(numberAt, (g) unsafe.getObject(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 62:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 63:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 64:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSFixed32Size(numberAt, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 65:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSFixed64Size(numberAt, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 66:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 67:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 68:
                    if (!isOneofPresent(obj, numberAt, i4)) {
                        break;
                    } else {
                        computeDoubleSize = v.computeGroupSize(numberAt, (yv1) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeDoubleSize;
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
            i6 = i9;
            i7 = i10;
        }
        int unknownFieldsSerializedSize = i5 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003a. Please report as an issue. */
    private int getSerializedSizeProto3(Object obj) {
        int i;
        int computeDoubleSize;
        int computeStringSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.buffer.length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            if (type >= ax0.DOUBLE_LIST_PACKED.id() && type <= ax0.SINT64_LIST_PACKED.id()) {
                i = this.buffer[i3 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (type) {
                case 0:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeDoubleSize(numberAt, 0.0d);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeFloatSize(numberAt, 0.0f);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeInt64Size(numberAt, n1.getLong(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeUInt64Size(numberAt, n1.getLong(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeInt32Size(numberAt, n1.getInt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeBoolSize(numberAt, true);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(obj, i3)) {
                        Object object = n1.getObject(obj, offset);
                        if (object instanceof g) {
                            computeStringSize = v.computeBytesSize(numberAt, (g) object);
                        } else {
                            computeStringSize = v.computeStringSize(numberAt, (String) object);
                        }
                        i2 = computeStringSize + i2;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = rn2.computeSizeMessage(numberAt, n1.getObject(obj, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeBytesSize(numberAt, (g) n1.getObject(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeUInt32Size(numberAt, n1.getInt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeEnumSize(numberAt, n1.getInt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeSFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeSFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeSInt32Size(numberAt, n1.getInt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeSInt64Size(numberAt, n1.getLong(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(obj, i3)) {
                        computeDoubleSize = v.computeGroupSize(numberAt, (yv1) n1.getObject(obj, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = rn2.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = rn2.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = rn2.computeSizeInt64List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = rn2.computeSizeUInt64List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = rn2.computeSizeInt32List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = rn2.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = rn2.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = rn2.computeSizeBoolList(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = rn2.computeSizeStringList(numberAt, listAt(obj, offset));
                    i2 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = rn2.computeSizeMessageList(numberAt, listAt(obj, offset), getMessageFieldSchema(i3));
                    i2 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = rn2.computeSizeByteStringList(numberAt, listAt(obj, offset));
                    i2 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = rn2.computeSizeUInt32List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = rn2.computeSizeEnumList(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = rn2.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = rn2.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = rn2.computeSizeSInt32List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = rn2.computeSizeSInt64List(numberAt, listAt(obj, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = rn2.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = rn2.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = rn2.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = rn2.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = rn2.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = rn2.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = rn2.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = rn2.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = rn2.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = v.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = v.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i2;
                        break;
                    }
                case 49:
                    computeDoubleSize = rn2.computeSizeGroupList(numberAt, listAt(obj, offset), getMessageFieldSchema(i3));
                    i2 += computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = ((zp1) this.mapFieldSchema).getSerializedSize(numberAt, n1.getObject(obj, offset), getMapFieldDefaultEntry(i3));
                    i2 += computeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeDoubleSize(numberAt, 0.0d);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeFloatSize(numberAt, 0.0f);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeBoolSize(numberAt, true);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        Object object2 = n1.getObject(obj, offset);
                        if (object2 instanceof g) {
                            computeStringSize = v.computeBytesSize(numberAt, (g) object2);
                        } else {
                            computeStringSize = v.computeStringSize(numberAt, (String) object2);
                        }
                        i2 = computeStringSize + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = rn2.computeSizeMessage(numberAt, n1.getObject(obj, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeBytesSize(numberAt, (g) n1.getObject(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeSFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeSFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        computeDoubleSize = v.computeGroupSize(numberAt, (yv1) n1.getObject(obj, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i2 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(fh3 fh3Var, Object obj) {
        return fh3Var.getSerializedSize(fh3Var.getFromMessage(obj));
    }

    private static <T> int intAt(T t, long j) {
        return n1.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) n1.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        ln2 messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i, int i2) {
        Map<?, ?> forMapData = ((zp1) this.mapFieldSchema).forMapData(n1.getObject(obj, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (((zp1) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != mr3.MESSAGE) {
            return true;
        }
        ln2 ln2Var = null;
        for (Object obj2 : forMapData.values()) {
            if (ln2Var == null) {
                ln2Var = ja2.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!ln2Var.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof o0) {
            return ((o0) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        if (n1.getInt(obj, presenceMaskAndOffsetAt) == n1.getInt(obj2, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(Object obj, int i, int i2) {
        if (n1.getInt(obj, presenceMaskAndOffsetAt(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j) {
        return (List) n1.getObject(obj, j);
    }

    private static <T> long longAt(T t, long j) {
        return n1.getLong(t, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x008d, code lost:            r0 = r18.checkInitializedCount;     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0091, code lost:            if (r0 >= r18.repeatedFieldOffsetStart) goto L250;     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0093, code lost:            r6 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r6, r19, r21);        r0 = r0 + 1;        r4 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00a9, code lost:            r10 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00aa, code lost:            if (r6 == null) goto L253;     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00ac, code lost:            r7.setBuilderToMessage(r10, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00af, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:            return;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00c3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x067a A[LOOP:2: B:37:0x0676->B:39:0x067a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x060b A[Catch: all -> 0x0662, TRY_LEAVE, TryCatch #1 {all -> 0x0662, blocks: (B:18:0x05dd, B:45:0x0605, B:47:0x060b, B:60:0x0633, B:61:0x0638), top: B:17:0x05dd }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0631  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends defpackage.vw0> void mergeFromHelper(defpackage.fh3 r19, defpackage.zu0 r20, java.lang.Object r21, defpackage.sg2 r22, defpackage.xu0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.mergeFromHelper(fh3, zu0, java.lang.Object, sg2, xu0):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, xu0 xu0Var, sg2 sg2Var) throws IOException {
        long offset = offset(typeAndOffsetAt(i));
        Object object = n1.getObject(obj, offset);
        if (object == null) {
            object = ((zp1) this.mapFieldSchema).newMapField(obj2);
            n1.putObject(obj, offset, object);
        } else if (((zp1) this.mapFieldSchema).isImmutable(object)) {
            Object newMapField = ((zp1) this.mapFieldSchema).newMapField(obj2);
            ((zp1) this.mapFieldSchema).mergeFrom(newMapField, object);
            n1.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        ((o) sg2Var).readMap(((zp1) this.mapFieldSchema).forMutableMapData(object), ((zp1) this.mapFieldSchema).forMapMetadata(obj2), xu0Var);
    }

    private void mergeMessage(Object obj, Object obj2, int i) {
        if (!isFieldPresent(obj2, i)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(obj2, offset);
        if (object != null) {
            ln2 messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(obj, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setFieldPresent(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + obj2);
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i) {
        int numberAt = numberAt(i);
        if (!isOneofPresent(obj2, numberAt, i)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(obj2, offset);
        if (object != null) {
            ln2 messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(obj, numberAt, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setOneofPresent(obj, numberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + obj2);
    }

    private void mergeSingleField(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i)) {
                    n1.putDouble(obj, offset, n1.getDouble(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(obj2, i)) {
                    n1.putFloat(obj, offset, n1.getFloat(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(obj2, i)) {
                    n1.putLong(obj, offset, n1.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(obj2, i)) {
                    n1.putLong(obj, offset, n1.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(obj2, i)) {
                    n1.putInt(obj, offset, n1.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(obj2, i)) {
                    n1.putLong(obj, offset, n1.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(obj2, i)) {
                    n1.putInt(obj, offset, n1.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(obj2, i)) {
                    n1.putBoolean(obj, offset, n1.getBoolean(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(obj2, i)) {
                    n1.putObject(obj, offset, n1.getObject(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 9:
                mergeMessage(obj, obj2, i);
                return;
            case 10:
                if (isFieldPresent(obj2, i)) {
                    n1.putObject(obj, offset, n1.getObject(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(obj2, i)) {
                    n1.putInt(obj, offset, n1.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(obj2, i)) {
                    n1.putInt(obj, offset, n1.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(obj2, i)) {
                    n1.putInt(obj, offset, n1.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(obj2, i)) {
                    n1.putLong(obj, offset, n1.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(obj2, i)) {
                    n1.putInt(obj, offset, n1.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(obj2, i)) {
                    n1.putLong(obj, offset, n1.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    return;
                }
                return;
            case 17:
                mergeMessage(obj, obj2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, offset);
                return;
            case 50:
                rn2.mergeMap(this.mapFieldSchema, obj, obj2, offset);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(obj2, numberAt, i)) {
                    n1.putObject(obj, offset, n1.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(obj, obj2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, numberAt, i)) {
                    n1.putObject(obj, offset, n1.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(obj, obj2, i);
                return;
            default:
                return;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i) {
        ln2 messageFieldSchema = getMessageFieldSchema(i);
        long offset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(obj, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i, int i2) {
        ln2 messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(obj, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> v0 newSchema(Class<T> cls, tv1 tv1Var, xz1 xz1Var, vk1 vk1Var, fh3 fh3Var, zu0 zu0Var, yp1 yp1Var) {
        if (tv1Var instanceof ng2) {
            return newSchemaForRawMessageInfo((ng2) tv1Var, xz1Var, vk1Var, fh3Var, zu0Var, yp1Var);
        }
        return newSchemaForMessageInfo((n23) tv1Var, xz1Var, vk1Var, fh3Var, zu0Var, yp1Var);
    }

    public static <T> v0 newSchemaForMessageInfo(n23 n23Var, xz1 xz1Var, vk1 vk1Var, fh3 fh3Var, zu0 zu0Var, yp1 yp1Var) {
        boolean z;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int i;
        if (n23Var.getSyntax() == ga2.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        pw0[] fields = n23Var.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (pw0 pw0Var : fields) {
            if (pw0Var.getType() == ax0.MAP) {
                i2++;
            } else if (pw0Var.getType().id() >= 18 && pw0Var.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr3 = null;
        if (i2 > 0) {
            iArr = new int[i2];
        } else {
            iArr = null;
        }
        if (i3 > 0) {
            iArr3 = new int[i3];
        }
        int[] checkInitialized = n23Var.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            pw0 pw0Var2 = fields[i4];
            int fieldNumber3 = pw0Var2.getFieldNumber();
            storeFieldData(pw0Var2, iArr2, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (pw0Var2.getType() == ax0.MAP) {
                iArr[i7] = i5;
                i7++;
            } else if (pw0Var2.getType().id() >= 18 && pw0Var2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) n1.objectFieldOffset(pw0Var2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr, 0, iArr4, checkInitialized.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr.length, iArr3.length);
        return new v0(iArr2, objArr, fieldNumber, fieldNumber2, n23Var.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, xz1Var, vk1Var, fh3Var, zu0Var, yp1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.v0 newSchemaForRawMessageInfo(defpackage.ng2 r33, defpackage.xz1 r34, defpackage.vk1 r35, defpackage.fh3 r36, defpackage.zu0 r37, defpackage.yp1 r38) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.newSchemaForRawMessageInfo(ng2, xz1, vk1, fh3, zu0, yp1):com.google.protobuf.v0");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) n1.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) n1.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) n1.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) n1.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) n1.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i, int i2, int i3, long j, fg fgVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(obj, j);
        if (((zp1) this.mapFieldSchema).isImmutable(object)) {
            Object newMapField = ((zp1) this.mapFieldSchema).newMapField(mapFieldDefaultEntry);
            ((zp1) this.mapFieldSchema).mergeFrom(newMapField, object);
            unsafe.putObject(obj, j, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i, i2, ((zp1) this.mapFieldSchema).forMapMetadata(mapFieldDefaultEntry), ((zp1) this.mapFieldSchema).forMutableMapData(object), fgVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private int parseOneofField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, fg fgVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(e.decodeDouble(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(e.decodeFloat(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int decodeVarint64 = e.decodeVarint64(bArr, i, fgVar);
                    unsafe.putObject(obj, j, Long.valueOf(fgVar.long1));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint64;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    int decodeVarint32 = e.decodeVarint32(bArr, i, fgVar);
                    unsafe.putObject(obj, j, Integer.valueOf(fgVar.int1));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint32;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(e.decodeFixed64(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(e.decodeFixed32(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int decodeVarint642 = e.decodeVarint64(bArr, i, fgVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(fgVar.long1 != 0));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint642;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int decodeVarint322 = e.decodeVarint32(bArr, i, fgVar);
                    int i13 = fgVar.int1;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & ENFORCE_UTF8_MASK) != 0 && !ti3.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i13)) {
                            throw he1.invalidUtf8();
                        }
                        unsafe.putObject(obj, j, new String(bArr, decodeVarint322, i13, r0.UTF_8));
                        decodeVarint322 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint322;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int mergeMessageField = e.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, fgVar);
                    storeOneofMessageField(obj, i4, i8, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int decodeBytes = e.decodeBytes(bArr, i, fgVar);
                    unsafe.putObject(obj, j, fgVar.object1);
                    unsafe.putInt(obj, j2, i4);
                    return decodeBytes;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int decodeVarint323 = e.decodeVarint32(bArr, i, fgVar);
                    int i14 = fgVar.int1;
                    sd1 enumFieldVerifier = getEnumFieldVerifier(i8);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                        getMutableUnknownFields(obj).storeField(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return decodeVarint323;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int decodeVarint324 = e.decodeVarint32(bArr, i, fgVar);
                    unsafe.putObject(obj, j, Integer.valueOf(m.decodeZigZag32(fgVar.int1)));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint324;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int decodeVarint643 = e.decodeVarint64(bArr, i, fgVar);
                    unsafe.putObject(obj, j, Long.valueOf(m.decodeZigZag64(fgVar.long1)));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint643;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int mergeGroupField = e.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, fgVar);
                    storeOneofMessageField(obj, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0296, code lost:            if (r0 != r10) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0298, code lost:            r15 = r29;        r14 = r30;        r12 = r31;        r13 = r33;        r11 = r34;        r1 = r18;        r2 = r19;        r7 = r22;        r6 = r26;     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0301, code lost:            r2 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:            if (r0 != r15) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02fe, code lost:            if (r0 != r15) goto L100;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0087. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseProto3Message(java.lang.Object r30, byte[] r31, int r32, int r33, defpackage.fg r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.parseProto3Message(java.lang.Object, byte[], int, int, fg):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0030. Please report as an issue. */
    private int parseRepeatedField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, fg fgVar) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        wd1 wd1Var = (wd1) unsafe.getObject(obj, j2);
        if (!wd1Var.isModifiable()) {
            int size = wd1Var.size();
            wd1Var = wd1Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, wd1Var);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return e.decodePackedDoubleList(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 1) {
                    return e.decodeDoubleList(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return e.decodePackedFloatList(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 5) {
                    return e.decodeFloatList(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return e.decodePackedVarint64List(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 0) {
                    return e.decodeVarint64List(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return e.decodePackedVarint32List(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 0) {
                    return e.decodeVarint32List(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return e.decodePackedFixed64List(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 1) {
                    return e.decodeFixed64List(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return e.decodePackedFixed32List(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 5) {
                    return e.decodeFixed32List(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return e.decodePackedBoolList(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 0) {
                    return e.decodeBoolList(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return e.decodeStringList(i3, bArr, i, i2, wd1Var, fgVar);
                    }
                    return e.decodeStringListRequireUtf8(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return e.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return e.decodeBytesList(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        decodeVarint32List = e.decodeVarint32List(i3, bArr, i, i2, wd1Var, fgVar);
                    }
                    return i;
                }
                decodeVarint32List = e.decodePackedVarint32List(bArr, i, wd1Var, fgVar);
                rn2.filterUnknownEnumList(obj, i4, wd1Var, getEnumFieldVerifier(i6), (Object) null, this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return e.decodePackedSInt32List(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 0) {
                    return e.decodeSInt32List(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return e.decodePackedSInt64List(bArr, i, wd1Var, fgVar);
                }
                if (i5 == 0) {
                    return e.decodeSInt64List(i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return e.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, wd1Var, fgVar);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, sg2 sg2Var, ln2 ln2Var, xu0 xu0Var) throws IOException {
        ((o) sg2Var).readGroupList(this.listFieldSchema.mutableListAt(obj, j), ln2Var, xu0Var);
    }

    private <E> void readMessageList(Object obj, int i, sg2 sg2Var, ln2 ln2Var, xu0 xu0Var) throws IOException {
        o oVar = (o) sg2Var;
        oVar.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), ln2Var, xu0Var);
    }

    private void readString(Object obj, int i, sg2 sg2Var) throws IOException {
        if (isEnforceUtf8(i)) {
            n1.putObject(obj, offset(i), ((o) sg2Var).readStringRequireUtf8());
        } else if (this.lite) {
            n1.putObject(obj, offset(i), ((o) sg2Var).readString());
        } else {
            n1.putObject(obj, offset(i), ((o) sg2Var).readBytes());
        }
    }

    private void readStringList(Object obj, int i, sg2 sg2Var) throws IOException {
        if (isEnforceUtf8(i)) {
            ((o) sg2Var).readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            ((o) sg2Var).readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder u = hx2.u("Field ", str, " for ");
            u.append(cls.getName());
            u.append(" not found. Known fields are ");
            u.append(Arrays.toString(declaredFields));
            throw new RuntimeException(u.toString());
        }
    }

    private void setFieldPresent(Object obj, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        n1.putInt(obj, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | n1.getInt(obj, j));
    }

    private void setOneofPresent(Object obj, int i, int i2) {
        n1.putInt(obj, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(defpackage.pw0 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            g32 r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            ax0 r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.n1.objectFieldOffset(r3)
            int r4 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r5 = com.google.protobuf.n1.objectFieldOffset(r0)
        L22:
            int r0 = (int) r5
        L23:
            r3 = 0
            goto L6b
        L25:
            ax0 r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.n1.objectFieldOffset(r2)
            int r4 = (int) r2
            int r2 = r0.id()
            boolean r3 = r0.isList()
            if (r3 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r5 = com.google.protobuf.n1.objectFieldOffset(r0)
            int r0 = (int) r5
        L51:
            int r3 = r8.getPresenceMask()
            int r3 = java.lang.Integer.numberOfTrailingZeros(r3)
            goto L6b
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L62
            r0 = 0
            goto L23
        L62:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r5 = com.google.protobuf.n1.objectFieldOffset(r0)
            goto L22
        L6b:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7c
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7d
        L7c:
            r6 = 0
        L7d:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L85
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L85:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r4
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r3 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbd
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Lae
            int r10 = r10 + 1
            r11[r10] = r9
            goto Lda
        Lae:
            sd1 r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Lda
            int r10 = r10 + 1
            sd1 r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Lda
        Lbd:
            if (r9 == 0) goto Lc8
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Lda
        Lc8:
            sd1 r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Lda
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            sd1 r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.storeFieldData(pw0, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(Object obj, int i, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i)), obj2);
        setFieldPresent(obj, i);
    }

    private void storeOneofMessageField(Object obj, int i, int i2, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i2)), obj2);
        setOneofPresent(obj, i, i2);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(java.lang.Object r18, defpackage.kt3 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.writeFieldsInAscendingOrderProto2(java.lang.Object, kt3):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(java.lang.Object r13, defpackage.kt3 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.writeFieldsInAscendingOrderProto3(java.lang.Object, kt3):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(java.lang.Object r11, defpackage.kt3 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.writeFieldsInDescendingOrder(java.lang.Object, kt3):void");
    }

    private <K, V> void writeMapHelper(kt3 kt3Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            x xVar = (x) kt3Var;
            xVar.writeMap(i, ((zp1) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i2)), ((zp1) this.mapFieldSchema).forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, kt3 kt3Var) throws IOException {
        if (obj instanceof String) {
            ((x) kt3Var).writeString(i, (String) obj);
        } else {
            ((x) kt3Var).writeBytes(i, (g) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(fh3 fh3Var, Object obj, kt3 kt3Var) throws IOException {
        fh3Var.writeTo(fh3Var.getFromMessage(obj), kt3Var);
    }

    @Override // defpackage.ln2
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // defpackage.ln2
    public int getSerializedSize(Object obj) {
        if (this.proto3) {
            return getSerializedSizeProto3(obj);
        }
        return getSerializedSizeProto2(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // defpackage.ln2
    public int hashCode(Object obj) {
        int i;
        int hashLong;
        int i2;
        int oneofIntAt;
        int length = this.buffer.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i4);
            int numberAt = numberAt(i4);
            long offset = offset(typeAndOffsetAt);
            int i5 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i3 * 53;
                    hashLong = r0.hashLong(Double.doubleToLongBits(n1.getDouble(obj, offset)));
                    i3 = hashLong + i;
                    break;
                case 1:
                    i = i3 * 53;
                    hashLong = Float.floatToIntBits(n1.getFloat(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 2:
                    i = i3 * 53;
                    hashLong = r0.hashLong(n1.getLong(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 3:
                    i = i3 * 53;
                    hashLong = r0.hashLong(n1.getLong(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 4:
                    i = i3 * 53;
                    hashLong = n1.getInt(obj, offset);
                    i3 = hashLong + i;
                    break;
                case 5:
                    i = i3 * 53;
                    hashLong = r0.hashLong(n1.getLong(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 6:
                    i = i3 * 53;
                    hashLong = n1.getInt(obj, offset);
                    i3 = hashLong + i;
                    break;
                case 7:
                    i = i3 * 53;
                    hashLong = r0.hashBoolean(n1.getBoolean(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 8:
                    i = i3 * 53;
                    hashLong = ((String) n1.getObject(obj, offset)).hashCode();
                    i3 = hashLong + i;
                    break;
                case 9:
                    Object object = n1.getObject(obj, offset);
                    if (object != null) {
                        i5 = object.hashCode();
                    }
                    i3 = (i3 * 53) + i5;
                    break;
                case 10:
                    i = i3 * 53;
                    hashLong = n1.getObject(obj, offset).hashCode();
                    i3 = hashLong + i;
                    break;
                case 11:
                    i = i3 * 53;
                    hashLong = n1.getInt(obj, offset);
                    i3 = hashLong + i;
                    break;
                case 12:
                    i = i3 * 53;
                    hashLong = n1.getInt(obj, offset);
                    i3 = hashLong + i;
                    break;
                case 13:
                    i = i3 * 53;
                    hashLong = n1.getInt(obj, offset);
                    i3 = hashLong + i;
                    break;
                case 14:
                    i = i3 * 53;
                    hashLong = r0.hashLong(n1.getLong(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 15:
                    i = i3 * 53;
                    hashLong = n1.getInt(obj, offset);
                    i3 = hashLong + i;
                    break;
                case 16:
                    i = i3 * 53;
                    hashLong = r0.hashLong(n1.getLong(obj, offset));
                    i3 = hashLong + i;
                    break;
                case 17:
                    Object object2 = n1.getObject(obj, offset);
                    if (object2 != null) {
                        i5 = object2.hashCode();
                    }
                    i3 = (i3 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    hashLong = n1.getObject(obj, offset).hashCode();
                    i3 = hashLong + i;
                    break;
                case 50:
                    i = i3 * 53;
                    hashLong = n1.getObject(obj, offset).hashCode();
                    i3 = hashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, offset)));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashLong(oneofLongAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashLong(oneofLongAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i2 = i3 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i3 = i2 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashLong(oneofLongAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i2 = i3 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i3 = i2 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashBoolean(oneofBooleanAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = ((String) n1.getObject(obj, offset)).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = n1.getObject(obj, offset).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = n1.getObject(obj, offset).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i2 = i3 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i3 = i2 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i2 = i3 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i3 = i2 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i2 = i3 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i3 = i2 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashLong(oneofLongAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i2 = i3 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i3 = i2 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = r0.hashLong(oneofLongAt(obj, offset));
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        i = i3 * 53;
                        hashLong = n1.getObject(obj, offset).hashCode();
                        i3 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode() + (i3 * 53);
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.ln2
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int numberAt = numberAt(i6);
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(obj, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(obj, numberAt, i6) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(obj, typeAndOffsetAt, i6)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(obj, typeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (isFieldPresent(obj, i6, i, i2, i9) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // defpackage.ln2
    public void makeImmutable(Object obj) {
        if (!isMutable(obj)) {
            return;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            o0Var.clearMemoizedSerializedSize();
            o0Var.clearMemoizedHashCode();
            o0Var.markImmutable();
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i);
            long offset = offset(typeAndOffsetAt);
            int type = type(typeAndOffsetAt);
            if (type != 9) {
                switch (type) {
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.listFieldSchema.makeImmutableListAt(obj, offset);
                        break;
                    case 50:
                        Unsafe unsafe = UNSAFE;
                        Object object = unsafe.getObject(obj, offset);
                        if (object != null) {
                            unsafe.putObject(obj, offset, ((zp1) this.mapFieldSchema).toImmutable(object));
                            break;
                        } else {
                            break;
                        }
                }
            }
            if (isFieldPresent(obj, i)) {
                getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, offset));
            }
        }
        this.unknownFieldSchema.makeImmutable(obj);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(obj);
        }
    }

    @Override // defpackage.ln2
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(obj, obj2, i);
        }
        rn2.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            rn2.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // defpackage.ln2
    public Object newInstance() {
        return ((yz1) this.newInstanceSchema).newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x008e. Please report as an issue. */
    public int parseProto2Message(Object obj, byte[] bArr, int i, int i2, int i3, fg fgVar) throws IOException {
        Unsafe unsafe;
        int i4;
        v0 v0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj2;
        int i9;
        int positionForFieldNumber;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[] bArr2;
        int decodeVarint64;
        boolean z;
        int i20;
        int i21;
        int i22;
        v0 v0Var2 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i23 = i2;
        int i24 = i3;
        fg fgVar2 = fgVar;
        checkMutable(obj);
        Unsafe unsafe2 = UNSAFE;
        int i25 = i;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b2 = bArr3[i25];
                if (b2 < 0) {
                    int decodeVarint32 = e.decodeVarint32(b2, bArr3, i31, fgVar2);
                    i9 = fgVar2.int1;
                    i31 = decodeVarint32;
                } else {
                    i9 = b2;
                }
                int i32 = i9 >>> 3;
                int i33 = i9 & 7;
                if (i32 > i26) {
                    positionForFieldNumber = v0Var2.positionForFieldNumber(i32, i27 / 3);
                } else {
                    positionForFieldNumber = v0Var2.positionForFieldNumber(i32);
                }
                int i34 = positionForFieldNumber;
                if (i34 == -1) {
                    i10 = i32;
                    i11 = i31;
                    i6 = i9;
                    i12 = i29;
                    i13 = i30;
                    unsafe = unsafe2;
                    i4 = i24;
                    i14 = 0;
                } else {
                    int i35 = v0Var2.buffer[i34 + 1];
                    int type = type(i35);
                    long offset = offset(i35);
                    int i36 = i9;
                    if (type <= 17) {
                        int i37 = v0Var2.buffer[i34 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i30) {
                            if (i30 != 1048575) {
                                unsafe2.putInt(obj3, i30, i29);
                            }
                            i16 = i39;
                            i15 = unsafe2.getInt(obj3, i39);
                        } else {
                            i15 = i29;
                            i16 = i30;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 1) {
                                    n1.putDouble(obj3, offset, e.decodeDouble(bArr2, i31));
                                    i25 = i31 + 8;
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 5) {
                                    n1.putFloat(obj3, offset, e.decodeFloat(bArr2, i31));
                                    i25 = i31 + 4;
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 0) {
                                    decodeVarint64 = e.decodeVarint64(bArr2, i31, fgVar2);
                                    unsafe2.putLong(obj, offset, fgVar2.long1);
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i25 = decodeVarint64;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 0) {
                                    i25 = e.decodeVarint32(bArr2, i31, fgVar2);
                                    unsafe2.putInt(obj3, offset, fgVar2.int1);
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 1) {
                                    unsafe2.putLong(obj, offset, e.decodeFixed64(bArr2, i31));
                                    i25 = i31 + 8;
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 5) {
                                    unsafe2.putInt(obj3, offset, e.decodeFixed32(bArr2, i31));
                                    i25 = i31 + 4;
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 0) {
                                    i25 = e.decodeVarint64(bArr2, i31, fgVar2);
                                    if (fgVar2.long1 != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    n1.putBoolean(obj3, offset, z);
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 2) {
                                    if ((ENFORCE_UTF8_MASK & i35) == 0) {
                                        i25 = e.decodeString(bArr2, i31, fgVar2);
                                    } else {
                                        i25 = e.decodeStringRequireUtf8(bArr2, i31, fgVar2);
                                    }
                                    unsafe2.putObject(obj3, offset, fgVar2.object1);
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 2) {
                                    Object mutableMessageFieldForMerge = v0Var2.mutableMessageFieldForMerge(obj3, i19);
                                    i25 = e.mergeMessageField(mutableMessageFieldForMerge, v0Var2.getMessageFieldSchema(i19), bArr, i31, i2, fgVar);
                                    v0Var2.storeMessageField(obj3, i19, mutableMessageFieldForMerge);
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 2) {
                                    i25 = e.decodeBytes(bArr2, i31, fgVar2);
                                    unsafe2.putObject(obj3, offset, fgVar2.object1);
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 0) {
                                    i25 = e.decodeVarint32(bArr2, i31, fgVar2);
                                    int i40 = fgVar2.int1;
                                    sd1 enumFieldVerifier = v0Var2.getEnumFieldVerifier(i19);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i40)) {
                                        getMutableUnknownFields(obj).storeField(i18, Long.valueOf(i40));
                                        i27 = i19;
                                        i29 = i15;
                                        i28 = i18;
                                        i26 = i10;
                                        i30 = i17;
                                        i24 = i3;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(obj3, offset, i40);
                                        i29 = i15 | i38;
                                        i24 = i3;
                                        i27 = i19;
                                        i28 = i18;
                                        i26 = i10;
                                        i30 = i17;
                                        bArr3 = bArr2;
                                    }
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                if (i33 == 0) {
                                    i25 = e.decodeVarint32(bArr2, i31, fgVar2);
                                    unsafe2.putInt(obj3, offset, m.decodeZigZag32(fgVar2.int1));
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 16:
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                bArr2 = bArr;
                                if (i33 == 0) {
                                    decodeVarint64 = e.decodeVarint64(bArr2, i31, fgVar2);
                                    unsafe2.putLong(obj, offset, m.decodeZigZag64(fgVar2.long1));
                                    i29 = i15 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i25 = decodeVarint64;
                                    i28 = i18;
                                    i26 = i10;
                                    i30 = i17;
                                    bArr3 = bArr2;
                                } else {
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            case 17:
                                if (i33 == 3) {
                                    Object mutableMessageFieldForMerge2 = v0Var2.mutableMessageFieldForMerge(obj3, i34);
                                    i25 = e.mergeGroupField(mutableMessageFieldForMerge2, v0Var2.getMessageFieldSchema(i34), bArr, i31, i2, (i32 << 3) | 4, fgVar);
                                    v0Var2.storeMessageField(obj3, i34, mutableMessageFieldForMerge2);
                                    i29 = i15 | i38;
                                    i30 = i16;
                                    i24 = i3;
                                    i27 = i34;
                                    i28 = i36;
                                    i26 = i32;
                                    bArr3 = bArr;
                                } else {
                                    i10 = i32;
                                    i17 = i16;
                                    i18 = i36;
                                    i19 = i34;
                                    i13 = i17;
                                    i4 = i3;
                                    i11 = i31;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i18;
                                    break;
                                }
                            default:
                                i10 = i32;
                                i19 = i34;
                                i17 = i16;
                                i18 = i36;
                                i13 = i17;
                                i4 = i3;
                                i11 = i31;
                                i14 = i19;
                                unsafe = unsafe2;
                                i12 = i15;
                                i6 = i18;
                                break;
                        }
                    } else {
                        i10 = i32;
                        i13 = i30;
                        i12 = i29;
                        if (type == 27) {
                            if (i33 == 2) {
                                wd1 wd1Var = (wd1) unsafe2.getObject(obj3, offset);
                                if (!wd1Var.isModifiable()) {
                                    int size = wd1Var.size();
                                    if (size == 0) {
                                        i22 = 10;
                                    } else {
                                        i22 = size * 2;
                                    }
                                    wd1Var = wd1Var.mutableCopyWithCapacity(i22);
                                    unsafe2.putObject(obj3, offset, wd1Var);
                                }
                                i25 = e.decodeMessageList(v0Var2.getMessageFieldSchema(i34), i36, bArr, i31, i2, wd1Var, fgVar);
                                i27 = i34;
                                i28 = i36;
                                i30 = i13;
                                i29 = i12;
                                i26 = i10;
                                bArr3 = bArr;
                                i24 = i3;
                            } else {
                                i20 = i31;
                                unsafe = unsafe2;
                                i14 = i34;
                                i21 = i36;
                                i4 = i3;
                                i11 = i20;
                            }
                        } else if (type <= 49) {
                            int i41 = i31;
                            unsafe = unsafe2;
                            i14 = i34;
                            i21 = i36;
                            i25 = parseRepeatedField(obj, bArr, i31, i2, i36, i10, i33, i34, i35, type, offset, fgVar);
                            if (i25 != i41) {
                                v0Var2 = this;
                                obj3 = obj;
                                bArr3 = bArr;
                                i23 = i2;
                                i24 = i3;
                                fgVar2 = fgVar;
                                i30 = i13;
                                i29 = i12;
                                i27 = i14;
                                i28 = i21;
                                i26 = i10;
                                unsafe2 = unsafe;
                            } else {
                                i4 = i3;
                                i11 = i25;
                            }
                        } else {
                            i20 = i31;
                            unsafe = unsafe2;
                            i14 = i34;
                            i21 = i36;
                            if (type == 50) {
                                if (i33 == 2) {
                                    i25 = parseMapField(obj, bArr, i20, i2, i14, offset, fgVar);
                                    if (i25 != i20) {
                                        v0Var2 = this;
                                        obj3 = obj;
                                        bArr3 = bArr;
                                        i23 = i2;
                                        i24 = i3;
                                        fgVar2 = fgVar;
                                        i30 = i13;
                                        i29 = i12;
                                        i27 = i14;
                                        i28 = i21;
                                        i26 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i11 = i25;
                                    }
                                } else {
                                    i4 = i3;
                                    i11 = i20;
                                }
                            } else {
                                i25 = parseOneofField(obj, bArr, i20, i2, i21, i10, i33, i35, type, offset, i14, fgVar);
                                if (i25 != i20) {
                                    v0Var2 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i24 = i3;
                                    fgVar2 = fgVar;
                                    i30 = i13;
                                    i29 = i12;
                                    i27 = i14;
                                    i28 = i21;
                                    i26 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i11 = i25;
                                }
                            }
                        }
                        i6 = i21;
                    }
                }
                if (i6 == i4 && i4 != 0) {
                    i8 = 1048575;
                    v0Var = this;
                    i5 = i11;
                    i7 = i13;
                    i29 = i12;
                } else {
                    if (this.hasExtensions && fgVar.extensionRegistry != xu0.getEmptyRegistry()) {
                        i25 = e.decodeExtensionOrUnknownField(i6, bArr, i11, i2, obj, this.defaultInstance, this.unknownFieldSchema, fgVar);
                    } else {
                        i25 = e.decodeUnknownField(i6, bArr, i11, i2, getMutableUnknownFields(obj), fgVar);
                    }
                    obj3 = obj;
                    bArr3 = bArr;
                    i23 = i2;
                    i28 = i6;
                    v0Var2 = this;
                    fgVar2 = fgVar;
                    i30 = i13;
                    i29 = i12;
                    i27 = i14;
                    i26 = i10;
                    unsafe2 = unsafe;
                    i24 = i4;
                }
            } else {
                int i42 = i30;
                unsafe = unsafe2;
                i4 = i24;
                v0Var = v0Var2;
                i5 = i25;
                i6 = i28;
                i7 = i42;
                i8 = 1048575;
            }
        }
        if (i7 != i8) {
            obj2 = obj;
            unsafe.putInt(obj2, i7, i29);
        } else {
            obj2 = obj;
        }
        gh3 gh3Var = null;
        for (int i43 = v0Var.checkInitializedCount; i43 < v0Var.repeatedFieldOffsetStart; i43++) {
            gh3Var = (gh3) filterMapUnknownEnumValues(obj, v0Var.intArray[i43], gh3Var, v0Var.unknownFieldSchema, obj);
        }
        if (gh3Var != null) {
            v0Var.unknownFieldSchema.setBuilderToMessage(obj2, gh3Var);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw he1.parseFailure();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw he1.parseFailure();
        }
        return i5;
    }

    @Override // defpackage.ln2
    public void writeTo(Object obj, kt3 kt3Var) throws IOException {
        x xVar = (x) kt3Var;
        if (xVar.fieldOrder() == jt3.DESCENDING) {
            writeFieldsInDescendingOrder(obj, xVar);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(obj, xVar);
        } else {
            writeFieldsInAscendingOrderProto2(obj, xVar);
        }
    }

    private boolean isFieldPresent(Object obj, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (n1.getInt(obj, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(n1.getDouble(obj, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(n1.getFloat(obj, offset)) != 0;
            case 2:
                return n1.getLong(obj, offset) != 0;
            case 3:
                return n1.getLong(obj, offset) != 0;
            case 4:
                return n1.getInt(obj, offset) != 0;
            case 5:
                return n1.getLong(obj, offset) != 0;
            case 6:
                return n1.getInt(obj, offset) != 0;
            case 7:
                return n1.getBoolean(obj, offset);
            case 8:
                Object object = n1.getObject(obj, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof g) {
                    return !g.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return n1.getObject(obj, offset) != null;
            case 10:
                return !g.EMPTY.equals(n1.getObject(obj, offset));
            case 11:
                return n1.getInt(obj, offset) != 0;
            case 12:
                return n1.getInt(obj, offset) != 0;
            case 13:
                return n1.getInt(obj, offset) != 0;
            case 14:
                return n1.getLong(obj, offset) != 0;
            case 15:
                return n1.getInt(obj, offset) != 0;
            case 16:
                return n1.getLong(obj, offset) != 0;
            case 17:
                return n1.getObject(obj, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // defpackage.ln2
    public void mergeFrom(Object obj, sg2 sg2Var, xu0 xu0Var) throws IOException {
        xu0Var.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, sg2Var, xu0Var);
    }

    private boolean equals(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(obj, obj2, i) && Double.doubleToLongBits(n1.getDouble(obj, offset)) == Double.doubleToLongBits(n1.getDouble(obj2, offset));
            case 1:
                return arePresentForEquals(obj, obj2, i) && Float.floatToIntBits(n1.getFloat(obj, offset)) == Float.floatToIntBits(n1.getFloat(obj2, offset));
            case 2:
                return arePresentForEquals(obj, obj2, i) && n1.getLong(obj, offset) == n1.getLong(obj2, offset);
            case 3:
                return arePresentForEquals(obj, obj2, i) && n1.getLong(obj, offset) == n1.getLong(obj2, offset);
            case 4:
                return arePresentForEquals(obj, obj2, i) && n1.getInt(obj, offset) == n1.getInt(obj2, offset);
            case 5:
                return arePresentForEquals(obj, obj2, i) && n1.getLong(obj, offset) == n1.getLong(obj2, offset);
            case 6:
                return arePresentForEquals(obj, obj2, i) && n1.getInt(obj, offset) == n1.getInt(obj2, offset);
            case 7:
                return arePresentForEquals(obj, obj2, i) && n1.getBoolean(obj, offset) == n1.getBoolean(obj2, offset);
            case 8:
                return arePresentForEquals(obj, obj2, i) && rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            case 9:
                return arePresentForEquals(obj, obj2, i) && rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            case 10:
                return arePresentForEquals(obj, obj2, i) && rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            case 11:
                return arePresentForEquals(obj, obj2, i) && n1.getInt(obj, offset) == n1.getInt(obj2, offset);
            case 12:
                return arePresentForEquals(obj, obj2, i) && n1.getInt(obj, offset) == n1.getInt(obj2, offset);
            case 13:
                return arePresentForEquals(obj, obj2, i) && n1.getInt(obj, offset) == n1.getInt(obj2, offset);
            case 14:
                return arePresentForEquals(obj, obj2, i) && n1.getLong(obj, offset) == n1.getLong(obj2, offset);
            case 15:
                return arePresentForEquals(obj, obj2, i) && n1.getInt(obj, offset) == n1.getInt(obj2, offset);
            case 16:
                return arePresentForEquals(obj, obj2, i) && n1.getLong(obj, offset) == n1.getLong(obj2, offset);
            case 17:
                return arePresentForEquals(obj, obj2, i) && rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            case 50:
                return rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(obj, obj2, i) && rn2.safeEquals(n1.getObject(obj, offset), n1.getObject(obj2, offset));
            default:
                return true;
        }
    }

    @Override // defpackage.ln2
    public void mergeFrom(Object obj, byte[] bArr, int i, int i2, fg fgVar) throws IOException {
        if (this.proto3) {
            parseProto3Message(obj, bArr, i, i2, fgVar);
        } else {
            parseProto2Message(obj, bArr, i, i2, 0, fgVar);
        }
    }

    private static boolean isInitialized(Object obj, int i, ln2 ln2Var) {
        return ln2Var.isInitialized(n1.getObject(obj, offset(i)));
    }
}
