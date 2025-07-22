
package com.refanzzzz.waterquality.js

/**
 * Anotasi @JsModule digunakan untuk mengimpor modul JavaScript.
 * Gunakan nama pustaka/modul JS sebagai argumennya.
 * Contoh: @JsModule("chart.js")
 *
 * Anotasi @JsName digunakan untuk menentukan nama fungsi/objek JS yang sebenarnya.
 */

// Contoh 1: Mendeklarasikan fungsi global sederhana dari JavaScript
@JsName("showAlert")
external fun showAlert(message: String)

// Contoh 2: Mendeklarasikan fungsi dari sebuah modul (misalnya, library chart)
@JsModule("some-chart-library")
@JsName("drawChart")
external fun drawChart(canvasId: String, data: dynamic)

// Contoh 3: Mendeklarasikan objek JS
@JsModule("some-library")
external object SomeLibrary {
    fun initialize(apiKey: String)
    fun doSomething(options: dynamic)
}
