package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f1316a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f1317b;

    public y7(RandomAccessFile randomAccessFile) {
        this.f1316a = randomAccessFile;
        this.f1317b = randomAccessFile.getFD();
    }

    public final void a() {
        this.f1316a.close();
    }

    public final FileDescriptor b() {
        return this.f1317b;
    }

    public final long c() {
        return this.f1316a.length();
    }
}
