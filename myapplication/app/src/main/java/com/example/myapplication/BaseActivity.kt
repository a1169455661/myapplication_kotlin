package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

/**
 *  刘理政
 *  版本1.0
 *  基类BaseActivity
 */
abstract class BaseActivity : AppCompatActivity() {

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Isprint()) {
            /*显示*/
            setSupportActionBar(toolbar)
        }else{
            /*不显示*/

        }
        main_ll.addView(View.inflate(this@BaseActivity, layout(), null))
        toolbar.title = setTitle()
        initView()
        initData()
    }

    /**
     * 是否显示纯净栏
     */
    abstract fun Isprint(): Boolean

    /**
     *  设置子布局页面
     */
    abstract fun layout(): Int

    /**
     *  设置标题
     */
    abstract fun setTitle(): String
    /**
     *  布局的初始化
     */
    open fun initView(){}
    /**
     * 数据的初始化
     */
    open fun initData(){}
    /**
     *
     */


}
