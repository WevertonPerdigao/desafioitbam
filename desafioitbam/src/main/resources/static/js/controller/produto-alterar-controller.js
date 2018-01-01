appProduto.controller("produtoAlterarController", function ($scope,$routeParams, $http, $location){


       $scope.produto = {};
       $http.get("produtos/"+$routeParams.idproduto).then(function (response){
		$scope.produto= response.data;
		
	}, function (response){
		console.log(response);
		
	});

   
	
//
  //  $scope.alterarProduto = function (prod) {
     //   $scope.produto = angular.copy(prod);
  //  };

 $scope.alterarProduto = function () {

        $http({method: 'POST', url: 'http://localhost:8080/produtos', data: $scope.produto})
                .then(function (response) {
                  alert('Produto Alterado Com Sucesso!');    
                      $location.path('/produtos');
             
                }, function (response) {
                    console.log(response.data);
                    console.log(response.status);

                });
    };
  



});
