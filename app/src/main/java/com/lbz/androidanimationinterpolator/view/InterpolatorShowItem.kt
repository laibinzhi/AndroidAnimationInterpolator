package com.lbz.androidanimationinterpolator.view

/**
 * @author: laibinzhi
 * @date: 2021-09-16 12:09
 */
data class InterpolatorShowItem(
    val type: Int,
    val name: String,
    val desc: String?,
    val pair: Pair<Float, Float>
) {
    companion object {
        const val INTERPOLATOR_TYPE_ACCELERATEDECELERATEINTERPOLATOR = 1
        const val INTERPOLATOR_TYPE_ACCELERATEINTERPOLATOR = 2
        const val INTERPOLATOR_TYPE_ANTICIPATEINTERPOLATOR = 3
        const val INTERPOLATOR_TYPE_ANTICIPATEOVERSHOOTINTERPOLATOR = 4
        const val INTERPOLATOR_TYPE_BOUNCEINTERPOLATOR = 5
        const val INTERPOLATOR_TYPE_CYCLEINTERPOLATOR = 6
        const val INTERPOLATOR_TYPE_DECELERATEINTERPOLATOR = 7
        const val INTERPOLATOR_TYPE_LINEARINTERPOLATOR = 8
        const val INTERPOLATOR_TYPE_OVERSHOOTINTERPOLATOR = 9
    }
}