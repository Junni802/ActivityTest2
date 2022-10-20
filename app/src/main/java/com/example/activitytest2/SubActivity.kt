package com.example.activitytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest2.databinding.ActivityMainBinding
import com.example.activitytest2.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
	val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)


		// 전달받은 데이터를 텍스트뷰(to1, to2)에 출력
		// intent.getXXExtra

		binding.to1.text = intent.getStringExtra("from1")
		binding.to2.text = intent.getStringExtra("from2")
		// getIntExtra()의 두번쨰 인수는 값이 없을 경우 사용할 기본값으로 보통 0으로 사용
	}
}