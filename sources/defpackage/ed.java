package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class ed extends gd {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ jd d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(jd jdVar, y33 y33Var) {
        super(jdVar);
        this.d = jdVar;
        this.e = y33Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    @Override // defpackage.gd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed.b():int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(jd jdVar, Context context) {
        super(jdVar);
        this.d = jdVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
