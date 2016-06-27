package grails3.localizations

import grails.plugins.*
import org.grails.plugins.localization.Localization

class Grails3LocalizationsGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.1.8 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Grails3 Localizations" // Headline display name of the plugin
    def author = "Your name"
    def authorEmail = ""
    def description = '''\
 Grails3 Localizations
'''
    def profiles = ['web']

    def documentation = "https://github.com/halfbaked/grails-localizations"
    def issueManagement = [ system: "GitHub", url: "https://github.com/halfbaked/grails-localizations/issues" ]
    def developers = [ [ name: "Eamonn O'Connell", email: "eamonnoconnell@gmail.com" ]]
    def scm = [ url: "https://github.com/halfbaked/grails-localizations" ]

    def doWithSpring = {
        // Implement runtime spring config (optional)
        messageSource(LocalizationMessageSource)
    }

    def doWithDynamicMethods = { ctx ->
        application.domainClasses.each { domainClass ->
            domainClass.metaClass.message = {Map parameters -> Localization.getMessage(parameters)}
            domainClass.metaClass.errorMessage = {Map parameters -> Localization.setError(delegate, parameters)}
        }

        application.serviceClasses.each { serviceClass ->
            serviceClass.metaClass.message = { Map parameters -> Localization.getMessage(parameters) }
        }
    }
}
