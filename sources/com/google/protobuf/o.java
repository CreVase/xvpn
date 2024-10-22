package com.google.protobuf;

import defpackage.cm0;
import defpackage.do1;
import defpackage.ed1;
import defpackage.he1;
import defpackage.ij1;
import defpackage.ja2;
import defpackage.kr3;
import defpackage.ln2;
import defpackage.oq;
import defpackage.sg2;
import defpackage.xu0;
import defpackage.yy0;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o implements sg2 {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final m input;
    private int nextTag = 0;
    private int tag;

    private o(m mVar) {
        m mVar2 = (m) r0.checkNotNull(mVar, "input");
        this.input = mVar2;
        mVar2.wrapper = this;
    }

    public static o forCodedInput(m mVar) {
        o oVar = mVar.wrapper;
        if (oVar != null) {
            return oVar;
        }
        return new o(mVar);
    }

    private <T> void mergeGroupFieldInternal(T t, ln2 ln2Var, xu0 xu0Var) throws IOException {
        int i = this.endGroupTag;
        this.endGroupTag = r1.makeTag(r1.getTagFieldNumber(this.tag), 4);
        try {
            ln2Var.mergeFrom(t, this, xu0Var);
            if (this.tag == this.endGroupTag) {
            } else {
                throw he1.parseFailure();
            }
        } finally {
            this.endGroupTag = i;
        }
    }

    private <T> void mergeMessageFieldInternal(T t, ln2 ln2Var, xu0 xu0Var) throws IOException {
        int readUInt32 = this.input.readUInt32();
        m mVar = this.input;
        if (mVar.recursionDepth < mVar.recursionLimit) {
            int pushLimit = mVar.pushLimit(readUInt32);
            this.input.recursionDepth++;
            ln2Var.mergeFrom(t, this, xu0Var);
            this.input.checkLastTagWas(0);
            r5.recursionDepth--;
            this.input.popLimit(pushLimit);
            return;
        }
        throw he1.recursionLimitExceeded();
    }

    private Object readField(kr3 kr3Var, Class<?> cls, xu0 xu0Var) throws IOException {
        switch (n.$SwitchMap$com$google$protobuf$WireFormat$FieldType[kr3Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, xu0Var);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void requirePosition(int i) throws IOException {
        if (this.input.getTotalBytesRead() == i) {
        } else {
            throw he1.truncatedMessage();
        }
    }

    private void requireWireType(int i) throws IOException {
        if (r1.getTagWireType(this.tag) == i) {
        } else {
            throw he1.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i) throws IOException {
        if ((i & 3) == 0) {
        } else {
            throw he1.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i) throws IOException {
        if ((i & 7) == 0) {
        } else {
            throw he1.parseFailure();
        }
    }

    @Override // defpackage.sg2
    public int getFieldNumber() throws IOException {
        int i = this.nextTag;
        if (i != 0) {
            this.tag = i;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i2 = this.tag;
        if (i2 != 0 && i2 != this.endGroupTag) {
            return r1.getTagFieldNumber(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.sg2
    public int getTag() {
        return this.tag;
    }

    @Override // defpackage.sg2
    public <T> void mergeGroupField(T t, ln2 ln2Var, xu0 xu0Var) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t, ln2Var, xu0Var);
    }

    @Override // defpackage.sg2
    public <T> void mergeMessageField(T t, ln2 ln2Var, xu0 xu0Var) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t, ln2Var, xu0Var);
    }

    @Override // defpackage.sg2
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // defpackage.sg2
    public void readBoolList(List<Boolean> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof oq) {
            oq oqVar = (oq) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        oqVar.addBoolean(this.input.readBool());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                oqVar.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.input.readBool()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public g readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // defpackage.sg2
    public void readBytesList(List<g> list) throws IOException {
        int readTag;
        if (r1.getTagWireType(this.tag) != 2) {
            throw he1.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // defpackage.sg2
    public void readDoubleList(List<Double> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof cm0) {
            cm0 cm0Var = (cm0) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        cm0Var.addDouble(this.input.readDouble());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                cm0Var.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.input.readDouble()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.input.readDouble()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // defpackage.sg2
    public void readEnumList(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        ed1Var.addInt(this.input.readEnum());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                ed1Var.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readEnum()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // defpackage.sg2
    public void readFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw he1.invalidWireType();
                }
                do {
                    ed1Var.addInt(this.input.readFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                ed1Var.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw he1.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.input.readFixed32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // defpackage.sg2
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // defpackage.sg2
    public void readFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        do1Var.addLong(this.input.readFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                do1Var.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.input.readFixed64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readFixed64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // defpackage.sg2
    public void readFloatList(List<Float> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof yy0) {
            yy0 yy0Var = (yy0) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw he1.invalidWireType();
                }
                do {
                    yy0Var.addFloat(this.input.readFloat());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                yy0Var.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw he1.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.input.readFloat()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // defpackage.sg2
    @Deprecated
    public <T> T readGroup(Class<T> cls, xu0 xu0Var) throws IOException {
        requireWireType(3);
        return (T) readGroup(ja2.getInstance().schemaFor((Class) cls), xu0Var);
    }

    @Override // defpackage.sg2
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(ln2 ln2Var, xu0 xu0Var) throws IOException {
        requireWireType(3);
        return (T) readGroup(ln2Var, xu0Var);
    }

    @Override // defpackage.sg2
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, xu0 xu0Var) throws IOException {
        readGroupList(list, ja2.getInstance().schemaFor((Class) cls), xu0Var);
    }

    @Override // defpackage.sg2
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // defpackage.sg2
    public void readInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        ed1Var.addInt(this.input.readInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                ed1Var.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // defpackage.sg2
    public void readInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        do1Var.addLong(this.input.readInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                do1Var.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:            r8.put(r2, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:            return;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, defpackage.qp1 r9, defpackage.xu0 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            com.google.protobuf.m r1 = r7.input
            int r1 = r1.readUInt32()
            com.google.protobuf.m r2 = r7.input
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.defaultKey
            java.lang.Object r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.m r5 = r7.input     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.skipField()     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            he1 r4 = new he1     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
        L3a:
            kr3 r4 = r9.valueType     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            java.lang.Object r5 = r9.defaultValue     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            kr3 r4 = r9.keyType     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: defpackage.fe1 -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            he1 r8 = new he1     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.m r8 = r7.input
            r8.popLimit(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.m r9 = r7.input
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o.readMap(java.util.Map, qp1, xu0):void");
    }

    @Override // defpackage.sg2
    public <T> T readMessage(Class<T> cls, xu0 xu0Var) throws IOException {
        requireWireType(2);
        return (T) readMessage(ja2.getInstance().schemaFor((Class) cls), xu0Var);
    }

    @Override // defpackage.sg2
    public <T> T readMessageBySchemaWithCheck(ln2 ln2Var, xu0 xu0Var) throws IOException {
        requireWireType(2);
        return (T) readMessage(ln2Var, xu0Var);
    }

    @Override // defpackage.sg2
    public <T> void readMessageList(List<T> list, Class<T> cls, xu0 xu0Var) throws IOException {
        readMessageList(list, ja2.getInstance().schemaFor((Class) cls), xu0Var);
    }

    @Override // defpackage.sg2
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // defpackage.sg2
    public void readSFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw he1.invalidWireType();
                }
                do {
                    ed1Var.addInt(this.input.readSFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                ed1Var.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw he1.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.input.readSFixed32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // defpackage.sg2
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // defpackage.sg2
    public void readSFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        do1Var.addLong(this.input.readSFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                do1Var.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.input.readSFixed64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readSFixed64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // defpackage.sg2
    public void readSInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        ed1Var.addInt(this.input.readSInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                ed1Var.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readSInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // defpackage.sg2
    public void readSInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        do1Var.addLong(this.input.readSInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                do1Var.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readSInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // defpackage.sg2
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z) throws IOException {
        String readString;
        int readTag;
        int readTag2;
        if (r1.getTagWireType(this.tag) == 2) {
            if ((list instanceof ij1) && !z) {
                ij1 ij1Var = (ij1) list;
                do {
                    ij1Var.add(readBytes());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            do {
                if (z) {
                    readString = readStringRequireUtf8();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw he1.invalidWireType();
    }

    @Override // defpackage.sg2
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // defpackage.sg2
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // defpackage.sg2
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // defpackage.sg2
    public void readUInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof ed1) {
            ed1 ed1Var = (ed1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        ed1Var.addInt(this.input.readUInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                ed1Var.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readUInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // defpackage.sg2
    public void readUInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof do1) {
            do1 do1Var = (do1) list;
            int tagWireType = r1.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        do1Var.addLong(this.input.readUInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw he1.invalidWireType();
            }
            do {
                do1Var.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = r1.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw he1.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readUInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // defpackage.sg2
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // defpackage.sg2
    public boolean skipField() throws IOException {
        int i;
        if (!this.input.isAtEnd() && (i = this.tag) != this.endGroupTag) {
            return this.input.skipField(i);
        }
        return false;
    }

    private <T> T readGroup(ln2 ln2Var, xu0 xu0Var) throws IOException {
        T t = (T) ln2Var.newInstance();
        mergeGroupFieldInternal(t, ln2Var, xu0Var);
        ln2Var.makeImmutable(t);
        return t;
    }

    private <T> T readMessage(ln2 ln2Var, xu0 xu0Var) throws IOException {
        T t = (T) ln2Var.newInstance();
        mergeMessageFieldInternal(t, ln2Var, xu0Var);
        ln2Var.makeImmutable(t);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sg2
    @Deprecated
    public <T> void readGroupList(List<T> list, ln2 ln2Var, xu0 xu0Var) throws IOException {
        int readTag;
        if (r1.getTagWireType(this.tag) == 3) {
            int i = this.tag;
            do {
                list.add(readGroup(ln2Var, xu0Var));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i);
            this.nextTag = readTag;
            return;
        }
        throw he1.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sg2
    public <T> void readMessageList(List<T> list, ln2 ln2Var, xu0 xu0Var) throws IOException {
        int readTag;
        if (r1.getTagWireType(this.tag) == 2) {
            int i = this.tag;
            do {
                list.add(readMessage(ln2Var, xu0Var));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i);
            this.nextTag = readTag;
            return;
        }
        throw he1.invalidWireType();
    }
}
