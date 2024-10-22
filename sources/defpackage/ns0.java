package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ns0 extends t9 {
    @Override // defpackage.t9
    public final Metadata B(lw1 lw1Var, ByteBuffer byteBuffer) {
        r42 r42Var = new r42(byteBuffer.array(), byteBuffer.limit());
        String p = r42Var.p();
        p.getClass();
        String p2 = r42Var.p();
        p2.getClass();
        return new Metadata(new EventMessage(p, p2, r42Var.o(), r42Var.o(), Arrays.copyOfRange(r42Var.f4098a, r42Var.f4099b, r42Var.c)));
    }
}
