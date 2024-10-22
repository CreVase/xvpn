package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class x53 {

    /* renamed from: a, reason: collision with root package name */
    public int f5118a;

    /* renamed from: b, reason: collision with root package name */
    public int f5119b;
    public int c;
    public Object d;

    public x53() {
        if (s71.f4284b == null) {
            s71.f4284b = new s71();
        }
    }

    public final int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.f5119b + i);
        }
        return 0;
    }

    public final void b(int i, ByteBuffer byteBuffer) {
        this.d = byteBuffer;
        if (byteBuffer != null) {
            this.f5118a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f5119b = i2;
            this.c = ((ByteBuffer) this.d).getShort(i2);
            return;
        }
        this.f5118a = 0;
        this.f5119b = 0;
        this.c = 0;
    }
}
