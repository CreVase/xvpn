package defpackage;

import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class mx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatActivity f3367b;

    public /* synthetic */ mx(ChatActivity chatActivity, int i) {
        this.f3366a = i;
        this.f3367b = chatActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3366a;
        ChatActivity chatActivity = this.f3367b;
        switch (i) {
            case 0:
                int i2 = ChatActivity.L;
                chatActivity.getClass();
                zf3.T(chatActivity, null, new my(chatActivity, null), 3);
                return;
            case 1:
                int i3 = ChatActivity.L;
                chatActivity.Z().n.setPadding(0, chatActivity.Z().p.getMeasuredHeight(), 0, 0);
                return;
            default:
                int i4 = ChatActivity.L;
                m20.u0(chatActivity.Z().o);
                return;
        }
    }
}
