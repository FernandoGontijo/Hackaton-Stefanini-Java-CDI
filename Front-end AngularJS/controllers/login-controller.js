moduloPrincipal.controller("LoginController", LoginController);

LoginController.$inject = ["$scope", "$rootScope", "LoginService"];

function LoginController($scope, $rootScope, LoginService) {
    const self = this;

    self.usuario = {
        email: null,
        senha: null
    };

    self.login = function (usuario) {
        LoginService.usuario = usuario;
        $rootScope.telaSelecionada = $rootScope.telas[2];
    };
}