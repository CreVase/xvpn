package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public final class ll0 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3149a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f3150b;
    public final XTextViewNew c;

    public ll0(FrameLayout frameLayout, RelativeLayout relativeLayout, XTextViewNew xTextViewNew) {
        this.f3149a = frameLayout;
        this.f3150b = relativeLayout;
        this.c = xTextViewNew;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f3149a;
    }
}
