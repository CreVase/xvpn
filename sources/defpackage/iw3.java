package defpackage;

import com.chartboost.sdk.impl.o1;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class iw3 implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x31 f2664b;

    public /* synthetic */ iw3(int i, x31 x31Var) {
        this.f2663a = i;
        this.f2664b = x31Var;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = this.f2663a;
        x31 x31Var = this.f2664b;
        switch (i) {
            case 0:
                o1.a(x31Var, obj);
                return;
            default:
                uf ufVar = uf.f4657a;
                x31Var.invoke(obj);
                return;
        }
    }
}
