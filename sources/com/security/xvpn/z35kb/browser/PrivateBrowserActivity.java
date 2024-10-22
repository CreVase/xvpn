package com.security.xvpn.z35kb.browser;

import a.bx;
import a.du;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import defpackage.br;
import defpackage.d5;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fv2;
import defpackage.hx2;
import defpackage.j53;
import defpackage.n82;
import defpackage.o82;
import defpackage.sm1;
import defpackage.t9;
import defpackage.ya0;
import defpackage.z91;
import defpackage.zj2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class PrivateBrowserActivity extends dn {
    public static final /* synthetic */ int r = 0;
    public boolean l;
    public boolean p;
    public long q;
    public final br k = br.f513a;
    public final n82 m = new n82(this, 1);
    public final n82 n = new n82(this, 0);
    public final o82 o = new o82(this);

    @Override // defpackage.lt3
    public final String M() {
        return "PrivateBrowserPage";
    }

    @Override // defpackage.lt3
    public final boolean O() {
        return false;
    }

    @Override // defpackage.lt3
    public final boolean P() {
        return false;
    }

    @Override // defpackage.lt3
    public final void R() {
        getWindow().setStatusBarColor(Color.parseColor("#595959"));
        int i = 7;
        if (!d5.f) {
            int i2 = getApplicationContext().getResources().getDisplayMetrics().widthPixels;
            d5.e = new zj2(Math.min(15, ((ActivityManager) getSystemService("activity")).getMemoryClass() / 7) * UserVerificationMethods.USER_VERIFY_ALL * UserVerificationMethods.USER_VERIFY_ALL, 1);
            d5.f = true;
        }
        try {
            setContentView(R.layout.activity_private_browser);
            this.p = true;
            bx i3 = hx2.i(511);
            String u = i3.u();
            i3.h();
            ya0.f5299a = ya0.V(u);
            ya0.L();
            bx bxVar = new bx();
            du.d(512, bxVar);
            bxVar.t();
            bxVar.h();
            sm1.a(this).b(this.m, new IntentFilter("ExitAction"));
            sm1.a(this).b(this.n, new IntentFilter("ClearHistory"));
            if (!ew3.X()) {
                du.d(628, null);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.container);
            this.k.getClass();
            br.d.clear();
            br.e = null;
            br.g.clear();
            br.f = viewGroup;
            br.c = this.o;
            br.f514b = (int) ((r0.widthPixels - (24 * viewGroup.getContext().getResources().getDisplayMetrics().density)) / 2);
            Z(getIntent());
        } catch (Exception e) {
            e.printStackTrace();
            t9.u0(this, new fv2(this, i));
        }
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000006;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:            if (r2 != false) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L8
            java.lang.String r1 = r6.getDataString()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = 0
            if (r6 == 0) goto L13
            java.lang.String r3 = "newTab"
            boolean r6 = r6.getBooleanExtra(r3, r2)
            goto L14
        L13:
            r6 = 0
        L14:
            br r3 = r5.k
            r3.getClass()
            if (r1 == 0) goto L24
            java.lang.CharSequence r1 = defpackage.i23.u1(r1)
            java.lang.String r1 = r1.toString()
            goto L25
        L24:
            r1 = r0
        L25:
            r3 = 1
            if (r6 != 0) goto L38
            if (r1 == 0) goto L36
            int r6 = r1.length()
            if (r6 <= 0) goto L32
            r6 = 1
            goto L33
        L32:
            r6 = 0
        L33:
            if (r6 != r3) goto L36
            r2 = 1
        L36:
            if (r2 == 0) goto L62
        L38:
            android.view.ViewGroup r6 = defpackage.br.f
            if (r6 != 0) goto L3d
            goto L62
        L3d:
            android.content.Context r6 = r6.getContext()
            dn r6 = (defpackage.dn) r6
            o82 r2 = defpackage.br.c
            j53 r4 = new j53
            r4.<init>(r6, r2)
            android.view.ViewGroup r6 = r4.h
            r6.requestLayout()
            defpackage.br.c(r4)
            if (r1 == 0) goto L5c
            java.lang.CharSequence r6 = defpackage.i23.u1(r1)
            java.lang.String r0 = r6.toString()
        L5c:
            com.security.xvpn.z35kb.browser.BrowserToolbar r6 = r4.c
            r1 = 3
            r6.b(r1, r0)
        L62:
            boolean r6 = defpackage.br.h
            if (r6 == 0) goto L8d
            java.util.ArrayList r6 = defpackage.br.d
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L8d
            android.view.ViewGroup r6 = defpackage.br.f
            if (r6 == 0) goto L8d
            android.content.Context r0 = r6.getContext()
            java.lang.Class<com.security.xvpn.z35kb.browser.BrowserTabIndexActivity> r1 = com.security.xvpn.z35kb.browser.BrowserTabIndexActivity.class
            defpackage.ya0.H(r0, r1)
            android.content.Context r6 = r6.getContext()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L8d
            r0 = 2130771986(0x7f010012, float:1.7147078E38)
            r1 = 2130771985(0x7f010011, float:1.7147076E38)
            r6.overridePendingTransition(r0, r1)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.browser.PrivateBrowserActivity.Z(android.content.Intent):void");
    }

    public final void a0() {
        Stack stack = XApplication.e;
        if (stack.size() <= 0) {
            return;
        }
        try {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Stack stack2 = XApplication.e;
                if (stack2.get(i) instanceof MainActivity) {
                    ((Activity) stack2.get(i)).finish();
                    stack2.remove(stack2.get(i));
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.k.getClass();
        z91 z91Var = br.e;
        boolean z = false;
        if (z91Var != null) {
            j53 j53Var = (j53) z91Var;
            BrowserToolbar browserToolbar = j53Var.c;
            if (browserToolbar.G) {
                browserToolbar.D.callOnClick();
                z = true;
            }
            if (!z) {
                WebView webView = j53Var.m;
                if (webView != null && webView.canGoBack()) {
                    j53Var.f.callOnClick();
                } else if (j53Var.g()) {
                    j53Var.f2706b.callOnClick();
                } else {
                    j53Var.f.callOnClick();
                }
            }
            z = true;
        }
        if (z) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getApplication().getResources().getConfiguration().orientation == 2) {
            getWindow().addFlags(1536);
        } else {
            getWindow().clearFlags(1536);
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.k.getClass();
        ArrayList arrayList = br.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j53) ((z91) it.next())).h();
        }
        br.f = null;
        br.c = null;
        br.e = null;
        arrayList.clear();
        sm1.a(this).d(this.m);
        sm1.a(this).d(this.n);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.k.getClass();
        Iterator it = br.d.iterator();
        while (it.hasNext()) {
            j53 j53Var = (j53) ((z91) it.next());
            WebView webView = j53Var.m;
            if (webView != null) {
                webView.freeMemory();
                j53Var.m.clearCache(false);
            }
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Z(intent);
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        Bitmap bitmap;
        super.onPause();
        this.k.getClass();
        z91 z91Var = br.e;
        if (z91Var != null) {
            bitmap = ((j53) z91Var).k(br.f514b, true);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        z91 z91Var2 = br.e;
        if (z91Var2 != null) {
            ((j53) z91Var2).m.onPause();
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.p) {
            this.k.getClass();
            br.b();
            br.h = false;
            z91 z91Var = br.e;
            if (z91Var != null) {
                j53 j53Var = (j53) z91Var;
                j53Var.i();
                j53Var.o(br.d.size());
            }
        }
        this.l = false;
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        boolean z;
        super.onStop();
        if (ya0.e0() && (this.l || !((XApplication) this.c.getApplication()).c())) {
            z = true;
        } else {
            z = false;
        }
        this.k.getClass();
        if (z) {
            br.a(false);
            br.b();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.q < 500) {
            return;
        }
        this.q = elapsedRealtime;
        super.startActivityForResult(intent, i, bundle);
    }
}
