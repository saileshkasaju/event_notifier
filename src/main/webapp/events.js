/**
 * Created by Edge on 5/4/2017.
 */

function Events($scope, $http) {
    $http.get('http://localhost:8080/events.json')
        .success(function(data) {
            $scope.events = data;
        });
}