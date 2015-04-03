portal.controller("CatalogController", function($http) {

    var portal = this;

    this.totalItems = 0;
    this.itemsPerPage = 6;
    this.currentPage = 1;
    this.maxSize = 5;

    this.maxRating = 5;

    this.setPage = function(page) {
        this.currentPage = page;
    };

    this.offers = [];

    $http.get("/online-store/rest/offers/getAllOffers").success(function(data) {
        portal.offers = data;
        portal.totalItems = data.length;
    });

    this.categories = ["Apps","Games","Movies","Books","Newspaper"];

    this.addToCart = function (offerId, count) {
        var path = "/online-store/rest/offers/add/" + offerId;
        var params = {count: count};

        $http.get(path, params).success(function() {
            console.log("Offer " + offerId + " has been successfully added");
        });
    };

});