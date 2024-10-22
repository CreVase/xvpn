package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bz2 extends t9 {
    public final r42 w = new r42();
    public final nn3 x = new nn3();
    public f93 y;

    @Override // defpackage.t9
    public final Metadata B(lw1 lw1Var, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        boolean z;
        long j;
        long j2;
        ArrayList arrayList;
        long j3;
        long j4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        long j5;
        long j6;
        boolean z8;
        boolean z9;
        List list;
        long j7;
        long j8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i4;
        int i5;
        int i6;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j9;
        boolean z18;
        long j10;
        f93 f93Var = this.y;
        if (f93Var == null || lw1Var.j != f93Var.d()) {
            f93 f93Var2 = new f93(lw1Var.f);
            this.y = f93Var2;
            f93Var2.a(lw1Var.f - lw1Var.j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        r42 r42Var = this.w;
        r42Var.E(limit, array);
        nn3 nn3Var = this.x;
        nn3Var.n(limit, array);
        nn3Var.r(39);
        long i7 = (nn3Var.i(1) << 32) | nn3Var.i(32);
        nn3Var.r(20);
        int i8 = nn3Var.i(12);
        int i9 = nn3Var.i(8);
        r42Var.H(14);
        if (i9 != 0) {
            if (i9 != 255) {
                long j11 = 0;
                long j12 = 1;
                long j13 = -9223372036854775807L;
                if (i9 != 4) {
                    if (i9 != 5) {
                        if (i9 != 6) {
                            spliceNullCommand = null;
                        } else {
                            f93 f93Var3 = this.y;
                            long a2 = TimeSignalCommand.a(i7, r42Var);
                            spliceNullCommand = new TimeSignalCommand(a2, f93Var3.b(a2));
                        }
                    } else {
                        f93 f93Var4 = this.y;
                        long w = r42Var.w();
                        if ((r42Var.v() & 128) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z9) {
                            int v = r42Var.v();
                            if ((v & 128) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((v & 64) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((v & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((v & 16) != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z15 && !z17) {
                                j9 = TimeSignalCommand.a(i7, r42Var);
                            } else {
                                j9 = -9223372036854775807L;
                            }
                            if (!z15) {
                                int v2 = r42Var.v();
                                ArrayList arrayList2 = new ArrayList(v2);
                                for (int i10 = 0; i10 < v2; i10++) {
                                    int v3 = r42Var.v();
                                    if (!z17) {
                                        j10 = TimeSignalCommand.a(i7, r42Var);
                                    } else {
                                        j10 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new cz2(v3, j10, f93Var4.b(j10)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z16) {
                                long v4 = r42Var.v();
                                if ((v4 & 128) != 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                j13 = ((((v4 & 1) << 32) | r42Var.w()) * 1000) / 90;
                            } else {
                                z18 = false;
                            }
                            int A = r42Var.A();
                            int v5 = r42Var.v();
                            z13 = z18;
                            i6 = r42Var.v();
                            list = emptyList;
                            z10 = z14;
                            i4 = A;
                            i5 = v5;
                            j8 = j13;
                            long j14 = j9;
                            z12 = z17;
                            z11 = z15;
                            j7 = j14;
                        } else {
                            list = emptyList;
                            j7 = -9223372036854775807L;
                            j8 = -9223372036854775807L;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                            i4 = 0;
                            i5 = 0;
                            i6 = 0;
                        }
                        spliceNullCommand = new SpliceInsertCommand(w, z9, z10, z11, z12, j7, f93Var4.b(j7), list, z13, j8, i4, i5, i6);
                    }
                } else {
                    int v6 = r42Var.v();
                    ArrayList arrayList3 = new ArrayList(v6);
                    int i11 = 0;
                    while (i11 < v6) {
                        long w2 = r42Var.w();
                        if ((r42Var.v() & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z) {
                            int v7 = r42Var.v();
                            if ((v7 & 128) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((v7 & 64) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if ((v7 & 32) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z6) {
                                j5 = r42Var.w();
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            if (!z6) {
                                int v8 = r42Var.v();
                                ArrayList arrayList5 = new ArrayList(v8);
                                for (int i12 = 0; i12 < v8; i12++) {
                                    arrayList5.add(new ez2(r42Var.v(), r42Var.w()));
                                }
                                arrayList4 = arrayList5;
                            }
                            if (z7) {
                                long v9 = r42Var.v();
                                j2 = 0;
                                if ((v9 & 128) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                j = 1;
                                j6 = ((((v9 & 1) << 32) | r42Var.w()) * 1000) / 90;
                            } else {
                                j = 1;
                                j2 = 0;
                                j6 = -9223372036854775807L;
                                z8 = false;
                            }
                            z4 = z8;
                            arrayList = arrayList4;
                            z2 = z5;
                            z3 = z6;
                            j3 = j5;
                            j4 = j6;
                            i = r42Var.A();
                            i2 = r42Var.v();
                            i3 = r42Var.v();
                        } else {
                            j = j12;
                            j2 = j11;
                            arrayList = arrayList4;
                            j3 = -9223372036854775807L;
                            j4 = -9223372036854775807L;
                            z2 = false;
                            z3 = false;
                            z4 = false;
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                        }
                        arrayList3.add(new fz2(w2, z, z2, z3, arrayList, j3, z4, j4, i, i2, i3));
                        i11++;
                        j11 = j2;
                        j12 = j;
                    }
                    spliceNullCommand = new SpliceScheduleCommand(arrayList3);
                }
            } else {
                long w3 = r42Var.w();
                int i13 = i8 - 4;
                byte[] bArr = new byte[i13];
                r42Var.d(0, bArr, i13);
                spliceNullCommand = new PrivateCommand(w3, bArr, i7);
            }
        } else {
            spliceNullCommand = new SpliceNullCommand();
        }
        if (spliceNullCommand == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        return new Metadata(spliceNullCommand);
    }
}
