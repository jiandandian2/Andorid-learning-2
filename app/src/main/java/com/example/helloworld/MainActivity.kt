package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButtonToggleGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comps_materialbutton)
//        Log.d("MainActivity", "onCreate execute")

        // 监听选项卡按钮1
        val toggleGroup = findViewById<MaterialButtonToggleGroup>(R.id.mbgroup1)
        toggleGroup.addOnButtonCheckedListener(object:
            MaterialButtonToggleGroup.OnButtonCheckedListener {
            override fun onButtonChecked(
                group: MaterialButtonToggleGroup?,
                checkedId: Int,
                isChecked: Boolean
            ) {
                Log.e("MainActivity",isChecked.toString())
            }

        })

    }
}