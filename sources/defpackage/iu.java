package defpackage;

/* loaded from: classes.dex */
public final class iu extends y1 {
    public final /* synthetic */ ju h;

    public iu(ju juVar) {
        this.h = juVar;
    }

    @Override // defpackage.y1
    public final String f() {
        hu huVar = (hu) this.h.f2828a.get();
        if (huVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + huVar.f2485a + "]";
    }
}
