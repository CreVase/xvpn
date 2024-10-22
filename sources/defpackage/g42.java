package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes2.dex */
public enum g42 {
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(DevicePublicKeyStringDef.NONE);


    /* renamed from: a, reason: collision with root package name */
    public final String f2203a;

    g42(String str) {
        this.f2203a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2203a;
    }
}
