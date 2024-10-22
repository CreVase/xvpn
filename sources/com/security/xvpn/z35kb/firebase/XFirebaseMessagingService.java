package com.security.xvpn.z35kb.firebase;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.a22;
import defpackage.cz;
import defpackage.ew3;
import defpackage.kg;
import defpackage.le0;
import defpackage.oj1;
import defpackage.p71;

/* loaded from: classes2.dex */
public class XFirebaseMessagingService extends FirebaseMessagingService implements a22 {
    public static int h = -1;

    @Override // defpackage.a22
    public final void F(Object obj) {
        Integer num = (Integer) obj;
        if (h != num.intValue()) {
            getSharedPreferences("message", 0).edit().putInt("unread_message", num.intValue()).apply();
        }
        h = num.intValue();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(RemoteMessage remoteMessage) {
        if (!oj1.a()) {
            return;
        }
        kg kgVar = remoteMessage.f1588b;
        Bundle bundle = remoteMessage.f1587a;
        if (kgVar == null) {
            kg kgVar2 = new kg();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        kgVar2.put(str, str2);
                    }
                }
            }
            remoteMessage.f1588b = kgVar2;
        }
        int i = remoteMessage.f1588b.c;
        if (i == 0) {
            String string = bundle.getString("google.message_id");
            if (string == null) {
                string = bundle.getString("message_id");
            }
            if (!TextUtils.isEmpty(string)) {
                i = 1;
            }
        }
        cz.v.j(Integer.valueOf(h + i));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        if (!oj1.a()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            p71.x(str, 42);
        }
        ew3.b0(new le0(str, 3));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (!oj1.a()) {
            return;
        }
        cz.v.e(this);
    }

    @Override // defpackage.sr0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (!oj1.a()) {
            return;
        }
        cz.v.h(this);
    }
}
