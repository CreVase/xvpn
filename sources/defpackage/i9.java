package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.b;

/* loaded from: classes.dex */
public final class i9 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2555b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i9(int i, Object obj, Object obj2) {
        this.f2554a = i;
        this.c = obj;
        this.f2555b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f2554a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                j9 j9Var = (j9) obj;
                DialogInterface.OnClickListener onClickListener = j9Var.i;
                m9 m9Var = (m9) this.f2555b;
                onClickListener.onClick(m9Var.f3255b, i);
                if (!j9Var.j) {
                    m9Var.f3255b.dismiss();
                    return;
                }
                return;
            default:
                he heVar = (he) obj;
                heVar.H.setSelection(i);
                b bVar = heVar.H;
                if (bVar.getOnItemClickListener() != null) {
                    bVar.performItemClick(view, i, heVar.E.getItemId(i));
                }
                heVar.dismiss();
                return;
        }
    }
}
