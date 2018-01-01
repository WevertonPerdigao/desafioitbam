appProduto.controller("produtoController", function ($scope, $http, $location) {


    $scope.produtos = [];
    $scope.produto = {};

    carregarProdutos = function () {
        $http({method: 'GET', url: 'http://localhost:8080/produtos'})
                .then(function (response) {
                    $scope.produtos = response.data;

                }, function (response) {
                    console.log(response.data);
                    console.log(response.status);

                });
    };

    $scope.salvarProdutos = function () {

        $http({method: 'POST', url: 'http://localhost:8080/produtos', data: $scope.produto})
                .then(function (response) {
                    
                    carregarProdutos();
                    $scope.cancelarAlteracaoProduto();

                }, function (response) {
                    console.log(response.data);
                    console.log(response.status);

                });
    };

    $scope.excluirProduto = function (produto) {
        $http({method: 'DELETE', url: 'http://localhost:8080/produtos/' + produto.idproduto})
                .then(function (response) {
                    pos = $scope.produtos.indexOf(produto);
                    $scope.produtos.splice(pos, 1);
alert('Produto Excluído Com Sucesso!');
                }, function (response) {
                    console.log(response.data);
                    console.log(response.status);

                });

    };
    
  
    $scope.confirmExclusao = function (produto) {
       if (confirm("Tem certeza que deseja excluir esse produto?")) {
     $scope.excluirProduto(produto);     
   }
       };
    
    
     $scope.alterarProduto = function (prod) {
        $scope.produto = angular.copy(prod);
    };
    
    
    


    $scope.cancelarAlteracaoProduto = function () {
        $scope.produto = {};
    };

    carregarProdutos();



});
