package defpackage;

/* loaded from: classes.dex */
public final class f51 implements wv1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f51 f2043a = new f51();

    @Override // defpackage.wv1
    public final boolean isSupported(Class cls) {
        return m51.class.isAssignableFrom(cls);
    }

    @Override // defpackage.wv1
    public final uv1 messageInfoFor(Class cls) {
        if (m51.class.isAssignableFrom(cls)) {
            try {
                return (uv1) m51.e(cls.asSubclass(m51.class)).d(l51.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
