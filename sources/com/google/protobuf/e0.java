package com.google.protobuf;

import defpackage.fh3;
import defpackage.ja2;
import defpackage.kr3;
import defpackage.kt3;
import defpackage.ln2;
import defpackage.rn2;
import defpackage.sg2;
import defpackage.ww0;
import defpackage.xu0;
import defpackage.xv1;
import defpackage.yv1;
import defpackage.zu0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e0 extends zu0 {
    @Override // defpackage.zu0
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((m0) entry.getKey()).getNumber();
    }

    @Override // defpackage.zu0
    public Object findExtensionByNumber(xu0 xu0Var, yv1 yv1Var, int i) {
        return xu0Var.findLiteExtensionByNumber(yv1Var, i);
    }

    @Override // defpackage.zu0
    public ww0 getExtensions(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
    }

    @Override // defpackage.zu0
    public ww0 getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // defpackage.zu0
    public boolean hasExtensions(yv1 yv1Var) {
        return yv1Var instanceof GeneratedMessageLite$ExtendableMessage;
    }

    @Override // defpackage.zu0
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // defpackage.zu0
    public <UT, UB> UB parseExtension(Object obj, sg2 sg2Var, Object obj2, xu0 xu0Var, ww0 ww0Var, UB ub, fh3 fh3Var) throws IOException {
        Object valueOf;
        Object field;
        ArrayList arrayList;
        n0 n0Var = (n0) obj2;
        int number = n0Var.getNumber();
        if (n0Var.descriptor.isRepeated() && n0Var.descriptor.isPacked()) {
            switch (d0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[n0Var.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    ((o) sg2Var).readEnumList(arrayList);
                    ub = (UB) rn2.filterUnknownEnumList(obj, number, arrayList, n0Var.descriptor.getEnumType(), ub, fh3Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + n0Var.descriptor.getLiteType());
            }
            ww0Var.setField(n0Var.descriptor, arrayList);
        } else {
            if (n0Var.getLiteType() == kr3.ENUM) {
                int readInt32 = ((o) sg2Var).readInt32();
                if (n0Var.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                    return (UB) rn2.storeUnknownEnum(obj, number, readInt32, ub, fh3Var);
                }
                valueOf = Integer.valueOf(readInt32);
            } else {
                switch (d0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[n0Var.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(((o) sg2Var).readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(((o) sg2Var).readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(((o) sg2Var).readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(((o) sg2Var).readUInt64());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(((o) sg2Var).readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(((o) sg2Var).readFixed64());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(((o) sg2Var).readFixed32());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(((o) sg2Var).readBool());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(((o) sg2Var).readUInt32());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(((o) sg2Var).readSFixed32());
                        break;
                    case 11:
                        valueOf = Long.valueOf(((o) sg2Var).readSFixed64());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(((o) sg2Var).readSInt32());
                        break;
                    case 13:
                        valueOf = Long.valueOf(((o) sg2Var).readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = ((o) sg2Var).readBytes();
                        break;
                    case 16:
                        valueOf = ((o) sg2Var).readString();
                        break;
                    case 17:
                        if (!n0Var.isRepeated()) {
                            Object field2 = ww0Var.getField(n0Var.descriptor);
                            if (field2 instanceof o0) {
                                ln2 schemaFor = ja2.getInstance().schemaFor((ja2) field2);
                                if (!((o0) field2).isMutable()) {
                                    Object newInstance = schemaFor.newInstance();
                                    schemaFor.mergeFrom(newInstance, field2);
                                    ww0Var.setField(n0Var.descriptor, newInstance);
                                    field2 = newInstance;
                                }
                                ((o) sg2Var).mergeGroupField(field2, schemaFor, xu0Var);
                                return ub;
                            }
                        }
                        valueOf = ((o) sg2Var).readGroup(n0Var.getMessageDefaultInstance().getClass(), xu0Var);
                        break;
                    case 18:
                        if (!n0Var.isRepeated()) {
                            Object field3 = ww0Var.getField(n0Var.descriptor);
                            if (field3 instanceof o0) {
                                ln2 schemaFor2 = ja2.getInstance().schemaFor((ja2) field3);
                                if (!((o0) field3).isMutable()) {
                                    Object newInstance2 = schemaFor2.newInstance();
                                    schemaFor2.mergeFrom(newInstance2, field3);
                                    ww0Var.setField(n0Var.descriptor, newInstance2);
                                    field3 = newInstance2;
                                }
                                ((o) sg2Var).mergeMessageField(field3, schemaFor2, xu0Var);
                                return ub;
                            }
                        }
                        valueOf = ((o) sg2Var).readMessage(n0Var.getMessageDefaultInstance().getClass(), xu0Var);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (n0Var.isRepeated()) {
                ww0Var.addRepeatedField(n0Var.descriptor, valueOf);
            } else {
                int i = d0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[n0Var.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (field = ww0Var.getField(n0Var.descriptor)) != null) {
                    valueOf = r0.mergeMessage(field, valueOf);
                }
                ww0Var.setField(n0Var.descriptor, valueOf);
            }
        }
        return ub;
    }

    @Override // defpackage.zu0
    public void parseLengthPrefixedMessageSetItem(sg2 sg2Var, Object obj, xu0 xu0Var, ww0 ww0Var) throws IOException {
        n0 n0Var = (n0) obj;
        ww0Var.setField(n0Var.descriptor, ((o) sg2Var).readMessage(n0Var.getMessageDefaultInstance().getClass(), xu0Var));
    }

    @Override // defpackage.zu0
    public void parseMessageSetItem(g gVar, Object obj, xu0 xu0Var, ww0 ww0Var) throws IOException {
        n0 n0Var = (n0) obj;
        xv1 newBuilderForType = n0Var.getMessageDefaultInstance().newBuilderForType();
        m newCodedInput = gVar.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, xu0Var);
        ww0Var.setField(n0Var.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // defpackage.zu0
    public void serializeExtension(kt3 kt3Var, Map.Entry<?, ?> entry) throws IOException {
        m0 m0Var = (m0) entry.getKey();
        if (m0Var.isRepeated()) {
            switch (d0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m0Var.getLiteType().ordinal()]) {
                case 1:
                    rn2.writeDoubleList(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 2:
                    rn2.writeFloatList(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 3:
                    rn2.writeInt64List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 4:
                    rn2.writeUInt64List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 5:
                    rn2.writeInt32List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 6:
                    rn2.writeFixed64List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 7:
                    rn2.writeFixed32List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 8:
                    rn2.writeBoolList(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 9:
                    rn2.writeUInt32List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 10:
                    rn2.writeSFixed32List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 11:
                    rn2.writeSFixed64List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 12:
                    rn2.writeSInt32List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 13:
                    rn2.writeSInt64List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 14:
                    rn2.writeInt32List(m0Var.getNumber(), (List) entry.getValue(), kt3Var, m0Var.isPacked());
                    return;
                case 15:
                    rn2.writeBytesList(m0Var.getNumber(), (List) entry.getValue(), kt3Var);
                    return;
                case 16:
                    rn2.writeStringList(m0Var.getNumber(), (List) entry.getValue(), kt3Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        rn2.writeGroupList(m0Var.getNumber(), (List) entry.getValue(), kt3Var, ja2.getInstance().schemaFor((Class) list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        rn2.writeMessageList(m0Var.getNumber(), (List) entry.getValue(), kt3Var, ja2.getInstance().schemaFor((Class) list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (d0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m0Var.getLiteType().ordinal()]) {
            case 1:
                ((x) kt3Var).writeDouble(m0Var.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                ((x) kt3Var).writeFloat(m0Var.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ((x) kt3Var).writeInt64(m0Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((x) kt3Var).writeUInt64(m0Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ((x) kt3Var).writeInt32(m0Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ((x) kt3Var).writeFixed64(m0Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ((x) kt3Var).writeFixed32(m0Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ((x) kt3Var).writeBool(m0Var.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ((x) kt3Var).writeUInt32(m0Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ((x) kt3Var).writeSFixed32(m0Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ((x) kt3Var).writeSFixed64(m0Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ((x) kt3Var).writeSInt32(m0Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((x) kt3Var).writeSInt64(m0Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ((x) kt3Var).writeInt32(m0Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((x) kt3Var).writeBytes(m0Var.getNumber(), (g) entry.getValue());
                return;
            case 16:
                ((x) kt3Var).writeString(m0Var.getNumber(), (String) entry.getValue());
                return;
            case 17:
                ((x) kt3Var).writeGroup(m0Var.getNumber(), entry.getValue(), ja2.getInstance().schemaFor((Class) entry.getValue().getClass()));
                return;
            case 18:
                ((x) kt3Var).writeMessage(m0Var.getNumber(), entry.getValue(), ja2.getInstance().schemaFor((Class) entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.zu0
    public void setExtensions(Object obj, ww0 ww0Var) {
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions = ww0Var;
    }
}
