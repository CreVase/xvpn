package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f30 implements cq, j03 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2036a;

    /* renamed from: b, reason: collision with root package name */
    public int f2037b;
    public Object c;
    public Object d;

    public /* synthetic */ f30(Object obj, int i, Serializable serializable, int i2) {
        this.f2036a = i2;
        this.c = obj;
        this.f2037b = i;
        this.d = serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x017c, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.f30 e(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f30.e(android.content.res.Resources, int, android.content.res.Resources$Theme):f30");
    }

    @Override // defpackage.j03
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f2037b) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (j03 j03Var : (j03[]) this.c) {
            if (stackTraceElementArr2.length <= this.f2037b) {
                break;
            }
            stackTraceElementArr2 = j03Var.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f2037b) {
            return ((tw1) this.d).a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final void b(int i, om2 om2Var) {
        boolean z;
        boolean z2 = false;
        if (this.f2037b == -1) {
            if (((SparseArray) this.c).size() == 0) {
                z = true;
            } else {
                z = false;
            }
            cp3.m(z);
            this.f2037b = 0;
        }
        if (((SparseArray) this.c).size() > 0) {
            SparseArray sparseArray = (SparseArray) this.c;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z2 = true;
            }
            cp3.e(z2);
            if (keyAt == i) {
                x70 x70Var = (x70) this.d;
                SparseArray sparseArray2 = (SparseArray) this.c;
                x70Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        ((SparseArray) this.c).append(i, om2Var);
    }

    @Override // defpackage.cq
    public final bq c(ev0 ev0Var, long j) {
        long position = ev0Var.getPosition();
        long f = f(ev0Var);
        long f2 = ev0Var.f();
        ev0Var.g(Math.max(6, ((vy0) this.c).c));
        long f3 = f(ev0Var);
        long f4 = ev0Var.f();
        if (f <= j && f3 > j) {
            return bq.b(f2);
        }
        if (f3 <= j) {
            return new bq(-2, f3, f4);
        }
        return new bq(-1, f, position);
    }

    @Override // defpackage.cq
    public final /* synthetic */ void d() {
    }

    public final long f(ev0 ev0Var) {
        int h;
        while (ev0Var.f() < ev0Var.j() - 6) {
            vy0 vy0Var = (vy0) this.c;
            int i = this.f2037b;
            lm2 lm2Var = (lm2) this.d;
            long f = ev0Var.f();
            byte[] bArr = new byte[2];
            int i2 = 0;
            boolean K = false;
            ev0Var.b(0, bArr, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                ev0Var.l();
                ev0Var.g((int) (f - ev0Var.getPosition()));
            } else {
                r42 r42Var = new r42(16);
                System.arraycopy(bArr, 0, r42Var.f4098a, 0, 2);
                byte[] bArr2 = r42Var.f4098a;
                while (i2 < 14 && (h = ev0Var.h(2 + i2, bArr2, 14 - i2)) != -1) {
                    i2 += h;
                }
                r42Var.F(i2);
                ev0Var.l();
                ev0Var.g((int) (f - ev0Var.getPosition()));
                K = ya0.K(r42Var, vy0Var, i, lm2Var);
            }
            if (K) {
                break;
            }
            ev0Var.g(1);
        }
        if (ev0Var.f() >= ev0Var.j() - 6) {
            ev0Var.g((int) (ev0Var.j() - ev0Var.f()));
            return ((vy0) this.c).j;
        }
        return ((lm2) this.d).f3157a;
    }

    public final Object g(int i) {
        if (this.f2037b == -1) {
            this.f2037b = 0;
        }
        while (true) {
            int i2 = this.f2037b;
            if (i2 <= 0 || i >= ((SparseArray) this.c).keyAt(i2)) {
                break;
            }
            this.f2037b--;
        }
        while (this.f2037b < ((SparseArray) this.c).size() - 1 && i >= ((SparseArray) this.c).keyAt(this.f2037b + 1)) {
            this.f2037b++;
        }
        return ((SparseArray) this.c).valueAt(this.f2037b);
    }

    public final Object h() {
        return ((SparseArray) this.c).valueAt(((SparseArray) r0).size() - 1);
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f2037b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof mp2) {
                mp2 mp2Var = (mp2) obj;
                if (m20.L(mp2Var.getKind(), o23.f3590b)) {
                    if (((int[]) this.d)[i2] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.d)[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = ((int[]) this.d)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(mp2Var.f(i3));
                    }
                }
            } else if (obj != d5.h) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final boolean j() {
        if (((Shader) this.c) == null) {
            Object obj = this.d;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(int[] iArr) {
        if (j()) {
            ColorStateList colorStateList = (ColorStateList) this.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2037b) {
                this.f2037b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        switch (this.f2036a) {
            case 8:
                return i();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f30(Object obj, Object obj2, int i, int i2) {
        this.f2036a = i2;
        this.c = obj;
        this.d = obj2;
        this.f2037b = i;
    }

    public f30() {
        this.f2036a = 8;
        this.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.d = iArr;
        this.f2037b = -1;
    }

    public f30(j03[] j03VarArr) {
        this.f2036a = 6;
        this.f2037b = UserVerificationMethods.USER_VERIFY_ALL;
        this.c = j03VarArr;
        this.d = new tw1(UserVerificationMethods.USER_VERIFY_ALL, 0);
    }

    public f30(ef0 ef0Var) {
        this.f2036a = 5;
        this.c = new SparseArray();
        this.d = ef0Var;
        this.f2037b = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f30(vy0 vy0Var, int i) {
        this(i, vy0Var);
        this.f2036a = 3;
    }

    public f30(int i, vy0 vy0Var) {
        this.f2036a = 3;
        this.c = vy0Var;
        this.f2037b = i;
        this.d = new lm2(0);
    }
}
