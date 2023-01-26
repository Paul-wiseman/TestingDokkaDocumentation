
package com.fcmb.dokkatestapp

/**
 * Wrapper class for api response
 *
 * @param T
 * @property content
 */
class Event<out T>(private val content: T) {

  private var hasBeenHandled = false

  /**
   * Returns the content and prevents its use again.
   */
  fun getContentIfNotHandled(): T? {
    return if (hasBeenHandled) {
      null
    } else {
      hasBeenHandled = true
      content
    }
  }
}
