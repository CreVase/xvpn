package com.google.protobuf;

import defpackage.ij1;
import defpackage.jt3;
import defpackage.kt3;
import defpackage.ln2;
import defpackage.qp1;
import defpackage.rp1;
import defpackage.yv1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x implements kt3 {
    private final v output;

    private x(v vVar) {
        v vVar2 = (v) r0.checkNotNull(vVar, "output");
        this.output = vVar2;
        vVar2.wrapper = this;
    }

    public static x forCodedOutput(v vVar) {
        x xVar = vVar.wrapper;
        if (xVar != null) {
            return xVar;
        }
        return new x(vVar);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i, boolean z, V v, qp1 qp1Var) throws IOException {
        this.output.writeTag(i, 2);
        this.output.writeUInt32NoTag(rp1.computeSerializedSize(qp1Var, Boolean.valueOf(z), v));
        rp1.writeTo(this.output, qp1Var, Boolean.valueOf(z), v);
    }

    private <V> void writeDeterministicIntegerMap(int i, qp1 qp1Var, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(rp1.computeSerializedSize(qp1Var, Integer.valueOf(i4), v));
            rp1.writeTo(this.output, qp1Var, Integer.valueOf(i4), v);
        }
    }

    private <V> void writeDeterministicLongMap(int i, qp1 qp1Var, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(rp1.computeSerializedSize(qp1Var, Long.valueOf(j), v));
            rp1.writeTo(this.output, qp1Var, Long.valueOf(j), v);
        }
    }

    private <K, V> void writeDeterministicMap(int i, qp1 qp1Var, Map<K, V> map) throws IOException {
        switch (w.$SwitchMap$com$google$protobuf$WireFormat$FieldType[qp1Var.keyType.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(i, false, v, qp1Var);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(i, true, v2, qp1Var);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i, qp1Var, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i, qp1Var, map);
                return;
            case 12:
                writeDeterministicStringMap(i, qp1Var, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + qp1Var.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i, qp1 qp1Var, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(rp1.computeSerializedSize(qp1Var, str, v));
            rp1.writeTo(this.output, qp1Var, str, v);
        }
    }

    private void writeLazyString(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.output.writeString(i, (String) obj);
        } else {
            this.output.writeBytes(i, (g) obj);
        }
    }

    @Override // defpackage.kt3
    public jt3 fieldOrder() {
        return jt3.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // defpackage.kt3
    public void writeBool(int i, boolean z) throws IOException {
        this.output.writeBool(i, z);
    }

    @Override // defpackage.kt3
    public void writeBoolList(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeBoolSizeNoTag(list.get(i4).booleanValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeBoolNoTag(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeBool(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeBytes(int i, g gVar) throws IOException {
        this.output.writeBytes(i, gVar);
    }

    @Override // defpackage.kt3
    public void writeBytesList(int i, List<g> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.output.writeBytes(i, list.get(i2));
        }
    }

    @Override // defpackage.kt3
    public void writeDouble(int i, double d) throws IOException {
        this.output.writeDouble(i, d);
    }

    @Override // defpackage.kt3
    public void writeDoubleList(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeDoubleSizeNoTag(list.get(i4).doubleValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeDouble(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    @Deprecated
    public void writeEndGroup(int i) throws IOException {
        this.output.writeTag(i, 4);
    }

    @Override // defpackage.kt3
    public void writeEnum(int i, int i2) throws IOException {
        this.output.writeEnum(i, i2);
    }

    @Override // defpackage.kt3
    public void writeEnumList(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeEnumSizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeEnumNoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeEnum(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeFixed32(int i, int i2) throws IOException {
        this.output.writeFixed32(i, i2);
    }

    @Override // defpackage.kt3
    public void writeFixed32List(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeFixed32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFixed32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeFixed64(int i, long j) throws IOException {
        this.output.writeFixed64(i, j);
    }

    @Override // defpackage.kt3
    public void writeFixed64List(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeFixed64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFixed64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeFloat(int i, float f) throws IOException {
        this.output.writeFloat(i, f);
    }

    @Override // defpackage.kt3
    public void writeFloatList(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeFloatSizeNoTag(list.get(i4).floatValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeFloatNoTag(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeFloat(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    @Deprecated
    public void writeGroup(int i, Object obj) throws IOException {
        this.output.writeGroup(i, (yv1) obj);
    }

    @Override // defpackage.kt3
    @Deprecated
    public void writeGroupList(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2));
        }
    }

    @Override // defpackage.kt3
    public void writeInt32(int i, int i2) throws IOException {
        this.output.writeInt32(i, i2);
    }

    @Override // defpackage.kt3
    public void writeInt32List(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeInt32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeInt64(int i, long j) throws IOException {
        this.output.writeInt64(i, j);
    }

    @Override // defpackage.kt3
    public void writeInt64List(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeInt64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public <K, V> void writeMap(int i, qp1 qp1Var, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i, qp1Var, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(rp1.computeSerializedSize(qp1Var, entry.getKey(), entry.getValue()));
            rp1.writeTo(this.output, qp1Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.kt3
    public void writeMessage(int i, Object obj) throws IOException {
        this.output.writeMessage(i, (yv1) obj);
    }

    @Override // defpackage.kt3
    public void writeMessageList(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2));
        }
    }

    @Override // defpackage.kt3
    public final void writeMessageSetItem(int i, Object obj) throws IOException {
        if (obj instanceof g) {
            this.output.writeRawMessageSetExtension(i, (g) obj);
        } else {
            this.output.writeMessageSetExtension(i, (yv1) obj);
        }
    }

    @Override // defpackage.kt3
    public void writeSFixed32(int i, int i2) throws IOException {
        this.output.writeSFixed32(i, i2);
    }

    @Override // defpackage.kt3
    public void writeSFixed32List(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeSFixed32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSFixed32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeSFixed64(int i, long j) throws IOException {
        this.output.writeSFixed64(i, j);
    }

    @Override // defpackage.kt3
    public void writeSFixed64List(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeSFixed64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSFixed64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeSInt32(int i, int i2) throws IOException {
        this.output.writeSInt32(i, i2);
    }

    @Override // defpackage.kt3
    public void writeSInt32List(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeSInt32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeSInt64(int i, long j) throws IOException {
        this.output.writeSInt64(i, j);
    }

    @Override // defpackage.kt3
    public void writeSInt64List(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeSInt64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeSInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    @Deprecated
    public void writeStartGroup(int i) throws IOException {
        this.output.writeTag(i, 3);
    }

    @Override // defpackage.kt3
    public void writeString(int i, String str) throws IOException {
        this.output.writeString(i, str);
    }

    @Override // defpackage.kt3
    public void writeStringList(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof ij1) {
            ij1 ij1Var = (ij1) list;
            while (i2 < list.size()) {
                writeLazyString(i, ij1Var.getRaw(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeString(i, list.get(i2));
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeUInt32(int i, int i2) throws IOException {
        this.output.writeUInt32(i, i2);
    }

    @Override // defpackage.kt3
    public void writeUInt32List(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeUInt32SizeNoTag(list.get(i4).intValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeUInt32(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeUInt64(int i, long j) throws IOException {
        this.output.writeUInt64(i, j);
    }

    @Override // defpackage.kt3
    public void writeUInt64List(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.output.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += v.computeUInt64SizeNoTag(list.get(i4).longValue());
            }
            this.output.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.output.writeUInt64(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.kt3
    public void writeGroup(int i, Object obj, ln2 ln2Var) throws IOException {
        this.output.writeGroup(i, (yv1) obj, ln2Var);
    }

    @Override // defpackage.kt3
    public void writeMessage(int i, Object obj, ln2 ln2Var) throws IOException {
        this.output.writeMessage(i, (yv1) obj, ln2Var);
    }

    @Override // defpackage.kt3
    public void writeGroupList(int i, List<?> list, ln2 ln2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeGroup(i, list.get(i2), ln2Var);
        }
    }

    @Override // defpackage.kt3
    public void writeMessageList(int i, List<?> list, ln2 ln2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            writeMessage(i, list.get(i2), ln2Var);
        }
    }
}
