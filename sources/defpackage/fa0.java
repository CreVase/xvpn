package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final /* synthetic */ class fa0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f2066a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Charset charset = tb0.e;
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
            default:
                Charset charset2 = tb0.e;
                return str.startsWith("event");
        }
    }
}
