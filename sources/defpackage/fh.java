package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fh extends mr {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public fh(int i, long j) {
        super(i, 1);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final fh i(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) arrayList.get(i2);
            if (fhVar.f3342b == i) {
                return fhVar;
            }
        }
        return null;
    }

    public final gh j(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gh ghVar = (gh) arrayList.get(i2);
            if (ghVar.f3342b == i) {
                return ghVar;
            }
        }
        return null;
    }

    @Override // defpackage.mr
    public final String toString() {
        return mr.f(this.f3342b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
