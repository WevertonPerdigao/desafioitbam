
var appProduto = angular.module("appProduto", [ 'ngRoute' ]);

appProduto.config(function($routeProvider, $locationProvider) {

	$routeProvider
	.when("/produtos", {
		templateUrl : 'view/produto.html',
		controller : 'produtoController'
	}).when("/produtos/:idproduto", {
		templateUrl : 'view/produto-detalhe.html',
		controller : 'produtoDetalheController'
	}).when("/create", {
		templateUrl : 'view/produto-create.html',
		controller : 'produtoCreateController'
	}).when("/alterar/:idproduto", {
		templateUrl : 'view/produto-alterar.html',
		controller : 'produtoAlterarController'
	})
	.otherwise({
		rediretTo : '/'
	});
	
	$locationProvider.html5Mode(true);
	
});