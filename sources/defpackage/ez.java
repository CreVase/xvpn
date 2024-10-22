package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class ez extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2020a;

    public ez(String str) {
        this.f2020a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ky kyVar = cz.O;
        kyVar.getClass();
        if (m20.L(this.f2020a, "faq")) {
            ChatActivity chatActivity = kyVar.f3033a;
            chatActivity.v.clear();
            chatActivity.v.addAll(chatActivity.u);
            chatActivity.w.f();
            chatActivity.Z().o.f0(0);
            chatActivity.n0();
        }
    }
}
