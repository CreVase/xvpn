package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class kn2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2980a = 0;

    static {
        bo1.e("Schedulers");
    }

    public static void a(u40 u40Var, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            ts3 n = workDatabase.n();
            workDatabase.c();
            try {
                int i = Build.VERSION.SDK_INT;
                int i2 = u40Var.h;
                if (i == 23) {
                    i2 /= 2;
                }
                ArrayList b2 = n.b(i2);
                ArrayList a2 = n.a();
                if (b2.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = b2.iterator();
                    while (it.hasNext()) {
                        n.i(((rs3) it.next()).f4206a, currentTimeMillis);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                if (b2.size() > 0) {
                    rs3[] rs3VarArr = (rs3[]) b2.toArray(new rs3[b2.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        hn2 hn2Var = (hn2) it2.next();
                        if (hn2Var.a()) {
                            hn2Var.e(rs3VarArr);
                        }
                    }
                }
                if (a2.size() > 0) {
                    rs3[] rs3VarArr2 = (rs3[]) a2.toArray(new rs3[a2.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        hn2 hn2Var2 = (hn2) it3.next();
                        if (!hn2Var2.a()) {
                            hn2Var2.e(rs3VarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
