package defpackage;

/* loaded from: classes.dex */
public class xs extends vs {
    public final byte[] d;

    public xs(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // defpackage.vs
    public byte b(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vs) || size() != ((vs) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof xs) {
            xs xsVar = (xs) obj;
            int i = this.f4886a;
            int i2 = xsVar.f4886a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= xsVar.size()) {
                if (0 + size <= xsVar.size()) {
                    int j = j() + size;
                    int j2 = j();
                    int j3 = xsVar.j() + 0;
                    while (j2 < j) {
                        if (this.d[j2] != xsVar.d[j3]) {
                            return false;
                        }
                        j2++;
                        j3++;
                    }
                    return true;
                }
                StringBuilder o = p71.o("Ran off end of other: 0, ", size, ", ");
                o.append(xsVar.size());
                throw new IllegalArgumentException(o.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // defpackage.vs
    public byte g(int i) {
        return this.d[i];
    }

    public int j() {
        return 0;
    }

    @Override // defpackage.vs
    public int size() {
        return this.d.length;
    }
}
