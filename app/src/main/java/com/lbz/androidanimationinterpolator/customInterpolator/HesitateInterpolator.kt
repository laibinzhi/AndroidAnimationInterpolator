package com.lbz.androidanimationinterpolator.customInterpolator

import android.view.animation.Interpolator

/**
 * @author: laibinzhi
 * @date: 2021-09-16 17:34
 * @desc: 以全速开始，然后减慢一半然后再次加速到最后的插值器
 */
class HesitateInterpolator : Interpolator {
    override fun getInterpolation(t: Float): Float {
        val x = 2.0f * t - 1.0f
        return 0.5f * (x * x * x + 1.0f)
    }
}