package defpackage;

/* loaded from: classes.dex */
public final class ju0 extends RuntimeException {
    public ju0() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public ju0(int i) {
        super(i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
