
package com.fcmb.dokkatestapp

/**
 * Ui mapper contract
 *
 * @param E
 * @param V
 */
interface UiMapper<E, V> {

  fun mapToView(input: E): V
}