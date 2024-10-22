package defpackage;

/* loaded from: classes2.dex */
public final class ng2 implements tv1 {
    private final yv1 defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public ng2(yv1 yv1Var, String str, Object[] objArr) {
        this.defaultInstance = yv1Var;
        this.info = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.flags = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // defpackage.tv1
    public yv1 getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // defpackage.tv1
    public ga2 getSyntax() {
        if ((this.flags & 1) == 1) {
            return ga2.PROTO2;
        }
        return ga2.PROTO3;
    }

    @Override // defpackage.tv1
    public boolean isMessageSetWireFormat() {
        if ((this.flags & 2) == 2) {
            return true;
        }
        return false;
    }
}
