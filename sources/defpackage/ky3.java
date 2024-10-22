package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ky3 extends gy3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3036b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky3(Object obj, TaskCompletionSource taskCompletionSource, Object obj2, int i) {
        super(taskCompletionSource);
        this.f3036b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.IInterface, tx3] */
    @Override // defpackage.gy3
    public final void a() {
        IInterface lx3Var;
        int i = this.f3036b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                xy3 xy3Var = (xy3) obj2;
                gy3 gy3Var = (gy3) obj;
                IInterface iInterface = xy3Var.m;
                ArrayList arrayList = xy3Var.d;
                i4 i4Var = xy3Var.f5250b;
                if (iInterface == null && !xy3Var.g) {
                    i4Var.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(gy3Var);
                    rx1 rx1Var = new rx1(2, xy3Var);
                    xy3Var.l = rx1Var;
                    xy3Var.g = true;
                    if (!xy3Var.f5249a.bindService(xy3Var.h, rx1Var, 1)) {
                        i4Var.a("Failed to bind to the service.", new Object[0]);
                        xy3Var.g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            gy3 gy3Var2 = (gy3) it.next();
                            j11 j11Var = new j11();
                            TaskCompletionSource taskCompletionSource = gy3Var2.f2342a;
                            if (taskCompletionSource != null) {
                                taskCompletionSource.trySetException(j11Var);
                            }
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                }
                if (xy3Var.g) {
                    i4Var.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(gy3Var);
                    return;
                } else {
                    gy3Var.run();
                    return;
                }
            case 1:
                rx1 rx1Var2 = (rx1) obj2;
                xy3 xy3Var2 = (xy3) rx1Var2.f4230b;
                IBinder iBinder = (IBinder) obj;
                int i2 = px3.f3936b;
                if (iBinder == null) {
                    lx3Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    if (queryLocalInterface instanceof tx3) {
                        lx3Var = (tx3) queryLocalInterface;
                    } else {
                        lx3Var = new lx3(iBinder);
                    }
                }
                xy3Var2.m = lx3Var;
                Object obj3 = rx1Var2.f4230b;
                xy3 xy3Var3 = (xy3) obj3;
                xy3Var3.f5250b.a("linkToDeath", new Object[0]);
                try {
                    xy3Var3.m.asBinder().linkToDeath(xy3Var3.j, 0);
                } catch (RemoteException e) {
                    Object[] objArr = new Object[0];
                    boolean isLoggable = Log.isLoggable("PlayCore", 6);
                    i4 i4Var2 = xy3Var3.f5250b;
                    if (isLoggable) {
                        Log.e("PlayCore", i4.b(i4Var2.f2534a, "linkToDeath failed", objArr), e);
                    } else {
                        i4Var2.getClass();
                    }
                }
                xy3 xy3Var4 = (xy3) obj3;
                xy3Var4.g = false;
                Iterator it2 = xy3Var4.d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((xy3) obj3).d.clear();
                return;
            default:
                try {
                    ?? r2 = ((dy3) obj2).f1863a.m;
                    String str = ((dy3) obj2).f1864b;
                    Bundle a2 = hy3.a();
                    dy3 dy3Var = (dy3) obj2;
                    String str2 = dy3Var.f1864b;
                    r2.a(str, a2, new c(dy3Var, (TaskCompletionSource) obj));
                    return;
                } catch (RemoteException e2) {
                    i4 i4Var3 = dy3.c;
                    Object[] objArr2 = {((dy3) obj2).f1864b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", i4.b(i4Var3.f2534a, "error requesting in-app review for %s", objArr2), e2);
                    } else {
                        i4Var3.getClass();
                    }
                    ((TaskCompletionSource) obj).trySetException(new RuntimeException(e2));
                    return;
                }
        }
    }

    public ky3(rx1 rx1Var, IBinder iBinder) {
        this.f3036b = 1;
        this.d = rx1Var;
        this.c = iBinder;
    }
}
