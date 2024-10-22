package defpackage;

/* loaded from: classes.dex */
public enum vn1 implements fa2 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f4865a;

    vn1(int i2) {
        this.f4865a = i2;
    }

    @Override // defpackage.fa2
    public final int getNumber() {
        return this.f4865a;
    }
}
