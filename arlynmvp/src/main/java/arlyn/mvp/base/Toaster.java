package arlyn.mvp.base;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Irfan Khoirul on 4/10/2017.
 */

public class Toaster {

    private Toaster instance;
    private int length = Toast.LENGTH_SHORT;
    private int imageSource = -1;
    private int type;
    private String message;
    private Activity activity;

    public Toaster() {

    }

    public Toaster builder(Activity activity) {
        instance = new Toaster();
        instance.activity = activity;
        return instance;
    }

    public Toaster setMessage(String message) {
        this.message = message;
        return this;
    }

    public Toaster setType(int type) {
        this.type = type;
        return this;
    }

    public Toaster setLength(int length) {
        this.length = length;
        return this;
    }

    public Toaster setImageSource(int imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    public void show() {
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout_toaster, (ViewGroup) activity.findViewById(R.id.llLayoutToaster));
        TextView text = (TextView) layout.findViewById(R.id.tvMessage);
        text.setText(message);
        ImageView image = (ImageView) layout.findViewById(R.id.ivIcon);
        switch (type) {
            case ConstantStatus.STATUS_INFO:
                if (imageSource == -1)
                    image.setImageResource(R.drawable.ic_info_black_24dp);
                layout.setBackgroundResource(R.drawable.bg_toast_info);
                break;
            case ConstantStatus.STATUS_SUCCESS:
                if (imageSource == -1)
                    image.setImageResource(R.drawable.ic_check_black_24dp);
                layout.setBackgroundResource(R.drawable.bg_toast_success);
                break;
            case ConstantStatus.STATUS_WARNING:
                if (imageSource == -1)
                    image.setImageResource(R.drawable.ic_warning_black_24dp);
                layout.setBackgroundResource(R.drawable.bg_toast_warning);
                break;
            case ConstantStatus.STATUS_ERROR:
                if (imageSource == -1)
                    image.setImageResource(R.drawable.ic_close_black_24dp);
                layout.setBackgroundResource(R.drawable.bg_toast_error);
                break;
        }
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = 32.00f * (metrics.densityDpi / 160f);

        Toast toast = new Toast(activity);
        toast.setGravity(Gravity.BOTTOM, 0, Math.round(px));
        toast.setDuration(length);
        toast.setView(layout);
        toast.show();
    }
}
