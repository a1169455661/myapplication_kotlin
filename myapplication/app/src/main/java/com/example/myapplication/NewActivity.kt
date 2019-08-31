package com.example.myapplication

import kotlinx.android.synthetic.main.content_new.*

class NewActivity : BaseActivity() {

    override fun setTitle(): String {
        return "NewActivity"
    }

    override fun layout(): Int {
        return R.layout.activity_new
    }

    override fun Isprint(): Boolean {
        return true
    }

    override fun initData() {
        new_text.text = "abc_action"
    }

}
