package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import b.ContentWrapper;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public abstract class zo extends dn {
    public ContentWrapper k;

    public abstract nk3 Z();

    public void a0(Bundle bundle) {
    }

    @Override // defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        Resources resources;
        super.onCreate(bundle);
        Context z2 = zf3.z();
        if (z2 != null && (resources = z2.getResources()) != null) {
            z = resources.getBoolean(R.bool.isTablet);
        } else {
            z = false;
        }
        if (z) {
            setRequestedOrientation(-1);
        }
        ContentWrapper contentWrapper = new ContentWrapper(this.c, null, 6);
        this.k = contentWrapper;
        contentWrapper.addView(Z().getRoot());
        setContentView(contentWrapper);
        a0(bundle);
        ContentWrapper contentWrapper2 = this.k;
        if (contentWrapper2 != null) {
            y62 y62Var = y62.z;
            contentWrapper2.f372a.add(y62Var);
            y62Var.invoke(contentWrapper2.f373b);
        }
    }
}
