package com.shaikjaleel.SJWalls

import com.onesignal.NotificationExtenderService
import com.onesignal.OSNotificationReceivedResult
import dev.jahir.frames.extensions.prefs

class NotificationService : NotificationExtenderService() {
    override fun onNotificationProcessing(notification: OSNotificationReceivedResult?): Boolean =
        !prefs.notificationsEnabled
}