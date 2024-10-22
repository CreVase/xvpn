package com.chartboost.sdk.impl;

import defpackage.dx;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f1008a = new n1();

    public final String a(byte[] bArr) {
        return String.format("%0" + (bArr.length << 1) + 'x', Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
    }

    public final byte[] b(byte[] bArr) {
        return MessageDigest.getInstance("SHA-1").digest(bArr);
    }

    public static final String a(String str) {
        byte[] bytes = str.getBytes(dx.f1853a);
        n1 n1Var = f1008a;
        return n1Var.a(n1Var.b(bytes));
    }
}
