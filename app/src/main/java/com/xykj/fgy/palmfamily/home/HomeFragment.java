package com.xykj.fgy.palmfamily.home;

;
import android.widget.RelativeLayout;

import com.xykj.fgy.palmfamily.R;
import com.xykj.fgy.palmfamily.base.BaseFragment;

import com.xykj.fgy.palmfamily.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class HomeFragment extends BaseFragment {


    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.layout_more)
    RelativeLayout layoutMore;
    Unbinder unbinder;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
        List<Integer> urls = new ArrayList<Integer>();
        urls.add(R.drawable.banner1);
        urls.add(R.drawable.banner2);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(urls);
        banner.start();

    }


}
