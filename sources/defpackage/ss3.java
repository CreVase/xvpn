package defpackage;

/* loaded from: classes.dex */
public final class ss3 extends ys2 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss3(gl2 gl2Var, int i) {
        super(gl2Var);
        this.d = i;
    }

    @Override // defpackage.ys2
    public final String b() {
        switch (this.d) {
            case 0:
                return "DELETE FROM workspec WHERE id=?";
            case 1:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            case 3:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 5:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            default:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }
}
