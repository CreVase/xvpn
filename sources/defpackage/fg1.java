package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class fg1 extends y41 implements l41 {
    public fg1(Object obj) {
        super(2, obj, gg1.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        mp2 mp2Var = (mp2) obj;
        int intValue = ((Number) obj2).intValue();
        gg1 gg1Var = (gg1) this.receiver;
        gg1Var.getClass();
        if (!mp2Var.i(intValue) && mp2Var.h(intValue).c()) {
            z = true;
        } else {
            z = false;
        }
        gg1Var.f2250b = z;
        return Boolean.valueOf(z);
    }
}
