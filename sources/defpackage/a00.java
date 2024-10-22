package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ObservableInt;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.util.WrapContentLinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a00 extends pn {
    public RecyclerView m;
    public final ArrayList n;
    public final ObservableInt o;
    public final li1 p;
    public DialogInterface.OnClickListener q;

    public a00(ic icVar) {
        super(icVar, R.layout.dialog_choose_bind_subscribe);
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        ObservableInt observableInt = new ObservableInt(-1);
        this.o = observableInt;
        this.p = new li1(3, arrayList, observableInt, this);
    }

    @Override // defpackage.pn
    public final String l() {
        return "ChooseBindSubscribeDialog";
    }

    @Override // defpackage.pn, defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ObservableInt observableInt;
        super.onCreate(bundle);
        fl.g(this, this.l, 1000004);
        fl.n(this, (TextView) findViewById(R.id.tv_desc), 1000013);
        Button button = (Button) findViewById(R.id.btn_restore);
        final int i = 0;
        if (button != null) {
            button.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
            fl.n(this, button, 1000117);
            button.setOnClickListener(new View.OnClickListener(this) { // from class: zz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a00 f5572b;

                {
                    this.f5572b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    a00 a00Var = this.f5572b;
                    switch (i2) {
                        case 0:
                            a00Var.dismiss();
                            DialogInterface.OnClickListener onClickListener = a00Var.q;
                            if (onClickListener != null) {
                                onClickListener.onClick(a00Var, a00Var.o.f203b);
                                return;
                            }
                            return;
                        default:
                            a00Var.cancel();
                            return;
                    }
                }
            });
        }
        final int i2 = 1;
        findViewById(R.id.btnClose).setOnClickListener(new View.OnClickListener(this) { // from class: zz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a00 f5572b;

            {
                this.f5572b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                a00 a00Var = this.f5572b;
                switch (i22) {
                    case 0:
                        a00Var.dismiss();
                        DialogInterface.OnClickListener onClickListener = a00Var.q;
                        if (onClickListener != null) {
                            onClickListener.onClick(a00Var, a00Var.o.f203b);
                            return;
                        }
                        return;
                    default:
                        a00Var.cancel();
                        return;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_restore_list);
        this.m = recyclerView;
        getOwnerActivity();
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager());
        RecyclerView recyclerView2 = this.m;
        li1 li1Var = this.p;
        recyclerView2.setAdapter(li1Var);
        li1Var.f();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            observableInt = this.o;
            if (i3 >= size) {
                break;
            }
            if (TextUtils.isEmpty(((pb2) arrayList.get(i3)).c)) {
                observableInt.f(i3);
                break;
            }
            i3++;
        }
        View findViewById = findViewById(R.id.btn_restore);
        if (observableInt.f203b == -1) {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((XTextViewNew) findViewById(R.id.tv_desc)).setText(pd0.y(R.string.ChooseBindSubscribeDesc));
    }
}
