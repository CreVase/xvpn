package defpackage;

/* loaded from: classes2.dex */
public enum qd0 implements t12 {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f3986a;

    qd0(int i) {
        this.f3986a = i;
    }

    @Override // defpackage.t12
    public final int getNumber() {
        return this.f3986a;
    }
}
