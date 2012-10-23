modules = {
    application {
        resource url:'js/application.js'
    }
    metro {
        dependsOn 'jquery, icons'
        resource url: 'css/metro/modern.css'
        resource url: 'css/metro/modern-responsive.css'
        resource url: 'js/metro/accordion.js'
        resource url: 'js/metro/buttonset.js'
        resource url: 'js/metro/dropdown.js'
        resource url: 'js/metro/pagecontrol.js'
    }
    icons {
        resource url: 'css/icons.css'
    }
    datepick {
        dependsOn 'jquery'
        resource url: 'js/datepicker.js'
    }
}