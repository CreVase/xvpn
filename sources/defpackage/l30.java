package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.o;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l30 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3057b;
    public final Object c;
    public final Object d;

    public /* synthetic */ l30(Object obj, int i, Object obj2, int i2) {
        this.f3056a = i2;
        this.c = obj;
        this.f3057b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        w6 w6Var;
        int i = 0;
        switch (this.f3056a) {
            case 0:
                m30 m30Var = (m30) this.c;
                Object obj = ((ja1) this.d).f2735b;
                String str = (String) m30Var.f138a.get(Integer.valueOf(this.f3057b));
                if (str != null) {
                    c7 c7Var = (c7) m30Var.e.get(str);
                    if (c7Var != null && (w6Var = c7Var.f591a) != null) {
                        if (m30Var.d.remove(str)) {
                            ((o) w6Var).b(obj);
                            return;
                        }
                        return;
                    } else {
                        m30Var.g.remove(str);
                        m30Var.f.put(str, obj);
                        return;
                    }
                }
                return;
            case 1:
                ((m30) this.c).a(this.f3057b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.d));
                return;
            case 2:
                ((uc0) this.c).getClass();
                throw null;
            case 3:
                String[] strArr = (String[]) this.d;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.c;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i < length) {
                    iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    i++;
                }
                ((x5) activity).onRequestPermissionsResult(this.f3057b, strArr, iArr);
                return;
            case 4:
                tf3 tf3Var = (tf3) ((v51) this.d).f4780b;
                if (tf3Var != null) {
                    tf3Var.l0(this.f3057b);
                    return;
                }
                return;
            case 5:
                List list = (List) this.d;
                int size = list.size();
                if (this.f3057b != 1) {
                    while (i < size) {
                        ((yp0) list.get(i)).a();
                        i++;
                    }
                    return;
                } else {
                    while (i < size) {
                        ((yp0) list.get(i)).b();
                        i++;
                    }
                    return;
                }
            case 6:
                ((r43) this.d).a(this.f3057b, (Intent) this.c);
                return;
            case 7:
                ((SystemForegroundService) this.c).e.notify(this.f3057b, (Notification) this.d);
                return;
            case 8:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.c;
                View view = (View) this.d;
                int i2 = BottomSheetBehavior.e0;
                bottomSheetBehavior.G(view, false, this.f3057b);
                return;
            case 9:
                Activity activity2 = (Activity) this.d;
                activity2.startActivityForResult(new Intent(activity2, (Class<?>) this.c), this.f3057b);
                return;
        }
        while (!((dw3) this.d).f1852a) {
            ((Runnable) this.c).run();
            try {
                Thread.sleep(this.f3057b);
            } catch (Exception e) {
                Log.i("pf8wms7v7g", "RunRepeat error " + e.getMessage());
                return;
            }
        }
    }

    public /* synthetic */ l30(Object obj, Object obj2, int i, int i2) {
        this.f3056a = i2;
        this.d = obj;
        this.c = obj2;
        this.f3057b = i;
    }

    public /* synthetic */ l30(Object obj, Object obj2, int i, int i2, int i3) {
        this.f3056a = i2;
        this.c = obj;
        this.d = obj2;
        this.f3057b = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l30(defpackage.yp0 r3, int r4) {
        /*
            r2 = this;
            r0 = 5
            r2.f3056a = r0
            r0 = 1
            yp0[] r0 = new defpackage.yp0[r0]
            if (r3 == 0) goto L16
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            java.util.List r3 = (java.util.List) r3
            r2.<init>(r3, r4, r0)
            return
        L16:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "initCallback cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l30.<init>(yp0, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l30(int i, ArrayList arrayList) {
        this(arrayList, i, null);
        this.f3056a = 5;
    }

    public l30(List list, int i, Throwable th) {
        this.f3056a = 5;
        if (list != null) {
            this.d = new ArrayList(list);
            this.f3057b = i;
            this.c = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
