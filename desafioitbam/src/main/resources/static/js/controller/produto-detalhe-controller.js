appProduto.controller("produtoDetalheController", function ($scope,$routeParams, $http ){
	
	$scope.produto={};
	
	$http.get("produtos/"+$routeParams.idproduto).then(function (response){
		$scope.produto= response.data;
		
	}, function (response){
		console.log(response);
		
	});
	
} );