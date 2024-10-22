package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class js2 extends ps2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public js2(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.ps2
    public final void a(Matrix matrix, es2 es2Var, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ps2) it.next()).a(this.d, es2Var, i, canvas);
        }
    }
}
