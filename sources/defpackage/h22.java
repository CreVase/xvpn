package defpackage;

import androidx.activity.b;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class h22 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h22(b bVar, int i) {
        super(1);
        this.f = i;
        this.g = bVar;
    }

    public final void b() {
        int i = this.f;
        Object obj = null;
        b bVar = this.g;
        switch (i) {
            case 0:
                gg ggVar = bVar.f131b;
                ggVar.getClass();
                ListIterator listIterator = ggVar.listIterator(ggVar.c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((g22) previous).f2193a) {
                            obj = previous;
                        }
                    }
                }
                bVar.c = (g22) obj;
                return;
            default:
                gg ggVar2 = bVar.f131b;
                ggVar2.getClass();
                ListIterator listIterator2 = ggVar2.listIterator(ggVar2.c);
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((g22) previous2).f2193a) {
                            obj = previous2;
                        }
                    }
                }
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                b();
                return ch3Var;
            default:
                b();
                return ch3Var;
        }
    }
}
