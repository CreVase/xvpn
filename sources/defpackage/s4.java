package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s4 implements t33 {

    /* renamed from: b, reason: collision with root package name */
    public static final s4 f4267b = new s4();

    /* renamed from: a, reason: collision with root package name */
    public Context f4268a;

    @Override // defpackage.t33
    public u33 d(s33 s33Var) {
        String str = s33Var.f4266b;
        rd rdVar = s33Var.c;
        if (rdVar != null) {
            Context context = this.f4268a;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    return new m31(context, str, rdVar, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
