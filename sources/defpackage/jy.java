package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final class jy extends ch2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ zo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(ChatActivity chatActivity, lt3 lt3Var, int i) {
        super(lt3Var);
        this.d = i;
        if (i != 1) {
            this.e = chatActivity;
        } else {
            this.e = chatActivity;
            super(lt3Var);
        }
    }

    @Override // defpackage.ch2, defpackage.qh2
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.d) {
            case 1:
                boolean b2 = super.b(recyclerView, motionEvent);
                if (motionEvent.getAction() == 2 && cz.D != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ((ChatActivity) this.e).dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 3, 0.0f, 0.0f, 0));
                }
                return b2;
            default:
                return super.b(recyclerView, motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(SpeedTestActivity speedTestActivity, lt3 lt3Var) {
        super(lt3Var);
        this.d = 2;
        this.e = speedTestActivity;
    }
}
