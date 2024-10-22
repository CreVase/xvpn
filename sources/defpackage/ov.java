package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ov extends rv {
    public final r42 g = new r42();
    public final nn3 h = new nn3();
    public int i = -1;
    public final int j;
    public final nv[] k;
    public nv l;
    public List m;
    public List n;
    public nn3 o;
    public int p;

    public ov(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && (list.size() != 1 || ((byte[]) list.get(0)).length != 1 || ((byte[]) list.get(0))[0] != 1)) {
        }
        this.k = new nv[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2] = new nv();
        }
        this.l = this.k[0];
    }

    @Override // defpackage.rv
    public final sv e() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new sv(0, list);
    }

    @Override // defpackage.rv
    public final void f(pv pvVar) {
        boolean z;
        ByteBuffer byteBuffer = pvVar.d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        r42 r42Var = this.g;
        r42Var.E(limit, array);
        while (r42Var.c - r42Var.f4099b >= 3) {
            int v = r42Var.v() & 7;
            int i = v & 3;
            boolean z2 = false;
            if ((v & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte v2 = (byte) r42Var.v();
            byte v3 = (byte) r42Var.v();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        i();
                        int i2 = (v2 & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            k();
                            sn1.f();
                        }
                        this.i = i2;
                        int i4 = v2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        nn3 nn3Var = new nn3(i2, i4);
                        this.o = nn3Var;
                        byte[] bArr = nn3Var.d;
                        int i5 = nn3Var.e;
                        nn3Var.e = i5 + 1;
                        bArr[i5] = v3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        cp3.e(z2);
                        nn3 nn3Var2 = this.o;
                        if (nn3Var2 == null) {
                            sn1.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = nn3Var2.d;
                            int i6 = nn3Var2.e;
                            int i7 = i6 + 1;
                            bArr2[i6] = v2;
                            nn3Var2.e = i7 + 1;
                            bArr2[i7] = v3;
                        }
                    }
                    nn3 nn3Var3 = this.o;
                    if (nn3Var3.e == (nn3Var3.c * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // defpackage.rv, defpackage.re0
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        k();
        this.o = null;
    }

    @Override // defpackage.rv
    public final boolean h() {
        if (this.m != this.n) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00e3. Please report as an issue. */
    public final void i() {
        int i;
        nn3 nn3Var = this.o;
        if (nn3Var == null) {
            return;
        }
        int i2 = 2;
        if (nn3Var.e != (nn3Var.c * 2) - 1) {
            int i3 = nn3Var.f3499b;
            sn1.b();
        }
        nn3 nn3Var2 = this.o;
        byte[] bArr = nn3Var2.d;
        int i4 = nn3Var2.e;
        nn3 nn3Var3 = this.h;
        nn3Var3.n(i4, bArr);
        boolean z = false;
        while (true) {
            if (nn3Var3.b() > 0) {
                int i5 = 3;
                int i6 = nn3Var3.i(3);
                int i7 = nn3Var3.i(5);
                int i8 = 7;
                if (i6 == 7) {
                    nn3Var3.r(i2);
                    i6 = nn3Var3.i(6);
                    if (i6 < 7) {
                        sn1.f();
                    }
                }
                if (i7 == 0) {
                    if (i6 != 0) {
                        sn1.f();
                    }
                } else if (i6 != this.j) {
                    nn3Var3.s(i7);
                } else {
                    int g = (i7 * 8) + nn3Var3.g();
                    while (nn3Var3.g() < g) {
                        int i9 = nn3Var3.i(8);
                        if (i9 != 16) {
                            if (i9 <= 31) {
                                if (i9 != 0) {
                                    if (i9 != i5) {
                                        if (i9 != 8) {
                                            switch (i9) {
                                                case 12:
                                                    k();
                                                    break;
                                                case 13:
                                                    this.l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i9 >= 17 && i9 <= 23) {
                                                        sn1.f();
                                                        nn3Var3.r(8);
                                                        break;
                                                    } else if (i9 >= 24 && i9 <= 31) {
                                                        sn1.f();
                                                        nn3Var3.r(16);
                                                        break;
                                                    } else {
                                                        sn1.f();
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.l.f3549b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.m = j();
                                    }
                                }
                            } else if (i9 <= 127) {
                                if (i9 == 127) {
                                    this.l.a((char) 9835);
                                } else {
                                    this.l.a((char) (i9 & 255));
                                }
                                z = true;
                            } else {
                                if (i9 <= 159) {
                                    nv[] nvVarArr = this.k;
                                    switch (i9) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = g;
                                            int i10 = i9 - 128;
                                            if (this.p != i10) {
                                                this.p = i10;
                                                this.l = nvVarArr[i10];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            i = g;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (nn3Var3.h()) {
                                                    nv nvVar = nvVarArr[8 - i11];
                                                    nvVar.f3548a.clear();
                                                    nvVar.f3549b.clear();
                                                    nvVar.p = -1;
                                                    nvVar.q = -1;
                                                    nvVar.r = -1;
                                                    nvVar.t = -1;
                                                    nvVar.v = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            i = g;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (nn3Var3.h()) {
                                                    nvVarArr[8 - i12].d = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            i = g;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (nn3Var3.h()) {
                                                    nvVarArr[8 - i13].d = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            i = g;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (nn3Var3.h()) {
                                                    nvVarArr[8 - i14].d = !r1.d;
                                                }
                                            }
                                            break;
                                        case 140:
                                            i = g;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (nn3Var3.h()) {
                                                    nvVarArr[8 - i15].d();
                                                }
                                            }
                                            break;
                                        case 141:
                                            i = g;
                                            nn3Var3.r(8);
                                            break;
                                        case 142:
                                            i = g;
                                            break;
                                        case 143:
                                            i = g;
                                            k();
                                            break;
                                        case 144:
                                            i = g;
                                            if (!this.l.c) {
                                                nn3Var3.r(16);
                                                break;
                                            } else {
                                                nn3Var3.i(4);
                                                nn3Var3.i(2);
                                                nn3Var3.i(2);
                                                boolean h = nn3Var3.h();
                                                boolean h2 = nn3Var3.h();
                                                nn3Var3.i(3);
                                                nn3Var3.i(3);
                                                this.l.e(h, h2);
                                            }
                                        case 145:
                                            i = g;
                                            if (!this.l.c) {
                                                nn3Var3.r(24);
                                            } else {
                                                int c = nv.c(nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2));
                                                int c2 = nv.c(nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2));
                                                nn3Var3.r(2);
                                                nv.c(nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2), 0);
                                                this.l.f(c, c2);
                                            }
                                            break;
                                        case 146:
                                            i = g;
                                            if (!this.l.c) {
                                                nn3Var3.r(16);
                                            } else {
                                                nn3Var3.r(4);
                                                int i16 = nn3Var3.i(4);
                                                nn3Var3.r(2);
                                                nn3Var3.i(6);
                                                nv nvVar2 = this.l;
                                                if (nvVar2.v != i16) {
                                                    nvVar2.a('\n');
                                                }
                                                nvVar2.v = i16;
                                            }
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            i = g;
                                            sn1.f();
                                            break;
                                        case 151:
                                            i = g;
                                            if (!this.l.c) {
                                                nn3Var3.r(32);
                                            } else {
                                                int c3 = nv.c(nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2));
                                                nn3Var3.i(2);
                                                nv.c(nn3Var3.i(2), nn3Var3.i(2), nn3Var3.i(2), 0);
                                                nn3Var3.h();
                                                nn3Var3.h();
                                                nn3Var3.i(2);
                                                nn3Var3.i(2);
                                                int i17 = nn3Var3.i(2);
                                                nn3Var3.r(8);
                                                nv nvVar3 = this.l;
                                                nvVar3.o = c3;
                                                nvVar3.l = i17;
                                            }
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i18 = i9 - 152;
                                            nv nvVar4 = nvVarArr[i18];
                                            nn3Var3.r(i2);
                                            boolean h3 = nn3Var3.h();
                                            boolean h4 = nn3Var3.h();
                                            nn3Var3.h();
                                            int i19 = nn3Var3.i(i5);
                                            boolean h5 = nn3Var3.h();
                                            int i20 = nn3Var3.i(i8);
                                            int i21 = nn3Var3.i(8);
                                            int i22 = nn3Var3.i(4);
                                            int i23 = nn3Var3.i(4);
                                            nn3Var3.r(i2);
                                            nn3Var3.i(6);
                                            nn3Var3.r(i2);
                                            int i24 = nn3Var3.i(3);
                                            i = g;
                                            int i25 = nn3Var3.i(3);
                                            nvVar4.c = true;
                                            nvVar4.d = h3;
                                            nvVar4.k = h4;
                                            nvVar4.e = i19;
                                            nvVar4.f = h5;
                                            nvVar4.g = i20;
                                            nvVar4.h = i21;
                                            nvVar4.i = i22;
                                            int i26 = i23 + 1;
                                            if (nvVar4.j != i26) {
                                                nvVar4.j = i26;
                                                while (true) {
                                                    ArrayList arrayList = nvVar4.f3548a;
                                                    if ((h4 && arrayList.size() >= nvVar4.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i24 != 0 && nvVar4.m != i24) {
                                                nvVar4.m = i24;
                                                int i27 = i24 - 1;
                                                int i28 = nv.C[i27];
                                                boolean z2 = nv.B[i27];
                                                int i29 = nv.z[i27];
                                                int i30 = nv.A[i27];
                                                int i31 = nv.y[i27];
                                                nvVar4.o = i28;
                                                nvVar4.l = i31;
                                            }
                                            if (i25 != 0 && nvVar4.n != i25) {
                                                nvVar4.n = i25;
                                                int i32 = i25 - 1;
                                                int i33 = nv.E[i32];
                                                int i34 = nv.D[i32];
                                                nvVar4.e(false, false);
                                                nvVar4.f(nv.w, nv.F[i32]);
                                            }
                                            if (this.p != i18) {
                                                this.p = i18;
                                                this.l = nvVarArr[i18];
                                            }
                                            break;
                                    }
                                } else {
                                    i = g;
                                    if (i9 <= 255) {
                                        this.l.a((char) (i9 & 255));
                                    } else {
                                        sn1.f();
                                    }
                                }
                                z = true;
                            }
                            i = g;
                        } else {
                            i = g;
                            int i35 = nn3Var3.i(8);
                            if (i35 <= 31) {
                                if (i35 > 7) {
                                    if (i35 <= 15) {
                                        nn3Var3.r(8);
                                    } else if (i35 <= 23) {
                                        nn3Var3.r(16);
                                    } else if (i35 <= 31) {
                                        nn3Var3.r(24);
                                    }
                                }
                            } else if (i35 <= 127) {
                                if (i35 != 32) {
                                    if (i35 != 33) {
                                        if (i35 != 37) {
                                            if (i35 != 42) {
                                                if (i35 != 44) {
                                                    if (i35 != 63) {
                                                        if (i35 != 57) {
                                                            if (i35 != 58) {
                                                                if (i35 != 60) {
                                                                    if (i35 != 61) {
                                                                        switch (i35) {
                                                                            case 48:
                                                                                this.l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.l.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.l.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.l.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.l.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.l.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i35) {
                                                                                    case 118:
                                                                                        this.l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.l.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        sn1.f();
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.l.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.l.a((char) 376);
                                                    }
                                                } else {
                                                    this.l.a((char) 338);
                                                }
                                            } else {
                                                this.l.a((char) 352);
                                            }
                                        } else {
                                            this.l.a((char) 8230);
                                        }
                                    } else {
                                        this.l.a((char) 160);
                                    }
                                } else {
                                    this.l.a(' ');
                                }
                                z = true;
                            } else {
                                if (i35 <= 159) {
                                    if (i35 <= 135) {
                                        nn3Var3.r(32);
                                    } else if (i35 <= 143) {
                                        nn3Var3.r(40);
                                    } else if (i35 <= 159) {
                                        nn3Var3.r(2);
                                        nn3Var3.r(nn3Var3.i(6) * 8);
                                    }
                                } else if (i35 <= 255) {
                                    if (i35 == 160) {
                                        this.l.a((char) 13252);
                                    } else {
                                        sn1.f();
                                        this.l.a('_');
                                    }
                                    z = true;
                                } else {
                                    sn1.f();
                                }
                                g = i;
                                i2 = 2;
                                i5 = 3;
                                i8 = 7;
                            }
                        }
                        g = i;
                        i2 = 2;
                        i5 = 3;
                        i8 = 7;
                    }
                }
            }
        }
        if (z) {
            this.m = j();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List j() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov.j():java.util.List");
    }

    public final void k() {
        for (int i = 0; i < 8; i++) {
            this.k[i].d();
        }
    }
}
