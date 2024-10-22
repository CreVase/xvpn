package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class f31 implements dc0 {
    public static final boolean d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f2038a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2039b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(wi3.c)) {
            String str = wi3.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public f31(UUID uuid, byte[] bArr, boolean z) {
        this.f2038a = uuid;
        this.f2039b = bArr;
        this.c = z;
    }
}
