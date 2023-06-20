package com.example.featurebox.customview

import android.view.View
import androidx.core.view.NestedScrollingChild
import com.google.android.material.bottomsheet.BottomSheetBehavior

class CustomBottomSheetBehavior<V : View> : BottomSheetBehavior<V>(), NestedScrollingChild {
    // NestedScrollingChild 인터페이스의 메서드를 구현합니다.
    override fun onStartNestedScroll(child: View, target: View, axes: Int): Boolean {
        // 스크롤이 시작되면 true를 반환하여 스크롤 이벤트를 받도록 합니다.
        return true
    }

    override fun onStopNestedScroll(target: View) {
        // 스크롤이 종료될 때 호출됩니다.
    }

    override fun onNestedPreScroll(target: View, dx: Int, dy: Int, consumed: IntArray) {
        // 스크롤 전에 호출됩니다. 이곳에서 스크롤 전의 동작을 수행할 수 있습니다.
        // consumed 배열을 통해 부모 뷰에게 얼마나 스크롤을 소비했는지 전달할 수 있습니다.
    }

    override fun onNestedScroll(
        target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int
    ) {
        // 스크롤 중에 호출됩니다. 이곳에서 스크롤 중의 동작을 수행할 수 있습니다.
    }

    override fun setNestedScrollingEnabled(enabled: Boolean) {
        TODO("Not yet implemented")
    }

    override fun isNestedScrollingEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun startNestedScroll(axes: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun stopNestedScroll() {
        TODO("Not yet implemented")
    }

    override fun hasNestedScrollingParent(): Boolean {
        TODO("Not yet implemented")
    }

    override fun dispatchNestedScroll(
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        offsetInWindow: IntArray?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun dispatchNestedPreScroll(
        dx: Int,
        dy: Int,
        consumed: IntArray?,
        offsetInWindow: IntArray?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun dispatchNestedFling(
        velocityX: Float,
        velocityY: Float,
        consumed: Boolean
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun dispatchNestedPreFling(velocityX: Float, velocityY: Float): Boolean {
        TODO("Not yet implemented")
    }
}