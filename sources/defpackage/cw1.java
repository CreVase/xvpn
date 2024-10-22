package defpackage;

/* loaded from: classes2.dex */
public enum cw1 implements fa2 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f1693a;

    cw1(int i) {
        this.f1693a = i;
    }

    @Override // defpackage.fa2
    public final int getNumber() {
        return this.f1693a;
    }
}
