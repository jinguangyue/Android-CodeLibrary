package com.code.library.utils;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取本地资源工具类
 */
public class ArrayResource {
    private static int[] bgResourceInts = null;
    private static int[] emojiResourceInts = null;
    private static int[] wordGifLocalResources;
    private static int[] bgBlendResourceInts;
    private static int[] imgWhiteMasks;

    public static int[] getBgResourceInts(Context context) {
        if (bgResourceInts == null) {
            bgResourceInts = new int[17];
            for (int i = 0; i < bgResourceInts.length; i++) {
                int drawable = context.getResources().getIdentifier("bg" + i,
                        "drawable", context.getPackageName());
                bgResourceInts[i] = drawable;
            }
        }
        return bgResourceInts;
    }

    public static int[] getBlendBgResourceInts(Context context) {
        if (bgBlendResourceInts == null) {
            bgBlendResourceInts = new int[12];
            for (int i = 0; i < bgBlendResourceInts.length; i++) {
                int drawable = context.getResources().getIdentifier("blend" + i,
                        "drawable", context.getPackageName());
                bgBlendResourceInts[i] = drawable;
            }
        }
        return bgBlendResourceInts;
    }

    public static int[] getImgWhiteMasks(Context context) {
        if (imgWhiteMasks == null) {
            imgWhiteMasks = new int[18];
            for (int i = 0; i < imgWhiteMasks.length; i++) {
                int drawable = context.getResources().getIdentifier("img_white_mask" + i,
                        "drawable", context.getPackageName());
                imgWhiteMasks[i] = drawable;
            }
        }
        return imgWhiteMasks;
    }

    public static int[] getWordGifLocalResourceInts(Context context) {
        if (wordGifLocalResources == null) {
            wordGifLocalResources = new int[10];
            for (int i = 0; i < wordGifLocalResources.length; i++) {
                int drawable = context.getResources().getIdentifier("textemojiboard" + i,
                        "drawable", context.getPackageName());
                wordGifLocalResources[i] = drawable;
            }
        }
        return wordGifLocalResources;
    }

    public static int[] getEmojiResourceInts(Context context) {
        if (emojiResourceInts == null) {
            emojiResourceInts = new int[123];
            for (int i = 0; i < emojiResourceInts.length; i++) {
                int drawable = context.getResources().getIdentifier("androidemojiface" + i,
                        "drawable", context.getPackageName());
                emojiResourceInts[i] = drawable;
            }
        }
        return emojiResourceInts;
    }


    public static int[] getChunSeBgResourceInts() {
        int[] chunSebgResourceInts = null;
        if (chunSebgResourceInts == null) {
            chunSebgResourceInts = new int[]{
//                    R.drawable.chunse_nobg,
                    Color.WHITE, Color.BLACK,
                    Color.parseColor("#F3586F"),Color.parseColor("#F95E44"),Color.parseColor("#F98044"),
                    Color.parseColor("#1ABC9C"), Color.parseColor("#16A085"), Color.parseColor("#2ECC71"),
                    Color.parseColor("#27AE60"), Color.parseColor("#3498DB"), Color.parseColor("#2980B9"),
                    Color.parseColor("#9B59B6"), Color.parseColor("#8E44AD"), Color.parseColor("#34495E"),
                    Color.parseColor("#2C3E50"), Color.parseColor("#F1C40F"), Color.parseColor("#F39C12"),
                    Color.parseColor("#E67E22"), Color.parseColor("#D35400"), Color.parseColor("#E74C3C"),
                    Color.parseColor("#C0392B"), Color.parseColor("#ECF0F1"), Color.parseColor("#BDC3C7"),
                    Color.parseColor("#95A5A6"), Color.parseColor("#7F8C8D")
            };
        }
        return chunSebgResourceInts;
    }

    public static int[] getAddWordOneLinePics(Context context){
        int[] AddWordOneLinePics = null;
        if(AddWordOneLinePics == null){
            AddWordOneLinePics = new int[14];
            for (int i = 0; i < AddWordOneLinePics.length; i++) {
                int drawable = context.getResources().getIdentifier("img_label_" + i,
                        "drawable", context.getPackageName());
                AddWordOneLinePics[i] = drawable;
            }
        }

        return AddWordOneLinePics;
    }

    public static int[] getAddWordOneLineReversePics(Context context){
        int[] AddWordOneLinePics = null;
        if(AddWordOneLinePics == null){
            AddWordOneLinePics = new int[14];
            for (int i = 0; i < AddWordOneLinePics.length; i++) {
                int drawable = context.getResources().getIdentifier("img_label_" + i + "_r",
                        "drawable", context.getPackageName());
                AddWordOneLinePics[i] = drawable;
            }
        }

        return AddWordOneLinePics;
    }

    public static int[] getAddWordOneLineShowPics(Context context){
        int[] AddWordOneLinePics = null;
        if(AddWordOneLinePics == null){
            AddWordOneLinePics = new int[14];
            for (int i = 0; i < AddWordOneLinePics.length; i++) {
                int drawable = context.getResources().getIdentifier("img_labelview_" + i,
                        "drawable", context.getPackageName());
                AddWordOneLinePics[i] = drawable;
            }
        }

        return AddWordOneLinePics;
    }

    public static int[] getaddWordColors() {
        int[] addWordColors = null;
        if (addWordColors == null) {
            addWordColors = new int[]{
                    Color.parseColor("#ffffff"),Color.parseColor("#202020"),Color.parseColor("#ffffff"),
                    Color.parseColor("#ffffff"), Color.parseColor("#ffffff"), Color.parseColor("#202020"),
                    Color.parseColor("#2e1e1e"), Color.parseColor("#ffffff"), Color.parseColor("#ffffff"),
                    Color.parseColor("#ffffff"),Color.parseColor("#2e1e1e"),Color.parseColor("#2e1e1e"),
                    Color.parseColor("#202020"),Color.parseColor("#ffffff"),
            };
        }
        return addWordColors;
    }

    /**
     * 滤镜详细分类图片
     * @return
     */
    public static List<String> getFilterDetailPaths(boolean hava_blackwhite){
        List<String> filterDetailBtnPaths = new ArrayList<String>();
        /*String detailpath1 = "drawable://" + R.drawable.btn_filter_sub_pic0;
        String detailpath2 = "drawable://" + R.drawable.btn_filter_sub_pic1;
        String detailpath3 = "drawable://" + R.drawable.btn_filter_sub_pic2;
        String detailpath4 = "drawable://" + R.drawable.btn_filter_sub_pic3;
        String detailpath5 = "drawable://" + R.drawable.btn_filter_sub_pic4;
        String detailpath6 = "drawable://" + R.drawable.btn_filter_sub_pic5;
        String detailpath7 = "drawable://" + R.drawable.btn_filter_sub_pic6;
        String detailpath8 = "drawable://" + R.drawable.btn_filter_sub_pic7;
        String detailpath9 = "drawable://" + R.drawable.btn_filter_sub_pic8;
        String detailpath10 = "drawable://" + R.drawable.btn_filter_sub_pic9;

        filterDetailBtnPaths.add(detailpath1);
        filterDetailBtnPaths.add(detailpath2);
        filterDetailBtnPaths.add(detailpath3);
        filterDetailBtnPaths.add(detailpath4);
        filterDetailBtnPaths.add(detailpath5);
        filterDetailBtnPaths.add(detailpath6);
        filterDetailBtnPaths.add(detailpath7);
        filterDetailBtnPaths.add(detailpath8);
        filterDetailBtnPaths.add(detailpath9);
        filterDetailBtnPaths.add(detailpath10);

        if(hava_blackwhite){
            String detailpath11 = "drawable://" + R.drawable.btn_filter_sub_pic10;
            filterDetailBtnPaths.add(detailpath11);
        }
*/
        return filterDetailBtnPaths;
    }

    /**
     * 滤镜大分类图片
     * @return
     */
    public static List<String> getFilterpaths(boolean hava_blackwhite){
        List<String> filterPaths = new ArrayList<String>();
        /*String path1 = "drawable://" + R.drawable.btn_filter_pic0;
        String path2 = "drawable://" + R.drawable.btn_filter_pic1;
        String path3 = "drawable://" + R.drawable.btn_filter_pic2;
        String path4 = "drawable://" + R.drawable.btn_filter_pic3;
        String path5 = "drawable://" + R.drawable.btn_filter_pic4;
        String path6 = "drawable://" + R.drawable.btn_filter_pic5;
        String path7 = "drawable://" + R.drawable.btn_filter_pic6;
        String path8 = "drawable://" + R.drawable.btn_filter_pic7;
        String path9 = "drawable://" + R.drawable.btn_filter_pic8;
        String path10 = "drawable://" + R.drawable.btn_filter_pic9;

        filterPaths.add(path1);
        filterPaths.add(path2);
        filterPaths.add(path3);
        filterPaths.add(path4);
        filterPaths.add(path5);
        filterPaths.add(path6);
        filterPaths.add(path7);
        filterPaths.add(path8);
        filterPaths.add(path9);
        filterPaths.add(path10);

        if(hava_blackwhite){
            String path11 = "drawable://" + R.drawable.btn_filter_pic10;
            filterPaths.add(path11);
        }
*/
        return filterPaths;
    }

    public static ArrayList<Integer> getFilterDetailColors(Context context, boolean hava_blackwhite){
        ArrayList<Integer> colors = new ArrayList<Integer>();
        /*colors.add(context.getResources().getColor(R.color.filter_color0));
        colors.add(context.getResources().getColor(R.color.filter_color1));
        colors.add(context.getResources().getColor(R.color.filter_color2));
        colors.add(context.getResources().getColor(R.color.filter_color3));
        colors.add(context.getResources().getColor(R.color.filter_color4));
        colors.add(context.getResources().getColor(R.color.filter_color5));
        colors.add(context.getResources().getColor(R.color.filter_color6));
        colors.add(context.getResources().getColor(R.color.filter_color7));
        colors.add(context.getResources().getColor(R.color.filter_color8));
        colors.add(context.getResources().getColor(R.color.filter_color9));
        if(hava_blackwhite){
            colors.add(context.getResources().getColor(R.color.filter_color10));
        }
*/
        return colors;
    }

}
