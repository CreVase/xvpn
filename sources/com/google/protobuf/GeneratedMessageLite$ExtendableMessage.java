package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import defpackage.j51;
import defpackage.su0;
import defpackage.ww0;
import defpackage.xu0;
import defpackage.xv1;
import defpackage.yv1;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends o0 implements j51 {
    protected ww0 extensions = ww0.emptySet();

    private void eagerlyMergeMessageSetExtension(m mVar, n0 n0Var, xu0 xu0Var, int i) throws IOException {
        parseExtension(mVar, xu0Var, n0Var, r1.makeTag(i, 2), i);
    }

    private void mergeMessageSetExtensionFromBytes(g gVar, xu0 xu0Var, n0 n0Var) throws IOException {
        xv1 xv1Var;
        yv1 yv1Var = (yv1) this.extensions.getField(n0Var.descriptor);
        if (yv1Var != null) {
            xv1Var = yv1Var.toBuilder();
        } else {
            xv1Var = null;
        }
        if (xv1Var == null) {
            xv1Var = n0Var.getMessageDefaultInstance().newBuilderForType();
        }
        xv1Var.mergeFrom(gVar, xu0Var);
        ensureExtensionsAreMutable().setField(n0Var.descriptor, n0Var.singularToFieldSetType(xv1Var.build()));
    }

    private <MessageType extends yv1> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, m mVar, xu0 xu0Var) throws IOException {
        int i = 0;
        g gVar = null;
        n0 n0Var = null;
        while (true) {
            int readTag = mVar.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == r1.MESSAGE_SET_TYPE_ID_TAG) {
                i = mVar.readUInt32();
                if (i != 0) {
                    n0Var = xu0Var.findLiteExtensionByNumber(messagetype, i);
                }
            } else if (readTag == r1.MESSAGE_SET_MESSAGE_TAG) {
                if (i != 0 && n0Var != null) {
                    eagerlyMergeMessageSetExtension(mVar, n0Var, xu0Var, i);
                    gVar = null;
                } else {
                    gVar = mVar.readBytes();
                }
            } else if (!mVar.skipField(readTag)) {
                break;
            }
        }
        mVar.checkLastTagWas(r1.MESSAGE_SET_ITEM_END_TAG);
        if (gVar != null && i != 0) {
            if (n0Var != null) {
                mergeMessageSetExtensionFromBytes(gVar, xu0Var, n0Var);
            } else {
                mergeLengthDelimitedField(i, gVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parseExtension(com.google.protobuf.m r6, defpackage.xu0 r7, com.google.protobuf.n0 r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(com.google.protobuf.m, xu0, com.google.protobuf.n0, int, int):boolean");
    }

    private void verifyExtensionContainingType(n0 n0Var) {
        if (n0Var.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public ww0 ensureExtensionsAreMutable() {
        if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.isInitialized();
    }

    public int extensionsSerializedSize() {
        return this.extensions.getSerializedSize();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.getMessageSetSerializedSize();
    }

    @Override // com.google.protobuf.o0, com.google.protobuf.a, defpackage.yv1, defpackage.zv1
    public /* bridge */ /* synthetic */ yv1 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // defpackage.j51
    public final <Type> Type getExtension(su0 su0Var) {
        n0 checkIsLite;
        checkIsLite = o0.checkIsLite(su0Var);
        verifyExtensionContainingType(checkIsLite);
        Object field = this.extensions.getField(checkIsLite.descriptor);
        if (field == null) {
            return (Type) checkIsLite.defaultValue;
        }
        return (Type) checkIsLite.fromFieldSetType(field);
    }

    @Override // defpackage.j51
    public final <Type> int getExtensionCount(su0 su0Var) {
        n0 checkIsLite;
        checkIsLite = o0.checkIsLite(su0Var);
        verifyExtensionContainingType(checkIsLite);
        return this.extensions.getRepeatedFieldCount(checkIsLite.descriptor);
    }

    @Override // defpackage.j51
    public final <Type> boolean hasExtension(su0 su0Var) {
        n0 checkIsLite;
        checkIsLite = o0.checkIsLite(su0Var);
        verifyExtensionContainingType(checkIsLite);
        return this.extensions.hasField(checkIsLite.descriptor);
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.clone();
        }
        this.extensions.mergeFrom(messagetype.extensions);
    }

    @Override // com.google.protobuf.o0, com.google.protobuf.a, defpackage.yv1
    public /* bridge */ /* synthetic */ xv1 newBuilderForType() {
        return super.newBuilderForType();
    }

    public l0 newExtensionWriter() {
        return new l0(this, false, null);
    }

    public l0 newMessageSetExtensionWriter() {
        return new l0(this, true, null);
    }

    public <MessageType extends yv1> boolean parseUnknownField(MessageType messagetype, m mVar, xu0 xu0Var, int i) throws IOException {
        int tagFieldNumber = r1.getTagFieldNumber(i);
        return parseExtension(mVar, xu0Var, xu0Var.findLiteExtensionByNumber(messagetype, tagFieldNumber), i, tagFieldNumber);
    }

    public <MessageType extends yv1> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, m mVar, xu0 xu0Var, int i) throws IOException {
        if (i == r1.MESSAGE_SET_ITEM_TAG) {
            mergeMessageSetExtensionFromCodedStream(messagetype, mVar, xu0Var);
            return true;
        }
        if (r1.getTagWireType(i) == 2) {
            return parseUnknownField(messagetype, mVar, xu0Var, i);
        }
        return mVar.skipField(i);
    }

    @Override // com.google.protobuf.o0, com.google.protobuf.a, defpackage.yv1
    public /* bridge */ /* synthetic */ xv1 toBuilder() {
        return super.toBuilder();
    }

    @Override // defpackage.j51
    public final <Type> Type getExtension(su0 su0Var, int i) {
        n0 checkIsLite;
        checkIsLite = o0.checkIsLite(su0Var);
        verifyExtensionContainingType(checkIsLite);
        return (Type) checkIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(checkIsLite.descriptor, i));
    }
}
