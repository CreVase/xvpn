package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.WebViewActivity;

/* loaded from: classes2.dex */
public final class e82 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1898b;

    public /* synthetic */ e82(Context context, int i) {
        this.f1897a = i;
        this.f1898b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context = this.f1898b;
        switch (this.f1897a) {
            case 0:
                tf3.h0(context, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.TermsOfService))), 0, 4);
                return;
            default:
                tf3.h0(context, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.PrivacyPolicy))), 0, 4);
                return;
        }
    }
}
