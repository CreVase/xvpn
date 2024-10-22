package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class ah2 implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88a;

    /* renamed from: b, reason: collision with root package name */
    public z42[] f89b;

    public /* synthetic */ ah2(int i) {
        this.f88a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.f88a) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i = rect.left + ((int) ((rect2.left - r0) * f));
                int i2 = rect.top + ((int) ((rect2.top - r1) * f));
                int i3 = rect.right + ((int) ((rect2.right - r2) * f));
                int i4 = rect.bottom + ((int) ((rect2.bottom - r10) * f));
                Rect rect3 = (Rect) this.f89b;
                if (rect3 == null) {
                    return new Rect(i, i2, i3, i4);
                }
                rect3.set(i, i2, i3, i4);
                return (Rect) this.f89b;
            default:
                z42[] z42VarArr = (z42[]) obj;
                z42[] z42VarArr2 = (z42[]) obj2;
                if (ew3.A0(z42VarArr, z42VarArr2)) {
                    if (!ew3.A0(this.f89b, z42VarArr)) {
                        this.f89b = ew3.K0(z42VarArr);
                    }
                    for (int i5 = 0; i5 < z42VarArr.length; i5++) {
                        z42 z42Var = this.f89b[i5];
                        z42 z42Var2 = z42VarArr[i5];
                        z42 z42Var3 = z42VarArr2[i5];
                        z42Var.getClass();
                        z42Var.f5423a = z42Var2.f5423a;
                        int i6 = 0;
                        while (true) {
                            float[] fArr = z42Var2.f5424b;
                            if (i6 < fArr.length) {
                                z42Var.f5424b[i6] = (z42Var3.f5424b[i6] * f) + ((1.0f - f) * fArr[i6]);
                                i6++;
                            }
                        }
                    }
                    return this.f89b;
                }
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
