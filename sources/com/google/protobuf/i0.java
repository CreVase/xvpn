package com.google.protobuf;

import defpackage.tv1;
import defpackage.vv1;

/* loaded from: classes2.dex */
public final class i0 implements vv1 {
    private static final i0 instance = new i0();

    private i0() {
    }

    public static i0 getInstance() {
        return instance;
    }

    @Override // defpackage.vv1
    public boolean isSupported(Class<?> cls) {
        return o0.class.isAssignableFrom(cls);
    }

    @Override // defpackage.vv1
    public tv1 messageInfoFor(Class<?> cls) {
        if (o0.class.isAssignableFrom(cls)) {
            try {
                return (tv1) o0.getDefaultInstance(cls.asSubclass(o0.class)).buildMessageInfo();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
