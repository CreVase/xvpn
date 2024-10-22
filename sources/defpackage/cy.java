package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class cy extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ChatActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy(ChatActivity chatActivity, int i) {
        super(1);
        this.f = i;
        this.g = chatActivity;
    }

    public final void a(p9 p9Var) {
        int i = this.f;
        int i2 = 1;
        ChatActivity chatActivity = this.g;
        switch (i) {
            case 0:
                p9Var.f3798a = pd0.y(R.string.ClearChatHistory);
                ArrayList arrayList = p9Var.m;
                arrayList.add(new o9(pd0.y(R.string.ClearAllMessageLogs), 1000145, new ay(chatActivity, 0), 1));
                arrayList.add(new o9(pd0.y(R.string.ClearAllUserMessage), 1000145, new ay(chatActivity, 1), 1));
                arrayList.add(new o9(pd0.y(R.string.Cancel)));
                return;
            case 1:
            default:
                p9Var.f3798a = pd0.y(R.string.AccessDenied);
                p9Var.f3799b = pd0.y(R.string.RequestMediaPermissionTip);
                p9.b(p9Var, pd0.y(R.string.GoToSettings), new ay(chatActivity, 4), 2);
                p9Var.h = pd0.y(R.string.Later);
                return;
            case 2:
                p9Var.f3799b = pd0.y(R.string.BsvTestRuningExitTips);
                p9Var.d = pd0.y(R.string.Cancel);
                p9Var.k = new cy(chatActivity, i2);
                return;
            case 3:
                p9Var.f3798a = pd0.y(R.string.AllowNotificationTips);
                p9.b(p9Var, pd0.y(R.string.AllowNotification), new ay(chatActivity, 2), 2);
                p9.a(p9Var, pd0.y(R.string.GoBack), new ay(chatActivity, 3), 2);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((p9) obj);
                return ch3Var;
            case 1:
                this.g.moveTaskToBack(true);
                return ch3Var;
            case 2:
                a((p9) obj);
                return ch3Var;
            case 3:
                a((p9) obj);
                return ch3Var;
            default:
                a((p9) obj);
                return ch3Var;
        }
    }
}
