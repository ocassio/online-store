portalControllers.controller("PaymentController", function($scope, $state, user, shoppingCart) {

    if (!user.isSignedIn() || shoppingCart.isEmpty()) {
        $state.go('catalog');
        return;
    }



    $scope.submit = function() {

    };

    $scope.back = function() {
        $state.go('chooseAddress');
    };

});