package a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.VpnService;
import android.os.Bundle;
import defpackage.ew3;
import defpackage.pw3;
import defpackage.uo;

/* loaded from: classes.dex */
public final class wcyybbcujkPra extends Activity {
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        wcyybbcujkCs wcyybbcujkcs = wcyybbcujkCs.f4a;
        if (VpnService.prepare(this) == null) {
            wcyybbcujkCs.c(this);
        } else if (i2 != -1) {
            wcyybbcujkCs.c = false;
            uo uoVar = wcyybbcujkCs.f5b;
            if (uoVar != null) {
                uoVar.h();
            }
        } else {
            wcyybbcujkCs.c(this);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getExtras() == null) {
            finish();
            return;
        }
        String string = intent.getExtras().getString("psk");
        if (string != null && string.equals("z93emquwpbdk9qvqfkfc8z552vaf52szsvzbmvd6qjdynmxm7yh6nq23c9yw4drs")) {
            wcyybbcujkCs wcyybbcujkcs = wcyybbcujkCs.f4a;
            Intent prepare = VpnService.prepare(this);
            boolean z = false;
            if (prepare == null) {
                wcyybbcujkCs.c(this);
            } else {
                try {
                    try {
                        startActivityForResult(prepare, 0);
                    } catch (ActivityNotFoundException | NullPointerException unused) {
                        prepare.setComponent(new ComponentName("com.android.vpndialogs", "com.android.vpndialogs.ConfirmDialog"));
                        startActivityForResult(prepare, 0);
                    }
                    z = true;
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    wcyybbcujkCs.e = true;
                    ew3.b0(new pw3(1));
                }
            }
            if (!z) {
                finish();
                return;
            }
            return;
        }
        finish();
    }
}
