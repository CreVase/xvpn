package okhttp3.internal.cache;

import defpackage.c11;
import defpackage.dw2;
import defpackage.lr;
import defpackage.x31;
import java.io.IOException;

/* loaded from: classes2.dex */
public class FaultHidingSink extends c11 {
    private boolean hasErrors;
    private final x31 onException;

    public FaultHidingSink(dw2 dw2Var, x31 x31Var) {
        super(dw2Var);
        this.onException = x31Var;
    }

    @Override // defpackage.c11, defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.c11, defpackage.dw2, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final x31 getOnException() {
        return this.onException;
    }

    @Override // defpackage.c11, defpackage.dw2
    public void write(lr lrVar, long j) {
        if (this.hasErrors) {
            lrVar.skip(j);
            return;
        }
        try {
            super.write(lrVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
