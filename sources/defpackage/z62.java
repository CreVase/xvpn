package defpackage;

import a.du;
import java.io.File;

/* loaded from: classes.dex */
public final class z62 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v31 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62(v31 v31Var, int i) {
        super(0);
        this.f = i;
        this.g = v31Var;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        v31 v31Var = this.g;
        switch (i) {
            case 0:
                File file = (File) v31Var.invoke();
                String name = file.getName();
                int c1 = i23.c1(name, '.', 0, 6);
                if (m20.L(c1 == -1 ? "" : name.substring(c1 + 1, name.length()), "preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 1:
                return (lm3) v31Var.invoke();
            case 2:
                m256invoke();
                return ch3Var;
            default:
                m256invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m256invoke() {
        int i = this.f;
        v31 v31Var = this.g;
        switch (i) {
            case 2:
                du.d(139, null);
                v31Var.invoke();
                return;
            default:
                du.d(139, null);
                du.d(138, null);
                v31Var.invoke();
                return;
        }
    }
}
