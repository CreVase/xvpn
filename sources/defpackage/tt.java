package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public abstract class tt implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f4569a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4570b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public tt(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.f4569a = str;
        this.f4570b = j;
        this.c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(tt ttVar) {
        String str = ttVar.f4569a;
        String str2 = this.f4569a;
        if (!str2.equals(str)) {
            return str2.compareTo(ttVar.f4569a);
        }
        long j = this.f4570b - ttVar.f4570b;
        if (j == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        return 1;
    }

    public final String toString() {
        return "[" + this.f4570b + ", " + this.c + "]";
    }
}
