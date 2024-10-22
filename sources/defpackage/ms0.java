package defpackage;

/* loaded from: classes2.dex */
public abstract class ms0 extends v90 {
    public static final /* synthetic */ int e = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f3343b;
    public boolean c;
    public gg d;

    public final void M(boolean z) {
        long j;
        long j2 = this.f3343b;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.f3343b = j3;
        if (j3 <= 0 && this.c) {
            shutdown();
        }
    }

    public abstract Thread N();

    public final void O(boolean z) {
        long j;
        long j2 = this.f3343b;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f3343b = j + j2;
        if (!z) {
            this.c = true;
        }
    }

    public abstract long P();

    public final boolean Q() {
        Object h;
        gg ggVar = this.d;
        if (ggVar == null) {
            return false;
        }
        if (ggVar.isEmpty()) {
            h = null;
        } else {
            h = ggVar.h();
        }
        ul0 ul0Var = (ul0) h;
        if (ul0Var == null) {
            return false;
        }
        ul0Var.run();
        return true;
    }

    public void R(long j, js0 js0Var) {
        gh0.i.W(j, js0Var);
    }

    public abstract void shutdown();
}
