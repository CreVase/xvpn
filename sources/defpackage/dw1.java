package defpackage;

/* loaded from: classes2.dex */
public enum dw1 implements fa2 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f1851a;

    dw1(int i) {
        this.f1851a = i;
    }

    @Override // defpackage.fa2
    public final int getNumber() {
        return this.f1851a;
    }
}
