package com.vungle.ads.internal.util;

import defpackage.hx2;
import defpackage.m20;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* loaded from: classes2.dex */
public final class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> resolveClass = super.resolveClass(objectStreamClass);
        if (this.allowed != null && !Number.class.isAssignableFrom(resolveClass) && !m20.L(String.class, resolveClass) && !m20.L(Boolean.class, resolveClass) && !resolveClass.isArray() && !this.allowed.contains(resolveClass)) {
            throw new IOException(hx2.p("Deserialization is not allowed for ", objectStreamClass.getName()));
        }
        return resolveClass;
    }
}
