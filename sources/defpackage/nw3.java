package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class nw3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3553b;

    public /* synthetic */ nw3(Object obj, int i) {
        this.f3552a = i;
        this.f3553b = obj;
    }

    private final void a() {
        dh dhVar = (dh) this.f3553b;
        synchronized (dhVar.f1776a) {
            if (!dhVar.l) {
                long j = dhVar.k - 1;
                dhVar.k = j;
                if (j <= 0) {
                    if (j < 0) {
                        dhVar.b(new IllegalStateException());
                    } else {
                        dhVar.a();
                    }
                }
            }
        }
    }

    private final void b() {
        rp rpVar = (rp) this.f3553b;
        synchronized (rpVar.d) {
            SharedPreferences.Editor edit = ((SharedPreferences) rpVar.c).edit();
            String str = rpVar.f4195a;
            StringBuilder sb = new StringBuilder();
            Iterator it = rpVar.d.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(rpVar.f4196b);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw3.run():void");
    }
}
