package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.impl.b;
import com.chartboost.sdk.impl.f2;
import com.chartboost.sdk.impl.o2;
import com.chartboost.sdk.impl.q5;
import com.google.android.gms.common.Scopes;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import com.security.xvpn.z35kb.account.ResetPasswordActivity;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class vu3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4902b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vu3(int i, String str, Object obj, Object obj2, Object obj3) {
        this.f4901a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4902b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4901a;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.f4902b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                b.a((Ad) obj4, (b) obj3, (String) obj2, (ei2) obj);
                return;
            case 1:
                f2.a.a((f2.a) obj4, (Context) obj3, (q5) obj, (String) obj2);
                return;
            case 2:
                o2.a((o2) obj4, (String) obj2, (String) obj3, (StartCallback) obj);
                return;
            case 3:
                ri0 ri0Var = (ri0) obj4;
                lm lmVar = (lm) obj3;
                fc3 fc3Var = (fc3) obj2;
                pl plVar = (pl) obj;
                Logger logger = ri0.f;
                ri0Var.getClass();
                Logger logger2 = ri0.f;
                try {
                    yb3 a2 = ri0Var.c.a(lmVar.f3153a);
                    if (a2 == null) {
                        String format = String.format("Transport backend '%s' is not registered", lmVar.f3153a);
                        logger2.warning(format);
                        fc3Var.a(new IllegalArgumentException(format));
                    } else {
                        ((am2) ri0Var.e).x(new pi0(i2, ri0Var, lmVar, ((iv) a2).a(plVar)));
                        fc3Var.a(null);
                    }
                    return;
                } catch (Exception e) {
                    logger2.warning("Error scheduling event " + e.getMessage());
                    fc3Var.a(e);
                    return;
                }
            case 4:
                fc2 fc2Var = (fc2) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ForgetPasswordActivity forgetPasswordActivity = (ForgetPasswordActivity) ((ku) obj4).d;
                forgetPasswordActivity.N();
                if (!fc2Var.f2076b) {
                    if (!TextUtils.isEmpty(fc2Var.f2075a)) {
                        if (tf3.X(fc2Var.f2075a)) {
                            forgetPasswordActivity.o.o(pd0.y(R.string.ProcessFailedCheckNetwork));
                            forgetPasswordActivity.o.v.setTextColor(-52378);
                            return;
                        } else if (fc2Var.f2075a.contains(Scopes.EMAIL)) {
                            forgetPasswordActivity.o.p(pd0.A(fc2Var.f2075a));
                            return;
                        } else {
                            forgetPasswordActivity.o.o(pd0.A(fc2Var.f2075a));
                            forgetPasswordActivity.o.v.setTextColor(-52378);
                            return;
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(Scopes.EMAIL, str);
                    bundle.putString("code", str2);
                    lt3 lt3Var = forgetPasswordActivity.c;
                    Intent intent = new Intent();
                    intent.setClass(lt3Var, ResetPasswordActivity.class);
                    intent.putExtras(bundle);
                    lt3Var.startActivity(intent);
                    return;
                }
                return;
            case 5:
                final BaseIAPHelper baseIAPHelper = (BaseIAPHelper) obj4;
                final ac2[] ac2VarArr = (ac2[]) obj;
                final String str3 = (String) obj2;
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.f();
                ArrayList arrayList2 = new ArrayList();
                for (lb2 lb2Var : (lb2[]) ((ob2) obj3).c) {
                    pb2 pb2Var = new pb2();
                    pb2Var.c = lb2Var.c;
                    pb2Var.f3816b = lb2Var.f3097b;
                    pb2Var.f3815a = lb2Var.f3096a;
                    arrayList2.add(pb2Var);
                }
                if (XApplication.c) {
                    yc2.f5315b.g(new lc2(arrayList2, new tt2(baseIAPHelper, ac2VarArr, str3)));
                    return;
                }
                a00 a00Var = new a00(baseIAPHelper.f1607a);
                a00Var.n.addAll(arrayList2);
                a00Var.q = new DialogInterface.OnClickListener() { // from class: zn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        ArrayList arrayList3 = BaseIAPHelper.f;
                        BaseIAPHelper baseIAPHelper2 = BaseIAPHelper.this;
                        baseIAPHelper2.getClass();
                        ac2[] ac2VarArr2 = ac2VarArr;
                        ac2VarArr2[i3].f55a = true;
                        baseIAPHelper2.m();
                        ew3.b0(new bo(baseIAPHelper2, ac2VarArr2, str3, 1));
                    }
                };
                a00Var.setOnCancelListener(new ao(baseIAPHelper, i2));
                a00Var.show();
                return;
            default:
                BaseAdLoader$assetDownloadListener$1.b((File) obj4, (BaseAdLoader$assetDownloadListener$1) obj3, (DownloadRequest) obj2, (BaseAdLoader) obj);
                return;
        }
    }

    public /* synthetic */ vu3(o2 o2Var, String str, String str2, StartCallback startCallback) {
        this.f4901a = 2;
        this.c = o2Var;
        this.f4902b = str;
        this.d = str2;
        this.e = startCallback;
    }

    public /* synthetic */ vu3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4901a = i;
        this.c = obj;
        this.d = obj2;
        this.f4902b = obj3;
        this.e = obj4;
    }
}
