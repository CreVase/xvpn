package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.p;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ui0 implements wu, yl2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4676b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ui0(View view, Object obj, c cVar, ux2 ux2Var) {
        this.f4675a = view;
        this.f4676b = obj;
        this.c = cVar;
        this.d = ux2Var;
    }

    @Override // defpackage.yl2
    public final Object apply(Object obj) {
        am2 am2Var = (am2) this.f4675a;
        String str = (String) this.f4676b;
        Map map = (Map) this.c;
        wq2 wq2Var = (wq2) this.d;
        lr0 lr0Var = am2.f;
        am2Var.getClass();
        return (z00) am2.L(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new pi0(4, am2Var, map, wq2Var));
    }

    @Override // defpackage.wu
    public final void b() {
        View view = (View) this.f4675a;
        e eVar = (e) this.f4676b;
        c cVar = (c) this.c;
        ux2 ux2Var = (ux2) this.d;
        view.clearAnimation();
        eVar.f224a.endViewTransition(view);
        cVar.a();
        if (p.I(2)) {
            ux2Var.toString();
        }
    }
}
