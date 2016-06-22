package codelibrary.codelibtest;

import android.app.Dialog;
import android.view.Gravity;
import android.view.View;

import com.code.library.activity.BaseActivity;
import com.code.library.dialog.ActionSheetDialog;
import com.code.library.dialog.LoadingDialog;
import com.code.library.dialog.PromptDialog;
import com.code.library.http.DownloadHelper;
import com.code.library.toast.ToastFactory;
import com.code.library.utils.ActivityManager;
import com.code.library.utils.AppUtil;
import com.code.library.utils.CommandAppUtil;
import com.code.library.utils.NetworkUtil;
import com.code.library.utils.StatusBarHeightUtil;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private LoadingDialog dialog;

    @Override
    protected void initialize() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        initDialog();
        getTitleBar();
        titleBack.setOnClickListener(this);
        titleText.setText("title");
        titleAction.setVisibility(View.GONE);
        findViewById(R.id.actionsheet).setOnClickListener(this);
        findViewById(R.id.LoadingDialog).setOnClickListener(this);
        findViewById(R.id.promptDialog).setOnClickListener(this);
    }

    private void initDialog() {
        //初始化对话框
        dialog = new LoadingDialog.Builder(context).setCancelable(true)
                .setCanceledOnTouchOutside(true).setTitle("Loading...")
                .setIcon(R.mipmap.ic_launcher).create();
    }

    @Override
    protected void initData() {
        super.initData();

        DownloadHelper.getInstance().download("url", "savepath", new DownloadHelper.OnDownloadListener() {
            @Override
            public void onSuccess(String path) {
                //返回成功
            }

            @Override
            public void onError(String message) {

            }

            @Override
            public void onProgress(float progress) {
                //返回的进度
            }
        });

        ToastFactory.showToast(context, "showToast");
        ActivityManager.getInstance().addActivity(activity);
        AppUtil.isInstalled(context, "packageName");
        AppUtil.openCLD( "packageName", context);
        AppUtil.getApkFileIntent("packageName");
        StatusBarHeightUtil.getStatusBarHeight(context);
        CommandAppUtil.command(context, "packageName");
        CommandAppUtil.openUrl(context, "url");
        CommandAppUtil.sharePhotoMore(activity, "img_path");
        NetworkUtil.isAvailable(context);
        NetworkUtil.isWIFIActivate(context);
        /*SystemUtils.dp2px(context, 1);
        SystemUtils.showInputmethod(view);
        SystemUtils.hideInputmethod(view);
        SystemUtils.isZh();
        SharedConfig.getInstance(context).writeData("key", "value");
        SharedConfig.getInstance(context).readString()
        SharedConfig.getInstance(context).readBoolean()
        SharedConfig.getInstance(context).readInt()
        MD5Utils.Md5("string")
        MD5Utils.Md5("bytes")
        DeviceInfoUtils.getImei(context)
        DeviceInfoUtils.getScreenHeight()
        DeviceInfoUtils.getScreenWidth()
        DeviceInfoUtils.getDeviceModel()
        FileUtil.getFileUtil().readTxtFile()*/
        /*OkHttpUtils
                .get()
                .url(url)
                .addParams("key", "value")
                .build()
                .execute(new JsonCallBack() {
                    @Override
                    public void onError(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(Object response) {

                    }
                });*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.actionsheet:
                new ActionSheetDialog(activity)
                        .builder()
                        .setCancelable(true)
                        .setCanceledOnTouchOutside(true)
                        .addSheetItem("第一个栏目", ActionSheetDialog.SheetItemColor.Blue,
                                new ActionSheetDialog.OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                })
                        .addSheetItem("第二个栏目", ActionSheetDialog.SheetItemColor.Blue,
                                new ActionSheetDialog.OnSheetItemClickListener() {
                                    @Override
                                    public void onClick(int which) {

                                    }
                                }).show();
                break;
            case R.id.LoadingDialog:
                dialog.show();
                break;

            case R.id.promptDialog:
                new PromptDialog.Builder(context)
                        .setTitle(com.code.library.R.string.framework_tishi)
                        .setViewStyle(PromptDialog.VIEW_STYLE_NORMAL)
                        .setTitleSize(20)
                        .setTitleBarGravity(Gravity.CENTER)
                        .setMessage(com.code.library.R.string.framework_dangqianwukeyongwangluo)
                        .setMessageGravity(Gravity.CENTER)
                        .setButton2(com.code.library.R.string.framework_shezhi,
                                new PromptDialog.OnClickListener() {

                                    @Override
                                    public void onClick(Dialog dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                        .setButton1(com.code.library.R.string.framework_xuxiao,
                                new PromptDialog.OnClickListener() {

                                    @Override
                                    public void onClick(Dialog dialog, int which) {
                                        dialog.dismiss();
                                    }
                                }).show();
                break;
        }
    }
}
