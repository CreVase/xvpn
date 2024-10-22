package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 pd2, still in use, count: 1, list:
  (r1v1 pd2) from 0x004b: INVOKE (r11v3 android.util.SparseArray), (1 int), (r1v1 pd2) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:76)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class pd2 {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY,
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER,
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED;

    static {
        pd2 pd2Var = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, pd2Var);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(-1, r9);
    }

    public pd2() {
    }

    public static pd2 valueOf(String str) {
        return (pd2) Enum.valueOf(pd2.class, str);
    }

    public static pd2[] values() {
        return (pd2[]) f3830b.clone();
    }
}
