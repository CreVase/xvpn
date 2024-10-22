package com.security.xvpn.z35kb.livechat;

import android.text.style.URLSpan;
import android.view.View;

/* loaded from: classes2.dex */
class ChatMessageItem$1 extends URLSpan {
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.playSoundEffect(0);
        super.onClick(view);
    }
}
