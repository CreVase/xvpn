package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class yx0 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
