package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class o51 implements f13 {

    /* renamed from: a, reason: collision with root package name */
    public final zi3 f3602a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f3603b;

    public o51(zi3 zi3Var, TaskCompletionSource taskCompletionSource) {
        this.f3602a = zi3Var;
        this.f3603b = taskCompletionSource;
    }

    @Override // defpackage.f13
    public final boolean a(Exception exc) {
        this.f3603b.trySetException(exc);
        return true;
    }

    @Override // defpackage.f13
    public final boolean b(bm bmVar) {
        boolean z;
        if (bmVar.f487b == c52.REGISTERED) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f3602a.b(bmVar)) {
            return false;
        }
        String str = bmVar.c;
        if (str != null) {
            Long valueOf = Long.valueOf(bmVar.e);
            Long valueOf2 = Long.valueOf(bmVar.f);
            String str2 = "";
            if (valueOf == null) {
                str2 = "".concat(" tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str2 = p71.l(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                this.f3603b.setResult(new ul(str, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        throw new NullPointerException("Null token");
    }
}
