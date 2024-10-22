package com.google.protobuf;

import defpackage.kr3;
import defpackage.mr3;
import defpackage.qd1;
import defpackage.su0;
import defpackage.yv1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class n0 extends su0 {
    final yv1 containingTypeDefaultInstance;
    final Object defaultValue;
    final m0 descriptor;
    final yv1 messageDefaultInstance;

    public n0(yv1 yv1Var, Object obj, yv1 yv1Var2, m0 m0Var, Class cls) {
        if (yv1Var != null) {
            if (m0Var.getLiteType() == kr3.MESSAGE && yv1Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = yv1Var;
            this.defaultValue = obj;
            this.messageDefaultInstance = yv1Var2;
            this.descriptor = m0Var;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public Object fromFieldSetType(Object obj) {
        if (this.descriptor.isRepeated()) {
            if (this.descriptor.getLiteJavaType() == mr3.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return obj;
        }
        return singularFromFieldSetType(obj);
    }

    public yv1 getContainingTypeDefaultInstance() {
        return this.containingTypeDefaultInstance;
    }

    @Override // defpackage.su0
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    @Override // defpackage.su0
    public kr3 getLiteType() {
        return this.descriptor.getLiteType();
    }

    @Override // defpackage.su0
    public yv1 getMessageDefaultInstance() {
        return this.messageDefaultInstance;
    }

    @Override // defpackage.su0
    public int getNumber() {
        return this.descriptor.getNumber();
    }

    @Override // defpackage.su0
    public boolean isRepeated() {
        return this.descriptor.isRepeated;
    }

    public Object singularFromFieldSetType(Object obj) {
        if (this.descriptor.getLiteJavaType() == mr3.ENUM) {
            return this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue());
        }
        return obj;
    }

    public Object singularToFieldSetType(Object obj) {
        if (this.descriptor.getLiteJavaType() == mr3.ENUM) {
            return Integer.valueOf(((qd1) obj).getNumber());
        }
        return obj;
    }

    public Object toFieldSetType(Object obj) {
        if (this.descriptor.isRepeated()) {
            if (this.descriptor.getLiteJavaType() == mr3.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularToFieldSetType(it.next()));
                }
                return arrayList;
            }
            return obj;
        }
        return singularToFieldSetType(obj);
    }
}
