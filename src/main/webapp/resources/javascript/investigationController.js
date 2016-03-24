var investigationApp = angular.module("investigationApp",[]);
 
investigationApp.controller("listAll",function($scope, $window, $http) {

  // Model list
  $scope.modelList = new Array();

  $scope.init = function(){

    // Call URL
    var response = $http.get("list");

    // List result
    response.success(function(data, status, headers, config) {
       $scope.modelList = data;
    });

    // Display error
    response.error(function(data, status, headers, config) {  
      $window.alert(data);
    });

  }

});