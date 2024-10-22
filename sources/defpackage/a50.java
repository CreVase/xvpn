package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.security.xvpn.z35kb.view.a;

/* loaded from: classes2.dex */
public final class a50 extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f24b;

    public /* synthetic */ a50(a aVar, int i) {
        this.f23a = i;
        this.f24b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.f23a;
        a aVar = this.f24b;
        switch (i) {
            case 0:
                aVar.dismiss();
                bx3.a(aVar.getOwnerActivity());
                return;
            default:
                aVar.dismiss();
                bx3.a(aVar.getOwnerActivity());
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f23a) {
            case 0:
                textPaint.setColor(-11153696);
                textPaint.setUnderlineText(true);
                return;
            default:
                textPaint.setColor(-11153696);
                textPaint.setUnderlineText(true);
                return;
        }
    }
}
