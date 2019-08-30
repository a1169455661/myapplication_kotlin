package com.example.myapplication

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

}
