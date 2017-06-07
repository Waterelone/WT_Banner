package com.watermelon.wt_banner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.watermelon.wt_bannerlib.Banner;
import com.watermelon.wt_bannerlib.BannerConfig;
import com.watermelon.wt_bannerlib.Transformer;
import com.watermelon.wt_bannerlib.listener.OnBannerListener;
import com.watermelon.wt_bannerlib.loader.GlideImageLoader;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lilei on 2017/2/21.
 */

public class MyBanner extends AppCompatActivity implements OnBannerListener {

    private List<String> titles;//标题集合
    private List<String> images;//图片集合
    private Banner banner;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybanner);

        bannerData();//图片，标题集合
        banner= (Banner) findViewById(R.id.mybanner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.Default);
        //设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(5000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CIRCLE_INDICATOR);
        //设置监听
        banner.setOnBannerListener(this);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }

    private void bannerData() {
        //这些数据一般都是从后台传来的
        titles=new ArrayList<>();
        titles.add("50巅峰钜惠");
        titles.add("十大星级品牌联盟，全场2折起");
        titles.add("生命不是要超越别人，而是要超越自己。");
        titles.add("己所不欲，勿施于人。——孔子");
        titles.add("嗨购5折不要停");
        images=new ArrayList<>();
        images.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic1xjab4j30ci08cjrv.jpg");
        images.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
        images.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
        images.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
        images.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");
    }


    private String[] imageUris = new String[]{
            "http://www.baidu.com",
            "http://www.sina.com.cn",
            "http://www.panda.tv",
            "http://www.tudou.com",
            "https://www.alipay.com"
    };

    //banner监听回调
    @Override
    public void OnBannerClick(int position) {
        Intent intent=null;
        Bundle bundle=null;
        switch (position){
            case 0 :
                intent = new Intent(MyBanner.this,WebViewActivity.class);
                bundle = new Bundle();
                bundle.putString("url", imageUris[0]);
                intent.putExtras(bundle);
                MyBanner.this.startActivity(intent);
                break;
            case 1 :
                intent = new Intent(MyBanner.this,WebViewActivity.class);
                bundle = new Bundle();
                bundle.putString("url", imageUris[1]);
                intent.putExtras(bundle);
                MyBanner.this.startActivity(intent);
                break;
            case 2 :
                intent = new Intent(MyBanner.this,WebViewActivity.class);
                bundle = new Bundle();
                bundle.putString("url", imageUris[2]);
                intent.putExtras(bundle);
                MyBanner.this.startActivity(intent);
                break;
            case 3 :
                intent = new Intent(MyBanner.this,WebViewActivity.class);
                bundle = new Bundle();
                bundle.putString("url", imageUris[3]);
                intent.putExtras(bundle);
                MyBanner.this.startActivity(intent);
                break;
            case 4 :
                intent = new Intent(MyBanner.this,WebViewActivity.class);
                bundle = new Bundle();
                bundle.putString("url", imageUris[4]);
                intent.putExtras(bundle);
                MyBanner.this.startActivity(intent);
                break;
        }

    }

    //更好的体验
    @Override
    protected void onStart() {
        super.onStart();
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
    }
}
