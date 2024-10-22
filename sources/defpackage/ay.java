package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class ay extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ChatActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay(ChatActivity chatActivity, int i) {
        super(0);
        this.f = i;
        this.g = chatActivity;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m1invoke();
                return ch3Var;
            case 1:
                m1invoke();
                return ch3Var;
            case 2:
                m1invoke();
                return ch3Var;
            case 3:
                m1invoke();
                return ch3Var;
            default:
                m1invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1invoke() {
        int i = this.f;
        ChatActivity chatActivity = this.g;
        switch (i) {
            case 0:
                int i2 = ChatActivity.L;
                chatActivity.getClass();
                t9.u0(chatActivity, y62.F);
                return;
            case 1:
                int i3 = ChatActivity.L;
                chatActivity.getClass();
                t9.u0(chatActivity, y62.G);
                return;
            case 2:
                Intent intent = new Intent();
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    int i4 = ChatActivity.L;
                    intent.putExtra("android.provider.extra.APP_PACKAGE", chatActivity.c.getPackageName());
                } else {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    int i5 = ChatActivity.L;
                    ApplicationInfo applicationInfo = chatActivity.c.getApplicationInfo();
                    intent.putExtra("app_uid", applicationInfo != null ? Integer.valueOf(applicationInfo.uid) : null);
                    intent.putExtra("app_package", chatActivity.c.getPackageName());
                }
                try {
                    chatActivity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    bx3.M(e);
                    try {
                        chatActivity.startActivity(new Intent("android.settings.SETTINGS"));
                        return;
                    } catch (Exception e2) {
                        bx3.M(e2);
                        return;
                    }
                }
            case 3:
                int i6 = ChatActivity.L;
                chatActivity.d0();
                return;
            default:
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                int i7 = ChatActivity.L;
                intent2.setData(Uri.fromParts("package", chatActivity.c.getPackageName(), null));
                chatActivity.startActivity(intent2);
                return;
        }
    }
}
