package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.impl.c;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class bv3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f536a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f537b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bv3(fi3 fi3Var, lm lmVar, int i, Runnable runnable) {
        this.c = fi3Var;
        this.d = lmVar;
        this.f537b = i;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        SQLiteDatabase sQLiteDatabase;
        int i = this.f536a;
        int i2 = this.f537b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                c.a((AdCallback) obj3, (Ad) obj2, (String) obj, i2);
                return;
            default:
                fi3 fi3Var = (fi3) obj3;
                lm lmVar = (lm) obj2;
                Runnable runnable = (Runnable) obj;
                ps3 ps3Var = fi3Var.d;
                j43 j43Var = fi3Var.f;
                try {
                    try {
                        os0 os0Var = fi3Var.c;
                        Objects.requireNonNull(os0Var);
                        ((am2) j43Var).x(new z5(os0Var, 5));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) fi3Var.f2097a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            am2 am2Var = (am2) j43Var;
                            SQLiteDatabase a2 = am2Var.a();
                            qy2 qy2Var = new qy2(6);
                            gi3 gi3Var = (gi3) am2Var.c;
                            long a3 = gi3Var.a();
                            while (true) {
                                try {
                                    a2.beginTransaction();
                                    sQLiteDatabase = a2;
                                } catch (SQLiteDatabaseLockedException e) {
                                    sQLiteDatabase = a2;
                                    if (gi3Var.a() >= am2Var.d.c + a3) {
                                        qy2Var.apply(e);
                                    } else {
                                        SystemClock.sleep(50L);
                                        a2 = sQLiteDatabase;
                                    }
                                }
                            }
                            try {
                                ((hf1) ps3Var).a(lmVar, i2 + 1, false);
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th) {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        } else {
                            fi3Var.a(lmVar, i2);
                        }
                    } catch (h43 unused) {
                        ((hf1) ps3Var).a(lmVar, i2 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public /* synthetic */ bv3(AdCallback adCallback, Ad ad, String str, int i) {
        this.c = adCallback;
        this.d = ad;
        this.e = str;
        this.f537b = i;
    }
}
