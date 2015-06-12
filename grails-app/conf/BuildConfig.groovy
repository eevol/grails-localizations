grails.release.scm.enabled=false
grails.project.work.dir = 'target'
grails.project.repos.eevolPublic.url = "http://maven.eevol.lu/nexus/content/repositories/eevol-grails-public/"
grails.project.repos.snapshots.url = "http://maven.eevol.lu/nexus/content/repositories/snapshots/"
grails.project.repos.default = "snapshots"
grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        // Eevol Mirrors
        mavenRepo "http://maven.eevol.lu/nexus/content/repositories/central/"
        mavenRepo "http://maven.eevol.lu/nexus/content/repositories/grails/"
        mavenRepo "http://maven.eevol.lu/nexus/content/repositories/grails-plugins/"
        mavenRepo "http://maven.eevol.lu/nexus/content/repositories/central-bintray/"
        mavenRepo "http://maven.eevol.lu/nexus/content/repositories/scribe/"
        mavenRepo "http://maven.eevol.lu/nexus/content/repositories/snapshots/"
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
       build ':release:3.1.1', ':rest-client-builder:1.0.3', {
          export = false
       }
    }
}
