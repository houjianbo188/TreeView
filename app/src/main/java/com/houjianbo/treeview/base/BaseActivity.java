package com.houjianbo.treeview.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.houjianbo.library.Node;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zhangke on 2017-1-15.
 */
public class BaseActivity extends AppCompatActivity {

    protected List<Node> mDatas = new ArrayList<Node>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDatas();

    }

    private void initDatas() {
        // id , pid , label , 其他属性
        mDatas.add(new Node("1", "-1", "java"));

        mDatas.add(new Node(2 + "", 1 + "", "程美云"));
        mDatas.add(new Node(3 + "", 1 + "", "彭科杰"));
        mDatas.add(new Node(4 + "", 1 + "", "白俊涛"));
//        mDatas.add(new Node(5+"", 2+"", "war3"));
//        mDatas.add(new Node(6+"", 2+"", "刀塔传奇"));

        mDatas.add(new Node("100", "-1", "移动"));
        mDatas.add(new Node(5 + "", 100 + "", "李田"));
        mDatas.add(new Node(9 + "", 100 + "", "侯建波"));
        mDatas.add(new Node(10 + "", 100 + "", "李急停"));
        mDatas.add(new Node(11 + "", 100 + "", "张三"));
        mDatas.add(new Node(12 + "", 100 + "", "张无"));
        mDatas.add(new Node(13 + "", 100 + "", "赵都"));

        mDatas.add(new Node("1000", "-1", "前端"));
        mDatas.add(new Node(1005 + "", 1000 + "", "田李"));
        mDatas.add(new Node(1009 + "", 1000 + "", "侯波"));
        mDatas.add(new Node(10010 + "", 1000 + "", "李停"));
        mDatas.add(new Node(10011 + "", 1000 + "", "张小三"));
        mDatas.add(new Node(10012 + "", 1000 + "", "张大无"));
        mDatas.add(new Node(10013 + "", 1000 + "", "赵都都"));

    }
}
