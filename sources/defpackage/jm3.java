package defpackage;

/* loaded from: classes.dex */
public class jm3 implements im3 {

    /* renamed from: a, reason: collision with root package name */
    public static jm3 f2794a;

    @Override // defpackage.im3
    public em3 a(Class cls) {
        try {
            return (em3) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }

    @Override // defpackage.im3
    public em3 b(Class cls, dy1 dy1Var) {
        return a(cls);
    }
}
