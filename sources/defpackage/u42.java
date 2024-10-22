package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class u42 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4625b;

    public u42(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.f4624a = z;
        this.f4625b = i;
    }

    public static u42 a(String str, Exception exc) {
        return new u42(str, exc, true, 1);
    }

    public static u42 b(String str) {
        return new u42(str, null, false, 1);
    }
}
