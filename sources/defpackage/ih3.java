package defpackage;

/* loaded from: classes.dex */
public final class ih3 {
    public static boolean a(Object obj, tg2 tg2Var) {
        int tag = tg2Var.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            ((hh3) obj).c((i << 3) | 5, Integer.valueOf(tg2Var.readFixed32()));
                        } else {
                            int i3 = ie1.f2577a;
                            throw new ge1();
                        }
                    } else {
                        hh3 b2 = hh3.b();
                        int i4 = i << 3;
                        int i5 = i4 | 4;
                        while (tg2Var.getFieldNumber() != Integer.MAX_VALUE && a(b2, tg2Var)) {
                        }
                        if (i5 == tg2Var.getTag()) {
                            b2.e = false;
                            ((hh3) obj).c(i4 | 3, b2);
                        } else {
                            throw new ie1("Protocol message end-group tag did not match expected tag.");
                        }
                    }
                } else {
                    ((hh3) obj).c((i << 3) | 2, tg2Var.readBytes());
                }
            } else {
                ((hh3) obj).c((i << 3) | 1, Long.valueOf(tg2Var.readFixed64()));
            }
        } else {
            ((hh3) obj).c((i << 3) | 0, Long.valueOf(tg2Var.readInt64()));
        }
        return true;
    }

    public static hh3 b() {
        return hh3.b();
    }

    public static void c(Object obj, Object obj2) {
        ((m51) obj).unknownFields = (hh3) obj2;
    }
}
