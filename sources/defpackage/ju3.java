package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class ju3 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final ku3 f2834a;

    /* renamed from: b, reason: collision with root package name */
    public final lu3 f2835b;

    public ju3(Context context) {
        super(context);
        this.f2834a = new ku3(context);
        this.f2835b = new lu3(context.getResources());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.f2834a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f2835b;
    }
}
