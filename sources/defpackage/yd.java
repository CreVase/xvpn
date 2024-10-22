package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class yd {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        e80 f80Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                f80Var = new d80(clipData, 3);
            } else {
                f80Var = new f80(clipData, 3);
            }
            ll3.l(textView, f80Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        e80 f80Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            f80Var = new d80(clipData, 3);
        } else {
            f80Var = new f80(clipData, 3);
        }
        ll3.l(view, f80Var.build());
        return true;
    }
}
