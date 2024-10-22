package com.google.protobuf;

import defpackage.kr3;
import defpackage.mr3;
import defpackage.rd1;
import defpackage.vw0;
import defpackage.xv1;
import defpackage.yv1;

/* loaded from: classes2.dex */
public final class m0 implements vw0 {
    final rd1 enumTypeMap;
    final boolean isPacked;
    final boolean isRepeated;
    final int number;
    final kr3 type;

    public m0(rd1 rd1Var, int i, kr3 kr3Var, boolean z, boolean z2) {
        this.enumTypeMap = rd1Var;
        this.number = i;
        this.type = kr3Var;
        this.isRepeated = z;
        this.isPacked = z2;
    }

    @Override // defpackage.vw0
    public rd1 getEnumType() {
        return this.enumTypeMap;
    }

    @Override // defpackage.vw0
    public mr3 getLiteJavaType() {
        return this.type.getJavaType();
    }

    @Override // defpackage.vw0
    public kr3 getLiteType() {
        return this.type;
    }

    @Override // defpackage.vw0
    public int getNumber() {
        return this.number;
    }

    @Override // defpackage.vw0
    public xv1 internalMergeFrom(xv1 xv1Var, yv1 yv1Var) {
        return ((k0) xv1Var).mergeFrom((o0) yv1Var);
    }

    @Override // defpackage.vw0
    public boolean isPacked() {
        return this.isPacked;
    }

    @Override // defpackage.vw0
    public boolean isRepeated() {
        return this.isRepeated;
    }

    @Override // java.lang.Comparable
    public int compareTo(m0 m0Var) {
        return this.number - m0Var.number;
    }
}
