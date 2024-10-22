package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import defpackage.g92;
import defpackage.gc1;
import defpackage.lf;
import defpackage.s71;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements gc1 {
    @Override // defpackage.gc1
    public final List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.gc1
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new s71(13);
        }
        g92.a(new lf(6, this, context.getApplicationContext()));
        return new s71(13);
    }
}
