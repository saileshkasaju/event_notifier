<!DOCTYPE html>
<html ng-app>
<head>
    <title>Hello Events Angular</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
    <script src="events.js"></script>
</head>
<body>
<div ng-controller="Events">
    I have {{events.length}} events!

    <ul class="events-container">
        <li ng-repeat="event in events">
            {{event.title}}
        </li>
    </ul>
</div>
</body>
</html>