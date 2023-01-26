package com.fcmb.dokkatestapp
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * * A [CoroutineExceptionHandler] can be called from any thread. So, if [action] is supposed to
 * run in the main thread, you need to be careful and call this function on the a scope that
 * runs in the main thread, such as a [viewModelScope].
 *
 * @param message
 * @param action
 */
inline fun CoroutineScope.createExceptionHandler(
    message: String,
    crossinline action: (throwable: Throwable) -> Unit
) = CoroutineExceptionHandler { _, throwable ->
  throwable.printStackTrace()

  /**
   * A [CoroutineExceptionHandler] can be called from any thread. So, if [action] is supposed to
   * run in the main thread, you need to be careful and call this function on the a scope that
   * runs in the main thread, such as a [viewModelScope].
  */
  launch {
    action(throwable)
  }
}