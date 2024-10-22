package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public final class kl0 implements nk3 {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f2966b;
    public final ImageView c;
    public final XTextViewNew d;

    public kl0(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, XTextViewNew xTextViewNew) {
        this.f2965a = frameLayout;
        this.f2966b = imageView;
        this.c = imageView2;
        this.d = xTextViewNew;
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.f2965a;
    }
}
