appProduto.controller("produtoCreateController", function ($scope,$routeParams, $http, $location){
	
	$scope.produto={};
	
	 $scope.salvarProduto = function () {
        $http({method: 'POST', url: 'http://localhost:8080/produtos', data: $scope.produto})
                .then(function (response) {
                      
                   alert('Produto Adicionado Com Sucesso!');             
                  $location.path('/produtos');
                

                }, function (response) {
                    console.log(response.data);
                    console.log(response.status);

                });
    };
    
    $scope.cancelarAlteracaoProduto = function () {
        $scope.produto = {};
    };
	
} );