package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class pa0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3806b;

    public /* synthetic */ pa0(Object obj, int i) {
        this.f3805a = i;
        this.f3806b = obj;
    }

    public final Boolean a() {
        boolean z;
        int i = this.f3805a;
        Object obj = this.f3806b;
        switch (i) {
            case 0:
                try {
                    uy0 uy0Var = ((qa0) obj).e;
                    jx0 jx0Var = (jx0) uy0Var.c;
                    String str = (String) uy0Var.f4757b;
                    jx0Var.getClass();
                    return Boolean.valueOf(new File((File) jx0Var.f2846b, str).delete());
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                na0 na0Var = ((qa0) obj).g;
                uy0 uy0Var2 = na0Var.c;
                jx0 jx0Var2 = (jx0) uy0Var2.c;
                String str2 = (String) uy0Var2.f4757b;
                jx0Var2.getClass();
                if (!new File((File) jx0Var2.f2846b, str2).exists()) {
                    String d = na0Var.d();
                    if (d == null || !((sa0) na0Var.j).c(d)) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                } else {
                    jx0 jx0Var3 = (jx0) uy0Var2.c;
                    String str3 = (String) uy0Var2.f4757b;
                    jx0Var3.getClass();
                    new File((File) jx0Var3.f2846b, str3).delete();
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa0.call():java.lang.Object");
    }
}
