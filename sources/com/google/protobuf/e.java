package com.google.protobuf;

import defpackage.cm0;
import defpackage.do1;
import defpackage.ed1;
import defpackage.fg;
import defpackage.fh3;
import defpackage.gh3;
import defpackage.he1;
import defpackage.ja2;
import defpackage.kr3;
import defpackage.ln2;
import defpackage.oq;
import defpackage.rn2;
import defpackage.ti3;
import defpackage.wd1;
import defpackage.ww0;
import defpackage.yv1;
import defpackage.yy0;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class e {
    private e() {
    }

    public static int decodeBoolList(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        boolean z;
        boolean z2;
        oq oqVar = (oq) wd1Var;
        int decodeVarint64 = decodeVarint64(bArr, i2, fgVar);
        if (fgVar.long1 != 0) {
            z = true;
        } else {
            z = false;
        }
        oqVar.addBoolean(z);
        while (decodeVarint64 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, fgVar);
            if (fgVar.long1 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            oqVar.addBoolean(z2);
        }
        return decodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i, fg fgVar) throws he1 {
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1;
        if (i2 >= 0) {
            if (i2 <= bArr.length - decodeVarint32) {
                if (i2 == 0) {
                    fgVar.object1 = g.EMPTY;
                    return decodeVarint32;
                }
                fgVar.object1 = g.copyFrom(bArr, decodeVarint32, i2);
                return decodeVarint32 + i2;
            }
            throw he1.truncatedMessage();
        }
        throw he1.negativeSize();
    }

    public static int decodeBytesList(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) throws he1 {
        int decodeVarint32 = decodeVarint32(bArr, i2, fgVar);
        int i4 = fgVar.int1;
        if (i4 >= 0) {
            if (i4 <= bArr.length - decodeVarint32) {
                if (i4 == 0) {
                    wd1Var.add(g.EMPTY);
                } else {
                    wd1Var.add(g.copyFrom(bArr, decodeVarint32, i4));
                    decodeVarint32 += i4;
                }
                while (decodeVarint32 < i3) {
                    int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, fgVar);
                    if (i != fgVar.int1) {
                        break;
                    }
                    decodeVarint32 = decodeVarint32(bArr, decodeVarint322, fgVar);
                    int i5 = fgVar.int1;
                    if (i5 >= 0) {
                        if (i5 <= bArr.length - decodeVarint32) {
                            if (i5 == 0) {
                                wd1Var.add(g.EMPTY);
                            } else {
                                wd1Var.add(g.copyFrom(bArr, decodeVarint32, i5));
                                decodeVarint32 += i5;
                            }
                        } else {
                            throw he1.truncatedMessage();
                        }
                    } else {
                        throw he1.negativeSize();
                    }
                }
                return decodeVarint32;
            }
            throw he1.truncatedMessage();
        }
        throw he1.negativeSize();
    }

    public static double decodeDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    public static int decodeDoubleList(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        cm0 cm0Var = (cm0) wd1Var;
        cm0Var.addDouble(decodeDouble(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            cm0Var.addDouble(decodeDouble(bArr, decodeVarint32));
            i4 = decodeVarint32 + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x011f. Please report as an issue. */
    public static int decodeExtension(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite$ExtendableMessage<?, ?> generatedMessageLite$ExtendableMessage, n0 n0Var, fh3 fh3Var, fg fgVar) throws IOException {
        ww0 ww0Var = generatedMessageLite$ExtendableMessage.extensions;
        int i4 = i >>> 3;
        if (n0Var.descriptor.isRepeated() && n0Var.descriptor.isPacked()) {
            switch (d.$SwitchMap$com$google$protobuf$WireFormat$FieldType[n0Var.getLiteType().ordinal()]) {
                case 1:
                    cm0 cm0Var = new cm0();
                    int decodePackedDoubleList = decodePackedDoubleList(bArr, i2, cm0Var, fgVar);
                    ww0Var.setField(n0Var.descriptor, cm0Var);
                    return decodePackedDoubleList;
                case 2:
                    yy0 yy0Var = new yy0();
                    int decodePackedFloatList = decodePackedFloatList(bArr, i2, yy0Var, fgVar);
                    ww0Var.setField(n0Var.descriptor, yy0Var);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    do1 do1Var = new do1();
                    int decodePackedVarint64List = decodePackedVarint64List(bArr, i2, do1Var, fgVar);
                    ww0Var.setField(n0Var.descriptor, do1Var);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    ed1 ed1Var = new ed1();
                    int decodePackedVarint32List = decodePackedVarint32List(bArr, i2, ed1Var, fgVar);
                    ww0Var.setField(n0Var.descriptor, ed1Var);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    do1 do1Var2 = new do1();
                    int decodePackedFixed64List = decodePackedFixed64List(bArr, i2, do1Var2, fgVar);
                    ww0Var.setField(n0Var.descriptor, do1Var2);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    ed1 ed1Var2 = new ed1();
                    int decodePackedFixed32List = decodePackedFixed32List(bArr, i2, ed1Var2, fgVar);
                    ww0Var.setField(n0Var.descriptor, ed1Var2);
                    return decodePackedFixed32List;
                case 11:
                    oq oqVar = new oq();
                    int decodePackedBoolList = decodePackedBoolList(bArr, i2, oqVar, fgVar);
                    ww0Var.setField(n0Var.descriptor, oqVar);
                    return decodePackedBoolList;
                case 12:
                    ed1 ed1Var3 = new ed1();
                    int decodePackedSInt32List = decodePackedSInt32List(bArr, i2, ed1Var3, fgVar);
                    ww0Var.setField(n0Var.descriptor, ed1Var3);
                    return decodePackedSInt32List;
                case 13:
                    do1 do1Var3 = new do1();
                    int decodePackedSInt64List = decodePackedSInt64List(bArr, i2, do1Var3, fgVar);
                    ww0Var.setField(n0Var.descriptor, do1Var3);
                    return decodePackedSInt64List;
                case 14:
                    ed1 ed1Var4 = new ed1();
                    int decodePackedVarint32List2 = decodePackedVarint32List(bArr, i2, ed1Var4, fgVar);
                    rn2.filterUnknownEnumList(generatedMessageLite$ExtendableMessage, i4, ed1Var4, n0Var.descriptor.getEnumType(), (Object) null, fh3Var);
                    ww0Var.setField(n0Var.descriptor, ed1Var4);
                    return decodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + n0Var.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (n0Var.getLiteType() == kr3.ENUM) {
            i2 = decodeVarint32(bArr, i2, fgVar);
            if (n0Var.descriptor.getEnumType().findValueByNumber(fgVar.int1) == null) {
                rn2.storeUnknownEnum(generatedMessageLite$ExtendableMessage, i4, fgVar.int1, null, fh3Var);
                return i2;
            }
            obj = Integer.valueOf(fgVar.int1);
        } else {
            switch (d.$SwitchMap$com$google$protobuf$WireFormat$FieldType[n0Var.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(decodeDouble(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(decodeFloat(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = decodeVarint64(bArr, i2, fgVar);
                    obj = Long.valueOf(fgVar.long1);
                    break;
                case 5:
                case 6:
                    i2 = decodeVarint32(bArr, i2, fgVar);
                    obj = Integer.valueOf(fgVar.int1);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(decodeFixed64(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(decodeFixed32(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = decodeVarint64(bArr, i2, fgVar);
                    obj = Boolean.valueOf(fgVar.long1 != 0);
                    break;
                case 12:
                    i2 = decodeVarint32(bArr, i2, fgVar);
                    obj = Integer.valueOf(m.decodeZigZag32(fgVar.int1));
                    break;
                case 13:
                    i2 = decodeVarint64(bArr, i2, fgVar);
                    obj = Long.valueOf(m.decodeZigZag64(fgVar.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = decodeBytes(bArr, i2, fgVar);
                    obj = fgVar.object1;
                    break;
                case 16:
                    i2 = decodeString(bArr, i2, fgVar);
                    obj = fgVar.object1;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    ln2 schemaFor = ja2.getInstance().schemaFor((Class) n0Var.getMessageDefaultInstance().getClass());
                    if (n0Var.isRepeated()) {
                        int decodeGroupField = decodeGroupField(schemaFor, bArr, i2, i3, i5, fgVar);
                        ww0Var.addRepeatedField(n0Var.descriptor, fgVar.object1);
                        return decodeGroupField;
                    }
                    Object field = ww0Var.getField(n0Var.descriptor);
                    if (field == null) {
                        field = schemaFor.newInstance();
                        ww0Var.setField(n0Var.descriptor, field);
                    }
                    return mergeGroupField(field, schemaFor, bArr, i2, i3, i5, fgVar);
                case 18:
                    ln2 schemaFor2 = ja2.getInstance().schemaFor((Class) n0Var.getMessageDefaultInstance().getClass());
                    if (n0Var.isRepeated()) {
                        int decodeMessageField = decodeMessageField(schemaFor2, bArr, i2, i3, fgVar);
                        ww0Var.addRepeatedField(n0Var.descriptor, fgVar.object1);
                        return decodeMessageField;
                    }
                    Object field2 = ww0Var.getField(n0Var.descriptor);
                    if (field2 == null) {
                        field2 = schemaFor2.newInstance();
                        ww0Var.setField(n0Var.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaFor2, bArr, i2, i3, fgVar);
            }
        }
        if (n0Var.isRepeated()) {
            ww0Var.addRepeatedField(n0Var.descriptor, obj);
        } else {
            ww0Var.setField(n0Var.descriptor, obj);
        }
        return i2;
    }

    public static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i2, int i3, Object obj, yv1 yv1Var, fh3 fh3Var, fg fgVar) throws IOException {
        n0 findLiteExtensionByNumber = fgVar.extensionRegistry.findLiteExtensionByNumber(yv1Var, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i2, i3, v0.getMutableUnknownFields(obj), fgVar);
        }
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i2, i3, generatedMessageLite$ExtendableMessage, findLiteExtensionByNumber, fh3Var, fgVar);
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        ed1 ed1Var = (ed1) wd1Var;
        ed1Var.addInt(decodeFixed32(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            ed1Var.addInt(decodeFixed32(bArr, decodeVarint32));
            i4 = decodeVarint32 + 4;
        }
        return i4;
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        do1 do1Var = (do1) wd1Var;
        do1Var.addLong(decodeFixed64(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            do1Var.addLong(decodeFixed64(bArr, decodeVarint32));
            i4 = decodeVarint32 + 8;
        }
        return i4;
    }

    public static float decodeFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    public static int decodeFloatList(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        yy0 yy0Var = (yy0) wd1Var;
        yy0Var.addFloat(decodeFloat(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            yy0Var.addFloat(decodeFloat(bArr, decodeVarint32));
            i4 = decodeVarint32 + 4;
        }
        return i4;
    }

    public static int decodeGroupField(ln2 ln2Var, byte[] bArr, int i, int i2, int i3, fg fgVar) throws IOException {
        Object newInstance = ln2Var.newInstance();
        int mergeGroupField = mergeGroupField(newInstance, ln2Var, bArr, i, i2, i3, fgVar);
        ln2Var.makeImmutable(newInstance);
        fgVar.object1 = newInstance;
        return mergeGroupField;
    }

    public static int decodeGroupList(ln2 ln2Var, int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int decodeGroupField = decodeGroupField(ln2Var, bArr, i2, i3, i4, fgVar);
        wd1Var.add(fgVar.object1);
        while (decodeGroupField < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeGroupField, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(ln2Var, bArr, decodeVarint32, i3, i4, fgVar);
            wd1Var.add(fgVar.object1);
        }
        return decodeGroupField;
    }

    public static int decodeMessageField(ln2 ln2Var, byte[] bArr, int i, int i2, fg fgVar) throws IOException {
        Object newInstance = ln2Var.newInstance();
        int mergeMessageField = mergeMessageField(newInstance, ln2Var, bArr, i, i2, fgVar);
        ln2Var.makeImmutable(newInstance);
        fgVar.object1 = newInstance;
        return mergeMessageField;
    }

    public static int decodeMessageList(ln2 ln2Var, int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) throws IOException {
        int decodeMessageField = decodeMessageField(ln2Var, bArr, i2, i3, fgVar);
        wd1Var.add(fgVar.object1);
        while (decodeMessageField < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeMessageField, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(ln2Var, bArr, decodeVarint32, i3, fgVar);
            wd1Var.add(fgVar.object1);
        }
        return decodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        boolean z;
        oq oqVar = (oq) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, fgVar);
            if (fgVar.long1 != 0) {
                z = true;
            } else {
                z = false;
            }
            oqVar.addBoolean(z);
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        cm0 cm0Var = (cm0) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            cm0Var.addDouble(decodeDouble(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        ed1 ed1Var = (ed1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            ed1Var.addInt(decodeFixed32(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        do1 do1Var = (do1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            do1Var.addLong(decodeFixed64(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        yy0 yy0Var = (yy0) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            yy0Var.addFloat(decodeFloat(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        ed1 ed1Var = (ed1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, fgVar);
            ed1Var.addInt(m.decodeZigZag32(fgVar.int1));
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        do1 do1Var = (do1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, fgVar);
            do1Var.addLong(m.decodeZigZag64(fgVar.long1));
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        ed1 ed1Var = (ed1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, fgVar);
            ed1Var.addInt(fgVar.int1);
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i, wd1 wd1Var, fg fgVar) throws IOException {
        do1 do1Var = (do1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, fgVar);
            do1Var.addLong(fgVar.long1);
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw he1.truncatedMessage();
    }

    public static int decodeSInt32List(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        ed1 ed1Var = (ed1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i2, fgVar);
        ed1Var.addInt(m.decodeZigZag32(fgVar.int1));
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, fgVar);
            ed1Var.addInt(m.decodeZigZag32(fgVar.int1));
        }
        return decodeVarint32;
    }

    public static int decodeSInt64List(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        do1 do1Var = (do1) wd1Var;
        int decodeVarint64 = decodeVarint64(bArr, i2, fgVar);
        do1Var.addLong(m.decodeZigZag64(fgVar.long1));
        while (decodeVarint64 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, fgVar);
            do1Var.addLong(m.decodeZigZag64(fgVar.long1));
        }
        return decodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i, fg fgVar) throws he1 {
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1;
        if (i2 >= 0) {
            if (i2 == 0) {
                fgVar.object1 = "";
                return decodeVarint32;
            }
            fgVar.object1 = new String(bArr, decodeVarint32, i2, r0.UTF_8);
            return decodeVarint32 + i2;
        }
        throw he1.negativeSize();
    }

    public static int decodeStringList(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) throws he1 {
        int decodeVarint32 = decodeVarint32(bArr, i2, fgVar);
        int i4 = fgVar.int1;
        if (i4 >= 0) {
            if (i4 == 0) {
                wd1Var.add("");
            } else {
                wd1Var.add(new String(bArr, decodeVarint32, i4, r0.UTF_8));
                decodeVarint32 += i4;
            }
            while (decodeVarint32 < i3) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, fgVar);
                if (i != fgVar.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, fgVar);
                int i5 = fgVar.int1;
                if (i5 >= 0) {
                    if (i5 == 0) {
                        wd1Var.add("");
                    } else {
                        wd1Var.add(new String(bArr, decodeVarint32, i5, r0.UTF_8));
                        decodeVarint32 += i5;
                    }
                } else {
                    throw he1.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw he1.negativeSize();
    }

    public static int decodeStringListRequireUtf8(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) throws he1 {
        int decodeVarint32 = decodeVarint32(bArr, i2, fgVar);
        int i4 = fgVar.int1;
        if (i4 >= 0) {
            if (i4 == 0) {
                wd1Var.add("");
            } else {
                int i5 = decodeVarint32 + i4;
                if (ti3.isValidUtf8(bArr, decodeVarint32, i5)) {
                    wd1Var.add(new String(bArr, decodeVarint32, i4, r0.UTF_8));
                    decodeVarint32 = i5;
                } else {
                    throw he1.invalidUtf8();
                }
            }
            while (decodeVarint32 < i3) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, fgVar);
                if (i != fgVar.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, fgVar);
                int i6 = fgVar.int1;
                if (i6 >= 0) {
                    if (i6 == 0) {
                        wd1Var.add("");
                    } else {
                        int i7 = decodeVarint32 + i6;
                        if (ti3.isValidUtf8(bArr, decodeVarint32, i7)) {
                            wd1Var.add(new String(bArr, decodeVarint32, i6, r0.UTF_8));
                            decodeVarint32 = i7;
                        } else {
                            throw he1.invalidUtf8();
                        }
                    }
                } else {
                    throw he1.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw he1.negativeSize();
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i, fg fgVar) throws he1 {
        int decodeVarint32 = decodeVarint32(bArr, i, fgVar);
        int i2 = fgVar.int1;
        if (i2 >= 0) {
            if (i2 == 0) {
                fgVar.object1 = "";
                return decodeVarint32;
            }
            fgVar.object1 = ti3.decodeUtf8(bArr, decodeVarint32, i2);
            return decodeVarint32 + i2;
        }
        throw he1.negativeSize();
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, gh3 gh3Var, fg fgVar) throws he1 {
        if (r1.getTagFieldNumber(i) != 0) {
            int tagWireType = r1.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                gh3Var.storeField(i, Integer.valueOf(decodeFixed32(bArr, i2)));
                                return i2 + 4;
                            }
                            throw he1.invalidTag();
                        }
                        gh3 newInstance = gh3.newInstance();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int decodeVarint32 = decodeVarint32(bArr, i2, fgVar);
                            int i6 = fgVar.int1;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = decodeVarint32;
                                break;
                            }
                            i5 = i6;
                            i2 = decodeUnknownField(i6, bArr, decodeVarint32, i3, newInstance, fgVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            gh3Var.storeField(i, newInstance);
                            return i2;
                        }
                        throw he1.parseFailure();
                    }
                    int decodeVarint322 = decodeVarint32(bArr, i2, fgVar);
                    int i7 = fgVar.int1;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - decodeVarint322) {
                            if (i7 == 0) {
                                gh3Var.storeField(i, g.EMPTY);
                            } else {
                                gh3Var.storeField(i, g.copyFrom(bArr, decodeVarint322, i7));
                            }
                            return decodeVarint322 + i7;
                        }
                        throw he1.truncatedMessage();
                    }
                    throw he1.negativeSize();
                }
                gh3Var.storeField(i, Long.valueOf(decodeFixed64(bArr, i2)));
                return i2 + 8;
            }
            int decodeVarint64 = decodeVarint64(bArr, i2, fgVar);
            gh3Var.storeField(i, Long.valueOf(fgVar.long1));
            return decodeVarint64;
        }
        throw he1.invalidTag();
    }

    public static int decodeVarint32(byte[] bArr, int i, fg fgVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            fgVar.int1 = b2;
            return i2;
        }
        return decodeVarint32(b2, bArr, i2, fgVar);
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        ed1 ed1Var = (ed1) wd1Var;
        int decodeVarint32 = decodeVarint32(bArr, i2, fgVar);
        ed1Var.addInt(fgVar.int1);
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, fgVar);
            ed1Var.addInt(fgVar.int1);
        }
        return decodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i, fg fgVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            fgVar.long1 = j;
            return i2;
        }
        return decodeVarint64(j, bArr, i2, fgVar);
    }

    public static int decodeVarint64List(int i, byte[] bArr, int i2, int i3, wd1 wd1Var, fg fgVar) {
        do1 do1Var = (do1) wd1Var;
        int decodeVarint64 = decodeVarint64(bArr, i2, fgVar);
        do1Var.addLong(fgVar.long1);
        while (decodeVarint64 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, fgVar);
            if (i != fgVar.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, fgVar);
            do1Var.addLong(fgVar.long1);
        }
        return decodeVarint64;
    }

    public static int mergeGroupField(Object obj, ln2 ln2Var, byte[] bArr, int i, int i2, int i3, fg fgVar) throws IOException {
        int parseProto2Message = ((v0) ln2Var).parseProto2Message(obj, bArr, i, i2, i3, fgVar);
        fgVar.object1 = obj;
        return parseProto2Message;
    }

    public static int mergeMessageField(Object obj, ln2 ln2Var, byte[] bArr, int i, int i2, fg fgVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = decodeVarint32(i4, bArr, i3, fgVar);
            i4 = fgVar.int1;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            ln2Var.mergeFrom(obj, bArr, i5, i6, fgVar);
            fgVar.object1 = obj;
            return i6;
        }
        throw he1.truncatedMessage();
    }

    public static int skipField(int i, byte[] bArr, int i2, int i3, fg fgVar) throws he1 {
        if (r1.getTagFieldNumber(i) != 0) {
            int tagWireType = r1.getTagWireType(i);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i2 + 4;
                            }
                            throw he1.invalidTag();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = decodeVarint32(bArr, i2, fgVar);
                            i5 = fgVar.int1;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = skipField(i5, bArr, i2, i3, fgVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw he1.parseFailure();
                    }
                    return decodeVarint32(bArr, i2, fgVar) + fgVar.int1;
                }
                return i2 + 8;
            }
            return decodeVarint64(bArr, i2, fgVar);
        }
        throw he1.invalidTag();
    }

    public static int decodeVarint32(int i, byte[] bArr, int i2, fg fgVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            fgVar.int1 = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            fgVar.int1 = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            fgVar.int1 = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            fgVar.int1 = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                fgVar.int1 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int decodeVarint64(long j, byte[] bArr, int i, fg fgVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b2 < 0) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            i3 += 7;
            j2 |= (b3 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b2 = b3;
        }
        fgVar.long1 = j2;
        return i2;
    }
}
