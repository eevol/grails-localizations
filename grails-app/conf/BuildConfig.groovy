grails.release.scm.enabled=false
grails.project.work.dir = 'target'
grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
    }
    dependencies {
    }
    plugins {
      build(":tomcat:7.0.55.2") {
        export = false
      }
    }
}
