package com.vungle.ads;

import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class InternalError extends VungleError {
    public /* synthetic */ InternalError(int i, String str, int i2, ng0 ng0Var) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (m20.L(InternalError.class, cls) && getCode() == ((InternalError) obj).getCode()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return InternalError.class.hashCode();
    }

    public InternalError(int i, String str) {
        super(Integer.valueOf(i), null, str, null, null, null, 58, null);
    }
}
