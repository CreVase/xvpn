package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.i1;
import com.google.protobuf.n1;
import com.google.protobuf.o0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class rn2 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final fh3 PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final fh3 PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final fh3 UNKNOWN_FIELD_SET_LITE_SCHEMA = new i1();

    private rn2() {
    }

    public static int computeSizeBoolList(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return v.computeLengthDelimitedFieldSize(size) + v.computeTagSize(i);
        }
        return v.computeBoolSize(i, true) * size;
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = v.computeTagSize(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            computeTagSize += v.computeBytesSizeNoTag(list.get(i2));
        }
        return computeTagSize;
    }

    public static int computeSizeEnumList(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * size) + computeSizeEnumListNoTag;
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeEnumSizeNoTag(ed1Var.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeEnumSizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int computeSizeFixed32List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return v.computeLengthDelimitedFieldSize(size * 4) + v.computeTagSize(i);
        }
        return v.computeFixed32Size(i, 0) * size;
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return v.computeLengthDelimitedFieldSize(size * 8) + v.computeTagSize(i);
        }
        return v.computeFixed64Size(i, 0L) * size;
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i, List<yv1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += v.computeGroupSize(i, list.get(i3));
        }
        return i2;
    }

    public static int computeSizeInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * size) + computeSizeInt32ListNoTag;
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeInt32SizeNoTag(ed1Var.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeInt32SizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int computeSizeInt64List(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * list.size()) + computeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeInt64SizeNoTag(do1Var.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeInt64SizeNoTag(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int computeSizeMessage(int i, Object obj, ln2 ln2Var) {
        if (obj instanceof bj1) {
            return v.computeLazyFieldSize(i, (bj1) obj);
        }
        return v.computeMessageSize(i, (yv1) obj, ln2Var);
    }

    public static int computeSizeMessageList(int i, List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = v.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof bj1) {
                computeMessageSizeNoTag = v.computeLazyFieldSizeNoTag((bj1) obj);
            } else {
                computeMessageSizeNoTag = v.computeMessageSizeNoTag((yv1) obj);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static int computeSizeSInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * size) + computeSizeSInt32ListNoTag;
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeSInt32SizeNoTag(ed1Var.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeSInt32SizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int computeSizeSInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * size) + computeSizeSInt64ListNoTag;
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeSInt64SizeNoTag(do1Var.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeSInt64SizeNoTag(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int computeSizeStringList(int i, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = v.computeTagSize(i) * size;
        if (list instanceof ij1) {
            ij1 ij1Var = (ij1) list;
            while (i2 < size) {
                Object raw = ij1Var.getRaw(i2);
                if (raw instanceof g) {
                    computeStringSizeNoTag2 = v.computeBytesSizeNoTag((g) raw);
                } else {
                    computeStringSizeNoTag2 = v.computeStringSizeNoTag((String) raw);
                }
                computeTagSize = computeStringSizeNoTag2 + computeTagSize;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof g) {
                    computeStringSizeNoTag = v.computeBytesSizeNoTag((g) obj);
                } else {
                    computeStringSizeNoTag = v.computeStringSizeNoTag((String) obj);
                }
                computeTagSize = computeStringSizeNoTag + computeTagSize;
                i2++;
            }
        }
        return computeTagSize;
    }

    public static int computeSizeUInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * size) + computeSizeUInt32ListNoTag;
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeUInt32SizeNoTag(ed1Var.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeUInt32SizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int computeSizeUInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z) {
            return v.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag) + v.computeTagSize(i);
        }
        return (v.computeTagSize(i) * size) + computeSizeUInt64ListNoTag;
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            i = 0;
            while (i2 < size) {
                i += v.computeUInt64SizeNoTag(do1Var.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v.computeUInt64SizeNoTag(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, rd1 rd1Var, UB ub, fh3 fh3Var) {
        if (rd1Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (rd1Var.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, intValue, ub, fh3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (rd1Var.findValueByNumber(intValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, intValue2, ub, fh3Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return n1.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static fh3 getUnknownFieldSetSchema(boolean z) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (fh3) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends vw0> void mergeExtensions(zu0 zu0Var, T t, T t2) {
        ww0 extensions = zu0Var.getExtensions(t2);
        if (!extensions.isEmpty()) {
            zu0Var.getMutableExtensions(t).mergeFrom(extensions);
        }
    }

    public static <T> void mergeMap(yp1 yp1Var, T t, T t2, long j) {
        n1.putObject(t, j, ((zp1) yp1Var).mergeFrom(n1.getObject(t, j), n1.getObject(t2, j)));
    }

    public static <T, UT, UB> void mergeUnknownFields(fh3 fh3Var, T t, T t2) {
        fh3Var.setToMessage(t, fh3Var.merge(fh3Var.getFromMessage(t), fh3Var.getFromMessage(t2)));
    }

    public static fh3 proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static fh3 proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!o0.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (i2 - i) + 1;
        long j2 = i3;
        return j + 9 <= ((j2 + 3) * 3) + ((2 * j2) + 3);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i, int i2, UB ub, fh3 fh3Var) {
        if (ub == null) {
            ub = (UB) fh3Var.getBuilderFromMessage(obj);
        }
        fh3Var.addVarint(ub, i, i2);
        return ub;
    }

    public static String toCamelCase(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ('a' <= charAt && charAt <= 'z') {
                if (z) {
                    sb.append((char) (charAt - ' '));
                } else {
                    sb.append(charAt);
                }
            } else if ('A' <= charAt && charAt <= 'Z') {
                if (i == 0 && !z) {
                    sb.append((char) (charAt + ' '));
                } else {
                    sb.append(charAt);
                }
            } else {
                if ('0' <= charAt && charAt <= '9') {
                    sb.append(charAt);
                }
                z = true;
            }
            z = false;
        }
        return sb.toString();
    }

    public static fh3 unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i, boolean z, kt3 kt3Var) throws IOException {
        if (z) {
            ((x) kt3Var).writeBool(i, true);
        }
    }

    public static void writeBoolList(int i, List<Boolean> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeBoolList(i, list, z);
        }
    }

    public static void writeBytes(int i, g gVar, kt3 kt3Var) throws IOException {
        if (gVar != null && !gVar.isEmpty()) {
            ((x) kt3Var).writeBytes(i, gVar);
        }
    }

    public static void writeBytesList(int i, List<g> list, kt3 kt3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeBytesList(i, list);
        }
    }

    public static void writeDouble(int i, double d, kt3 kt3Var) throws IOException {
        if (Double.doubleToRawLongBits(d) != 0) {
            ((x) kt3Var).writeDouble(i, d);
        }
    }

    public static void writeDoubleList(int i, List<Double> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeDoubleList(i, list, z);
        }
    }

    public static void writeEnum(int i, int i2, kt3 kt3Var) throws IOException {
        if (i2 != 0) {
            ((x) kt3Var).writeEnum(i, i2);
        }
    }

    public static void writeEnumList(int i, List<Integer> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeEnumList(i, list, z);
        }
    }

    public static void writeFixed32(int i, int i2, kt3 kt3Var) throws IOException {
        if (i2 != 0) {
            ((x) kt3Var).writeFixed32(i, i2);
        }
    }

    public static void writeFixed32List(int i, List<Integer> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeFixed32List(i, list, z);
        }
    }

    public static void writeFixed64(int i, long j, kt3 kt3Var) throws IOException {
        if (j != 0) {
            ((x) kt3Var).writeFixed64(i, j);
        }
    }

    public static void writeFixed64List(int i, List<Long> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeFixed64List(i, list, z);
        }
    }

    public static void writeFloat(int i, float f, kt3 kt3Var) throws IOException {
        if (Float.floatToRawIntBits(f) != 0) {
            ((x) kt3Var).writeFloat(i, f);
        }
    }

    public static void writeFloatList(int i, List<Float> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeFloatList(i, list, z);
        }
    }

    public static void writeGroupList(int i, List<?> list, kt3 kt3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((x) kt3Var).writeGroupList(i, list);
    }

    public static void writeInt32(int i, int i2, kt3 kt3Var) throws IOException {
        if (i2 != 0) {
            ((x) kt3Var).writeInt32(i, i2);
        }
    }

    public static void writeInt32List(int i, List<Integer> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeInt32List(i, list, z);
        }
    }

    public static void writeInt64(int i, long j, kt3 kt3Var) throws IOException {
        if (j != 0) {
            ((x) kt3Var).writeInt64(i, j);
        }
    }

    public static void writeInt64List(int i, List<Long> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeInt64List(i, list, z);
        }
    }

    public static void writeLazyFieldList(int i, List<?> list, kt3 kt3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((bj1) it.next()).writeTo(kt3Var, i);
            }
        }
    }

    public static void writeMessage(int i, Object obj, kt3 kt3Var) throws IOException {
        if (obj != null) {
            ((x) kt3Var).writeMessage(i, obj);
        }
    }

    public static void writeMessageList(int i, List<?> list, kt3 kt3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((x) kt3Var).writeMessageList(i, list);
    }

    public static void writeSFixed32(int i, int i2, kt3 kt3Var) throws IOException {
        if (i2 != 0) {
            ((x) kt3Var).writeSFixed32(i, i2);
        }
    }

    public static void writeSFixed32List(int i, List<Integer> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeSFixed32List(i, list, z);
        }
    }

    public static void writeSFixed64(int i, long j, kt3 kt3Var) throws IOException {
        if (j != 0) {
            ((x) kt3Var).writeSFixed64(i, j);
        }
    }

    public static void writeSFixed64List(int i, List<Long> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeSFixed64List(i, list, z);
        }
    }

    public static void writeSInt32(int i, int i2, kt3 kt3Var) throws IOException {
        if (i2 != 0) {
            ((x) kt3Var).writeSInt32(i, i2);
        }
    }

    public static void writeSInt32List(int i, List<Integer> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeSInt32List(i, list, z);
        }
    }

    public static void writeSInt64(int i, long j, kt3 kt3Var) throws IOException {
        if (j != 0) {
            ((x) kt3Var).writeSInt64(i, j);
        }
    }

    public static void writeSInt64List(int i, List<Long> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeSInt64List(i, list, z);
        }
    }

    public static void writeString(int i, Object obj, kt3 kt3Var) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i, (String) obj, kt3Var);
        } else {
            writeBytes(i, (g) obj, kt3Var);
        }
    }

    private static void writeStringInternal(int i, String str, kt3 kt3Var) throws IOException {
        if (str != null && !str.isEmpty()) {
            ((x) kt3Var).writeString(i, str);
        }
    }

    public static void writeStringList(int i, List<String> list, kt3 kt3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeStringList(i, list);
        }
    }

    public static void writeUInt32(int i, int i2, kt3 kt3Var) throws IOException {
        if (i2 != 0) {
            ((x) kt3Var).writeUInt32(i, i2);
        }
    }

    public static void writeUInt32List(int i, List<Integer> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeUInt32List(i, list, z);
        }
    }

    public static void writeUInt64(int i, long j, kt3 kt3Var) throws IOException {
        if (j != 0) {
            ((x) kt3Var).writeUInt64(i, j);
        }
    }

    public static void writeUInt64List(int i, List<Long> list, kt3 kt3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((x) kt3Var).writeUInt64List(i, list, z);
        }
    }

    public static boolean shouldUseTableSwitch(pw0[] pw0VarArr) {
        if (pw0VarArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(pw0VarArr[0].getFieldNumber(), pw0VarArr[pw0VarArr.length - 1].getFieldNumber(), pw0VarArr.length);
    }

    public static int computeSizeGroupList(int i, List<yv1> list, ln2 ln2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += v.computeGroupSize(i, list.get(i3), ln2Var);
        }
        return i2;
    }

    public static void writeGroupList(int i, List<?> list, kt3 kt3Var, ln2 ln2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((x) kt3Var).writeGroupList(i, list, ln2Var);
    }

    public static void writeMessageList(int i, List<?> list, kt3 kt3Var, ln2 ln2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((x) kt3Var).writeMessageList(i, list, ln2Var);
    }

    public static int computeSizeMessageList(int i, List<?> list, ln2 ln2Var) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = v.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof bj1) {
                computeMessageSizeNoTag = v.computeLazyFieldSizeNoTag((bj1) obj);
            } else {
                computeMessageSizeNoTag = v.computeMessageSizeNoTag((yv1) obj, ln2Var);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, sd1 sd1Var, UB ub, fh3 fh3Var) {
        if (sd1Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (sd1Var.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, intValue, ub, fh3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!sd1Var.isInRange(intValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i, intValue2, ub, fh3Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
