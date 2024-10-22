package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class of1 implements dv0 {

    /* renamed from: b, reason: collision with root package name */
    public fv0 f3654b;
    public int c;
    public int d;
    public int e;
    public MotionPhotoMetadata g;
    public ev0 h;
    public v03 i;
    public nx1 j;

    /* renamed from: a, reason: collision with root package name */
    public final r42 f3653a = new r42(6);
    public long f = -1;

    public final void a() {
        b(new Metadata.Entry[0]);
        fv0 fv0Var = this.f3654b;
        fv0Var.getClass();
        fv0Var.j();
        this.f3654b.m(new ty0(-9223372036854775807L));
        this.c = 6;
    }

    public final void b(Metadata.Entry... entryArr) {
        fv0 fv0Var = this.f3654b;
        fv0Var.getClass();
        xa3 l = fv0Var.l(UserVerificationMethods.USER_VERIFY_ALL, 4);
        x01 x01Var = new x01();
        x01Var.j = "image/jpeg";
        x01Var.i = new Metadata(entryArr);
        l.e(new y01(x01Var));
    }

    public final int c(ih0 ih0Var) {
        r42 r42Var = this.f3653a;
        r42Var.D(2);
        ih0Var.e(r42Var.f4098a, 0, 2, false);
        return r42Var.A();
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        ih0 ih0Var = (ih0) ev0Var;
        if (c(ih0Var) != 65496) {
            return false;
        }
        int c = c(ih0Var);
        this.d = c;
        r42 r42Var = this.f3653a;
        if (c == 65504) {
            r42Var.D(2);
            ih0Var.e(r42Var.f4098a, 0, 2, false);
            ih0Var.n(r42Var.A() - 2, false);
            this.d = c(ih0Var);
        }
        if (this.d != 65505) {
            return false;
        }
        ih0Var.n(2, false);
        r42Var.D(6);
        ih0Var.e(r42Var.f4098a, 0, 6, false);
        if (r42Var.w() != 1165519206 || r42Var.A() != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            nx1 nx1Var = this.j;
            nx1Var.getClass();
            nx1Var.e(j, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r25, defpackage.lm2 r26) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of1.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.f3654b = fv0Var;
    }

    @Override // defpackage.dv0
    public final void release() {
        nx1 nx1Var = this.j;
        if (nx1Var != null) {
            nx1Var.getClass();
        }
    }
}
