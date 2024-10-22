package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class pi0 implements i43, yl2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3845b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pi0(int i, Object obj, Object obj2, Object obj3) {
        this.f3844a = i;
        this.d = obj;
        this.c = obj2;
        this.f3845b = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fe A[SYNTHETIC] */
    @Override // defpackage.yl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi0.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.i43
    public final Object execute() {
        ri0 ri0Var = (ri0) this.d;
        lm lmVar = (lm) this.c;
        pl plVar = (pl) this.f3845b;
        am2 am2Var = (am2) ri0Var.d;
        am2Var.getClass();
        int i = 1;
        Object[] objArr = {lmVar.c, plVar.f3864a, lmVar.f3153a};
        if (Log.isLoggable(pe0.C("SQLiteEventStore"), 3)) {
            String.format("Storing event with priority=%s, name=%s for destination %s", objArr);
        }
        ((Long) am2Var.d(new pi0(am2Var, plVar, lmVar, i))).longValue();
        ((hf1) ri0Var.f4157a).a(lmVar, 1, false);
        return null;
    }

    public /* synthetic */ pi0(am2 am2Var, Object obj, lm lmVar, int i) {
        this.f3844a = i;
        this.d = am2Var;
        this.f3845b = obj;
        this.c = lmVar;
    }
}
