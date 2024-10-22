package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzgao extends TimeoutException {
    public /* synthetic */ zzgao(String str, zzgan zzganVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
