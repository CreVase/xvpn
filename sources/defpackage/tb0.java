package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class tb0 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final sb0 g = new sb0();
    public static final xz0 h = new xz0(25);
    public static final fa0 i = new fa0(3);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4478a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final jx0 f4479b;
    public final at3 c;
    public final ha0 d;

    public tb0(jx0 jx0Var, at3 at3Var, ha0 ha0Var) {
        this.f4479b = jx0Var;
        this.c = at3Var;
        this.d = ha0Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        jx0 jx0Var = this.f4479b;
        arrayList.addAll(jx0.w(((File) jx0Var.e).listFiles()));
        arrayList.addAll(jx0.w(((File) jx0Var.f).listFiles()));
        xz0 xz0Var = h;
        Collections.sort(arrayList, xz0Var);
        List w = jx0.w(((File) jx0Var.d).listFiles());
        Collections.sort(w, xz0Var);
        arrayList.addAll(w);
        return arrayList;
    }

    public final void c(al alVar, String str, boolean z) {
        String str2;
        jx0 jx0Var = this.f4479b;
        int i2 = this.c.d().f4883a.f3039a;
        g.getClass();
        ia0 ia0Var = sb0.f4304a;
        ia0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            ia0Var.b(alVar, stringWriter);
        } catch (IOException unused) {
        }
        String stringWriter2 = stringWriter.toString();
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f4478a.getAndIncrement()));
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            e(jx0Var.o(str, hx2.q("event", format, str2)), stringWriter2);
        } catch (IOException unused2) {
        }
        fa0 fa0Var = new fa0(2);
        jx0Var.getClass();
        File file = new File((File) jx0Var.c, str);
        file.mkdirs();
        List<File> w = jx0.w(file.listFiles(fa0Var));
        Collections.sort(w, new xz0(24));
        int size = w.size();
        for (File file2 : w) {
            if (size > i2) {
                jx0.v(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
