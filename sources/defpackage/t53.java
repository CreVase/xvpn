package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class t53 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4455b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t53(Object obj, int i, Object obj2, int i2) {
        this.f4454a = i2;
        this.f4455b = obj;
        this.c = i;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4454a;
        Object obj = this.d;
        Object obj2 = this.f4455b;
        switch (i) {
            case 0:
                p53 p53Var = ((u53) obj2).u;
                p53Var.getClass();
                br brVar = br.f513a;
                br.c(((k53) obj).f2891a);
                p53Var.f3787a.requireActivity().finish();
                return;
            case 1:
                s53 s53Var = ((u53) obj2).u.f3787a;
                s53Var.z(s53Var.g.indexOf((k53) obj));
                return;
            default:
                ((yz) obj2).d = this.c;
                ((n40) obj).f();
                return;
        }
    }
}
