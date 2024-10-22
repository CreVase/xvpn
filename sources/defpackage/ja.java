package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;
import com.security.xvpn.z35kb.protocol.ProtocolActivity;

/* loaded from: classes2.dex */
public final class ja extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2731a;

    public /* synthetic */ ja(int i) {
        this.f2731a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f2731a) {
            case 0:
                d5.D(ew3.M());
                return;
            case 1:
                d5.D(ew3.M());
                return;
            case 2:
                bx3.a(view.getContext());
                return;
            case 3:
                Activity T = ya0.T(view);
                if (T != null) {
                    tf3.f0(T, ProtocolActivity.class, 2);
                    return;
                }
                return;
            case 4:
                Activity T2 = ya0.T(view);
                if (T2 != null) {
                    tf3.h0(T2, SplitTunnelingActivity.class, null, 0, 6);
                    return;
                }
                return;
            case 5:
                Intent intent = new Intent(view.getContext(), (Class<?>) ProtocolActivity.class);
                Activity T3 = ya0.T(view);
                if (T3 != null) {
                    T3.startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                pe0.d("VpnNetworkProtocolHttp");
                pe0.c();
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f2731a) {
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setColor(-8835);
                textPaint.setUnderlineText(true);
                textPaint.setFakeBoldText(true);
                return;
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setColor(-8835);
                textPaint.setUnderlineText(true);
                textPaint.setFakeBoldText(true);
                return;
            case 4:
                textPaint.setColor(-13982994);
                textPaint.setUnderlineText(true);
                textPaint.setFakeBoldText(true);
                return;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setColor(-8835);
                textPaint.setUnderlineText(true);
                textPaint.setFakeBoldText(true);
                return;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setColor(-8835);
                textPaint.setUnderlineText(true);
                textPaint.setFakeBoldText(true);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
