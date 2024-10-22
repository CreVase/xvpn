package defpackage;

import android.util.Base64;

/* loaded from: classes.dex */
public final /* synthetic */ class mt0 implements g33 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3349a;

    @Override // defpackage.g33
    public final Object get() {
        switch (this.f3349a) {
            case 0:
                return new di0(new cf0(), 50000, 50000, 2500, 5000);
            default:
                byte[] bArr = new byte[12];
                mi0.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
