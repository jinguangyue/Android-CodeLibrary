package codelibrary.codelibtest;

import android.widget.TextView;

import com.code.library.fragment.BaseFragment;

/**
 * Created by yue on 2016/6/21.
 */
public class MyFragment extends BaseFragment {

    @Override
    protected void initialize() {
        initLayout(R.layout.fragment_my);
    }

    @Override
    protected void initView() {
        TextView textView = (TextView) findView(R.id.text);
    }
}
