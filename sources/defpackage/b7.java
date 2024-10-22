package defpackage;

import androidx.activity.result.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b7 extends a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f417b;
    public final /* synthetic */ x6 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b7(Object obj, Serializable serializable, x6 x6Var, int i) {
        this.f416a = i;
        this.d = obj;
        this.f417b = serializable;
        this.c = x6Var;
    }

    @Override // defpackage.a7
    public final void a(Object obj) {
        int i = this.f416a;
        x6 x6Var = this.c;
        Object obj2 = this.d;
        Serializable serializable = this.f417b;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                String str = (String) serializable;
                Integer num = (Integer) aVar.f139b.get(str);
                if (num != null) {
                    aVar.d.add(str);
                    try {
                        ((a) obj2).b(num.intValue(), x6Var, obj);
                        return;
                    } catch (Exception e) {
                        aVar.d.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + x6Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                a aVar2 = (a) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) aVar2.f139b.get(str2);
                if (num2 != null) {
                    aVar2.d.add(str2);
                    try {
                        ((a) obj2).b(num2.intValue(), x6Var, obj);
                        return;
                    } catch (Exception e2) {
                        aVar2.d.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + x6Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                a7 a7Var = (a7) ((AtomicReference) serializable).get();
                if (a7Var != null) {
                    a7Var.a(obj);
                    return;
                }
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // defpackage.a7
    public final void b() {
        int i = this.f416a;
        Object obj = this.d;
        Serializable serializable = this.f417b;
        switch (i) {
            case 0:
                ((a) obj).f((String) serializable);
                return;
            case 1:
                ((a) obj).f((String) serializable);
                return;
            default:
                a7 a7Var = (a7) ((AtomicReference) serializable).getAndSet(null);
                if (a7Var != null) {
                    a7Var.b();
                    return;
                }
                return;
        }
    }
}
