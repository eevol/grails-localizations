package org.grails.plugins.localization

import org.grails.plugins.localization.*
import grails.util.Holders

class LocalizationService {

    boolean transactional = true

    def hasPlugin(name) {
        return Holders.currentPluginManager()?.hasGrailsPlugin(name)
    }
}
