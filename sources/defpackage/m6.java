package defpackage;

import a.bx;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.security.xvpn.z35kb.browser.BrowserSettingActivity;

/* loaded from: classes2.dex */
public final class m6 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f3239a = new SparseArray();

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparseArray sparseArray = this.f3239a;
        dr drVar = (dr) sparseArray.get(i);
        if (drVar != null) {
            int i3 = BrowserSettingActivity.m;
            BrowserSettingActivity browserSettingActivity = drVar.f1823a;
            browserSettingActivity.getClass();
            if (i2 == -1 && i == 1 && intent != null) {
                String stringExtra = intent.getStringExtra("search_engine");
                browserSettingActivity.a0(stringExtra);
                if (!TextUtils.isEmpty(stringExtra)) {
                    ya0.f5299a = ya0.V(stringExtra);
                    bx j = hx2.j(stringExtra, 510);
                    boolean q = j.q();
                    j.h();
                    pe0.a("save search engine :" + q, new Object[0]);
                }
            }
            sparseArray.remove(i);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
