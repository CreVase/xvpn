package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class b30 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f392a;

    /* renamed from: b, reason: collision with root package name */
    public final ou f393b;
    public final x31 c;
    public final Object d;
    public final Throwable e;

    public b30(Object obj, ou ouVar, x31 x31Var, Object obj2, Throwable th) {
        this.f392a = obj;
        this.f393b = ouVar;
        this.c = x31Var;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static b30 a(b30 b30Var, ou ouVar, CancellationException cancellationException, int i) {
        Object obj;
        x31 x31Var;
        Object obj2 = null;
        if ((i & 1) != 0) {
            obj = b30Var.f392a;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            ouVar = b30Var.f393b;
        }
        ou ouVar2 = ouVar;
        if ((i & 4) != 0) {
            x31Var = b30Var.c;
        } else {
            x31Var = null;
        }
        if ((i & 8) != 0) {
            obj2 = b30Var.d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = b30Var.e;
        }
        b30Var.getClass();
        return new b30(obj, ouVar2, x31Var, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) obj;
        return m20.L(this.f392a, b30Var.f392a) && m20.L(this.f393b, b30Var.f393b) && m20.L(this.c, b30Var.c) && m20.L(this.d, b30Var.d) && m20.L(this.e, b30Var.e);
    }

    public final int hashCode() {
        Object obj = this.f392a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ou ouVar = this.f393b;
        int hashCode2 = (hashCode + (ouVar == null ? 0 : ouVar.hashCode())) * 31;
        x31 x31Var = this.c;
        int hashCode3 = (hashCode2 + (x31Var == null ? 0 : x31Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f392a + ", cancelHandler=" + this.f393b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ b30(Object obj, ou ouVar, x31 x31Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : ouVar, (i & 4) != 0 ? null : x31Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
