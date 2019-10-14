moduloPrincipal.controller("CadastroController", CadastroController);

CadastroController.$inject = ["$scope", "CadastroService", "$rootScope"];


function CadastroController($scope, CadastroService, $rootScope){

    const self = this;

self.user = {
    nome: null,
    cpf: null,
    agencia: null,
    conta: null,
    senha:null
}

self.cadastrar = function(user){
    CadastroService.cadastrar = (user);
}








}
