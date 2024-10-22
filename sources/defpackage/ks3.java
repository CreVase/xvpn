package defpackage;

/* loaded from: classes.dex */
public final class ks3 extends ys2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks3(Object obj, gl2 gl2Var, int i) {
        super(gl2Var);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ys2
    public final String b() {
        switch (this.d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}
