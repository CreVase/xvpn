package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.m0;
import com.google.protobuf.o0;
import com.google.protobuf.r0;
import com.google.protobuf.r1;
import com.google.protobuf.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ww0 {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final ww0 DEFAULT_INSTANCE = new ww0(true);
    private final vw2 fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public /* synthetic */ ww0(vw2 vw2Var, tw0 tw0Var) {
        this(vw2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends vw0> vw2 cloneAllFieldsMap(vw2 vw2Var, boolean z) {
        vw2 newFieldMap = vw2.newFieldMap(16);
        for (int i = 0; i < vw2Var.getNumArrayEntries(); i++) {
            cloneFieldEntry(newFieldMap, vw2Var.getArrayEntryAt(i), z);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = vw2Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), z);
        }
        return newFieldMap;
    }

    private static <T extends vw0> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aj1) {
            map.put(key, ((aj1) value).getValue());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int computeElementSize(kr3 kr3Var, int i, Object obj) {
        int computeTagSize = v.computeTagSize(i);
        if (kr3Var == kr3.GROUP) {
            computeTagSize *= 2;
        }
        return computeElementSizeNoTag(kr3Var, obj) + computeTagSize;
    }

    public static int computeElementSizeNoTag(kr3 kr3Var, Object obj) {
        switch (tw0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[kr3Var.ordinal()]) {
            case 1:
                return v.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return v.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return v.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return v.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return v.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return v.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return v.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return v.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return v.computeGroupSizeNoTag((yv1) obj);
            case 10:
                if (obj instanceof aj1) {
                    return v.computeLazyFieldSizeNoTag((aj1) obj);
                }
                return v.computeMessageSizeNoTag((yv1) obj);
            case 11:
                if (obj instanceof g) {
                    return v.computeBytesSizeNoTag((g) obj);
                }
                return v.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof g) {
                    return v.computeBytesSizeNoTag((g) obj);
                }
                return v.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return v.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return v.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return v.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return v.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return v.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof qd1) {
                    return v.computeEnumSizeNoTag(((qd1) obj).getNumber());
                }
                return v.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(vw0 vw0Var, Object obj) {
        m0 m0Var = (m0) vw0Var;
        kr3 liteType = m0Var.getLiteType();
        int number = m0Var.getNumber();
        if (m0Var.isRepeated()) {
            int i = 0;
            if (m0Var.isPacked()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i += computeElementSizeNoTag(liteType, it.next());
                }
                return v.computeUInt32SizeNoTag(i) + v.computeTagSize(number) + i;
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i += computeElementSize(liteType, number, it2.next());
            }
            return i;
        }
        return computeElementSize(liteType, number, obj);
    }

    public static <T extends vw0> ww0 emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static int getWireFormatForFieldType(kr3 kr3Var, boolean z) {
        if (z) {
            return 2;
        }
        return kr3Var.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof zv1) {
            return ((zv1) obj).isInitialized();
        }
        if (obj instanceof aj1) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(kr3 kr3Var, Object obj) {
        r0.checkNotNull(obj);
        switch (tw0.$SwitchMap$com$google$protobuf$WireFormat$JavaType[kr3Var.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof g) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof qd1)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof yv1) || (obj instanceof aj1)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<vw0, Object> entry) {
        vw0 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aj1) {
            value = ((aj1) value).getValue();
        }
        m0 m0Var = (m0) key;
        if (m0Var.isRepeated()) {
            Object field = getField(m0Var);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable<Object>) m0Var, field);
            return;
        }
        if (m0Var.getLiteJavaType() == mr3.MESSAGE) {
            Object field2 = getField(m0Var);
            if (field2 == null) {
                this.fields.put((Comparable<Object>) m0Var, cloneIfMutable(value));
                return;
            } else {
                this.fields.put((Comparable<Object>) m0Var, (Object) m0Var.internalMergeFrom(((yv1) field2).toBuilder(), (yv1) value).build());
                return;
            }
        }
        this.fields.put((Comparable<Object>) m0Var, cloneIfMutable(value));
    }

    public static <T extends vw0> uw0 newBuilder() {
        return new uw0((tw0) null);
    }

    public static <T extends vw0> ww0 newFieldSet() {
        return new ww0();
    }

    public static Object readPrimitiveField(m mVar, kr3 kr3Var, boolean z) throws IOException {
        if (z) {
            return r1.readPrimitiveField(mVar, kr3Var, rr3.STRICT);
        }
        return r1.readPrimitiveField(mVar, kr3Var, rr3.LOOSE);
    }

    private void verifyType(vw0 vw0Var, Object obj) {
        m0 m0Var = (m0) vw0Var;
        if (isValidType(m0Var.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m0Var.getNumber()), m0Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeElement(v vVar, kr3 kr3Var, int i, Object obj) throws IOException {
        if (kr3Var == kr3.GROUP) {
            vVar.writeGroup(i, (yv1) obj);
        } else {
            vVar.writeTag(i, getWireFormatForFieldType(kr3Var, false));
            writeElementNoTag(vVar, kr3Var, obj);
        }
    }

    public static void writeElementNoTag(v vVar, kr3 kr3Var, Object obj) throws IOException {
        switch (tw0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[kr3Var.ordinal()]) {
            case 1:
                vVar.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                vVar.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                vVar.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                vVar.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                vVar.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                vVar.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                vVar.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                vVar.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                vVar.writeGroupNoTag((yv1) obj);
                return;
            case 10:
                vVar.writeMessageNoTag((yv1) obj);
                return;
            case 11:
                if (obj instanceof g) {
                    vVar.writeBytesNoTag((g) obj);
                    return;
                } else {
                    vVar.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof g) {
                    vVar.writeBytesNoTag((g) obj);
                    return;
                } else {
                    vVar.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                vVar.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                vVar.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                vVar.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                vVar.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                vVar.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof qd1) {
                    vVar.writeEnumNoTag(((qd1) obj).getNumber());
                    return;
                } else {
                    vVar.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(vw0 vw0Var, Object obj, v vVar) throws IOException {
        m0 m0Var = (m0) vw0Var;
        kr3 liteType = m0Var.getLiteType();
        int number = m0Var.getNumber();
        if (m0Var.isRepeated()) {
            List list = (List) obj;
            if (m0Var.isPacked()) {
                vVar.writeTag(number, 2);
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += computeElementSizeNoTag(liteType, it.next());
                }
                vVar.writeUInt32NoTag(i);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(vVar, liteType, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(vVar, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof aj1) {
            writeElement(vVar, liteType, number, ((aj1) obj).getValue());
        } else {
            writeElement(vVar, liteType, number, obj);
        }
    }

    public void addRepeatedField(vw0 vw0Var, Object obj) {
        List list;
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            verifyType(m0Var, obj);
            Object field = getField(m0Var);
            if (field == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) m0Var, (Object) list);
            } else {
                list = (List) field;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(vw0 vw0Var) {
        this.fields.remove(vw0Var);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Iterator<Map.Entry<vw0, Object>> descendingIterator() {
        if (this.hasLazyField) {
            return new zi1(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww0)) {
            return false;
        }
        return this.fields.equals(((ww0) obj).fields);
    }

    public Map<vw0, Object> getAllFields() {
        if (this.hasLazyField) {
            vw2 cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            }
            return cloneAllFieldsMap;
        }
        if (this.fields.isImmutable()) {
            return this.fields;
        }
        return Collections.unmodifiableMap(this.fields);
    }

    public Object getField(vw0 vw0Var) {
        Object obj = this.fields.get(vw0Var);
        if (obj instanceof aj1) {
            return ((aj1) obj).getValue();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMessageSetSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            i += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i += getMessageSetSerializedSize(it.next());
        }
        return i;
    }

    public Object getRepeatedField(vw0 vw0Var, int i) {
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            Object field = getField(m0Var);
            if (field != null) {
                return ((List) field).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(vw0 vw0Var) {
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            Object field = getField(m0Var);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize((vw0) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            i += computeFieldSize((vw0) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public boolean hasField(vw0 vw0Var) {
        m0 m0Var = (m0) vw0Var;
        if (!m0Var.isRepeated()) {
            if (this.fields.get(m0Var) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<vw0, Object>> iterator() {
        if (this.hasLazyField) {
            return new zi1(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof o0) {
                ((o0) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(ww0 ww0Var) {
        for (int i = 0; i < ww0Var.fields.getNumArrayEntries(); i++) {
            mergeFromField(ww0Var.fields.getArrayEntryAt(i));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = ww0Var.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(vw0 vw0Var, Object obj) {
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    verifyType(m0Var, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            verifyType(m0Var, obj);
        }
        if (obj instanceof aj1) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable<Object>) m0Var, obj);
    }

    public void setRepeatedField(vw0 vw0Var, int i, Object obj) {
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            Object field = getField(m0Var);
            if (field != null) {
                verifyType(m0Var, obj);
                ((List) field).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeMessageSetTo(v vVar) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), vVar);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), vVar);
        }
    }

    public void writeTo(v vVar) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((vw0) arrayEntryAt.getKey(), arrayEntryAt.getValue(), vVar);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            writeField((vw0) entry.getKey(), entry.getValue(), vVar);
        }
    }

    private ww0() {
        this.fields = vw2.newFieldMap(16);
    }

    public ww0 clone() {
        ww0 newFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            newFieldSet.setField((vw0) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField((vw0) entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    private ww0(boolean z) {
        this(vw2.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<vw0, Object> entry) {
        vw0 key = entry.getKey();
        Object value = entry.getValue();
        m0 m0Var = (m0) key;
        if (m0Var.getLiteJavaType() == mr3.MESSAGE && !m0Var.isRepeated() && !m0Var.isPacked()) {
            if (value instanceof aj1) {
                return v.computeLazyFieldMessageSetExtensionSize(((m0) entry.getKey()).getNumber(), (aj1) value);
            }
            return v.computeMessageSetExtensionSize(((m0) entry.getKey()).getNumber(), (yv1) value);
        }
        return computeFieldSize(m0Var, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends vw0> boolean isInitialized(Map.Entry<T, Object> entry) {
        m0 m0Var = (m0) entry.getKey();
        if (m0Var.getLiteJavaType() != mr3.MESSAGE) {
            return true;
        }
        if (m0Var.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<vw0, Object> entry, v vVar) throws IOException {
        m0 m0Var = (m0) entry.getKey();
        if (m0Var.getLiteJavaType() == mr3.MESSAGE && !m0Var.isRepeated() && !m0Var.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof aj1) {
                value = ((aj1) value).getValue();
            }
            vVar.writeMessageSetExtension(((m0) entry.getKey()).getNumber(), (yv1) value);
            return;
        }
        writeField(m0Var, entry.getValue(), vVar);
    }

    private ww0(vw2 vw2Var) {
        this.fields = vw2Var;
        makeImmutable();
    }
}
