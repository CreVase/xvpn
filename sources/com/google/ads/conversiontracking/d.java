package com.google.ads.conversiontracking;

import com.google.ads.conversiontracking.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1383a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1384b;
    public final int c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public long h;

    public d(String str, g.c cVar, boolean z, boolean z2) {
        this.g = str;
        this.f1384b = z2;
        this.f1383a = z;
        this.h = 0L;
        HashMap hashMap = g.f1391a;
        this.d = System.currentTimeMillis();
        this.c = 0;
        if (!z2 && z) {
            this.f = g.b(cVar);
            this.e = g.a(cVar);
        } else {
            this.f = null;
            this.e = null;
        }
    }

    public d(long j, String str, String str2, boolean z, boolean z2, String str3, long j2, int i) {
        this.h = j;
        this.g = str;
        this.f = str2;
        this.f1384b = z;
        this.f1383a = z2;
        this.e = str3;
        this.d = j2;
        this.c = i;
    }
}
