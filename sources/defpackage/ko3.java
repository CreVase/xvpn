package defpackage;

/* loaded from: classes2.dex */
public final class ko3 extends Error {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2990b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2991a = 2;

    public ko3() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public static String a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2991a) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public /* synthetic */ ko3(int i) {
        this("An operation is not implemented.");
    }

    public ko3(String str) {
        super(str);
    }

    public ko3(String str, Throwable th) {
        super(str, th);
    }

    public ko3(io3 io3Var) {
        super("Application Not Responding", io3Var);
    }
}
