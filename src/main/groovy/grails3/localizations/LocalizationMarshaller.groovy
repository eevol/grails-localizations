package grails3.localizations

import grails.converters.JSON
import org.grails.plugins.localization.Localization

class LocalizationMarshaller {

   void register() {
      JSON.createNamedConfig('list') {
         it.registerObjectMarshaller(Localization) { Localization localization ->
            return [
               id : localization.id,
               code : localization.code,
               locale : localization.locale,
               text : localization.text
            ]
         }
      }
      JSON.registerObjectMarshaller(Localization) { Localization localization ->
         return [
            id : localization.id,
            code : localization.code,
            locale : localization.locale,
            text : localization.text
         ]
      }
   }
}
