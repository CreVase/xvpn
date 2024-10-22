package com.google.protobuf;

import defpackage.fg;
import defpackage.he1;
import defpackage.ja2;
import defpackage.xu0;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class k0 extends defpackage.g1 {
    private final o0 defaultInstance;
    protected o0 instance;

    public k0(o0 o0Var) {
        this.defaultInstance = o0Var;
        if (!o0Var.isMutable()) {
            this.instance = newMutableInstance();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        ja2.getInstance().schemaFor((ja2) messagetype).mergeFrom(messagetype, messagetype2);
    }

    private o0 newMutableInstance() {
        return this.defaultInstance.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (!this.instance.isMutable()) {
            copyOnWriteInternal();
        }
    }

    public void copyOnWriteInternal() {
        o0 newMutableInstance = newMutableInstance();
        mergeFromInstance(newMutableInstance, this.instance);
        this.instance = newMutableInstance;
    }

    @Override // defpackage.g1, defpackage.xv1, defpackage.zv1
    public final boolean isInitialized() {
        return o0.isInitialized(this.instance, false);
    }

    @Override // defpackage.g1, defpackage.xv1
    public final o0 build() {
        o0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw defpackage.g1.newUninitializedMessageException(buildPartial);
    }

    @Override // defpackage.g1, defpackage.xv1
    public o0 buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    @Override // defpackage.g1, defpackage.xv1
    public final k0 clear() {
        if (!this.defaultInstance.isMutable()) {
            this.instance = newMutableInstance();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // defpackage.g1, defpackage.xv1, defpackage.zv1
    public o0 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // defpackage.g1
    public k0 internalMergeFrom(o0 o0Var) {
        return mergeFrom(o0Var);
    }

    @Override // defpackage.g1, defpackage.xv1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public k0 mo8clone() {
        k0 newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.instance = buildPartial();
        return newBuilderForType;
    }

    public k0 mergeFrom(o0 o0Var) {
        if (getDefaultInstanceForType().equals(o0Var)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, o0Var);
        return this;
    }

    @Override // defpackage.g1, defpackage.xv1
    public k0 mergeFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1 {
        copyOnWrite();
        try {
            ja2.getInstance().schemaFor((ja2) this.instance).mergeFrom(this.instance, bArr, i, i + i2, new fg(xu0Var));
            return this;
        } catch (he1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw he1.truncatedMessage();
        }
    }

    @Override // defpackage.g1, defpackage.xv1
    public k0 mergeFrom(byte[] bArr, int i, int i2) throws he1 {
        return mergeFrom(bArr, i, i2, xu0.getEmptyRegistry());
    }

    @Override // defpackage.g1, defpackage.xv1
    public k0 mergeFrom(m mVar, xu0 xu0Var) throws IOException {
        copyOnWrite();
        try {
            ja2.getInstance().schemaFor((ja2) this.instance).mergeFrom(this.instance, o.forCodedInput(mVar), xu0Var);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
