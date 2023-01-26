package com.fcmb.dokkatestapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object DateTimeUtils {

  /**
   * converts a string date to a LocalDateTime
   *
   * @param dateTimeString
   * @return LocalDateTime
   */
  @RequiresApi(Build.VERSION_CODES.O)
  fun parse(dateTimeString: String): LocalDateTime = try {
      LocalDateTime.parse(dateTimeString)
    } catch (e: Exception) {
      val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ")
      LocalDateTime.parse(dateTimeString, dateFormatter)
    }
}
