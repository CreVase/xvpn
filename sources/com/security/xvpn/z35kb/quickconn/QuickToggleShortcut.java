package com.security.xvpn.z35kb.quickconn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.security.xvpn.z35kb.R;
import defpackage.et2;
import defpackage.ft2;
import defpackage.m20;
import defpackage.np0;

/* loaded from: classes2.dex */
public final class QuickToggleShortcut extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Object systemService;
        super.onCreate(bundle);
        if (m20.L(getIntent().getAction(), "android.intent.action.CREATE_SHORTCUT")) {
            et2 et2Var = new et2(this);
            Intent[] intentArr = {new Intent(this, (Class<?>) QuickToggleShortcut.class).setAction("android.intent.action.MAIN")};
            Object obj = et2Var.f1995b;
            ((ft2) obj).c = intentArr;
            PorterDuff.Mode mode = IconCompat.k;
            ((ft2) obj).e = IconCompat.b(getResources(), getPackageName(), R.mipmap.ic_launcher);
            ((ft2) obj).d = getString(R.string.shortcut_short_lable);
            ft2 a2 = et2Var.a();
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getSystemService((Class<Object>) np0.f());
                intent = np0.e(systemService).createShortcutResultIntent(a2.b());
            } else {
                intent = null;
            }
            if (intent == null) {
                intent = new Intent();
            }
            a2.a(intent);
            setResult(-1, intent);
        } else if (m20.L(getIntent().getAction(), "x-vpn:quick_conn:bootService")) {
            Intent intent2 = new Intent(this, (Class<?>) QuickConnectService.class);
            intent2.setAction(getIntent().getAction());
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            intent2.putExtras(extras);
            try {
                try {
                    startService(intent2);
                } catch (Throwable unused) {
                    startForegroundService(intent2);
                }
            } catch (Exception unused2) {
            }
        } else {
            Intent intent3 = new Intent(this, (Class<?>) QuickConnActionReciver.class);
            intent3.putExtra("x-vpn:quick_conn", "x-vpn:quick_conn:shortcut");
            sendBroadcast(intent3);
        }
        finish();
    }
}
