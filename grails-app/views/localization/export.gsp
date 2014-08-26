<g:each in="${localizationList}" status="i" var="localization">
  ${fieldValue(bean:localization, field:'code')}=${fieldValue(bean:localization, field:'text')}<br>
</g:each>
