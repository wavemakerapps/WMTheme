Application.$controller("WidgetsPageController", ["$scope", '$window', function($scope, $window) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */

        //$scope.$root.Variables.BreadcrumbVar.removeItem(2);
    };

    $scope.WidgetCardClick = function($event, $isolateScope, item, currentItemWidgets) {
        $window.location.href = item.link;
    };

}]);