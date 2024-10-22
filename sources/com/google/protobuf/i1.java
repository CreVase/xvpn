package com.google.protobuf;

import defpackage.fh3;
import defpackage.gh3;
import defpackage.kt3;
import defpackage.sg2;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class i1 extends fh3 {
    @Override // defpackage.fh3
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // defpackage.fh3
    public boolean shouldDiscardUnknownFields(sg2 sg2Var) {
        return false;
    }

    @Override // defpackage.fh3
    public void addFixed32(gh3 gh3Var, int i, int i2) {
        gh3Var.storeField(r1.makeTag(i, 5), Integer.valueOf(i2));
    }

    @Override // defpackage.fh3
    public void addFixed64(gh3 gh3Var, int i, long j) {
        gh3Var.storeField(r1.makeTag(i, 1), Long.valueOf(j));
    }

    @Override // defpackage.fh3
    public void addGroup(gh3 gh3Var, int i, gh3 gh3Var2) {
        gh3Var.storeField(r1.makeTag(i, 3), gh3Var2);
    }

    @Override // defpackage.fh3
    public void addLengthDelimited(gh3 gh3Var, int i, g gVar) {
        gh3Var.storeField(r1.makeTag(i, 2), gVar);
    }

    @Override // defpackage.fh3
    public void addVarint(gh3 gh3Var, int i, long j) {
        gh3Var.storeField(r1.makeTag(i, 0), Long.valueOf(j));
    }

    @Override // defpackage.fh3
    public gh3 getBuilderFromMessage(Object obj) {
        gh3 fromMessage = getFromMessage(obj);
        if (fromMessage != gh3.getDefaultInstance()) {
            return fromMessage;
        }
        gh3 newInstance = gh3.newInstance();
        setToMessage(obj, newInstance);
        return newInstance;
    }

    @Override // defpackage.fh3
    public gh3 getFromMessage(Object obj) {
        return ((o0) obj).unknownFields;
    }

    @Override // defpackage.fh3
    public int getSerializedSize(gh3 gh3Var) {
        return gh3Var.getSerializedSize();
    }

    @Override // defpackage.fh3
    public int getSerializedSizeAsMessageSet(gh3 gh3Var) {
        return gh3Var.getSerializedSizeAsMessageSet();
    }

    @Override // defpackage.fh3
    public gh3 merge(gh3 gh3Var, gh3 gh3Var2) {
        if (gh3.getDefaultInstance().equals(gh3Var2)) {
            return gh3Var;
        }
        if (gh3.getDefaultInstance().equals(gh3Var)) {
            return gh3.mutableCopyOf(gh3Var, gh3Var2);
        }
        return gh3Var.mergeFrom(gh3Var2);
    }

    @Override // defpackage.fh3
    public gh3 newBuilder() {
        return gh3.newInstance();
    }

    @Override // defpackage.fh3
    public void setBuilderToMessage(Object obj, gh3 gh3Var) {
        setToMessage(obj, gh3Var);
    }

    @Override // defpackage.fh3
    public void setToMessage(Object obj, gh3 gh3Var) {
        ((o0) obj).unknownFields = gh3Var;
    }

    @Override // defpackage.fh3
    public gh3 toImmutable(gh3 gh3Var) {
        gh3Var.makeImmutable();
        return gh3Var;
    }

    @Override // defpackage.fh3
    public void writeAsMessageSetTo(gh3 gh3Var, kt3 kt3Var) throws IOException {
        gh3Var.writeAsMessageSetTo(kt3Var);
    }

    @Override // defpackage.fh3
    public void writeTo(gh3 gh3Var, kt3 kt3Var) throws IOException {
        gh3Var.writeTo(kt3Var);
    }
}
