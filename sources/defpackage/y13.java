package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.security.xvpn.z35kb.WebViewActivity;

/* loaded from: classes2.dex */
public final class y13 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5258b;

    public y13(String str, boolean z) {
        this.f5257a = str;
        this.f5258b = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("intentTargetUrl", tf3.g() + "&dark=" + v73.l());
        bundle.putString("intentTitle", this.f5257a);
        bundle.putBoolean("isFromConnectionDialog", this.f5258b);
        Activity T = ya0.T(view);
        if (T != null) {
            tf3.h0(T, WebViewActivity.class, bundle, 0, 4);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }
}
