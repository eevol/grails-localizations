<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title><g:message code="localization.imports" default="Import Properties File" /></title>
        <g:localizationHelpBalloons />
    </head>
    <body>
        <div class="nav">
            <g:localizationMenuButton/>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="localization.list" default="Localization List" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="localization.imports" default="Import Properties File" /></h1>
            <g:if test="${flash.message}">
            <div class="message"><g:message code="${flash.message}" args="${flash.args}" default="${flash.defaultMessage}" /></div>
            </g:if>
            <g:form action="load" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="file"><g:message code="localization.imports.file" default="Properties file" />:</label>
                                </td>
                                <td valign="top" class="value">
                                    <g:select name="file" from="${names}"/>&nbsp;<g:localizationHelpBalloon code="localization.imports.file" />
                                </td>

                                <td valign="top" class="value">
                                  <label>
                                    <g:checkBox name="forceUpdate" value="${false}"/> <g:message code="localization.imports.forceupdate", default="Force Update"/>
                                  </label>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="${message(code:'localization.imports.import', 'default':'Import')}" /></span>
                </div>
                <div class="buttons">
                    <span class="button"><g:link controller="localization" action="reload" onclick="return confirm('All Translations in DB will be overwritten. Maybe Export first to keep a backup. Are you sure to continue?')">${message(code:'localization.imports.reloadall', 'default':'Reload from Disk')}"</g:link>
                </div>
            </g:form>

            <g:form action="export" method="get" >
                <div class="dialog">
                  <g:select name="locale" from="${uniqLocales}"/>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="${message(code:'localization.imports.export', 'default':'Export')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
