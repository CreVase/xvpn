package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class ae0 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f66b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f67a;

    public ae0(int i) {
        this.f67a = i;
    }

    public ae0(Throwable th, int i) {
        super(th);
        this.f67a = i;
    }

    public ae0(String str, int i) {
        super(str);
        this.f67a = i;
    }

    public ae0(String str, Throwable th, int i) {
        super(str, th);
        this.f67a = i;
    }
}
