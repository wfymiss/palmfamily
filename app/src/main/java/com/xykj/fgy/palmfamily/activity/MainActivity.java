package com.xykj.fgy.palmfamily.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.xykj.fgy.palmfamily.R;
import com.xykj.fgy.palmfamily.base.BaseActivity;
import com.xykj.fgy.palmfamily.behavior.BehaviorFragment;
import com.xykj.fgy.palmfamily.find.FindFragment;
import com.xykj.fgy.palmfamily.home.HomeFragment;
import com.xykj.fgy.palmfamily.me.MeFragment;
import com.xykj.fgy.palmfamily.teacher.TeacherFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {


    @BindView(R.id.content_layout)
    FrameLayout contentLayout;
    @BindView(R.id.rb_homepager)
    RadioButton rbHomepager;
    @BindView(R.id.rb_behavior)
    RadioButton rbBehavior;
    @BindView(R.id.rb_tutor)
    RadioButton rbTutor;
    @BindView(R.id.rb_find)
    RadioButton rbFind;
    @BindView(R.id.rb_me)
    RadioButton rbMe;
    @BindView(R.id.rg_main)
    RadioGroup rgGroup;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;
    private ArrayList<Fragment> fragments;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {


    }


    @Override
    public void initView() {
        fragments = new ArrayList<>();
        addFragment();
        //设置默认被选中的RadioButton
        rgGroup.check(R.id.rb_homepager);
        switchFragment(0);
        rgGroup.setOnCheckedChangeListener(this);
    }

    /**
     * 创建fragment实例并把他们加入集合
     */

    public void addFragment() {
        fragments.add(new HomeFragment());
        fragments.add(new BehaviorFragment());
        fragments.add(new TeacherFragment());
        fragments.add(new FindFragment());
        fragments.add(new MeFragment());
    }

    /**
     * 点击切换fragment
     *
     * @param position
     */
    public void switchFragment(int position) {
        //开启事务
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        //遍历集合
        for (int i = 0; i < fragments.size(); i++) {
            Fragment fragment = fragments.get(i);
            if (i == position) {
                //显示fragment
                if (fragment.isAdded()) {
                    //如果这个fragment已经被事务添加,显示
                    fragmentTransaction.show(fragment);
                } else {
                    //如果这个fragment没有被事务添加过,添加
                    fragmentTransaction.add(R.id.content_layout, fragment);
                }
            } else {
                //隐藏fragment
                if (fragment.isAdded()) {
                    //如果这个fragment已经被事务添加,隐藏
                    fragmentTransaction.hide(fragment);
                }
            }
        }
        //提交事务
        fragmentTransaction.commit();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_homepager:
                switchFragment(0);
                break;
            case R.id.rb_behavior:
                switchFragment(1);
                break;
            case R.id.rb_tutor:
                switchFragment(2);
                break;
            case R.id.rb_find:
                switchFragment(3);
                break;
            case R.id.rb_me:
                switchFragment(4);
                break;
        }

    }

}
