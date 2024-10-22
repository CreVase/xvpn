package com.google.protobuf;

import defpackage.fh3;
import defpackage.he1;
import defpackage.kt3;
import defpackage.ln2;
import defpackage.mr3;
import defpackage.rn2;
import defpackage.sg2;
import defpackage.vw0;
import defpackage.ww0;
import defpackage.xu0;
import defpackage.yi1;
import defpackage.yv1;
import defpackage.zu0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w0 implements ln2 {
    private final yv1 defaultInstance;
    private final zu0 extensionSchema;
    private final boolean hasExtensions;
    private final fh3 unknownFieldSchema;

    private w0(fh3 fh3Var, zu0 zu0Var, yv1 yv1Var) {
        this.unknownFieldSchema = fh3Var;
        this.hasExtensions = zu0Var.hasExtensions(yv1Var);
        this.extensionSchema = zu0Var;
        this.defaultInstance = yv1Var;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(fh3 fh3Var, Object obj) {
        return fh3Var.getSerializedSizeAsMessageSet(fh3Var.getFromMessage(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends vw0> void mergeFromHelper(fh3 fh3Var, zu0 zu0Var, Object obj, sg2 sg2Var, xu0 xu0Var) throws IOException {
        o oVar;
        Object builderFromMessage = fh3Var.getBuilderFromMessage(obj);
        ww0 mutableExtensions = zu0Var.getMutableExtensions(obj);
        do {
            try {
                oVar = (o) sg2Var;
                if (oVar.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                fh3Var.setBuilderToMessage(obj, builderFromMessage);
            }
        } while (parseMessageSetItemOrUnknownField(oVar, xu0Var, zu0Var, mutableExtensions, fh3Var, builderFromMessage));
    }

    public static <T> w0 newSchema(fh3 fh3Var, zu0 zu0Var, yv1 yv1Var) {
        return new w0(fh3Var, zu0Var, yv1Var);
    }

    private <UT, UB, ET extends vw0> boolean parseMessageSetItemOrUnknownField(sg2 sg2Var, xu0 xu0Var, zu0 zu0Var, ww0 ww0Var, fh3 fh3Var, UB ub) throws IOException {
        o oVar = (o) sg2Var;
        int tag = oVar.getTag();
        if (tag != r1.MESSAGE_SET_ITEM_TAG) {
            if (r1.getTagWireType(tag) == 2) {
                Object findExtensionByNumber = zu0Var.findExtensionByNumber(xu0Var, this.defaultInstance, r1.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    zu0Var.parseLengthPrefixedMessageSetItem(oVar, findExtensionByNumber, xu0Var, ww0Var);
                    return true;
                }
                return fh3Var.mergeOneFieldFrom(ub, oVar);
            }
            return oVar.skipField();
        }
        Object obj = null;
        g gVar = null;
        int i = 0;
        while (oVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = oVar.getTag();
            if (tag2 == r1.MESSAGE_SET_TYPE_ID_TAG) {
                i = oVar.readUInt32();
                obj = zu0Var.findExtensionByNumber(xu0Var, this.defaultInstance, i);
            } else if (tag2 == r1.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    zu0Var.parseLengthPrefixedMessageSetItem(oVar, obj, xu0Var, ww0Var);
                } else {
                    gVar = oVar.readBytes();
                }
            } else if (!oVar.skipField()) {
                break;
            }
        }
        if (oVar.getTag() == r1.MESSAGE_SET_ITEM_END_TAG) {
            if (gVar != null) {
                if (obj != null) {
                    zu0Var.parseMessageSetItem(gVar, obj, xu0Var, ww0Var);
                } else {
                    fh3Var.addLengthDelimited(ub, i, gVar);
                }
            }
            return true;
        }
        throw he1.invalidEndTag();
    }

    private <UT, UB> void writeUnknownFieldsHelper(fh3 fh3Var, Object obj, kt3 kt3Var) throws IOException {
        fh3Var.writeAsMessageSetTo(fh3Var.getFromMessage(obj), kt3Var);
    }

    @Override // defpackage.ln2
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // defpackage.ln2
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj) + 0;
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    @Override // defpackage.ln2
    public int hashCode(Object obj) {
        int hashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.ln2
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // defpackage.ln2
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // defpackage.ln2
    public void mergeFrom(Object obj, Object obj2) {
        rn2.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            rn2.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // defpackage.ln2
    public Object newInstance() {
        yv1 yv1Var = this.defaultInstance;
        if (yv1Var instanceof o0) {
            return ((o0) yv1Var).newMutableInstance();
        }
        return yv1Var.newBuilderForType().buildPartial();
    }

    @Override // defpackage.ln2
    public void writeTo(Object obj, kt3 kt3Var) throws IOException {
        Iterator<Map.Entry<vw0, Object>> it = this.extensionSchema.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<vw0, Object> next = it.next();
            m0 m0Var = (m0) next.getKey();
            if (m0Var.getLiteJavaType() == mr3.MESSAGE && !m0Var.isRepeated() && !m0Var.isPacked()) {
                if (next instanceof yi1) {
                    ((x) kt3Var).writeMessageSetItem(m0Var.getNumber(), ((yi1) next).getField().toByteString());
                } else {
                    ((x) kt3Var).writeMessageSetItem(m0Var.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, kt3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // defpackage.ln2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.fg r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.o0 r0 = (com.google.protobuf.o0) r0
            gh3 r1 = r0.unknownFields
            gh3 r2 = defpackage.gh3.getDefaultInstance()
            if (r1 != r2) goto L11
            gh3 r1 = defpackage.gh3.newInstance()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite$ExtendableMessage) r11
            ww0 r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.e.decodeVarint32(r12, r13, r15)
            int r13 = r15.int1
            int r3 = com.google.protobuf.r1.MESSAGE_SET_ITEM_TAG
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.r1.getTagWireType(r13)
            if (r3 != r5) goto L66
            zu0 r2 = r10.extensionSchema
            xu0 r3 = r15.extensionRegistry
            yv1 r5 = r10.defaultInstance
            int r6 = com.google.protobuf.r1.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.findExtensionByNumber(r3, r5, r6)
            r8 = r2
            com.google.protobuf.n0 r8 = (com.google.protobuf.n0) r8
            if (r8 == 0) goto L5b
            ja2 r13 = defpackage.ja2.getInstance()
            yv1 r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            ln2 r13 = r13.schemaFor(r2)
            int r13 = com.google.protobuf.e.decodeMessageField(r13, r12, r4, r14, r15)
            com.google.protobuf.m0 r2 = r8.descriptor
            java.lang.Object r3 = r15.object1
            r11.setField(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.e.decodeUnknownField(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.protobuf.e.skipField(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.e.decodeVarint32(r12, r4, r15)
            int r6 = r15.int1
            int r7 = com.google.protobuf.r1.getTagFieldNumber(r6)
            int r8 = com.google.protobuf.r1.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            ja2 r6 = defpackage.ja2.getInstance()
            yv1 r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            ln2 r6 = r6.schemaFor(r7)
            int r4 = com.google.protobuf.e.decodeMessageField(r6, r12, r4, r14, r15)
            com.google.protobuf.m0 r6 = r2.descriptor
            java.lang.Object r7 = r15.object1
            r11.setField(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.e.decodeBytes(r12, r4, r15)
            java.lang.Object r3 = r15.object1
            com.google.protobuf.g r3 = (com.google.protobuf.g) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.e.decodeVarint32(r12, r4, r15)
            int r13 = r15.int1
            zu0 r2 = r10.extensionSchema
            xu0 r6 = r15.extensionRegistry
            yv1 r7 = r10.defaultInstance
            java.lang.Object r2 = r2.findExtensionByNumber(r6, r7, r13)
            com.google.protobuf.n0 r2 = (com.google.protobuf.n0) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.r1.MESSAGE_SET_ITEM_END_TAG
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.e.skipField(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.r1.makeTag(r13, r5)
            r1.storeField(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            he1 r11 = defpackage.he1.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.mergeFrom(java.lang.Object, byte[], int, int, fg):void");
    }

    @Override // defpackage.ln2
    public void mergeFrom(Object obj, sg2 sg2Var, xu0 xu0Var) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, sg2Var, xu0Var);
    }
}
