package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class og1 extends y41 implements v31 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og1(Object obj, int i) {
        super(0, obj, pg1.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        this.f3657b = i;
        if (i != 1) {
        } else {
            super(0, obj, pg1.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }
    }

    public final Map b() {
        switch (this.f3657b) {
            case 0:
                return pg1.a((mp2) this.receiver);
            default:
                return pg1.a((mp2) this.receiver);
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f3657b) {
            case 0:
                return b();
            default:
                return b();
        }
    }
}
