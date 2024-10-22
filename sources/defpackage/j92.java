package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j92 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2728b;
    public final long c;
    public final long d;

    public j92(int i, int i2, long j, long j2) {
        this.f2727a = i;
        this.f2728b = i2;
        this.c = j;
        this.d = j2;
    }

    public static j92 a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j92 j92Var = new j92(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return j92Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2727a);
            dataOutputStream.writeInt(this.f2728b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j92)) {
            return false;
        }
        j92 j92Var = (j92) obj;
        if (this.f2728b == j92Var.f2728b && this.c == j92Var.c && this.f2727a == j92Var.f2727a && this.d == j92Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2728b), Long.valueOf(this.c), Integer.valueOf(this.f2727a), Long.valueOf(this.d));
    }
}
