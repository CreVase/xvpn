package defpackage;

/* loaded from: classes.dex */
public class ty0 implements lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4594b;
    public final Object c;

    public /* synthetic */ ty0(Object obj, long j, int i) {
        this.f4593a = i;
        this.c = obj;
        this.f4594b = j;
    }

    @Override // defpackage.lo2
    public final boolean b() {
        switch (this.f4593a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.lo2
    public final ko2 g(long j) {
        long j2;
        int i = this.f4593a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                vy0 vy0Var = (vy0) obj;
                cp3.o(vy0Var.k);
                uy0 uy0Var = vy0Var.k;
                long[] jArr = (long[]) uy0Var.f4757b;
                long[] jArr2 = (long[]) uy0Var.c;
                int f = wi3.f(jArr, wi3.j((vy0Var.e * j) / 1000000, 0L, vy0Var.j - 1), false);
                long j3 = 0;
                if (f == -1) {
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                }
                if (f != -1) {
                    j3 = jArr2[f];
                }
                long j4 = (j2 * 1000000) / ((vy0) obj).e;
                long j5 = this.f4594b;
                no2 no2Var = new no2(j4, j3 + j5);
                if (j4 != j && f != jArr.length - 1) {
                    int i3 = f + 1;
                    return new ko2(no2Var, new no2((jArr[i3] * 1000000) / ((vy0) obj).e, j5 + jArr2[i3]));
                }
                return new ko2(no2Var, no2Var);
            case 1:
                return (ko2) obj;
            default:
                qm qmVar = (qm) obj;
                ko2 b2 = qmVar.g[0].b(j);
                while (true) {
                    g00[] g00VarArr = qmVar.g;
                    if (i2 < g00VarArr.length) {
                        ko2 b3 = g00VarArr[i2].b(j);
                        if (b3.f2988a.f3504b < b2.f2988a.f3504b) {
                            b2 = b3;
                        }
                        i2++;
                    } else {
                        return b2;
                    }
                }
        }
    }

    @Override // defpackage.lo2
    public final long h() {
        switch (this.f4593a) {
            case 0:
                return ((vy0) this.c).b();
            default:
                return this.f4594b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ty0(long j) {
        this(j, 0L);
        this.f4593a = 1;
    }

    public ty0(long j, long j2) {
        this.f4593a = 1;
        this.f4594b = j;
        no2 no2Var = j2 == 0 ? no2.c : new no2(0L, j2);
        this.c = new ko2(no2Var, no2Var);
    }
}
