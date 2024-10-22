package com.security.xvpn.z35kb.banner;

import a.bx;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.R;
import defpackage.a91;
import defpackage.ai0;
import defpackage.b91;
import defpackage.bk1;
import defpackage.d9;
import defpackage.ew3;
import defpackage.hx2;
import defpackage.m20;
import defpackage.n81;
import defpackage.o81;
import defpackage.p81;
import defpackage.pt3;
import defpackage.qt3;
import defpackage.r81;
import defpackage.rt3;
import defpackage.s81;
import defpackage.t81;
import defpackage.to1;
import defpackage.u81;
import defpackage.v81;
import defpackage.w81;
import defpackage.x81;
import defpackage.y81;
import defpackage.z81;
import defpackage.zm;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class HomeBannerManager implements ai0, pt3, qt3, zm {
    public static HomeBannerManager e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f1594a;
    public t81 c;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1595b = new HashMap();
    public final Handler d = new Handler(Looper.getMainLooper());

    @Override // defpackage.pt3
    public final void C(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.post(new s81(this, 1));
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ai0
    public final void b() {
        this.f1594a = null;
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        if (i == 65282 && rt3.e().c == 65281) {
            bx i2 = hx2.i(559);
            boolean q = i2.q();
            i2.h();
            if (q && !(this.c instanceof v81)) {
                this.d.post(new d9(12));
            }
        }
    }

    @Override // defpackage.zm
    public final void d() {
        this.d.post(new s81(this, 0));
    }

    @Override // defpackage.zm
    public final void f(String str, String str2) {
        t81 h;
        boolean z;
        if (this.f1594a == null) {
            return;
        }
        boolean equals = "tzgbt6hhmf".equals(str);
        Handler handler = this.d;
        if (!equals) {
            if (ew3.e(ew3.S0()) && m20.B0()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !str.equals("v67beaug6k")) {
                handler.post(new s81(this, 3));
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            h = h("default");
            ((u81) h).c = str2;
        } else {
            h = h(str);
        }
        handler.post(new to1(9, this, h));
    }

    @Override // defpackage.zm
    public final void g() {
    }

    public final t81 h(String str) {
        t81 v81Var;
        HashMap hashMap = this.f1595b;
        t81 t81Var = (t81) hashMap.get(str);
        if (t81Var != null) {
            return t81Var;
        }
        str.getClass();
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        int i5 = 4;
        int i6 = 5;
        int i7 = 6;
        int i8 = 7;
        int i9 = 8;
        char c = 65535;
        switch (str.hashCode()) {
            case -1712902210:
                if (str.equals("a7g8wpcauu")) {
                    c = 0;
                    break;
                }
                break;
            case -1665876112:
                if (str.equals("rv4wtehzs9")) {
                    c = 1;
                    break;
                }
                break;
            case -1566730408:
                if (str.equals("twykx5b3rg")) {
                    c = 2;
                    break;
                }
                break;
            case -1502623253:
                if (str.equals("247p2y8qjz")) {
                    c = 3;
                    break;
                }
                break;
            case -1390404232:
                if (str.equals("vkzszehwbr")) {
                    c = 4;
                    break;
                }
                break;
            case -1332118825:
                if (str.equals("nvkr9v2urz")) {
                    c = 5;
                    break;
                }
                break;
            case -1193010057:
                if (str.equals("ryjpfh54p9")) {
                    c = 6;
                    break;
                }
                break;
            case -803387347:
                if (str.equals("546hj5bnt9")) {
                    c = 7;
                    break;
                }
                break;
            case -192503486:
                if (str.equals("yk98ww2b89")) {
                    c = '\b';
                    break;
                }
                break;
            case -112644846:
                if (str.equals("mr5new2s34")) {
                    c = '\t';
                    break;
                }
                break;
            case 29019374:
                if (str.equals("9b2nzkn78g")) {
                    c = '\n';
                    break;
                }
                break;
            case 476967501:
                if (str.equals("589pyhghcf")) {
                    c = 11;
                    break;
                }
                break;
            case 598997230:
                if (str.equals("v67beaug6k")) {
                    c = '\f';
                    break;
                }
                break;
            case 701581198:
                if (str.equals("bsxdcst8eb")) {
                    c = '\r';
                    break;
                }
                break;
            case 711358717:
                if (str.equals("aa9wh54cvy")) {
                    c = 14;
                    break;
                }
                break;
            case 711516214:
                if (str.equals("zcc8b8gzd3")) {
                    c = 15;
                    break;
                }
                break;
            case 784063740:
                if (str.equals("tzgbt6hhmf")) {
                    c = 16;
                    break;
                }
                break;
            case 860921799:
                if (str.equals("m9gwshzyqh")) {
                    c = 17;
                    break;
                }
                break;
            case 1134665739:
                if (str.equals("zst999hhzg")) {
                    c = 18;
                    break;
                }
                break;
            case 1269867282:
                if (str.equals("tm5pxn6s9d")) {
                    c = 19;
                    break;
                }
                break;
            case 1311807909:
                if (str.equals("maecav3ncf")) {
                    c = 20;
                    break;
                }
                break;
            case 1363232984:
                if (str.equals("mjg7mtnbg7")) {
                    c = 21;
                    break;
                }
                break;
            case 1455771029:
                if (str.equals("ts67q45ccg")) {
                    c = 22;
                    break;
                }
                break;
            case 1732207498:
                if (str.equals("z6pj2w3axy")) {
                    c = 23;
                    break;
                }
                break;
            case 1794683594:
                if (str.equals("cnyvnhbgbe")) {
                    c = 24;
                    break;
                }
                break;
            case 2083912179:
                if (str.equals("bbrr8anddx")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 6:
            case 15:
                v81Var = new v81(str);
                break;
            case 1:
                v81Var = new r81(i4);
                break;
            case 2:
                v81Var = new p81(i3);
                break;
            case 3:
                v81Var = new r81(i2);
                break;
            case 4:
                v81Var = new p81(i8);
                break;
            case 5:
                v81Var = new r81(i3);
                break;
            case 7:
                v81Var = new n81(i);
                break;
            case '\b':
                v81Var = new p81(i2);
                break;
            case '\t':
                v81Var = new x81();
                break;
            case '\n':
                v81Var = new p81(i6);
                break;
            case 11:
                v81Var = new b91();
                break;
            case '\f':
                v81Var = new a91();
                break;
            case '\r':
                v81Var = new p81(i7);
                break;
            case 14:
                v81Var = new r81(i);
                break;
            case 16:
                v81Var = new z81();
                break;
            case 17:
                v81Var = new p81(i9);
                break;
            case 18:
                v81Var = new n81(i2);
                break;
            case 19:
                v81Var = new p81(i);
                break;
            case 20:
                v81Var = new p81(i5);
                break;
            case 21:
                v81Var = new y81();
                break;
            case 22:
                v81Var = new r81(i5);
                break;
            case 23:
                v81Var = new p81(i4);
                break;
            case 24:
                v81Var = new o81();
                break;
            case 25:
                v81Var = new w81();
                break;
            default:
                v81Var = new u81();
                break;
        }
        hashMap.put(str, v81Var);
        return v81Var;
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
    }

    public final void j() {
        ViewGroup viewGroup;
        Activity activity = this.f1594a;
        if (activity == null) {
            viewGroup = null;
        } else {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        }
        if (viewGroup == null) {
            return;
        }
        View findViewById = viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
        if (findViewById != null) {
            findViewById.setTag(null);
            findViewById.setVisibility(8);
        }
        View findViewById2 = viewGroup.findViewById(R.id.connectStatusTip);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        t81 t81Var = this.c;
        if (t81Var != null && !(t81Var instanceof a91)) {
            t81Var.a(viewGroup);
            this.c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ai0
    public final void n(bk1 bk1Var) {
        this.f1594a = (Activity) bk1Var;
        ew3.d0(new s81(this, 2));
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void onDestroy(bk1 bk1Var) {
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void onStart(bk1 bk1Var) {
    }

    @Override // defpackage.ai0
    public final /* synthetic */ void onStop(bk1 bk1Var) {
    }
}
