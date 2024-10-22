package defpackage;

import a.bx;
import a.du;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.p;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.impl.n9;
import com.chartboost.sdk.impl.o9;
import com.chartboost.sdk.impl.y3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.security.xvpn.z35kb.EnforceUpgradeActivity;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.util.ImageLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class cq0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1652b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cq0(int i, Object obj, Object obj2, Object obj3) {
        this.f1651a = i;
        this.f1652b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xx3 xx3Var = null;
        int i = 0;
        int i2 = 1;
        switch (this.f1651a) {
            case 0:
                eq0 eq0Var = (eq0) this.f1652b;
                m20 m20Var = (m20) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                eq0Var.getClass();
                try {
                    bq0 G0 = ew3.G0(eq0Var.f1973a);
                    if (G0 != null) {
                        a01 a01Var = (a01) G0.f5052a;
                        synchronized (a01Var.d) {
                            a01Var.f = threadPoolExecutor;
                        }
                        G0.f5052a.a(new dq0(m20Var, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    m20Var.H0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                List list = (List) this.f1652b;
                ux2 ux2Var = (ux2) this.c;
                e eVar = (e) this.d;
                if (list.contains(ux2Var)) {
                    list.remove(ux2Var);
                    eVar.getClass();
                    e.a(ux2Var);
                    return;
                }
                return;
            case 2:
                v21 v21Var = (v21) this.f1652b;
                View view = (View) this.c;
                Rect rect = (Rect) this.d;
                v21Var.getClass();
                v21.g(view, rect);
                return;
            case 3:
                e eVar2 = (e) this.f1652b;
                View view2 = (View) this.c;
                c cVar = (c) this.d;
                eVar2.f224a.endViewTransition(view2);
                cVar.a();
                return;
            case 4:
                com.chartboost.sdk.impl.c.a((AdCallback) this.f1652b, (Ad) this.c, (String) this.d);
                return;
            case 5:
                ((y3) this.f1652b).b((n9) this.c, (o9) this.d);
                return;
            case 6:
                pt1 pt1Var = (pt1) this.f1652b;
                cb1 cb1Var = (cb1) this.c;
                rt1 rt1Var = (rt1) this.d;
                pt1Var.getClass();
                ji2 b0 = cb1Var.b0();
                uf0 uf0Var = (uf0) pt1Var.c;
                x52 x52Var = uf0Var.g;
                x52Var.getClass();
                tf0 tf0Var = uf0Var.d;
                tf0Var.getClass();
                tf0Var.f4492b = hb1.l(b0);
                if (!b0.isEmpty()) {
                    tf0Var.e = (rt1) b0.get(0);
                    rt1Var.getClass();
                    tf0Var.f = rt1Var;
                }
                if (tf0Var.d == null) {
                    tf0Var.d = tf0.b(x52Var, tf0Var.f4492b, tf0Var.e, tf0Var.f4491a);
                }
                tf0Var.d(((bu0) x52Var).k());
                return;
            case 7:
                x50 x50Var = (x50) this.f1652b;
                Pair pair = (Pair) this.c;
                ((uf0) ((fu1) x50Var.c).h).b(((Integer) pair.first).intValue(), (rt1) pair.second, (et1) this.d);
                return;
            case 8:
                x50 x50Var2 = (x50) this.f1652b;
                Pair pair2 = (Pair) this.c;
                ((uf0) ((fu1) x50Var2.c).h).a(((Integer) pair2.first).intValue(), (rt1) pair2.second, (Exception) this.d);
                return;
            case 9:
                x50 x50Var3 = (x50) this.f1652b;
                y01 y01Var = (y01) this.c;
                xe0 xe0Var = (xe0) this.d;
                yt0 yt0Var = (yt0) x50Var3.c;
                int i3 = wi3.f5017a;
                yt0Var.getClass();
                bu0 bu0Var = ((yt0) x50Var3.c).f5387a;
                bu0Var.getClass();
                uf0 uf0Var2 = (uf0) bu0Var.q;
                wa n = uf0Var2.n();
                uf0Var2.o(n, 1009, new ef0(n, y01Var, xe0Var, i));
                return;
            case 10:
                un0 un0Var = (un0) this.f1652b;
                ((vn0) this.c).a(un0Var.f4702a, un0Var.f4703b, (Exception) this.d);
                return;
            case 11:
                vt1 vt1Var = (vt1) this.f1652b;
                ((wt1) this.c).b(vt1Var.f4892a, vt1Var.f4893b, (et1) this.d);
                return;
            case 12:
                p71.C(((uy0) this.f1652b).c);
                int i4 = g8.k;
                throw null;
            case 13:
                jk3 jk3Var = (jk3) this.f1652b;
                y01 y01Var2 = (y01) this.c;
                xe0 xe0Var2 = (xe0) this.d;
                jk3Var.getClass();
                int i5 = wi3.f5017a;
                kk3 kk3Var = jk3Var.f2783b;
                kk3Var.getClass();
                bu0 bu0Var2 = ((yt0) kk3Var).f5387a;
                bu0Var2.K = y01Var2;
                uf0 uf0Var3 = (uf0) bu0Var2.q;
                wa n2 = uf0Var3.n();
                uf0Var3.o(n2, 1017, new ef0(n2, y01Var2, xe0Var2, i2));
                return;
            case 14:
                Callable callable = (Callable) this.f1652b;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                ExecutorService executorService = aj3.f99a;
                try {
                    ((Task) callable.call()).continueWith(executor, new yi3(i2, taskCompletionSource));
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 15:
                sr0 sr0Var = (sr0) this.f1652b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.d;
                int i6 = sr0.f;
                sr0Var.getClass();
                try {
                    sr0Var.b(intent);
                    return;
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            case 16:
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.f1652b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = changePasswordActivity.n;
                bx bxVar = new bx();
                bxVar.z(str3);
                bxVar.z(str);
                bxVar.z(str2);
                du.d(91, bxVar);
                fc2 fc2Var = new fc2();
                ew3.w0(bxVar, fc2Var);
                bxVar.h();
                rt3.e().i(true, ew3.X());
                ew3.d0(new to1(4, changePasswordActivity, fc2Var));
                return;
            case 17:
                String str4 = (String) this.f1652b;
                ImageView imageView = (ImageView) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (m20.L(str4, imageView.getTag())) {
                    imageView.setImageBitmap(bitmap);
                    return;
                }
                return;
            case 18:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) this.f1652b;
                List list2 = (List) this.c;
                String str5 = (String) this.d;
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                if (list2.isEmpty()) {
                    Log.i("cyqnagptpt", "local r22s222");
                    baseIAPHelper.r(new ac2[0], str5);
                    return;
                }
                if (list2.size() == 1) {
                    ac2 ac2Var = new ac2();
                    ac2Var.f55a = true;
                    ac2Var.c = ((gc2) list2.get(0)).f2233b;
                    ac2Var.f56b = ((gc2) list2.get(0)).f2232a;
                    baseIAPHelper.r(new ac2[]{ac2Var}, str5);
                    return;
                }
                gc2[] gc2VarArr = (gc2[]) list2.toArray(new gc2[0]);
                bx bxVar2 = new bx();
                if (gc2VarArr != null) {
                    bxVar2.y(gc2VarArr.length);
                    for (gc2 gc2Var : gc2VarArr) {
                        if (gc2Var == null) {
                            gc2Var = new gc2();
                        }
                        bxVar2.z(gc2Var.f2232a);
                        bxVar2.z(gc2Var.f2233b);
                    }
                } else {
                    bxVar2.y(0L);
                }
                du.d(360, bxVar2);
                ob2 ob2Var = new ob2();
                ob2Var.f3638b = bxVar2.u();
                ob2Var.f3637a = bxVar2.q();
                int t = (int) bxVar2.t();
                lb2[] lb2VarArr = new lb2[t];
                for (int i7 = 0; i7 < t; i7++) {
                    lb2 lb2Var = new lb2();
                    lb2Var.f3096a = bxVar2.u();
                    lb2Var.f3097b = bxVar2.u();
                    lb2Var.c = bxVar2.u();
                    lb2VarArr[i7] = lb2Var;
                }
                ob2Var.c = lb2VarArr;
                bxVar2.h();
                if (!TextUtils.isEmpty((String) ob2Var.f3638b)) {
                    ew3.d0(new to1(12, baseIAPHelper, ob2Var));
                    return;
                }
                lb2[] lb2VarArr2 = (lb2[]) ob2Var.c;
                int length = lb2VarArr2.length;
                ac2[] ac2VarArr = new ac2[length];
                if (lb2VarArr2.length == 0) {
                    ew3.d0(new vn(2, baseIAPHelper));
                    return;
                }
                int i8 = 0;
                while (true) {
                    lb2[] lb2VarArr3 = (lb2[]) ob2Var.c;
                    if (i8 < lb2VarArr3.length) {
                        ac2 ac2Var2 = new ac2();
                        ac2Var2.f55a = false;
                        lb2 lb2Var2 = lb2VarArr3[i8];
                        ac2Var2.c = lb2Var2.f3097b;
                        ac2Var2.f56b = lb2Var2.f3096a;
                        ac2VarArr[i8] = ac2Var2;
                        i8++;
                    } else if (length == 1) {
                        ac2VarArr[0].f55a = true;
                        baseIAPHelper.r(ac2VarArr, str5);
                        return;
                    } else {
                        ew3.d0(new vu3(5, str5, baseIAPHelper, ob2Var, ac2VarArr));
                        return;
                    }
                }
            case 19:
                ei2 ei2Var = (ei2) this.f1652b;
                lt3 lt3Var = (lt3) this.c;
                qw3 qw3Var = (qw3) this.d;
                String str6 = (String) ei2Var.f1938a;
                if (m20.L(str6, "AlertUpdate")) {
                    uf ufVar = uf.f4657a;
                    if (uf.c(uf.g)) {
                        p supportFragmentManager = lt3Var.getSupportFragmentManager();
                        fv2 fv2Var = new fv2(lt3Var, 21);
                        Fragment C = supportFragmentManager.C("googleUpdate");
                        if (C != null && (C instanceof r9)) {
                            return;
                        }
                        r9 r9Var = new r9();
                        fv2Var.invoke(r9Var.e);
                        r9Var.show(supportFragmentManager, "googleUpdate");
                        return;
                    }
                    try {
                        xx3 xx3Var2 = uf.c;
                        if (xx3Var2 != null) {
                            xx3Var = xx3Var2;
                        }
                        sf sfVar = uf.e;
                        xx3Var.getClass();
                        xx3.a(sfVar, 0, lt3Var);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (m20.L(str6, "ForceUpdate")) {
                    uf ufVar2 = uf.f4657a;
                    if (uf.c(uf.g)) {
                        tf3.h0(lt3Var, EnforceUpgradeActivity.class, null, 0, 6);
                        return;
                    }
                    try {
                        xx3 xx3Var3 = uf.c;
                        if (xx3Var3 != null) {
                            xx3Var = xx3Var3;
                        }
                        sf sfVar2 = uf.e;
                        xx3Var.getClass();
                        boolean a2 = xx3.a(sfVar2, 1, lt3Var);
                        pe0.a("AppUpdateManager", "startUpdateFlowForResult:" + a2 + ",isRetry:" + uf.h);
                        if (!a2 && !uf.h) {
                            pe0.a("AppUpdateManager", "retry update checkGooglePlayUpdateExist");
                            uf.h = true;
                            uf.f = qw3Var;
                            uf.f4658b = false;
                            ufVar2.a();
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        pe0.a("AppUpdateManager", hx2.p("exception = ", e2.getMessage()));
                        return;
                    }
                }
                return;
            case 20:
                AssetDownloader.a((AssetDownloader) this.f1652b, (DownloadRequest) this.c, (AssetDownloadListener) this.d);
                return;
            case 21:
                BaseAdLoader$assetDownloadListener$1.a((DownloadRequest) this.f1652b, (BaseAdLoader) this.c, (AssetDownloadListener.DownloadError) this.d);
                return;
            case 22:
                DefaultAdLoader$fetchAdMetadata$1.a((Response) this.f1652b, (Placement) this.c, (DefaultAdLoader) this.d);
                return;
            case 23:
                DefaultAdLoader$fetchAdMetadata$1.b((DefaultAdLoader) this.f1652b, (Throwable) this.c, (Placement) this.d);
                return;
            default:
                ImageLoader.a((String) this.f1652b, (ImageLoader) this.c, (x31) this.d);
                return;
        }
    }
}
