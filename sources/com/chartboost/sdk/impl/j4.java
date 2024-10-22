package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class j4 implements i4 {

    /* renamed from: a, reason: collision with root package name */
    public final File f890a;

    /* renamed from: b, reason: collision with root package name */
    public final File f891b;
    public final File c;

    public j4(Context context, File file, File file2, File file3) {
        this.f890a = file;
        this.f891b = file2;
        this.c = file3;
    }

    @Override // com.chartboost.sdk.impl.i4
    public File a() {
        return this.f891b;
    }

    @Override // com.chartboost.sdk.impl.i4
    public File b() {
        return this.c;
    }

    @Override // com.chartboost.sdk.impl.i4
    public File c() {
        return this.f890a;
    }

    @Override // com.chartboost.sdk.impl.i4
    public File a(String str) {
        return new File(c(), str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ j4(android.content.Context r1, java.io.File r2, java.io.File r3, java.io.File r4, int r5, defpackage.ng0 r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L8
            java.io.File r2 = com.chartboost.sdk.impl.n3.b(r1)
        L8:
            r6 = r5 & 4
            if (r6 == 0) goto L10
            java.io.File r3 = com.chartboost.sdk.impl.n3.c(r1)
        L10:
            r5 = r5 & 8
            if (r5 == 0) goto L1b
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "exoplayer-cache"
            r4.<init>(r2, r5)
        L1b:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.j4.<init>(android.content.Context, java.io.File, java.io.File, java.io.File, int, ng0):void");
    }
}
