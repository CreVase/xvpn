package defpackage;

import androidx.activity.b;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class i22 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i22(b bVar, int i) {
        super(0);
        this.f = i;
        this.g = bVar;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m102invoke();
                return ch3Var;
            case 1:
                m102invoke();
                return ch3Var;
            default:
                m102invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m102invoke() {
        Object obj;
        int i = this.f;
        b bVar = this.g;
        switch (i) {
            case 0:
                bVar.b();
                return;
            case 1:
                gg ggVar = bVar.f131b;
                ggVar.getClass();
                ListIterator listIterator = ggVar.listIterator(ggVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((g22) obj).f2193a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                bVar.c = null;
                return;
            default:
                bVar.b();
                return;
        }
    }
}
