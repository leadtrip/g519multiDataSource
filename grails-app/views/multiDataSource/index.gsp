<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<h4>Cyclists - ${grailsApplication.config.dataSources.cyclist}</h4>
    <table class="table table-bordered">
        <tr>
            <th>Name</th>
            <th>DOB</th>
        </tr>
        <g:each in="${cyclists}" var="cyclist">
            <tr>
                <td>${cyclist.name}</td>
                <td>${cyclist.dob}</td>
            </tr>
        </g:each>
    </table>

<h4>Log entries - ${grailsApplication.config.dataSources.logging}</h4>
<table class="table table-bordered">
    <tr>
        <th>Date created</th>
        <th>Message</th>
    </tr>
    <g:each in="${logEntries}" var="aLog">
        <tr>
            <td>${aLog.dateCreated}</td>
            <td>${aLog.message}</td>
        </tr>
    </g:each>
</table>

<h4>Excercises - ${grailsApplication.config.dataSource}</h4>
<table class="table table-bordered">
    <tr>
        <th>Name</th>
        <th>Body part</th>
    </tr>
    <g:each in="${exercises}" var="excercise">
        <tr>
            <td>${excercise.name}</td>
            <td>${excercise.bodyPart}</td>
        </tr>
    </g:each>
</table>
</body>
</html>