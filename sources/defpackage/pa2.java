package defpackage;

/* loaded from: classes2.dex */
public final class pa2 implements gj3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3809a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3810b = false;
    public mw0 c;
    public final na2 d;

    public pa2(na2 na2Var) {
        this.d = na2Var;
    }

    @Override // defpackage.gj3
    public final gj3 b(String str) {
        if (!this.f3809a) {
            this.f3809a = true;
            this.d.b(this.c, str, this.f3810b);
            return this;
        }
        throw new mr0("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // defpackage.gj3
    public final gj3 c(boolean z) {
        if (!this.f3809a) {
            this.f3809a = true;
            this.d.h(this.c, z ? 1 : 0, this.f3810b);
            return this;
        }
        throw new mr0("Cannot encode a second value in the ValueEncoderContext");
    }
}
