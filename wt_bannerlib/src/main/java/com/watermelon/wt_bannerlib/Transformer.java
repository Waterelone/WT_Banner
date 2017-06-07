package com.watermelon.wt_bannerlib;

import android.support.v4.view.ViewPager.PageTransformer;

import com.watermelon.wt_bannerlib.transformer.AccordionTransformer;
import com.watermelon.wt_bannerlib.transformer.BackgroundToForegroundTransformer;
import com.watermelon.wt_bannerlib.transformer.CubeInTransformer;
import com.watermelon.wt_bannerlib.transformer.CubeOutTransformer;
import com.watermelon.wt_bannerlib.transformer.DefaultTransformer;
import com.watermelon.wt_bannerlib.transformer.DepthPageTransformer;
import com.watermelon.wt_bannerlib.transformer.FlipHorizontalTransformer;
import com.watermelon.wt_bannerlib.transformer.FlipVerticalTransformer;
import com.watermelon.wt_bannerlib.transformer.ForegroundToBackgroundTransformer;
import com.watermelon.wt_bannerlib.transformer.RotateDownTransformer;
import com.watermelon.wt_bannerlib.transformer.RotateUpTransformer;
import com.watermelon.wt_bannerlib.transformer.ScaleInOutTransformer;
import com.watermelon.wt_bannerlib.transformer.StackTransformer;
import com.watermelon.wt_bannerlib.transformer.TabletTransformer;
import com.watermelon.wt_bannerlib.transformer.ZoomInTransformer;
import com.watermelon.wt_bannerlib.transformer.ZoomOutSlideTransformer;
import com.watermelon.wt_bannerlib.transformer.ZoomOutTranformer;


public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
