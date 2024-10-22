package defpackage;

import a.bx;
import a.du;
import com.security.xvpn.z35kb.XApplication;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes2.dex */
public final /* synthetic */ class mt3 implements rb {
    @Override // defpackage.rb
    public final void a(ko3 ko3Var) {
        boolean z = XApplication.c;
        Throwable fillInStackTrace = ko3Var.fillInStackTrace();
        StringWriter stringWriter = new StringWriter();
        fillInStackTrace.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        String stringBuffer = stringWriter.getBuffer().toString();
        bx bxVar = new bx();
        bxVar.z("AppAnr");
        bxVar.z(stringBuffer);
        du.d(473, bxVar);
        bxVar.h();
    }
}
