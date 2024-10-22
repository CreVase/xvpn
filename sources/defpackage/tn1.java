package defpackage;

/* loaded from: classes2.dex */
public enum tn1 implements t12 {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f4545a;

    tn1(int i) {
        this.f4545a = i;
    }

    @Override // defpackage.t12
    public final int getNumber() {
        return this.f4545a;
    }
}
