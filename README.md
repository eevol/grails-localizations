Usage
=====

Include this gradle project as gitmodule in your root project and reference it.

 settings.gradle :
 
    include ":grails-localizations"
    
*and*

 build.gradle :
    
    dependencies{
       compile project( ":grails-localizations")
           ...
    }
    
    
For Grails3 projects, use branch ***grails3***
----
    