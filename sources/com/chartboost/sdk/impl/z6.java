package com.chartboost.sdk.impl;

import defpackage.cr0;
import defpackage.j11;
import defpackage.m20;
import defpackage.p71;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z6 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public l f1333a;

        /* renamed from: b, reason: collision with root package name */
        public h f1334b;
        public g6 c;

        public a(l lVar, h hVar, g6 g6Var) {
            this.f1333a = lVar;
            this.f1334b = hVar;
            this.c = g6Var;
        }

        public final void a(l lVar) {
            this.f1333a = lVar;
        }

        public final h b() {
            return this.f1334b;
        }

        public final l c() {
            return this.f1333a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m20.L(this.f1333a, aVar.f1333a) && m20.L(this.f1334b, aVar.f1334b) && m20.L(this.c, aVar.c);
        }

        public int hashCode() {
            l lVar = this.f1333a;
            int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            h hVar = this.f1334b;
            int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            g6 g6Var = this.c;
            return hashCode2 + (g6Var != null ? g6Var.hashCode() : 0);
        }

        public String toString() {
            return "OMSessionHolder(omSession=" + this.f1333a + ", omAdEvents=" + this.f1334b + ", mediaEvents=" + this.c + ')';
        }

        public final void a(h hVar) {
            this.f1334b = hVar;
        }

        public final g6 a() {
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1335a;

        static {
            int[] iArr = new int[h6.values().length];
            try {
                iArr[h6.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h6.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h6.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h6.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h6.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1335a = iArr;
        }
    }

    public final a a(i2 i2Var, h6 h6Var, k7 k7Var, String str, List<x9> list, boolean z) {
        String str2;
        try {
            l a2 = l.a(a(h6Var), a(k7Var, str, list, z, h6Var, i2Var));
            a2.a(i2Var);
            return new a(a2, h.a(a2), a(h6Var, a2));
        } catch (Exception e) {
            str2 = a7.f703a;
            p71.z("OMSDK create session exception: ", e, str2);
            return null;
        }
    }

    public final i3 b(h6 h6Var) {
        int i = b.f1335a[h6Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return i3.NATIVE_DISPLAY;
                        }
                        throw new j11(null);
                    }
                    return i3.AUDIO;
                }
                return i3.VIDEO;
            }
            return i3.HTML_DISPLAY;
        }
        return i3.NATIVE_DISPLAY;
    }

    public final j7 c(h6 h6Var) {
        int i = b.f1335a[h6Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return j7.NATIVE;
                        }
                        throw new j11(null);
                    }
                    return j7.NATIVE;
                }
                return j7.NATIVE;
            }
            return j7.NONE;
        }
        return j7.NATIVE;
    }

    public final g6 a(h6 h6Var, l lVar) {
        if (h6Var == h6.HTML) {
            return null;
        }
        return g6.a(lVar);
    }

    public final n a(k7 k7Var, String str, List<x9> list, boolean z, h6 h6Var, i2 i2Var) {
        if (h6Var == h6.HTML) {
            return a(k7Var, i2Var);
        }
        return a(k7Var, str, list, z);
    }

    public final n a(k7 k7Var, String str, List<x9> list, boolean z) {
        String str2;
        try {
            return n.a(k7Var, str, a(list, z), null, null);
        } catch (IllegalArgumentException e) {
            str2 = a7.f703a;
            f6.a(str2, "buildNativeContext error: " + e);
            return null;
        }
    }

    public final n a(k7 k7Var, i2 i2Var) {
        String str;
        try {
            return n.a(k7Var, i2Var, null, null);
        } catch (IllegalArgumentException e) {
            str = a7.f703a;
            f6.a(str, "buildHtmlContext error: " + e);
            return null;
        }
    }

    public final List<x9> a(List<x9> list, boolean z) {
        String str;
        if (!z) {
            return cr0.f1659a;
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(x9.a("iabtechlab.com-omid", new URL("https://s3-us-west-2.amazonaws.com/updated-omsdk-files/compliance-js/omid-validation-verification-script-v1-CHARTBOOST-04112023.js"), "iabtechlab-Chartboost"));
        } catch (IllegalArgumentException e) {
            str = a7.f703a;
            f6.a(str, "buildVerificationResources error: " + e);
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public final m a(h6 h6Var) {
        String str;
        try {
            return m.a(b(h6Var), t5.BEGIN_TO_RENDER, j7.NATIVE, c(h6Var), false);
        } catch (IllegalArgumentException e) {
            str = a7.f703a;
            f6.a(str, "buildAdSessionVideoConfig error: " + e);
            return null;
        }
    }
}
