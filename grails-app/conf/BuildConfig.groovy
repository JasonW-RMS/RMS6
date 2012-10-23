grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.server.port.http = 8090

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        compile 'joda-time:joda-time:2.1'
    }
    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":resources:1.1.6"
        runtime ":jquery:1.8.0"
        runtime ":full-calendar:1.5.1.0"
        //runtime ":twitter-bootstrap:2.1.1"
        //runtime ":fields:1.3"
        //runtime ":navigation:1.3.2"
        //runtime ":rocks:1.0.1"
        //runtime ":spring-security-core:1.2.7.3"
        //runtime ":spring-security-ui:0.2"
        //runtime ":mail:1.0"
        //runtime ":cached-resources:1.0"
        build ":tomcat:$grailsVersion"
        //compile ':cache:1.0.0'
    }
}
