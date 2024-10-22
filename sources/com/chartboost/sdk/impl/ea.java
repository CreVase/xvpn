package com.chartboost.sdk.impl;

import defpackage.m20;
import defpackage.ng0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ea {
    public static final a i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public long f800a;

    /* renamed from: b, reason: collision with root package name */
    public int f801b;
    public int c;
    public long d;
    public long e;
    public long f;
    public int g;
    public b h;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public final ea a(JSONObject jSONObject) {
            String str;
            ea eaVar = new ea(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
            eaVar.a(jSONObject.optLong("maxBytes", 52428800L));
            eaVar.b(jSONObject.optInt("maxUnitsPerTimeWindow", 10));
            eaVar.c(jSONObject.optInt("maxUnitsPerTimeWindowCellular", 10));
            eaVar.b(jSONObject.optLong("timeWindow", 18000L));
            eaVar.c(jSONObject.optLong("timeWindowCellular", 18000L));
            eaVar.d(jSONObject.optLong("ttl", 604800L));
            eaVar.a(jSONObject.optInt("bufferSize", 3));
            str = fa.f824a;
            eaVar.a(b.f802b.a(jSONObject.optString("videoPlayer", str)));
            return eaVar;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        EXO_PLAYER("exoplayer"),
        MEDIA_PLAYER("mediaplayer");


        /* renamed from: b, reason: collision with root package name */
        public static final a f802b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f803a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(ng0 ng0Var) {
                this();
            }

            public final b a(String str) {
                b bVar;
                b[] values = b.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        bVar = values[i];
                        if (m20.L(bVar.b(), str)) {
                            break;
                        }
                        i++;
                    } else {
                        bVar = null;
                        break;
                    }
                }
                if (bVar == null) {
                    return b.EXO_PLAYER;
                }
                return bVar;
            }

            public a() {
            }
        }

        b(String str) {
            this.f803a = str;
        }

        public final String b() {
            return this.f803a;
        }
    }

    public ea() {
        this(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
    }

    public static final ea a(JSONObject jSONObject) {
        return i.a(jSONObject);
    }

    public final long b() {
        return this.f800a;
    }

    public final int c() {
        return this.f801b;
    }

    public final int d() {
        return this.c;
    }

    public final long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return this.f800a == eaVar.f800a && this.f801b == eaVar.f801b && this.c == eaVar.c && this.d == eaVar.d && this.e == eaVar.e && this.f == eaVar.f && this.g == eaVar.g && this.h == eaVar.h;
    }

    public final long f() {
        return this.e;
    }

    public final long g() {
        return this.f;
    }

    public final b h() {
        return this.h;
    }

    public int hashCode() {
        long j = this.f800a;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + this.f801b) * 31) + this.c) * 31;
        long j2 = this.d;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f;
        return this.h.hashCode() + ((((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.g) * 31);
    }

    public String toString() {
        return "VideoPreCachingModel(maxBytes=" + this.f800a + ", maxUnitsPerTimeWindow=" + this.f801b + ", maxUnitsPerTimeWindowCellular=" + this.c + ", timeWindow=" + this.d + ", timeWindowCellular=" + this.e + ", ttl=" + this.f + ", bufferSize=" + this.g + ", videoPlayer=" + this.h + ')';
    }

    public ea(long j, int i2, int i3, long j2, long j3, long j4, int i4, b bVar) {
        this.f800a = j;
        this.f801b = i2;
        this.c = i3;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = i4;
        this.h = bVar;
    }

    public final void a(long j) {
        this.f800a = j;
    }

    public final void b(int i2) {
        this.f801b = i2;
    }

    public final void c(int i2) {
        this.c = i2;
    }

    public final void d(long j) {
        this.f = j;
    }

    public final int a() {
        return this.g;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void c(long j) {
        this.e = j;
    }

    public final void a(int i2) {
        this.g = i2;
    }

    public final void a(b bVar) {
        this.h = bVar;
    }

    public /* synthetic */ ea(long j, int i2, int i3, long j2, long j3, long j4, int i4, b bVar, int i5, ng0 ng0Var) {
        this((i5 & 1) != 0 ? 52428800L : j, (i5 & 2) != 0 ? 10 : i2, (i5 & 4) == 0 ? i3 : 10, (i5 & 8) != 0 ? 18000L : j2, (i5 & 16) == 0 ? j3 : 18000L, (i5 & 32) != 0 ? 604800L : j4, (i5 & 64) != 0 ? 3 : i4, (i5 & 128) != 0 ? b.EXO_PLAYER : bVar);
    }
}
