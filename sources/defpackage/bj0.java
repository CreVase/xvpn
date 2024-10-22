package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class bj0 implements kj0, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f474b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bj0(Object obj, Object obj2, boolean z) {
        this.f474b = obj;
        this.c = obj2;
        this.f473a = z;
    }

    @Override // defpackage.kj0
    public final ji2 c(int i, ua3 ua3Var, int[] iArr) {
        nj0 nj0Var = (nj0) this.f474b;
        gj0 gj0Var = (gj0) this.c;
        boolean z = this.f473a;
        nj0Var.getClass();
        cj0 cj0Var = new cj0(nj0Var);
        db1 db1Var = hb1.f2394b;
        m20.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ua3Var.f4643a) {
            dj0 dj0Var = new dj0(i, ua3Var, i2, gj0Var, iArr[i2], z, cj0Var);
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArr = Arrays.copyOf(objArr, pe0.q(objArr.length, i4));
            }
            objArr[i3] = dj0Var;
            i2++;
            i3 = i4;
        }
        return hb1.j(i3, objArr);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Context context = (Context) this.f474b;
        Intent intent = (Intent) this.c;
        Object obj = dw0.c;
        if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
            return dw0.a(context, intent, this.f473a).continueWith(new zf(15), new qb0(5));
        }
        return task;
    }
}
