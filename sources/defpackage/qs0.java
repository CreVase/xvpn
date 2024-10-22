package defpackage;

import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public final class qs0 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Constructor g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs0(Constructor constructor, int i) {
        super(1);
        this.f = i;
        this.g = constructor;
    }

    public final Throwable a(Throwable th) {
        int i = this.f;
        Constructor constructor = this.g;
        switch (i) {
            case 0:
                return (Throwable) constructor.newInstance(th.getMessage(), th);
            case 1:
                Throwable th2 = (Throwable) constructor.newInstance(th.getMessage());
                th2.initCause(th);
                return th2;
            case 2:
                return (Throwable) constructor.newInstance(th);
            default:
                Throwable th3 = (Throwable) constructor.newInstance(new Object[0]);
                th3.initCause(th);
                return th3;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                return a((Throwable) obj);
            case 1:
                return a((Throwable) obj);
            case 2:
                return a((Throwable) obj);
            default:
                return a((Throwable) obj);
        }
    }
}
