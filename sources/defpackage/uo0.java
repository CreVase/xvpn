package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class uo0 extends zu2 {
    public final /* synthetic */ int m;
    public final Object n;

    public uo0(List list) {
        this.m = 0;
        r42 r42Var = new r42((byte[]) list.get(0));
        this.n = new bp0(r42Var.A(), r42Var.A());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v7 sv, still in use, count: 2, list:
          (r4v7 sv) from 0x027e: PHI (r4v8 sv) = (r4v7 sv), (r4v11 sv) binds: [B:91:0x0274, B:130:0x03a5] A[DONT_GENERATE, DONT_INLINE]
          (r4v7 sv) from 0x023b: MOVE (r25v4 sv) = (r4v7 sv) (LINE:572)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.zu2
    public final defpackage.v23 e(byte[] r49, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo0.e(byte[], int, boolean):v23");
    }

    public uo0() {
        this.m = 1;
        this.n = new r42();
    }
}
