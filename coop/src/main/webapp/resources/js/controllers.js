var ngApp = angular.module('ngApp', []);

	// create the controller and inject Angular's $scope
ngApp.controller('mainController', function($scope, $http) {

	$http({
		method : 'GET',
		url : '/coop/rest/utilisateur/utilisateur/toto'
	}).success(function(data) {
		$scope.utilisateur = data;
	});	
	
	
	// configure our routes
	ngApp.config(function($routeProvider) {
		$routeProvider.when('vindex2', {
			templateUrl : 'index2.html',
			controller : 'controller2'
		}).when('vindex1', {
			templateUrl : 'index.html',
			controller : 'controller1'
		}).otherwise({
			redirectTo : '/vindex2'
		});
	});

});


function controller1($scope) {

	$scope.message = 'This is Add new order screen';

}

function controller2 ($scope) {

	$scope.message = 'This is Show orders screen';

}