package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ObservableInt;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public abstract class qe1 extends tl3 {
    public static final /* synthetic */ int u = 0;
    public final AppCompatImageView o;
    public final XTextViewNew p;
    public final XTextViewNew q;
    public pb2 r;
    public ObservableInt s;
    public int t;

    public qe1(View view, AppCompatImageView appCompatImageView, XTextViewNew xTextViewNew, XTextViewNew xTextViewNew2) {
        super(null, view, 1);
        this.o = appCompatImageView;
        this.p = xTextViewNew;
        this.q = xTextViewNew2;
    }

    public abstract void o(int i);

    public abstract void p(ObservableInt observableInt);
}
